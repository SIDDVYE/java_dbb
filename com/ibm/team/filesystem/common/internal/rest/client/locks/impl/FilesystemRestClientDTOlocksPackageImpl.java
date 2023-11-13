// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.UnlockResourcesResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ContributorNameDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.VersionableLockDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ComponentLockReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.StreamLockReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedResourcesDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedShareableDTO;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import com.ibm.team.filesystem.common.internal.rest.client.patch.impl.FilesystemRestClientDTOpatchPackageImpl;
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
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import com.ibm.team.filesystem.common.internal.rest.client.load.impl.FilesystemRestClientDTOloadPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl.FilesystemRestClientDTOdilemmaPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import com.ibm.team.filesystem.common.internal.rest.client.core.impl.FilesystemRestClientDTOcorePackageImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOlocksPackageImpl extends EPackageImpl implements FilesystemRestClientDTOlocksPackage
{
    private EClass lockedShareableDTOEClass;
    private EClass lockedResourcesDTOEClass;
    private EClass streamLockReportDTOEClass;
    private EClass componentLockReportDTOEClass;
    private EClass versionableLockDTOEClass;
    private EClass contributorNameDTOEClass;
    private EClass unlockResourcesResultDTOEClass;
    private EClass lockEntryDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOlocksPackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOlocksPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.locks", (EFactory)FilesystemRestClientDTOlocksFactory.eINSTANCE);
        this.lockedShareableDTOEClass = null;
        this.lockedResourcesDTOEClass = null;
        this.streamLockReportDTOEClass = null;
        this.componentLockReportDTOEClass = null;
        this.versionableLockDTOEClass = null;
        this.contributorNameDTOEClass = null;
        this.unlockResourcesResultDTOEClass = null;
        this.lockEntryDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOlocksPackage init() {
        if (FilesystemRestClientDTOlocksPackageImpl.isInited) {
            return (FilesystemRestClientDTOlocksPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks");
        }
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.locks") : new FilesystemRestClientDTOlocksPackageImpl());
        FilesystemRestClientDTOlocksPackageImpl.isInited = true;
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
        final FilesystemRestClientDTOworkspacePackageImpl theFilesystemRestClientDTOworkspacePackage = (FilesystemRestClientDTOworkspacePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") instanceof FilesystemRestClientDTOworkspacePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") : FilesystemRestClientDTOworkspacePackage.eINSTANCE);
        final FilesystemRestClientDTOcorruptionPackageImpl theFilesystemRestClientDTOcorruptionPackage = (FilesystemRestClientDTOcorruptionPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") instanceof FilesystemRestClientDTOcorruptionPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") : FilesystemRestClientDTOcorruptionPackage.eINSTANCE);
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
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
        theFilesystemRestClientDTOworkspacePackage.createPackageContents();
        theFilesystemRestClientDTOcorruptionPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
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
        theFilesystemRestClientDTOworkspacePackage.initializePackageContents();
        theFilesystemRestClientDTOcorruptionPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOlocksPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.locks", (Object)theFilesystemRestClientDTOlocksPackage);
        return theFilesystemRestClientDTOlocksPackage;
    }
    
    public EClass getLockedShareableDTO() {
        return this.lockedShareableDTOEClass;
    }
    
    public EReference getLockedShareableDTO_LockedShareable() {
        return (EReference)this.lockedShareableDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getLockedShareableDTO_VersionableItemId() {
        return (EAttribute)this.lockedShareableDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getLockedShareableDTO_ComponentItemId() {
        return (EAttribute)this.lockedShareableDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getLockedShareableDTO_StreamItemId() {
        return (EAttribute)this.lockedShareableDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getLockedResourcesDTO() {
        return this.lockedResourcesDTOEClass;
    }
    
    public EReference getLockedResourcesDTO_LockedShareables() {
        return (EReference)this.lockedResourcesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getLockedResourcesDTO_UserLocks() {
        return (EReference)this.lockedResourcesDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getLockedResourcesDTO_TeamLocks() {
        return (EReference)this.lockedResourcesDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getLockedResourcesDTO_Owners() {
        return (EReference)this.lockedResourcesDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getStreamLockReportDTO() {
        return this.streamLockReportDTOEClass;
    }
    
    public EReference getStreamLockReportDTO_ComponentLockReports() {
        return (EReference)this.streamLockReportDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getStreamLockReportDTO_StreamItemId() {
        return (EAttribute)this.streamLockReportDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getStreamLockReportDTO_StreamName() {
        return (EAttribute)this.streamLockReportDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getComponentLockReportDTO() {
        return this.componentLockReportDTOEClass;
    }
    
    public EReference getComponentLockReportDTO_VersionableLocks() {
        return (EReference)this.componentLockReportDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getComponentLockReportDTO_ComponentItemId() {
        return (EAttribute)this.componentLockReportDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getVersionableLockDTO() {
        return this.versionableLockDTOEClass;
    }
    
    public EAttribute getVersionableLockDTO_VersionableItemId() {
        return (EAttribute)this.versionableLockDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getVersionableLockDTO_ContributorItemId() {
        return (EAttribute)this.versionableLockDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getContributorNameDTO() {
        return this.contributorNameDTOEClass;
    }
    
    public EAttribute getContributorNameDTO_ContributorItemId() {
        return (EAttribute)this.contributorNameDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getContributorNameDTO_Name() {
        return (EAttribute)this.contributorNameDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getUnlockResourcesResultDTO() {
        return this.unlockResourcesResultDTOEClass;
    }
    
    public EAttribute getUnlockResourcesResultDTO_Cancelled() {
        return (EAttribute)this.unlockResourcesResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getUnlockResourcesResultDTO_CurrentUserDoesntOwnLocks() {
        return (EReference)this.unlockResourcesResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getLockEntryDTO() {
        return this.lockEntryDTOEClass;
    }
    
    public EAttribute getLockEntryDTO_RepositoryId() {
        return (EAttribute)this.lockEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getLockEntryDTO_RepositoryItemId() {
        return (EAttribute)this.lockEntryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getLockEntryDTO_WorkspaceItemId() {
        return (EAttribute)this.lockEntryDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getLockEntryDTO_ComponentItemId() {
        return (EAttribute)this.lockEntryDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getLockEntryDTO_VersionableItemId() {
        return (EAttribute)this.lockEntryDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public FilesystemRestClientDTOlocksFactory getFilesystemRestClientDTOlocksFactory() {
        return (FilesystemRestClientDTOlocksFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEAttribute(this.lockedShareableDTOEClass = this.createEClass(0), 0);
        this.createEReference(this.lockedShareableDTOEClass, 1);
        this.createEAttribute(this.lockedShareableDTOEClass, 2);
        this.createEAttribute(this.lockedShareableDTOEClass, 3);
        this.createEReference(this.lockedResourcesDTOEClass = this.createEClass(1), 0);
        this.createEReference(this.lockedResourcesDTOEClass, 1);
        this.createEReference(this.lockedResourcesDTOEClass, 2);
        this.createEReference(this.lockedResourcesDTOEClass, 3);
        this.createEReference(this.streamLockReportDTOEClass = this.createEClass(2), 0);
        this.createEAttribute(this.streamLockReportDTOEClass, 1);
        this.createEAttribute(this.streamLockReportDTOEClass, 2);
        this.createEAttribute(this.componentLockReportDTOEClass = this.createEClass(3), 0);
        this.createEReference(this.componentLockReportDTOEClass, 1);
        this.createEAttribute(this.versionableLockDTOEClass = this.createEClass(4), 0);
        this.createEAttribute(this.versionableLockDTOEClass, 1);
        this.createEAttribute(this.contributorNameDTOEClass = this.createEClass(5), 0);
        this.createEAttribute(this.contributorNameDTOEClass, 1);
        this.createEAttribute(this.unlockResourcesResultDTOEClass = this.createEClass(6), 0);
        this.createEReference(this.unlockResourcesResultDTOEClass, 1);
        this.createEAttribute(this.lockEntryDTOEClass = this.createEClass(7), 0);
        this.createEAttribute(this.lockEntryDTOEClass, 1);
        this.createEAttribute(this.lockEntryDTOEClass, 2);
        this.createEAttribute(this.lockEntryDTOEClass, 3);
        this.createEAttribute(this.lockEntryDTOEClass, 4);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("locks");
        this.setNsPrefix("filesystemRestClientDTOlocks");
        this.setNsURI("com.ibm.team.filesystem.rest.client.locks");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        this.initEClass(this.lockedShareableDTOEClass, (Class)LockedShareableDTO.class, "LockedShareableDTO", false, false, true);
        this.initEAttribute(this.getLockedShareableDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)LockedShareableDTO.class, false, false, true, true, false, false, false, false);
        this.initEReference(this.getLockedShareableDTO_LockedShareable(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "lockedShareable", (String)null, 0, 1, (Class)LockedShareableDTO.class, false, false, true, true, false, true, false, false, false);
        this.initEAttribute(this.getLockedShareableDTO_VersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "versionableItemId", (String)null, 0, 1, (Class)LockedShareableDTO.class, false, false, true, true, false, false, false, false);
        this.initEAttribute(this.getLockedShareableDTO_StreamItemId(), (EClassifier)this.ecorePackage.getEString(), "streamItemId", (String)null, 0, 1, (Class)LockedShareableDTO.class, false, false, true, true, false, false, false, false);
        this.initEClass(this.lockedResourcesDTOEClass, (Class)LockedResourcesDTO.class, "LockedResourcesDTO", false, false, true);
        this.initEReference(this.getLockedResourcesDTO_LockedShareables(), (EClassifier)this.getLockedShareableDTO(), (EReference)null, "lockedShareables", (String)null, 0, -1, (Class)LockedResourcesDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLockedResourcesDTO_Owners(), (EClassifier)this.getContributorNameDTO(), (EReference)null, "owners", (String)null, 0, -1, (Class)LockedResourcesDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getLockedResourcesDTO_TeamLocks(), (EClassifier)this.getStreamLockReportDTO(), (EReference)null, "teamLocks", (String)null, 0, -1, (Class)LockedResourcesDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLockedResourcesDTO_UserLocks(), (EClassifier)this.getStreamLockReportDTO(), (EReference)null, "userLocks", (String)null, 0, -1, (Class)LockedResourcesDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.streamLockReportDTOEClass, (Class)StreamLockReportDTO.class, "StreamLockReportDTO", false, false, true);
        this.initEReference(this.getStreamLockReportDTO_ComponentLockReports(), (EClassifier)this.getComponentLockReportDTO(), (EReference)null, "componentLockReports", (String)null, 0, -1, (Class)StreamLockReportDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getStreamLockReportDTO_StreamItemId(), (EClassifier)this.ecorePackage.getEString(), "streamItemId", (String)null, 0, 1, (Class)StreamLockReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStreamLockReportDTO_StreamName(), (EClassifier)this.ecorePackage.getEString(), "streamName", (String)null, 0, 1, (Class)StreamLockReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.componentLockReportDTOEClass, (Class)ComponentLockReportDTO.class, "ComponentLockReportDTO", false, false, true);
        this.initEAttribute(this.getComponentLockReportDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)ComponentLockReportDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getComponentLockReportDTO_VersionableLocks(), (EClassifier)this.getVersionableLockDTO(), (EReference)null, "versionableLocks", (String)null, 0, -1, (Class)ComponentLockReportDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.versionableLockDTOEClass, (Class)VersionableLockDTO.class, "VersionableLockDTO", false, false, true);
        this.initEAttribute(this.getVersionableLockDTO_ContributorItemId(), (EClassifier)this.ecorePackage.getEString(), "contributorItemId", (String)null, 0, 1, (Class)VersionableLockDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableLockDTO_VersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "versionableItemId", (String)null, 0, 1, (Class)VersionableLockDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.contributorNameDTOEClass, (Class)ContributorNameDTO.class, "ContributorNameDTO", false, false, true);
        this.initEAttribute(this.getContributorNameDTO_ContributorItemId(), (EClassifier)this.ecorePackage.getEString(), "contributorItemId", (String)null, 0, 1, (Class)ContributorNameDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getContributorNameDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 0, 1, (Class)ContributorNameDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.unlockResourcesResultDTOEClass, (Class)UnlockResourcesResultDTO.class, "UnlockResourcesResultDTO", false, false, true);
        this.initEAttribute(this.getUnlockResourcesResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)UnlockResourcesResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getUnlockResourcesResultDTO_CurrentUserDoesntOwnLocks(), (EClassifier)this.getLockEntryDTO(), (EReference)null, "currentUserDoesntOwnLocks", (String)null, 0, -1, (Class)UnlockResourcesResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.lockEntryDTOEClass, (Class)LockEntryDTO.class, "LockEntryDTO", false, false, true);
        this.initEAttribute(this.getLockEntryDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)LockEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLockEntryDTO_RepositoryItemId(), (EClassifier)this.ecorePackage.getEString(), "repositoryItemId", (String)null, 0, 1, (Class)LockEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLockEntryDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)LockEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLockEntryDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)LockEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLockEntryDTO_VersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "versionableItemId", (String)null, 0, 1, (Class)LockEntryDTO.class, false, false, true, true, false, true, false, true);
        this.createResource("com.ibm.team.filesystem.rest.client.locks");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamAttributeAnnotations();
        this.createTeamReferenceAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOlocks", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.lockedShareableDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.lockedResourcesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.streamLockReportDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.componentLockReportDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.versionableLockDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.contributorNameDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.unlockResourcesResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.lockEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getLockedShareableDTO_LockedShareable(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockedResourcesDTO_LockedShareables(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockedResourcesDTO_Owners(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockedResourcesDTO_TeamLocks(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockedResourcesDTO_UserLocks(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStreamLockReportDTO_ComponentLockReports(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentLockReportDTO_VersionableLocks(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnlockResourcesResultDTO_CurrentUserDoesntOwnLocks(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getLockedShareableDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockedShareableDTO_VersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockedShareableDTO_StreamItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStreamLockReportDTO_StreamItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStreamLockReportDTO_StreamName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentLockReportDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableLockDTO_ContributorItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableLockDTO_VersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContributorNameDTO_ContributorItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContributorNameDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnlockResourcesResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockEntryDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockEntryDTO_RepositoryItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockEntryDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockEntryDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLockEntryDTO_VersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
}
