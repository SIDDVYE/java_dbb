// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict;

import com.ibm.team.filesystem.common.internal.rest.client.conflict.impl.FilesystemRestClientDTOconflictFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOconflictFactory extends EFactory
{
    public static final FilesystemRestClientDTOconflictFactory eINSTANCE = FilesystemRestClientDTOconflictFactoryImpl.init();
    
    ResolveWithProposedResultDTO createResolveWithProposedResultDTO();
    
    ResolveAsMergedResultDTO createResolveAsMergedResultDTO();
    
    ResolveAutoMergeResultDTO createResolveAutoMergeResultDTO();
    
    ConflictedChangeDTO createConflictedChangeDTO();
    
    FailedMergeDTO createFailedMergeDTO();
    
    ResolveWithProposedEvaluationDTO createResolveWithProposedEvaluationDTO();
    
    FilesystemRestClientDTOconflictPackage getFilesystemRestClientDTOconflictPackage();
}
