// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report.record.internal;

import com.ibm.dbb.build.report.records.Record;
import java.util.Set;

public interface IRecordFilter
{
    IRecordFilter apply(final Set<String> p0);
    
    IRecordFilter and(final IRecordFilter p0);
    
    IRecordFilter or(final IRecordFilter p0);
    
    boolean shouldAddToReport(final Record p0);
    
    Set<String> getIncludedTypes();
}
