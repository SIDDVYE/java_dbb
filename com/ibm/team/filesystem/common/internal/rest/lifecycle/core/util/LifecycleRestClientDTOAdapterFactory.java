// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.ServiceReport;
import java.util.Map;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.CompatabilityDTO;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.LifecycleRestClientDTOPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class LifecycleRestClientDTOAdapterFactory extends AdapterFactoryImpl
{
    protected static LifecycleRestClientDTOPackage modelPackage;
    protected LifecycleRestClientDTOSwitch modelSwitch;
    
    public LifecycleRestClientDTOAdapterFactory() {
        this.modelSwitch = new LifecycleRestClientDTOSwitch() {
            @Override
            public Object caseCompatabilityDTO(final CompatabilityDTO object) {
                return LifecycleRestClientDTOAdapterFactory.this.createCompatabilityDTOAdapter();
            }
            
            @Override
            public Object caseServiceEntry(final Map.Entry object) {
                return LifecycleRestClientDTOAdapterFactory.this.createServiceEntryAdapter();
            }
            
            @Override
            public Object caseServiceReport(final ServiceReport object) {
                return LifecycleRestClientDTOAdapterFactory.this.createServiceReportAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return LifecycleRestClientDTOAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (LifecycleRestClientDTOAdapterFactory.modelPackage == null) {
            LifecycleRestClientDTOAdapterFactory.modelPackage = LifecycleRestClientDTOPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == LifecycleRestClientDTOAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == LifecycleRestClientDTOAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createCompatabilityDTOAdapter() {
        return null;
    }
    
    public Adapter createServiceEntryAdapter() {
        return null;
    }
    
    public Adapter createServiceReportAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
