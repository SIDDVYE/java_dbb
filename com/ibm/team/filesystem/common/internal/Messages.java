// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages
{
    private static final String BUNDLE_NAME = "com.ibm.team.filesystem.common.internal.messages";
    private static final ResourceBundle RESOURCE_BUNDLE;
    
    static {
        RESOURCE_BUNDLE = ResourceBundle.getBundle("com.ibm.team.filesystem.common.internal.messages");
    }
    
    private Messages() {
    }
    
    public static String getString(final String key) {
        try {
            return Messages.RESOURCE_BUNDLE.getString(key);
        }
        catch (MissingResourceException ex) {
            return String.valueOf('!') + key + '!';
        }
    }
}
