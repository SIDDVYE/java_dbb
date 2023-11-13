// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core.util;

import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.ServiceReport;
import java.util.Map;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.CompatabilityDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.LifecycleRestClientDTOPackage;

public class LifecycleRestClientDTOSwitch
{
    protected static LifecycleRestClientDTOPackage modelPackage;
    
    public LifecycleRestClientDTOSwitch() {
        if (LifecycleRestClientDTOSwitch.modelPackage == null) {
            LifecycleRestClientDTOSwitch.modelPackage = LifecycleRestClientDTOPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == LifecycleRestClientDTOSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final CompatabilityDTO compatabilityDTO = (CompatabilityDTO)theEObject;
                Object result = this.caseCompatabilityDTO(compatabilityDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final Map.Entry serviceEntry = (Map.Entry)theEObject;
                Object result = this.caseServiceEntry(serviceEntry);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final ServiceReport serviceReport = (ServiceReport)theEObject;
                Object result = this.caseServiceReport(serviceReport);
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
    
    public Object caseCompatabilityDTO(final CompatabilityDTO object) {
        return null;
    }
    
    public Object caseServiceEntry(final Map.Entry object) {
        return null;
    }
    
    public Object caseServiceReport(final ServiceReport object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
