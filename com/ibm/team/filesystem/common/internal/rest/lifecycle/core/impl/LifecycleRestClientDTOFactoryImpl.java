// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core.impl;

import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.LifecycleRestClientDTOPackage;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.ServiceReport;
import java.util.Map;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.CompatabilityDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.LifecycleRestClientDTOFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class LifecycleRestClientDTOFactoryImpl extends EFactoryImpl implements LifecycleRestClientDTOFactory
{
    public static LifecycleRestClientDTOFactory init() {
        try {
            final LifecycleRestClientDTOFactory theLifecycleRestClientDTOFactory = (LifecycleRestClientDTOFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.lifecycle.core");
            if (theLifecycleRestClientDTOFactory != null) {
                return theLifecycleRestClientDTOFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new LifecycleRestClientDTOFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createCompatabilityDTO();
            }
            case 1: {
                return (EObject)this.createServiceEntry();
            }
            case 2: {
                return (EObject)this.createServiceReport();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public CompatabilityDTO createCompatabilityDTO() {
        final CompatabilityDTOImpl compatabilityDTO = new CompatabilityDTOImpl();
        return compatabilityDTO;
    }
    
    public Map.Entry createServiceEntry() {
        final ServiceEntryImpl serviceEntry = new ServiceEntryImpl();
        return (Map.Entry)serviceEntry;
    }
    
    public ServiceReport createServiceReport() {
        final ServiceReportImpl serviceReport = new ServiceReportImpl();
        return serviceReport;
    }
    
    public LifecycleRestClientDTOPackage getLifecycleRestClientDTOPackage() {
        return (LifecycleRestClientDTOPackage)this.getEPackage();
    }
    
    @Deprecated
    public static LifecycleRestClientDTOPackage getPackage() {
        return LifecycleRestClientDTOPackage.eINSTANCE;
    }
}
