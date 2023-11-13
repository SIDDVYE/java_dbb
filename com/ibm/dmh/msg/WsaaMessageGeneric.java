// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.msg;

import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.logging.Level;

public class WsaaMessageGeneric
{
    public static final int INFORMATION_STATUS = 0;
    public static final int WARNING_STATUS = 1;
    public static final int ERROR_STATUS = 2;
    public static final int SEVERE_STATUS = 3;
    private final WsaaMessageTextGeneric module;
    private final WsaaMessageTextGeneric explanation;
    private final WsaaMessageTextGeneric systemAction;
    private final WsaaMessageTextGeneric userResponse;
    private final WsaaMessageTextGeneric identifier;
    private final WsaaMessageTextGeneric title;
    
    public WsaaMessageGeneric(final String identifier, final String title, final String module, final String explanation, final String systemAction, final String userResponse) {
        this.identifier = new WsaaMessageTextGeneric(identifier);
        this.title = new WsaaMessageTextGeneric(title);
        this.module = new WsaaMessageTextGeneric(module);
        this.explanation = new WsaaMessageTextGeneric(explanation);
        this.systemAction = new WsaaMessageTextGeneric(systemAction);
        this.userResponse = new WsaaMessageTextGeneric(userResponse);
    }
    
    WsaaMessageGeneric(final WsaaMessageTextGeneric identifier, final WsaaMessageTextGeneric title, final WsaaMessageTextGeneric module, final WsaaMessageTextGeneric explanation, final WsaaMessageTextGeneric systemAction, final WsaaMessageTextGeneric userResponse) {
        this.identifier = identifier;
        this.title = title;
        this.module = module;
        this.explanation = explanation;
        this.systemAction = systemAction;
        this.userResponse = userResponse;
    }
    
    WsaaMessageGeneric(final String identifier) {
        this(identifier, "", "", "", "", "");
    }
    
    public WsaaMessageTextGeneric getIdentifier() {
        return this.identifier;
    }
    
    public WsaaMessageTextGeneric getExplanation() {
        return this.explanation;
    }
    
    public WsaaMessageTextGeneric getModule() {
        return this.module;
    }
    
    public WsaaMessageTextGeneric getSystemAction() {
        return this.systemAction;
    }
    
    public WsaaMessageTextGeneric getUserResponse() {
        return this.userResponse;
    }
    
    public Level getSeverity() {
        return getSeverity(this.identifier.getText());
    }
    
    static Level getSeverity(final String id) {
        final char severityChar = Character.toUpperCase(id.charAt(id.length() - 1));
        switch (severityChar) {
            case 'I': {
                return Level.INFO;
            }
            case 'W': {
                return Level.WARNING;
            }
            default: {
                return Level.SEVERE;
            }
        }
    }
    
    public int getMessageNumber() {
        return Integer.parseInt(this.identifier.getText().substring(3, 7));
    }
    
    public final WsaaMessageTextGeneric getTitle() {
        return this.title;
    }
    
    SortedSet<String> getParameters() {
        final SortedSet<String> vars = new TreeSet<String>();
        this.getVariables(this.identifier, vars);
        this.getVariables(this.title, vars);
        this.getVariables(this.module, vars);
        this.getVariables(this.explanation, vars);
        this.getVariables(this.systemAction, vars);
        this.getVariables(this.userResponse, vars);
        return vars;
    }
    
    void getVariables(final WsaaMessageTextGeneric msg, final Set<String> vars) {
        final String field = msg.getXml();
        String varName = "";
        int state = 0;
        for (int i = 0; i < field.length(); ++i) {
            final char curChar = field.charAt(i);
            switch (state) {
                case 0: {
                    if (curChar == '<') {
                        state = 1;
                        break;
                    }
                    break;
                }
                case 1: {
                    if (curChar == 'm' || curChar == 'M') {
                        state = 2;
                        break;
                    }
                    if (!Character.isWhitespace(curChar)) {
                        state = 0;
                        break;
                    }
                    break;
                }
                case 2: {
                    if (curChar == 'v' || curChar == 'V') {
                        state = 3;
                        break;
                    }
                    state = 0;
                    break;
                }
                case 3: {
                    if (curChar == '>') {
                        state = 4;
                        break;
                    }
                    break;
                }
                case 4: {
                    if (curChar == '<') {
                        vars.add(varName);
                        varName = "";
                        state = 0;
                        break;
                    }
                    varName += curChar;
                    break;
                }
            }
        }
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj instanceof WsaaMessageGeneric) {
            return this.getMessageNumber() == ((WsaaMessageGeneric)obj).getMessageNumber();
        }
        return super.equals(obj);
    }
    
    @Override
    public int hashCode() {
        return this.getMessageNumber();
    }
    
    public String getPrefix() {
        return this.identifier.getText().substring(0, 3);
    }
}
