// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

public class WsaaUnknownMessageGeneric extends WsaaMessageGeneric
{
    public WsaaUnknownMessageGeneric(final String identifier, final String title, final String module, final String explanation, final String systemAction, final String userResponse, final String msgnum) {
        super(new WsaaUnknownMessageTextGeneric(identifier, msgnum), new WsaaUnknownMessageTextGeneric(title, msgnum), new WsaaUnknownMessageTextGeneric(module, msgnum), new WsaaUnknownMessageTextGeneric(explanation, msgnum), new WsaaUnknownMessageTextGeneric(systemAction, msgnum), new WsaaUnknownMessageTextGeneric(userResponse, msgnum));
    }
}
