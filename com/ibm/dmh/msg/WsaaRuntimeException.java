// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import java.io.PrintWriter;
import java.io.PrintStream;

public class WsaaRuntimeException extends RuntimeException implements WsaaThrowable
{
    private WsaaMessage wsaaMessage;
    private Throwable cause;
    
    public WsaaRuntimeException(final String message) {
        super(message);
        this.wsaaMessage = null;
        this.cause = null;
    }
    
    public WsaaRuntimeException(final String message, final Throwable cause) {
        super(message);
        this.wsaaMessage = null;
        this.cause = cause;
    }
    
    public WsaaRuntimeException() {
        this.wsaaMessage = null;
        this.cause = null;
    }
    
    public WsaaRuntimeException(final WsaaMessage message, final Throwable cause) {
        super(message.toString(), cause);
        this.wsaaMessage = message;
        this.cause = cause;
    }
    
    public WsaaRuntimeException(final WsaaMessage message) {
        super(message.toString());
        this.wsaaMessage = message;
    }
    
    public WsaaRuntimeException(final WsaaException e) {
        this(e.getWsaaMessage(), e.getCause());
    }
    
    public WsaaRuntimeException(final Throwable cause) {
        super("Unknown", cause);
        this.wsaaMessage = null;
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
        super.printStackTrace();
    }
    
    @Override
    public void printThrowableStackTrace(final PrintStream s) {
        super.printStackTrace(s);
    }
    
    @Override
    public void printThrowableStackTrace(final PrintWriter s) {
        super.printStackTrace(s);
    }
    
    @Override
    public String toThrowableString() {
        return super.toString();
    }
    
    @Override
    public String toString() {
        return this.getMessage() + "\n" + this.toThrowableString();
    }
    
    @Override
    public void setCause(final Throwable t) {
        this.cause = t;
    }
    
    @Override
    public void setMessage(final WsaaMessage msg) {
        this.wsaaMessage = msg;
    }
}
