// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.DiscardResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.ResumeResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.SuspendResultDTO;
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
import com.ibm.team.filesystem.common.internal.rest.client.changeset.CheckInResultDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOchangesetFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOchangesetFactory
{
    public static FilesystemRestClientDTOchangesetFactory init() {
        try {
            final FilesystemRestClientDTOchangesetFactory theFilesystemRestClientDTOchangesetFactory = (FilesystemRestClientDTOchangesetFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.changeset");
            if (theFilesystemRestClientDTOchangesetFactory != null) {
                return theFilesystemRestClientDTOchangesetFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOchangesetFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createCheckInResultDTO();
            }
            case 1: {
                return (EObject)this.createSuspendResultDTO();
            }
            case 2: {
                return (EObject)this.createResumeResultDTO();
            }
            case 3: {
                return (EObject)this.createDiscardResultDTO();
            }
            case 4: {
                return (EObject)this.createCreateResultDTO();
            }
            case 5: {
                return (EObject)this.createWorkspaceUpdateResultDTO();
            }
            case 6: {
                return (EObject)this.createUndoCheckedInChangesResultDTO();
            }
            case 7: {
                return (EObject)this.createUndoLocalChangesResultDTO();
            }
            case 8: {
                return (EObject)this.createDeliverResultDTO();
            }
            case 9: {
                return (EObject)this.createStaleDataDTO();
            }
            case 10: {
                return (EObject)this.createProblemChangeSetsDTO();
            }
            case 11: {
                return (EObject)this.createGapChangeSetsDTO();
            }
            case 12: {
                return (EObject)this.createStructuredUpdateReportDTO();
            }
            case 13: {
                return (EObject)this.createStructuredComponentUpdateReportDTO();
            }
            case 14: {
                return (EObject)this.createStructuredBaselineUpdateReportDTO();
            }
            case 15: {
                return (EObject)this.createBackupInShedDTO();
            }
            case 16: {
                return (EObject)this.createRemoveChangeRequestDTO();
            }
            case 17: {
                return (EObject)this.createAssociateChangeRequestInfoDTO();
            }
            case 18: {
                return (EObject)this.createAddChangeRequestDTO();
            }
            case 19: {
                return (EObject)this.createDeliveryRequiresHistoryReorderingDTO();
            }
            case 20: {
                return (EObject)this.createCompleteChangeSetsResultDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public CheckInResultDTO createCheckInResultDTO() {
        final CheckInResultDTOImpl checkInResultDTO = new CheckInResultDTOImpl();
        return checkInResultDTO;
    }
    
    public CreateResultDTO createCreateResultDTO() {
        final CreateResultDTOImpl createResultDTO = new CreateResultDTOImpl();
        return createResultDTO;
    }
    
    public WorkspaceUpdateResultDTO createWorkspaceUpdateResultDTO() {
        final WorkspaceUpdateResultDTOImpl workspaceUpdateResultDTO = new WorkspaceUpdateResultDTOImpl();
        return workspaceUpdateResultDTO;
    }
    
    public UndoCheckedInChangesResultDTO createUndoCheckedInChangesResultDTO() {
        final UndoCheckedInChangesResultDTOImpl undoCheckedInChangesResultDTO = new UndoCheckedInChangesResultDTOImpl();
        return undoCheckedInChangesResultDTO;
    }
    
    public UndoLocalChangesResultDTO createUndoLocalChangesResultDTO() {
        final UndoLocalChangesResultDTOImpl undoLocalChangesResultDTO = new UndoLocalChangesResultDTOImpl();
        return undoLocalChangesResultDTO;
    }
    
    public DeliverResultDTO createDeliverResultDTO() {
        final DeliverResultDTOImpl deliverResultDTO = new DeliverResultDTOImpl();
        return deliverResultDTO;
    }
    
    public StaleDataDTO createStaleDataDTO() {
        final StaleDataDTOImpl staleDataDTO = new StaleDataDTOImpl();
        return staleDataDTO;
    }
    
    public ProblemChangeSetsDTO createProblemChangeSetsDTO() {
        final ProblemChangeSetsDTOImpl problemChangeSetsDTO = new ProblemChangeSetsDTOImpl();
        return problemChangeSetsDTO;
    }
    
    public GapChangeSetsDTO createGapChangeSetsDTO() {
        final GapChangeSetsDTOImpl gapChangeSetsDTO = new GapChangeSetsDTOImpl();
        return gapChangeSetsDTO;
    }
    
    public StructuredUpdateReportDTO createStructuredUpdateReportDTO() {
        final StructuredUpdateReportDTOImpl structuredUpdateReportDTO = new StructuredUpdateReportDTOImpl();
        return structuredUpdateReportDTO;
    }
    
    public StructuredComponentUpdateReportDTO createStructuredComponentUpdateReportDTO() {
        final StructuredComponentUpdateReportDTOImpl structuredComponentUpdateReportDTO = new StructuredComponentUpdateReportDTOImpl();
        return structuredComponentUpdateReportDTO;
    }
    
    public StructuredBaselineUpdateReportDTO createStructuredBaselineUpdateReportDTO() {
        final StructuredBaselineUpdateReportDTOImpl structuredBaselineUpdateReportDTO = new StructuredBaselineUpdateReportDTOImpl();
        return structuredBaselineUpdateReportDTO;
    }
    
    public BackupInShedDTO createBackupInShedDTO() {
        final BackupInShedDTOImpl backupInShedDTO = new BackupInShedDTOImpl();
        return backupInShedDTO;
    }
    
    public RemoveChangeRequestDTO createRemoveChangeRequestDTO() {
        final RemoveChangeRequestDTOImpl removeChangeRequestDTO = new RemoveChangeRequestDTOImpl();
        return removeChangeRequestDTO;
    }
    
    public AssociateChangeRequestInfoDTO createAssociateChangeRequestInfoDTO() {
        final AssociateChangeRequestInfoDTOImpl associateChangeRequestInfoDTO = new AssociateChangeRequestInfoDTOImpl();
        return associateChangeRequestInfoDTO;
    }
    
    public AddChangeRequestDTO createAddChangeRequestDTO() {
        final AddChangeRequestDTOImpl addChangeRequestDTO = new AddChangeRequestDTOImpl();
        return addChangeRequestDTO;
    }
    
    public DeliveryRequiresHistoryReorderingDTO createDeliveryRequiresHistoryReorderingDTO() {
        final DeliveryRequiresHistoryReorderingDTOImpl deliveryRequiresHistoryReorderingDTO = new DeliveryRequiresHistoryReorderingDTOImpl();
        return deliveryRequiresHistoryReorderingDTO;
    }
    
    public CompleteChangeSetsResultDTO createCompleteChangeSetsResultDTO() {
        final CompleteChangeSetsResultDTOImpl completeChangeSetsResultDTO = new CompleteChangeSetsResultDTOImpl();
        return completeChangeSetsResultDTO;
    }
    
    public SuspendResultDTO createSuspendResultDTO() {
        final SuspendResultDTOImpl suspendResultDTO = new SuspendResultDTOImpl();
        return suspendResultDTO;
    }
    
    public ResumeResultDTO createResumeResultDTO() {
        final ResumeResultDTOImpl resumeResultDTO = new ResumeResultDTOImpl();
        return resumeResultDTO;
    }
    
    public DiscardResultDTO createDiscardResultDTO() {
        final DiscardResultDTOImpl discardResultDTO = new DiscardResultDTOImpl();
        return discardResultDTO;
    }
    
    public FilesystemRestClientDTOchangesetPackage getFilesystemRestClientDTOchangesetPackage() {
        return (FilesystemRestClientDTOchangesetPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOchangesetPackage getPackage() {
        return FilesystemRestClientDTOchangesetPackage.eINSTANCE;
    }
}
