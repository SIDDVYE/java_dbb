// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest2.dto.util;

import com.ibm.team.repository.common.IHelper;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.filesystem.common.internal.rest2.dto.CheckInStatePlusDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest2.dto.Rest2DTOPackage;

public class Rest2DTOSwitch
{
    protected static Rest2DTOPackage modelPackage;
    
    public Rest2DTOSwitch() {
        if (Rest2DTOSwitch.modelPackage == null) {
            Rest2DTOSwitch.modelPackage = Rest2DTOPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == Rest2DTOSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final CheckInStatePlusDTO checkInStatePlusDTO = (CheckInStatePlusDTO)theEObject;
                Object result = this.caseCheckInStatePlusDTO(checkInStatePlusDTO);
                if (result == null) {
                    result = this.caseHelper((Helper)checkInStatePlusDTO);
                }
                if (result == null) {
                    result = this.caseHelperFacade((IHelper)checkInStatePlusDTO);
                }
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
    
    public Object caseCheckInStatePlusDTO(final CheckInStatePlusDTO object) {
        return null;
    }
    
    public Object caseHelperFacade(final IHelper object) {
        return null;
    }
    
    public Object caseHelper(final Helper object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
