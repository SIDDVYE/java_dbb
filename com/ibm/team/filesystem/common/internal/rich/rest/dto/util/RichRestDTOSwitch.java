// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rich.rest.dto.util;

import com.ibm.team.filesystem.common.internal.rich.rest.dto.ContentStatusDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.RichRestDTOPackage;

public class RichRestDTOSwitch
{
    protected static RichRestDTOPackage modelPackage;
    
    public RichRestDTOSwitch() {
        if (RichRestDTOSwitch.modelPackage == null) {
            RichRestDTOSwitch.modelPackage = RichRestDTOPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == RichRestDTOSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final ContentStatusDTO contentStatusDTO = (ContentStatusDTO)theEObject;
                Object result = this.caseContentStatusDTO(contentStatusDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            default: {
                return this.defaultCase(theEObject);
            }
        }
    }
    
    public Object caseContentStatusDTO(final ContentStatusDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
