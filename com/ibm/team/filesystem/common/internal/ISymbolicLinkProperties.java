// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public interface ISymbolicLinkProperties
{
    public static final String LINK_TIMESTAMP = "scm.LinkTimestamp";
    public static final String LINK_IS_DIRECTORY_TYPE = "scm.LinkIsDirectoryType";
    public static final String LINK_IS_DIRECTORY_TYPE_VALUE = "true";
    public static final Set<String> nonMergable = Collections.singleton("scm.LinkTimestamp");
    public static final Set<String> requiredProperties = Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(Arrays.asList("scm.LinkTimestamp")));
}
