// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict.util;

import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveWithProposedEvaluationDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FailedMergeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ConflictedChangeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveAutoMergeResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveAsMergedResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveWithProposedResultDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FilesystemRestClientDTOconflictPackage;

public class FilesystemRestClientDTOconflictSwitch
{
    protected static FilesystemRestClientDTOconflictPackage modelPackage;
    
    public FilesystemRestClientDTOconflictSwitch() {
        if (FilesystemRestClientDTOconflictSwitch.modelPackage == null) {
            FilesystemRestClientDTOconflictSwitch.modelPackage = FilesystemRestClientDTOconflictPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOconflictSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final ResolveWithProposedResultDTO resolveWithProposedResultDTO = (ResolveWithProposedResultDTO)theEObject;
                Object result = this.caseResolveWithProposedResultDTO(resolveWithProposedResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final ResolveAsMergedResultDTO resolveAsMergedResultDTO = (ResolveAsMergedResultDTO)theEObject;
                Object result = this.caseResolveAsMergedResultDTO(resolveAsMergedResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final ResolveAutoMergeResultDTO resolveAutoMergeResultDTO = (ResolveAutoMergeResultDTO)theEObject;
                Object result = this.caseResolveAutoMergeResultDTO(resolveAutoMergeResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final ConflictedChangeDTO conflictedChangeDTO = (ConflictedChangeDTO)theEObject;
                Object result = this.caseConflictedChangeDTO(conflictedChangeDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final FailedMergeDTO failedMergeDTO = (FailedMergeDTO)theEObject;
                Object result = this.caseFailedMergeDTO(failedMergeDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final ResolveWithProposedEvaluationDTO resolveWithProposedEvaluationDTO = (ResolveWithProposedEvaluationDTO)theEObject;
                Object result = this.caseResolveWithProposedEvaluationDTO(resolveWithProposedEvaluationDTO);
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
    
    public Object caseResolveWithProposedResultDTO(final ResolveWithProposedResultDTO object) {
        return null;
    }
    
    public Object caseResolveAsMergedResultDTO(final ResolveAsMergedResultDTO object) {
        return null;
    }
    
    public Object caseResolveAutoMergeResultDTO(final ResolveAutoMergeResultDTO object) {
        return null;
    }
    
    public Object caseConflictedChangeDTO(final ConflictedChangeDTO object) {
        return null;
    }
    
    public Object caseFailedMergeDTO(final FailedMergeDTO object) {
        return null;
    }
    
    public Object caseResolveWithProposedEvaluationDTO(final ResolveWithProposedEvaluationDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
