// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.util;

import com.ibm.team.repository.common.IHelper;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.CompleteChangeSetsResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.DeliveryRequiresHistoryReorderingDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.AddChangeRequestDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.AssociateChangeRequestInfoDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.RemoveChangeRequestDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.BackupInShedDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StructuredBaselineUpdateReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StructuredComponentUpdateReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StructuredUpdateReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.GapChangeSetsDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.ProblemChangeSetsDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StaleDataDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.DeliverResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.UndoLocalChangesResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.UndoCheckedInChangesResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.WorkspaceUpdateResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.CreateResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.DiscardResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.ResumeResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.SuspendResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.CheckInResultDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;

public class FilesystemRestClientDTOchangesetSwitch
{
    protected static FilesystemRestClientDTOchangesetPackage modelPackage;
    
    public FilesystemRestClientDTOchangesetSwitch() {
        if (FilesystemRestClientDTOchangesetSwitch.modelPackage == null) {
            FilesystemRestClientDTOchangesetSwitch.modelPackage = FilesystemRestClientDTOchangesetPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOchangesetSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final CheckInResultDTO checkInResultDTO = (CheckInResultDTO)theEObject;
                Object result = this.caseCheckInResultDTO(checkInResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final SuspendResultDTO suspendResultDTO = (SuspendResultDTO)theEObject;
                Object result = this.caseSuspendResultDTO(suspendResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final ResumeResultDTO resumeResultDTO = (ResumeResultDTO)theEObject;
                Object result = this.caseResumeResultDTO(resumeResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final DiscardResultDTO discardResultDTO = (DiscardResultDTO)theEObject;
                Object result = this.caseDiscardResultDTO(discardResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final CreateResultDTO createResultDTO = (CreateResultDTO)theEObject;
                Object result = this.caseCreateResultDTO(createResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final WorkspaceUpdateResultDTO workspaceUpdateResultDTO = (WorkspaceUpdateResultDTO)theEObject;
                Object result = this.caseWorkspaceUpdateResultDTO(workspaceUpdateResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final UndoCheckedInChangesResultDTO undoCheckedInChangesResultDTO = (UndoCheckedInChangesResultDTO)theEObject;
                Object result = this.caseUndoCheckedInChangesResultDTO(undoCheckedInChangesResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final UndoLocalChangesResultDTO undoLocalChangesResultDTO = (UndoLocalChangesResultDTO)theEObject;
                Object result = this.caseUndoLocalChangesResultDTO(undoLocalChangesResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 8: {
                final DeliverResultDTO deliverResultDTO = (DeliverResultDTO)theEObject;
                Object result = this.caseDeliverResultDTO(deliverResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 9: {
                final StaleDataDTO staleDataDTO = (StaleDataDTO)theEObject;
                Object result = this.caseStaleDataDTO(staleDataDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 10: {
                final ProblemChangeSetsDTO problemChangeSetsDTO = (ProblemChangeSetsDTO)theEObject;
                Object result = this.caseProblemChangeSetsDTO(problemChangeSetsDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 11: {
                final GapChangeSetsDTO gapChangeSetsDTO = (GapChangeSetsDTO)theEObject;
                Object result = this.caseGapChangeSetsDTO(gapChangeSetsDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 12: {
                final StructuredUpdateReportDTO structuredUpdateReportDTO = (StructuredUpdateReportDTO)theEObject;
                Object result = this.caseStructuredUpdateReportDTO(structuredUpdateReportDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 13: {
                final StructuredComponentUpdateReportDTO structuredComponentUpdateReportDTO = (StructuredComponentUpdateReportDTO)theEObject;
                Object result = this.caseStructuredComponentUpdateReportDTO(structuredComponentUpdateReportDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 14: {
                final StructuredBaselineUpdateReportDTO structuredBaselineUpdateReportDTO = (StructuredBaselineUpdateReportDTO)theEObject;
                Object result = this.caseStructuredBaselineUpdateReportDTO(structuredBaselineUpdateReportDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 15: {
                final BackupInShedDTO backupInShedDTO = (BackupInShedDTO)theEObject;
                Object result = this.caseBackupInShedDTO(backupInShedDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 16: {
                final RemoveChangeRequestDTO removeChangeRequestDTO = (RemoveChangeRequestDTO)theEObject;
                Object result = this.caseRemoveChangeRequestDTO(removeChangeRequestDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 17: {
                final AssociateChangeRequestInfoDTO associateChangeRequestInfoDTO = (AssociateChangeRequestInfoDTO)theEObject;
                Object result = this.caseAssociateChangeRequestInfoDTO(associateChangeRequestInfoDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 18: {
                final AddChangeRequestDTO addChangeRequestDTO = (AddChangeRequestDTO)theEObject;
                Object result = this.caseAddChangeRequestDTO(addChangeRequestDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 19: {
                final DeliveryRequiresHistoryReorderingDTO deliveryRequiresHistoryReorderingDTO = (DeliveryRequiresHistoryReorderingDTO)theEObject;
                Object result = this.caseDeliveryRequiresHistoryReorderingDTO(deliveryRequiresHistoryReorderingDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 20: {
                final CompleteChangeSetsResultDTO completeChangeSetsResultDTO = (CompleteChangeSetsResultDTO)theEObject;
                Object result = this.caseCompleteChangeSetsResultDTO(completeChangeSetsResultDTO);
                if (result == null) {
                    result = this.caseHelper((Helper)completeChangeSetsResultDTO);
                }
                if (result == null) {
                    result = this.caseHelperFacade((IHelper)completeChangeSetsResultDTO);
                }
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
    
    public Object caseCheckInResultDTO(final CheckInResultDTO object) {
        return null;
    }
    
    public Object caseCreateResultDTO(final CreateResultDTO object) {
        return null;
    }
    
    public Object caseWorkspaceUpdateResultDTO(final WorkspaceUpdateResultDTO object) {
        return null;
    }
    
    public Object caseUndoCheckedInChangesResultDTO(final UndoCheckedInChangesResultDTO object) {
        return null;
    }
    
    public Object caseUndoLocalChangesResultDTO(final UndoLocalChangesResultDTO object) {
        return null;
    }
    
    public Object caseDeliverResultDTO(final DeliverResultDTO object) {
        return null;
    }
    
    public Object caseStaleDataDTO(final StaleDataDTO object) {
        return null;
    }
    
    public Object caseProblemChangeSetsDTO(final ProblemChangeSetsDTO object) {
        return null;
    }
    
    public Object caseGapChangeSetsDTO(final GapChangeSetsDTO object) {
        return null;
    }
    
    public Object caseStructuredUpdateReportDTO(final StructuredUpdateReportDTO object) {
        return null;
    }
    
    public Object caseStructuredComponentUpdateReportDTO(final StructuredComponentUpdateReportDTO object) {
        return null;
    }
    
    public Object caseStructuredBaselineUpdateReportDTO(final StructuredBaselineUpdateReportDTO object) {
        return null;
    }
    
    public Object caseBackupInShedDTO(final BackupInShedDTO object) {
        return null;
    }
    
    public Object caseRemoveChangeRequestDTO(final RemoveChangeRequestDTO object) {
        return null;
    }
    
    public Object caseAssociateChangeRequestInfoDTO(final AssociateChangeRequestInfoDTO object) {
        return null;
    }
    
    public Object caseAddChangeRequestDTO(final AddChangeRequestDTO object) {
        return null;
    }
    
    public Object caseDeliveryRequiresHistoryReorderingDTO(final DeliveryRequiresHistoryReorderingDTO object) {
        return null;
    }
    
    public Object caseCompleteChangeSetsResultDTO(final CompleteChangeSetsResultDTO object) {
        return null;
    }
    
    public Object caseHelperFacade(final IHelper object) {
        return null;
    }
    
    public Object caseHelper(final Helper object) {
        return null;
    }
    
    public Object caseSuspendResultDTO(final SuspendResultDTO object) {
        return null;
    }
    
    public Object caseResumeResultDTO(final ResumeResultDTO object) {
        return null;
    }
    
    public Object caseDiscardResultDTO(final DiscardResultDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
