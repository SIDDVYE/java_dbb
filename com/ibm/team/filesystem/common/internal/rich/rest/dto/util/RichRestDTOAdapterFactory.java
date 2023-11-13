// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rich.rest.dto.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.ContentStatusDTO;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.RichRestDTOPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class RichRestDTOAdapterFactory extends AdapterFactoryImpl
{
    protected static RichRestDTOPackage modelPackage;
    protected RichRestDTOSwitch modelSwitch;
    
    public RichRestDTOAdapterFactory() {
        this.modelSwitch = new RichRestDTOSwitch() {
            @Override
            public Object caseContentStatusDTO(final ContentStatusDTO object) {
                return RichRestDTOAdapterFactory.this.createContentStatusDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return RichRestDTOAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (RichRestDTOAdapterFactory.modelPackage == null) {
            RichRestDTOAdapterFactory.modelPackage = RichRestDTOPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == RichRestDTOAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == RichRestDTOAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createContentStatusDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
