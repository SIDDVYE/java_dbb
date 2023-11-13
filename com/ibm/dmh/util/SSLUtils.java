// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import com.ibm.dmh.log.LoggerManager;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.HostnameVerifier;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.TrustManager;
import java.util.logging.Logger;

public class SSLUtils
{
    static Logger logger;
    
    public static void trustAllCerts() {
        try {
            final TrustManager[] tm = { new X509TrustManager() {
                    @Override
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                    
                    @Override
                    public void checkClientTrusted(final X509Certificate[] certs, final String authType) {
                    }
                    
                    @Override
                    public void checkServerTrusted(final X509Certificate[] certs, final String authType) {
                    }
                } };
            final HostnameVerifier hv = new HostnameVerifier() {
                @Override
                public boolean verify(final String urlHost, final SSLSession session) {
                    SSLUtils.logger.info("HTTPS warning: URL Host: [" + urlHost + "] != [" + session.getPeerHost() + "]");
                    return true;
                }
            };
            final SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, tm, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(hv);
        }
        catch (Exception e) {
            SSLUtils.logger.warning(e.getLocalizedMessage());
        }
    }
    
    static {
        SSLUtils.logger = LoggerManager.getMainLogger();
    }
}
