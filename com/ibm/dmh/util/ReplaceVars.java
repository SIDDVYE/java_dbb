// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.util.HashSet;
import java.util.Enumeration;
import java.util.Map;
import java.util.HashMap;
import java.util.ResourceBundle;
import com.ibm.dmh.cfgmgr.vars.VarResolver;
import java.util.StringTokenizer;
import com.ibm.dmh.cfgmgr.ExpressionSolver;
import java.util.Iterator;
import java.util.Set;

public class ReplaceVars
{
    private String contents;
    private String fileName;
    private StringBuffer newContents;
    
    public ReplaceVars(final String iFileName, final String iContents) {
        this.contents = iContents;
        this.fileName = iFileName;
        this.newContents = new StringBuffer(iContents.length());
    }
    
    private String constructErrorMessage(final String varType, final Set<String> propertiesNotUsed, final Set<String> propertiesNotFound, final boolean throwExceptionOnUnfoundProperties, final boolean throwExceptionOnUnusedProperties) {
        final StringBuffer sb = new StringBuffer();
        if (throwExceptionOnUnfoundProperties && !propertiesNotFound.isEmpty()) {
            sb.append("Properties not found in map for $" + varType + " variables:  \t");
            final Iterator<String> i = propertiesNotFound.iterator();
            while (i.hasNext()) {
                sb.append(i.next() + ", ");
            }
            sb.append("\n");
        }
        if (throwExceptionOnUnusedProperties && !propertiesNotUsed.isEmpty()) {
            sb.append("Properties not used in map for $" + varType + " variables:  \t");
            final Iterator<String> i = propertiesNotUsed.iterator();
            while (i.hasNext()) {
                sb.append(i.next() + ", ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public void evaluateCommands() throws Exception {
        String oldContents = this.contents;
        int c1 = 0;
        while ((c1 = this.evaluateNextCOND(oldContents, this.newContents, c1)) != -1) {}
        oldContents = this.newContents.toString();
        this.newContents.setLength(0);
        c1 = 0;
        while ((c1 = this.evaluateNextIF(oldContents, this.newContents, c1)) != -1) {}
        oldContents = this.newContents.toString();
        this.newContents.setLength(0);
        c1 = 0;
        while ((c1 = this.evaluateNextFOREACH(oldContents, this.newContents, c1)) != -1) {}
    }
    
    private int evaluateNextCOND(final String oldContents, final StringBuffer newContents, final int start) throws Exception {
        int i = this.prependUpTo("COND", start, oldContents, newContents);
        if (i == -1) {
            return -1;
        }
        String cond = null;
        String val1 = null;
        String val2 = null;
        try {
            i += 5;
            cond = oldContents.substring(i + 1, i = oldContents.indexOf(63, i)).trim();
            val1 = oldContents.substring(i + 1, i = oldContents.indexOf(58, i)).trim();
            val2 = oldContents.substring(i + 1, i = oldContents.indexOf(93, i)).trim();
        }
        catch (Exception e) {
            throw new Exception("Incomplete %COND command found.");
        }
        if (ExpressionSolver.solveBoolean(cond)) {
            newContents.append(val1);
        }
        else {
            newContents.append(val2);
        }
        return i + 1;
    }
    
    private int evaluateNextIF(final String oldContents, final StringBuffer newContents, final int start) throws Exception {
        final int i = this.prependUpTo("IF", start, oldContents, newContents);
        if (i == -1) {
            return -1;
        }
        final String[] s = parseOutCommand("IF", oldContents, i);
        if (s[0] == null || s[1] == null) {
            throw new Exception("Incomplete %IF command found.");
        }
        final int bodyLength = s[1].length();
        s[1] = StringUtils.replace(s[1], "\n\t", "\n");
        s[1] = StringUtils.replace(s[1], "\n    ", "\n");
        int j = 0;
        if (ExpressionSolver.solveBoolean(s[0])) {
            while ((j = this.evaluateNextIF(s[1], newContents, j)) != -1) {}
        }
        return i + 11 + s[0].length() + bodyLength;
    }
    
    private int evaluateNextFOREACH(final String oldContents, final StringBuffer newContents, final int start) throws Exception {
        final int i = this.prependUpTo("FOREACH", start, oldContents, newContents);
        if (i == -1) {
            return -1;
        }
        final String[] s = parseOutCommand("FOREACH", oldContents, start);
        if (s[0] == null || s[1] == null || s[0].indexOf(" in ") == -1) {
            throw new Exception("Incomplete %FOREACH command found.");
        }
        final String s2 = s[0].trim();
        final String var = "$V{" + s2.substring(0, s2.indexOf(" in ")) + "}";
        final StringTokenizer vals = new StringTokenizer(s2.substring(s2.indexOf(" in ") + 4), ",");
        while (vals.hasMoreTokens()) {
            final String val = vals.nextToken().trim();
            int c1 = 0;
            for (int c2 = 0; (c2 = s[1].indexOf(var, c1)) != -1; c1 = c2 + var.length()) {
                newContents.append(s[1].substring(c1, c2) + val);
            }
            newContents.append(s[1].substring(c1));
        }
        return i + 21 + s[0].length() + s[1].length();
    }
    
    public StringBuffer getNewContents() {
        return this.newContents;
    }
    
    public void insertVars(final VarResolver vr) throws Exception {
        final String results = vr.resolveString(this.contents);
        this.newContents.setLength(0);
        this.newContents.append(results);
    }
    
    public int insertVars(final String varType, final ResourceBundle rb, final boolean throwExceptionOnUnfoundProperties, final boolean throwExceptionOnUnusedProperties) {
        if (rb == null) {
            return 0;
        }
        final Map<String, String> vars = new HashMap<String, String>();
        final Enumeration<String> e = rb.getKeys();
        while (e.hasMoreElements()) {
            final String key = e.nextElement();
            vars.put(key, rb.getString(key).trim());
        }
        final int numReplaces = this.insertVars(varType, vars, throwExceptionOnUnfoundProperties, throwExceptionOnUnusedProperties);
        return numReplaces;
    }
    
    public int insertVars(final String varType, final Map<String, String> vars, final boolean throwExceptionOnUnfoundProperties, final boolean throwExceptionOnUnusedProperties) {
        int numReplaces = 0;
        final Set<String> propertiesNotUsed = new HashSet<String>();
        final Set<String> propertiesNotFound = new HashSet<String>();
        if (throwExceptionOnUnusedProperties) {
            final Iterator<String> i = vars.keySet().iterator();
            while (i.hasNext()) {
                propertiesNotUsed.add(i.next());
            }
        }
        final String oldContents = this.contents.toString();
        final String searchToken = "$" + varType + "{";
        int c1 = 0;
        int c2 = 0;
        while ((c2 = oldContents.indexOf(searchToken, c1)) != -1) {
            ++numReplaces;
            this.newContents.append(oldContents.substring(c1, c2));
            c1 = oldContents.indexOf(125, c2);
            final String var = oldContents.substring(c2 + searchToken.length(), c1);
            final String val = vars.get(var);
            this.newContents.append((val == null) ? (searchToken + var + "}") : val);
            if (throwExceptionOnUnfoundProperties && val == null) {
                propertiesNotFound.add(var);
            }
            else if (throwExceptionOnUnusedProperties) {
                propertiesNotUsed.remove(var);
            }
            ++c1;
        }
        this.newContents.append(oldContents.substring(c1));
        final String errorMessage = this.constructErrorMessage(varType, propertiesNotUsed, propertiesNotFound, throwExceptionOnUnfoundProperties, throwExceptionOnUnusedProperties);
        if (errorMessage.length() > 0) {
            throw new RuntimeException("Errors encountered while trying to insert properties into file [" + this.fileName + "]:\n " + errorMessage);
        }
        return numReplaces;
    }
    
    private int prependUpTo(final String command, final int start, final String oldContents, final StringBuffer newContents) {
        final int i = oldContents.indexOf("%" + command + "[", start);
        if (i == -1) {
            newContents.append(oldContents.substring(start));
            return -1;
        }
        newContents.append(oldContents.substring(start, i));
        return i;
    }
    
    private static String[] parseOutCommand(final String com, final String s, final int start) {
        final String[] results = new String[2];
        int c1 = s.indexOf(91, start);
        final int c2 = s.indexOf(93, c1);
        results[0] = s.substring(c1 + 1, c2);
        int level;
        for (level = 1, c1 = c2 + 1; level != 0 && c1 < s.length(); ++c1) {
            if (s.charAt(c1) == '%') {
                if (s.indexOf("%" + com, c1) == c1) {
                    ++level;
                }
                else if (s.indexOf("%END" + com, c1) == c1) {
                    --level;
                }
            }
        }
        if (level == 0) {
            results[1] = s.substring(c2 + 1, c1 - 1);
        }
        return results;
    }
}
