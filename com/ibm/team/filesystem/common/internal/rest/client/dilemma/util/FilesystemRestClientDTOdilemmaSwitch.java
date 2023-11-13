// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma.util;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;

public class FilesystemRestClientDTOdilemmaSwitch
{
    protected static FilesystemRestClientDTOdilemmaPackage modelPackage;
    
    public FilesystemRestClientDTOdilemmaSwitch() {
        if (FilesystemRestClientDTOdilemmaSwitch.modelPackage == null) {
            FilesystemRestClientDTOdilemmaSwitch.modelPackage = FilesystemRestClientDTOdilemmaPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOdilemmaSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final SandboxUpdateDilemmaDTO sandboxUpdateDilemmaDTO = (SandboxUpdateDilemmaDTO)theEObject;
                Object result = this.caseSandboxUpdateDilemmaDTO(sandboxUpdateDilemmaDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final CommitDilemmaDTO commitDilemmaDTO = (CommitDilemmaDTO)theEObject;
                Object result = this.caseCommitDilemmaDTO(commitDilemmaDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final UpdateDilemmaDTO updateDilemmaDTO = (UpdateDilemmaDTO)theEObject;
                Object result = this.caseUpdateDilemmaDTO(updateDilemmaDTO);
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
    
    public Object caseSandboxUpdateDilemmaDTO(final SandboxUpdateDilemmaDTO object) {
        return null;
    }
    
    public Object caseCommitDilemmaDTO(final CommitDilemmaDTO object) {
        return null;
    }
    
    public Object caseUpdateDilemmaDTO(final UpdateDilemmaDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
