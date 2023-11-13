// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict.impl;

import com.ibm.team.filesystem.common.internal.rest.client.conflict.FilesystemRestClientDTOconflictPackage;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveWithProposedEvaluationDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FailedMergeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ConflictedChangeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveAutoMergeResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveAsMergedResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveWithProposedResultDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FilesystemRestClientDTOconflictFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOconflictFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOconflictFactory
{
    public static FilesystemRestClientDTOconflictFactory init() {
        try {
            final FilesystemRestClientDTOconflictFactory theFilesystemRestClientDTOconflictFactory = (FilesystemRestClientDTOconflictFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.conflict");
            if (theFilesystemRestClientDTOconflictFactory != null) {
                return theFilesystemRestClientDTOconflictFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOconflictFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createResolveWithProposedResultDTO();
            }
            case 1: {
                return (EObject)this.createResolveAsMergedResultDTO();
            }
            case 2: {
                return (EObject)this.createResolveAutoMergeResultDTO();
            }
            case 3: {
                return (EObject)this.createConflictedChangeDTO();
            }
            case 4: {
                return (EObject)this.createFailedMergeDTO();
            }
            case 5: {
                return (EObject)this.createResolveWithProposedEvaluationDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public ResolveWithProposedResultDTO createResolveWithProposedResultDTO() {
        final ResolveWithProposedResultDTOImpl resolveWithProposedResultDTO = new ResolveWithProposedResultDTOImpl();
        return resolveWithProposedResultDTO;
    }
    
    public ResolveAsMergedResultDTO createResolveAsMergedResultDTO() {
        final ResolveAsMergedResultDTOImpl resolveAsMergedResultDTO = new ResolveAsMergedResultDTOImpl();
        return resolveAsMergedResultDTO;
    }
    
    public ResolveAutoMergeResultDTO createResolveAutoMergeResultDTO() {
        final ResolveAutoMergeResultDTOImpl resolveAutoMergeResultDTO = new ResolveAutoMergeResultDTOImpl();
        return resolveAutoMergeResultDTO;
    }
    
    public ConflictedChangeDTO createConflictedChangeDTO() {
        final ConflictedChangeDTOImpl conflictedChangeDTO = new ConflictedChangeDTOImpl();
        return conflictedChangeDTO;
    }
    
    public FailedMergeDTO createFailedMergeDTO() {
        final FailedMergeDTOImpl failedMergeDTO = new FailedMergeDTOImpl();
        return failedMergeDTO;
    }
    
    public ResolveWithProposedEvaluationDTO createResolveWithProposedEvaluationDTO() {
        final ResolveWithProposedEvaluationDTOImpl resolveWithProposedEvaluationDTO = new ResolveWithProposedEvaluationDTOImpl();
        return resolveWithProposedEvaluationDTO;
    }
    
    public FilesystemRestClientDTOconflictPackage getFilesystemRestClientDTOconflictPackage() {
        return (FilesystemRestClientDTOconflictPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOconflictPackage getPackage() {
        return FilesystemRestClientDTOconflictPackage.eINSTANCE;
    }
}
