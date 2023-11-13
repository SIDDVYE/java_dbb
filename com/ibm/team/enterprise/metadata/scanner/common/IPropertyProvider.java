// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner.common;

import java.util.Map;

public interface IPropertyProvider
{
    Map<String, String> getProperties(final ScanFileDesc p0) throws Exception;
}
