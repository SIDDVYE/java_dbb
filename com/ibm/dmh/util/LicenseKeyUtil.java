// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.Calendar;

public class LicenseKeyUtil
{
    public static final int UNLIMITED_ASSETS = -1;
    
    protected static String createLicenseKey(final long expireTime, final long rvu) {
        final String s0 = randHex(14);
        String s2 = "";
        long x = expireTime % 1000L;
        long l = (313L + x) * 1000000L;
        x = (long)(Math.random() * 968244.0);
        l += x;
        s2 = "000000" + Long.toHexString(l);
        s2 = s2.substring(s2.length() - 10, s2.length());
        final String s3 = randHex(16);
        final String s4 = Long.toHexString(expireTime);
        final String s5 = randHex(9);
        String s6 = "000000" + Long.toHexString(expireTime % 10000000L + rvu);
        s6 = s6.substring(s6.length() - 6, s6.length());
        final String s7 = randHex(14);
        final StringBuffer lc = new StringBuffer(s0).append(s2).append(s3).append(s4).append(s5).append(s6).append(s7);
        return lc.toString();
    }
    
    public static String createLicenseKey(final int calendarField, final int increment) {
        final Calendar c = Calendar.getInstance();
        c.add(calendarField, increment);
        return createLicenseKey(c.getTimeInMillis(), 10000L);
    }
    
    public static long decodeExpireTime(final String licenseKey) {
        if (StringUtils.isEmpty(licenseKey)) {
            return 0L;
        }
        if (licenseKey.length() != 80) {
            throw new RuntimeException("License key was not 80 characters.");
        }
        return Long.parseLong(licenseKey.substring(40, 51), 16);
    }
    
    private static long decodeRvu(final String licenseKey) {
        if (StringUtils.isEmpty(licenseKey)) {
            return 10000L;
        }
        if (licenseKey.length() != 80) {
            throw new RuntimeException("License key was not 80 characters.");
        }
        final long exp = Long.parseLong(licenseKey.substring(40, 51), 16);
        long l = Long.parseLong(licenseKey.substring(14, 24), 16);
        l = l / 1000000L - exp % 1000L;
        Long rvu = Long.parseLong(licenseKey.substring(60, 66), 16) - exp % 10000000L;
        if (l != 313L) {
            rvu = 10000L;
        }
        return rvu;
    }
    
    public static long getMaxKeyAssets(final String licenseKey) {
        return decodeRvu(licenseKey);
    }
    
    private static String randHex(final int l) {
        final StringBuffer sb = new StringBuffer(l);
        for (int i = 0; i < l; ++i) {
            final int x = (int)Math.floor(Math.random() * 16.0);
            sb.append((x < 10) ? ((char)(48 + x)) : ((char)(97 + x - 10)));
        }
        return sb.toString();
    }
}
