// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import java.util.ResourceBundle;

public class WsaaHardCodedMessages
{
    private ResourceBundle resourceBundleMessages;
    private static WsaaHardCodedMessages fINSTANCE;
    public static final String BADLOAD_MSGNUM = "DMH5840E";
    public static final String BADLOAD_MSGTEXT = "Unable to fully load the XML message file: <mv>xmlfile</mv>";
    public static final String BADLOAD_MODULE = "WsaaJar";
    public static final String BADLOAD_XPL = "<p>Some messages might not be fully loaded into memory. When a message cannot be accessed, DMH5841E will be logged instead.</p>";
    public static final String BADLOAD_SYSACT = "<p>Reading the XML message file has been aborted.</p>";
    public static final String BADLOAD_URESP = "<p>Make sure that the XML message file (<mv>xmlfile</mv>) is accessiable to WSAA.</p>";
    public static final String UNKNOWNMSG_MSGNUM = "DMH5841E";
    public static final String UNKNOWNMSG_MSGTEXT = "Message number <mv>msgnum</mv> was not found; parameters: <mv>parms</mv>";
    public static final String UNKNOWNMSG_MODULE = "WsaaJar";
    public static final String UNKNOWNMSG_XPL = "<p>The message details for message number <mv>msgnum</mv> was not found in memory.  This could be caused by a failed load of the message XML file.</p>";
    public static final String UNKNOWNMSG_SYSACT = "<p>The message number and message parameters will be logged, but no other details will be logged.</p>";
    public static final String UNKNOWNMSG_URESP = "<p>Make sure that the XML message file is accessiable.</p>";
    
    public static WsaaHardCodedMessages getInstance() {
        return WsaaHardCodedMessages.fINSTANCE;
    }
    
    private WsaaHardCodedMessages() {
        this.resourceBundleMessages = null;
        this.resourceBundleMessages = null;
    }
    
    static void reset() {
        WsaaHardCodedMessages.fINSTANCE = new WsaaHardCodedMessages();
    }
    
    public WsaaMessageGeneric getBadLoadMessage() {
        try {
            final ResourceBundle messages = this.getResourceBundleMessages();
            return new WsaaMessageGeneric(messages.getString("badload_msgnum"), messages.getString("badload_msgtext"), messages.getString("badload_module"), messages.getString("badload_xpl"), messages.getString("badload_sysact"), messages.getString("badload_uresp"));
        }
        catch (Throwable t) {
            return new WsaaMessageGeneric("DMH5840E", "Unable to fully load the XML message file: <mv>xmlfile</mv>", "WsaaJar", "<p>Some messages might not be fully loaded into memory. When a message cannot be accessed, DMH5841E will be logged instead.</p>", "<p>Reading the XML message file has been aborted.</p>", "<p>Make sure that the XML message file (<mv>xmlfile</mv>) is accessiable to WSAA.</p>");
        }
    }
    
    public WsaaMessageGeneric getUnknownMessage(final String msgnum) {
        try {
            final ResourceBundle messages = this.getResourceBundleMessages();
            return new WsaaUnknownMessageGeneric(messages.getString("unknownmsg_msgnum"), messages.getString("unknownmsg_msgtext"), messages.getString("unknownmsg_module"), messages.getString("unknownmsg_xpl"), messages.getString("unknownmsg_sysact"), messages.getString("unknownmsg_uresp"), msgnum);
        }
        catch (Throwable t) {
            return new WsaaUnknownMessageGeneric("DMH5841E", "Message number <mv>msgnum</mv> was not found; parameters: <mv>parms</mv>", "WsaaJar", "<p>The message details for message number <mv>msgnum</mv> was not found in memory.  This could be caused by a failed load of the message XML file.</p>", "<p>The message number and message parameters will be logged, but no other details will be logged.</p>", "<p>Make sure that the XML message file is accessiable.</p>", msgnum);
        }
    }
    
    public ResourceBundle getResourceBundleMessages() {
        if (this.resourceBundleMessages == null) {
            this.resourceBundleMessages = ResourceBundle.getBundle("com.ibm.dmh.msg.HardCodedMessages");
        }
        return this.resourceBundleMessages;
    }
    
    static {
        WsaaHardCodedMessages.fINSTANCE = new WsaaHardCodedMessages();
    }
}
