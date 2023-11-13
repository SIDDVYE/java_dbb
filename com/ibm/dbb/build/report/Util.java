// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report;

import com.ibm.dbb.build.report.records.RecordFactoryManager;
import com.ibm.dbb.build.report.records.Reference;

public class Util
{
    public static Reference createReference(final String refType, final String refId) {
        return createReference(null, refType, refId);
    }
    
    public static Reference createReference(final String id, final String refType, final String refId) {
        final Reference reference = new Reference((id == null) ? RecordFactoryManager.getInstance().getNextId("REFERENCE") : id);
        reference.setRefId(refId);
        reference.setRefType(refType);
        return reference;
    }
}
