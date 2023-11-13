// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core;

import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.impl.LifecycleRestClientDTOFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface LifecycleRestClientDTOFactory extends EFactory
{
    public static final LifecycleRestClientDTOFactory eINSTANCE = LifecycleRestClientDTOFactoryImpl.init();
    
    CompatabilityDTO createCompatabilityDTO();
    
    ServiceReport createServiceReport();
    
    LifecycleRestClientDTOPackage getLifecycleRestClientDTOPackage();
}
