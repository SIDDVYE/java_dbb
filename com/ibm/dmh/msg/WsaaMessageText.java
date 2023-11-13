// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class WsaaMessageText
{
    final WsaaMessageTextGeneric text;
    final String[] varKeys;
    final String[] varValues;
    
    public WsaaMessageText(final WsaaMessageTextGeneric text, final String[] varKeys, final String[] varValues) {
        this.text = text;
        this.varKeys = varKeys;
        this.varValues = varValues;
    }
    
    public WsaaMessageText(final WsaaMessageTextGeneric text, final Map<String, String> vars) {
        this.text = text;
        final int s = vars.size();
        final List<String> l1 = new ArrayList<String>(s);
        final List<String> l2 = new ArrayList<String>(s);
        for (final Map.Entry<String, String> e : vars.entrySet()) {
            l1.add(e.getKey());
            l2.add(e.getValue());
        }
        this.varKeys = l1.toArray(new String[s]);
        this.varValues = l2.toArray(new String[s]);
    }
    
    WsaaMessageText() {
        this.text = null;
        this.varKeys = null;
        this.varValues = null;
    }
    
    public String getHtml() {
        return this.text.getHtml(this.varKeys, this.varValues);
    }
    
    public String getText() {
        return this.text.getText(this.varKeys, this.varValues);
    }
    
    public String getXML() {
        return this.text.getXml(this.varKeys, this.varValues);
    }
    
    @Override
    public String toString() {
        return this.getText();
    }
}
