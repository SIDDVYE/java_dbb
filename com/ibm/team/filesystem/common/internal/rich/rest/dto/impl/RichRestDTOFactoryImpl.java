// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rich.rest.dto.impl;

import com.ibm.team.filesystem.common.internal.rich.rest.dto.RichRestDTOPackage;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.ContentStatusDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.RichRestDTOFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class RichRestDTOFactoryImpl extends EFactoryImpl implements RichRestDTOFactory
{
    public static RichRestDTOFactory init() {
        try {
            final RichRestDTOFactory theRichRestDTOFactory = (RichRestDTOFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rich.rest.dto");
            if (theRichRestDTOFactory != null) {
                return theRichRestDTOFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new RichRestDTOFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createContentStatusDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public ContentStatusDTO createContentStatusDTO() {
        final ContentStatusDTOImpl contentStatusDTO = new ContentStatusDTOImpl();
        return contentStatusDTO;
    }
    
    public RichRestDTOPackage getRichRestDTOPackage() {
        return (RichRestDTOPackage)this.getEPackage();
    }
    
    @Deprecated
    public static RichRestDTOPackage getPackage() {
        return RichRestDTOPackage.eINSTANCE;
    }
}
