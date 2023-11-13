// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import java.io.PrintWriter;
import java.io.PrintStream;

public class WsaaException extends Exception implements WsaaThrowable
{
    private WsaaMessage wsaaMessage;
    private Throwable cause;
    private static Boolean isInternalCall;
    
    public WsaaException(final String message) {
        super(message);
        this.wsaaMessage = null;
        this.cause = null;
    }
    
    public WsaaException(final String message, final Throwable cause) {
        super(message);
        this.wsaaMessage = null;
        this.cause = cause;
    }
    
    public WsaaException() {
        this.wsaaMessage = null;
        this.cause = null;
    }
    
    public WsaaException(final WsaaMessage message, final Throwable cause) {
        this.wsaaMessage = message;
        this.cause = cause;
    }
    
    public WsaaException(final WsaaMessage message) {
        this(message, null);
    }
    
    public WsaaException(final Throwable cause) {
        this.cause = cause;
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
    
    @Override
    public WsaaMessage getWsaaMessage() {
        return this.wsaaMessage;
    }
    
    @Override
    public String getMessage() {
        return WsaaThrowableUtils.getMessageStack(this);
    }
    
    @Override
    public final Throwable getThrowable() {
        return this;
    }
    
    @Override
    public void printStackTrace() {
        WsaaThrowableUtils.printRootCauseStackTrace(this);
    }
    
    @Override
    public void printStackTrace(final PrintStream ps) {
        WsaaThrowableUtils.printRootCauseStackTrace(this, ps);
    }
    
    @Override
    public void printStackTrace(final PrintWriter pw) {
        WsaaThrowableUtils.printRootCauseStackTrace(this, pw);
    }
    
    @Override
    public String getThrowableMessage() {
        return super.getMessage();
    }
    
    @Override
    public void printThrowableStackTrace() {
        synchronized (WsaaException.isInternalCall) {
            WsaaException.isInternalCall = Boolean.TRUE;
            super.printStackTrace();
            WsaaException.isInternalCall = Boolean.FALSE;
        }
    }
    
    @Override
    public void printThrowableStackTrace(final PrintStream s) {
        synchronized (WsaaException.isInternalCall) {
            WsaaException.isInternalCall = Boolean.TRUE;
            super.printStackTrace(s);
            WsaaException.isInternalCall = Boolean.FALSE;
        }
    }
    
    @Override
    public void printThrowableStackTrace(final PrintWriter s) {
        synchronized (WsaaException.isInternalCall) {
            WsaaException.isInternalCall = Boolean.TRUE;
            super.printStackTrace(s);
            WsaaException.isInternalCall = Boolean.FALSE;
        }
    }
    
    @Override
    public String toThrowableString() {
        return super.toString();
    }
    
    @Override
    public String toString() {
        synchronized (WsaaException.isInternalCall) {
            if (WsaaException.isInternalCall.equals(Boolean.TRUE)) {
                return this.toThrowableString();
            }
            WsaaException.isInternalCall = Boolean.TRUE;
            final String ret = this.getMessage();
            WsaaException.isInternalCall = Boolean.FALSE;
            return ret;
        }
    }
    
    @Override
    public void setCause(final Throwable t) {
        this.cause = t;
    }
    
    @Override
    public void setMessage(final WsaaMessage msg) {
        this.wsaaMessage = msg;
    }
    
    static {
        WsaaException.isInternalCall = Boolean.FALSE;
    }
}
