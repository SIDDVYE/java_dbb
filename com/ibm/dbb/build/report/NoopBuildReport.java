// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report;

import com.ibm.dbb.build.report.records.Record;
import java.util.ArrayList;

public class NoopBuildReport extends BuildReport
{
    protected NoopBuildReport() {
        this.records = new ArrayList<Record>(0);
    }
    
    @Override
    public final void addRecord(final Record record) {
    }
}
