// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import java.util.Iterator;
import com.ibm.dmh.util.StringUtils;
import java.util.logging.Level;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.LogRecord;

public class WsaaMessage extends LogRecord
{
    private final WsaaMessageGeneric msg;
    private final Map<String, String> vars;
    public static final int INFORMATION_STATUS = 0;
    public static final int WARNING_STATUS = 1;
    public static final int ERROR_STATUS = 2;
    public static final int SEVERE_STATUS = 3;
    
    public WsaaMessage(final WsaaMessageGeneric msg, final Map<String, String> vars) {
        super(msg.getSeverity(), "");
        this.msg = msg;
        this.vars = vars;
        this.setMessage(this.toTextString());
    }
    
    public WsaaMessage(final WsaaMessageGeneric msg, final String[] varKeys, final String[] varVals) {
        super(msg.getSeverity(), "");
        this.msg = msg;
        this.vars = new HashMap<String, String>();
        for (int j = Math.min(varKeys.length, varVals.length), i = 0; i < j; ++i) {
            this.vars.put(varKeys[i], varVals[i]);
        }
        this.setMessage(this.toTextString());
    }
    
    public WsaaMessageText getExplanation() {
        return new WsaaMessageText(this.msg.getExplanation(), this.vars);
    }
    
    public WsaaMessageText getIdentifier() {
        return new WsaaMessageText(this.msg.getIdentifier(), this.vars);
    }
    
    public WsaaMessageText getSystemAction() {
        return new WsaaMessageText(this.msg.getSystemAction(), this.vars);
    }
    
    public WsaaMessageText getModule() {
        return new WsaaMessageText(this.msg.getModule(), this.vars);
    }
    
    public WsaaMessageText getTitle() {
        return new WsaaMessageText(this.msg.getTitle(), this.vars);
    }
    
    public WsaaMessageText getUserResponse() {
        return new WsaaMessageText(this.msg.getUserResponse(), this.vars);
    }
    
    public Level getSeverity() {
        return this.msg.getSeverity();
    }
    
    public String toTextString() {
        return this.getIdentifier().getText() + ": " + this.getTitle().getText();
    }
    
    public String toHtmlString() {
        return this.getIdentifier().getText() + ": " + this.getTitle().getHtml();
    }
    
    @Override
    public String toString() {
        return this.toTextString();
    }
    
    public int getMessageNumber() {
        final String identifier = this.getIdentifier().getText();
        final int startIdx = "DMH".length();
        final String number = identifier.substring(startIdx, startIdx + "0000".length());
        return Integer.parseInt(number);
    }
    
    @Override
    public boolean equals(final Object arg0) {
        return arg0 instanceof WsaaMessage && this.toTextString().equals(((WsaaMessage)arg0).toTextString());
    }
    
    @Override
    public int hashCode() {
        return this.toTextString().hashCode();
    }
    
    public String getVarKeys() {
        return StringUtils.join(this.vars.keySet().iterator(), ',', true);
    }
    
    public String getVarValues() {
        return StringUtils.join(this.vars.values().iterator(), ',', true);
    }
    
    public Map<String, String> getVariables() {
        return this.vars;
    }
}
