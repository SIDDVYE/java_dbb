// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.compress.parallel;

import java.io.IOException;

public interface ScatterGatherBackingStoreSupplier
{
    ScatterGatherBackingStore get() throws IOException;
}
