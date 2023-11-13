// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.share.MultipleSandboxShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareOverlapDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareResultDTO;
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
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.impl.FilesystemRestClientDTOchangesetPackageImpl;
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
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOshareFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOsharePackageImpl extends EPackageImpl implements FilesystemRestClientDTOsharePackage
{
    private EClass shareResultDTOEClass;
    private EClass shareOverlapDTOEClass;
    private EClass multipleSandboxShareDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOsharePackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOsharePackageImpl() {
        super("com.ibm.team.filesystem.rest.client.share", (EFactory)FilesystemRestClientDTOshareFactory.eINSTANCE);
        this.shareResultDTOEClass = null;
        this.shareOverlapDTOEClass = null;
        this.multipleSandboxShareDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOsharePackage init() {
        if (FilesystemRestClientDTOsharePackageImpl.isInited) {
            return (FilesystemRestClientDTOsharePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share");
        }
        final FilesystemRestClientDTOsharePackageImpl theFilesystemRestClientDTOsharePackage = (FilesystemRestClientDTOsharePackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.share") instanceof FilesystemRestClientDTOsharePackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.share") : new FilesystemRestClientDTOsharePackageImpl());
        FilesystemRestClientDTOsharePackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") : FilesystemRestClientDTOcorePackage.eINSTANCE);
        final FilesystemRestClientDTOdilemmaPackageImpl theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") instanceof FilesystemRestClientDTOdilemmaPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") : FilesystemRestClientDTOdilemmaPackage.eINSTANCE);
        final FilesystemRestClientDTOloadPackageImpl theFilesystemRestClientDTOloadPackage = (FilesystemRestClientDTOloadPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") instanceof FilesystemRestClientDTOloadPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") : FilesystemRestClientDTOloadPackage.eINSTANCE);
        final FilesystemRestClientDTOsyncPackageImpl theFilesystemRestClientDTOsyncPackage = (FilesystemRestClientDTOsyncPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") instanceof FilesystemRestClientDTOsyncPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") : FilesystemRestClientDTOsyncPackage.eINSTANCE);
        final FilesystemRestClientDTOchangelogPackageImpl theFilesystemRestClientDTOchangelogPackage = (FilesystemRestClientDTOchangelogPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") instanceof FilesystemRestClientDTOchangelogPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") : FilesystemRestClientDTOchangelogPackage.eINSTANCE);
        final FilesystemRestClientDTOchangesetPackageImpl theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") instanceof FilesystemRestClientDTOchangesetPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") : FilesystemRestClientDTOchangesetPackage.eINSTANCE);
        final FilesystemRestClientDTOresourcePackageImpl theFilesystemRestClientDTOresourcePackage = (FilesystemRestClientDTOresourcePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") instanceof FilesystemRestClientDTOresourcePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") : FilesystemRestClientDTOresourcePackage.eINSTANCE);
        final FilesystemRestClientDTOconflictPackageImpl theFilesystemRestClientDTOconflictPackage = (FilesystemRestClientDTOconflictPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") instanceof FilesystemRestClientDTOconflictPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") : FilesystemRestClientDTOconflictPackage.eINSTANCE);
        final FilesystemRestClientDTOignoresPackageImpl theFilesystemRestClientDTOignoresPackage = (FilesystemRestClientDTOignoresPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") instanceof FilesystemRestClientDTOignoresPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") : FilesystemRestClientDTOignoresPackage.eINSTANCE);
        final FilesystemRestClientDTOworkspacePackageImpl theFilesystemRestClientDTOworkspacePackage = (FilesystemRestClientDTOworkspacePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") instanceof FilesystemRestClientDTOworkspacePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") : FilesystemRestClientDTOworkspacePackage.eINSTANCE);
        final FilesystemRestClientDTOcorruptionPackageImpl theFilesystemRestClientDTOcorruptionPackage = (FilesystemRestClientDTOcorruptionPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") instanceof FilesystemRestClientDTOcorruptionPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") : FilesystemRestClientDTOcorruptionPackage.eINSTANCE);
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") : FilesystemRestClientDTOlocksPackage.eINSTANCE);
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
        theFilesystemRestClientDTOsharePackage.createPackageContents();
        theFilesystemRestClientDTOcorePackage.createPackageContents();
        theFilesystemRestClientDTOdilemmaPackage.createPackageContents();
        theFilesystemRestClientDTOloadPackage.createPackageContents();
        theFilesystemRestClientDTOsyncPackage.createPackageContents();
        theFilesystemRestClientDTOchangelogPackage.createPackageContents();
        theFilesystemRestClientDTOchangesetPackage.createPackageContents();
        theFilesystemRestClientDTOresourcePackage.createPackageContents();
        theFilesystemRestClientDTOconflictPackage.createPackageContents();
        theFilesystemRestClientDTOignoresPackage.createPackageContents();
        theFilesystemRestClientDTOworkspacePackage.createPackageContents();
        theFilesystemRestClientDTOcorruptionPackage.createPackageContents();
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
        theFilesystemRestClientDTOsharePackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.initializePackageContents();
        theFilesystemRestClientDTOdilemmaPackage.initializePackageContents();
        theFilesystemRestClientDTOloadPackage.initializePackageContents();
        theFilesystemRestClientDTOsyncPackage.initializePackageContents();
        theFilesystemRestClientDTOchangelogPackage.initializePackageContents();
        theFilesystemRestClientDTOchangesetPackage.initializePackageContents();
        theFilesystemRestClientDTOresourcePackage.initializePackageContents();
        theFilesystemRestClientDTOconflictPackage.initializePackageContents();
        theFilesystemRestClientDTOignoresPackage.initializePackageContents();
        theFilesystemRestClientDTOworkspacePackage.initializePackageContents();
        theFilesystemRestClientDTOcorruptionPackage.initializePackageContents();
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOsharePackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.share", (Object)theFilesystemRestClientDTOsharePackage);
        return theFilesystemRestClientDTOsharePackage;
    }
    
    public EClass getShareResultDTO() {
        return this.shareResultDTOEClass;
    }
    
    public EAttribute getShareResultDTO_Cancelled() {
        return (EAttribute)this.shareResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getShareResultDTO_ChangeSetsCommitted() {
        return (EAttribute)this.shareResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getShareResultDTO_ShareOverlaps() {
        return (EReference)this.shareResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getShareResultDTO_MultipleSandboxShares() {
        return (EReference)this.shareResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getShareResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.shareResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getShareResultDTO_CommitDilemma() {
        return (EReference)this.shareResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getShareOverlapDTO() {
        return this.shareOverlapDTOEClass;
    }
    
    public EAttribute getShareOverlapDTO_RepositoryURL() {
        return (EAttribute)this.shareOverlapDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getShareOverlapDTO_WorkspaceItemId() {
        return (EAttribute)this.shareOverlapDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getShareOverlapDTO_ComponentItemId() {
        return (EAttribute)this.shareOverlapDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getShareOverlapDTO_Root() {
        return (EReference)this.shareOverlapDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getShareOverlapDTO_OverlappingShares() {
        return (EReference)this.shareOverlapDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getShareOverlapDTO_RepositoryId() {
        return (EAttribute)this.shareOverlapDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getShareOverlapDTO_OverlappingRoots() {
        return (EReference)this.shareOverlapDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getMultipleSandboxShareDTO() {
        return this.multipleSandboxShareDTOEClass;
    }
    
    public EReference getMultipleSandboxShareDTO_Configuration() {
        return (EReference)this.multipleSandboxShareDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getMultipleSandboxShareDTO_Sandboxes() {
        return (EAttribute)this.multipleSandboxShareDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getMultipleSandboxShareDTO_Roots() {
        return (EReference)this.multipleSandboxShareDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public FilesystemRestClientDTOshareFactory getFilesystemRestClientDTOshareFactory() {
        return (FilesystemRestClientDTOshareFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEAttribute(this.shareResultDTOEClass = this.createEClass(0), 0);
        this.createEAttribute(this.shareResultDTOEClass, 1);
        this.createEReference(this.shareResultDTOEClass, 2);
        this.createEReference(this.shareResultDTOEClass, 3);
        this.createEReference(this.shareResultDTOEClass, 4);
        this.createEReference(this.shareResultDTOEClass, 5);
        this.createEAttribute(this.shareOverlapDTOEClass = this.createEClass(1), 0);
        this.createEReference(this.shareOverlapDTOEClass, 1);
        this.createEReference(this.shareOverlapDTOEClass, 2);
        this.createEAttribute(this.shareOverlapDTOEClass, 3);
        this.createEAttribute(this.shareOverlapDTOEClass, 4);
        this.createEReference(this.shareOverlapDTOEClass, 5);
        this.createEAttribute(this.shareOverlapDTOEClass, 6);
        this.createEReference(this.multipleSandboxShareDTOEClass = this.createEClass(2), 0);
        this.createEAttribute(this.multipleSandboxShareDTOEClass, 1);
        this.createEReference(this.multipleSandboxShareDTOEClass, 2);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("share");
        this.setNsPrefix("filesystemRestClientDTOshare");
        this.setNsURI("com.ibm.team.filesystem.rest.client.share");
        final FilesystemRestClientDTOdilemmaPackage theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        this.initEClass(this.shareResultDTOEClass, (Class)ShareResultDTO.class, "ShareResultDTO", false, false, true);
        this.initEAttribute(this.getShareResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)ShareResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getShareResultDTO_ChangeSetsCommitted(), (EClassifier)this.ecorePackage.getEString(), "changeSetsCommitted", (String)null, 1, -1, (Class)ShareResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getShareResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)ShareResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getShareResultDTO_MultipleSandboxShares(), (EClassifier)this.getMultipleSandboxShareDTO(), (EReference)null, "multipleSandboxShares", (String)null, 0, -1, (Class)ShareResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getShareResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)ShareResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getShareResultDTO_ShareOverlaps(), (EClassifier)this.getShareOverlapDTO(), (EReference)null, "shareOverlaps", (String)null, 0, -1, (Class)ShareResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.shareOverlapDTOEClass, (Class)ShareOverlapDTO.class, "ShareOverlapDTO", false, false, true);
        this.initEAttribute(this.getShareOverlapDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)ShareOverlapDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getShareOverlapDTO_OverlappingRoots(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "overlappingRoots", (String)null, 0, -1, (Class)ShareOverlapDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getShareOverlapDTO_OverlappingShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "overlappingShares", (String)null, 0, -1, (Class)ShareOverlapDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getShareOverlapDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)ShareOverlapDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getShareOverlapDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 0, 1, (Class)ShareOverlapDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getShareOverlapDTO_Root(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "root", (String)null, 0, 1, (Class)ShareOverlapDTO.class, false, false, true, true, false, true, false, false, false);
        this.initEAttribute(this.getShareOverlapDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)ShareOverlapDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.multipleSandboxShareDTOEClass, (Class)MultipleSandboxShareDTO.class, "MultipleSandboxShareDTO", false, false, true);
        this.initEReference(this.getMultipleSandboxShareDTO_Configuration(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationDescriptorDTO(), (EReference)null, "configuration", (String)null, 1, 1, (Class)MultipleSandboxShareDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getMultipleSandboxShareDTO_Sandboxes(), (EClassifier)this.ecorePackage.getEString(), "sandboxes", (String)null, 1, -1, (Class)MultipleSandboxShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getMultipleSandboxShareDTO_Roots(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "roots", (String)null, 0, -1, (Class)MultipleSandboxShareDTO.class, false, false, true, true, false, true, true, false, false);
        this.createResource("com.ibm.team.filesystem.rest.client.share");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamAttributeAnnotations();
        this.createTeamReferenceAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOshare", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.shareResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.shareOverlapDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.multipleSandboxShareDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getShareResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareResultDTO_ChangeSetsCommitted(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareOverlapDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareOverlapDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareOverlapDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareOverlapDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMultipleSandboxShareDTO_Sandboxes(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getShareResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareResultDTO_MultipleSandboxShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareResultDTO_ShareOverlaps(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareOverlapDTO_OverlappingRoots(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareOverlapDTO_OverlappingShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareOverlapDTO_Root(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMultipleSandboxShareDTO_Configuration(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMultipleSandboxShareDTO_Roots(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
}
