// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.load.UnLoadResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.SandboxLoadRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.SandboxLoadRulesResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.MultipleSandboxLoadDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.OverlappedItemDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadFileResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadFileOperationResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.InvalidLoadRequestDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.ShareToLoadDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadLocationDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.CollisionDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.RemovedShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadOverlapDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadEvaluationDTO;
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
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import com.ibm.team.filesystem.common.internal.rest.client.sync.impl.FilesystemRestClientDTOsyncPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl.FilesystemRestClientDTOdilemmaPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import com.ibm.team.filesystem.common.internal.rest.client.core.impl.FilesystemRestClientDTOcorePackageImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOloadPackageImpl extends EPackageImpl implements FilesystemRestClientDTOloadPackage
{
    private EClass loadEvaluationDTOEClass;
    private EClass loadOverlapDTOEClass;
    private EClass removedShareDTOEClass;
    private EClass collisionDTOEClass;
    private EClass loadLocationDTOEClass;
    private EClass shareToLoadDTOEClass;
    private EClass invalidLoadRequestDTOEClass;
    private EClass loadFileOperationResultDTOEClass;
    private EClass loadFileResultDTOEClass;
    private EClass overlappedItemDTOEClass;
    private EClass multipleSandboxLoadDTOEClass;
    private EClass loadResultDTOEClass;
    private EClass sandboxLoadRulesResultDTOEClass;
    private EClass sandboxLoadRuleDTOEClass;
    private EClass unLoadResultDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOloadPackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOloadPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.load", (EFactory)FilesystemRestClientDTOloadFactory.eINSTANCE);
        this.loadEvaluationDTOEClass = null;
        this.loadOverlapDTOEClass = null;
        this.removedShareDTOEClass = null;
        this.collisionDTOEClass = null;
        this.loadLocationDTOEClass = null;
        this.shareToLoadDTOEClass = null;
        this.invalidLoadRequestDTOEClass = null;
        this.loadFileOperationResultDTOEClass = null;
        this.loadFileResultDTOEClass = null;
        this.overlappedItemDTOEClass = null;
        this.multipleSandboxLoadDTOEClass = null;
        this.loadResultDTOEClass = null;
        this.sandboxLoadRulesResultDTOEClass = null;
        this.sandboxLoadRuleDTOEClass = null;
        this.unLoadResultDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOloadPackage init() {
        if (FilesystemRestClientDTOloadPackageImpl.isInited) {
            return (FilesystemRestClientDTOloadPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load");
        }
        final FilesystemRestClientDTOloadPackageImpl theFilesystemRestClientDTOloadPackage = (FilesystemRestClientDTOloadPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.load") instanceof FilesystemRestClientDTOloadPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.load") : new FilesystemRestClientDTOloadPackageImpl());
        FilesystemRestClientDTOloadPackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") : FilesystemRestClientDTOcorePackage.eINSTANCE);
        final FilesystemRestClientDTOdilemmaPackageImpl theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") instanceof FilesystemRestClientDTOdilemmaPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") : FilesystemRestClientDTOdilemmaPackage.eINSTANCE);
        final FilesystemRestClientDTOsyncPackageImpl theFilesystemRestClientDTOsyncPackage = (FilesystemRestClientDTOsyncPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") instanceof FilesystemRestClientDTOsyncPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") : FilesystemRestClientDTOsyncPackage.eINSTANCE);
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
        theFilesystemRestClientDTOloadPackage.createPackageContents();
        theFilesystemRestClientDTOcorePackage.createPackageContents();
        theFilesystemRestClientDTOdilemmaPackage.createPackageContents();
        theFilesystemRestClientDTOsyncPackage.createPackageContents();
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
        theFilesystemRestClientDTOloadPackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.initializePackageContents();
        theFilesystemRestClientDTOdilemmaPackage.initializePackageContents();
        theFilesystemRestClientDTOsyncPackage.initializePackageContents();
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
        theFilesystemRestClientDTOloadPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.load", (Object)theFilesystemRestClientDTOloadPackage);
        return theFilesystemRestClientDTOloadPackage;
    }
    
    public EClass getLoadEvaluationDTO() {
        return this.loadEvaluationDTOEClass;
    }
    
    public EReference getLoadEvaluationDTO_OverlappingLoadRequests() {
        return (EReference)this.loadEvaluationDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getLoadEvaluationDTO_SharesToBeRemoved() {
        return (EReference)this.loadEvaluationDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getLoadEvaluationDTO_Collisions() {
        return (EReference)this.loadEvaluationDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getLoadEvaluationDTO_SharesOutOfSync() {
        return (EReference)this.loadEvaluationDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getLoadEvaluationDTO_NewSharesToLoad() {
        return (EReference)this.loadEvaluationDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getLoadEvaluationDTO_InvalidLoadRequests() {
        return (EReference)this.loadEvaluationDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getLoadEvaluationDTO_MultipleSandboxLoads() {
        return (EReference)this.loadEvaluationDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getLoadEvaluationDTO_InvalidFilterForOldLoadRuleFormat() {
        return (EAttribute)this.loadEvaluationDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EReference getLoadEvaluationDTO_LoadRuleProblems() {
        return (EReference)this.loadEvaluationDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EReference getLoadEvaluationDTO_InvalidLoadLocations() {
        return (EReference)this.loadEvaluationDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EClass getLoadOverlapDTO() {
        return this.loadOverlapDTOEClass;
    }
    
    public EReference getLoadOverlapDTO_LoadLocation() {
        return (EReference)this.loadOverlapDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getLoadOverlapDTO_Path() {
        return (EReference)this.loadOverlapDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getLoadOverlapDTO_OverlappingShares() {
        return (EReference)this.loadOverlapDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getLoadOverlapDTO_OverlappingItems() {
        return (EReference)this.loadOverlapDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getRemovedShareDTO() {
        return this.removedShareDTOEClass;
    }
    
    public EAttribute getRemovedShareDTO_UncommittedChangeCount() {
        return (EAttribute)this.removedShareDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getRemovedShareDTO_Share() {
        return (EReference)this.removedShareDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getCollisionDTO() {
        return this.collisionDTOEClass;
    }
    
    public EReference getCollisionDTO_Path() {
        return (EReference)this.collisionDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getCollisionDTO_Detail() {
        return (EAttribute)this.collisionDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getCollisionDTO_LoadLocations() {
        return (EReference)this.collisionDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getCollisionDTO_CollidedWithExistingContent() {
        return (EAttribute)this.collisionDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getCollisionDTO_CollidedWithExistingShare() {
        return (EAttribute)this.collisionDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EClass getLoadLocationDTO() {
        return this.loadLocationDTOEClass;
    }
    
    public EAttribute getLoadLocationDTO_RepositoryURL() {
        return (EAttribute)this.loadLocationDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getLoadLocationDTO_RepositoryId() {
        return (EAttribute)this.loadLocationDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getLoadLocationDTO_ContextItemId() {
        return (EAttribute)this.loadLocationDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getLoadLocationDTO_IsWorkspaceContext() {
        return (EAttribute)this.loadLocationDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getLoadLocationDTO_ComponentItemId() {
        return (EAttribute)this.loadLocationDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getLoadLocationDTO_VersionableItemId() {
        return (EAttribute)this.loadLocationDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getLoadLocationDTO_VersionableItemType() {
        return (EAttribute)this.loadLocationDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EClass getShareToLoadDTO() {
        return this.shareToLoadDTOEClass;
    }
    
    public EReference getShareToLoadDTO_Path() {
        return (EReference)this.shareToLoadDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getShareToLoadDTO_LoadLocation() {
        return (EReference)this.shareToLoadDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getInvalidLoadRequestDTO() {
        return this.invalidLoadRequestDTOEClass;
    }
    
    public EReference getInvalidLoadRequestDTO_LoadLocation() {
        return (EReference)this.invalidLoadRequestDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getInvalidLoadRequestDTO_Reason() {
        return (EAttribute)this.invalidLoadRequestDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getLoadFileOperationResultDTO() {
        return this.loadFileOperationResultDTOEClass;
    }
    
    public EReference getLoadFileOperationResultDTO_FileResults() {
        return (EReference)this.loadFileOperationResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getLoadFileOperationResultDTO_BackedUpToShed() {
        return (EReference)this.loadFileOperationResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getLoadFileOperationResultDTO_DeletedContentLocations() {
        return (EAttribute)this.loadFileOperationResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getLoadFileOperationResultDTO_LocalChangeLocations() {
        return (EAttribute)this.loadFileOperationResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getLoadFileOperationResultDTO_Cancelled() {
        return (EAttribute)this.loadFileOperationResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EClass getLoadFileResultDTO() {
        return this.loadFileResultDTOEClass;
    }
    
    public EAttribute getLoadFileResultDTO_FileItemId() {
        return (EAttribute)this.loadFileResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getLoadFileResultDTO_FileItemStateId() {
        return (EAttribute)this.loadFileResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getLoadFileResultDTO_FailureStatus() {
        return (EReference)this.loadFileResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getOverlappedItemDTO() {
        return this.overlappedItemDTOEClass;
    }
    
    public EReference getOverlappedItemDTO_VersionableHandle() {
        return (EReference)this.overlappedItemDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getOverlappedItemDTO_Path() {
        return (EReference)this.overlappedItemDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getMultipleSandboxLoadDTO() {
        return this.multipleSandboxLoadDTOEClass;
    }
    
    public EReference getMultipleSandboxLoadDTO_Configuration() {
        return (EReference)this.multipleSandboxLoadDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getMultipleSandboxLoadDTO_Sandboxes() {
        return (EAttribute)this.multipleSandboxLoadDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getMultipleSandboxLoadDTO_LoadLocations() {
        return (EReference)this.multipleSandboxLoadDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getLoadResultDTO() {
        return this.loadResultDTOEClass;
    }
    
    public EReference getLoadResultDTO_LoadRuleProblems() {
        return (EReference)this.loadResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getLoadResultDTO_EclipseReadFailureMessage() {
        return (EAttribute)this.loadResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getLoadResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.loadResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getSandboxLoadRulesResultDTO() {
        return this.sandboxLoadRulesResultDTOEClass;
    }
    
    public EAttribute getSandboxLoadRulesResultDTO_Cancelled() {
        return (EAttribute)this.sandboxLoadRulesResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getSandboxLoadRulesResultDTO_LoadRules() {
        return (EReference)this.sandboxLoadRulesResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getSandboxLoadRulesResultDTO_LoadRuleFiles() {
        return (EReference)this.sandboxLoadRulesResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getSandboxLoadRulesResultDTO_OutOfSyncShares() {
        return (EReference)this.sandboxLoadRulesResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getSandboxLoadRulesResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.sandboxLoadRulesResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EClass getSandboxLoadRuleDTO() {
        return this.sandboxLoadRuleDTOEClass;
    }
    
    public EAttribute getSandboxLoadRuleDTO_Rule() {
        return (EAttribute)this.sandboxLoadRuleDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getSandboxLoadRuleDTO_Connection() {
        return (EReference)this.sandboxLoadRuleDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getUnLoadResultDTO() {
        return this.unLoadResultDTOEClass;
    }
    
    public EAttribute getUnLoadResultDTO_Cancelled() {
        return (EAttribute)this.unLoadResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getUnLoadResultDTO_OutOfSyncShares() {
        return (EReference)this.unLoadResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getUnLoadResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.unLoadResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getUnLoadResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.unLoadResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getUnLoadResultDTO_CommitDilemma() {
        return (EReference)this.unLoadResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getUnLoadResultDTO_UpdateDilemma() {
        return (EReference)this.unLoadResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public FilesystemRestClientDTOloadFactory getFilesystemRestClientDTOloadFactory() {
        return (FilesystemRestClientDTOloadFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEReference(this.loadEvaluationDTOEClass = this.createEClass(0), 0);
        this.createEReference(this.loadEvaluationDTOEClass, 1);
        this.createEReference(this.loadEvaluationDTOEClass, 2);
        this.createEReference(this.loadEvaluationDTOEClass, 3);
        this.createEReference(this.loadEvaluationDTOEClass, 4);
        this.createEReference(this.loadEvaluationDTOEClass, 5);
        this.createEReference(this.loadEvaluationDTOEClass, 6);
        this.createEAttribute(this.loadEvaluationDTOEClass, 7);
        this.createEReference(this.loadEvaluationDTOEClass, 8);
        this.createEReference(this.loadEvaluationDTOEClass, 9);
        this.createEReference(this.loadOverlapDTOEClass = this.createEClass(1), 0);
        this.createEReference(this.loadOverlapDTOEClass, 1);
        this.createEReference(this.loadOverlapDTOEClass, 2);
        this.createEReference(this.loadOverlapDTOEClass, 3);
        this.createEAttribute(this.removedShareDTOEClass = this.createEClass(2), 0);
        this.createEReference(this.removedShareDTOEClass, 1);
        this.createEReference(this.collisionDTOEClass = this.createEClass(3), 0);
        this.createEAttribute(this.collisionDTOEClass, 1);
        this.createEReference(this.collisionDTOEClass, 2);
        this.createEAttribute(this.collisionDTOEClass, 3);
        this.createEAttribute(this.collisionDTOEClass, 4);
        this.createEAttribute(this.loadLocationDTOEClass = this.createEClass(4), 0);
        this.createEAttribute(this.loadLocationDTOEClass, 1);
        this.createEAttribute(this.loadLocationDTOEClass, 2);
        this.createEAttribute(this.loadLocationDTOEClass, 3);
        this.createEAttribute(this.loadLocationDTOEClass, 4);
        this.createEAttribute(this.loadLocationDTOEClass, 5);
        this.createEAttribute(this.loadLocationDTOEClass, 6);
        this.createEReference(this.shareToLoadDTOEClass = this.createEClass(5), 0);
        this.createEReference(this.shareToLoadDTOEClass, 1);
        this.createEReference(this.invalidLoadRequestDTOEClass = this.createEClass(6), 0);
        this.createEAttribute(this.invalidLoadRequestDTOEClass, 1);
        this.createEReference(this.loadFileOperationResultDTOEClass = this.createEClass(7), 0);
        this.createEReference(this.loadFileOperationResultDTOEClass, 1);
        this.createEAttribute(this.loadFileOperationResultDTOEClass, 2);
        this.createEAttribute(this.loadFileOperationResultDTOEClass, 3);
        this.createEAttribute(this.loadFileOperationResultDTOEClass, 4);
        this.createEAttribute(this.loadFileResultDTOEClass = this.createEClass(8), 0);
        this.createEAttribute(this.loadFileResultDTOEClass, 1);
        this.createEReference(this.loadFileResultDTOEClass, 2);
        this.createEReference(this.overlappedItemDTOEClass = this.createEClass(9), 0);
        this.createEReference(this.overlappedItemDTOEClass, 1);
        this.createEReference(this.multipleSandboxLoadDTOEClass = this.createEClass(10), 0);
        this.createEAttribute(this.multipleSandboxLoadDTOEClass, 1);
        this.createEReference(this.multipleSandboxLoadDTOEClass, 2);
        this.createEReference(this.loadResultDTOEClass = this.createEClass(11), 0);
        this.createEReference(this.loadResultDTOEClass, 1);
        this.createEAttribute(this.loadResultDTOEClass, 2);
        this.createEAttribute(this.sandboxLoadRulesResultDTOEClass = this.createEClass(12), 0);
        this.createEReference(this.sandboxLoadRulesResultDTOEClass, 1);
        this.createEReference(this.sandboxLoadRulesResultDTOEClass, 2);
        this.createEReference(this.sandboxLoadRulesResultDTOEClass, 3);
        this.createEReference(this.sandboxLoadRulesResultDTOEClass, 4);
        this.createEAttribute(this.sandboxLoadRuleDTOEClass = this.createEClass(13), 0);
        this.createEReference(this.sandboxLoadRuleDTOEClass, 1);
        this.createEAttribute(this.unLoadResultDTOEClass = this.createEClass(14), 0);
        this.createEReference(this.unLoadResultDTOEClass, 1);
        this.createEReference(this.unLoadResultDTOEClass, 2);
        this.createEReference(this.unLoadResultDTOEClass, 3);
        this.createEReference(this.unLoadResultDTOEClass, 4);
        this.createEReference(this.unLoadResultDTOEClass, 5);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("load");
        this.setNsPrefix("filesystemRestClientDTOload");
        this.setNsURI("com.ibm.team.filesystem.rest.client.load");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        final FilesystemRestClientDTOchangesetPackage theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset");
        final ScmPackage theScmPackage = (ScmPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.scm");
        final FilesystemRestClientDTOdilemmaPackage theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma");
        this.initEClass(this.loadEvaluationDTOEClass, (Class)LoadEvaluationDTO.class, "LoadEvaluationDTO", false, false, true);
        this.initEReference(this.getLoadEvaluationDTO_OverlappingLoadRequests(), (EClassifier)this.getLoadOverlapDTO(), (EReference)null, "overlappingLoadRequests", (String)null, 0, -1, (Class)LoadEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLoadEvaluationDTO_SharesToBeRemoved(), (EClassifier)this.getRemovedShareDTO(), (EReference)null, "sharesToBeRemoved", (String)null, 0, -1, (Class)LoadEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLoadEvaluationDTO_Collisions(), (EClassifier)this.getCollisionDTO(), (EReference)null, "collisions", (String)null, 0, -1, (Class)LoadEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLoadEvaluationDTO_SharesOutOfSync(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "sharesOutOfSync", (String)null, 0, -1, (Class)LoadEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLoadEvaluationDTO_NewSharesToLoad(), (EClassifier)this.getShareToLoadDTO(), (EReference)null, "newSharesToLoad", (String)null, 0, -1, (Class)LoadEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLoadEvaluationDTO_InvalidLoadRequests(), (EClassifier)this.getInvalidLoadRequestDTO(), (EReference)null, "invalidLoadRequests", (String)null, 0, -1, (Class)LoadEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLoadEvaluationDTO_MultipleSandboxLoads(), (EClassifier)this.getMultipleSandboxLoadDTO(), (EReference)null, "multipleSandboxLoads", (String)null, 0, -1, (Class)LoadEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getLoadEvaluationDTO_InvalidFilterForOldLoadRuleFormat(), (EClassifier)this.ecorePackage.getEBoolean(), "invalidFilterForOldLoadRuleFormat", (String)null, 0, 1, (Class)LoadEvaluationDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getLoadEvaluationDTO_InvalidLoadLocations(), (EClassifier)this.getInvalidLoadRequestDTO(), (EReference)null, "invalidLoadLocations", (String)null, 0, -1, (Class)LoadEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLoadEvaluationDTO_LoadRuleProblems(), (EClassifier)theFilesystemRestClientDTOcorePackage.getStatusDTO(), (EReference)null, "loadRuleProblems", (String)null, 0, -1, (Class)LoadEvaluationDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.loadOverlapDTOEClass, (Class)LoadOverlapDTO.class, "LoadOverlapDTO", false, false, true);
        this.initEReference(this.getLoadOverlapDTO_LoadLocation(), (EClassifier)this.getLoadLocationDTO(), (EReference)null, "loadLocation", (String)null, 1, 1, (Class)LoadOverlapDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getLoadOverlapDTO_Path(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "path", (String)null, 1, 1, (Class)LoadOverlapDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getLoadOverlapDTO_OverlappingShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "overlappingShares", (String)null, 0, -1, (Class)LoadOverlapDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLoadOverlapDTO_OverlappingItems(), (EClassifier)this.getOverlappedItemDTO(), (EReference)null, "overlappingItems", (String)null, 0, -1, (Class)LoadOverlapDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.removedShareDTOEClass, (Class)RemovedShareDTO.class, "RemovedShareDTO", false, false, true);
        this.initEAttribute(this.getRemovedShareDTO_UncommittedChangeCount(), (EClassifier)this.ecorePackage.getEInt(), "uncommittedChangeCount", (String)null, 0, 1, (Class)RemovedShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getRemovedShareDTO_Share(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "share", (String)null, 0, 1, (Class)RemovedShareDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.collisionDTOEClass, (Class)CollisionDTO.class, "CollisionDTO", false, false, true);
        this.initEReference(this.getCollisionDTO_Path(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "path", (String)null, 1, 1, (Class)CollisionDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getCollisionDTO_Detail(), (EClassifier)this.ecorePackage.getEString(), "detail", (String)null, 1, 1, (Class)CollisionDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getCollisionDTO_LoadLocations(), (EClassifier)this.getLoadLocationDTO(), (EReference)null, "loadLocations", (String)null, 0, -1, (Class)CollisionDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getCollisionDTO_CollidedWithExistingContent(), (EClassifier)this.ecorePackage.getEBoolean(), "collidedWithExistingContent", (String)null, 0, 1, (Class)CollisionDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getCollisionDTO_CollidedWithExistingShare(), (EClassifier)this.ecorePackage.getEBoolean(), "collidedWithExistingShare", (String)null, 0, 1, (Class)CollisionDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.loadLocationDTOEClass, (Class)LoadLocationDTO.class, "LoadLocationDTO", false, false, true);
        this.initEAttribute(this.getLoadLocationDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 0, 1, (Class)LoadLocationDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLoadLocationDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)LoadLocationDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLoadLocationDTO_ContextItemId(), (EClassifier)this.ecorePackage.getEString(), "contextItemId", (String)null, 0, 1, (Class)LoadLocationDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLoadLocationDTO_IsWorkspaceContext(), (EClassifier)this.ecorePackage.getEBoolean(), "isWorkspaceContext", (String)null, 0, 1, (Class)LoadLocationDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLoadLocationDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)LoadLocationDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLoadLocationDTO_VersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "versionableItemId", (String)null, 0, 1, (Class)LoadLocationDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLoadLocationDTO_VersionableItemType(), (EClassifier)this.ecorePackage.getEString(), "versionableItemType", (String)null, 0, 1, (Class)LoadLocationDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.shareToLoadDTOEClass, (Class)ShareToLoadDTO.class, "ShareToLoadDTO", false, false, true);
        this.initEReference(this.getShareToLoadDTO_Path(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "path", (String)null, 1, 1, (Class)ShareToLoadDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getShareToLoadDTO_LoadLocation(), (EClassifier)this.getLoadLocationDTO(), (EReference)null, "loadLocation", (String)null, 1, 1, (Class)ShareToLoadDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.invalidLoadRequestDTOEClass, (Class)InvalidLoadRequestDTO.class, "InvalidLoadRequestDTO", false, false, true);
        this.initEReference(this.getInvalidLoadRequestDTO_LoadLocation(), (EClassifier)this.getLoadLocationDTO(), (EReference)null, "loadLocation", (String)null, 1, 1, (Class)InvalidLoadRequestDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getInvalidLoadRequestDTO_Reason(), (EClassifier)this.ecorePackage.getEString(), "reason", (String)null, 1, -1, (Class)InvalidLoadRequestDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.loadFileOperationResultDTOEClass, (Class)LoadFileOperationResultDTO.class, "LoadFileOperationResultDTO", false, false, true);
        this.initEReference(this.getLoadFileOperationResultDTO_FileResults(), (EClassifier)this.getLoadFileResultDTO(), (EReference)null, "fileResults", (String)null, 0, -1, (Class)LoadFileOperationResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getLoadFileOperationResultDTO_BackedUpToShed(), (EClassifier)theFilesystemRestClientDTOchangesetPackage.getBackupInShedDTO(), (EReference)null, "backedUpToShed", (String)null, 0, -1, (Class)LoadFileOperationResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getLoadFileOperationResultDTO_DeletedContentLocations(), (EClassifier)this.ecorePackage.getEString(), "deletedContentLocations", (String)null, 0, -1, (Class)LoadFileOperationResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLoadFileOperationResultDTO_LocalChangeLocations(), (EClassifier)this.ecorePackage.getEString(), "localChangeLocations", (String)null, 0, -1, (Class)LoadFileOperationResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLoadFileOperationResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)LoadFileOperationResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.loadFileResultDTOEClass, (Class)LoadFileResultDTO.class, "LoadFileResultDTO", false, false, true);
        this.initEAttribute(this.getLoadFileResultDTO_FileItemId(), (EClassifier)this.ecorePackage.getEString(), "fileItemId", (String)null, 0, 1, (Class)LoadFileResultDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getLoadFileResultDTO_FileItemStateId(), (EClassifier)this.ecorePackage.getEString(), "fileItemStateId", (String)null, 0, 1, (Class)LoadFileResultDTO.class, false, false, true, true, false, false, false, true);
        this.initEReference(this.getLoadFileResultDTO_FailureStatus(), (EClassifier)theFilesystemRestClientDTOcorePackage.getStatusDTO(), (EReference)null, "failureStatus", (String)null, 1, 1, (Class)LoadFileResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.overlappedItemDTOEClass, (Class)OverlappedItemDTO.class, "OverlappedItemDTO", false, false, true);
        this.initEReference(this.getOverlappedItemDTO_VersionableHandle(), (EClassifier)theScmPackage.getVersionableHandleFacade(), (EReference)null, "versionableHandle", (String)null, 0, 1, (Class)OverlappedItemDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getOverlappedItemDTO_Path(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "path", (String)null, 0, 1, (Class)OverlappedItemDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.multipleSandboxLoadDTOEClass, (Class)MultipleSandboxLoadDTO.class, "MultipleSandboxLoadDTO", false, false, true);
        this.initEReference(this.getMultipleSandboxLoadDTO_Configuration(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "configuration", (String)null, 1, 1, (Class)MultipleSandboxLoadDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getMultipleSandboxLoadDTO_Sandboxes(), (EClassifier)this.ecorePackage.getEString(), "sandboxes", (String)null, 1, -1, (Class)MultipleSandboxLoadDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getMultipleSandboxLoadDTO_LoadLocations(), (EClassifier)this.getLoadLocationDTO(), (EReference)null, "loadLocations", (String)null, 1, -1, (Class)MultipleSandboxLoadDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.loadResultDTOEClass, (Class)LoadResultDTO.class, "LoadResultDTO", false, false, true);
        this.initEReference(this.getLoadResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)LoadResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLoadResultDTO_LoadRuleProblems(), (EClassifier)theFilesystemRestClientDTOcorePackage.getStatusDTO(), (EReference)null, "loadRuleProblems", (String)null, 0, -1, (Class)LoadResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getLoadResultDTO_EclipseReadFailureMessage(), (EClassifier)this.ecorePackage.getEString(), "eclipseReadFailureMessage", "\"\"", 0, -1, (Class)LoadResultDTO.class, false, false, true, true, false, true, false, false);
        this.initEClass(this.sandboxLoadRulesResultDTOEClass, (Class)SandboxLoadRulesResultDTO.class, "SandboxLoadRulesResultDTO", false, false, true);
        this.initEAttribute(this.getSandboxLoadRulesResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)SandboxLoadRulesResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getSandboxLoadRulesResultDTO_LoadRules(), (EClassifier)this.getSandboxLoadRuleDTO(), (EReference)null, "loadRules", (String)null, 0, -1, (Class)SandboxLoadRulesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getSandboxLoadRulesResultDTO_LoadRuleFiles(), (EClassifier)this.getSandboxLoadRuleDTO(), (EReference)null, "loadRuleFiles", (String)null, 0, -1, (Class)SandboxLoadRulesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getSandboxLoadRulesResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)SandboxLoadRulesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getSandboxLoadRulesResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)SandboxLoadRulesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.sandboxLoadRuleDTOEClass, (Class)SandboxLoadRuleDTO.class, "SandboxLoadRuleDTO", false, false, true);
        this.initEAttribute(this.getSandboxLoadRuleDTO_Rule(), (EClassifier)this.ecorePackage.getEString(), "rule", (String)null, 0, 1, (Class)SandboxLoadRuleDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getSandboxLoadRuleDTO_Connection(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConnectionDescriptorDTO(), (EReference)null, "connection", (String)null, 0, 1, (Class)SandboxLoadRuleDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.unLoadResultDTOEClass, (Class)UnLoadResultDTO.class, "UnLoadResultDTO", false, false, true);
        this.initEAttribute(this.getUnLoadResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)UnLoadResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getUnLoadResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)UnLoadResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUnLoadResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)UnLoadResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUnLoadResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChanges2DTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)UnLoadResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUnLoadResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 0, 1, (Class)UnLoadResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUnLoadResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 0, 1, (Class)UnLoadResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.createResource("com.ibm.team.filesystem.rest.client.load");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamReferenceAnnotations();
        this.createTeamAttributeAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOload", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.loadEvaluationDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.loadOverlapDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.removedShareDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.collisionDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.loadLocationDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.shareToLoadDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.invalidLoadRequestDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.loadFileOperationResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.loadFileResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.overlappedItemDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.multipleSandboxLoadDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.loadResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.sandboxLoadRulesResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.sandboxLoadRuleDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.unLoadResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getLoadEvaluationDTO_OverlappingLoadRequests(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadEvaluationDTO_SharesToBeRemoved(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadEvaluationDTO_Collisions(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadEvaluationDTO_SharesOutOfSync(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadEvaluationDTO_NewSharesToLoad(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadEvaluationDTO_InvalidLoadRequests(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadEvaluationDTO_MultipleSandboxLoads(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadEvaluationDTO_InvalidLoadLocations(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadEvaluationDTO_LoadRuleProblems(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadOverlapDTO_LoadLocation(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadOverlapDTO_Path(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadOverlapDTO_OverlappingShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadOverlapDTO_OverlappingItems(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getRemovedShareDTO_Share(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCollisionDTO_Path(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCollisionDTO_LoadLocations(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareToLoadDTO_Path(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareToLoadDTO_LoadLocation(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getInvalidLoadRequestDTO_LoadLocation(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadFileOperationResultDTO_FileResults(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadFileOperationResultDTO_BackedUpToShed(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadFileResultDTO_FailureStatus(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlappedItemDTO_VersionableHandle(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlappedItemDTO_Path(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMultipleSandboxLoadDTO_Configuration(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMultipleSandboxLoadDTO_LoadLocations(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadResultDTO_LoadRuleProblems(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxLoadRulesResultDTO_LoadRules(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxLoadRulesResultDTO_LoadRuleFiles(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxLoadRulesResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxLoadRulesResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxLoadRuleDTO_Connection(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnLoadResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnLoadResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnLoadResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnLoadResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnLoadResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getLoadEvaluationDTO_InvalidFilterForOldLoadRuleFormat(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getRemovedShareDTO_UncommittedChangeCount(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCollisionDTO_Detail(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCollisionDTO_CollidedWithExistingContent(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCollisionDTO_CollidedWithExistingShare(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadLocationDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadLocationDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadLocationDTO_ContextItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadLocationDTO_IsWorkspaceContext(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadLocationDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadLocationDTO_VersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadLocationDTO_VersionableItemType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getInvalidLoadRequestDTO_Reason(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadFileOperationResultDTO_DeletedContentLocations(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadFileOperationResultDTO_LocalChangeLocations(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadFileOperationResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadFileResultDTO_FileItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadFileResultDTO_FileItemStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMultipleSandboxLoadDTO_Sandboxes(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadResultDTO_EclipseReadFailureMessage(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxLoadRulesResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxLoadRuleDTO_Rule(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnLoadResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
}
