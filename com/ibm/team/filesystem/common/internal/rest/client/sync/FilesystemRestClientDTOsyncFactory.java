// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync;

import com.ibm.team.filesystem.common.internal.rest.client.sync.impl.FilesystemRestClientDTOsyncFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOsyncFactory extends EFactory
{
    public static final FilesystemRestClientDTOsyncFactory eINSTANCE = FilesystemRestClientDTOsyncFactoryImpl.init();
    
    SyncViewDTO createSyncViewDTO();
    
    WorkspaceSyncDTO createWorkspaceSyncDTO();
    
    ComponentSyncDTO createComponentSyncDTO();
    
    BaselineSyncDTO createBaselineSyncDTO();
    
    ChangeSetSyncDTO createChangeSetSyncDTO();
    
    WorkItemSyncDTO createWorkItemSyncDTO();
    
    ChangeFolderSyncDTO createChangeFolderSyncDTO();
    
    ChangeSyncDTO createChangeSyncDTO();
    
    UnresolvedFolderSyncDTO createUnresolvedFolderSyncDTO();
    
    ConflictSyncDTO createConflictSyncDTO();
    
    LocalChangeSyncDTO createLocalChangeSyncDTO();
    
    CESyncDTO createCESyncDTO();
    
    CEComponentSyncDTO createCEComponentSyncDTO();
    
    CEBaselineSyncDTO createCEBaselineSyncDTO();
    
    DescriptionSyncDTO createDescriptionSyncDTO();
    
    DescriptionItemSyncDTO createDescriptionItemSyncDTO();
    
    PendingPatchesDTO createPendingPatchesDTO();
    
    SyncViewFiltersDTO createSyncViewFiltersDTO();
    
    MergePatchDTO createMergePatchDTO();
    
    AcceptAsPatchDTO createAcceptAsPatchDTO();
    
    GetBaselinesDTO createGetBaselinesDTO();
    
    BaselineHistoryEntryDTO createBaselineHistoryEntryDTO();
    
    SameOccurrenceSyncDTO createSameOccurrenceSyncDTO();
    
    SameOccurrencesSyncDTO createSameOccurrencesSyncDTO();
    
    GetBaselineSetsDTO createGetBaselineSetsDTO();
    
    OutOfSyncWorkspaceDTO createOutOfSyncWorkspaceDTO();
    
    OutOfSyncWorkspacesDTO createOutOfSyncWorkspacesDTO();
    
    OutOfSyncComponentDTO createOutOfSyncComponentDTO();
    
    VerifyInSyncResultDTO createVerifyInSyncResultDTO();
    
    OslcLinkDTO createOslcLinkDTO();
    
    SyncStatusDTO createSyncStatusDTO();
    
    FilesystemRestClientDTOsyncPackage getFilesystemRestClientDTOsyncPackage();
}
