// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load;

import com.ibm.team.filesystem.common.internal.rest.client.load.impl.FilesystemRestClientDTOloadFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOloadFactory extends EFactory
{
    public static final FilesystemRestClientDTOloadFactory eINSTANCE = FilesystemRestClientDTOloadFactoryImpl.init();
    
    LoadEvaluationDTO createLoadEvaluationDTO();
    
    LoadOverlapDTO createLoadOverlapDTO();
    
    RemovedShareDTO createRemovedShareDTO();
    
    CollisionDTO createCollisionDTO();
    
    LoadLocationDTO createLoadLocationDTO();
    
    ShareToLoadDTO createShareToLoadDTO();
    
    InvalidLoadRequestDTO createInvalidLoadRequestDTO();
    
    LoadFileOperationResultDTO createLoadFileOperationResultDTO();
    
    LoadFileResultDTO createLoadFileResultDTO();
    
    OverlappedItemDTO createOverlappedItemDTO();
    
    MultipleSandboxLoadDTO createMultipleSandboxLoadDTO();
    
    LoadResultDTO createLoadResultDTO();
    
    SandboxLoadRulesResultDTO createSandboxLoadRulesResultDTO();
    
    SandboxLoadRuleDTO createSandboxLoadRuleDTO();
    
    UnLoadResultDTO createUnLoadResultDTO();
    
    FilesystemRestClientDTOloadPackage getFilesystemRestClientDTOloadPackage();
}
