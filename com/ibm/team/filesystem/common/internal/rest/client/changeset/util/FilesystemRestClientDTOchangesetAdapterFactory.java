// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.repository.common.IHelper;
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
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOchangesetAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOchangesetPackage modelPackage;
    protected FilesystemRestClientDTOchangesetSwitch modelSwitch;
    
    public FilesystemRestClientDTOchangesetAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOchangesetSwitch() {
            @Override
            public Object caseCheckInResultDTO(final CheckInResultDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createCheckInResultDTOAdapter();
            }
            
            @Override
            public Object caseSuspendResultDTO(final SuspendResultDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createSuspendResultDTOAdapter();
            }
            
            @Override
            public Object caseResumeResultDTO(final ResumeResultDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createResumeResultDTOAdapter();
            }
            
            @Override
            public Object caseDiscardResultDTO(final DiscardResultDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createDiscardResultDTOAdapter();
            }
            
            @Override
            public Object caseCreateResultDTO(final CreateResultDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createCreateResultDTOAdapter();
            }
            
            @Override
            public Object caseWorkspaceUpdateResultDTO(final WorkspaceUpdateResultDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createWorkspaceUpdateResultDTOAdapter();
            }
            
            @Override
            public Object caseUndoCheckedInChangesResultDTO(final UndoCheckedInChangesResultDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createUndoCheckedInChangesResultDTOAdapter();
            }
            
            @Override
            public Object caseUndoLocalChangesResultDTO(final UndoLocalChangesResultDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createUndoLocalChangesResultDTOAdapter();
            }
            
            @Override
            public Object caseDeliverResultDTO(final DeliverResultDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createDeliverResultDTOAdapter();
            }
            
            @Override
            public Object caseStaleDataDTO(final StaleDataDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createStaleDataDTOAdapter();
            }
            
            @Override
            public Object caseProblemChangeSetsDTO(final ProblemChangeSetsDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createProblemChangeSetsDTOAdapter();
            }
            
            @Override
            public Object caseGapChangeSetsDTO(final GapChangeSetsDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createGapChangeSetsDTOAdapter();
            }
            
            @Override
            public Object caseStructuredUpdateReportDTO(final StructuredUpdateReportDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createStructuredUpdateReportDTOAdapter();
            }
            
            @Override
            public Object caseStructuredComponentUpdateReportDTO(final StructuredComponentUpdateReportDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createStructuredComponentUpdateReportDTOAdapter();
            }
            
            @Override
            public Object caseStructuredBaselineUpdateReportDTO(final StructuredBaselineUpdateReportDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createStructuredBaselineUpdateReportDTOAdapter();
            }
            
            @Override
            public Object caseBackupInShedDTO(final BackupInShedDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createBackupInShedDTOAdapter();
            }
            
            @Override
            public Object caseRemoveChangeRequestDTO(final RemoveChangeRequestDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createRemoveChangeRequestDTOAdapter();
            }
            
            @Override
            public Object caseAssociateChangeRequestInfoDTO(final AssociateChangeRequestInfoDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createAssociateChangeRequestInfoDTOAdapter();
            }
            
            @Override
            public Object caseAddChangeRequestDTO(final AddChangeRequestDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createAddChangeRequestDTOAdapter();
            }
            
            @Override
            public Object caseDeliveryRequiresHistoryReorderingDTO(final DeliveryRequiresHistoryReorderingDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createDeliveryRequiresHistoryReorderingDTOAdapter();
            }
            
            @Override
            public Object caseCompleteChangeSetsResultDTO(final CompleteChangeSetsResultDTO object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createCompleteChangeSetsResultDTOAdapter();
            }
            
            @Override
            public Object caseHelperFacade(final IHelper object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createHelperFacadeAdapter();
            }
            
            @Override
            public Object caseHelper(final Helper object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createHelperAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOchangesetAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOchangesetAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOchangesetAdapterFactory.modelPackage = FilesystemRestClientDTOchangesetPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOchangesetAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOchangesetAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createCheckInResultDTOAdapter() {
        return null;
    }
    
    public Adapter createCreateResultDTOAdapter() {
        return null;
    }
    
    public Adapter createWorkspaceUpdateResultDTOAdapter() {
        return null;
    }
    
    public Adapter createUndoCheckedInChangesResultDTOAdapter() {
        return null;
    }
    
    public Adapter createUndoLocalChangesResultDTOAdapter() {
        return null;
    }
    
    public Adapter createDeliverResultDTOAdapter() {
        return null;
    }
    
    public Adapter createStaleDataDTOAdapter() {
        return null;
    }
    
    public Adapter createProblemChangeSetsDTOAdapter() {
        return null;
    }
    
    public Adapter createGapChangeSetsDTOAdapter() {
        return null;
    }
    
    public Adapter createStructuredUpdateReportDTOAdapter() {
        return null;
    }
    
    public Adapter createStructuredComponentUpdateReportDTOAdapter() {
        return null;
    }
    
    public Adapter createStructuredBaselineUpdateReportDTOAdapter() {
        return null;
    }
    
    public Adapter createBackupInShedDTOAdapter() {
        return null;
    }
    
    public Adapter createRemoveChangeRequestDTOAdapter() {
        return null;
    }
    
    public Adapter createAssociateChangeRequestInfoDTOAdapter() {
        return null;
    }
    
    public Adapter createAddChangeRequestDTOAdapter() {
        return null;
    }
    
    public Adapter createDeliveryRequiresHistoryReorderingDTOAdapter() {
        return null;
    }
    
    public Adapter createCompleteChangeSetsResultDTOAdapter() {
        return null;
    }
    
    public Adapter createHelperFacadeAdapter() {
        return null;
    }
    
    public Adapter createHelperAdapter() {
        return null;
    }
    
    public Adapter createSuspendResultDTOAdapter() {
        return null;
    }
    
    public Adapter createResumeResultDTOAdapter() {
        return null;
    }
    
    public Adapter createDiscardResultDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
