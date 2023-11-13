// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner.common;

import com.ibm.team.enterprise.metadata.scanner.IFileMetadataScanner;

public class DependencyMetadataScannerFilter implements IFileMetadataScannerFilter
{
    @Override
    public boolean accept(final IFileMetadataScanner scanner) {
        return scanner != null && "dependency".equals(scanner.getType());
    }
}
