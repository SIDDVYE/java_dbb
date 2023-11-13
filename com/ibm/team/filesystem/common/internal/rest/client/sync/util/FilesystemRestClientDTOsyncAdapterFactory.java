// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
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
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOsyncAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOsyncPackage modelPackage;
    protected FilesystemRestClientDTOsyncSwitch modelSwitch;
    
    public FilesystemRestClientDTOsyncAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOsyncSwitch() {
            @Override
            public Object caseSyncViewDTO(final SyncViewDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createSyncViewDTOAdapter();
            }
            
            @Override
            public Object caseWorkspaceSyncDTO(final WorkspaceSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createWorkspaceSyncDTOAdapter();
            }
            
            @Override
            public Object caseComponentSyncDTO(final ComponentSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createComponentSyncDTOAdapter();
            }
            
            @Override
            public Object caseBaselineSyncDTO(final BaselineSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createBaselineSyncDTOAdapter();
            }
            
            @Override
            public Object caseChangeSetSyncDTO(final ChangeSetSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createChangeSetSyncDTOAdapter();
            }
            
            @Override
            public Object caseWorkItemSyncDTO(final WorkItemSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createWorkItemSyncDTOAdapter();
            }
            
            @Override
            public Object caseChangeFolderSyncDTO(final ChangeFolderSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createChangeFolderSyncDTOAdapter();
            }
            
            @Override
            public Object caseChangeSyncDTO(final ChangeSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createChangeSyncDTOAdapter();
            }
            
            @Override
            public Object caseUnresolvedFolderSyncDTO(final UnresolvedFolderSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createUnresolvedFolderSyncDTOAdapter();
            }
            
            @Override
            public Object caseConflictSyncDTO(final ConflictSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createConflictSyncDTOAdapter();
            }
            
            @Override
            public Object caseLocalChangeSyncDTO(final LocalChangeSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createLocalChangeSyncDTOAdapter();
            }
            
            @Override
            public Object caseCESyncDTO(final CESyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createCESyncDTOAdapter();
            }
            
            @Override
            public Object caseCEComponentSyncDTO(final CEComponentSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createCEComponentSyncDTOAdapter();
            }
            
            @Override
            public Object caseCEBaselineSyncDTO(final CEBaselineSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createCEBaselineSyncDTOAdapter();
            }
            
            @Override
            public Object caseDescriptionSyncDTO(final DescriptionSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createDescriptionSyncDTOAdapter();
            }
            
            @Override
            public Object caseDescriptionItemSyncDTO(final DescriptionItemSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createDescriptionItemSyncDTOAdapter();
            }
            
            @Override
            public Object casePendingPatchesDTO(final PendingPatchesDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createPendingPatchesDTOAdapter();
            }
            
            @Override
            public Object caseSyncViewFiltersDTO(final SyncViewFiltersDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createSyncViewFiltersDTOAdapter();
            }
            
            @Override
            public Object caseMergePatchDTO(final MergePatchDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createMergePatchDTOAdapter();
            }
            
            @Override
            public Object caseAcceptAsPatchDTO(final AcceptAsPatchDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createAcceptAsPatchDTOAdapter();
            }
            
            @Override
            public Object caseGetBaselinesDTO(final GetBaselinesDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createGetBaselinesDTOAdapter();
            }
            
            @Override
            public Object caseBaselineHistoryEntryDTO(final BaselineHistoryEntryDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createBaselineHistoryEntryDTOAdapter();
            }
            
            @Override
            public Object caseSameOccurrenceSyncDTO(final SameOccurrenceSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createSameOccurrenceSyncDTOAdapter();
            }
            
            @Override
            public Object caseSameOccurrencesSyncDTO(final SameOccurrencesSyncDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createSameOccurrencesSyncDTOAdapter();
            }
            
            @Override
            public Object caseGetBaselineSetsDTO(final GetBaselineSetsDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createGetBaselineSetsDTOAdapter();
            }
            
            @Override
            public Object caseOutOfSyncWorkspaceDTO(final OutOfSyncWorkspaceDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createOutOfSyncWorkspaceDTOAdapter();
            }
            
            @Override
            public Object caseOutOfSyncWorkspacesDTO(final OutOfSyncWorkspacesDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createOutOfSyncWorkspacesDTOAdapter();
            }
            
            @Override
            public Object caseOutOfSyncComponentDTO(final OutOfSyncComponentDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createOutOfSyncComponentDTOAdapter();
            }
            
            @Override
            public Object caseVerifyInSyncResultDTO(final VerifyInSyncResultDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createVerifyInSyncResultDTOAdapter();
            }
            
            @Override
            public Object caseOslcLinkDTO(final OslcLinkDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createOslcLinkDTOAdapter();
            }
            
            @Override
            public Object caseSyncStatusDTO(final SyncStatusDTO object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createSyncStatusDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOsyncAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOsyncAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOsyncAdapterFactory.modelPackage = FilesystemRestClientDTOsyncPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOsyncAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOsyncAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createSyncViewDTOAdapter() {
        return null;
    }
    
    public Adapter createWorkspaceSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createComponentSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createBaselineSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeSetSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createWorkItemSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeFolderSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createUnresolvedFolderSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createConflictSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createLocalChangeSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createCESyncDTOAdapter() {
        return null;
    }
    
    public Adapter createCEComponentSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createCEBaselineSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createDescriptionSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createDescriptionItemSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createPendingPatchesDTOAdapter() {
        return null;
    }
    
    public Adapter createSyncViewFiltersDTOAdapter() {
        return null;
    }
    
    public Adapter createMergePatchDTOAdapter() {
        return null;
    }
    
    public Adapter createAcceptAsPatchDTOAdapter() {
        return null;
    }
    
    public Adapter createGetBaselinesDTOAdapter() {
        return null;
    }
    
    public Adapter createBaselineHistoryEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createSameOccurrenceSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createSameOccurrencesSyncDTOAdapter() {
        return null;
    }
    
    public Adapter createGetBaselineSetsDTOAdapter() {
        return null;
    }
    
    public Adapter createOutOfSyncWorkspaceDTOAdapter() {
        return null;
    }
    
    public Adapter createOutOfSyncWorkspacesDTOAdapter() {
        return null;
    }
    
    public Adapter createOutOfSyncComponentDTOAdapter() {
        return null;
    }
    
    public Adapter createVerifyInSyncResultDTOAdapter() {
        return null;
    }
    
    public Adapter createOslcLinkDTOAdapter() {
        return null;
    }
    
    public Adapter createSyncStatusDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
