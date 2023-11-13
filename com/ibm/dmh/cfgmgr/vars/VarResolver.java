// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.cfgmgr.vars;

import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import com.ibm.dmh.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

public class VarResolver
{
    protected Map<String, AbstractVar> varMap;
    protected Map<String, VarTracker> varTrackerMap;
    
    public VarResolver() {
        this.varMap = new HashMap<String, AbstractVar>();
        this.varTrackerMap = new HashMap<String, VarTracker>();
    }
    
    public void addVar(final String varName, final AbstractVar v, final VarTracker t) {
        this.varMap.put(varName, v);
        if (t != null) {
            this.varTrackerMap.put(varName, t);
        }
    }
    
    public boolean resolveBoolean(final String s) throws Exception {
        return s == null || s.equals("") || this.resolveString("$MB{" + s + "}").equals("true");
    }
    
    public String resolveString(final String s) throws Exception {
        if (s == null || s.indexOf(36) == -1) {
            return s;
        }
        int state = 1;
        final StringBuffer sb = new StringBuffer(s.length());
        final char[] c = s.toCharArray();
        boolean hasInternalVar = false;
        String varType = null;
        String varVal = null;
        int x = 0;
        int x2 = 0;
        int depth = 0;
        for (int i = 0; i < c.length; ++i) {
            switch (state) {
                case 1: {
                    if (c[i] == '$') {
                        sb.append(c, x, i - x);
                        x = i;
                        x2 = i;
                        state = 2;
                        break;
                    }
                    break;
                }
                case 2: {
                    if (c[i] == '{') {
                        varType = new String(c, x + 1, i - x - 1);
                        x = i;
                        state = 3;
                        break;
                    }
                    if (c[i] < '&' || c[i] > 'z') {
                        sb.append(c, x, i - x + 1);
                        x = i + 1;
                        state = 1;
                        break;
                    }
                    break;
                }
                case 3: {
                    if (c[i] == '{') {
                        ++depth;
                        hasInternalVar = true;
                        break;
                    }
                    if (c[i] != '}') {
                        break;
                    }
                    if (depth > 0) {
                        --depth;
                        break;
                    }
                    varVal = new String(c, x + 1, i - x - 1);
                    varVal = (hasInternalVar ? this.resolveString(varVal) : varVal);
                    final AbstractVar r = this.varMap.get(varType);
                    final VarTracker t = this.varTrackerMap.get(varType);
                    sb.append((r == null) ? new String(c, x2, i - x2 + 1) : r.resolve(varType, StringUtils.splitQuoted(varVal, ',', true, true), t));
                    x = i + 1;
                    state = 1;
                    break;
                }
            }
        }
        sb.append(c, x, c.length - x);
        return sb.toString();
    }
    
    public List<String> getTrackerWarnings() {
        final List<String> l = new LinkedList<String>();
        try {
            for (final Map.Entry<String, VarTracker> e : this.varTrackerMap.entrySet()) {
                final String varName = e.getKey();
                final VarTracker vt = e.getValue();
                final AbstractVar v = this.varMap.get(varName);
                final Set<String> notFound = vt.getNotFound();
                final Set<String> notUsed = vt.getNotUsed(v.getKeys());
                if (!notFound.isEmpty()) {
                    l.add("Keys not found for var [" + varName + "]:  \n\t" + StringUtils.join(notFound, "\n\t"));
                }
                if (!notUsed.isEmpty()) {
                    l.add("Keys not used  for var [" + varName + "]:  \n\t" + StringUtils.join(notUsed, "\n\t"));
                }
            }
        }
        catch (Exception e2) {
            e2.printStackTrace(System.err);
        }
        return l;
    }
}
