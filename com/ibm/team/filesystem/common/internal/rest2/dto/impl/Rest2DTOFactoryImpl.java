// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest2.dto.impl;

import com.ibm.team.filesystem.common.internal.rest2.dto.Rest2DTOPackage;
import com.ibm.team.filesystem.common.internal.rest2.dto.CheckInStatePlusDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest2.dto.Rest2DTOFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class Rest2DTOFactoryImpl extends EFactoryImpl implements Rest2DTOFactory
{
    public static Rest2DTOFactory init() {
        try {
            final Rest2DTOFactory theRest2DTOFactory = (Rest2DTOFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest2.dto");
            if (theRest2DTOFactory != null) {
                return theRest2DTOFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new Rest2DTOFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createCheckInStatePlusDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public CheckInStatePlusDTO createCheckInStatePlusDTO() {
        final CheckInStatePlusDTOImpl checkInStatePlusDTO = new CheckInStatePlusDTOImpl();
        return checkInStatePlusDTO;
    }
    
    public Rest2DTOPackage getRest2DTOPackage() {
        return (Rest2DTOPackage)this.getEPackage();
    }
    
    @Deprecated
    public static Rest2DTOPackage getPackage() {
        return Rest2DTOPackage.eINSTANCE;
    }
}
