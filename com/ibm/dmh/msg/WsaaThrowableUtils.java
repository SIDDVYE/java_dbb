// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import java.util.List;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.ResourceBundle;
import com.ibm.dmh.util.StringUtils;

public class WsaaThrowableUtils
{
    private static String causedBy;
    
    public static StringBuffer getWsaaThrowableMessage(final WsaaThrowable t) {
        final StringBuffer sb = new StringBuffer();
        final WsaaMessage wsaaMessage = t.getWsaaMessage();
        final String throwableMessage = t.getThrowableMessage();
        if (wsaaMessage != null) {
            final String wsaaMessageText = wsaaMessage.toTextString();
            sb.append(wsaaMessageText);
            if (!StringUtils.isEmpty(throwableMessage) && !throwableMessage.equals(wsaaMessageText)) {
                sb.append("; ");
                sb.append(throwableMessage);
            }
        }
        else if (throwableMessage != null) {
            sb.append(throwableMessage);
        }
        else {
            sb.append(t.getClass().getName());
        }
        return sb;
    }
    
    public static Throwable getRootCause(final Throwable t) {
        if (!(t instanceof WsaaThrowable)) {
            return t;
        }
        final Throwable rootCause = getRootCause(((WsaaThrowable)t).getCause());
        if (rootCause == null) {
            return t;
        }
        return rootCause;
    }
    
    public static synchronized String getCauseByString() {
        if (WsaaThrowableUtils.causedBy == null) {
            try {
                final ResourceBundle bundle = ResourceBundle.getBundle("com.ibm.dmh.msg.LocalStrings");
                WsaaThrowableUtils.causedBy = bundle.getString("CAUSED_BY") + " ";
            }
            catch (Throwable t) {
                WsaaThrowableUtils.causedBy = "Caused by: ";
            }
        }
        return WsaaThrowableUtils.causedBy;
    }
    
    public static String getMessageStack(final Throwable t) {
        final StringBuffer sb = new StringBuffer();
        getMessageStack(t, sb);
        return sb.toString();
    }
    
    public static void getMessageStack(final Throwable t, final StringBuffer sb) {
        if (t == null) {
            return;
        }
        if (t instanceof WsaaThrowable) {
            final WsaaThrowable wt = (WsaaThrowable)t;
            final StringBuffer wtMessage = getWsaaThrowableMessage(wt);
            if (wtMessage.length() != 0) {
                if (sb.length() != 0) {
                    sb.append('\n');
                    sb.append(getCauseByString());
                }
                sb.append(wtMessage);
            }
            getMessageStack(wt.getCause(), sb);
        }
        else {
            String msg = t.getMessage();
            if (msg == null || msg.length() == 0) {
                msg = t.getClass().getName();
            }
            if (sb.length() != 0) {
                sb.append('\n');
                sb.append(getCauseByString());
            }
            sb.append(msg);
        }
    }
    
    public static void printRootCauseStackTrace(final Throwable t) {
        printRootCauseStackTrace(t, System.err);
    }
    
    public static void printRootCauseStackTrace(final Throwable t, final PrintStream s) {
        final Throwable rootCause = getRootCause(t);
        if (rootCause instanceof WsaaThrowable) {
            ((WsaaThrowable)rootCause).printThrowableStackTrace(s);
        }
        else {
            rootCause.printStackTrace(s);
        }
    }
    
    public static void printRootCauseStackTrace(final Throwable t, final PrintWriter s) {
        final Throwable rootCause = getRootCause(t);
        if (rootCause instanceof WsaaThrowable) {
            ((WsaaThrowable)rootCause).printThrowableStackTrace(s);
        }
        else {
            rootCause.printStackTrace(s);
        }
    }
    
    public static void addMsgsToBar(final List<WsaaMessage> msgList, final Throwable t) {
        if (t == null) {
            return;
        }
        if (t instanceof WsaaThrowable) {
            final WsaaThrowable wt = (WsaaThrowable)t;
            final WsaaMessage msg = wt.getWsaaMessage();
            if (msg != null && !msgList.contains(msg)) {
                msgList.add(msg);
            }
            addMsgsToBar(msgList, wt.getCause());
        }
    }
    
    static {
        WsaaThrowableUtils.causedBy = null;
    }
}
