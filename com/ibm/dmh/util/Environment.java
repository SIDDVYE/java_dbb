// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.ibm.dmh.util.process.ProcessExec;
import java.io.File;
import com.ibm.dmh.cfgmgr.ConfigMgr;

public class Environment
{
    public static boolean isUnix() {
        final String os = System.getProperty("os.name").toLowerCase();
        return os.indexOf("ix") >= 0 || os.indexOf("ux") >= 0;
    }
    
    public static boolean isWindows() {
        final String os = System.getProperty("os.name");
        return os.toLowerCase().indexOf("win") != -1;
    }
    
    public static boolean isZOS() {
        final String os = System.getProperty("os.name");
        return os.startsWith("OS/390") || os.startsWith("z/OS");
    }
    
    public static String getCurrentJobNameAndId() {
        return isZOS() ? new ZosInfo().getJobNameAndId() : "";
    }
    
    public static boolean isApplicationServer() {
        return isWASFullProfile() || isWASLiberty();
    }
    
    public static boolean isWASFullProfile() {
        boolean isWAS = !StringUtils.isEmpty(System.getProperty("com.ibm.websphere.ServerType")) || !StringUtils.isEmpty(System.getProperty("com.ibm.websphere.servlet.application.name"));
        if (!isWAS && !isWASLiberty()) {
            try {
                Class.forName("com.ibm.websphere.runtime.ServerName");
                isWAS = true;
            }
            catch (Throwable t) {}
        }
        return isWAS;
    }
    
    public static boolean isWASLiberty() {
        return !StringUtils.isEmpty(System.getProperty("wlp.install.dir"));
    }
    
    public static String getEnvironment() {
        final String text = String.format("isUnix=%s isWindows=%s isZOS=%s isApplicationServer=%s isWASFullProfile=%s isWASLiberty=%s currentJobAndId=%s", isUnix(), isWindows(), isZOS(), isApplicationServer(), isWASFullProfile(), isWASLiberty(), getCurrentJobNameAndId());
        return text;
    }
    
    public static void main(final String[] args) {
        try {
            ConfigMgr.load(System.getProperty("WSAA_CONFIG"));
            System.out.println(getEnvironment());
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    static class ZosInfo
    {
        private String jobName;
        private String jobId;
        private String userid;
        private String component;
        
        ZosInfo() {
            this.jobName = "";
            this.jobId = "";
            this.userid = "";
            this.component = "";
            try {
                if (Environment.isZOS()) {
                    final File wsaaHome = new File(ConfigMgr.get("Common.wsaaHome"));
                    final ProcessExec p = new ProcessExec(new String[] { new File(wsaaHome, "bin/ZosInfo.rexx").toString() });
                    p.setLocation(new File(wsaaHome, "bin").toString());
                    p.setLogging(true);
                    p.run();
                    final String result = p.getStdOut().toString();
                    final Pattern pattern = Pattern.compile("([^=\\r\\n]+) *= *([^\\r\\n]*)");
                    final Matcher m = pattern.matcher(result);
                    while (m.find()) {
                        final String key = m.group(1).trim().toUpperCase();
                        final String val = m.group(2).trim();
                        if ("COMPONENT".equals(key)) {
                            this.component = val;
                        }
                        else if ("JOBID".equals(key)) {
                            this.jobId = val;
                        }
                        else if ("JOBNAME".equals(key)) {
                            this.jobName = val;
                        }
                        else {
                            if (!"USERID".equals(key)) {
                                continue;
                            }
                            this.userid = val;
                        }
                    }
                }
            }
            catch (Throwable t) {
                this.jobName = "????????";
                this.jobId = "????????";
            }
        }
        
        String getJobName() {
            return this.jobName;
        }
        
        String getJobId() {
            return this.jobId;
        }
        
        String getJobNameAndId() {
            return String.format("%s(%s)", this.getJobName(), this.getJobId());
        }
        
        String getUserid() {
            return this.userid;
        }
        
        String getComponent() {
            return this.component;
        }
    }
}
