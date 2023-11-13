// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.enterprise.metadata.scanner.common;

import com.ibm.team.enterprise.metadata.scanner.IFileMetadataScanner;

public class CategoryMetadataScannerFilter implements IFileMetadataScannerFilter
{
    private String[] categories;
    
    public CategoryMetadataScannerFilter(final String[] categories) {
        if (categories == null) {
            this.categories = new String[0];
        }
        else {
            System.arraycopy(categories, 0, this.categories = new String[categories.length], 0, categories.length);
        }
    }
    
    @Override
    public boolean accept(final IFileMetadataScanner scanner) {
        if (scanner != null) {
            for (final String category : this.categories) {
                if (scanner.getCategory().equalsIgnoreCase(category)) {
                    return true;
                }
            }
        }
        return false;
    }
}
