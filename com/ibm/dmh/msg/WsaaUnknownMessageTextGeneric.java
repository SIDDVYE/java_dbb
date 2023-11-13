// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

public class WsaaUnknownMessageTextGeneric extends WsaaMessageTextGeneric
{
    private final String msgnum;
    
    public WsaaUnknownMessageTextGeneric(final String partialXML, final String msgnum) {
        super(partialXML);
        this.msgnum = msgnum;
    }
    
    @Override
    public String getHtml(final String[] varKeys, final String[] varValues) {
        return super.getHtml(new String[] { "msgnum", "parms" }, new String[] { this.msgnum, this.getParmsString(new String[] { "msgnum", "parms" }, new String[] { this.msgnum, this.getParmsString(varKeys, varValues) }) });
    }
    
    private String getParmsString(final String[] varKeys, final String[] varValues) {
        final StringBuffer ret = new StringBuffer();
        ret.append('{');
        for (int i = 0; i < varKeys.length; ++i) {
            ret.append('(');
            ret.append(varKeys[i]);
            ret.append('=');
            ret.append(varValues[i]);
            ret.append(')');
        }
        ret.append('}');
        return ret.toString();
    }
    
    @Override
    public String getText(final String[] varKeys, final String[] varValues) {
        return super.getText(new String[] { "msgnum", "parms" }, new String[] { this.msgnum, this.getParmsString(varKeys, varValues) });
    }
    
    @Override
    public String getXml(final String[] varKeys, final String[] varValues) {
        return super.getXml(new String[] { "msgnum", "parms" }, new String[] { this.msgnum, this.getParmsString(varKeys, varValues) });
    }
}
