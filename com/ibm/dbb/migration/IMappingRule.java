// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.migration;

import java.io.IOException;
import java.util.List;

public interface IMappingRule
{
    List<MappingInfo> generateMapping(final String p0) throws IOException;
}
