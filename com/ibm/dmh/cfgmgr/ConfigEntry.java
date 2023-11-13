// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr;

import java.io.File;
import com.ibm.dmh.util.StringUtils;
import java.util.MissingResourceException;
import java.text.MessageFormat;

public class ConfigEntry
{
    ConfigFile configFile;
    String rawValue;
    String resolvedValue;
    String sectionName;
    String propName;
    String configKey;
    boolean isEncoded;
    MessageFormat messageFormat;
    private static String secretKey;
    
    public ConfigEntry(final ConfigFile configFile, final String sectionName, final String propName, String rawValue, final boolean isEncoded, final int lineNum) throws ConfigRuntimeException {
        this.configFile = configFile;
        this.sectionName = sectionName;
        this.propName = propName;
        this.configKey = ((sectionName == null) ? "" : (sectionName + ".")) + propName;
        this.rawValue = rawValue;
        this.isEncoded = isEncoded;
        if (isEncoded && !rawValue.startsWith(PasswordUtil.DEFAULT_CRYPTO_EYECATCHER)) {
            try {
                this.initializeSecurity();
                if (PasswordUtil.getCryptoAlgorithm(rawValue) != null) {
                    rawValue = PasswordUtil.decode(rawValue, this.getSecretKey());
                }
                this.rawValue = PasswordUtil.encode(rawValue, this.getSecretKey(), PasswordUtil.DEFAULT_CRYPTO_ALGORITHM);
            }
            catch (Exception e) {
                throw new ConfigRuntimeException("Could not encode value for prop [" + propName + "] at line [" + lineNum + "] of [" + configFile.name + "].  Msg=[" + e.getLocalizedMessage() + "]");
            }
            configFile.hasBeenModified = true;
        }
    }
    
    public String getRawValue() throws ConfigRuntimeException {
        return this.rawValue;
    }
    
    public String getValue() throws ConfigRuntimeException {
        if (this.resolvedValue == null) {
            this.resolveValue();
        }
        return this.resolvedValue;
    }
    
    public String getValue(final Object[] args) throws ConfigRuntimeException {
        if (this.resolvedValue == null) {
            this.resolveValue();
        }
        if (this.messageFormat != null) {
            return this.messageFormat.format(args);
        }
        return this.resolvedValue;
    }
    
    private void resolveValue() throws ConfigRuntimeException {
        String s = this.rawValue;
        if (this.isEncoded) {
            try {
                this.initializeSecurity();
                s = PasswordUtil.decode(s, this.getSecretKey());
            }
            catch (Throwable e) {
                throw new ConfigRuntimeException("Could not decode property [" + this.configKey + "] in file [" + this.configFile.name + "].  msg=[" + e.getLocalizedMessage() + "]", e);
            }
        }
        int i3;
        for (int i2 = 0; (i3 = s.indexOf("$C{", i2)) != -1; i2 = i3 + 1) {
            i2 = s.indexOf(125, i3);
            final String varName = s.substring(i3 + 3, s.indexOf(125, i3));
            final String x = varName.startsWith("this.") ? this.configFile.get(varName.substring(5)) : ConfigMgr.get(varName, (String)null);
            if (x != null) {
                s = s.substring(0, i3) + x + s.substring(i2 + 1);
            }
        }
        for (int i2 = 0; (i3 = s.indexOf("$L{", i2)) != -1 && this.configFile.resourceBundle != null; i2 = i3 + 1) {
            i2 = s.indexOf(125, i3);
            String x2 = null;
            try {
                x2 = this.configFile.resourceBundle.getString(s.substring(i3 + 3, s.indexOf(125, i3)));
            }
            catch (MissingResourceException ex) {}
            if (x2 != null) {
                s = s.substring(0, i3) + x2 + s.substring(i2 + 1);
            }
        }
        if (s.startsWith("math(")) {
            try {
                s = "" + ExpressionSolver.solveMath(s.substring(5, s.lastIndexOf(41)));
            }
            catch (Exception e2) {
                throw new ConfigRuntimeException("Math error encountered trying to solve property [" + this.configKey + "] in file [" + this.configFile.name + "].  msg=[" + e2.getLocalizedMessage() + "]", e2);
            }
        }
        if (s.startsWith("mathf(")) {
            try {
                final String expr = s.substring(6, s.lastIndexOf(41));
                final float f = ExpressionSolver.solveFloatMath(expr);
                final String fs = Float.toString(f);
                if (fs.indexOf(69) != -1) {
                    s = fs;
                }
                else {
                    final int j = fs.indexOf(46);
                    if (j == -1) {
                        s = fs;
                    }
                    else {
                        s = fs.substring(0, j);
                    }
                }
            }
            catch (Exception e2) {
                throw new ConfigRuntimeException("Math error encountered trying to solve property [" + this.configKey + "] in file [" + this.configFile.name + "].  msg=[" + e2.getLocalizedMessage() + "]", e2);
            }
        }
        if (s.startsWith("case(")) {
            try {
                final String expr = s.substring(5, s.lastIndexOf(41));
                final String[] parts = StringUtils.split(expr, ',');
                boolean foundMatch = false;
                for (int j = 0; j < parts.length - 1 && !foundMatch; ++j) {
                    final String p = parts[j];
                    final int x3 = p.indexOf(61);
                    final String boolExpr = p.substring(0, x3 - 1).trim();
                    final String valExpr = p.substring(x3 + 1).trim();
                    if (ExpressionSolver.solveBoolean(boolExpr)) {
                        foundMatch = true;
                        s = "" + ExpressionSolver.solveMath(valExpr);
                    }
                }
                if (!foundMatch) {
                    s = "" + ExpressionSolver.solveMath(parts[parts.length - 1]);
                }
            }
            catch (Exception e2) {
                throw new ConfigRuntimeException("Math error encountered trying to solve property [" + this.configKey + "] in file [" + this.configFile.name + "].  msg=[" + e2.getLocalizedMessage() + "]", e2);
            }
        }
        this.resolvedValue = s;
        if (s.indexOf("{0") != -1) {
            this.messageFormat = new MessageFormat(s);
        }
    }
    
    public void setValue(String value) throws ConfigRuntimeException {
        if (this.isEncoded && !value.startsWith(PasswordUtil.DEFAULT_CRYPTO_EYECATCHER)) {
            try {
                this.initializeSecurity();
                if (PasswordUtil.getCryptoAlgorithm(value) != null) {
                    value = PasswordUtil.decode(value, this.getSecretKey());
                }
                value = PasswordUtil.encode(value, this.getSecretKey(), PasswordUtil.DEFAULT_CRYPTO_ALGORITHM);
            }
            catch (Exception e) {
                throw new ConfigRuntimeException("Could not encode value for property [" + this.configKey + "] in file [" + this.configFile.name + "].  msg=[" + e.getMessage() + "]", e);
            }
        }
        if (!value.equals(this.rawValue)) {
            this.rawValue = value;
            this.configFile.hasBeenModified = true;
        }
        this.resolvedValue = null;
    }
    
    private String getSecretKey() {
        return ConfigEntry.secretKey;
    }
    
    private void setSecretKey(final String iSecretKey) {
        ConfigEntry.secretKey = iSecretKey;
    }
    
    private void initializeSecurity() throws SecurityException {
        if (ConfigEntry.secretKey == null) {
            this.setSecretKey(PasswordUtil.getSecretKeyFromKeyStore(new File(this.configFile.configFilePath).getParent(), "aGwdHmobGmdnaB4bZxxqaG1oGmgZaG0ebx1pbGYcHGs="));
        }
    }
}
