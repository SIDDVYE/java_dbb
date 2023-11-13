// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;
import com.ibm.dbb.metadata.common.PasswordUtil;
import java.util.Date;
import com.ibm.dbb.build.BuildException;
import org.slf4j.Logger;

public class ProductTrial
{
    private static final byte[] dbb_trial_key;
    private static final long expirationInterval;
    private static Logger logger;
    private static Boolean _isValid;
    
    public static boolean isValid() throws BuildException {
        if (ProductTrial._isValid == null) {
            ProductTrial._isValid = new Boolean(!isTrialExpired());
        }
        ProductTrial.logger.debug("Product trial is valid? " + ProductTrial._isValid);
        return ProductTrial._isValid;
    }
    
    private static boolean isTrialExpired() throws BuildException {
        final Date expirationDate = getExpirationDate();
        ProductTrial.logger.debug("Product trial expiration date, " + expirationDate);
        return new Date().getTime() > expirationDate.getTime();
    }
    
    public static Date getExpirationDate() throws BuildException {
        final DotDBBProperties dotDBBProperties = DotDBBProperties.getInstance();
        String expirationValue = dotDBBProperties.getProperty("dbb_trex");
        Date expirationDate;
        if (expirationValue == null) {
            ProductTrial.logger.debug("Product trial save new expiration date");
            expirationDate = new Date(new Date().getTime() + ProductTrial.expirationInterval);
            expirationValue = new PasswordUtil().encryptString(Long.toString(expirationDate.getTime()).toCharArray(), ProductTrial.dbb_trial_key);
            dotDBBProperties.setProperty("dbb_trex", expirationValue);
        }
        else {
            ProductTrial.logger.debug("Product trial read existing expiration date");
            final String sTimestamp = String.valueOf(new PasswordUtil().decryptString(expirationValue, ProductTrial.dbb_trial_key));
            expirationDate = new Date(Long.parseLong(sTimestamp));
        }
        return expirationDate;
    }
    
    public static boolean adjustExpirationDate(final long number, final TimeUnit units) throws BuildException {
        boolean adjusted = false;
        final DotDBBProperties dotDBBProperties = DotDBBProperties.getInstance();
        String expirationValue = dotDBBProperties.getProperty("dbb_trex");
        if (expirationValue != null) {
            adjusted = true;
            final String sTimestamp = String.valueOf(new PasswordUtil().decryptString(expirationValue, ProductTrial.dbb_trial_key));
            final long adjustment = TimeUnit.MILLISECONDS.convert(number, units);
            final long expirationDate = Long.parseLong(sTimestamp) + adjustment;
            if (expirationDate <= new Date().getTime()) {
                throw new BuildException(Messages.getMessage("DBB_TRIAL_DATE_INVALID", expirationDate));
            }
            expirationValue = new PasswordUtil().encryptString(Long.toString(expirationDate).toCharArray(), ProductTrial.dbb_trial_key);
            dotDBBProperties.setProperty("dbb_trex", expirationValue);
        }
        return adjusted;
    }
    
    public static boolean setExpirationDate(final Date newExpirationDate) throws BuildException {
        if (newExpirationDate.getTime() <= new Date().getTime()) {
            throw new BuildException(Messages.getMessage("DBB_TRIAL_DATE_INVALID", newExpirationDate));
        }
        final DotDBBProperties dotDBBProperties = DotDBBProperties.getInstance();
        final String expirationValue = new PasswordUtil().encryptString(Long.toString(newExpirationDate.getTime()).toCharArray(), ProductTrial.dbb_trial_key);
        dotDBBProperties.setProperty("dbb_trex", expirationValue);
        return true;
    }
    
    static {
        dbb_trial_key = new byte[] { 1, 1, 3, 3, 5, 5, 7, 7, 2, 2, 4, 4, 6, 6, 8, 8, 1, 2, 3, 4, 4, 3, 2, 1 };
        expirationInterval = TimeUnit.MILLISECONDS.convert(90L, TimeUnit.DAYS);
        ProductTrial.logger = LoggerFactory.getLogger((Class)ProductTrial.class);
        ProductTrial._isValid = null;
    }
}
