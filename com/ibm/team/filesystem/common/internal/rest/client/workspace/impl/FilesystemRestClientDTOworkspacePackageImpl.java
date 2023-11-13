// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.ComponentHierarchyUpdateResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.BaselineCustomAttributesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.WorkspaceCustomAttributesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.GetWorkspaceDetailsErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.GetWorkspaceDetailsResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.PutWorkspaceResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.MoveFoldersInWorkspaceResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.DeleteFoldersInWorkspaceResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.CreateBaselineResultDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.CreateBaselineSetResultDTO;
import com.ibm.team.repository.common.model.RepositoryPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import com.ibm.team.filesystem.common.internal.rest.client.patch.impl.FilesystemRestClientDTOpatchPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import com.ibm.team.filesystem.common.internal.rest.client.locks.impl.FilesystemRestClientDTOlocksPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.FilesystemRestClientDTOcorruptionPackage;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.impl.FilesystemRestClientDTOcorruptionPackageImpl;
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
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspaceFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOworkspacePackageImpl extends EPackageImpl implements FilesystemRestClientDTOworkspacePackage
{
    private EClass createBaselineSetResultDTOEClass;
    private EClass createBaselineResultDTOEClass;
    private EClass deleteFoldersInWorkspaceResultDTOEClass;
    private EClass moveFoldersInWorkspaceResultDTOEClass;
    private EClass putWorkspaceResultDTOEClass;
    private EClass getWorkspaceDetailsResultDTOEClass;
    private EClass getWorkspaceDetailsErrorDTOEClass;
    private EClass workspaceCustomAttributesDTOEClass;
    private EClass baselineCustomAttributesDTOEClass;
    private EClass componentHierarchyUpdateResultDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOworkspacePackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOworkspacePackageImpl() {
        super("com.ibm.team.filesystem.rest.client.workspace", (EFactory)FilesystemRestClientDTOworkspaceFactory.eINSTANCE);
        this.createBaselineSetResultDTOEClass = null;
        this.createBaselineResultDTOEClass = null;
        this.deleteFoldersInWorkspaceResultDTOEClass = null;
        this.moveFoldersInWorkspaceResultDTOEClass = null;
        this.putWorkspaceResultDTOEClass = null;
        this.getWorkspaceDetailsResultDTOEClass = null;
        this.getWorkspaceDetailsErrorDTOEClass = null;
        this.workspaceCustomAttributesDTOEClass = null;
        this.baselineCustomAttributesDTOEClass = null;
        this.componentHierarchyUpdateResultDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOworkspacePackage init() {
        if (FilesystemRestClientDTOworkspacePackageImpl.isInited) {
            return (FilesystemRestClientDTOworkspacePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace");
        }
        final FilesystemRestClientDTOworkspacePackageImpl theFilesystemRestClientDTOworkspacePackage = (FilesystemRestClientDTOworkspacePackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.workspace") instanceof FilesystemRestClientDTOworkspacePackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.workspace") : new FilesystemRestClientDTOworkspacePackageImpl());
        FilesystemRestClientDTOworkspacePackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") : FilesystemRestClientDTOcorePackage.eINSTANCE);
        final FilesystemRestClientDTOdilemmaPackageImpl theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") instanceof FilesystemRestClientDTOdilemmaPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") : FilesystemRestClientDTOdilemmaPackage.eINSTANCE);
        final FilesystemRestClientDTOloadPackageImpl theFilesystemRestClientDTOloadPackage = (FilesystemRestClientDTOloadPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") instanceof FilesystemRestClientDTOloadPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") : FilesystemRestClientDTOloadPackage.eINSTANCE);
        final FilesystemRestClientDTOsyncPackageImpl theFilesystemRestClientDTOsyncPackage = (FilesystemRestClientDTOsyncPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") instanceof FilesystemRestClientDTOsyncPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") : FilesystemRestClientDTOsyncPackage.eINSTANCE);
        final FilesystemRestClientDTOchangelogPackageImpl theFilesystemRestClientDTOchangelogPackage = (FilesystemRestClientDTOchangelogPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") instanceof FilesystemRestClientDTOchangelogPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") : FilesystemRestClientDTOchangelogPackage.eINSTANCE);
        final FilesystemRestClientDTOsharePackageImpl theFilesystemRestClientDTOsharePackage = (FilesystemRestClientDTOsharePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") instanceof FilesystemRestClientDTOsharePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") : FilesystemRestClientDTOsharePackage.eINSTANCE);
        final FilesystemRestClientDTOchangesetPackageImpl theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") instanceof FilesystemRestClientDTOchangesetPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") : FilesystemRestClientDTOchangesetPackage.eINSTANCE);
        final FilesystemRestClientDTOresourcePackageImpl theFilesystemRestClientDTOresourcePackage = (FilesystemRestClientDTOresourcePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") instanceof FilesystemRestClientDTOresourcePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") : FilesystemRestClientDTOresourcePackage.eINSTANCE);
        final FilesystemRestClientDTOconflictPackageImpl theFilesystemRestClientDTOconflictPackage = (FilesystemRestClientDTOconflictPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") instanceof FilesystemRestClientDTOconflictPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") : FilesystemRestClientDTOconflictPackage.eINSTANCE);
        final FilesystemRestClientDTOignoresPackageImpl theFilesystemRestClientDTOignoresPackage = (FilesystemRestClientDTOignoresPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") instanceof FilesystemRestClientDTOignoresPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") : FilesystemRestClientDTOignoresPackage.eINSTANCE);
        final FilesystemRestClientDTOcorruptionPackageImpl theFilesystemRestClientDTOcorruptionPackage = (FilesystemRestClientDTOcorruptionPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") instanceof FilesystemRestClientDTOcorruptionPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") : FilesystemRestClientDTOcorruptionPackage.eINSTANCE);
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") : FilesystemRestClientDTOlocksPackage.eINSTANCE);
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
        theFilesystemRestClientDTOworkspacePackage.createPackageContents();
        theFilesystemRestClientDTOcorePackage.createPackageContents();
        theFilesystemRestClientDTOdilemmaPackage.createPackageContents();
        theFilesystemRestClientDTOloadPackage.createPackageContents();
        theFilesystemRestClientDTOsyncPackage.createPackageContents();
        theFilesystemRestClientDTOchangelogPackage.createPackageContents();
        theFilesystemRestClientDTOsharePackage.createPackageContents();
        theFilesystemRestClientDTOchangesetPackage.createPackageContents();
        theFilesystemRestClientDTOresourcePackage.createPackageContents();
        theFilesystemRestClientDTOconflictPackage.createPackageContents();
        theFilesystemRestClientDTOignoresPackage.createPackageContents();
        theFilesystemRestClientDTOcorruptionPackage.createPackageContents();
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
        theFilesystemRestClientDTOworkspacePackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.initializePackageContents();
        theFilesystemRestClientDTOdilemmaPackage.initializePackageContents();
        theFilesystemRestClientDTOloadPackage.initializePackageContents();
        theFilesystemRestClientDTOsyncPackage.initializePackageContents();
        theFilesystemRestClientDTOchangelogPackage.initializePackageContents();
        theFilesystemRestClientDTOsharePackage.initializePackageContents();
        theFilesystemRestClientDTOchangesetPackage.initializePackageContents();
        theFilesystemRestClientDTOresourcePackage.initializePackageContents();
        theFilesystemRestClientDTOconflictPackage.initializePackageContents();
        theFilesystemRestClientDTOignoresPackage.initializePackageContents();
        theFilesystemRestClientDTOcorruptionPackage.initializePackageContents();
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOworkspacePackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.workspace", (Object)theFilesystemRestClientDTOworkspacePackage);
        return theFilesystemRestClientDTOworkspacePackage;
    }
    
    public EClass getCreateBaselineSetResultDTO() {
        return this.createBaselineSetResultDTOEClass;
    }
    
    public EReference getCreateBaselineSetResultDTO_BaselineSet() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getCreateBaselineSetResultDTO_Cancelled() {
        return (EAttribute)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getCreateBaselineSetResultDTO_CommitDilemma() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getCreateBaselineSetResultDTO_ConfigurationsWithConflicts() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getCreateBaselineSetResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getCreateBaselineSetResultDTO_OutOfSyncShares() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getCreateBaselineSetResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getCreateBaselineSetResultDTO_UpdateDilemma() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EReference getCreateBaselineSetResultDTO_ActiveChangeSetsInSubcomponents() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EReference getCreateBaselineSetResultDTO_InaccessibleConfigurationsInSubcomponents() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EReference getCreateBaselineSetResultDTO_NotFoundConfigurationsInSubcomponents() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EReference getCreateBaselineSetResultDTO_ConfigurationsWithUncheckedInChangesInSubcomponents() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EReference getCreateBaselineSetResultDTO_ConfigurationsWithConflictsInSubcomponents() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EReference getCreateBaselineSetResultDTO_EntireHierarchyNotIncludedInSnapshot() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EReference getCreateBaselineSetResultDTO_ActiveChangeSetsInConfigurations() {
        return (EReference)this.createBaselineSetResultDTOEClass.getEStructuralFeatures().get(14);
    }
    
    public EClass getCreateBaselineResultDTO() {
        return this.createBaselineResultDTOEClass;
    }
    
    public EAttribute getCreateBaselineResultDTO_Cancelled() {
        return (EAttribute)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getCreateBaselineResultDTO_OutOfSyncShares() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getCreateBaselineResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getCreateBaselineResultDTO_ConfigurationsWithUncheckedInChangesInSubcomponents() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EReference getCreateBaselineResultDTO_ConfigurationsWithConflicts() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getCreateBaselineResultDTO_ConfigurationsWithConflictsInSubcomponents() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EReference getCreateBaselineResultDTO_Baselines() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getCreateBaselineResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getCreateBaselineResultDTO_CommitDilemma() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getCreateBaselineResultDTO_UpdateDilemma() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EReference getCreateBaselineResultDTO_ActiveChangeSetsInSubcomponents() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EReference getCreateBaselineResultDTO_InaccessibleConfigurationsInSubcomponents() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EReference getCreateBaselineResultDTO_NotFoundConfigurationsInSubcomponents() {
        return (EReference)this.createBaselineResultDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EClass getDeleteFoldersInWorkspaceResultDTO() {
        return this.deleteFoldersInWorkspaceResultDTOEClass;
    }
    
    public EAttribute getDeleteFoldersInWorkspaceResultDTO_Cancelled() {
        return (EAttribute)this.deleteFoldersInWorkspaceResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getDeleteFoldersInWorkspaceResultDTO_OutOfSyncShares() {
        return (EReference)this.deleteFoldersInWorkspaceResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getDeleteFoldersInWorkspaceResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.deleteFoldersInWorkspaceResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getMoveFoldersInWorkspaceResultDTO() {
        return this.moveFoldersInWorkspaceResultDTOEClass;
    }
    
    public EAttribute getMoveFoldersInWorkspaceResultDTO_Cancelled() {
        return (EAttribute)this.moveFoldersInWorkspaceResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getMoveFoldersInWorkspaceResultDTO_OutOfSyncShares() {
        return (EReference)this.moveFoldersInWorkspaceResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getMoveFoldersInWorkspaceResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.moveFoldersInWorkspaceResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getMoveFoldersInWorkspaceResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.moveFoldersInWorkspaceResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getMoveFoldersInWorkspaceResultDTO_CommitDilemma() {
        return (EReference)this.moveFoldersInWorkspaceResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getMoveFoldersInWorkspaceResultDTO_UpdateDilemma() {
        return (EReference)this.moveFoldersInWorkspaceResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getPutWorkspaceResultDTO() {
        return this.putWorkspaceResultDTOEClass;
    }
    
    public EAttribute getPutWorkspaceResultDTO_Cancelled() {
        return (EAttribute)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getPutWorkspaceResultDTO_Workspace() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getPutWorkspaceResultDTO_OutOfSyncShares() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getPutWorkspaceResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getPutWorkspaceResultDTO_ComponentsAdded() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getPutWorkspaceResultDTO_ComponentsCreated() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getPutWorkspaceResultDTO_ComponentHierarchyUpdateResult() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getPutWorkspaceResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EReference getPutWorkspaceResultDTO_CommitDilemma() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EReference getPutWorkspaceResultDTO_UpdateDilemma() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EReference getPutWorkspaceResultDTO_NoBackupBaselinesComponents() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EReference getPutWorkspaceResultDTO_SelectedComponentsWithMultipleParticipants() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EReference getPutWorkspaceResultDTO_SubcomponentsWithMultipleParticipants() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EReference getPutWorkspaceResultDTO_ComponentsRemoved() {
        return (EReference)this.putWorkspaceResultDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EClass getGetWorkspaceDetailsResultDTO() {
        return this.getWorkspaceDetailsResultDTOEClass;
    }
    
    public EReference getGetWorkspaceDetailsResultDTO_WorkspaceDetails() {
        return (EReference)this.getWorkspaceDetailsResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getGetWorkspaceDetailsResultDTO_Errors() {
        return (EReference)this.getWorkspaceDetailsResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getGetWorkspaceDetailsErrorDTO() {
        return this.getWorkspaceDetailsErrorDTOEClass;
    }
    
    public EAttribute getGetWorkspaceDetailsErrorDTO_Message() {
        return (EAttribute)this.getWorkspaceDetailsErrorDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getGetWorkspaceDetailsErrorDTO_RepositoryId() {
        return (EAttribute)this.getWorkspaceDetailsErrorDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getGetWorkspaceDetailsErrorDTO_RepositoryUrl() {
        return (EAttribute)this.getWorkspaceDetailsErrorDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getGetWorkspaceDetailsErrorDTO_WorkspaceId() {
        return (EAttribute)this.getWorkspaceDetailsErrorDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getWorkspaceCustomAttributesDTO() {
        return this.workspaceCustomAttributesDTOEClass;
    }
    
    public EReference getWorkspaceCustomAttributesDTO_Workspace() {
        return (EReference)this.workspaceCustomAttributesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getWorkspaceCustomAttributesDTO_CustomAttributes() {
        return (EReference)this.workspaceCustomAttributesDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getBaselineCustomAttributesDTO() {
        return this.baselineCustomAttributesDTOEClass;
    }
    
    public EReference getBaselineCustomAttributesDTO_CustomAttributes() {
        return (EReference)this.baselineCustomAttributesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getComponentHierarchyUpdateResultDTO() {
        return this.componentHierarchyUpdateResultDTOEClass;
    }
    
    public EAttribute getComponentHierarchyUpdateResultDTO_AffectedChangeSetItemId() {
        return (EAttribute)this.componentHierarchyUpdateResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getComponentHierarchyUpdateResultDTO_UpdatedChildrenItemIds() {
        return (EAttribute)this.componentHierarchyUpdateResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public FilesystemRestClientDTOworkspaceFactory getFilesystemRestClientDTOworkspaceFactory() {
        return (FilesystemRestClientDTOworkspaceFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEReference(this.createBaselineSetResultDTOEClass = this.createEClass(0), 0);
        this.createEAttribute(this.createBaselineSetResultDTOEClass, 1);
        this.createEReference(this.createBaselineSetResultDTOEClass, 2);
        this.createEReference(this.createBaselineSetResultDTOEClass, 3);
        this.createEReference(this.createBaselineSetResultDTOEClass, 4);
        this.createEReference(this.createBaselineSetResultDTOEClass, 5);
        this.createEReference(this.createBaselineSetResultDTOEClass, 6);
        this.createEReference(this.createBaselineSetResultDTOEClass, 7);
        this.createEReference(this.createBaselineSetResultDTOEClass, 8);
        this.createEReference(this.createBaselineSetResultDTOEClass, 9);
        this.createEReference(this.createBaselineSetResultDTOEClass, 10);
        this.createEReference(this.createBaselineSetResultDTOEClass, 11);
        this.createEReference(this.createBaselineSetResultDTOEClass, 12);
        this.createEReference(this.createBaselineSetResultDTOEClass, 13);
        this.createEReference(this.createBaselineSetResultDTOEClass, 14);
        this.createEReference(this.createBaselineResultDTOEClass = this.createEClass(1), 0);
        this.createEAttribute(this.createBaselineResultDTOEClass, 1);
        this.createEReference(this.createBaselineResultDTOEClass, 2);
        this.createEReference(this.createBaselineResultDTOEClass, 3);
        this.createEReference(this.createBaselineResultDTOEClass, 4);
        this.createEReference(this.createBaselineResultDTOEClass, 5);
        this.createEReference(this.createBaselineResultDTOEClass, 6);
        this.createEReference(this.createBaselineResultDTOEClass, 7);
        this.createEReference(this.createBaselineResultDTOEClass, 8);
        this.createEReference(this.createBaselineResultDTOEClass, 9);
        this.createEReference(this.createBaselineResultDTOEClass, 10);
        this.createEReference(this.createBaselineResultDTOEClass, 11);
        this.createEReference(this.createBaselineResultDTOEClass, 12);
        this.createEAttribute(this.deleteFoldersInWorkspaceResultDTOEClass = this.createEClass(2), 0);
        this.createEReference(this.deleteFoldersInWorkspaceResultDTOEClass, 1);
        this.createEReference(this.deleteFoldersInWorkspaceResultDTOEClass, 2);
        this.createEAttribute(this.moveFoldersInWorkspaceResultDTOEClass = this.createEClass(3), 0);
        this.createEReference(this.moveFoldersInWorkspaceResultDTOEClass, 1);
        this.createEReference(this.moveFoldersInWorkspaceResultDTOEClass, 2);
        this.createEReference(this.moveFoldersInWorkspaceResultDTOEClass, 3);
        this.createEReference(this.moveFoldersInWorkspaceResultDTOEClass, 4);
        this.createEReference(this.moveFoldersInWorkspaceResultDTOEClass, 5);
        this.createEAttribute(this.putWorkspaceResultDTOEClass = this.createEClass(4), 0);
        this.createEReference(this.putWorkspaceResultDTOEClass, 1);
        this.createEReference(this.putWorkspaceResultDTOEClass, 2);
        this.createEReference(this.putWorkspaceResultDTOEClass, 3);
        this.createEReference(this.putWorkspaceResultDTOEClass, 4);
        this.createEReference(this.putWorkspaceResultDTOEClass, 5);
        this.createEReference(this.putWorkspaceResultDTOEClass, 6);
        this.createEReference(this.putWorkspaceResultDTOEClass, 7);
        this.createEReference(this.putWorkspaceResultDTOEClass, 8);
        this.createEReference(this.putWorkspaceResultDTOEClass, 9);
        this.createEReference(this.putWorkspaceResultDTOEClass, 10);
        this.createEReference(this.putWorkspaceResultDTOEClass, 11);
        this.createEReference(this.putWorkspaceResultDTOEClass, 12);
        this.createEReference(this.putWorkspaceResultDTOEClass, 13);
        this.createEReference(this.getWorkspaceDetailsResultDTOEClass = this.createEClass(5), 0);
        this.createEReference(this.getWorkspaceDetailsResultDTOEClass, 1);
        this.createEAttribute(this.getWorkspaceDetailsErrorDTOEClass = this.createEClass(6), 0);
        this.createEAttribute(this.getWorkspaceDetailsErrorDTOEClass, 1);
        this.createEAttribute(this.getWorkspaceDetailsErrorDTOEClass, 2);
        this.createEAttribute(this.getWorkspaceDetailsErrorDTOEClass, 3);
        this.createEReference(this.workspaceCustomAttributesDTOEClass = this.createEClass(7), 0);
        this.createEReference(this.workspaceCustomAttributesDTOEClass, 1);
        this.createEReference(this.baselineCustomAttributesDTOEClass = this.createEClass(8), 0);
        this.createEAttribute(this.componentHierarchyUpdateResultDTOEClass = this.createEClass(9), 1);
        this.createEAttribute(this.componentHierarchyUpdateResultDTOEClass, 2);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("workspace");
        this.setNsPrefix("filesystemRestClientDTOworkspace");
        this.setNsURI("com.ibm.team.filesystem.rest.client.workspace");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        final FilesystemRestClientDTOdilemmaPackage theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma");
        final FilesystemRestClientDTOchangesetPackage theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset");
        final ScmPackage theScmPackage = (ScmPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.scm");
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.repository");
        this.componentHierarchyUpdateResultDTOEClass.getESuperTypes().add((Object)theRepositoryPackage.getHelper());
        this.initEClass(this.createBaselineSetResultDTOEClass, (Class)CreateBaselineSetResultDTO.class, "CreateBaselineSetResultDTO", false, false, true);
        this.initEReference(this.getCreateBaselineSetResultDTO_BaselineSet(), (EClassifier)theFilesystemRestClientDTOcorePackage.getBaselineSetDTO(), (EReference)null, "baselineSet", (String)null, 0, 1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getCreateBaselineSetResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getCreateBaselineSetResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_ConfigurationsWithConflicts(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "configurationsWithConflicts", (String)null, 0, -1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_ActiveChangeSetsInSubcomponents(), (EClassifier)theFilesystemRestClientDTOchangesetPackage.getProblemChangeSetsDTO(), (EReference)null, "activeChangeSetsInSubcomponents", (String)null, 0, -1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_InaccessibleConfigurationsInSubcomponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "inaccessibleConfigurationsInSubcomponents", (String)null, 0, -1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_NotFoundConfigurationsInSubcomponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "notFoundConfigurationsInSubcomponents", (String)null, 0, -1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_ConfigurationsWithUncheckedInChangesInSubcomponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChangesInSubcomponents", (String)null, 0, -1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_ConfigurationsWithConflictsInSubcomponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "configurationsWithConflictsInSubcomponents", (String)null, 0, -1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_EntireHierarchyNotIncludedInSnapshot(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "entireHierarchyNotIncludedInSnapshot", (String)null, 0, -1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineSetResultDTO_ActiveChangeSetsInConfigurations(), (EClassifier)theFilesystemRestClientDTOchangesetPackage.getProblemChangeSetsDTO(), (EReference)null, "activeChangeSetsInConfigurations", (String)null, 0, -1, (Class)CreateBaselineSetResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.createBaselineResultDTOEClass, (Class)CreateBaselineResultDTO.class, "CreateBaselineResultDTO", false, false, true);
        this.initEReference(this.getCreateBaselineResultDTO_Baselines(), (EClassifier)theFilesystemRestClientDTOcorePackage.getBaselineDTO(), (EReference)null, "baselines", (String)null, 0, -1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getCreateBaselineResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getCreateBaselineResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineResultDTO_ConfigurationsWithConflicts(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "configurationsWithConflicts", (String)null, 0, -1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineResultDTO_ActiveChangeSetsInSubcomponents(), (EClassifier)theFilesystemRestClientDTOchangesetPackage.getProblemChangeSetsDTO(), (EReference)null, "activeChangeSetsInSubcomponents", (String)null, 0, -1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineResultDTO_InaccessibleConfigurationsInSubcomponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "inaccessibleConfigurationsInSubcomponents", (String)null, 0, -1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineResultDTO_NotFoundConfigurationsInSubcomponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "notFoundConfigurationsInSubcomponents", (String)null, 0, -1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineResultDTO_ConfigurationsWithUncheckedInChangesInSubcomponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChangesInSubcomponents", (String)null, 0, -1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCreateBaselineResultDTO_ConfigurationsWithConflictsInSubcomponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "configurationsWithConflictsInSubcomponents", (String)null, 0, -1, (Class)CreateBaselineResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.deleteFoldersInWorkspaceResultDTOEClass, (Class)DeleteFoldersInWorkspaceResultDTO.class, "DeleteFoldersInWorkspaceResultDTO", false, false, true);
        this.initEAttribute(this.getDeleteFoldersInWorkspaceResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)DeleteFoldersInWorkspaceResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getDeleteFoldersInWorkspaceResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)DeleteFoldersInWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getDeleteFoldersInWorkspaceResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)DeleteFoldersInWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.moveFoldersInWorkspaceResultDTOEClass, (Class)MoveFoldersInWorkspaceResultDTO.class, "MoveFoldersInWorkspaceResultDTO", false, false, true);
        this.initEAttribute(this.getMoveFoldersInWorkspaceResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)MoveFoldersInWorkspaceResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getMoveFoldersInWorkspaceResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)MoveFoldersInWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getMoveFoldersInWorkspaceResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)MoveFoldersInWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getMoveFoldersInWorkspaceResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)MoveFoldersInWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getMoveFoldersInWorkspaceResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)MoveFoldersInWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getMoveFoldersInWorkspaceResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)MoveFoldersInWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.putWorkspaceResultDTOEClass, (Class)PutWorkspaceResultDTO.class, "PutWorkspaceResultDTO", false, false, true);
        this.initEAttribute(this.getPutWorkspaceResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getPutWorkspaceResultDTO_Workspace(), (EClassifier)theFilesystemRestClientDTOcorePackage.getWorkspaceDetailsDTO(), (EReference)null, "workspace", (String)null, 0, 1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, false, false, false);
        this.initEReference(this.getPutWorkspaceResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getPutWorkspaceResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getPutWorkspaceResultDTO_ComponentsAdded(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "componentsAdded", (String)null, 0, -1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getPutWorkspaceResultDTO_ComponentsCreated(), (EClassifier)theFilesystemRestClientDTOcorePackage.getComponentDTO(), (EReference)null, "componentsCreated", (String)null, 0, -1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getPutWorkspaceResultDTO_ComponentHierarchyUpdateResult(), (EClassifier)this.getComponentHierarchyUpdateResultDTO(), (EReference)null, "componentHierarchyUpdateResult", (String)null, 0, 1, (Class)PutWorkspaceResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getPutWorkspaceResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getPutWorkspaceResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getPutWorkspaceResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getPutWorkspaceResultDTO_NoBackupBaselinesComponents(), (EClassifier)theFilesystemRestClientDTOcorePackage.getComponentDTO(), (EReference)null, "noBackupBaselinesComponents", (String)null, 0, -1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getPutWorkspaceResultDTO_SelectedComponentsWithMultipleParticipants(), (EClassifier)theFilesystemRestClientDTOcorePackage.getComponentDTO(), (EReference)null, "selectedComponentsWithMultipleParticipants", (String)null, 0, -1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getPutWorkspaceResultDTO_SubcomponentsWithMultipleParticipants(), (EClassifier)theFilesystemRestClientDTOcorePackage.getComponentDTO(), (EReference)null, "subcomponentsWithMultipleParticipants", (String)null, 0, -1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getPutWorkspaceResultDTO_ComponentsRemoved(), (EClassifier)theFilesystemRestClientDTOcorePackage.getComponentDTO(), (EReference)null, "componentsRemoved", (String)null, 0, -1, (Class)PutWorkspaceResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.getWorkspaceDetailsResultDTOEClass, (Class)GetWorkspaceDetailsResultDTO.class, "GetWorkspaceDetailsResultDTO", false, false, true);
        this.initEReference(this.getGetWorkspaceDetailsResultDTO_WorkspaceDetails(), (EClassifier)theFilesystemRestClientDTOcorePackage.getWorkspaceDetailsDTO(), (EReference)null, "workspaceDetails", (String)null, 0, -1, (Class)GetWorkspaceDetailsResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getGetWorkspaceDetailsResultDTO_Errors(), (EClassifier)this.getGetWorkspaceDetailsErrorDTO(), (EReference)null, "errors", (String)null, 0, -1, (Class)GetWorkspaceDetailsResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.getWorkspaceDetailsErrorDTOEClass, (Class)GetWorkspaceDetailsErrorDTO.class, "GetWorkspaceDetailsErrorDTO", false, false, true);
        this.initEAttribute(this.getGetWorkspaceDetailsErrorDTO_Message(), (EClassifier)this.ecorePackage.getEString(), "message", (String)null, 0, 1, (Class)GetWorkspaceDetailsErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getGetWorkspaceDetailsErrorDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)GetWorkspaceDetailsErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getGetWorkspaceDetailsErrorDTO_RepositoryUrl(), (EClassifier)this.ecorePackage.getEString(), "repositoryUrl", (String)null, 0, 1, (Class)GetWorkspaceDetailsErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getGetWorkspaceDetailsErrorDTO_WorkspaceId(), (EClassifier)this.ecorePackage.getEString(), "workspaceId", (String)null, 0, 1, (Class)GetWorkspaceDetailsErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.workspaceCustomAttributesDTOEClass, (Class)WorkspaceCustomAttributesDTO.class, "WorkspaceCustomAttributesDTO", false, false, true);
        this.initEReference(this.getWorkspaceCustomAttributesDTO_Workspace(), (EClassifier)theFilesystemRestClientDTOcorePackage.getWorkspaceDetailsDTO(), (EReference)null, "workspace", (String)null, 0, 1, (Class)WorkspaceCustomAttributesDTO.class, false, false, true, true, false, true, false, false, false);
        this.initEReference(this.getWorkspaceCustomAttributesDTO_CustomAttributes(), (EClassifier)theScmPackage.getProperty(), (EReference)null, "customAttributes", (String)null, 0, -1, (Class)WorkspaceCustomAttributesDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.baselineCustomAttributesDTOEClass, (Class)BaselineCustomAttributesDTO.class, "BaselineCustomAttributesDTO", false, false, true);
        this.initEReference(this.getBaselineCustomAttributesDTO_CustomAttributes(), (EClassifier)theScmPackage.getProperty(), (EReference)null, "customAttributes", (String)null, 0, -1, (Class)BaselineCustomAttributesDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.componentHierarchyUpdateResultDTOEClass, (Class)ComponentHierarchyUpdateResultDTO.class, "ComponentHierarchyUpdateResultDTO", false, false, true);
        this.initEAttribute(this.getComponentHierarchyUpdateResultDTO_AffectedChangeSetItemId(), (EClassifier)this.ecorePackage.getEString(), "affectedChangeSetItemId", (String)null, 0, 1, (Class)ComponentHierarchyUpdateResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentHierarchyUpdateResultDTO_UpdatedChildrenItemIds(), (EClassifier)this.ecorePackage.getEString(), "updatedChildrenItemIds", (String)null, 0, -1, (Class)ComponentHierarchyUpdateResultDTO.class, false, false, true, true, false, true, false, true);
        this.createResource("com.ibm.team.filesystem.rest.client.workspace");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamReferenceAnnotations();
        this.createTeamAttributeAnnotations();
        this.createComAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOworkspace", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.createBaselineSetResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.createBaselineResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.deleteFoldersInWorkspaceResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.moveFoldersInWorkspaceResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.putWorkspaceResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsErrorDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.workspaceCustomAttributesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.baselineCustomAttributesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.componentHierarchyUpdateResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_BaselineSet(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_ConfigurationsWithConflicts(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_ActiveChangeSetsInSubcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_InaccessibleConfigurationsInSubcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_NotFoundConfigurationsInSubcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_ConfigurationsWithUncheckedInChangesInSubcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_ConfigurationsWithConflictsInSubcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_EntireHierarchyNotIncludedInSnapshot(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_ActiveChangeSetsInConfigurations(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_Baselines(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_ConfigurationsWithConflicts(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_ActiveChangeSetsInSubcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_InaccessibleConfigurationsInSubcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_NotFoundConfigurationsInSubcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_ConfigurationsWithUncheckedInChangesInSubcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_ConfigurationsWithConflictsInSubcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeleteFoldersInWorkspaceResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeleteFoldersInWorkspaceResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveFoldersInWorkspaceResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveFoldersInWorkspaceResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveFoldersInWorkspaceResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveFoldersInWorkspaceResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveFoldersInWorkspaceResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_Workspace(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_ComponentsAdded(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_ComponentsCreated(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_ComponentHierarchyUpdateResult(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_NoBackupBaselinesComponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_SelectedComponentsWithMultipleParticipants(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_SubcomponentsWithMultipleParticipants(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_ComponentsRemoved(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGetWorkspaceDetailsResultDTO_WorkspaceDetails(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGetWorkspaceDetailsResultDTO_Errors(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceCustomAttributesDTO_Workspace(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceCustomAttributesDTO_CustomAttributes(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineCustomAttributesDTO_CustomAttributes(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getCreateBaselineSetResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCreateBaselineResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getDeleteFoldersInWorkspaceResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveFoldersInWorkspaceResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPutWorkspaceResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGetWorkspaceDetailsErrorDTO_Message(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGetWorkspaceDetailsErrorDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGetWorkspaceDetailsErrorDTO_RepositoryUrl(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getGetWorkspaceDetailsErrorDTO_WorkspaceId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentHierarchyUpdateResultDTO_AffectedChangeSetItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentHierarchyUpdateResultDTO_UpdatedChildrenItemIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createComAnnotations() {
        final String source = "com.ibm.team.codegen.helperTypeMarker";
        this.addAnnotation((ENamedElement)this.componentHierarchyUpdateResultDTOEClass, source, new String[0]);
    }
}
