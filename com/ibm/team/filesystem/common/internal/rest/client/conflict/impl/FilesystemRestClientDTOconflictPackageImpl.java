// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveWithProposedEvaluationDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FailedMergeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ConflictedChangeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveAutoMergeResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveAsMergedResultDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveWithProposedResultDTO;
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
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FilesystemRestClientDTOconflictFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FilesystemRestClientDTOconflictPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOconflictPackageImpl extends EPackageImpl implements FilesystemRestClientDTOconflictPackage
{
    private EClass resolveWithProposedResultDTOEClass;
    private EClass resolveAsMergedResultDTOEClass;
    private EClass resolveAutoMergeResultDTOEClass;
    private EClass conflictedChangeDTOEClass;
    private EClass failedMergeDTOEClass;
    private EClass resolveWithProposedEvaluationDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOconflictPackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOconflictPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.conflict", (EFactory)FilesystemRestClientDTOconflictFactory.eINSTANCE);
        this.resolveWithProposedResultDTOEClass = null;
        this.resolveAsMergedResultDTOEClass = null;
        this.resolveAutoMergeResultDTOEClass = null;
        this.conflictedChangeDTOEClass = null;
        this.failedMergeDTOEClass = null;
        this.resolveWithProposedEvaluationDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOconflictPackage init() {
        if (FilesystemRestClientDTOconflictPackageImpl.isInited) {
            return (FilesystemRestClientDTOconflictPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict");
        }
        final FilesystemRestClientDTOconflictPackageImpl theFilesystemRestClientDTOconflictPackage = (FilesystemRestClientDTOconflictPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.conflict") instanceof FilesystemRestClientDTOconflictPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.conflict") : new FilesystemRestClientDTOconflictPackageImpl());
        FilesystemRestClientDTOconflictPackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") : FilesystemRestClientDTOcorePackage.eINSTANCE);
        final FilesystemRestClientDTOdilemmaPackageImpl theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") instanceof FilesystemRestClientDTOdilemmaPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") : FilesystemRestClientDTOdilemmaPackage.eINSTANCE);
        final FilesystemRestClientDTOloadPackageImpl theFilesystemRestClientDTOloadPackage = (FilesystemRestClientDTOloadPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") instanceof FilesystemRestClientDTOloadPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") : FilesystemRestClientDTOloadPackage.eINSTANCE);
        final FilesystemRestClientDTOsyncPackageImpl theFilesystemRestClientDTOsyncPackage = (FilesystemRestClientDTOsyncPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") instanceof FilesystemRestClientDTOsyncPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") : FilesystemRestClientDTOsyncPackage.eINSTANCE);
        final FilesystemRestClientDTOchangelogPackageImpl theFilesystemRestClientDTOchangelogPackage = (FilesystemRestClientDTOchangelogPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") instanceof FilesystemRestClientDTOchangelogPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") : FilesystemRestClientDTOchangelogPackage.eINSTANCE);
        final FilesystemRestClientDTOsharePackageImpl theFilesystemRestClientDTOsharePackage = (FilesystemRestClientDTOsharePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") instanceof FilesystemRestClientDTOsharePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") : FilesystemRestClientDTOsharePackage.eINSTANCE);
        final FilesystemRestClientDTOchangesetPackageImpl theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") instanceof FilesystemRestClientDTOchangesetPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") : FilesystemRestClientDTOchangesetPackage.eINSTANCE);
        final FilesystemRestClientDTOresourcePackageImpl theFilesystemRestClientDTOresourcePackage = (FilesystemRestClientDTOresourcePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") instanceof FilesystemRestClientDTOresourcePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") : FilesystemRestClientDTOresourcePackage.eINSTANCE);
        final FilesystemRestClientDTOignoresPackageImpl theFilesystemRestClientDTOignoresPackage = (FilesystemRestClientDTOignoresPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") instanceof FilesystemRestClientDTOignoresPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") : FilesystemRestClientDTOignoresPackage.eINSTANCE);
        final FilesystemRestClientDTOworkspacePackageImpl theFilesystemRestClientDTOworkspacePackage = (FilesystemRestClientDTOworkspacePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") instanceof FilesystemRestClientDTOworkspacePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") : FilesystemRestClientDTOworkspacePackage.eINSTANCE);
        final FilesystemRestClientDTOcorruptionPackageImpl theFilesystemRestClientDTOcorruptionPackage = (FilesystemRestClientDTOcorruptionPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") instanceof FilesystemRestClientDTOcorruptionPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") : FilesystemRestClientDTOcorruptionPackage.eINSTANCE);
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") : FilesystemRestClientDTOlocksPackage.eINSTANCE);
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
        theFilesystemRestClientDTOconflictPackage.createPackageContents();
        theFilesystemRestClientDTOcorePackage.createPackageContents();
        theFilesystemRestClientDTOdilemmaPackage.createPackageContents();
        theFilesystemRestClientDTOloadPackage.createPackageContents();
        theFilesystemRestClientDTOsyncPackage.createPackageContents();
        theFilesystemRestClientDTOchangelogPackage.createPackageContents();
        theFilesystemRestClientDTOsharePackage.createPackageContents();
        theFilesystemRestClientDTOchangesetPackage.createPackageContents();
        theFilesystemRestClientDTOresourcePackage.createPackageContents();
        theFilesystemRestClientDTOignoresPackage.createPackageContents();
        theFilesystemRestClientDTOworkspacePackage.createPackageContents();
        theFilesystemRestClientDTOcorruptionPackage.createPackageContents();
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
        theFilesystemRestClientDTOconflictPackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.initializePackageContents();
        theFilesystemRestClientDTOdilemmaPackage.initializePackageContents();
        theFilesystemRestClientDTOloadPackage.initializePackageContents();
        theFilesystemRestClientDTOsyncPackage.initializePackageContents();
        theFilesystemRestClientDTOchangelogPackage.initializePackageContents();
        theFilesystemRestClientDTOsharePackage.initializePackageContents();
        theFilesystemRestClientDTOchangesetPackage.initializePackageContents();
        theFilesystemRestClientDTOresourcePackage.initializePackageContents();
        theFilesystemRestClientDTOignoresPackage.initializePackageContents();
        theFilesystemRestClientDTOworkspacePackage.initializePackageContents();
        theFilesystemRestClientDTOcorruptionPackage.initializePackageContents();
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOconflictPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.conflict", (Object)theFilesystemRestClientDTOconflictPackage);
        return theFilesystemRestClientDTOconflictPackage;
    }
    
    public EClass getResolveWithProposedResultDTO() {
        return this.resolveWithProposedResultDTOEClass;
    }
    
    public EAttribute getResolveWithProposedResultDTO_Cancelled() {
        return (EAttribute)this.resolveWithProposedResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getResolveWithProposedResultDTO_OutOfSyncShares() {
        return (EReference)this.resolveWithProposedResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getResolveWithProposedResultDTO_MissingRequiredChanges() {
        return (EReference)this.resolveWithProposedResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getResolveWithProposedResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.resolveWithProposedResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getResolveWithProposedResultDTO_UpdateDilemma() {
        return (EReference)this.resolveWithProposedResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EClass getResolveAsMergedResultDTO() {
        return this.resolveAsMergedResultDTOEClass;
    }
    
    public EAttribute getResolveAsMergedResultDTO_Cancelled() {
        return (EAttribute)this.resolveAsMergedResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getResolveAsMergedResultDTO_OutOfSyncShares() {
        return (EReference)this.resolveAsMergedResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getResolveAsMergedResultDTO_MissingRequiredChanges() {
        return (EReference)this.resolveAsMergedResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getResolveAsMergedResultDTO_UnmergedChanges() {
        return (EReference)this.resolveAsMergedResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getResolveAsMergedResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.resolveAsMergedResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getResolveAsMergedResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.resolveAsMergedResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getResolveAsMergedResultDTO_CommitDilemma() {
        return (EReference)this.resolveAsMergedResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getResolveAsMergedResultDTO_UpdateDilemma() {
        return (EReference)this.resolveAsMergedResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EClass getResolveAutoMergeResultDTO() {
        return this.resolveAutoMergeResultDTOEClass;
    }
    
    public EAttribute getResolveAutoMergeResultDTO_Cancelled() {
        return (EAttribute)this.resolveAutoMergeResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getResolveAutoMergeResultDTO_OutOfSyncShares() {
        return (EReference)this.resolveAutoMergeResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getResolveAutoMergeResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.resolveAutoMergeResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getResolveAutoMergeResultDTO_MissingRequiredChanges() {
        return (EReference)this.resolveAutoMergeResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getResolveAutoMergeResultDTO_MissingStorageMergers() {
        return (EReference)this.resolveAutoMergeResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getResolveAutoMergeResultDTO_NumberConflictsResolved() {
        return (EAttribute)this.resolveAutoMergeResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getResolveAutoMergeResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.resolveAutoMergeResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getResolveAutoMergeResultDTO_CommitDilemma() {
        return (EReference)this.resolveAutoMergeResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EReference getResolveAutoMergeResultDTO_UpdateDilemma() {
        return (EReference)this.resolveAutoMergeResultDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EClass getConflictedChangeDTO() {
        return this.conflictedChangeDTOEClass;
    }
    
    public EAttribute getConflictedChangeDTO_ComponentItemId() {
        return (EAttribute)this.conflictedChangeDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getConflictedChangeDTO_VersionableItemId() {
        return (EAttribute)this.conflictedChangeDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getConflictedChangeDTO_VersionableItemType() {
        return (EAttribute)this.conflictedChangeDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getConflictedChangeDTO_Path() {
        return (EReference)this.conflictedChangeDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getConflictedChangeDTO_Kind() {
        return (EAttribute)this.conflictedChangeDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getConflictedChangeDTO_ConflictType() {
        return (EAttribute)this.conflictedChangeDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getFailedMergeDTO() {
        return this.failedMergeDTOEClass;
    }
    
    public EAttribute getFailedMergeDTO_ComponentItemId() {
        return (EAttribute)this.failedMergeDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getFailedMergeDTO_VersionableItemId() {
        return (EAttribute)this.failedMergeDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getFailedMergeDTO_VersionableItemType() {
        return (EAttribute)this.failedMergeDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getFailedMergeDTO_Path() {
        return (EReference)this.failedMergeDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getFailedMergeDTO_UnknownContentType() {
        return (EAttribute)this.failedMergeDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getFailedMergeDTO_NoMergerForContentType() {
        return (EAttribute)this.failedMergeDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getResolveWithProposedEvaluationDTO() {
        return this.resolveWithProposedEvaluationDTOEClass;
    }
    
    public EReference getResolveWithProposedEvaluationDTO_NeedContentToRemoved() {
        return (EReference)this.resolveWithProposedEvaluationDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getResolveWithProposedEvaluationDTO_NeedParentForResolution() {
        return (EReference)this.resolveWithProposedEvaluationDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public FilesystemRestClientDTOconflictFactory getFilesystemRestClientDTOconflictFactory() {
        return (FilesystemRestClientDTOconflictFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEAttribute(this.resolveWithProposedResultDTOEClass = this.createEClass(0), 0);
        this.createEReference(this.resolveWithProposedResultDTOEClass, 1);
        this.createEReference(this.resolveWithProposedResultDTOEClass, 2);
        this.createEReference(this.resolveWithProposedResultDTOEClass, 3);
        this.createEReference(this.resolveWithProposedResultDTOEClass, 4);
        this.createEAttribute(this.resolveAsMergedResultDTOEClass = this.createEClass(1), 0);
        this.createEReference(this.resolveAsMergedResultDTOEClass, 1);
        this.createEReference(this.resolveAsMergedResultDTOEClass, 2);
        this.createEReference(this.resolveAsMergedResultDTOEClass, 3);
        this.createEReference(this.resolveAsMergedResultDTOEClass, 4);
        this.createEReference(this.resolveAsMergedResultDTOEClass, 5);
        this.createEReference(this.resolveAsMergedResultDTOEClass, 6);
        this.createEReference(this.resolveAsMergedResultDTOEClass, 7);
        this.createEAttribute(this.resolveAutoMergeResultDTOEClass = this.createEClass(2), 0);
        this.createEReference(this.resolveAutoMergeResultDTOEClass, 1);
        this.createEReference(this.resolveAutoMergeResultDTOEClass, 2);
        this.createEReference(this.resolveAutoMergeResultDTOEClass, 3);
        this.createEReference(this.resolveAutoMergeResultDTOEClass, 4);
        this.createEAttribute(this.resolveAutoMergeResultDTOEClass, 5);
        this.createEReference(this.resolveAutoMergeResultDTOEClass, 6);
        this.createEReference(this.resolveAutoMergeResultDTOEClass, 7);
        this.createEReference(this.resolveAutoMergeResultDTOEClass, 8);
        this.createEAttribute(this.conflictedChangeDTOEClass = this.createEClass(3), 0);
        this.createEAttribute(this.conflictedChangeDTOEClass, 1);
        this.createEAttribute(this.conflictedChangeDTOEClass, 2);
        this.createEReference(this.conflictedChangeDTOEClass, 3);
        this.createEAttribute(this.conflictedChangeDTOEClass, 4);
        this.createEAttribute(this.conflictedChangeDTOEClass, 5);
        this.createEAttribute(this.failedMergeDTOEClass = this.createEClass(4), 0);
        this.createEAttribute(this.failedMergeDTOEClass, 1);
        this.createEAttribute(this.failedMergeDTOEClass, 2);
        this.createEReference(this.failedMergeDTOEClass, 3);
        this.createEAttribute(this.failedMergeDTOEClass, 4);
        this.createEAttribute(this.failedMergeDTOEClass, 5);
        this.createEReference(this.resolveWithProposedEvaluationDTOEClass = this.createEClass(5), 0);
        this.createEReference(this.resolveWithProposedEvaluationDTOEClass, 1);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("conflict");
        this.setNsPrefix("filesystemRestClientDTOconflict");
        this.setNsURI("com.ibm.team.filesystem.rest.client.conflict");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        final FilesystemRestClientDTOdilemmaPackage theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma");
        this.initEClass(this.resolveWithProposedResultDTOEClass, (Class)ResolveWithProposedResultDTO.class, "ResolveWithProposedResultDTO", false, false, true);
        this.initEAttribute(this.getResolveWithProposedResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)ResolveWithProposedResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getResolveWithProposedResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)ResolveWithProposedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveWithProposedResultDTO_MissingRequiredChanges(), (EClassifier)this.getConflictedChangeDTO(), (EReference)null, "missingRequiredChanges", (String)null, 0, -1, (Class)ResolveWithProposedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveWithProposedResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)ResolveWithProposedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveWithProposedResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)ResolveWithProposedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.resolveAsMergedResultDTOEClass, (Class)ResolveAsMergedResultDTO.class, "ResolveAsMergedResultDTO", false, false, true);
        this.initEAttribute(this.getResolveAsMergedResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)ResolveAsMergedResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getResolveAsMergedResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)ResolveAsMergedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAsMergedResultDTO_MissingRequiredChanges(), (EClassifier)this.getConflictedChangeDTO(), (EReference)null, "missingRequiredChanges", (String)null, 0, -1, (Class)ResolveAsMergedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAsMergedResultDTO_UnmergedChanges(), (EClassifier)this.getConflictedChangeDTO(), (EReference)null, "unmergedChanges", (String)null, 0, -1, (Class)ResolveAsMergedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAsMergedResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)ResolveAsMergedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAsMergedResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)ResolveAsMergedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAsMergedResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)ResolveAsMergedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAsMergedResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)ResolveAsMergedResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.resolveAutoMergeResultDTOEClass, (Class)ResolveAutoMergeResultDTO.class, "ResolveAutoMergeResultDTO", false, false, true);
        this.initEAttribute(this.getResolveAutoMergeResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)ResolveAutoMergeResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getResolveAutoMergeResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)ResolveAutoMergeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAutoMergeResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)ResolveAutoMergeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAutoMergeResultDTO_MissingRequiredChanges(), (EClassifier)this.getConflictedChangeDTO(), (EReference)null, "missingRequiredChanges", (String)null, 0, -1, (Class)ResolveAutoMergeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAutoMergeResultDTO_MissingStorageMergers(), (EClassifier)this.getFailedMergeDTO(), (EReference)null, "missingStorageMergers", (String)null, 0, -1, (Class)ResolveAutoMergeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getResolveAutoMergeResultDTO_NumberConflictsResolved(), (EClassifier)this.ecorePackage.getEInt(), "numberConflictsResolved", (String)null, 0, 1, (Class)ResolveAutoMergeResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getResolveAutoMergeResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)ResolveAutoMergeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAutoMergeResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)ResolveAutoMergeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveAutoMergeResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)ResolveAutoMergeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.conflictedChangeDTOEClass, (Class)ConflictedChangeDTO.class, "ConflictedChangeDTO", false, false, true);
        this.initEAttribute(this.getConflictedChangeDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)ConflictedChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictedChangeDTO_VersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "versionableItemId", (String)null, 0, 1, (Class)ConflictedChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictedChangeDTO_VersionableItemType(), (EClassifier)this.ecorePackage.getEString(), "versionableItemType", (String)null, 0, 1, (Class)ConflictedChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getConflictedChangeDTO_Path(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "path", (String)null, 0, 1, (Class)ConflictedChangeDTO.class, false, false, true, true, false, true, false, false, true);
        this.initEAttribute(this.getConflictedChangeDTO_Kind(), (EClassifier)this.ecorePackage.getEString(), "kind", (String)null, 0, 1, (Class)ConflictedChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConflictedChangeDTO_ConflictType(), (EClassifier)this.ecorePackage.getEString(), "conflictType", (String)null, 0, 1, (Class)ConflictedChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.failedMergeDTOEClass, (Class)FailedMergeDTO.class, "FailedMergeDTO", false, false, true);
        this.initEAttribute(this.getFailedMergeDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)FailedMergeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFailedMergeDTO_VersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "versionableItemId", (String)null, 0, 1, (Class)FailedMergeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFailedMergeDTO_VersionableItemType(), (EClassifier)this.ecorePackage.getEString(), "versionableItemType", (String)null, 0, 1, (Class)FailedMergeDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getFailedMergeDTO_Path(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "path", (String)null, 0, 1, (Class)FailedMergeDTO.class, false, false, true, true, false, true, false, false, true);
        this.initEAttribute(this.getFailedMergeDTO_UnknownContentType(), (EClassifier)this.ecorePackage.getEBoolean(), "unknownContentType", (String)null, 0, 1, (Class)FailedMergeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFailedMergeDTO_NoMergerForContentType(), (EClassifier)this.ecorePackage.getEBoolean(), "noMergerForContentType", (String)null, 0, 1, (Class)FailedMergeDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.resolveWithProposedEvaluationDTOEClass, (Class)ResolveWithProposedEvaluationDTO.class, "ResolveWithProposedEvaluationDTO", false, false, true);
        this.initEReference(this.getResolveWithProposedEvaluationDTO_NeedContentToRemoved(), (EClassifier)this.getConflictedChangeDTO(), (EReference)null, "needContentToRemoved", (String)null, 0, -1, (Class)ResolveWithProposedEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResolveWithProposedEvaluationDTO_NeedParentForResolution(), (EClassifier)this.getConflictedChangeDTO(), (EReference)null, "needParentForResolution", (String)null, 0, -1, (Class)ResolveWithProposedEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.createResource("com.ibm.team.filesystem.rest.client.conflict");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamAttributeAnnotations();
        this.createTeamReferenceAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOconflict", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.resolveWithProposedResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.resolveAsMergedResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.resolveAutoMergeResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.conflictedChangeDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.failedMergeDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.resolveWithProposedEvaluationDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getResolveWithProposedResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAsMergedResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAutoMergeResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAutoMergeResultDTO_NumberConflictsResolved(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictedChangeDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictedChangeDTO_VersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictedChangeDTO_VersionableItemType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictedChangeDTO_Kind(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictedChangeDTO_ConflictType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFailedMergeDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFailedMergeDTO_VersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFailedMergeDTO_VersionableItemType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFailedMergeDTO_UnknownContentType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFailedMergeDTO_NoMergerForContentType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getResolveWithProposedResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveWithProposedResultDTO_MissingRequiredChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveWithProposedResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveWithProposedResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAsMergedResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAsMergedResultDTO_MissingRequiredChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAsMergedResultDTO_UnmergedChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAsMergedResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAsMergedResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAsMergedResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAsMergedResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAutoMergeResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAutoMergeResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAutoMergeResultDTO_MissingRequiredChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAutoMergeResultDTO_MissingStorageMergers(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAutoMergeResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAutoMergeResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveAutoMergeResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictedChangeDTO_Path(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFailedMergeDTO_Path(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveWithProposedEvaluationDTO_NeedContentToRemoved(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolveWithProposedEvaluationDTO_NeedParentForResolution(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
}
