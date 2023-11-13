// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.process.config;

import java.util.regex.PatternSyntaxException;
import com.ibm.team.repository.common.IItemHandle;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.filesystem.common.internal.util.StringMatcher;
import java.util.regex.Pattern;
import com.ibm.team.repository.common.TeamRepositoryException;
import java.util.Iterator;
import java.util.ArrayList;
import com.ibm.team.scm.common.internal.process.PCD_asObject;
import com.ibm.team.scm.common.internal.process.PCD_defaultValue;
import java.util.List;
import com.ibm.team.scm.common.internal.process.PCD_mayBeNull;
import com.ibm.team.filesystem.common.internal.process.ComponentMatchBlock;

public class ProtectFileTypeAdvisorConfig
{
    public static String ROOT_NODE_NAME;
    @PCD_mayBeNull
    public ComponentMatchBlock compMatcher;
    public List<VersionableMatchRule> pathMatchers;
    @PCD_defaultValue("ALLOW_MATCHES")
    @PCD_asObject
    public Mode mode;
    
    static {
        ProtectFileTypeAdvisorConfig.ROOT_NODE_NAME = "config";
    }
    
    public ProtectFileTypeAdvisorConfig() {
        this.compMatcher = new ComponentMatchBlock();
        this.pathMatchers = new ArrayList<VersionableMatchRule>();
        this.mode = Mode.ALLOW_MATCHES;
    }
    
    public List<MatcherInitializationException> initMatchers() {
        final ArrayList<MatcherInitializationException> exceptions = new ArrayList<MatcherInitializationException>();
        for (final VersionableMatchRule rule : this.pathMatchers) {
            try {
                rule.initMatcher();
            }
            catch (MatcherInitializationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
    
    public enum MatcherType
    {
        NAME_PATTERN("NAME_PATTERN", 0), 
        REGEX("REGEX", 1);
        
        private MatcherType(final String name, final int ordinal) {
        }
    }
    
    public enum Mode
    {
        DENY_MATCHES("DENY_MATCHES", 0), 
        ALLOW_MATCHES("ALLOW_MATCHES", 1);
        
        private Mode(final String name, final int ordinal) {
        }
    }
    
    public static class MatcherInitializationException extends TeamRepositoryException
    {
        private static final long serialVersionUID = 7909502540457045602L;
        public final VersionableMatchRule rule;
        
        public MatcherInitializationException(final VersionableMatchRule rule) {
            super("Bad matcher: " + rule.matchText);
            this.rule = rule;
        }
    }
    
    public static class VersionableMatchRule
    {
        public String matchText;
        public MatcherType type;
        public boolean matchAll;
        public boolean matchAddition;
        public boolean matchDelete;
        public boolean matchModify;
        public boolean matchRename;
        public boolean matchMove;
        private transient Pattern regex;
        private transient StringMatcher stringMatcher;
        
        public VersionableMatchRule() {
            this.matchText = "";
            this.type = MatcherType.NAME_PATTERN;
            this.matchAll = true;
            this.matchAddition = false;
            this.matchDelete = false;
            this.matchModify = false;
            this.matchRename = false;
            this.matchMove = false;
        }
        
        public boolean matches(final String name) {
            if (this.type == MatcherType.NAME_PATTERN) {
                return this.stringMatcher.match(name);
            }
            return this.regex.matcher(name).find();
        }
        
        public boolean matchesChangeType(final int changeType, final IVersionable previous, final IVersionable current) {
            if (this.matchAll) {
                return true;
            }
            if ((this.matchAddition && eq(1, changeType)) || (this.matchDelete && eq(2, changeType)) || (this.matchModify && eq(4, changeType))) {
                return true;
            }
            if (eq(8, changeType)) {
                if (this.matchRename && !previous.getName().equals(current.getName())) {
                    return true;
                }
                if (this.matchMove) {
                    if (previous.getParent() == null) {
                        return current.getParent() != null;
                    }
                    if (current.getParent() == null) {
                        return previous.getParent() != null;
                    }
                    if (!current.getParent().sameItemId((IItemHandle)previous.getParent())) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        private static boolean eq(final int type, final int toCheck) {
            return type == (type & toCheck);
        }
        
        public void initMatcher() throws MatcherInitializationException {
            if (this.type == MatcherType.NAME_PATTERN) {
                this.stringMatcher = new StringMatcher(this.matchText, false, false);
                return;
            }
            try {
                this.regex = Pattern.compile(this.matchText);
            }
            catch (PatternSyntaxException ex) {
                throw new MatcherInitializationException(this);
            }
        }
    }
}
