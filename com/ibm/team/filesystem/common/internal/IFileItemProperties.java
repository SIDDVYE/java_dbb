// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public interface IFileItemProperties
{
    public static final String FILE_TIMESTAMP = "fileTimestamp";
    public static final String CONTENT_TYPE = "contentType";
    public static final Set<String> nonMergable = Collections.singleton("fileTimestamp");
    public static final Set<String> requiredProperties = Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(Arrays.asList("contentType", "fileTimestamp")));
}
