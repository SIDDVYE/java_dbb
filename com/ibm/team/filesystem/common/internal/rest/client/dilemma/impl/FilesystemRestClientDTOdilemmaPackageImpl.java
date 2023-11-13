// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
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
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import com.ibm.team.filesystem.common.internal.rest.client.load.impl.FilesystemRestClientDTOloadPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import com.ibm.team.filesystem.common.internal.rest.client.core.impl.FilesystemRestClientDTOcorePackageImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOdilemmaPackageImpl extends EPackageImpl implements FilesystemRestClientDTOdilemmaPackage
{
    private EClass sandboxUpdateDilemmaDTOEClass;
    private EClass commitDilemmaDTOEClass;
    private EClass updateDilemmaDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOdilemmaPackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOdilemmaPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.dilemma", (EFactory)FilesystemRestClientDTOdilemmaFactory.eINSTANCE);
        this.sandboxUpdateDilemmaDTOEClass = null;
        this.commitDilemmaDTOEClass = null;
        this.updateDilemmaDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOdilemmaPackage init() {
        if (FilesystemRestClientDTOdilemmaPackageImpl.isInited) {
            return (FilesystemRestClientDTOdilemmaPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma");
        }
        final FilesystemRestClientDTOdilemmaPackageImpl theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.dilemma") instanceof FilesystemRestClientDTOdilemmaPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.dilemma") : new FilesystemRestClientDTOdilemmaPackageImpl());
        FilesystemRestClientDTOdilemmaPackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") : FilesystemRestClientDTOcorePackage.eINSTANCE);
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
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") : FilesystemRestClientDTOlocksPackage.eINSTANCE);
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
        theFilesystemRestClientDTOdilemmaPackage.createPackageContents();
        theFilesystemRestClientDTOcorePackage.createPackageContents();
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
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
        theFilesystemRestClientDTOdilemmaPackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.initializePackageContents();
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
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOdilemmaPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.dilemma", (Object)theFilesystemRestClientDTOdilemmaPackage);
        return theFilesystemRestClientDTOdilemmaPackage;
    }
    
    public EClass getSandboxUpdateDilemmaDTO() {
        return this.sandboxUpdateDilemmaDTOEClass;
    }
    
    public EReference getSandboxUpdateDilemmaDTO_DeletedContentShareables() {
        return (EReference)this.sandboxUpdateDilemmaDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getSandboxUpdateDilemmaDTO_BackedUpToShed() {
        return (EReference)this.sandboxUpdateDilemmaDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getCommitDilemmaDTO() {
        return this.commitDilemmaDTOEClass;
    }
    
    public EReference getCommitDilemmaDTO_LineDelimiterFailures() {
        return (EReference)this.commitDilemmaDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getCommitDilemmaDTO_EncodingFailures() {
        return (EReference)this.commitDilemmaDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getCommitDilemmaDTO_BrokenLinks() {
        return (EReference)this.commitDilemmaDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getCommitDilemmaDTO_NonInteroperableLinks() {
        return (EReference)this.commitDilemmaDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getCommitDilemmaDTO_PredecessorDeletedShareables() {
        return (EReference)this.commitDilemmaDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getCommitDilemmaDTO_NonPatchShareables() {
        return (EReference)this.commitDilemmaDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getUpdateDilemmaDTO() {
        return this.updateDilemmaDTOEClass;
    }
    
    public EReference getUpdateDilemmaDTO_InaccessibleForUpdate() {
        return (EReference)this.updateDilemmaDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getUpdateDilemmaDTO_SiblingSharesToAdd() {
        return (EReference)this.updateDilemmaDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public FilesystemRestClientDTOdilemmaFactory getFilesystemRestClientDTOdilemmaFactory() {
        return (FilesystemRestClientDTOdilemmaFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEReference(this.sandboxUpdateDilemmaDTOEClass = this.createEClass(0), 0);
        this.createEReference(this.sandboxUpdateDilemmaDTOEClass, 1);
        this.createEReference(this.commitDilemmaDTOEClass = this.createEClass(1), 0);
        this.createEReference(this.commitDilemmaDTOEClass, 1);
        this.createEReference(this.commitDilemmaDTOEClass, 2);
        this.createEReference(this.commitDilemmaDTOEClass, 3);
        this.createEReference(this.commitDilemmaDTOEClass, 4);
        this.createEReference(this.commitDilemmaDTOEClass, 5);
        this.createEReference(this.updateDilemmaDTOEClass = this.createEClass(2), 0);
        this.createEReference(this.updateDilemmaDTOEClass, 1);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("dilemma");
        this.setNsPrefix("filesystemRestClientDTOdilemma");
        this.setNsURI("com.ibm.team.filesystem.rest.client.dilemma");
        final FilesystemRestClientDTOchangesetPackage theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        final FilesystemRestClientDTOresourcePackage theFilesystemRestClientDTOresourcePackage = (FilesystemRestClientDTOresourcePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource");
        this.initEClass(this.sandboxUpdateDilemmaDTOEClass, (Class)SandboxUpdateDilemmaDTO.class, "SandboxUpdateDilemmaDTO", false, false, true);
        this.initEReference(this.getSandboxUpdateDilemmaDTO_BackedUpToShed(), (EClassifier)theFilesystemRestClientDTOchangesetPackage.getBackupInShedDTO(), (EReference)null, "backedUpToShed", (String)null, 0, -1, (Class)SandboxUpdateDilemmaDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getSandboxUpdateDilemmaDTO_DeletedContentShareables(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "deletedContentShareables", (String)null, 0, -1, (Class)SandboxUpdateDilemmaDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.commitDilemmaDTOEClass, (Class)CommitDilemmaDTO.class, "CommitDilemmaDTO", false, false, true);
        this.initEReference(this.getCommitDilemmaDTO_BrokenLinks(), (EClassifier)theFilesystemRestClientDTOresourcePackage.getSymlinkWarningDTO(), (EReference)null, "brokenLinks", (String)null, 0, -1, (Class)CommitDilemmaDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCommitDilemmaDTO_EncodingFailures(), (EClassifier)theFilesystemRestClientDTOresourcePackage.getEncodingErrorDTO(), (EReference)null, "encodingFailures", (String)null, 0, -1, (Class)CommitDilemmaDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCommitDilemmaDTO_LineDelimiterFailures(), (EClassifier)theFilesystemRestClientDTOresourcePackage.getLineDelimiterErrorDTO(), (EReference)null, "lineDelimiterFailures", (String)null, 0, -1, (Class)CommitDilemmaDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCommitDilemmaDTO_NonInteroperableLinks(), (EClassifier)theFilesystemRestClientDTOresourcePackage.getSymlinkWarningDTO(), (EReference)null, "nonInteroperableLinks", (String)null, 0, -1, (Class)CommitDilemmaDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCommitDilemmaDTO_PredecessorDeletedShareables(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "predecessorDeletedShareables", (String)null, 0, -1, (Class)CommitDilemmaDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCommitDilemmaDTO_NonPatchShareables(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "nonPatchShareables", (String)null, 0, -1, (Class)CommitDilemmaDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.updateDilemmaDTOEClass, (Class)UpdateDilemmaDTO.class, "UpdateDilemmaDTO", false, false, true);
        this.initEReference(this.getUpdateDilemmaDTO_InaccessibleForUpdate(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "inaccessibleForUpdate", (String)null, 0, -1, (Class)UpdateDilemmaDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUpdateDilemmaDTO_SiblingSharesToAdd(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "siblingSharesToAdd", (String)null, 0, -1, (Class)UpdateDilemmaDTO.class, false, false, true, true, false, true, true, false, false);
        this.createResource("com.ibm.team.filesystem.rest.client.dilemma");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamReferenceAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOdilemma", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.sandboxUpdateDilemmaDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.commitDilemmaDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.updateDilemmaDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getSandboxUpdateDilemmaDTO_BackedUpToShed(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxUpdateDilemmaDTO_DeletedContentShareables(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCommitDilemmaDTO_BrokenLinks(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCommitDilemmaDTO_EncodingFailures(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCommitDilemmaDTO_LineDelimiterFailures(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCommitDilemmaDTO_NonInteroperableLinks(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCommitDilemmaDTO_PredecessorDeletedShareables(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCommitDilemmaDTO_NonPatchShareables(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateDilemmaDTO_InaccessibleForUpdate(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateDilemmaDTO_SiblingSharesToAdd(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
}
