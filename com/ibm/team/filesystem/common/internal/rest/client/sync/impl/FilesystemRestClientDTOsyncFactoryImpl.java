// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SyncStatusDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OslcLinkDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.VerifyInSyncResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OutOfSyncComponentDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OutOfSyncWorkspacesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OutOfSyncWorkspaceDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.GetBaselineSetsDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SameOccurrencesSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SameOccurrenceSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.BaselineHistoryEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.GetBaselinesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.AcceptAsPatchDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.MergePatchDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SyncViewFiltersDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.PendingPatchesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.DescriptionItemSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.DescriptionSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.CEBaselineSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.CEComponentSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.CESyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.LocalChangeSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ConflictSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.UnresolvedFolderSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeFolderSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.WorkItemSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeSetSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.BaselineSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ComponentSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.WorkspaceSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SyncViewDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOsyncFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOsyncFactory
{
    public static FilesystemRestClientDTOsyncFactory init() {
        try {
            final FilesystemRestClientDTOsyncFactory theFilesystemRestClientDTOsyncFactory = (FilesystemRestClientDTOsyncFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.sync");
            if (theFilesystemRestClientDTOsyncFactory != null) {
                return theFilesystemRestClientDTOsyncFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOsyncFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createSyncViewDTO();
            }
            case 1: {
                return (EObject)this.createWorkspaceSyncDTO();
            }
            case 2: {
                return (EObject)this.createComponentSyncDTO();
            }
            case 3: {
                return (EObject)this.createBaselineSyncDTO();
            }
            case 4: {
                return (EObject)this.createChangeSetSyncDTO();
            }
            case 5: {
                return (EObject)this.createWorkItemSyncDTO();
            }
            case 6: {
                return (EObject)this.createChangeFolderSyncDTO();
            }
            case 7: {
                return (EObject)this.createChangeSyncDTO();
            }
            case 8: {
                return (EObject)this.createUnresolvedFolderSyncDTO();
            }
            case 9: {
                return (EObject)this.createConflictSyncDTO();
            }
            case 10: {
                return (EObject)this.createLocalChangeSyncDTO();
            }
            case 11: {
                return (EObject)this.createCESyncDTO();
            }
            case 12: {
                return (EObject)this.createCEComponentSyncDTO();
            }
            case 13: {
                return (EObject)this.createCEBaselineSyncDTO();
            }
            case 14: {
                return (EObject)this.createDescriptionSyncDTO();
            }
            case 15: {
                return (EObject)this.createDescriptionItemSyncDTO();
            }
            case 16: {
                return (EObject)this.createPendingPatchesDTO();
            }
            case 17: {
                return (EObject)this.createSyncViewFiltersDTO();
            }
            case 18: {
                return (EObject)this.createMergePatchDTO();
            }
            case 19: {
                return (EObject)this.createAcceptAsPatchDTO();
            }
            case 20: {
                return (EObject)this.createGetBaselinesDTO();
            }
            case 21: {
                return (EObject)this.createBaselineHistoryEntryDTO();
            }
            case 22: {
                return (EObject)this.createSameOccurrenceSyncDTO();
            }
            case 23: {
                return (EObject)this.createSameOccurrencesSyncDTO();
            }
            case 24: {
                return (EObject)this.createGetBaselineSetsDTO();
            }
            case 25: {
                return (EObject)this.createOutOfSyncWorkspaceDTO();
            }
            case 26: {
                return (EObject)this.createOutOfSyncWorkspacesDTO();
            }
            case 27: {
                return (EObject)this.createOutOfSyncComponentDTO();
            }
            case 28: {
                return (EObject)this.createVerifyInSyncResultDTO();
            }
            case 29: {
                return (EObject)this.createOslcLinkDTO();
            }
            case 30: {
                return (EObject)this.createSyncStatusDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public SyncViewDTO createSyncViewDTO() {
        final SyncViewDTOImpl syncViewDTO = new SyncViewDTOImpl();
        return syncViewDTO;
    }
    
    public WorkspaceSyncDTO createWorkspaceSyncDTO() {
        final WorkspaceSyncDTOImpl workspaceSyncDTO = new WorkspaceSyncDTOImpl();
        return workspaceSyncDTO;
    }
    
    public ComponentSyncDTO createComponentSyncDTO() {
        final ComponentSyncDTOImpl componentSyncDTO = new ComponentSyncDTOImpl();
        return componentSyncDTO;
    }
    
    public BaselineSyncDTO createBaselineSyncDTO() {
        final BaselineSyncDTOImpl baselineSyncDTO = new BaselineSyncDTOImpl();
        return baselineSyncDTO;
    }
    
    public ChangeSetSyncDTO createChangeSetSyncDTO() {
        final ChangeSetSyncDTOImpl changeSetSyncDTO = new ChangeSetSyncDTOImpl();
        return changeSetSyncDTO;
    }
    
    public WorkItemSyncDTO createWorkItemSyncDTO() {
        final WorkItemSyncDTOImpl workItemSyncDTO = new WorkItemSyncDTOImpl();
        return workItemSyncDTO;
    }
    
    public ChangeFolderSyncDTO createChangeFolderSyncDTO() {
        final ChangeFolderSyncDTOImpl changeFolderSyncDTO = new ChangeFolderSyncDTOImpl();
        return changeFolderSyncDTO;
    }
    
    public ChangeSyncDTO createChangeSyncDTO() {
        final ChangeSyncDTOImpl changeSyncDTO = new ChangeSyncDTOImpl();
        return changeSyncDTO;
    }
    
    public UnresolvedFolderSyncDTO createUnresolvedFolderSyncDTO() {
        final UnresolvedFolderSyncDTOImpl unresolvedFolderSyncDTO = new UnresolvedFolderSyncDTOImpl();
        return unresolvedFolderSyncDTO;
    }
    
    public ConflictSyncDTO createConflictSyncDTO() {
        final ConflictSyncDTOImpl conflictSyncDTO = new ConflictSyncDTOImpl();
        return conflictSyncDTO;
    }
    
    public LocalChangeSyncDTO createLocalChangeSyncDTO() {
        final LocalChangeSyncDTOImpl localChangeSyncDTO = new LocalChangeSyncDTOImpl();
        return localChangeSyncDTO;
    }
    
    public CESyncDTO createCESyncDTO() {
        final CESyncDTOImpl ceSyncDTO = new CESyncDTOImpl();
        return ceSyncDTO;
    }
    
    public CEComponentSyncDTO createCEComponentSyncDTO() {
        final CEComponentSyncDTOImpl ceComponentSyncDTO = new CEComponentSyncDTOImpl();
        return ceComponentSyncDTO;
    }
    
    public CEBaselineSyncDTO createCEBaselineSyncDTO() {
        final CEBaselineSyncDTOImpl ceBaselineSyncDTO = new CEBaselineSyncDTOImpl();
        return ceBaselineSyncDTO;
    }
    
    public DescriptionSyncDTO createDescriptionSyncDTO() {
        final DescriptionSyncDTOImpl descriptionSyncDTO = new DescriptionSyncDTOImpl();
        return descriptionSyncDTO;
    }
    
    public DescriptionItemSyncDTO createDescriptionItemSyncDTO() {
        final DescriptionItemSyncDTOImpl descriptionItemSyncDTO = new DescriptionItemSyncDTOImpl();
        return descriptionItemSyncDTO;
    }
    
    public PendingPatchesDTO createPendingPatchesDTO() {
        final PendingPatchesDTOImpl pendingPatchesDTO = new PendingPatchesDTOImpl();
        return pendingPatchesDTO;
    }
    
    public SyncViewFiltersDTO createSyncViewFiltersDTO() {
        final SyncViewFiltersDTOImpl syncViewFiltersDTO = new SyncViewFiltersDTOImpl();
        return syncViewFiltersDTO;
    }
    
    public MergePatchDTO createMergePatchDTO() {
        final MergePatchDTOImpl mergePatchDTO = new MergePatchDTOImpl();
        return mergePatchDTO;
    }
    
    public AcceptAsPatchDTO createAcceptAsPatchDTO() {
        final AcceptAsPatchDTOImpl acceptAsPatchDTO = new AcceptAsPatchDTOImpl();
        return acceptAsPatchDTO;
    }
    
    public GetBaselinesDTO createGetBaselinesDTO() {
        final GetBaselinesDTOImpl getBaselinesDTO = new GetBaselinesDTOImpl();
        return getBaselinesDTO;
    }
    
    public BaselineHistoryEntryDTO createBaselineHistoryEntryDTO() {
        final BaselineHistoryEntryDTOImpl baselineHistoryEntryDTO = new BaselineHistoryEntryDTOImpl();
        return baselineHistoryEntryDTO;
    }
    
    public SameOccurrenceSyncDTO createSameOccurrenceSyncDTO() {
        final SameOccurrenceSyncDTOImpl sameOccurrenceSyncDTO = new SameOccurrenceSyncDTOImpl();
        return sameOccurrenceSyncDTO;
    }
    
    public SameOccurrencesSyncDTO createSameOccurrencesSyncDTO() {
        final SameOccurrencesSyncDTOImpl sameOccurrencesSyncDTO = new SameOccurrencesSyncDTOImpl();
        return sameOccurrencesSyncDTO;
    }
    
    public GetBaselineSetsDTO createGetBaselineSetsDTO() {
        final GetBaselineSetsDTOImpl getBaselineSetsDTO = new GetBaselineSetsDTOImpl();
        return getBaselineSetsDTO;
    }
    
    public OutOfSyncWorkspaceDTO createOutOfSyncWorkspaceDTO() {
        final OutOfSyncWorkspaceDTOImpl outOfSyncWorkspaceDTO = new OutOfSyncWorkspaceDTOImpl();
        return outOfSyncWorkspaceDTO;
    }
    
    public OutOfSyncWorkspacesDTO createOutOfSyncWorkspacesDTO() {
        final OutOfSyncWorkspacesDTOImpl outOfSyncWorkspacesDTO = new OutOfSyncWorkspacesDTOImpl();
        return outOfSyncWorkspacesDTO;
    }
    
    public OutOfSyncComponentDTO createOutOfSyncComponentDTO() {
        final OutOfSyncComponentDTOImpl outOfSyncComponentDTO = new OutOfSyncComponentDTOImpl();
        return outOfSyncComponentDTO;
    }
    
    public VerifyInSyncResultDTO createVerifyInSyncResultDTO() {
        final VerifyInSyncResultDTOImpl verifyInSyncResultDTO = new VerifyInSyncResultDTOImpl();
        return verifyInSyncResultDTO;
    }
    
    public OslcLinkDTO createOslcLinkDTO() {
        final OslcLinkDTOImpl oslcLinkDTO = new OslcLinkDTOImpl();
        return oslcLinkDTO;
    }
    
    public SyncStatusDTO createSyncStatusDTO() {
        final SyncStatusDTOImpl syncStatusDTO = new SyncStatusDTOImpl();
        return syncStatusDTO;
    }
    
    public FilesystemRestClientDTOsyncPackage getFilesystemRestClientDTOsyncPackage() {
        return (FilesystemRestClientDTOsyncPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOsyncPackage getPackage() {
        return FilesystemRestClientDTOsyncPackage.eINSTANCE;
    }
}
