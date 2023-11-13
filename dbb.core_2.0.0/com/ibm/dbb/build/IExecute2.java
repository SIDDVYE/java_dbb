// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import java.util.concurrent.TimeUnit;

public interface IExecute2 extends IExecute
{
    int executeAndWaitFor(final int p0, final TimeUnit p1) throws BuildException;
}
