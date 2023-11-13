// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest2.dto.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.repository.common.IHelper;
import com.ibm.team.filesystem.common.internal.rest2.dto.CheckInStatePlusDTO;
import com.ibm.team.filesystem.common.internal.rest2.dto.Rest2DTOPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class Rest2DTOAdapterFactory extends AdapterFactoryImpl
{
    protected static Rest2DTOPackage modelPackage;
    protected Rest2DTOSwitch modelSwitch;
    
    public Rest2DTOAdapterFactory() {
        this.modelSwitch = new Rest2DTOSwitch() {
            @Override
            public Object caseCheckInStatePlusDTO(final CheckInStatePlusDTO object) {
                return Rest2DTOAdapterFactory.this.createCheckInStatePlusDTOAdapter();
            }
            
            @Override
            public Object caseHelperFacade(final IHelper object) {
                return Rest2DTOAdapterFactory.this.createHelperFacadeAdapter();
            }
            
            @Override
            public Object caseHelper(final Helper object) {
                return Rest2DTOAdapterFactory.this.createHelperAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return Rest2DTOAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (Rest2DTOAdapterFactory.modelPackage == null) {
            Rest2DTOAdapterFactory.modelPackage = Rest2DTOPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == Rest2DTOAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == Rest2DTOAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createCheckInStatePlusDTOAdapter() {
        return null;
    }
    
    public Adapter createHelperFacadeAdapter() {
        return null;
    }
    
    public Adapter createHelperAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
