// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class Messages
{
    private static final String BUNDLE_NAME = "com.ibm.dbb.build.internal.messages";
    static final ResourceBundle resourceBundle;
    
    private Messages() {
    }
    
    public static String getMessage(final String message) {
        return Messages.resourceBundle.getString(message);
    }
    
    public static String getMessage(final String message, final Object... args) {
        final String msg = getMessage(message);
        return MessageFormat.format(msg, args);
    }
    
    static {
        resourceBundle = ResourceBundle.getBundle("com.ibm.dbb.build.internal.messages");
    }
}
