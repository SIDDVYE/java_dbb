// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg.proto;

public class RaaException extends Exception
{
    public RaaException(final String messageId, final String... vars) {
        super(RaaMessages.getMessage(messageId, vars).getMessage());
    }
    
    public RaaException(final String messageId, final Throwable cause, final String... vars) {
        super(RaaMessages.getMessage(messageId, vars).getMessage(), cause);
    }
}
