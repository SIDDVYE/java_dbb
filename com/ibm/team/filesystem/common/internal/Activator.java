// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import org.osgi.framework.BundleContext;
import org.eclipse.core.runtime.Plugin;

public class Activator extends Plugin
{
    private static BundleContext bundlContext;
    
    public static BundleContext getBundleContext() {
        return Activator.bundlContext;
    }
    
    public void stop(final BundleContext context) throws Exception {
        Activator.bundlContext = null;
    }
    
    public void start(final BundleContext context) throws Exception {
        Activator.bundlContext = context;
    }
}
