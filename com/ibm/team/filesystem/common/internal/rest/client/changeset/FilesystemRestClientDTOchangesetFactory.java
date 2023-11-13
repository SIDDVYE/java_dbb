// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset;

import com.ibm.team.filesystem.common.internal.rest.client.changeset.impl.FilesystemRestClientDTOchangesetFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOchangesetFactory extends EFactory
{
    public static final FilesystemRestClientDTOchangesetFactory eINSTANCE = FilesystemRestClientDTOchangesetFactoryImpl.init();
    
    CheckInResultDTO createCheckInResultDTO();
    
    CreateResultDTO createCreateResultDTO();
    
    WorkspaceUpdateResultDTO createWorkspaceUpdateResultDTO();
    
    UndoCheckedInChangesResultDTO createUndoCheckedInChangesResultDTO();
    
    UndoLocalChangesResultDTO createUndoLocalChangesResultDTO();
    
    DeliverResultDTO createDeliverResultDTO();
    
    StaleDataDTO createStaleDataDTO();
    
    ProblemChangeSetsDTO createProblemChangeSetsDTO();
    
    GapChangeSetsDTO createGapChangeSetsDTO();
    
    StructuredUpdateReportDTO createStructuredUpdateReportDTO();
    
    StructuredComponentUpdateReportDTO createStructuredComponentUpdateReportDTO();
    
    StructuredBaselineUpdateReportDTO createStructuredBaselineUpdateReportDTO();
    
    BackupInShedDTO createBackupInShedDTO();
    
    RemoveChangeRequestDTO createRemoveChangeRequestDTO();
    
    AssociateChangeRequestInfoDTO createAssociateChangeRequestInfoDTO();
    
    AddChangeRequestDTO createAddChangeRequestDTO();
    
    DeliveryRequiresHistoryReorderingDTO createDeliveryRequiresHistoryReorderingDTO();
    
    CompleteChangeSetsResultDTO createCompleteChangeSetsResultDTO();
    
    SuspendResultDTO createSuspendResultDTO();
    
    ResumeResultDTO createResumeResultDTO();
    
    DiscardResultDTO createDiscardResultDTO();
    
    FilesystemRestClientDTOchangesetPackage getFilesystemRestClientDTOchangesetPackage();
}
