// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import java.io.PrintWriter;
import java.io.PrintStream;

public interface WsaaThrowable
{
    Throwable getCause();
    
    WsaaMessage getWsaaMessage();
    
    String getMessage();
    
    String getThrowableMessage();
    
    Throwable getThrowable();
    
    void printThrowableStackTrace();
    
    void printThrowableStackTrace(final PrintStream p0);
    
    void printThrowableStackTrace(final PrintWriter p0);
    
    String toThrowableString();
    
    String toString();
    
    void setCause(final Throwable p0);
    
    void setMessage(final WsaaMessage p0);
}
