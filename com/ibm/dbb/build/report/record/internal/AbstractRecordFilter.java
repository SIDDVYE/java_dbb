// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.record.internal;

import com.ibm.dbb.build.report.records.Record;
import java.util.Iterator;
import com.ibm.dbb.build.report.records.RecordFactoryManager;
import java.util.Set;

public abstract class AbstractRecordFilter implements IRecordFilter
{
    protected Set<String> includedTypes;
    
    public AbstractRecordFilter() {
        this.includedTypes = null;
    }
    
    @Override
    public Set<String> getIncludedTypes() {
        return this.includedTypes;
    }
    
    @Override
    public IRecordFilter and(final IRecordFilter filter) {
        if (this.includedTypes == null) {
            this.apply(RecordFactoryManager.getInstance().getAllRecordTypes());
        }
        return filter.apply(this.includedTypes);
    }
    
    @Override
    public IRecordFilter or(final IRecordFilter filter) {
        if (this.includedTypes == null) {
            this.apply(RecordFactoryManager.getInstance().getAllRecordTypes());
        }
        final IRecordFilter result = filter.apply(RecordFactoryManager.getInstance().getAllRecordTypes());
        for (final String includedType : this.includedTypes) {
            result.getIncludedTypes().add(includedType);
        }
        return result;
    }
    
    @Override
    public boolean shouldAddToReport(final Record record) {
        if (this.includedTypes == null) {
            this.apply(RecordFactoryManager.getInstance().getAllRecordTypes());
        }
        return this.includedTypes.contains(record.getType());
    }
}
