// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share.util;

import com.ibm.team.filesystem.common.internal.rest.client.share.MultipleSandboxShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareOverlapDTO;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareResultDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;

public class FilesystemRestClientDTOshareSwitch
{
    protected static FilesystemRestClientDTOsharePackage modelPackage;
    
    public FilesystemRestClientDTOshareSwitch() {
        if (FilesystemRestClientDTOshareSwitch.modelPackage == null) {
            FilesystemRestClientDTOshareSwitch.modelPackage = FilesystemRestClientDTOsharePackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOshareSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final ShareResultDTO shareResultDTO = (ShareResultDTO)theEObject;
                Object result = this.caseShareResultDTO(shareResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final ShareOverlapDTO shareOverlapDTO = (ShareOverlapDTO)theEObject;
                Object result = this.caseShareOverlapDTO(shareOverlapDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final MultipleSandboxShareDTO multipleSandboxShareDTO = (MultipleSandboxShareDTO)theEObject;
                Object result = this.caseMultipleSandboxShareDTO(multipleSandboxShareDTO);
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
    
    public Object caseShareResultDTO(final ShareResultDTO object) {
        return null;
    }
    
    public Object caseShareOverlapDTO(final ShareOverlapDTO object) {
        return null;
    }
    
    public Object caseMultipleSandboxShareDTO(final MultipleSandboxShareDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
