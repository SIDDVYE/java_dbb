// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner;

import java.io.InputStream;
import java.util.Map;

public interface IMetadataScanner
{
    Map<String, IMetadataValueType> getGeneralMetadataTypes();
    
    IScannerData scan(final InputStream p0, final Map<String, String> p1);
}
