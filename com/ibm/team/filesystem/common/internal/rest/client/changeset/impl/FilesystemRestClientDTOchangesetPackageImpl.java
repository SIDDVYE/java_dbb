// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import org.eclipse.emf.ecore.ENamedElement;
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
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.CheckInResultDTO;
import com.ibm.team.repository.common.model.RepositoryPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import com.ibm.team.filesystem.common.internal.rest.client.patch.impl.FilesystemRestClientDTOpatchPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import com.ibm.team.filesystem.common.internal.rest.client.locks.impl.FilesystemRestClientDTOlocksPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.FilesystemRestClientDTOcorruptionPackage;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.impl.FilesystemRestClientDTOcorruptionPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.impl.FilesystemRestClientDTOworkspacePackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresPackage;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.impl.FilesystemRestClientDTOignoresPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FilesystemRestClientDTOconflictPackage;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.impl.FilesystemRestClientDTOconflictPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import com.ibm.team.filesystem.common.internal.rest.client.resource.impl.FilesystemRestClientDTOresourcePackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;
import com.ibm.team.filesystem.common.internal.rest.client.share.impl.FilesystemRestClientDTOsharePackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.impl.FilesystemRestClientDTOchangelogPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import com.ibm.team.filesystem.common.internal.rest.client.sync.impl.FilesystemRestClientDTOsyncPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import com.ibm.team.filesystem.common.internal.rest.client.load.impl.FilesystemRestClientDTOloadPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl.FilesystemRestClientDTOdilemmaPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import com.ibm.team.filesystem.common.internal.rest.client.core.impl.FilesystemRestClientDTOcorePackageImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOchangesetPackageImpl extends EPackageImpl implements FilesystemRestClientDTOchangesetPackage
{
    private EClass checkInResultDTOEClass;
    private EClass suspendResultDTOEClass;
    private EClass resumeResultDTOEClass;
    private EClass discardResultDTOEClass;
    private EClass createResultDTOEClass;
    private EClass workspaceUpdateResultDTOEClass;
    private EClass undoCheckedInChangesResultDTOEClass;
    private EClass undoLocalChangesResultDTOEClass;
    private EClass deliverResultDTOEClass;
    private EClass staleDataDTOEClass;
    private EClass problemChangeSetsDTOEClass;
    private EClass gapChangeSetsDTOEClass;
    private EClass structuredUpdateReportDTOEClass;
    private EClass structuredComponentUpdateReportDTOEClass;
    private EClass structuredBaselineUpdateReportDTOEClass;
    private EClass backupInShedDTOEClass;
    private EClass removeChangeRequestDTOEClass;
    private EClass associateChangeRequestInfoDTOEClass;
    private EClass addChangeRequestDTOEClass;
    private EClass deliveryRequiresHistoryReorderingDTOEClass;
    private EClass completeChangeSetsResultDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOchangesetPackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOchangesetPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.changeset", (EFactory)FilesystemRestClientDTOchangesetFactory.eINSTANCE);
        this.checkInResultDTOEClass = null;
        this.suspendResultDTOEClass = null;
        this.resumeResultDTOEClass = null;
        this.discardResultDTOEClass = null;
        this.createResultDTOEClass = null;
        this.workspaceUpdateResultDTOEClass = null;
        this.undoCheckedInChangesResultDTOEClass = null;
        this.undoLocalChangesResultDTOEClass = null;
        this.deliverResultDTOEClass = null;
        this.staleDataDTOEClass = null;
        this.problemChangeSetsDTOEClass = null;
        this.gapChangeSetsDTOEClass = null;
        this.structuredUpdateReportDTOEClass = null;
        this.structuredComponentUpdateReportDTOEClass = null;
        this.structuredBaselineUpdateReportDTOEClass = null;
        this.backupInShedDTOEClass = null;
        this.removeChangeRequestDTOEClass = null;
        this.associateChangeRequestInfoDTOEClass = null;
        this.addChangeRequestDTOEClass = null;
        this.deliveryRequiresHistoryReorderingDTOEClass = null;
        this.completeChangeSetsResultDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOchangesetPackage init() {
        if (FilesystemRestClientDTOchangesetPackageImpl.isInited) {
            return (FilesystemRestClientDTOchangesetPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset");
        }
        final FilesystemRestClientDTOchangesetPackageImpl theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.changeset") instanceof FilesystemRestClientDTOchangesetPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.changeset") : new FilesystemRestClientDTOchangesetPackageImpl());
        FilesystemRestClientDTOchangesetPackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") : FilesystemRestClientDTOcorePackage.eINSTANCE);
        final FilesystemRestClientDTOdilemmaPackageImpl theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") instanceof FilesystemRestClientDTOdilemmaPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") : FilesystemRestClientDTOdilemmaPackage.eINSTANCE);
        final FilesystemRestClientDTOloadPackageImpl theFilesystemRestClientDTOloadPackage = (FilesystemRestClientDTOloadPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") instanceof FilesystemRestClientDTOloadPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") : FilesystemRestClientDTOloadPackage.eINSTANCE);
        final FilesystemRestClientDTOsyncPackageImpl theFilesystemRestClientDTOsyncPackage = (FilesystemRestClientDTOsyncPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") instanceof FilesystemRestClientDTOsyncPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") : FilesystemRestClientDTOsyncPackage.eINSTANCE);
        final FilesystemRestClientDTOchangelogPackageImpl theFilesystemRestClientDTOchangelogPackage = (FilesystemRestClientDTOchangelogPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") instanceof FilesystemRestClientDTOchangelogPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") : FilesystemRestClientDTOchangelogPackage.eINSTANCE);
        final FilesystemRestClientDTOsharePackageImpl theFilesystemRestClientDTOsharePackage = (FilesystemRestClientDTOsharePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") instanceof FilesystemRestClientDTOsharePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") : FilesystemRestClientDTOsharePackage.eINSTANCE);
        final FilesystemRestClientDTOresourcePackageImpl theFilesystemRestClientDTOresourcePackage = (FilesystemRestClientDTOresourcePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") instanceof FilesystemRestClientDTOresourcePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") : FilesystemRestClientDTOresourcePackage.eINSTANCE);
        final FilesystemRestClientDTOconflictPackageImpl theFilesystemRestClientDTOconflictPackage = (FilesystemRestClientDTOconflictPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") instanceof FilesystemRestClientDTOconflictPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") : FilesystemRestClientDTOconflictPackage.eINSTANCE);
        final FilesystemRestClientDTOignoresPackageImpl theFilesystemRestClientDTOignoresPackage = (FilesystemRestClientDTOignoresPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") instanceof FilesystemRestClientDTOignoresPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") : FilesystemRestClientDTOignoresPackage.eINSTANCE);
        final FilesystemRestClientDTOworkspacePackageImpl theFilesystemRestClientDTOworkspacePackage = (FilesystemRestClientDTOworkspacePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") instanceof FilesystemRestClientDTOworkspacePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") : FilesystemRestClientDTOworkspacePackage.eINSTANCE);
        final FilesystemRestClientDTOcorruptionPackageImpl theFilesystemRestClientDTOcorruptionPackage = (FilesystemRestClientDTOcorruptionPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") instanceof FilesystemRestClientDTOcorruptionPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") : FilesystemRestClientDTOcorruptionPackage.eINSTANCE);
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") : FilesystemRestClientDTOlocksPackage.eINSTANCE);
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
        theFilesystemRestClientDTOchangesetPackage.createPackageContents();
        theFilesystemRestClientDTOcorePackage.createPackageContents();
        theFilesystemRestClientDTOdilemmaPackage.createPackageContents();
        theFilesystemRestClientDTOloadPackage.createPackageContents();
        theFilesystemRestClientDTOsyncPackage.createPackageContents();
        theFilesystemRestClientDTOchangelogPackage.createPackageContents();
        theFilesystemRestClientDTOsharePackage.createPackageContents();
        theFilesystemRestClientDTOresourcePackage.createPackageContents();
        theFilesystemRestClientDTOconflictPackage.createPackageContents();
        theFilesystemRestClientDTOignoresPackage.createPackageContents();
        theFilesystemRestClientDTOworkspacePackage.createPackageContents();
        theFilesystemRestClientDTOcorruptionPackage.createPackageContents();
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
        theFilesystemRestClientDTOchangesetPackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.initializePackageContents();
        theFilesystemRestClientDTOdilemmaPackage.initializePackageContents();
        theFilesystemRestClientDTOloadPackage.initializePackageContents();
        theFilesystemRestClientDTOsyncPackage.initializePackageContents();
        theFilesystemRestClientDTOchangelogPackage.initializePackageContents();
        theFilesystemRestClientDTOsharePackage.initializePackageContents();
        theFilesystemRestClientDTOresourcePackage.initializePackageContents();
        theFilesystemRestClientDTOconflictPackage.initializePackageContents();
        theFilesystemRestClientDTOignoresPackage.initializePackageContents();
        theFilesystemRestClientDTOworkspacePackage.initializePackageContents();
        theFilesystemRestClientDTOcorruptionPackage.initializePackageContents();
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOchangesetPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.changeset", (Object)theFilesystemRestClientDTOchangesetPackage);
        return theFilesystemRestClientDTOchangesetPackage;
    }
    
    public EClass getCheckInResultDTO() {
        return this.checkInResultDTOEClass;
    }
    
    public EAttribute getCheckInResultDTO_Cancelled() {
        return (EAttribute)this.checkInResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getCheckInResultDTO_OutOfSyncShares() {
        return (EReference)this.checkInResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getCheckInResultDTO_ChangeSetsCommitted() {
        return (EAttribute)this.checkInResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getCheckInResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.checkInResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getCheckInResultDTO_CommitDilemma() {
        return (EReference)this.checkInResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getCheckInResultDTO_UpdateDilemma() {
        return (EReference)this.checkInResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getSuspendResultDTO() {
        return this.suspendResultDTOEClass;
    }
    
    public EAttribute getSuspendResultDTO_Cancelled() {
        return (EAttribute)this.suspendResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getSuspendResultDTO_OutOfSyncShares() {
        return (EReference)this.suspendResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getSuspendResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.suspendResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getSuspendResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.suspendResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getSuspendResultDTO_CommitDilemma() {
        return (EReference)this.suspendResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getSuspendResultDTO_UpdateDilemma() {
        return (EReference)this.suspendResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getSuspendResultDTO_LocksToRelease() {
        return (EReference)this.suspendResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EClass getResumeResultDTO() {
        return this.resumeResultDTOEClass;
    }
    
    public EAttribute getResumeResultDTO_Cancelled() {
        return (EAttribute)this.resumeResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getResumeResultDTO_OutOfSyncShares() {
        return (EReference)this.resumeResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getResumeResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.resumeResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getResumeResultDTO_ActiveChangeSetsOverlap() {
        return (EReference)this.resumeResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getResumeResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.resumeResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getResumeResultDTO_CommitDilemma() {
        return (EReference)this.resumeResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getResumeResultDTO_UpdateDilemma() {
        return (EReference)this.resumeResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getResumeResultDTO_Gap() {
        return (EReference)this.resumeResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EReference getResumeResultDTO_ChangeSetsBlockedByPortInProgress() {
        return (EReference)this.resumeResultDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EReference getResumeResultDTO_LocksWereHeld() {
        return (EReference)this.resumeResultDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EReference getResumeResultDTO_LocksToAcquire() {
        return (EReference)this.resumeResultDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EClass getDiscardResultDTO() {
        return this.discardResultDTOEClass;
    }
    
    public EAttribute getDiscardResultDTO_Cancelled() {
        return (EAttribute)this.discardResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getDiscardResultDTO_OutOfSyncShares() {
        return (EReference)this.discardResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getDiscardResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.discardResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getDiscardResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.discardResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getDiscardResultDTO_CommitDilemma() {
        return (EReference)this.discardResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getDiscardResultDTO_UpdateDilemma() {
        return (EReference)this.discardResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getDiscardResultDTO_LocksToRelease() {
        return (EReference)this.discardResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EClass getCreateResultDTO() {
        return this.createResultDTOEClass;
    }
    
    public EAttribute getCreateResultDTO_ChangeSetItemId() {
        return (EAttribute)this.createResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getWorkspaceUpdateResultDTO() {
        return this.workspaceUpdateResultDTOEClass;
    }
    
    public EAttribute getWorkspaceUpdateResultDTO_Cancelled() {
        return (EAttribute)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getWorkspaceUpdateResultDTO_OutOfSyncShares() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(15);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EReference getWorkspaceUpdateResultDTO_StaleData() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(17);
    }
    
    public EReference getWorkspaceUpdateResultDTO_DisconnectedComponents() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ComponentFlowAdditions() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ComponentFlowDeletions() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ComponentReplacementCandidates() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ComponentsAdded() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EAttribute getWorkspaceUpdateResultDTO_ChangeSetsAlreadyInHistory() {
        return (EAttribute)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ChangeSetsBlockedByPortInProgress() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getWorkspaceUpdateResultDTO_AcceptedSuspendedChanges() {
        return (EAttribute)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ActiveChangeSets() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ActiveChangeSetsOverlap() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ActiveChangeSetsInComponent() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getWorkspaceUpdateResultDTO_Gap() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(14);
    }
    
    public EReference getWorkspaceUpdateResultDTO_StructuredResult() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(18);
    }
    
    public EReference getWorkspaceUpdateResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(16);
    }
    
    public EReference getWorkspaceUpdateResultDTO_CommitDilemma() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EReference getWorkspaceUpdateResultDTO_UpdateDilemma() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(19);
    }
    
    public EAttribute getWorkspaceUpdateResultDTO_EclipseReadFailureMessage() {
        return (EAttribute)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(20);
    }
    
    public EReference getWorkspaceUpdateResultDTO_LocksWereHeld() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(21);
    }
    
    public EReference getWorkspaceUpdateResultDTO_LocksToAcquire() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(22);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ComponentsWithNWayConflicts() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(23);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ComponentsWithConflictingTargets() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(24);
    }
    
    public EReference getWorkspaceUpdateResultDTO_ComponentsWithMultipleParticipants() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(25);
    }
    
    public EReference getWorkspaceUpdateResultDTO_NoBackupBaselinesComponents() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(26);
    }
    
    public EReference getWorkspaceUpdateResultDTO_SelectedComponentsInMultipleHierarchies() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(27);
    }
    
    public EReference getWorkspaceUpdateResultDTO_SubcomponentsInMultipleHierarchies() {
        return (EReference)this.workspaceUpdateResultDTOEClass.getEStructuralFeatures().get(28);
    }
    
    public EClass getUndoCheckedInChangesResultDTO() {
        return this.undoCheckedInChangesResultDTOEClass;
    }
    
    public EAttribute getUndoCheckedInChangesResultDTO_Cancelled() {
        return (EAttribute)this.undoCheckedInChangesResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getUndoCheckedInChangesResultDTO_OutOfSyncShares() {
        return (EReference)this.undoCheckedInChangesResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getUndoCheckedInChangesResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.undoCheckedInChangesResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getUndoCheckedInChangesResultDTO_UpdateDilemma() {
        return (EReference)this.undoCheckedInChangesResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getUndoCheckedInChangesResultDTO_LocksToRelease() {
        return (EReference)this.undoCheckedInChangesResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EClass getUndoLocalChangesResultDTO() {
        return this.undoLocalChangesResultDTOEClass;
    }
    
    public EAttribute getUndoLocalChangesResultDTO_Cancelled() {
        return (EAttribute)this.undoLocalChangesResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getUndoLocalChangesResultDTO_OutOfSyncShares() {
        return (EReference)this.undoLocalChangesResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getUndoLocalChangesResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.undoLocalChangesResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getUndoLocalChangesResultDTO_UpdateDilemma() {
        return (EReference)this.undoLocalChangesResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getUndoLocalChangesResultDTO_LocksToRelease() {
        return (EReference)this.undoLocalChangesResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EClass getDeliverResultDTO() {
        return this.deliverResultDTOEClass;
    }
    
    public EAttribute getDeliverResultDTO_Cancelled() {
        return (EAttribute)this.deliverResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getDeliverResultDTO_ComponentsToFlow() {
        return (EAttribute)this.deliverResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getDeliverResultDTO_FlowToNonDefaultTarget() {
        return (EAttribute)this.deliverResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getDeliverResultDTO_OutOfSyncShares() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getDeliverResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getDeliverResultDTO_LocksToRelease() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EReference getDeliverResultDTO_LocksWereHeld() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EReference getDeliverResultDTO_StructuredResult() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EReference getDeliverResultDTO_DeliveryRequiresHistoryReordering() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getDeliverResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EReference getDeliverResultDTO_CommitDilemma() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getDeliverResultDTO_UpdateDilemma() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EReference getDeliverResultDTO_ComponentsWithConflictingTargets() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EReference getDeliverResultDTO_ComponentsWithMultipleParticipants() {
        return (EReference)this.deliverResultDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EClass getStaleDataDTO() {
        return this.staleDataDTOEClass;
    }
    
    public EAttribute getStaleDataDTO_RepositoryId() {
        return (EAttribute)this.staleDataDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getStaleDataDTO_RepositoryURL() {
        return (EAttribute)this.staleDataDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getStaleDataDTO_SourceRepositoryId() {
        return (EAttribute)this.staleDataDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getStaleDataDTO_WorkspaceItemId() {
        return (EAttribute)this.staleDataDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getStaleDataDTO_SourceRepositoryURL() {
        return (EAttribute)this.staleDataDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getStaleDataDTO_SourceWorkspaceItemId() {
        return (EAttribute)this.staleDataDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EClass getProblemChangeSetsDTO() {
        return this.problemChangeSetsDTOEClass;
    }
    
    public EAttribute getProblemChangeSetsDTO_RepositoryURL() {
        return (EAttribute)this.problemChangeSetsDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getProblemChangeSetsDTO_WorkspaceItemId() {
        return (EAttribute)this.problemChangeSetsDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getProblemChangeSetsDTO_ChangeSetItemIds() {
        return (EAttribute)this.problemChangeSetsDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getProblemChangeSetsDTO_RepositoryId() {
        return (EAttribute)this.problemChangeSetsDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getGapChangeSetsDTO() {
        return this.gapChangeSetsDTOEClass;
    }
    
    public EAttribute getGapChangeSetsDTO_RepositoryURL() {
        return (EAttribute)this.gapChangeSetsDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getGapChangeSetsDTO_WorkspaceItemId() {
        return (EAttribute)this.gapChangeSetsDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getGapChangeSetsDTO_ChangeSetItemIds() {
        return (EAttribute)this.gapChangeSetsDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getGapChangeSetsDTO_HandlingSuspended() {
        return (EAttribute)this.gapChangeSetsDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getGapChangeSetsDTO_RepositoryId() {
        return (EAttribute)this.gapChangeSetsDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getStructuredUpdateReportDTO() {
        return this.structuredUpdateReportDTOEClass;
    }
    
    public EAttribute getStructuredUpdateReportDTO_RepositoryUrl() {
        return (EAttribute)this.structuredUpdateReportDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getStructuredUpdateReportDTO_WorkspaceName() {
        return (EAttribute)this.structuredUpdateReportDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getStructuredUpdateReportDTO_WorkspaceItemId() {
        return (EAttribute)this.structuredUpdateReportDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getStructuredUpdateReportDTO_HasConflicts() {
        return (EAttribute)this.structuredUpdateReportDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getStructuredUpdateReportDTO_RepositoryId() {
        return (EAttribute)this.structuredUpdateReportDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getStructuredUpdateReportDTO_Components() {
        return (EReference)this.structuredUpdateReportDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getStructuredComponentUpdateReportDTO() {
        return this.structuredComponentUpdateReportDTOEClass;
    }
    
    public EAttribute getStructuredComponentUpdateReportDTO_ComponentName() {
        return (EAttribute)this.structuredComponentUpdateReportDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getStructuredComponentUpdateReportDTO_CurrentPatch() {
        return (EReference)this.structuredComponentUpdateReportDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getStructuredComponentUpdateReportDTO_ComponentItemId() {
        return (EAttribute)this.structuredComponentUpdateReportDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getStructuredComponentUpdateReportDTO_ConflictedItemIds() {
        return (EAttribute)this.structuredComponentUpdateReportDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getStructuredComponentUpdateReportDTO_ChangeSetItemIds() {
        return (EAttribute)this.structuredComponentUpdateReportDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getStructuredComponentUpdateReportDTO_Baselines() {
        return (EReference)this.structuredComponentUpdateReportDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getStructuredBaselineUpdateReportDTO() {
        return this.structuredBaselineUpdateReportDTOEClass;
    }
    
    public EAttribute getStructuredBaselineUpdateReportDTO_BaselineName() {
        return (EAttribute)this.structuredBaselineUpdateReportDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getStructuredBaselineUpdateReportDTO_BaselineItemId() {
        return (EAttribute)this.structuredBaselineUpdateReportDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getStructuredBaselineUpdateReportDTO_BaselineId() {
        return (EAttribute)this.structuredBaselineUpdateReportDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getBackupInShedDTO() {
        return this.backupInShedDTOEClass;
    }
    
    public EReference getBackupInShedDTO_Shareable() {
        return (EReference)this.backupInShedDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getBackupInShedDTO_ShedLocation() {
        return (EAttribute)this.backupInShedDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getRemoveChangeRequestDTO() {
        return this.removeChangeRequestDTOEClass;
    }
    
    public EAttribute getRemoveChangeRequestDTO_LinkRemoved() {
        return (EAttribute)this.removeChangeRequestDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getRemoveChangeRequestDTO_BackLinkRemoved() {
        return (EAttribute)this.removeChangeRequestDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getAssociateChangeRequestInfoDTO() {
        return this.associateChangeRequestInfoDTOEClass;
    }
    
    public EAttribute getAssociateChangeRequestInfoDTO_ProjectLinkType() {
        return (EAttribute)this.associateChangeRequestInfoDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getAssociateChangeRequestInfoDTO_ProjectLinkLabel() {
        return (EAttribute)this.associateChangeRequestInfoDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getAssociateChangeRequestInfoDTO_ProjectLinkTargetServiceUrl() {
        return (EAttribute)this.associateChangeRequestInfoDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getAddChangeRequestDTO() {
        return this.addChangeRequestDTOEClass;
    }
    
    public EAttribute getAddChangeRequestDTO_LinkAdded() {
        return (EAttribute)this.addChangeRequestDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getAddChangeRequestDTO_BackLinkAdded() {
        return (EAttribute)this.addChangeRequestDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getDeliveryRequiresHistoryReorderingDTO() {
        return this.deliveryRequiresHistoryReorderingDTOEClass;
    }
    
    public EAttribute getDeliveryRequiresHistoryReorderingDTO_WorkspaceItemId() {
        return (EAttribute)this.deliveryRequiresHistoryReorderingDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getDeliveryRequiresHistoryReorderingDTO_TargetWorkspaceItemId() {
        return (EAttribute)this.deliveryRequiresHistoryReorderingDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getDeliveryRequiresHistoryReorderingDTO_ComponentItemId() {
        return (EAttribute)this.deliveryRequiresHistoryReorderingDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getCompleteChangeSetsResultDTO() {
        return this.completeChangeSetsResultDTOEClass;
    }
    
    public EReference getCompleteChangeSetsResultDTO_TargetChangeSets() {
        return (EReference)this.completeChangeSetsResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getCompleteChangeSetsResultDTO_Cancelled() {
        return (EAttribute)this.completeChangeSetsResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public FilesystemRestClientDTOchangesetFactory getFilesystemRestClientDTOchangesetFactory() {
        return (FilesystemRestClientDTOchangesetFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEAttribute(this.checkInResultDTOEClass = this.createEClass(0), 0);
        this.createEAttribute(this.checkInResultDTOEClass, 1);
        this.createEReference(this.checkInResultDTOEClass, 2);
        this.createEReference(this.checkInResultDTOEClass, 3);
        this.createEReference(this.checkInResultDTOEClass, 4);
        this.createEReference(this.checkInResultDTOEClass, 5);
        this.createEAttribute(this.suspendResultDTOEClass = this.createEClass(1), 0);
        this.createEReference(this.suspendResultDTOEClass, 1);
        this.createEReference(this.suspendResultDTOEClass, 2);
        this.createEReference(this.suspendResultDTOEClass, 3);
        this.createEReference(this.suspendResultDTOEClass, 4);
        this.createEReference(this.suspendResultDTOEClass, 5);
        this.createEReference(this.suspendResultDTOEClass, 6);
        this.createEReference(this.resumeResultDTOEClass = this.createEClass(2), 0);
        this.createEAttribute(this.resumeResultDTOEClass, 1);
        this.createEReference(this.resumeResultDTOEClass, 2);
        this.createEReference(this.resumeResultDTOEClass, 3);
        this.createEReference(this.resumeResultDTOEClass, 4);
        this.createEReference(this.resumeResultDTOEClass, 5);
        this.createEReference(this.resumeResultDTOEClass, 6);
        this.createEReference(this.resumeResultDTOEClass, 7);
        this.createEReference(this.resumeResultDTOEClass, 8);
        this.createEReference(this.resumeResultDTOEClass, 9);
        this.createEReference(this.resumeResultDTOEClass, 10);
        this.createEAttribute(this.discardResultDTOEClass = this.createEClass(3), 0);
        this.createEReference(this.discardResultDTOEClass, 1);
        this.createEReference(this.discardResultDTOEClass, 2);
        this.createEReference(this.discardResultDTOEClass, 3);
        this.createEReference(this.discardResultDTOEClass, 4);
        this.createEReference(this.discardResultDTOEClass, 5);
        this.createEReference(this.discardResultDTOEClass, 6);
        this.createEAttribute(this.createResultDTOEClass = this.createEClass(4), 0);
        this.createEAttribute(this.workspaceUpdateResultDTOEClass = this.createEClass(5), 0);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 1);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 2);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 3);
        this.createEAttribute(this.workspaceUpdateResultDTOEClass, 4);
        this.createEAttribute(this.workspaceUpdateResultDTOEClass, 5);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 6);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 7);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 8);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 9);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 10);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 11);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 12);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 13);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 14);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 15);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 16);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 17);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 18);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 19);
        this.createEAttribute(this.workspaceUpdateResultDTOEClass, 20);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 21);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 22);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 23);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 24);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 25);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 26);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 27);
        this.createEReference(this.workspaceUpdateResultDTOEClass, 28);
        this.createEAttribute(this.undoCheckedInChangesResultDTOEClass = this.createEClass(6), 0);
        this.createEReference(this.undoCheckedInChangesResultDTOEClass, 1);
        this.createEReference(this.undoCheckedInChangesResultDTOEClass, 2);
        this.createEReference(this.undoCheckedInChangesResultDTOEClass, 3);
        this.createEReference(this.undoCheckedInChangesResultDTOEClass, 4);
        this.createEAttribute(this.undoLocalChangesResultDTOEClass = this.createEClass(7), 0);
        this.createEReference(this.undoLocalChangesResultDTOEClass, 1);
        this.createEReference(this.undoLocalChangesResultDTOEClass, 2);
        this.createEReference(this.undoLocalChangesResultDTOEClass, 3);
        this.createEReference(this.undoLocalChangesResultDTOEClass, 4);
        this.createEAttribute(this.deliverResultDTOEClass = this.createEClass(8), 0);
        this.createEReference(this.deliverResultDTOEClass, 1);
        this.createEAttribute(this.deliverResultDTOEClass, 2);
        this.createEReference(this.deliverResultDTOEClass, 3);
        this.createEReference(this.deliverResultDTOEClass, 4);
        this.createEAttribute(this.deliverResultDTOEClass, 5);
        this.createEReference(this.deliverResultDTOEClass, 6);
        this.createEReference(this.deliverResultDTOEClass, 7);
        this.createEReference(this.deliverResultDTOEClass, 8);
        this.createEReference(this.deliverResultDTOEClass, 9);
        this.createEReference(this.deliverResultDTOEClass, 10);
        this.createEReference(this.deliverResultDTOEClass, 11);
        this.createEReference(this.deliverResultDTOEClass, 12);
        this.createEReference(this.deliverResultDTOEClass, 13);
        this.createEAttribute(this.staleDataDTOEClass = this.createEClass(9), 0);
        this.createEAttribute(this.staleDataDTOEClass, 1);
        this.createEAttribute(this.staleDataDTOEClass, 2);
        this.createEAttribute(this.staleDataDTOEClass, 3);
        this.createEAttribute(this.staleDataDTOEClass, 4);
        this.createEAttribute(this.staleDataDTOEClass, 5);
        this.createEAttribute(this.problemChangeSetsDTOEClass = this.createEClass(10), 0);
        this.createEAttribute(this.problemChangeSetsDTOEClass, 1);
        this.createEAttribute(this.problemChangeSetsDTOEClass, 2);
        this.createEAttribute(this.problemChangeSetsDTOEClass, 3);
        this.createEAttribute(this.gapChangeSetsDTOEClass = this.createEClass(11), 0);
        this.createEAttribute(this.gapChangeSetsDTOEClass, 1);
        this.createEAttribute(this.gapChangeSetsDTOEClass, 2);
        this.createEAttribute(this.gapChangeSetsDTOEClass, 3);
        this.createEAttribute(this.gapChangeSetsDTOEClass, 4);
        this.createEReference(this.structuredUpdateReportDTOEClass = this.createEClass(12), 0);
        this.createEAttribute(this.structuredUpdateReportDTOEClass, 1);
        this.createEAttribute(this.structuredUpdateReportDTOEClass, 2);
        this.createEAttribute(this.structuredUpdateReportDTOEClass, 3);
        this.createEAttribute(this.structuredUpdateReportDTOEClass, 4);
        this.createEAttribute(this.structuredUpdateReportDTOEClass, 5);
        this.createEReference(this.structuredComponentUpdateReportDTOEClass = this.createEClass(13), 0);
        this.createEAttribute(this.structuredComponentUpdateReportDTOEClass, 1);
        this.createEAttribute(this.structuredComponentUpdateReportDTOEClass, 2);
        this.createEAttribute(this.structuredComponentUpdateReportDTOEClass, 3);
        this.createEAttribute(this.structuredComponentUpdateReportDTOEClass, 4);
        this.createEReference(this.structuredComponentUpdateReportDTOEClass, 5);
        this.createEAttribute(this.structuredBaselineUpdateReportDTOEClass = this.createEClass(14), 0);
        this.createEAttribute(this.structuredBaselineUpdateReportDTOEClass, 1);
        this.createEAttribute(this.structuredBaselineUpdateReportDTOEClass, 2);
        this.createEReference(this.backupInShedDTOEClass = this.createEClass(15), 0);
        this.createEAttribute(this.backupInShedDTOEClass, 1);
        this.createEAttribute(this.removeChangeRequestDTOEClass = this.createEClass(16), 0);
        this.createEAttribute(this.removeChangeRequestDTOEClass, 1);
        this.createEAttribute(this.associateChangeRequestInfoDTOEClass = this.createEClass(17), 0);
        this.createEAttribute(this.associateChangeRequestInfoDTOEClass, 1);
        this.createEAttribute(this.associateChangeRequestInfoDTOEClass, 2);
        this.createEAttribute(this.addChangeRequestDTOEClass = this.createEClass(18), 0);
        this.createEAttribute(this.addChangeRequestDTOEClass, 1);
        this.createEAttribute(this.deliveryRequiresHistoryReorderingDTOEClass = this.createEClass(19), 0);
        this.createEAttribute(this.deliveryRequiresHistoryReorderingDTOEClass, 1);
        this.createEAttribute(this.deliveryRequiresHistoryReorderingDTOEClass, 2);
        this.createEReference(this.completeChangeSetsResultDTOEClass = this.createEClass(20), 1);
        this.createEAttribute(this.completeChangeSetsResultDTOEClass, 2);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("changeset");
        this.setNsPrefix("filesystemRestClientDTOchangeset");
        this.setNsURI("com.ibm.team.filesystem.rest.client.changeset");
        final FilesystemRestClientDTOdilemmaPackage theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        final FilesystemRestClientDTOlocksPackage theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks");
        final FilesystemRestClientDTOsyncPackage theFilesystemRestClientDTOsyncPackage = (FilesystemRestClientDTOsyncPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync");
        final FilesystemRestClientDTOpatchPackage theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch");
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.repository");
        this.completeChangeSetsResultDTOEClass.getESuperTypes().add((Object)theRepositoryPackage.getHelper());
        this.initEClass(this.checkInResultDTOEClass, (Class)CheckInResultDTO.class, "CheckInResultDTO", false, false, true);
        this.initEAttribute(this.getCheckInResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)CheckInResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getCheckInResultDTO_ChangeSetsCommitted(), (EClassifier)this.ecorePackage.getEString(), "changeSetsCommitted", (String)null, 1, -1, (Class)CheckInResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getCheckInResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)CheckInResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCheckInResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)CheckInResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCheckInResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)CheckInResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCheckInResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)CheckInResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.suspendResultDTOEClass, (Class)SuspendResultDTO.class, "SuspendResultDTO", false, false, true);
        this.initEAttribute(this.getSuspendResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)SuspendResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getSuspendResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)SuspendResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getSuspendResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)SuspendResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getSuspendResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)SuspendResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getSuspendResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)SuspendResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getSuspendResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)SuspendResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getSuspendResultDTO_LocksToRelease(), (EClassifier)theFilesystemRestClientDTOlocksPackage.getStreamLockReportDTO(), (EReference)null, "locksToRelease", (String)null, 0, -1, (Class)SuspendResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.resumeResultDTOEClass, (Class)ResumeResultDTO.class, "ResumeResultDTO", false, false, true);
        this.initEReference(this.getResumeResultDTO_ActiveChangeSetsOverlap(), (EClassifier)this.getProblemChangeSetsDTO(), (EReference)null, "activeChangeSetsOverlap", (String)null, 0, -1, (Class)ResumeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getResumeResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)ResumeResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getResumeResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)ResumeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResumeResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)ResumeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResumeResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)ResumeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResumeResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)ResumeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResumeResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)ResumeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResumeResultDTO_Gap(), (EClassifier)this.getGapChangeSetsDTO(), (EReference)null, "gap", (String)null, 0, -1, (Class)ResumeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResumeResultDTO_ChangeSetsBlockedByPortInProgress(), (EClassifier)this.getProblemChangeSetsDTO(), (EReference)null, "changeSetsBlockedByPortInProgress", (String)null, 0, -1, (Class)ResumeResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getResumeResultDTO_LocksWereHeld(), (EClassifier)theFilesystemRestClientDTOlocksPackage.getStreamLockReportDTO(), (EReference)null, "locksWereHeld", (String)null, 0, -1, (Class)ResumeResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getResumeResultDTO_LocksToAcquire(), (EClassifier)theFilesystemRestClientDTOlocksPackage.getStreamLockReportDTO(), (EReference)null, "locksToAcquire", (String)null, 0, -1, (Class)ResumeResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.discardResultDTOEClass, (Class)DiscardResultDTO.class, "DiscardResultDTO", false, false, true);
        this.initEAttribute(this.getDiscardResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)DiscardResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getDiscardResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)DiscardResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getDiscardResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)DiscardResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getDiscardResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)DiscardResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getDiscardResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)DiscardResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getDiscardResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)DiscardResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getDiscardResultDTO_LocksToRelease(), (EClassifier)theFilesystemRestClientDTOlocksPackage.getStreamLockReportDTO(), (EReference)null, "locksToRelease", (String)null, 0, -1, (Class)DiscardResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.createResultDTOEClass, (Class)CreateResultDTO.class, "CreateResultDTO", false, false, true);
        this.initEAttribute(this.getCreateResultDTO_ChangeSetItemId(), (EClassifier)this.ecorePackage.getEString(), "changeSetItemId", (String)null, 0, 1, (Class)CreateResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.workspaceUpdateResultDTOEClass, (Class)WorkspaceUpdateResultDTO.class, "WorkspaceUpdateResultDTO", false, false, true);
        this.initEAttribute(this.getWorkspaceUpdateResultDTO_AcceptedSuspendedChanges(), (EClassifier)this.ecorePackage.getEBoolean(), "acceptedSuspendedChanges", (String)null, 0, 1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ActiveChangeSets(), (EClassifier)this.getProblemChangeSetsDTO(), (EReference)null, "activeChangeSets", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ActiveChangeSetsOverlap(), (EClassifier)this.getProblemChangeSetsDTO(), (EReference)null, "activeChangeSetsOverlap", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ActiveChangeSetsInComponent(), (EClassifier)this.getProblemChangeSetsDTO(), (EReference)null, "activeChangeSetsInComponent", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getWorkspaceUpdateResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceUpdateResultDTO_ChangeSetsAlreadyInHistory(), (EClassifier)this.ecorePackage.getEBoolean(), "changeSetsAlreadyInHistory", (String)null, 0, 1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ChangeSetsBlockedByPortInProgress(), (EClassifier)this.getProblemChangeSetsDTO(), (EReference)null, "changeSetsBlockedByPortInProgress", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ComponentFlowAdditions(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "componentFlowAdditions", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ComponentFlowDeletions(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "componentFlowDeletions", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ComponentReplacementCandidates(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "componentReplacementCandidates", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ComponentsAdded(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "componentsAdded", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_DisconnectedComponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "disconnectedComponents", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_Gap(), (EClassifier)this.getGapChangeSetsDTO(), (EReference)null, "gap", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_StaleData(), (EClassifier)this.getStaleDataDTO(), (EReference)null, "staleData", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_StructuredResult(), (EClassifier)this.getStructuredUpdateReportDTO(), (EReference)null, "structuredResult", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getWorkspaceUpdateResultDTO_EclipseReadFailureMessage(), (EClassifier)this.ecorePackage.getEString(), "eclipseReadFailureMessage", "\"\"", 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, false, false);
        this.initEReference(this.getWorkspaceUpdateResultDTO_LocksWereHeld(), (EClassifier)theFilesystemRestClientDTOlocksPackage.getStreamLockReportDTO(), (EReference)null, "locksWereHeld", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_LocksToAcquire(), (EClassifier)theFilesystemRestClientDTOlocksPackage.getStreamLockReportDTO(), (EReference)null, "locksToAcquire", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ComponentsWithNWayConflicts(), (EClassifier)theFilesystemRestClientDTOcorePackage.getComponentDTO(), (EReference)null, "componentsWithNWayConflicts", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ComponentsWithConflictingTargets(), (EClassifier)theFilesystemRestClientDTOsyncPackage.getComponentSyncDTO(), (EReference)null, "componentsWithConflictingTargets", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_ComponentsWithMultipleParticipants(), (EClassifier)theFilesystemRestClientDTOsyncPackage.getComponentSyncDTO(), (EReference)null, "componentsWithMultipleParticipants", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_NoBackupBaselinesComponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getComponentDTO(), (EReference)null, "noBackupBaselinesComponents", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_SelectedComponentsInMultipleHierarchies(), (EClassifier)theFilesystemRestClientDTOcorePackage.getComponentDTO(), (EReference)null, "selectedComponentsInMultipleHierarchies", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getWorkspaceUpdateResultDTO_SubcomponentsInMultipleHierarchies(), (EClassifier)theFilesystemRestClientDTOcorePackage.getComponentDTO(), (EReference)null, "subcomponentsInMultipleHierarchies", (String)null, 0, -1, (Class)WorkspaceUpdateResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.undoCheckedInChangesResultDTOEClass, (Class)UndoCheckedInChangesResultDTO.class, "UndoCheckedInChangesResultDTO", false, false, true);
        this.initEAttribute(this.getUndoCheckedInChangesResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)UndoCheckedInChangesResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getUndoCheckedInChangesResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)UndoCheckedInChangesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUndoCheckedInChangesResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)UndoCheckedInChangesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUndoCheckedInChangesResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)UndoCheckedInChangesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUndoCheckedInChangesResultDTO_LocksToRelease(), (EClassifier)theFilesystemRestClientDTOlocksPackage.getStreamLockReportDTO(), (EReference)null, "locksToRelease", (String)null, 0, -1, (Class)UndoCheckedInChangesResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.undoLocalChangesResultDTOEClass, (Class)UndoLocalChangesResultDTO.class, "UndoLocalChangesResultDTO", false, false, true);
        this.initEAttribute(this.getUndoLocalChangesResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)UndoLocalChangesResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getUndoLocalChangesResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)UndoLocalChangesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUndoLocalChangesResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)UndoLocalChangesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUndoLocalChangesResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)UndoLocalChangesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUndoLocalChangesResultDTO_LocksToRelease(), (EClassifier)theFilesystemRestClientDTOlocksPackage.getStreamLockReportDTO(), (EReference)null, "locksToRelease", (String)null, 0, -1, (Class)UndoLocalChangesResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.deliverResultDTOEClass, (Class)DeliverResultDTO.class, "DeliverResultDTO", false, false, true);
        this.initEAttribute(this.getDeliverResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getDeliverResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getDeliverResultDTO_ComponentsToFlow(), (EClassifier)this.ecorePackage.getEBoolean(), "componentsToFlow", (String)null, 0, 1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getDeliverResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getDeliverResultDTO_DeliveryRequiresHistoryReordering(), (EClassifier)this.getDeliveryRequiresHistoryReorderingDTO(), (EReference)null, "deliveryRequiresHistoryReordering", (String)null, 0, -1, (Class)DeliverResultDTO.class, false, false, true, false, true, true, false, false, true);
        this.initEAttribute(this.getDeliverResultDTO_FlowToNonDefaultTarget(), (EClassifier)this.ecorePackage.getEBoolean(), "flowToNonDefaultTarget", (String)null, 0, 1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getDeliverResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getDeliverResultDTO_LocksToRelease(), (EClassifier)theFilesystemRestClientDTOlocksPackage.getStreamLockReportDTO(), (EReference)null, "locksToRelease", (String)null, 0, -1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getDeliverResultDTO_LocksWereHeld(), (EClassifier)theFilesystemRestClientDTOlocksPackage.getStreamLockReportDTO(), (EReference)null, "locksWereHeld", (String)null, 0, -1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getDeliverResultDTO_StructuredResult(), (EClassifier)this.getStructuredUpdateReportDTO(), (EReference)null, "structuredResult", (String)null, 0, -1, (Class)DeliverResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getDeliverResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getDeliverResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getDeliverResultDTO_ComponentsWithConflictingTargets(), (EClassifier)theFilesystemRestClientDTOsyncPackage.getComponentSyncDTO(), (EReference)null, "componentsWithConflictingTargets", (String)null, 0, -1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getDeliverResultDTO_ComponentsWithMultipleParticipants(), (EClassifier)theFilesystemRestClientDTOsyncPackage.getComponentSyncDTO(), (EReference)null, "componentsWithMultipleParticipants", (String)null, 0, -1, (Class)DeliverResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.staleDataDTOEClass, (Class)StaleDataDTO.class, "StaleDataDTO", false, false, true);
        this.initEAttribute(this.getStaleDataDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)StaleDataDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStaleDataDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 0, 1, (Class)StaleDataDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStaleDataDTO_SourceRepositoryId(), (EClassifier)this.ecorePackage.getEString(), "sourceRepositoryId", (String)null, 0, 1, (Class)StaleDataDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStaleDataDTO_SourceRepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "sourceRepositoryURL", (String)null, 0, 1, (Class)StaleDataDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStaleDataDTO_SourceWorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "sourceWorkspaceItemId", (String)null, 0, 1, (Class)StaleDataDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStaleDataDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)StaleDataDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.problemChangeSetsDTOEClass, (Class)ProblemChangeSetsDTO.class, "ProblemChangeSetsDTO", false, false, true);
        this.initEAttribute(this.getProblemChangeSetsDTO_ChangeSetItemIds(), (EClassifier)this.ecorePackage.getEString(), "changeSetItemIds", (String)null, 0, -1, (Class)ProblemChangeSetsDTO.class, false, false, true, true, false, false, false, false);
        this.initEAttribute(this.getProblemChangeSetsDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)ProblemChangeSetsDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getProblemChangeSetsDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 0, 1, (Class)ProblemChangeSetsDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getProblemChangeSetsDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)ProblemChangeSetsDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.gapChangeSetsDTOEClass, (Class)GapChangeSetsDTO.class, "GapChangeSetsDTO", false, false, true);
        this.initEAttribute(this.getGapChangeSetsDTO_ChangeSetItemIds(), (EClassifier)this.ecorePackage.getEString(), "changeSetItemIds", (String)null, 0, -1, (Class)GapChangeSetsDTO.class, false, false, true, true, false, false, false, false);
        this.initEAttribute(this.getGapChangeSetsDTO_HandlingSuspended(), (EClassifier)this.ecorePackage.getEBoolean(), "handlingSuspended", (String)null, 0, 1, (Class)GapChangeSetsDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getGapChangeSetsDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)GapChangeSetsDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getGapChangeSetsDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 0, 1, (Class)GapChangeSetsDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getGapChangeSetsDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)GapChangeSetsDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.structuredUpdateReportDTOEClass, (Class)StructuredUpdateReportDTO.class, "StructuredUpdateReportDTO", false, false, true);
        this.initEReference(this.getStructuredUpdateReportDTO_Components(), (EClassifier)this.getStructuredComponentUpdateReportDTO(), (EReference)null, "components", (String)null, 0, -1, (Class)StructuredUpdateReportDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getStructuredUpdateReportDTO_HasConflicts(), (EClassifier)this.ecorePackage.getEBoolean(), "hasConflicts", (String)null, 0, 1, (Class)StructuredUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStructuredUpdateReportDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)StructuredUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStructuredUpdateReportDTO_RepositoryUrl(), (EClassifier)this.ecorePackage.getEString(), "repositoryUrl", (String)null, 0, 1, (Class)StructuredUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStructuredUpdateReportDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)StructuredUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStructuredUpdateReportDTO_WorkspaceName(), (EClassifier)this.ecorePackage.getEString(), "workspaceName", (String)null, 0, 1, (Class)StructuredUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.structuredComponentUpdateReportDTOEClass, (Class)StructuredComponentUpdateReportDTO.class, "StructuredComponentUpdateReportDTO", false, false, true);
        this.initEReference(this.getStructuredComponentUpdateReportDTO_Baselines(), (EClassifier)this.getStructuredBaselineUpdateReportDTO(), (EReference)null, "baselines", (String)null, 0, -1, (Class)StructuredComponentUpdateReportDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getStructuredComponentUpdateReportDTO_ChangeSetItemIds(), (EClassifier)this.ecorePackage.getEString(), "changeSetItemIds", (String)null, 0, -1, (Class)StructuredComponentUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStructuredComponentUpdateReportDTO_ConflictedItemIds(), (EClassifier)this.ecorePackage.getEString(), "conflictedItemIds", (String)null, 0, -1, (Class)StructuredComponentUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStructuredComponentUpdateReportDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)StructuredComponentUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStructuredComponentUpdateReportDTO_ComponentName(), (EClassifier)this.ecorePackage.getEString(), "componentName", (String)null, 0, 1, (Class)StructuredComponentUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getStructuredComponentUpdateReportDTO_CurrentPatch(), (EClassifier)theFilesystemRestClientDTOpatchPackage.getCurrentPatchDTO(), (EReference)null, "currentPatch", (String)null, 0, 1, (Class)StructuredComponentUpdateReportDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.structuredBaselineUpdateReportDTOEClass, (Class)StructuredBaselineUpdateReportDTO.class, "StructuredBaselineUpdateReportDTO", false, false, true);
        this.initEAttribute(this.getStructuredBaselineUpdateReportDTO_BaselineId(), (EClassifier)this.ecorePackage.getELong(), "baselineId", (String)null, 0, 1, (Class)StructuredBaselineUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStructuredBaselineUpdateReportDTO_BaselineItemId(), (EClassifier)this.ecorePackage.getEString(), "baselineItemId", (String)null, 0, 1, (Class)StructuredBaselineUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStructuredBaselineUpdateReportDTO_BaselineName(), (EClassifier)this.ecorePackage.getEString(), "baselineName", (String)null, 0, 1, (Class)StructuredBaselineUpdateReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.backupInShedDTOEClass, (Class)BackupInShedDTO.class, "BackupInShedDTO", false, false, true);
        this.initEReference(this.getBackupInShedDTO_Shareable(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "shareable", (String)null, 1, 1, (Class)BackupInShedDTO.class, false, false, true, true, false, true, false, false, false);
        this.initEAttribute(this.getBackupInShedDTO_ShedLocation(), (EClassifier)this.ecorePackage.getEString(), "shedLocation", (String)null, 1, 1, (Class)BackupInShedDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.removeChangeRequestDTOEClass, (Class)RemoveChangeRequestDTO.class, "RemoveChangeRequestDTO", false, false, true);
        this.initEAttribute(this.getRemoveChangeRequestDTO_BackLinkRemoved(), (EClassifier)this.ecorePackage.getEBoolean(), "backLinkRemoved", (String)null, 0, 1, (Class)RemoveChangeRequestDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getRemoveChangeRequestDTO_LinkRemoved(), (EClassifier)this.ecorePackage.getEBoolean(), "linkRemoved", (String)null, 0, 1, (Class)RemoveChangeRequestDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.associateChangeRequestInfoDTOEClass, (Class)AssociateChangeRequestInfoDTO.class, "AssociateChangeRequestInfoDTO", false, false, true);
        this.initEAttribute(this.getAssociateChangeRequestInfoDTO_ProjectLinkType(), (EClassifier)this.ecorePackage.getEString(), "projectLinkType", (String)null, 0, 1, (Class)AssociateChangeRequestInfoDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getAssociateChangeRequestInfoDTO_ProjectLinkLabel(), (EClassifier)this.ecorePackage.getEString(), "projectLinkLabel", (String)null, 0, 1, (Class)AssociateChangeRequestInfoDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getAssociateChangeRequestInfoDTO_ProjectLinkTargetServiceUrl(), (EClassifier)this.ecorePackage.getEString(), "projectLinkTargetServiceUrl", (String)null, 0, 1, (Class)AssociateChangeRequestInfoDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.addChangeRequestDTOEClass, (Class)AddChangeRequestDTO.class, "AddChangeRequestDTO", false, false, true);
        this.initEAttribute(this.getAddChangeRequestDTO_LinkAdded(), (EClassifier)this.ecorePackage.getEBoolean(), "linkAdded", (String)null, 0, 1, (Class)AddChangeRequestDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getAddChangeRequestDTO_BackLinkAdded(), (EClassifier)this.ecorePackage.getEBoolean(), "backLinkAdded", (String)null, 0, 1, (Class)AddChangeRequestDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.deliveryRequiresHistoryReorderingDTOEClass, (Class)DeliveryRequiresHistoryReorderingDTO.class, "DeliveryRequiresHistoryReorderingDTO", false, false, true);
        this.initEAttribute(this.getDeliveryRequiresHistoryReorderingDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)DeliveryRequiresHistoryReorderingDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getDeliveryRequiresHistoryReorderingDTO_TargetWorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "targetWorkspaceItemId", (String)null, 0, 1, (Class)DeliveryRequiresHistoryReorderingDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getDeliveryRequiresHistoryReorderingDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)DeliveryRequiresHistoryReorderingDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.completeChangeSetsResultDTOEClass, (Class)CompleteChangeSetsResultDTO.class, "CompleteChangeSetsResultDTO", false, false, true);
        this.initEReference(this.getCompleteChangeSetsResultDTO_TargetChangeSets(), (EClassifier)theFilesystemRestClientDTOcorePackage.getChangeSetDTO(), (EReference)null, "targetChangeSets", (String)null, 0, -1, (Class)CompleteChangeSetsResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getCompleteChangeSetsResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)CompleteChangeSetsResultDTO.class, false, false, true, true, false, true, false, true);
        this.createResource("com.ibm.team.filesystem.rest.client.changeset");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamAttributeAnnotations();
        this.createTeamReferenceAnnotations();
        this.createComAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOchangeset", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.checkInResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.suspendResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.resumeResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.discardResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.createResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.workspaceUpdateResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.undoCheckedInChangesResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.undoLocalChangesResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.deliverResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.staleDataDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.problemChangeSetsDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.gapChangeSetsDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.structuredUpdateReportDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.structuredComponentUpdateReportDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.structuredBaselineUpdateReportDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.backupInShedDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.removeChangeRequestDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.associateChangeRequestInfoDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.addChangeRequestDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.deliveryRequiresHistoryReorderingDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.completeChangeSetsResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getCheckInResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCheckInResultDTO_ChangeSetsCommitted(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSuspendResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDiscardResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateResultDTO_ChangeSetItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_AcceptedSuspendedChanges(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ChangeSetsAlreadyInHistory(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_EclipseReadFailureMessage(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUndoCheckedInChangesResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUndoLocalChangesResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_ComponentsToFlow(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_FlowToNonDefaultTarget(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStaleDataDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStaleDataDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStaleDataDTO_SourceRepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStaleDataDTO_SourceRepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStaleDataDTO_SourceWorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStaleDataDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProblemChangeSetsDTO_ChangeSetItemIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProblemChangeSetsDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProblemChangeSetsDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProblemChangeSetsDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGapChangeSetsDTO_ChangeSetItemIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGapChangeSetsDTO_HandlingSuspended(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGapChangeSetsDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGapChangeSetsDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGapChangeSetsDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredUpdateReportDTO_HasConflicts(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredUpdateReportDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredUpdateReportDTO_RepositoryUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredUpdateReportDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredUpdateReportDTO_WorkspaceName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredComponentUpdateReportDTO_ChangeSetItemIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredComponentUpdateReportDTO_ConflictedItemIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredComponentUpdateReportDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredComponentUpdateReportDTO_ComponentName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredComponentUpdateReportDTO_CurrentPatch(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredBaselineUpdateReportDTO_BaselineId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredBaselineUpdateReportDTO_BaselineItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredBaselineUpdateReportDTO_BaselineName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBackupInShedDTO_ShedLocation(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getRemoveChangeRequestDTO_BackLinkRemoved(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getRemoveChangeRequestDTO_LinkRemoved(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAssociateChangeRequestInfoDTO_ProjectLinkType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAssociateChangeRequestInfoDTO_ProjectLinkLabel(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAssociateChangeRequestInfoDTO_ProjectLinkTargetServiceUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAddChangeRequestDTO_LinkAdded(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAddChangeRequestDTO_BackLinkAdded(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliveryRequiresHistoryReorderingDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliveryRequiresHistoryReorderingDTO_TargetWorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliveryRequiresHistoryReorderingDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompleteChangeSetsResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getCheckInResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCheckInResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCheckInResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCheckInResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSuspendResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSuspendResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSuspendResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSuspendResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSuspendResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSuspendResultDTO_LocksToRelease(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_ActiveChangeSetsOverlap(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_Gap(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_ChangeSetsBlockedByPortInProgress(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_LocksWereHeld(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResumeResultDTO_LocksToAcquire(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDiscardResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDiscardResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDiscardResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDiscardResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDiscardResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDiscardResultDTO_LocksToRelease(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ActiveChangeSets(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ActiveChangeSetsOverlap(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ActiveChangeSetsInComponent(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ChangeSetsBlockedByPortInProgress(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ComponentFlowAdditions(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ComponentFlowDeletions(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ComponentReplacementCandidates(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ComponentsAdded(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_DisconnectedComponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_Gap(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_StaleData(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_StructuredResult(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_LocksWereHeld(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_LocksToAcquire(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ComponentsWithNWayConflicts(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ComponentsWithConflictingTargets(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_ComponentsWithMultipleParticipants(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_NoBackupBaselinesComponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_SelectedComponentsInMultipleHierarchies(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceUpdateResultDTO_SubcomponentsInMultipleHierarchies(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUndoCheckedInChangesResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUndoCheckedInChangesResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUndoCheckedInChangesResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUndoCheckedInChangesResultDTO_LocksToRelease(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUndoLocalChangesResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUndoLocalChangesResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUndoLocalChangesResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUndoLocalChangesResultDTO_LocksToRelease(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_DeliveryRequiresHistoryReordering(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_LocksToRelease(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_LocksWereHeld(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_StructuredResult(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_ComponentsWithConflictingTargets(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeliverResultDTO_ComponentsWithMultipleParticipants(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredUpdateReportDTO_Components(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredComponentUpdateReportDTO_Baselines(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStructuredComponentUpdateReportDTO_CurrentPatch(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBackupInShedDTO_Shareable(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompleteChangeSetsResultDTO_TargetChangeSets(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createComAnnotations() {
        final String source = "com.ibm.team.codegen.helperTypeMarker";
        this.addAnnotation((ENamedElement)this.completeChangeSetsResultDTOEClass, source, new String[0]);
    }
}
