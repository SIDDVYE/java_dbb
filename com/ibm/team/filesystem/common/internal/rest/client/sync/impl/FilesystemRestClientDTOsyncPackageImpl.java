// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.ecore.ENamedElement;
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
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SyncViewDTO;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
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
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.impl.FilesystemRestClientDTOchangesetPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;
import com.ibm.team.filesystem.common.internal.rest.client.share.impl.FilesystemRestClientDTOsharePackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.impl.FilesystemRestClientDTOchangelogPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import com.ibm.team.filesystem.common.internal.rest.client.load.impl.FilesystemRestClientDTOloadPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl.FilesystemRestClientDTOdilemmaPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import com.ibm.team.filesystem.common.internal.rest.client.core.impl.FilesystemRestClientDTOcorePackageImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOsyncPackageImpl extends EPackageImpl implements FilesystemRestClientDTOsyncPackage
{
    private EClass syncViewDTOEClass;
    private EClass workspaceSyncDTOEClass;
    private EClass componentSyncDTOEClass;
    private EClass baselineSyncDTOEClass;
    private EClass changeSetSyncDTOEClass;
    private EClass workItemSyncDTOEClass;
    private EClass changeFolderSyncDTOEClass;
    private EClass changeSyncDTOEClass;
    private EClass unresolvedFolderSyncDTOEClass;
    private EClass conflictSyncDTOEClass;
    private EClass localChangeSyncDTOEClass;
    private EClass ceSyncDTOEClass;
    private EClass ceComponentSyncDTOEClass;
    private EClass ceBaselineSyncDTOEClass;
    private EClass descriptionSyncDTOEClass;
    private EClass descriptionItemSyncDTOEClass;
    private EClass pendingPatchesDTOEClass;
    private EClass syncViewFiltersDTOEClass;
    private EClass mergePatchDTOEClass;
    private EClass acceptAsPatchDTOEClass;
    private EClass getBaselinesDTOEClass;
    private EClass baselineHistoryEntryDTOEClass;
    private EClass sameOccurrenceSyncDTOEClass;
    private EClass sameOccurrencesSyncDTOEClass;
    private EClass getBaselineSetsDTOEClass;
    private EClass outOfSyncWorkspaceDTOEClass;
    private EClass outOfSyncWorkspacesDTOEClass;
    private EClass outOfSyncComponentDTOEClass;
    private EClass verifyInSyncResultDTOEClass;
    private EClass oslcLinkDTOEClass;
    private EClass syncStatusDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOsyncPackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOsyncPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.sync", (EFactory)FilesystemRestClientDTOsyncFactory.eINSTANCE);
        this.syncViewDTOEClass = null;
        this.workspaceSyncDTOEClass = null;
        this.componentSyncDTOEClass = null;
        this.baselineSyncDTOEClass = null;
        this.changeSetSyncDTOEClass = null;
        this.workItemSyncDTOEClass = null;
        this.changeFolderSyncDTOEClass = null;
        this.changeSyncDTOEClass = null;
        this.unresolvedFolderSyncDTOEClass = null;
        this.conflictSyncDTOEClass = null;
        this.localChangeSyncDTOEClass = null;
        this.ceSyncDTOEClass = null;
        this.ceComponentSyncDTOEClass = null;
        this.ceBaselineSyncDTOEClass = null;
        this.descriptionSyncDTOEClass = null;
        this.descriptionItemSyncDTOEClass = null;
        this.pendingPatchesDTOEClass = null;
        this.syncViewFiltersDTOEClass = null;
        this.mergePatchDTOEClass = null;
        this.acceptAsPatchDTOEClass = null;
        this.getBaselinesDTOEClass = null;
        this.baselineHistoryEntryDTOEClass = null;
        this.sameOccurrenceSyncDTOEClass = null;
        this.sameOccurrencesSyncDTOEClass = null;
        this.getBaselineSetsDTOEClass = null;
        this.outOfSyncWorkspaceDTOEClass = null;
        this.outOfSyncWorkspacesDTOEClass = null;
        this.outOfSyncComponentDTOEClass = null;
        this.verifyInSyncResultDTOEClass = null;
        this.oslcLinkDTOEClass = null;
        this.syncStatusDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOsyncPackage init() {
        if (FilesystemRestClientDTOsyncPackageImpl.isInited) {
            return (FilesystemRestClientDTOsyncPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync");
        }
        final FilesystemRestClientDTOsyncPackageImpl theFilesystemRestClientDTOsyncPackage = (FilesystemRestClientDTOsyncPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.sync") instanceof FilesystemRestClientDTOsyncPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.sync") : new FilesystemRestClientDTOsyncPackageImpl());
        FilesystemRestClientDTOsyncPackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") : FilesystemRestClientDTOcorePackage.eINSTANCE);
        final FilesystemRestClientDTOdilemmaPackageImpl theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") instanceof FilesystemRestClientDTOdilemmaPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") : FilesystemRestClientDTOdilemmaPackage.eINSTANCE);
        final FilesystemRestClientDTOloadPackageImpl theFilesystemRestClientDTOloadPackage = (FilesystemRestClientDTOloadPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") instanceof FilesystemRestClientDTOloadPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") : FilesystemRestClientDTOloadPackage.eINSTANCE);
        final FilesystemRestClientDTOchangelogPackageImpl theFilesystemRestClientDTOchangelogPackage = (FilesystemRestClientDTOchangelogPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") instanceof FilesystemRestClientDTOchangelogPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") : FilesystemRestClientDTOchangelogPackage.eINSTANCE);
        final FilesystemRestClientDTOsharePackageImpl theFilesystemRestClientDTOsharePackage = (FilesystemRestClientDTOsharePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") instanceof FilesystemRestClientDTOsharePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") : FilesystemRestClientDTOsharePackage.eINSTANCE);
        final FilesystemRestClientDTOchangesetPackageImpl theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") instanceof FilesystemRestClientDTOchangesetPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") : FilesystemRestClientDTOchangesetPackage.eINSTANCE);
        final FilesystemRestClientDTOresourcePackageImpl theFilesystemRestClientDTOresourcePackage = (FilesystemRestClientDTOresourcePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") instanceof FilesystemRestClientDTOresourcePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") : FilesystemRestClientDTOresourcePackage.eINSTANCE);
        final FilesystemRestClientDTOconflictPackageImpl theFilesystemRestClientDTOconflictPackage = (FilesystemRestClientDTOconflictPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") instanceof FilesystemRestClientDTOconflictPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") : FilesystemRestClientDTOconflictPackage.eINSTANCE);
        final FilesystemRestClientDTOignoresPackageImpl theFilesystemRestClientDTOignoresPackage = (FilesystemRestClientDTOignoresPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") instanceof FilesystemRestClientDTOignoresPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") : FilesystemRestClientDTOignoresPackage.eINSTANCE);
        final FilesystemRestClientDTOworkspacePackageImpl theFilesystemRestClientDTOworkspacePackage = (FilesystemRestClientDTOworkspacePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") instanceof FilesystemRestClientDTOworkspacePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") : FilesystemRestClientDTOworkspacePackage.eINSTANCE);
        final FilesystemRestClientDTOcorruptionPackageImpl theFilesystemRestClientDTOcorruptionPackage = (FilesystemRestClientDTOcorruptionPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") instanceof FilesystemRestClientDTOcorruptionPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") : FilesystemRestClientDTOcorruptionPackage.eINSTANCE);
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") : FilesystemRestClientDTOlocksPackage.eINSTANCE);
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
        theFilesystemRestClientDTOsyncPackage.createPackageContents();
        theFilesystemRestClientDTOcorePackage.createPackageContents();
        theFilesystemRestClientDTOdilemmaPackage.createPackageContents();
        theFilesystemRestClientDTOloadPackage.createPackageContents();
        theFilesystemRestClientDTOchangelogPackage.createPackageContents();
        theFilesystemRestClientDTOsharePackage.createPackageContents();
        theFilesystemRestClientDTOchangesetPackage.createPackageContents();
        theFilesystemRestClientDTOresourcePackage.createPackageContents();
        theFilesystemRestClientDTOconflictPackage.createPackageContents();
        theFilesystemRestClientDTOignoresPackage.createPackageContents();
        theFilesystemRestClientDTOworkspacePackage.createPackageContents();
        theFilesystemRestClientDTOcorruptionPackage.createPackageContents();
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
        theFilesystemRestClientDTOsyncPackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.initializePackageContents();
        theFilesystemRestClientDTOdilemmaPackage.initializePackageContents();
        theFilesystemRestClientDTOloadPackage.initializePackageContents();
        theFilesystemRestClientDTOchangelogPackage.initializePackageContents();
        theFilesystemRestClientDTOsharePackage.initializePackageContents();
        theFilesystemRestClientDTOchangesetPackage.initializePackageContents();
        theFilesystemRestClientDTOresourcePackage.initializePackageContents();
        theFilesystemRestClientDTOconflictPackage.initializePackageContents();
        theFilesystemRestClientDTOignoresPackage.initializePackageContents();
        theFilesystemRestClientDTOworkspacePackage.initializePackageContents();
        theFilesystemRestClientDTOcorruptionPackage.initializePackageContents();
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOsyncPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.sync", (Object)theFilesystemRestClientDTOsyncPackage);
        return theFilesystemRestClientDTOsyncPackage;
    }
    
    public EClass getSyncViewDTO() {
        return this.syncViewDTOEClass;
    }
    
    public EReference getSyncViewDTO_Workspaces() {
        return (EReference)this.syncViewDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getSyncViewDTO_Id() {
        return (EAttribute)this.syncViewDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getWorkspaceSyncDTO() {
        return this.workspaceSyncDTOEClass;
    }
    
    public EAttribute getWorkspaceSyncDTO_WorkspaceName() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EAttribute getWorkspaceSyncDTO_IsStream() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EAttribute getWorkspaceSyncDTO_RepositoryUrl() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getWorkspaceSyncDTO_RepositoryLoggedIn() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getWorkspaceSyncDTO_WorkspaceItemId() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getWorkspaceSyncDTO_TargetWorkspaceName() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getWorkspaceSyncDTO_TargetRepositoryUrl() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getWorkspaceSyncDTO_TargetWorkspaceItemId() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getWorkspaceSyncDTO_TargetRepositoryLoggedIn() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getWorkspaceSyncDTO_TargetRepositoryId() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getWorkspaceSyncDTO_Components() {
        return (EReference)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getWorkspaceSyncDTO_Id() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getWorkspaceSyncDTO_RepositoryId() {
        return (EAttribute)this.workspaceSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getComponentSyncDTO() {
        return this.componentSyncDTOEClass;
    }
    
    public EAttribute getComponentSyncDTO_ComponentName() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getComponentSyncDTO_ComponentItemId() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getComponentSyncDTO_OutgoingChangeSetsAfterBasis() {
        return (EReference)this.componentSyncDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EReference getComponentSyncDTO_OutgoingBaselines() {
        return (EReference)this.componentSyncDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EReference getComponentSyncDTO_IncomingChangeSetsAfterBasis() {
        return (EReference)this.componentSyncDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getComponentSyncDTO_IncomingBaselines() {
        return (EReference)this.componentSyncDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getComponentSyncDTO_Suspended() {
        return (EReference)this.componentSyncDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EAttribute getComponentSyncDTO_LocalRepositoryId() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EAttribute getComponentSyncDTO_LocalRepositoryUrl() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(14);
    }
    
    public EAttribute getComponentSyncDTO_LocalRepositoryLoggedIn() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(15);
    }
    
    public EAttribute getComponentSyncDTO_LocalWorkspaceItemId() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(16);
    }
    
    public EAttribute getComponentSyncDTO_LocalWorkspaceName() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(17);
    }
    
    public EAttribute getComponentSyncDTO_TargetRepositoryId() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(21);
    }
    
    public EReference getComponentSyncDTO_Unresolved() {
        return (EReference)this.componentSyncDTOEClass.getEStructuralFeatures().get(29);
    }
    
    public EAttribute getComponentSyncDTO_IsTargetStream() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(28);
    }
    
    public EReference getComponentSyncDTO_CurrentPatch() {
        return (EReference)this.componentSyncDTOEClass.getEStructuralFeatures().get(30);
    }
    
    public EAttribute getComponentSyncDTO_AcceptQueueSize() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(31);
    }
    
    public EReference getComponentSyncDTO_LocalBaseline() {
        return (EReference)this.componentSyncDTOEClass.getEStructuralFeatures().get(32);
    }
    
    public EReference getComponentSyncDTO_RemoteBaseline() {
        return (EReference)this.componentSyncDTOEClass.getEStructuralFeatures().get(33);
    }
    
    public EAttribute getComponentSyncDTO_TargetRepositoryUrl() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(22);
    }
    
    public EAttribute getComponentSyncDTO_TargetRepositoryLoggedIn() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(23);
    }
    
    public EAttribute getComponentSyncDTO_TargetWorkspaceItemId() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(24);
    }
    
    public EAttribute getComponentSyncDTO_TargetWorkspaceName() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(25);
    }
    
    public EAttribute getComponentSyncDTO_CurrentOutgoingChangeSetItemId() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getComponentSyncDTO_PrivateType() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getComponentSyncDTO_BothType() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getComponentSyncDTO_LocalAddedType() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(18);
    }
    
    public EAttribute getComponentSyncDTO_LocalRemovedType() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(19);
    }
    
    public EAttribute getComponentSyncDTO_IslocalStream() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(20);
    }
    
    public EAttribute getComponentSyncDTO_TargetAddedType() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(26);
    }
    
    public EAttribute getComponentSyncDTO_TargetRemovedType() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(27);
    }
    
    public EAttribute getComponentSyncDTO_Replaced() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EAttribute getComponentSyncDTO_Id() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getComponentSyncDTO_Loaded() {
        return (EAttribute)this.componentSyncDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EClass getBaselineSyncDTO() {
        return this.baselineSyncDTOEClass;
    }
    
    public EAttribute getBaselineSyncDTO_BaselineName() {
        return (EAttribute)this.baselineSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getBaselineSyncDTO_BaselineItemId() {
        return (EAttribute)this.baselineSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getBaselineSyncDTO_PreviousBaselineItemId() {
        return (EAttribute)this.baselineSyncDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getBaselineSyncDTO_ChangeSetsResolved() {
        return (EAttribute)this.baselineSyncDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getBaselineSyncDTO_ChangeSets() {
        return (EReference)this.baselineSyncDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getBaselineSyncDTO_PreviousBaselineName() {
        return (EAttribute)this.baselineSyncDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getBaselineSyncDTO_Id() {
        return (EAttribute)this.baselineSyncDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getBaselineSyncDTO_CreationDate() {
        return (EAttribute)this.baselineSyncDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getBaselineSyncDTO_BaselineId() {
        return (EAttribute)this.baselineSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getChangeSetSyncDTO() {
        return this.changeSetSyncDTOEClass;
    }
    
    public EAttribute getChangeSetSyncDTO_ChangeSetComment() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getChangeSetSyncDTO_ChangeSetItemId() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getChangeSetSyncDTO_WorkItems() {
        return (EReference)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(16);
    }
    
    public EReference getChangeSetSyncDTO_Source() {
        return (EReference)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(17);
    }
    
    public EReference getChangeSetSyncDTO_OriginalSource() {
        return (EReference)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(18);
    }
    
    public EAttribute getChangeSetSyncDTO_LinkedToChangeSetInOtherDirection() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(19);
    }
    
    public EReference getChangeSetSyncDTO_Changes() {
        return (EReference)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getChangeSetSyncDTO_HiddenChanges() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getChangeSetSyncDTO_InaccessibleChanges() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getChangeSetSyncDTO_IsActive() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getChangeSetSyncDTO_AuthorContributorItemId() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getChangeSetSyncDTO_LastChangeFormattedDate() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EAttribute getChangeSetSyncDTO_LastChangeDate() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EAttribute getChangeSetSyncDTO_AuthorContributorName() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getChangeSetSyncDTO_ComponentItemId() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getChangeSetSyncDTO_ComponentName() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getChangeSetSyncDTO_RepositoryUrl() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(15);
    }
    
    public EAttribute getChangeSetSyncDTO_Id() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EReference getChangeSetSyncDTO_OslcLinks() {
        return (EReference)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EAttribute getChangeSetSyncDTO_RepositoryId() {
        return (EAttribute)this.changeSetSyncDTOEClass.getEStructuralFeatures().get(14);
    }
    
    public EClass getWorkItemSyncDTO() {
        return this.workItemSyncDTOEClass;
    }
    
    public EAttribute getWorkItemSyncDTO_Label() {
        return (EAttribute)this.workItemSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getWorkItemSyncDTO_WorkItemItemId() {
        return (EAttribute)this.workItemSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getWorkItemSyncDTO_Id() {
        return (EAttribute)this.workItemSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getChangeFolderSyncDTO() {
        return this.changeFolderSyncDTOEClass;
    }
    
    public EAttribute getChangeFolderSyncDTO_Path() {
        return (EAttribute)this.changeFolderSyncDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getChangeFolderSyncDTO_Changes() {
        return (EReference)this.changeFolderSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getChangeFolderSyncDTO_FolderChange() {
        return (EReference)this.changeFolderSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getChangeFolderSyncDTO_Id() {
        return (EAttribute)this.changeFolderSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getChangeSyncDTO() {
        return this.changeSyncDTOEClass;
    }
    
    public EAttribute getChangeSyncDTO_VersionableName() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(18);
    }
    
    public EAttribute getChangeSyncDTO_BeforeParentItemId() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(19);
    }
    
    public EAttribute getChangeSyncDTO_AfterParentItemId() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(20);
    }
    
    public EAttribute getChangeSyncDTO_MergeStates() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(21);
    }
    
    public EAttribute getChangeSyncDTO_VersionableItemId() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(16);
    }
    
    public EAttribute getChangeSyncDTO_VersionableItemType() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(17);
    }
    
    public EAttribute getChangeSyncDTO_BeforeStateId() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getChangeSyncDTO_AfterStateId() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getChangeSyncDTO_AddType() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getChangeSyncDTO_DeleteType() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getChangeSyncDTO_ModifyType() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getChangeSyncDTO_NoopType() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EAttribute getChangeSyncDTO_MissingDetails() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getChangeSyncDTO_PathHint() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EAttribute getChangeSyncDTO_NewPathHint() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getChangeSyncDTO_MoveType() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getChangeSyncDTO_PotentialConflict() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EAttribute getChangeSyncDTO_LastMergeState() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getChangeSyncDTO_Id() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getChangeSyncDTO_StartLine() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(15);
    }
    
    public EAttribute getChangeSyncDTO_ContentChange() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getChangeSyncDTO_PropertyChange() {
        return (EAttribute)this.changeSyncDTOEClass.getEStructuralFeatures().get(14);
    }
    
    public EClass getUnresolvedFolderSyncDTO() {
        return this.unresolvedFolderSyncDTOEClass;
    }
    
    public EReference getUnresolvedFolderSyncDTO_Conflicts() {
        return (EReference)this.unresolvedFolderSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getUnresolvedFolderSyncDTO_LocalChanges() {
        return (EReference)this.unresolvedFolderSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getUnresolvedFolderSyncDTO_Path() {
        return (EAttribute)this.unresolvedFolderSyncDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getUnresolvedFolderSyncDTO_Id() {
        return (EAttribute)this.unresolvedFolderSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getConflictSyncDTO() {
        return this.conflictSyncDTOEClass;
    }
    
    public EAttribute getConflictSyncDTO_PathHint() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getConflictSyncDTO_VersionableItemId() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(14);
    }
    
    public EAttribute getConflictSyncDTO_VersionableItemType() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(15);
    }
    
    public EAttribute getConflictSyncDTO_ConflictTypeOutgoing() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getConflictSyncDTO_ConflictTypeProposed() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getConflictSyncDTO_NewPathHint() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getConflictSyncDTO_Name() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getConflictSyncDTO_CommonAncestorVersionableStateId() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getConflictSyncDTO_SelectedContributorVersionableStateId() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EAttribute getConflictSyncDTO_OriginalSelectedContributorVersionableStateId() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getConflictSyncDTO_ProposedContributorVersionableStateId() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EAttribute getConflictSyncDTO_Kind() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getConflictSyncDTO_ConflictType() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getConflictSyncDTO_Id() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getConflictSyncDTO_ContentConflict() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getConflictSyncDTO_PropertyConflict() {
        return (EAttribute)this.conflictSyncDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EClass getLocalChangeSyncDTO() {
        return this.localChangeSyncDTOEClass;
    }
    
    public EAttribute getLocalChangeSyncDTO_Name() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getLocalChangeSyncDTO_TargetVersionableItemId() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EAttribute getLocalChangeSyncDTO_VersionableItemType() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EAttribute getLocalChangeSyncDTO_ContentType() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getLocalChangeSyncDTO_AdditionType() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getLocalChangeSyncDTO_DeletionType() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getLocalChangeSyncDTO_MoveType() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getLocalChangeSyncDTO_AttributesType() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getLocalChangeSyncDTO_Path() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getLocalChangeSyncDTO_ResultingPath() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getLocalChangeSyncDTO_OriginalPath() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getLocalChangeSyncDTO_TargetVersionableStateId() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EAttribute getLocalChangeSyncDTO_Id() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getLocalChangeSyncDTO_SandboxPath() {
        return (EAttribute)this.localChangeSyncDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EClass getCESyncDTO() {
        return this.ceSyncDTOEClass;
    }
    
    public EAttribute getCESyncDTO_AddedComponents() {
        return (EAttribute)this.ceSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getCESyncDTO_RemovedComponents() {
        return (EAttribute)this.ceSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getCESyncDTO_ChangedComponents() {
        return (EAttribute)this.ceSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getCEComponentSyncDTO() {
        return this.ceComponentSyncDTOEClass;
    }
    
    public EAttribute getCEComponentSyncDTO_ChangeSets() {
        return (EAttribute)this.ceComponentSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getCEComponentSyncDTO_Baselines() {
        return (EAttribute)this.ceComponentSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getCEBaselineSyncDTO() {
        return this.ceBaselineSyncDTOEClass;
    }
    
    public EAttribute getCEBaselineSyncDTO_ChangeSets() {
        return (EAttribute)this.ceBaselineSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getDescriptionSyncDTO() {
        return this.descriptionSyncDTOEClass;
    }
    
    public EReference getDescriptionSyncDTO_Items() {
        return (EReference)this.descriptionSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getDescriptionItemSyncDTO() {
        return this.descriptionItemSyncDTOEClass;
    }
    
    public EAttribute getDescriptionItemSyncDTO_Category() {
        return (EAttribute)this.descriptionItemSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getDescriptionItemSyncDTO_Value() {
        return (EAttribute)this.descriptionItemSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getPendingPatchesDTO() {
        return this.pendingPatchesDTOEClass;
    }
    
    public EReference getPendingPatchesDTO_Patches() {
        return (EReference)this.pendingPatchesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getSyncViewFiltersDTO() {
        return this.syncViewFiltersDTOEClass;
    }
    
    public EAttribute getSyncViewFiltersDTO_MaxNumberChangesShownInChangeSet() {
        return (EAttribute)this.syncViewFiltersDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getSyncViewFiltersDTO_AllFlowTargets() {
        return (EAttribute)this.syncViewFiltersDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getSyncViewFiltersDTO_MaxNumberChangesShownInChangeSetDefault() {
        return (EAttribute)this.syncViewFiltersDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getSyncViewFiltersDTO_AllFlowTargetsDefault() {
        return (EAttribute)this.syncViewFiltersDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getSyncViewFiltersDTO_ShowAllBaselines() {
        return (EAttribute)this.syncViewFiltersDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getSyncViewFiltersDTO_ShowAllBaselinesDefault() {
        return (EAttribute)this.syncViewFiltersDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getMergePatchDTO() {
        return this.mergePatchDTOEClass;
    }
    
    public EAttribute getMergePatchDTO_SomeHunksMatched() {
        return (EAttribute)this.mergePatchDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getMergePatchDTO_SomeHunksFailed() {
        return (EAttribute)this.mergePatchDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getAcceptAsPatchDTO() {
        return this.acceptAsPatchDTOEClass;
    }
    
    public EAttribute getAcceptAsPatchDTO_PendingPatchIds() {
        return (EAttribute)this.acceptAsPatchDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getGetBaselinesDTO() {
        return this.getBaselinesDTOEClass;
    }
    
    public EAttribute getGetBaselinesDTO_TotalEntries() {
        return (EAttribute)this.getBaselinesDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getGetBaselinesDTO_BaselineHistoryEntriesInWorkspace() {
        return (EReference)this.getBaselinesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getGetBaselinesDTO_BaselinesInRepository() {
        return (EReference)this.getBaselinesDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getBaselineHistoryEntryDTO() {
        return this.baselineHistoryEntryDTOEClass;
    }
    
    public EAttribute getBaselineHistoryEntryDTO_DeliveredByItemId() {
        return (EAttribute)this.baselineHistoryEntryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getBaselineHistoryEntryDTO_DeliveryDate() {
        return (EAttribute)this.baselineHistoryEntryDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getBaselineHistoryEntryDTO_Baseline() {
        return (EReference)this.baselineHistoryEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getSameOccurrenceSyncDTO() {
        return this.sameOccurrenceSyncDTOEClass;
    }
    
    public EAttribute getSameOccurrenceSyncDTO_Id() {
        return (EAttribute)this.sameOccurrenceSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getSameOccurrenceSyncDTO_Outgoing() {
        return (EAttribute)this.sameOccurrenceSyncDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getSameOccurrenceSyncDTO_Incoming() {
        return (EAttribute)this.sameOccurrenceSyncDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getSameOccurrenceSyncDTO_Suspended() {
        return (EAttribute)this.sameOccurrenceSyncDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getSameOccurrenceSyncDTO_Unresolved() {
        return (EAttribute)this.sameOccurrenceSyncDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EClass getSameOccurrencesSyncDTO() {
        return this.sameOccurrencesSyncDTOEClass;
    }
    
    public EReference getSameOccurrencesSyncDTO_Occurrences() {
        return (EReference)this.sameOccurrencesSyncDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getGetBaselineSetsDTO() {
        return this.getBaselineSetsDTOEClass;
    }
    
    public EReference getGetBaselineSetsDTO_BaselineSets() {
        return (EReference)this.getBaselineSetsDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getOutOfSyncWorkspaceDTO() {
        return this.outOfSyncWorkspaceDTOEClass;
    }
    
    public EAttribute getOutOfSyncWorkspaceDTO_RepositoryUrl() {
        return (EAttribute)this.outOfSyncWorkspaceDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getOutOfSyncWorkspaceDTO_WorkspaceItemId() {
        return (EAttribute)this.outOfSyncWorkspaceDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getOutOfSyncWorkspaceDTO_Components() {
        return (EReference)this.outOfSyncWorkspaceDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getOutOfSyncWorkspaceDTO_RepositoryId() {
        return (EAttribute)this.outOfSyncWorkspaceDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getOutOfSyncWorkspacesDTO() {
        return this.outOfSyncWorkspacesDTOEClass;
    }
    
    public EReference getOutOfSyncWorkspacesDTO_Workspaces() {
        return (EReference)this.outOfSyncWorkspacesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getOutOfSyncComponentDTO() {
        return this.outOfSyncComponentDTOEClass;
    }
    
    public EAttribute getOutOfSyncComponentDTO_ComponentItemId() {
        return (EAttribute)this.outOfSyncComponentDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getOutOfSyncComponentDTO_OutOfSyncSharesCount() {
        return (EAttribute)this.outOfSyncComponentDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getOutOfSyncComponentDTO_OutOfSyncShares() {
        return (EReference)this.outOfSyncComponentDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getVerifyInSyncResultDTO() {
        return this.verifyInSyncResultDTOEClass;
    }
    
    public EAttribute getVerifyInSyncResultDTO_Cancelled() {
        return (EAttribute)this.verifyInSyncResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getVerifyInSyncResultDTO_OutOfSyncShares() {
        return (EReference)this.verifyInSyncResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getVerifyInSyncResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.verifyInSyncResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getOslcLinkDTO() {
        return this.oslcLinkDTOEClass;
    }
    
    public EAttribute getOslcLinkDTO_TargetUri() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getOslcLinkDTO_LinkTypeId() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getOslcLinkDTO_TargetExtraInfo() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getOslcLinkDTO_TargetContentType() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getOslcLinkDTO_TargetRepositoryId() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getOslcLinkDTO_LocalDescription() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getOslcLinkDTO_RepositoryId() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getOslcLinkDTO_ResolvedDescription() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getOslcLinkDTO_ResolvedIconUri() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getOslcLinkDTO_RepositoryUrl() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getOslcLinkDTO_TargetRepositoryUrl() {
        return (EAttribute)this.oslcLinkDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EClass getSyncStatusDTO() {
        return this.syncStatusDTOEClass;
    }
    
    public EAttribute getSyncStatusDTO_NLocal() {
        return (EAttribute)this.syncStatusDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getSyncStatusDTO_NIncomingBaselines() {
        return (EAttribute)this.syncStatusDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getSyncStatusDTO_NIncoming() {
        return (EAttribute)this.syncStatusDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getSyncStatusDTO_NOutgoingBaselines() {
        return (EAttribute)this.syncStatusDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getSyncStatusDTO_NOutgoing() {
        return (EAttribute)this.syncStatusDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getSyncStatusDTO_NConflict() {
        return (EAttribute)this.syncStatusDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getSyncStatusDTO_NCollision() {
        return (EAttribute)this.syncStatusDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getSyncStatusDTO_NComponentChanges() {
        return (EAttribute)this.syncStatusDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public FilesystemRestClientDTOsyncFactory getFilesystemRestClientDTOsyncFactory() {
        return (FilesystemRestClientDTOsyncFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEAttribute(this.syncViewDTOEClass = this.createEClass(0), 0);
        this.createEReference(this.syncViewDTOEClass, 1);
        this.createEReference(this.workspaceSyncDTOEClass = this.createEClass(1), 0);
        this.createEAttribute(this.workspaceSyncDTOEClass, 1);
        this.createEAttribute(this.workspaceSyncDTOEClass, 2);
        this.createEAttribute(this.workspaceSyncDTOEClass, 3);
        this.createEAttribute(this.workspaceSyncDTOEClass, 4);
        this.createEAttribute(this.workspaceSyncDTOEClass, 5);
        this.createEAttribute(this.workspaceSyncDTOEClass, 6);
        this.createEAttribute(this.workspaceSyncDTOEClass, 7);
        this.createEAttribute(this.workspaceSyncDTOEClass, 8);
        this.createEAttribute(this.workspaceSyncDTOEClass, 9);
        this.createEAttribute(this.workspaceSyncDTOEClass, 10);
        this.createEAttribute(this.workspaceSyncDTOEClass, 11);
        this.createEAttribute(this.workspaceSyncDTOEClass, 12);
        this.createEAttribute(this.componentSyncDTOEClass = this.createEClass(2), 0);
        this.createEAttribute(this.componentSyncDTOEClass, 1);
        this.createEAttribute(this.componentSyncDTOEClass, 2);
        this.createEAttribute(this.componentSyncDTOEClass, 3);
        this.createEAttribute(this.componentSyncDTOEClass, 4);
        this.createEReference(this.componentSyncDTOEClass, 5);
        this.createEReference(this.componentSyncDTOEClass, 6);
        this.createEReference(this.componentSyncDTOEClass, 7);
        this.createEReference(this.componentSyncDTOEClass, 8);
        this.createEAttribute(this.componentSyncDTOEClass, 9);
        this.createEAttribute(this.componentSyncDTOEClass, 10);
        this.createEAttribute(this.componentSyncDTOEClass, 11);
        this.createEReference(this.componentSyncDTOEClass, 12);
        this.createEAttribute(this.componentSyncDTOEClass, 13);
        this.createEAttribute(this.componentSyncDTOEClass, 14);
        this.createEAttribute(this.componentSyncDTOEClass, 15);
        this.createEAttribute(this.componentSyncDTOEClass, 16);
        this.createEAttribute(this.componentSyncDTOEClass, 17);
        this.createEAttribute(this.componentSyncDTOEClass, 18);
        this.createEAttribute(this.componentSyncDTOEClass, 19);
        this.createEAttribute(this.componentSyncDTOEClass, 20);
        this.createEAttribute(this.componentSyncDTOEClass, 21);
        this.createEAttribute(this.componentSyncDTOEClass, 22);
        this.createEAttribute(this.componentSyncDTOEClass, 23);
        this.createEAttribute(this.componentSyncDTOEClass, 24);
        this.createEAttribute(this.componentSyncDTOEClass, 25);
        this.createEAttribute(this.componentSyncDTOEClass, 26);
        this.createEAttribute(this.componentSyncDTOEClass, 27);
        this.createEAttribute(this.componentSyncDTOEClass, 28);
        this.createEReference(this.componentSyncDTOEClass, 29);
        this.createEReference(this.componentSyncDTOEClass, 30);
        this.createEAttribute(this.componentSyncDTOEClass, 31);
        this.createEReference(this.componentSyncDTOEClass, 32);
        this.createEReference(this.componentSyncDTOEClass, 33);
        this.createEAttribute(this.baselineSyncDTOEClass = this.createEClass(3), 0);
        this.createEAttribute(this.baselineSyncDTOEClass, 1);
        this.createEAttribute(this.baselineSyncDTOEClass, 2);
        this.createEReference(this.baselineSyncDTOEClass, 3);
        this.createEAttribute(this.baselineSyncDTOEClass, 4);
        this.createEAttribute(this.baselineSyncDTOEClass, 5);
        this.createEAttribute(this.baselineSyncDTOEClass, 6);
        this.createEAttribute(this.baselineSyncDTOEClass, 7);
        this.createEAttribute(this.baselineSyncDTOEClass, 8);
        this.createEAttribute(this.changeSetSyncDTOEClass = this.createEClass(4), 0);
        this.createEAttribute(this.changeSetSyncDTOEClass, 1);
        this.createEAttribute(this.changeSetSyncDTOEClass, 2);
        this.createEAttribute(this.changeSetSyncDTOEClass, 3);
        this.createEReference(this.changeSetSyncDTOEClass, 4);
        this.createEAttribute(this.changeSetSyncDTOEClass, 5);
        this.createEAttribute(this.changeSetSyncDTOEClass, 6);
        this.createEAttribute(this.changeSetSyncDTOEClass, 7);
        this.createEAttribute(this.changeSetSyncDTOEClass, 8);
        this.createEAttribute(this.changeSetSyncDTOEClass, 9);
        this.createEAttribute(this.changeSetSyncDTOEClass, 10);
        this.createEAttribute(this.changeSetSyncDTOEClass, 11);
        this.createEAttribute(this.changeSetSyncDTOEClass, 12);
        this.createEReference(this.changeSetSyncDTOEClass, 13);
        this.createEAttribute(this.changeSetSyncDTOEClass, 14);
        this.createEAttribute(this.changeSetSyncDTOEClass, 15);
        this.createEReference(this.changeSetSyncDTOEClass, 16);
        this.createEReference(this.changeSetSyncDTOEClass, 17);
        this.createEReference(this.changeSetSyncDTOEClass, 18);
        this.createEAttribute(this.changeSetSyncDTOEClass, 19);
        this.createEAttribute(this.workItemSyncDTOEClass = this.createEClass(5), 0);
        this.createEAttribute(this.workItemSyncDTOEClass, 1);
        this.createEAttribute(this.workItemSyncDTOEClass, 2);
        this.createEAttribute(this.changeFolderSyncDTOEClass = this.createEClass(6), 0);
        this.createEReference(this.changeFolderSyncDTOEClass, 1);
        this.createEReference(this.changeFolderSyncDTOEClass, 2);
        this.createEAttribute(this.changeFolderSyncDTOEClass, 3);
        this.createEAttribute(this.changeSyncDTOEClass = this.createEClass(7), 0);
        this.createEAttribute(this.changeSyncDTOEClass, 1);
        this.createEAttribute(this.changeSyncDTOEClass, 2);
        this.createEAttribute(this.changeSyncDTOEClass, 3);
        this.createEAttribute(this.changeSyncDTOEClass, 4);
        this.createEAttribute(this.changeSyncDTOEClass, 5);
        this.createEAttribute(this.changeSyncDTOEClass, 6);
        this.createEAttribute(this.changeSyncDTOEClass, 7);
        this.createEAttribute(this.changeSyncDTOEClass, 8);
        this.createEAttribute(this.changeSyncDTOEClass, 9);
        this.createEAttribute(this.changeSyncDTOEClass, 10);
        this.createEAttribute(this.changeSyncDTOEClass, 11);
        this.createEAttribute(this.changeSyncDTOEClass, 12);
        this.createEAttribute(this.changeSyncDTOEClass, 13);
        this.createEAttribute(this.changeSyncDTOEClass, 14);
        this.createEAttribute(this.changeSyncDTOEClass, 15);
        this.createEAttribute(this.changeSyncDTOEClass, 16);
        this.createEAttribute(this.changeSyncDTOEClass, 17);
        this.createEAttribute(this.changeSyncDTOEClass, 18);
        this.createEAttribute(this.changeSyncDTOEClass, 19);
        this.createEAttribute(this.changeSyncDTOEClass, 20);
        this.createEAttribute(this.changeSyncDTOEClass, 21);
        this.createEReference(this.unresolvedFolderSyncDTOEClass = this.createEClass(8), 0);
        this.createEAttribute(this.unresolvedFolderSyncDTOEClass, 1);
        this.createEReference(this.unresolvedFolderSyncDTOEClass, 2);
        this.createEAttribute(this.unresolvedFolderSyncDTOEClass, 3);
        this.createEAttribute(this.conflictSyncDTOEClass = this.createEClass(9), 0);
        this.createEAttribute(this.conflictSyncDTOEClass, 1);
        this.createEAttribute(this.conflictSyncDTOEClass, 2);
        this.createEAttribute(this.conflictSyncDTOEClass, 3);
        this.createEAttribute(this.conflictSyncDTOEClass, 4);
        this.createEAttribute(this.conflictSyncDTOEClass, 5);
        this.createEAttribute(this.conflictSyncDTOEClass, 6);
        this.createEAttribute(this.conflictSyncDTOEClass, 7);
        this.createEAttribute(this.conflictSyncDTOEClass, 8);
        this.createEAttribute(this.conflictSyncDTOEClass, 9);
        this.createEAttribute(this.conflictSyncDTOEClass, 10);
        this.createEAttribute(this.conflictSyncDTOEClass, 11);
        this.createEAttribute(this.conflictSyncDTOEClass, 12);
        this.createEAttribute(this.conflictSyncDTOEClass, 13);
        this.createEAttribute(this.conflictSyncDTOEClass, 14);
        this.createEAttribute(this.conflictSyncDTOEClass, 15);
        this.createEAttribute(this.localChangeSyncDTOEClass = this.createEClass(10), 0);
        this.createEAttribute(this.localChangeSyncDTOEClass, 1);
        this.createEAttribute(this.localChangeSyncDTOEClass, 2);
        this.createEAttribute(this.localChangeSyncDTOEClass, 3);
        this.createEAttribute(this.localChangeSyncDTOEClass, 4);
        this.createEAttribute(this.localChangeSyncDTOEClass, 5);
        this.createEAttribute(this.localChangeSyncDTOEClass, 6);
        this.createEAttribute(this.localChangeSyncDTOEClass, 7);
        this.createEAttribute(this.localChangeSyncDTOEClass, 8);
        this.createEAttribute(this.localChangeSyncDTOEClass, 9);
        this.createEAttribute(this.localChangeSyncDTOEClass, 10);
        this.createEAttribute(this.localChangeSyncDTOEClass, 11);
        this.createEAttribute(this.localChangeSyncDTOEClass, 12);
        this.createEAttribute(this.localChangeSyncDTOEClass, 13);
        this.createEAttribute(this.ceSyncDTOEClass = this.createEClass(11), 0);
        this.createEAttribute(this.ceSyncDTOEClass, 1);
        this.createEAttribute(this.ceSyncDTOEClass, 2);
        this.createEAttribute(this.ceComponentSyncDTOEClass = this.createEClass(12), 0);
        this.createEAttribute(this.ceComponentSyncDTOEClass, 1);
        this.createEAttribute(this.ceBaselineSyncDTOEClass = this.createEClass(13), 0);
        this.createEReference(this.descriptionSyncDTOEClass = this.createEClass(14), 0);
        this.createEAttribute(this.descriptionItemSyncDTOEClass = this.createEClass(15), 0);
        this.createEAttribute(this.descriptionItemSyncDTOEClass, 1);
        this.createEReference(this.pendingPatchesDTOEClass = this.createEClass(16), 0);
        this.createEAttribute(this.syncViewFiltersDTOEClass = this.createEClass(17), 0);
        this.createEAttribute(this.syncViewFiltersDTOEClass, 1);
        this.createEAttribute(this.syncViewFiltersDTOEClass, 2);
        this.createEAttribute(this.syncViewFiltersDTOEClass, 3);
        this.createEAttribute(this.syncViewFiltersDTOEClass, 4);
        this.createEAttribute(this.syncViewFiltersDTOEClass, 5);
        this.createEAttribute(this.mergePatchDTOEClass = this.createEClass(18), 0);
        this.createEAttribute(this.mergePatchDTOEClass, 1);
        this.createEAttribute(this.acceptAsPatchDTOEClass = this.createEClass(19), 0);
        this.createEReference(this.getBaselinesDTOEClass = this.createEClass(20), 0);
        this.createEReference(this.getBaselinesDTOEClass, 1);
        this.createEAttribute(this.getBaselinesDTOEClass, 2);
        this.createEReference(this.baselineHistoryEntryDTOEClass = this.createEClass(21), 0);
        this.createEAttribute(this.baselineHistoryEntryDTOEClass, 1);
        this.createEAttribute(this.baselineHistoryEntryDTOEClass, 2);
        this.createEAttribute(this.sameOccurrenceSyncDTOEClass = this.createEClass(22), 0);
        this.createEAttribute(this.sameOccurrenceSyncDTOEClass, 1);
        this.createEAttribute(this.sameOccurrenceSyncDTOEClass, 2);
        this.createEAttribute(this.sameOccurrenceSyncDTOEClass, 3);
        this.createEAttribute(this.sameOccurrenceSyncDTOEClass, 4);
        this.createEReference(this.sameOccurrencesSyncDTOEClass = this.createEClass(23), 0);
        this.createEReference(this.getBaselineSetsDTOEClass = this.createEClass(24), 0);
        this.createEReference(this.outOfSyncWorkspaceDTOEClass = this.createEClass(25), 0);
        this.createEAttribute(this.outOfSyncWorkspaceDTOEClass, 1);
        this.createEAttribute(this.outOfSyncWorkspaceDTOEClass, 2);
        this.createEAttribute(this.outOfSyncWorkspaceDTOEClass, 3);
        this.createEReference(this.outOfSyncWorkspacesDTOEClass = this.createEClass(26), 0);
        this.createEAttribute(this.outOfSyncComponentDTOEClass = this.createEClass(27), 0);
        this.createEAttribute(this.outOfSyncComponentDTOEClass, 1);
        this.createEReference(this.outOfSyncComponentDTOEClass, 2);
        this.createEAttribute(this.verifyInSyncResultDTOEClass = this.createEClass(28), 0);
        this.createEReference(this.verifyInSyncResultDTOEClass, 1);
        this.createEReference(this.verifyInSyncResultDTOEClass, 2);
        this.createEAttribute(this.oslcLinkDTOEClass = this.createEClass(29), 0);
        this.createEAttribute(this.oslcLinkDTOEClass, 1);
        this.createEAttribute(this.oslcLinkDTOEClass, 2);
        this.createEAttribute(this.oslcLinkDTOEClass, 3);
        this.createEAttribute(this.oslcLinkDTOEClass, 4);
        this.createEAttribute(this.oslcLinkDTOEClass, 5);
        this.createEAttribute(this.oslcLinkDTOEClass, 6);
        this.createEAttribute(this.oslcLinkDTOEClass, 7);
        this.createEAttribute(this.oslcLinkDTOEClass, 8);
        this.createEAttribute(this.oslcLinkDTOEClass, 9);
        this.createEAttribute(this.oslcLinkDTOEClass, 10);
        this.createEAttribute(this.syncStatusDTOEClass = this.createEClass(30), 0);
        this.createEAttribute(this.syncStatusDTOEClass, 1);
        this.createEAttribute(this.syncStatusDTOEClass, 2);
        this.createEAttribute(this.syncStatusDTOEClass, 3);
        this.createEAttribute(this.syncStatusDTOEClass, 4);
        this.createEAttribute(this.syncStatusDTOEClass, 5);
        this.createEAttribute(this.syncStatusDTOEClass, 6);
        this.createEAttribute(this.syncStatusDTOEClass, 7);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("sync");
        this.setNsPrefix("filesystemRestClientDTOsync");
        this.setNsURI("com.ibm.team.filesystem.rest.client.sync");
        final FilesystemRestClientDTOpatchPackage theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        final FilesystemRestClientDTOdilemmaPackage theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma");
        this.initEClass(this.syncViewDTOEClass, (Class)SyncViewDTO.class, "SyncViewDTO", false, false, true);
        this.initEAttribute(this.getSyncViewDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)SyncViewDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getSyncViewDTO_Workspaces(), (EClassifier)this.getWorkspaceSyncDTO(), (EReference)null, "workspaces", (String)null, 0, -1, (Class)SyncViewDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.workspaceSyncDTOEClass, (Class)WorkspaceSyncDTO.class, "WorkspaceSyncDTO", false, false, true);
        this.initEReference(this.getWorkspaceSyncDTO_Components(), (EClassifier)this.getComponentSyncDTO(), (EReference)null, "components", (String)null, 0, -1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_RepositoryUrl(), (EClassifier)this.ecorePackage.getEString(), "repositoryUrl", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_RepositoryLoggedIn(), (EClassifier)this.ecorePackage.getEBoolean(), "repositoryLoggedIn", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_TargetRepositoryLoggedIn(), (EClassifier)this.ecorePackage.getEBoolean(), "targetRepositoryLoggedIn", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_TargetRepositoryId(), (EClassifier)this.ecorePackage.getEString(), "targetRepositoryId", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_TargetRepositoryUrl(), (EClassifier)this.ecorePackage.getEString(), "targetRepositoryUrl", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_TargetWorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "targetWorkspaceItemId", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_TargetWorkspaceName(), (EClassifier)this.ecorePackage.getEString(), "targetWorkspaceName", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_WorkspaceName(), (EClassifier)this.ecorePackage.getEString(), "workspaceName", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceSyncDTO_IsStream(), (EClassifier)this.ecorePackage.getEBoolean(), "isStream", (String)null, 0, 1, (Class)WorkspaceSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.componentSyncDTOEClass, (Class)ComponentSyncDTO.class, "ComponentSyncDTO", false, false, true);
        this.initEAttribute(this.getComponentSyncDTO_BothType(), (EClassifier)this.ecorePackage.getEBoolean(), "bothType", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_ComponentName(), (EClassifier)this.ecorePackage.getEString(), "componentName", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_CurrentOutgoingChangeSetItemId(), (EClassifier)this.ecorePackage.getEString(), "currentOutgoingChangeSetItemId", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getComponentSyncDTO_IncomingBaselines(), (EClassifier)this.getBaselineSyncDTO(), (EReference)null, "incomingBaselines", (String)null, 0, -1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getComponentSyncDTO_IncomingChangeSetsAfterBasis(), (EClassifier)this.getChangeSetSyncDTO(), (EReference)null, "incomingChangeSetsAfterBasis", (String)null, 0, -1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getComponentSyncDTO_OutgoingBaselines(), (EClassifier)this.getBaselineSyncDTO(), (EReference)null, "outgoingBaselines", (String)null, 0, -1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getComponentSyncDTO_OutgoingChangeSetsAfterBasis(), (EClassifier)this.getChangeSetSyncDTO(), (EReference)null, "outgoingChangeSetsAfterBasis", (String)null, 0, -1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_Loaded(), (EClassifier)this.ecorePackage.getEBoolean(), "loaded", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_PrivateType(), (EClassifier)this.ecorePackage.getEBoolean(), "privateType", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_Replaced(), (EClassifier)this.ecorePackage.getEBoolean(), "replaced", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getComponentSyncDTO_Suspended(), (EClassifier)this.getChangeSetSyncDTO(), (EReference)null, "suspended", (String)null, 0, -1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_LocalRepositoryId(), (EClassifier)this.ecorePackage.getEString(), "localRepositoryId", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_LocalRepositoryUrl(), (EClassifier)this.ecorePackage.getEString(), "localRepositoryUrl", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_LocalRepositoryLoggedIn(), (EClassifier)this.ecorePackage.getEBoolean(), "localRepositoryLoggedIn", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_LocalWorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "localWorkspaceItemId", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_LocalWorkspaceName(), (EClassifier)this.ecorePackage.getEString(), "localWorkspaceName", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_LocalAddedType(), (EClassifier)this.ecorePackage.getEBoolean(), "localAddedType", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_LocalRemovedType(), (EClassifier)this.ecorePackage.getEBoolean(), "localRemovedType", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_IslocalStream(), (EClassifier)this.ecorePackage.getEBoolean(), "islocalStream", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_TargetRepositoryId(), (EClassifier)this.ecorePackage.getEString(), "targetRepositoryId", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_TargetRepositoryUrl(), (EClassifier)this.ecorePackage.getEString(), "targetRepositoryUrl", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_TargetRepositoryLoggedIn(), (EClassifier)this.ecorePackage.getEBoolean(), "targetRepositoryLoggedIn", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_TargetWorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "targetWorkspaceItemId", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_TargetWorkspaceName(), (EClassifier)this.ecorePackage.getEString(), "targetWorkspaceName", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_TargetAddedType(), (EClassifier)this.ecorePackage.getEBoolean(), "targetAddedType", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_TargetRemovedType(), (EClassifier)this.ecorePackage.getEBoolean(), "targetRemovedType", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_IsTargetStream(), (EClassifier)this.ecorePackage.getEBoolean(), "isTargetStream", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getComponentSyncDTO_Unresolved(), (EClassifier)this.getUnresolvedFolderSyncDTO(), (EReference)null, "unresolved", (String)null, 0, -1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getComponentSyncDTO_CurrentPatch(), (EClassifier)theFilesystemRestClientDTOpatchPackage.getCurrentPatchDTO(), (EReference)null, "currentPatch", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getComponentSyncDTO_AcceptQueueSize(), (EClassifier)this.ecorePackage.getELong(), "acceptQueueSize", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getComponentSyncDTO_LocalBaseline(), (EClassifier)this.getBaselineSyncDTO(), (EReference)null, "localBaseline", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getComponentSyncDTO_RemoteBaseline(), (EClassifier)this.getBaselineSyncDTO(), (EReference)null, "remoteBaseline", (String)null, 0, 1, (Class)ComponentSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.baselineSyncDTOEClass, (Class)BaselineSyncDTO.class, "BaselineSyncDTO", false, false, true);
        this.initEAttribute(this.getBaselineSyncDTO_BaselineId(), (EClassifier)this.ecorePackage.getEInt(), "baselineId", (String)null, 0, 1, (Class)BaselineSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSyncDTO_BaselineItemId(), (EClassifier)this.ecorePackage.getEString(), "baselineItemId", (String)null, 0, 1, (Class)BaselineSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSyncDTO_BaselineName(), (EClassifier)this.ecorePackage.getEString(), "baselineName", (String)null, 0, 1, (Class)BaselineSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getBaselineSyncDTO_ChangeSets(), (EClassifier)this.getChangeSetSyncDTO(), (EReference)null, "changeSets", (String)null, 0, -1, (Class)BaselineSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getBaselineSyncDTO_ChangeSetsResolved(), (EClassifier)this.ecorePackage.getEBoolean(), "changeSetsResolved", (String)null, 0, 1, (Class)BaselineSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSyncDTO_CreationDate(), (EClassifier)this.ecorePackage.getEString(), "creationDate", (String)null, 0, 1, (Class)BaselineSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getBaselineSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)BaselineSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSyncDTO_PreviousBaselineItemId(), (EClassifier)this.ecorePackage.getEString(), "previousBaselineItemId", (String)null, 0, 1, (Class)BaselineSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSyncDTO_PreviousBaselineName(), (EClassifier)this.ecorePackage.getEString(), "previousBaselineName", (String)null, 0, 1, (Class)BaselineSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.changeSetSyncDTOEClass, (Class)ChangeSetSyncDTO.class, "ChangeSetSyncDTO", false, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_AuthorContributorItemId(), (EClassifier)this.ecorePackage.getEString(), "authorContributorItemId", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_AuthorContributorName(), (EClassifier)this.ecorePackage.getEString(), "authorContributorName", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_ChangeSetComment(), (EClassifier)this.ecorePackage.getEString(), "changeSetComment", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_ChangeSetItemId(), (EClassifier)this.ecorePackage.getEString(), "changeSetItemId", "", 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getChangeSetSyncDTO_Changes(), (EClassifier)this.getChangeFolderSyncDTO(), (EReference)null, "changes", (String)null, 0, -1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_ComponentName(), (EClassifier)this.ecorePackage.getEString(), "componentName", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_HiddenChanges(), (EClassifier)this.ecorePackage.getEInt(), "hiddenChanges", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_InaccessibleChanges(), (EClassifier)this.ecorePackage.getEInt(), "inaccessibleChanges", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_IsActive(), (EClassifier)this.ecorePackage.getEBoolean(), "isActive", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_LastChangeDate(), (EClassifier)this.ecorePackage.getELong(), "lastChangeDate", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_LastChangeFormattedDate(), (EClassifier)this.ecorePackage.getEString(), "lastChangeFormattedDate", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getChangeSetSyncDTO_OslcLinks(), (EClassifier)this.getOslcLinkDTO(), (EReference)null, "oslcLinks", (String)null, 0, -1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_RepositoryUrl(), (EClassifier)this.ecorePackage.getEString(), "repositoryUrl", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getChangeSetSyncDTO_WorkItems(), (EClassifier)this.getWorkItemSyncDTO(), (EReference)null, "workItems", (String)null, 0, -1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getChangeSetSyncDTO_Source(), (EClassifier)theFilesystemRestClientDTOpatchPackage.getChangeSetSourceDTO(), (EReference)null, "source", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getChangeSetSyncDTO_OriginalSource(), (EClassifier)theFilesystemRestClientDTOpatchPackage.getChangeSetSourceDTO(), (EReference)null, "originalSource", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getChangeSetSyncDTO_LinkedToChangeSetInOtherDirection(), (EClassifier)this.ecorePackage.getEBoolean(), "linkedToChangeSetInOtherDirection", (String)null, 0, 1, (Class)ChangeSetSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.workItemSyncDTOEClass, (Class)WorkItemSyncDTO.class, "WorkItemSyncDTO", false, false, true);
        this.initEAttribute(this.getWorkItemSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)WorkItemSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkItemSyncDTO_Label(), (EClassifier)this.ecorePackage.getEString(), "label", (String)null, 0, 1, (Class)WorkItemSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkItemSyncDTO_WorkItemItemId(), (EClassifier)this.ecorePackage.getEString(), "workItemItemId", (String)null, 0, 1, (Class)WorkItemSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.changeFolderSyncDTOEClass, (Class)ChangeFolderSyncDTO.class, "ChangeFolderSyncDTO", false, false, true);
        this.initEAttribute(this.getChangeFolderSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)ChangeFolderSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getChangeFolderSyncDTO_Changes(), (EClassifier)this.getChangeSyncDTO(), (EReference)null, "changes", (String)null, 0, -1, (Class)ChangeFolderSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getChangeFolderSyncDTO_FolderChange(), (EClassifier)this.getChangeSyncDTO(), (EReference)null, "folderChange", (String)null, 0, 1, (Class)ChangeFolderSyncDTO.class, false, false, true, true, false, true, false, false, true);
        this.initEAttribute(this.getChangeFolderSyncDTO_Path(), (EClassifier)this.ecorePackage.getEString(), "path", (String)null, 0, 1, (Class)ChangeFolderSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.changeSyncDTOEClass, (Class)ChangeSyncDTO.class, "ChangeSyncDTO", false, false, true);
        this.initEAttribute(this.getChangeSyncDTO_AddType(), (EClassifier)this.ecorePackage.getEBoolean(), "addType", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_AfterStateId(), (EClassifier)this.ecorePackage.getEString(), "afterStateId", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_BeforeStateId(), (EClassifier)this.ecorePackage.getEString(), "beforeStateId", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_ContentChange(), (EClassifier)this.ecorePackage.getEBoolean(), "contentChange", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_DeleteType(), (EClassifier)this.ecorePackage.getEBoolean(), "deleteType", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_LastMergeState(), (EClassifier)this.ecorePackage.getEString(), "lastMergeState", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getChangeSyncDTO_MissingDetails(), (EClassifier)this.ecorePackage.getEBoolean(), "missingDetails", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_ModifyType(), (EClassifier)this.ecorePackage.getEBoolean(), "modifyType", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_MoveType(), (EClassifier)this.ecorePackage.getEBoolean(), "moveType", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_NewPathHint(), (EClassifier)this.ecorePackage.getEString(), "newPathHint", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_NoopType(), (EClassifier)this.ecorePackage.getEBoolean(), "noopType", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_PathHint(), (EClassifier)this.ecorePackage.getEString(), "pathHint", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_PotentialConflict(), (EClassifier)this.ecorePackage.getEBoolean(), "potentialConflict", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_PropertyChange(), (EClassifier)this.ecorePackage.getEBoolean(), "propertyChange", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_StartLine(), (EClassifier)this.ecorePackage.getEInt(), "startLine", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getChangeSyncDTO_VersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "versionableItemId", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_VersionableItemType(), (EClassifier)this.ecorePackage.getEString(), "versionableItemType", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_VersionableName(), (EClassifier)this.ecorePackage.getEString(), "versionableName", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_BeforeParentItemId(), (EClassifier)this.ecorePackage.getEString(), "beforeParentItemId", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_AfterParentItemId(), (EClassifier)this.ecorePackage.getEString(), "afterParentItemId", (String)null, 0, 1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSyncDTO_MergeStates(), (EClassifier)this.ecorePackage.getEString(), "mergeStates", (String)null, 0, -1, (Class)ChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.unresolvedFolderSyncDTOEClass, (Class)UnresolvedFolderSyncDTO.class, "UnresolvedFolderSyncDTO", false, false, true);
        this.initEReference(this.getUnresolvedFolderSyncDTO_Conflicts(), (EClassifier)this.getConflictSyncDTO(), (EReference)null, "conflicts", (String)null, 0, -1, (Class)UnresolvedFolderSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getUnresolvedFolderSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)UnresolvedFolderSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getUnresolvedFolderSyncDTO_LocalChanges(), (EClassifier)this.getLocalChangeSyncDTO(), (EReference)null, "localChanges", (String)null, 0, -1, (Class)UnresolvedFolderSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getUnresolvedFolderSyncDTO_Path(), (EClassifier)this.ecorePackage.getEString(), "path", (String)null, 0, 1, (Class)UnresolvedFolderSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.conflictSyncDTOEClass, (Class)ConflictSyncDTO.class, "ConflictSyncDTO", false, false, true);
        this.initEAttribute(this.getConflictSyncDTO_CommonAncestorVersionableStateId(), (EClassifier)this.ecorePackage.getEString(), "commonAncestorVersionableStateId", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_ConflictType(), (EClassifier)this.ecorePackage.getEString(), "conflictType", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_ConflictTypeOutgoing(), (EClassifier)this.ecorePackage.getEString(), "conflictTypeOutgoing", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_ConflictTypeProposed(), (EClassifier)this.ecorePackage.getEString(), "conflictTypeProposed", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_ContentConflict(), (EClassifier)this.ecorePackage.getEBoolean(), "contentConflict", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_Kind(), (EClassifier)this.ecorePackage.getEString(), "kind", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_NewPathHint(), (EClassifier)this.ecorePackage.getEString(), "newPathHint", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_OriginalSelectedContributorVersionableStateId(), (EClassifier)this.ecorePackage.getEString(), "originalSelectedContributorVersionableStateId", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_PathHint(), (EClassifier)this.ecorePackage.getEString(), "pathHint", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_PropertyConflict(), (EClassifier)this.ecorePackage.getEBoolean(), "propertyConflict", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_ProposedContributorVersionableStateId(), (EClassifier)this.ecorePackage.getEString(), "proposedContributorVersionableStateId", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_SelectedContributorVersionableStateId(), (EClassifier)this.ecorePackage.getEString(), "selectedContributorVersionableStateId", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_VersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "versionableItemId", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictSyncDTO_VersionableItemType(), (EClassifier)this.ecorePackage.getEString(), "versionableItemType", (String)null, 0, 1, (Class)ConflictSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.localChangeSyncDTOEClass, (Class)LocalChangeSyncDTO.class, "LocalChangeSyncDTO", false, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_AdditionType(), (EClassifier)this.ecorePackage.getEBoolean(), "additionType", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_AttributesType(), (EClassifier)this.ecorePackage.getEBoolean(), "attributesType", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_ContentType(), (EClassifier)this.ecorePackage.getEBoolean(), "contentType", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_DeletionType(), (EClassifier)this.ecorePackage.getEBoolean(), "deletionType", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_MoveType(), (EClassifier)this.ecorePackage.getEBoolean(), "moveType", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_OriginalPath(), (EClassifier)this.ecorePackage.getEString(), "originalPath", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_Path(), (EClassifier)this.ecorePackage.getEString(), "path", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_ResultingPath(), (EClassifier)this.ecorePackage.getEString(), "resultingPath", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_SandboxPath(), (EClassifier)this.ecorePackage.getEString(), "sandboxPath", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_TargetVersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "targetVersionableItemId", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_TargetVersionableStateId(), (EClassifier)this.ecorePackage.getEString(), "targetVersionableStateId", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLocalChangeSyncDTO_VersionableItemType(), (EClassifier)this.ecorePackage.getEString(), "versionableItemType", (String)null, 0, 1, (Class)LocalChangeSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.ceSyncDTOEClass, (Class)CESyncDTO.class, "CESyncDTO", false, false, true);
        this.initEAttribute(this.getCESyncDTO_AddedComponents(), (EClassifier)this.ecorePackage.getEString(), "addedComponents", (String)null, 0, -1, (Class)CESyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getCESyncDTO_ChangedComponents(), (EClassifier)this.ecorePackage.getEString(), "changedComponents", (String)null, 0, -1, (Class)CESyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getCESyncDTO_RemovedComponents(), (EClassifier)this.ecorePackage.getEString(), "removedComponents", (String)null, 0, -1, (Class)CESyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.ceComponentSyncDTOEClass, (Class)CEComponentSyncDTO.class, "CEComponentSyncDTO", false, false, true);
        this.initEAttribute(this.getCEComponentSyncDTO_ChangeSets(), (EClassifier)this.ecorePackage.getEString(), "changeSets", (String)null, 0, -1, (Class)CEComponentSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getCEComponentSyncDTO_Baselines(), (EClassifier)this.ecorePackage.getEString(), "baselines", (String)null, 0, -1, (Class)CEComponentSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.ceBaselineSyncDTOEClass, (Class)CEBaselineSyncDTO.class, "CEBaselineSyncDTO", false, false, true);
        this.initEAttribute(this.getCEBaselineSyncDTO_ChangeSets(), (EClassifier)this.ecorePackage.getEString(), "changeSets", (String)null, 0, -1, (Class)CEBaselineSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.descriptionSyncDTOEClass, (Class)DescriptionSyncDTO.class, "DescriptionSyncDTO", false, false, true);
        this.initEReference(this.getDescriptionSyncDTO_Items(), (EClassifier)this.getDescriptionItemSyncDTO(), (EReference)null, "items", (String)null, 0, -1, (Class)DescriptionSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.descriptionItemSyncDTOEClass, (Class)DescriptionItemSyncDTO.class, "DescriptionItemSyncDTO", false, false, true);
        this.initEAttribute(this.getDescriptionItemSyncDTO_Category(), (EClassifier)this.ecorePackage.getEString(), "category", (String)null, 0, 1, (Class)DescriptionItemSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getDescriptionItemSyncDTO_Value(), (EClassifier)this.ecorePackage.getEString(), "value", (String)null, 0, 1, (Class)DescriptionItemSyncDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.pendingPatchesDTOEClass, (Class)PendingPatchesDTO.class, "PendingPatchesDTO", false, false, true);
        this.initEReference(this.getPendingPatchesDTO_Patches(), (EClassifier)this.getChangeSetSyncDTO(), (EReference)null, "patches", (String)null, 0, -1, (Class)PendingPatchesDTO.class, false, false, true, false, true, true, false, false, true);
        this.initEClass(this.syncViewFiltersDTOEClass, (Class)SyncViewFiltersDTO.class, "SyncViewFiltersDTO", false, false, true);
        this.initEAttribute(this.getSyncViewFiltersDTO_AllFlowTargets(), (EClassifier)this.ecorePackage.getEBoolean(), "allFlowTargets", (String)null, 0, 1, (Class)SyncViewFiltersDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getSyncViewFiltersDTO_AllFlowTargetsDefault(), (EClassifier)this.ecorePackage.getEBoolean(), "allFlowTargetsDefault", (String)null, 0, 1, (Class)SyncViewFiltersDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getSyncViewFiltersDTO_MaxNumberChangesShownInChangeSet(), (EClassifier)this.ecorePackage.getEInt(), "maxNumberChangesShownInChangeSet", (String)null, 0, 1, (Class)SyncViewFiltersDTO.class, false, false, true, true, false, true, false, false);
        this.initEAttribute(this.getSyncViewFiltersDTO_MaxNumberChangesShownInChangeSetDefault(), (EClassifier)this.ecorePackage.getEInt(), "maxNumberChangesShownInChangeSetDefault", (String)null, 0, 1, (Class)SyncViewFiltersDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getSyncViewFiltersDTO_ShowAllBaselines(), (EClassifier)this.ecorePackage.getEBoolean(), "showAllBaselines", (String)null, 0, 1, (Class)SyncViewFiltersDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getSyncViewFiltersDTO_ShowAllBaselinesDefault(), (EClassifier)this.ecorePackage.getEBoolean(), "showAllBaselinesDefault", (String)null, 0, 1, (Class)SyncViewFiltersDTO.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.mergePatchDTOEClass, (Class)MergePatchDTO.class, "MergePatchDTO", false, false, true);
        this.initEAttribute(this.getMergePatchDTO_SomeHunksFailed(), (EClassifier)this.ecorePackage.getEBoolean(), "someHunksFailed", (String)null, 0, 1, (Class)MergePatchDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMergePatchDTO_SomeHunksMatched(), (EClassifier)this.ecorePackage.getEBoolean(), "someHunksMatched", (String)null, 0, 1, (Class)MergePatchDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.acceptAsPatchDTOEClass, (Class)AcceptAsPatchDTO.class, "AcceptAsPatchDTO", false, false, true);
        this.initEAttribute(this.getAcceptAsPatchDTO_PendingPatchIds(), (EClassifier)this.ecorePackage.getEString(), "pendingPatchIds", (String)null, 0, -1, (Class)AcceptAsPatchDTO.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.getBaselinesDTOEClass, (Class)GetBaselinesDTO.class, "GetBaselinesDTO", false, false, true);
        this.initEReference(this.getGetBaselinesDTO_BaselineHistoryEntriesInWorkspace(), (EClassifier)this.getBaselineHistoryEntryDTO(), (EReference)null, "baselineHistoryEntriesInWorkspace", (String)null, 0, -1, (Class)GetBaselinesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getGetBaselinesDTO_BaselinesInRepository(), (EClassifier)theFilesystemRestClientDTOcorePackage.getBaselineDTO(), (EReference)null, "baselinesInRepository", (String)null, 0, -1, (Class)GetBaselinesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getGetBaselinesDTO_TotalEntries(), (EClassifier)this.ecorePackage.getELong(), "totalEntries", (String)null, 0, 1, (Class)GetBaselinesDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.baselineHistoryEntryDTOEClass, (Class)BaselineHistoryEntryDTO.class, "BaselineHistoryEntryDTO", false, false, true);
        this.initEReference(this.getBaselineHistoryEntryDTO_Baseline(), (EClassifier)theFilesystemRestClientDTOcorePackage.getBaselineDTO(), (EReference)null, "baseline", (String)null, 0, 1, (Class)BaselineHistoryEntryDTO.class, false, false, true, true, false, true, false, false, true);
        this.initEAttribute(this.getBaselineHistoryEntryDTO_DeliveredByItemId(), (EClassifier)this.ecorePackage.getEString(), "deliveredByItemId", (String)null, 0, 1, (Class)BaselineHistoryEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineHistoryEntryDTO_DeliveryDate(), (EClassifier)this.ecorePackage.getELong(), "deliveryDate", (String)null, 0, 1, (Class)BaselineHistoryEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.sameOccurrenceSyncDTOEClass, (Class)SameOccurrenceSyncDTO.class, "SameOccurrenceSyncDTO", false, false, true);
        this.initEAttribute(this.getSameOccurrenceSyncDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)SameOccurrenceSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getSameOccurrenceSyncDTO_Incoming(), (EClassifier)this.ecorePackage.getEBoolean(), "incoming", (String)null, 0, 1, (Class)SameOccurrenceSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getSameOccurrenceSyncDTO_Outgoing(), (EClassifier)this.ecorePackage.getEBoolean(), "outgoing", (String)null, 0, 1, (Class)SameOccurrenceSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getSameOccurrenceSyncDTO_Suspended(), (EClassifier)this.ecorePackage.getEBoolean(), "suspended", (String)null, 0, 1, (Class)SameOccurrenceSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getSameOccurrenceSyncDTO_Unresolved(), (EClassifier)this.ecorePackage.getEBoolean(), "unresolved", (String)null, 0, 1, (Class)SameOccurrenceSyncDTO.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.sameOccurrencesSyncDTOEClass, (Class)SameOccurrencesSyncDTO.class, "SameOccurrencesSyncDTO", false, false, true);
        this.initEReference(this.getSameOccurrencesSyncDTO_Occurrences(), (EClassifier)this.getSameOccurrenceSyncDTO(), (EReference)null, "occurrences", (String)null, 0, -1, (Class)SameOccurrencesSyncDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.getBaselineSetsDTOEClass, (Class)GetBaselineSetsDTO.class, "GetBaselineSetsDTO", false, false, true);
        this.initEReference(this.getGetBaselineSetsDTO_BaselineSets(), (EClassifier)theFilesystemRestClientDTOcorePackage.getBaselineSetDTO(), (EReference)null, "baselineSets", (String)null, 0, -1, (Class)GetBaselineSetsDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.outOfSyncWorkspaceDTOEClass, (Class)OutOfSyncWorkspaceDTO.class, "OutOfSyncWorkspaceDTO", false, false, true);
        this.initEReference(this.getOutOfSyncWorkspaceDTO_Components(), (EClassifier)this.getOutOfSyncComponentDTO(), (EReference)null, "components", (String)null, 0, -1, (Class)OutOfSyncWorkspaceDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getOutOfSyncWorkspaceDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)OutOfSyncWorkspaceDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOutOfSyncWorkspaceDTO_RepositoryUrl(), (EClassifier)this.ecorePackage.getEString(), "repositoryUrl", (String)null, 0, 1, (Class)OutOfSyncWorkspaceDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOutOfSyncWorkspaceDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)OutOfSyncWorkspaceDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.outOfSyncWorkspacesDTOEClass, (Class)OutOfSyncWorkspacesDTO.class, "OutOfSyncWorkspacesDTO", false, false, true);
        this.initEReference(this.getOutOfSyncWorkspacesDTO_Workspaces(), (EClassifier)this.getOutOfSyncWorkspaceDTO(), (EReference)null, "workspaces", (String)null, 0, -1, (Class)OutOfSyncWorkspacesDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.outOfSyncComponentDTOEClass, (Class)OutOfSyncComponentDTO.class, "OutOfSyncComponentDTO", false, false, true);
        this.initEAttribute(this.getOutOfSyncComponentDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)OutOfSyncComponentDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOutOfSyncComponentDTO_OutOfSyncSharesCount(), (EClassifier)this.ecorePackage.getEInt(), "outOfSyncSharesCount", (String)null, 0, 1, (Class)OutOfSyncComponentDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getOutOfSyncComponentDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)OutOfSyncComponentDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.verifyInSyncResultDTOEClass, (Class)VerifyInSyncResultDTO.class, "VerifyInSyncResultDTO", false, false, true);
        this.initEAttribute(this.getVerifyInSyncResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)VerifyInSyncResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getVerifyInSyncResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)VerifyInSyncResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getVerifyInSyncResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)VerifyInSyncResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.oslcLinkDTOEClass, (Class)OslcLinkDTO.class, "OslcLinkDTO", false, false, true);
        this.initEAttribute(this.getOslcLinkDTO_LinkTypeId(), (EClassifier)this.ecorePackage.getEString(), "linkTypeId", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOslcLinkDTO_LocalDescription(), (EClassifier)this.ecorePackage.getEString(), "localDescription", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOslcLinkDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOslcLinkDTO_RepositoryUrl(), (EClassifier)this.ecorePackage.getEString(), "repositoryUrl", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOslcLinkDTO_ResolvedDescription(), (EClassifier)this.ecorePackage.getEString(), "resolvedDescription", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOslcLinkDTO_ResolvedIconUri(), (EClassifier)this.ecorePackage.getEString(), "resolvedIconUri", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOslcLinkDTO_TargetExtraInfo(), (EClassifier)this.ecorePackage.getEString(), "targetExtraInfo", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOslcLinkDTO_TargetContentType(), (EClassifier)this.ecorePackage.getEString(), "targetContentType", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOslcLinkDTO_TargetRepositoryId(), (EClassifier)this.ecorePackage.getEString(), "targetRepositoryId", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOslcLinkDTO_TargetRepositoryUrl(), (EClassifier)this.ecorePackage.getEString(), "targetRepositoryUrl", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getOslcLinkDTO_TargetUri(), (EClassifier)this.ecorePackage.getEString(), "targetUri", (String)null, 0, 1, (Class)OslcLinkDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.syncStatusDTOEClass, (Class)SyncStatusDTO.class, "SyncStatusDTO", false, false, true);
        this.initEAttribute(this.getSyncStatusDTO_NCollision(), (EClassifier)this.ecorePackage.getEInt(), "nCollision", (String)null, 0, 1, (Class)SyncStatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSyncStatusDTO_NComponentChanges(), (EClassifier)this.ecorePackage.getEInt(), "nComponentChanges", (String)null, 0, 1, (Class)SyncStatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSyncStatusDTO_NConflict(), (EClassifier)this.ecorePackage.getEInt(), "nConflict", (String)null, 0, 1, (Class)SyncStatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSyncStatusDTO_NIncoming(), (EClassifier)this.ecorePackage.getEInt(), "nIncoming", (String)null, 0, 1, (Class)SyncStatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSyncStatusDTO_NIncomingBaselines(), (EClassifier)this.ecorePackage.getEInt(), "nIncomingBaselines", (String)null, 0, 1, (Class)SyncStatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSyncStatusDTO_NLocal(), (EClassifier)this.ecorePackage.getEInt(), "nLocal", (String)null, 0, 1, (Class)SyncStatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSyncStatusDTO_NOutgoing(), (EClassifier)this.ecorePackage.getEInt(), "nOutgoing", (String)null, 0, 1, (Class)SyncStatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSyncStatusDTO_NOutgoingBaselines(), (EClassifier)this.ecorePackage.getEInt(), "nOutgoingBaselines", (String)null, 0, 1, (Class)SyncStatusDTO.class, false, false, true, true, false, true, false, true);
        this.createResource("com.ibm.team.filesystem.rest.client.sync");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamAttributeAnnotations();
        this.createTeamReferenceAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOsync", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.syncViewDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.workspaceSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.componentSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.baselineSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeSetSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.workItemSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeFolderSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.unresolvedFolderSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.conflictSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.localChangeSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.ceSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.ceComponentSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.ceBaselineSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.descriptionSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.descriptionItemSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.pendingPatchesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.syncViewFiltersDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.mergePatchDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.acceptAsPatchDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.getBaselinesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.baselineHistoryEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.sameOccurrenceSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.sameOccurrencesSyncDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetsDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.outOfSyncWorkspaceDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.outOfSyncWorkspacesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.outOfSyncComponentDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.verifyInSyncResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.oslcLinkDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.syncStatusDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getSyncViewDTO_Workspaces(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_Components(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_IncomingBaselines(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_IncomingChangeSetsAfterBasis(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_OutgoingBaselines(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_OutgoingChangeSetsAfterBasis(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_Suspended(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_Unresolved(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_CurrentPatch(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_LocalBaseline(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_RemoteBaseline(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSyncDTO_ChangeSets(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_Changes(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_OslcLinks(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_WorkItems(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_Source(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_OriginalSource(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeFolderSyncDTO_Changes(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeFolderSyncDTO_FolderChange(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnresolvedFolderSyncDTO_Conflicts(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnresolvedFolderSyncDTO_LocalChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDescriptionSyncDTO_Items(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPendingPatchesDTO_Patches(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGetBaselinesDTO_BaselineHistoryEntriesInWorkspace(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGetBaselinesDTO_BaselinesInRepository(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHistoryEntryDTO_Baseline(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSameOccurrencesSyncDTO_Occurrences(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGetBaselineSetsDTO_BaselineSets(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOutOfSyncWorkspaceDTO_Components(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOutOfSyncWorkspacesDTO_Workspaces(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOutOfSyncComponentDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVerifyInSyncResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVerifyInSyncResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getSyncViewDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_RepositoryUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_RepositoryLoggedIn(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_TargetRepositoryLoggedIn(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_TargetRepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_TargetRepositoryUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_TargetWorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_TargetWorkspaceName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_WorkspaceName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceSyncDTO_IsStream(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_BothType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_ComponentName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_CurrentOutgoingChangeSetItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_Loaded(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_PrivateType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_Replaced(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_LocalRepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_LocalRepositoryUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_LocalRepositoryLoggedIn(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_LocalWorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_LocalWorkspaceName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_LocalAddedType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_LocalRemovedType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_IslocalStream(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_TargetRepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_TargetRepositoryUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_TargetRepositoryLoggedIn(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_TargetWorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_TargetWorkspaceName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_TargetAddedType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_TargetRemovedType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_IsTargetStream(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_CurrentPatch(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentSyncDTO_AcceptQueueSize(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSyncDTO_BaselineId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSyncDTO_BaselineItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSyncDTO_BaselineName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSyncDTO_ChangeSetsResolved(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSyncDTO_CreationDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSyncDTO_PreviousBaselineItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSyncDTO_PreviousBaselineName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_AuthorContributorItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_AuthorContributorName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_ChangeSetComment(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_ChangeSetItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_ComponentName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_HiddenChanges(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_InaccessibleChanges(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_IsActive(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_LastChangeDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_LastChangeFormattedDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_RepositoryUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSyncDTO_LinkedToChangeSetInOtherDirection(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkItemSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkItemSyncDTO_Label(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkItemSyncDTO_WorkItemItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeFolderSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeFolderSyncDTO_Path(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_AddType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_AfterStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_BeforeStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_ContentChange(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_DeleteType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_LastMergeState(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_MissingDetails(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_ModifyType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_MoveType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_NewPathHint(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_NoopType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_PathHint(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_PotentialConflict(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_PropertyChange(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_StartLine(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_VersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_VersionableItemType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_VersionableName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_BeforeParentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_AfterParentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSyncDTO_MergeStates(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnresolvedFolderSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnresolvedFolderSyncDTO_Path(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_CommonAncestorVersionableStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_ConflictType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_ConflictTypeOutgoing(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_ConflictTypeProposed(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_ContentConflict(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_Kind(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_NewPathHint(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_OriginalSelectedContributorVersionableStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_PathHint(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_PropertyConflict(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_ProposedContributorVersionableStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_SelectedContributorVersionableStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_VersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictSyncDTO_VersionableItemType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_AdditionType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_AttributesType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_ContentType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_DeletionType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_MoveType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_OriginalPath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_Path(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_ResultingPath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_SandboxPath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_TargetVersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_TargetVersionableStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeSyncDTO_VersionableItemType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCESyncDTO_AddedComponents(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCESyncDTO_ChangedComponents(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCESyncDTO_RemovedComponents(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCEComponentSyncDTO_ChangeSets(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCEComponentSyncDTO_Baselines(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCEBaselineSyncDTO_ChangeSets(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDescriptionItemSyncDTO_Category(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDescriptionItemSyncDTO_Value(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncViewFiltersDTO_AllFlowTargets(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncViewFiltersDTO_AllFlowTargetsDefault(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncViewFiltersDTO_MaxNumberChangesShownInChangeSet(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncViewFiltersDTO_MaxNumberChangesShownInChangeSetDefault(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncViewFiltersDTO_ShowAllBaselines(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncViewFiltersDTO_ShowAllBaselinesDefault(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMergePatchDTO_SomeHunksFailed(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMergePatchDTO_SomeHunksMatched(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAcceptAsPatchDTO_PendingPatchIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGetBaselinesDTO_TotalEntries(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHistoryEntryDTO_DeliveredByItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHistoryEntryDTO_DeliveryDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSameOccurrenceSyncDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSameOccurrenceSyncDTO_Incoming(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSameOccurrenceSyncDTO_Outgoing(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSameOccurrenceSyncDTO_Suspended(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSameOccurrenceSyncDTO_Unresolved(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOutOfSyncWorkspaceDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOutOfSyncWorkspaceDTO_RepositoryUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOutOfSyncWorkspaceDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOutOfSyncComponentDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOutOfSyncComponentDTO_OutOfSyncSharesCount(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVerifyInSyncResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_LinkTypeId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_LocalDescription(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_RepositoryUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_ResolvedDescription(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_ResolvedIconUri(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_TargetExtraInfo(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_TargetContentType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_TargetRepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_TargetRepositoryUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOslcLinkDTO_TargetUri(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncStatusDTO_NCollision(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncStatusDTO_NComponentChanges(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncStatusDTO_NConflict(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncStatusDTO_NIncoming(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncStatusDTO_NIncomingBaselines(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncStatusDTO_NLocal(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncStatusDTO_NOutgoing(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSyncStatusDTO_NOutgoingBaselines(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
}
