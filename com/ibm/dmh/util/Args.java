// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.util;

import java.io.IOException;
import java.io.File;
import com.ibm.dmh.msg.WsaaRuntimeException;
import com.ibm.dmh.msg.MsgMgr;
import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

public class Args
{
    private List<String> mainArgs;
    private Map<String, String> keyArgs;
    private List<String> possibleKeyNames;
    
    public Args(final String[] args) {
        this(args, null);
    }
    
    public Args(final String[] args, final String[] keyNames) {
        this.mainArgs = new LinkedList<String>();
        this.keyArgs = new HashMap<String, String>();
        this.possibleKeyNames = null;
        final List<String> argList = new LinkedList<String>(Arrays.asList(args));
        while (!argList.isEmpty()) {
            final String s = argList.get(0);
            if (s.startsWith("-")) {
                break;
            }
            if (s.startsWith("/")) {
                break;
            }
            this.mainArgs.add(argList.remove(0));
        }
        final List<String> keyNameList = (keyNames == null) ? null : Arrays.asList(keyNames);
        String key = null;
        while (!argList.isEmpty()) {
            final String s2 = argList.remove(0);
            boolean isKey = false;
            if ((s2.startsWith("-") || s2.startsWith("/")) && (keyNames == null || getNameMatches(s2.substring(1), keyNameList).size() > 0)) {
                isKey = true;
            }
            if (isKey) {
                key = s2.substring(1);
                this.keyArgs.put(key, "");
            }
            else {
                if (key == null) {
                    continue;
                }
                this.keyArgs.put(key, s2);
            }
        }
        if (keyNames != null) {
            this.validateArguments(keyNames);
            this.possibleKeyNames = keyNameList;
            final Map<String, String> newKeyArgs = new HashMap<String, String>();
            for (final String name : this.keys()) {
                final String value = this.keyArgs.get(name);
                String newName = getName(name, this.possibleKeyNames);
                newName = ((newName != null) ? newName : name);
                newKeyArgs.put(newName, value);
            }
            this.keyArgs = newKeyArgs;
        }
        else {
            this.possibleKeyNames = new LinkedList<String>(this.keys());
        }
    }
    
    private static String getName(final String name, final Collection<String> c) {
        final String exactName = getExactName(name, c);
        if (exactName != null) {
            return exactName;
        }
        final String upperName = name.toUpperCase();
        for (final String entryName : c) {
            final String upperEntryName = entryName.toUpperCase();
            if (upperEntryName.startsWith(upperName)) {
                return entryName;
            }
        }
        return null;
    }
    
    private static List<String> getNameMatches(final String name, final Collection<String> c) {
        final List<String> matches = new ArrayList<String>();
        final String exactName = getExactName(name, c);
        if (exactName != null) {
            matches.add(exactName);
            return matches;
        }
        final String upperName = name.toUpperCase();
        for (final String entryName : c) {
            final String upperEntryName = entryName.toUpperCase();
            if (upperEntryName.startsWith(upperName)) {
                matches.add(entryName);
            }
        }
        return matches;
    }
    
    private static String getExactName(final String name, final Collection<String> c) {
        final String upperName = name.toUpperCase();
        for (final String entryName : c) {
            final String upperEntryName = entryName.toUpperCase();
            if (upperEntryName.equals(upperName)) {
                return entryName;
            }
        }
        return null;
    }
    
    public String get(final int i) {
        return this.get(i, "");
    }
    
    public String get(final int i, final String defaultValue) {
        if (this.mainArgs.size() <= i) {
            return defaultValue;
        }
        return this.mainArgs.get(i);
    }
    
    public String get(final String s) {
        return this.get(s, "");
    }
    
    public String get(final String s, final String defaultValue) {
        final String name = getName(s, this.possibleKeyNames);
        if (name == null || !this.keyArgs.containsKey(name)) {
            return defaultValue;
        }
        return this.keyArgs.get(name);
    }
    
    public boolean has(final String s) {
        final String name = getName(s, this.possibleKeyNames);
        return name != null && this.keys().contains(name);
    }
    
    public Set<String> keys() {
        return this.keyArgs.keySet();
    }
    
    public int length() {
        return this.lengthMainArgs() + this.lengthKeyArgs();
    }
    
    public int lengthKeyArgs() {
        return this.keyArgs.size();
    }
    
    public int lengthMainArgs() {
        return this.mainArgs.size();
    }
    
    private void validateArguments(final String[] possibleNames) {
        final List<String> bad = new ArrayList<String>();
        final Set<String> args = new TreeSet<String>();
        args.addAll(this.keys());
        final List<String> possibleList = Arrays.asList(possibleNames);
        for (final String name : args) {
            final List<String> matches = getNameMatches(name, possibleList);
            if (matches.size() > 1 && !bad.contains(name)) {
                bad.add(name);
            }
        }
        if (bad.size() > 0) {
            throw new WsaaRuntimeException(MsgMgr.dmh1017e(StringUtils.join(bad, ", "), StringUtils.join(possibleNames, ", ")));
        }
    }
    
    public static String getCanonicalName(String name, final boolean isFile) {
        if (isFile) {
            try {
                name = new File(name).getCanonicalPath();
                return name;
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        name = name.toUpperCase();
        return name;
    }
}
