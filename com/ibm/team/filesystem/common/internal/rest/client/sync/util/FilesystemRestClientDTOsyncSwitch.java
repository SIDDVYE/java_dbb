// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.util;

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
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;

public class FilesystemRestClientDTOsyncSwitch
{
    protected static FilesystemRestClientDTOsyncPackage modelPackage;
    
    public FilesystemRestClientDTOsyncSwitch() {
        if (FilesystemRestClientDTOsyncSwitch.modelPackage == null) {
            FilesystemRestClientDTOsyncSwitch.modelPackage = FilesystemRestClientDTOsyncPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOsyncSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final SyncViewDTO syncViewDTO = (SyncViewDTO)theEObject;
                Object result = this.caseSyncViewDTO(syncViewDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final WorkspaceSyncDTO workspaceSyncDTO = (WorkspaceSyncDTO)theEObject;
                Object result = this.caseWorkspaceSyncDTO(workspaceSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final ComponentSyncDTO componentSyncDTO = (ComponentSyncDTO)theEObject;
                Object result = this.caseComponentSyncDTO(componentSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final BaselineSyncDTO baselineSyncDTO = (BaselineSyncDTO)theEObject;
                Object result = this.caseBaselineSyncDTO(baselineSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final ChangeSetSyncDTO changeSetSyncDTO = (ChangeSetSyncDTO)theEObject;
                Object result = this.caseChangeSetSyncDTO(changeSetSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final WorkItemSyncDTO workItemSyncDTO = (WorkItemSyncDTO)theEObject;
                Object result = this.caseWorkItemSyncDTO(workItemSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final ChangeFolderSyncDTO changeFolderSyncDTO = (ChangeFolderSyncDTO)theEObject;
                Object result = this.caseChangeFolderSyncDTO(changeFolderSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final ChangeSyncDTO changeSyncDTO = (ChangeSyncDTO)theEObject;
                Object result = this.caseChangeSyncDTO(changeSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 8: {
                final UnresolvedFolderSyncDTO unresolvedFolderSyncDTO = (UnresolvedFolderSyncDTO)theEObject;
                Object result = this.caseUnresolvedFolderSyncDTO(unresolvedFolderSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 9: {
                final ConflictSyncDTO conflictSyncDTO = (ConflictSyncDTO)theEObject;
                Object result = this.caseConflictSyncDTO(conflictSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 10: {
                final LocalChangeSyncDTO localChangeSyncDTO = (LocalChangeSyncDTO)theEObject;
                Object result = this.caseLocalChangeSyncDTO(localChangeSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 11: {
                final CESyncDTO ceSyncDTO = (CESyncDTO)theEObject;
                Object result = this.caseCESyncDTO(ceSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 12: {
                final CEComponentSyncDTO ceComponentSyncDTO = (CEComponentSyncDTO)theEObject;
                Object result = this.caseCEComponentSyncDTO(ceComponentSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 13: {
                final CEBaselineSyncDTO ceBaselineSyncDTO = (CEBaselineSyncDTO)theEObject;
                Object result = this.caseCEBaselineSyncDTO(ceBaselineSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 14: {
                final DescriptionSyncDTO descriptionSyncDTO = (DescriptionSyncDTO)theEObject;
                Object result = this.caseDescriptionSyncDTO(descriptionSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 15: {
                final DescriptionItemSyncDTO descriptionItemSyncDTO = (DescriptionItemSyncDTO)theEObject;
                Object result = this.caseDescriptionItemSyncDTO(descriptionItemSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 16: {
                final PendingPatchesDTO pendingPatchesDTO = (PendingPatchesDTO)theEObject;
                Object result = this.casePendingPatchesDTO(pendingPatchesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 17: {
                final SyncViewFiltersDTO syncViewFiltersDTO = (SyncViewFiltersDTO)theEObject;
                Object result = this.caseSyncViewFiltersDTO(syncViewFiltersDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 18: {
                final MergePatchDTO mergePatchDTO = (MergePatchDTO)theEObject;
                Object result = this.caseMergePatchDTO(mergePatchDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 19: {
                final AcceptAsPatchDTO acceptAsPatchDTO = (AcceptAsPatchDTO)theEObject;
                Object result = this.caseAcceptAsPatchDTO(acceptAsPatchDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 20: {
                final GetBaselinesDTO getBaselinesDTO = (GetBaselinesDTO)theEObject;
                Object result = this.caseGetBaselinesDTO(getBaselinesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 21: {
                final BaselineHistoryEntryDTO baselineHistoryEntryDTO = (BaselineHistoryEntryDTO)theEObject;
                Object result = this.caseBaselineHistoryEntryDTO(baselineHistoryEntryDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 22: {
                final SameOccurrenceSyncDTO sameOccurrenceSyncDTO = (SameOccurrenceSyncDTO)theEObject;
                Object result = this.caseSameOccurrenceSyncDTO(sameOccurrenceSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 23: {
                final SameOccurrencesSyncDTO sameOccurrencesSyncDTO = (SameOccurrencesSyncDTO)theEObject;
                Object result = this.caseSameOccurrencesSyncDTO(sameOccurrencesSyncDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 24: {
                final GetBaselineSetsDTO getBaselineSetsDTO = (GetBaselineSetsDTO)theEObject;
                Object result = this.caseGetBaselineSetsDTO(getBaselineSetsDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 25: {
                final OutOfSyncWorkspaceDTO outOfSyncWorkspaceDTO = (OutOfSyncWorkspaceDTO)theEObject;
                Object result = this.caseOutOfSyncWorkspaceDTO(outOfSyncWorkspaceDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 26: {
                final OutOfSyncWorkspacesDTO outOfSyncWorkspacesDTO = (OutOfSyncWorkspacesDTO)theEObject;
                Object result = this.caseOutOfSyncWorkspacesDTO(outOfSyncWorkspacesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 27: {
                final OutOfSyncComponentDTO outOfSyncComponentDTO = (OutOfSyncComponentDTO)theEObject;
                Object result = this.caseOutOfSyncComponentDTO(outOfSyncComponentDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 28: {
                final VerifyInSyncResultDTO verifyInSyncResultDTO = (VerifyInSyncResultDTO)theEObject;
                Object result = this.caseVerifyInSyncResultDTO(verifyInSyncResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 29: {
                final OslcLinkDTO oslcLinkDTO = (OslcLinkDTO)theEObject;
                Object result = this.caseOslcLinkDTO(oslcLinkDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 30: {
                final SyncStatusDTO syncStatusDTO = (SyncStatusDTO)theEObject;
                Object result = this.caseSyncStatusDTO(syncStatusDTO);
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
    
    public Object caseSyncViewDTO(final SyncViewDTO object) {
        return null;
    }
    
    public Object caseWorkspaceSyncDTO(final WorkspaceSyncDTO object) {
        return null;
    }
    
    public Object caseComponentSyncDTO(final ComponentSyncDTO object) {
        return null;
    }
    
    public Object caseBaselineSyncDTO(final BaselineSyncDTO object) {
        return null;
    }
    
    public Object caseChangeSetSyncDTO(final ChangeSetSyncDTO object) {
        return null;
    }
    
    public Object caseWorkItemSyncDTO(final WorkItemSyncDTO object) {
        return null;
    }
    
    public Object caseChangeFolderSyncDTO(final ChangeFolderSyncDTO object) {
        return null;
    }
    
    public Object caseChangeSyncDTO(final ChangeSyncDTO object) {
        return null;
    }
    
    public Object caseUnresolvedFolderSyncDTO(final UnresolvedFolderSyncDTO object) {
        return null;
    }
    
    public Object caseConflictSyncDTO(final ConflictSyncDTO object) {
        return null;
    }
    
    public Object caseLocalChangeSyncDTO(final LocalChangeSyncDTO object) {
        return null;
    }
    
    public Object caseCESyncDTO(final CESyncDTO object) {
        return null;
    }
    
    public Object caseCEComponentSyncDTO(final CEComponentSyncDTO object) {
        return null;
    }
    
    public Object caseCEBaselineSyncDTO(final CEBaselineSyncDTO object) {
        return null;
    }
    
    public Object caseDescriptionSyncDTO(final DescriptionSyncDTO object) {
        return null;
    }
    
    public Object caseDescriptionItemSyncDTO(final DescriptionItemSyncDTO object) {
        return null;
    }
    
    public Object casePendingPatchesDTO(final PendingPatchesDTO object) {
        return null;
    }
    
    public Object caseSyncViewFiltersDTO(final SyncViewFiltersDTO object) {
        return null;
    }
    
    public Object caseMergePatchDTO(final MergePatchDTO object) {
        return null;
    }
    
    public Object caseAcceptAsPatchDTO(final AcceptAsPatchDTO object) {
        return null;
    }
    
    public Object caseGetBaselinesDTO(final GetBaselinesDTO object) {
        return null;
    }
    
    public Object caseBaselineHistoryEntryDTO(final BaselineHistoryEntryDTO object) {
        return null;
    }
    
    public Object caseSameOccurrenceSyncDTO(final SameOccurrenceSyncDTO object) {
        return null;
    }
    
    public Object caseSameOccurrencesSyncDTO(final SameOccurrencesSyncDTO object) {
        return null;
    }
    
    public Object caseGetBaselineSetsDTO(final GetBaselineSetsDTO object) {
        return null;
    }
    
    public Object caseOutOfSyncWorkspaceDTO(final OutOfSyncWorkspaceDTO object) {
        return null;
    }
    
    public Object caseOutOfSyncWorkspacesDTO(final OutOfSyncWorkspacesDTO object) {
        return null;
    }
    
    public Object caseOutOfSyncComponentDTO(final OutOfSyncComponentDTO object) {
        return null;
    }
    
    public Object caseVerifyInSyncResultDTO(final VerifyInSyncResultDTO object) {
        return null;
    }
    
    public Object caseOslcLinkDTO(final OslcLinkDTO object) {
        return null;
    }
    
    public Object caseSyncStatusDTO(final SyncStatusDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
