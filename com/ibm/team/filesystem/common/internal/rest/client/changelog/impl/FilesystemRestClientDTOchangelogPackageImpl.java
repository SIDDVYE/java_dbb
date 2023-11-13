// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogOslcLinkEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogRootEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogDirectionEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogBaselineEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogWorkItemEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogVersionableEntry2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogVersionableEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogChangeSetEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogComponentEntryDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogEntryDTO;
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
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;
import com.ibm.team.filesystem.common.internal.rest.client.share.impl.FilesystemRestClientDTOsharePackageImpl;
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
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOchangelogPackageImpl extends EPackageImpl implements FilesystemRestClientDTOchangelogPackage
{
    private EClass changeLogEntryDTOEClass;
    private EClass changeLogComponentEntryDTOEClass;
    private EClass changeLogChangeSetEntryDTOEClass;
    private EClass changeLogVersionableEntryDTOEClass;
    private EClass changeLogVersionableEntry2DTOEClass;
    private EClass changeLogWorkItemEntryDTOEClass;
    private EClass changeLogBaselineEntryDTOEClass;
    private EClass changeLogDirectionEntryDTOEClass;
    private EClass changeLogRootEntryDTOEClass;
    private EClass changeLogOslcLinkEntryDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOchangelogPackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOchangelogPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.changelog", (EFactory)FilesystemRestClientDTOchangelogFactory.eINSTANCE);
        this.changeLogEntryDTOEClass = null;
        this.changeLogComponentEntryDTOEClass = null;
        this.changeLogChangeSetEntryDTOEClass = null;
        this.changeLogVersionableEntryDTOEClass = null;
        this.changeLogVersionableEntry2DTOEClass = null;
        this.changeLogWorkItemEntryDTOEClass = null;
        this.changeLogBaselineEntryDTOEClass = null;
        this.changeLogDirectionEntryDTOEClass = null;
        this.changeLogRootEntryDTOEClass = null;
        this.changeLogOslcLinkEntryDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOchangelogPackage init() {
        if (FilesystemRestClientDTOchangelogPackageImpl.isInited) {
            return (FilesystemRestClientDTOchangelogPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog");
        }
        final FilesystemRestClientDTOchangelogPackageImpl theFilesystemRestClientDTOchangelogPackage = (FilesystemRestClientDTOchangelogPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.changelog") instanceof FilesystemRestClientDTOchangelogPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.changelog") : new FilesystemRestClientDTOchangelogPackageImpl());
        FilesystemRestClientDTOchangelogPackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") : FilesystemRestClientDTOcorePackage.eINSTANCE);
        final FilesystemRestClientDTOdilemmaPackageImpl theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") instanceof FilesystemRestClientDTOdilemmaPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") : FilesystemRestClientDTOdilemmaPackage.eINSTANCE);
        final FilesystemRestClientDTOloadPackageImpl theFilesystemRestClientDTOloadPackage = (FilesystemRestClientDTOloadPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") instanceof FilesystemRestClientDTOloadPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") : FilesystemRestClientDTOloadPackage.eINSTANCE);
        final FilesystemRestClientDTOsyncPackageImpl theFilesystemRestClientDTOsyncPackage = (FilesystemRestClientDTOsyncPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") instanceof FilesystemRestClientDTOsyncPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") : FilesystemRestClientDTOsyncPackage.eINSTANCE);
        final FilesystemRestClientDTOsharePackageImpl theFilesystemRestClientDTOsharePackage = (FilesystemRestClientDTOsharePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") instanceof FilesystemRestClientDTOsharePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") : FilesystemRestClientDTOsharePackage.eINSTANCE);
        final FilesystemRestClientDTOchangesetPackageImpl theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") instanceof FilesystemRestClientDTOchangesetPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") : FilesystemRestClientDTOchangesetPackage.eINSTANCE);
        final FilesystemRestClientDTOresourcePackageImpl theFilesystemRestClientDTOresourcePackage = (FilesystemRestClientDTOresourcePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") instanceof FilesystemRestClientDTOresourcePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") : FilesystemRestClientDTOresourcePackage.eINSTANCE);
        final FilesystemRestClientDTOconflictPackageImpl theFilesystemRestClientDTOconflictPackage = (FilesystemRestClientDTOconflictPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") instanceof FilesystemRestClientDTOconflictPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") : FilesystemRestClientDTOconflictPackage.eINSTANCE);
        final FilesystemRestClientDTOignoresPackageImpl theFilesystemRestClientDTOignoresPackage = (FilesystemRestClientDTOignoresPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") instanceof FilesystemRestClientDTOignoresPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") : FilesystemRestClientDTOignoresPackage.eINSTANCE);
        final FilesystemRestClientDTOworkspacePackageImpl theFilesystemRestClientDTOworkspacePackage = (FilesystemRestClientDTOworkspacePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") instanceof FilesystemRestClientDTOworkspacePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") : FilesystemRestClientDTOworkspacePackage.eINSTANCE);
        final FilesystemRestClientDTOcorruptionPackageImpl theFilesystemRestClientDTOcorruptionPackage = (FilesystemRestClientDTOcorruptionPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") instanceof FilesystemRestClientDTOcorruptionPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") : FilesystemRestClientDTOcorruptionPackage.eINSTANCE);
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") : FilesystemRestClientDTOlocksPackage.eINSTANCE);
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
        theFilesystemRestClientDTOchangelogPackage.createPackageContents();
        theFilesystemRestClientDTOcorePackage.createPackageContents();
        theFilesystemRestClientDTOdilemmaPackage.createPackageContents();
        theFilesystemRestClientDTOloadPackage.createPackageContents();
        theFilesystemRestClientDTOsyncPackage.createPackageContents();
        theFilesystemRestClientDTOsharePackage.createPackageContents();
        theFilesystemRestClientDTOchangesetPackage.createPackageContents();
        theFilesystemRestClientDTOresourcePackage.createPackageContents();
        theFilesystemRestClientDTOconflictPackage.createPackageContents();
        theFilesystemRestClientDTOignoresPackage.createPackageContents();
        theFilesystemRestClientDTOworkspacePackage.createPackageContents();
        theFilesystemRestClientDTOcorruptionPackage.createPackageContents();
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
        theFilesystemRestClientDTOchangelogPackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.initializePackageContents();
        theFilesystemRestClientDTOdilemmaPackage.initializePackageContents();
        theFilesystemRestClientDTOloadPackage.initializePackageContents();
        theFilesystemRestClientDTOsyncPackage.initializePackageContents();
        theFilesystemRestClientDTOsharePackage.initializePackageContents();
        theFilesystemRestClientDTOchangesetPackage.initializePackageContents();
        theFilesystemRestClientDTOresourcePackage.initializePackageContents();
        theFilesystemRestClientDTOconflictPackage.initializePackageContents();
        theFilesystemRestClientDTOignoresPackage.initializePackageContents();
        theFilesystemRestClientDTOworkspacePackage.initializePackageContents();
        theFilesystemRestClientDTOcorruptionPackage.initializePackageContents();
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOchangelogPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.changelog", (Object)theFilesystemRestClientDTOchangelogPackage);
        return theFilesystemRestClientDTOchangelogPackage;
    }
    
    public EClass getChangeLogEntryDTO() {
        return this.changeLogEntryDTOEClass;
    }
    
    public EAttribute getChangeLogEntryDTO_EntryType() {
        return (EAttribute)this.changeLogEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getChangeLogEntryDTO_ItemId() {
        return (EAttribute)this.changeLogEntryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getChangeLogEntryDTO_ChildEntries() {
        return (EReference)this.changeLogEntryDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getChangeLogEntryDTO_EntryName() {
        return (EAttribute)this.changeLogEntryDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getChangeLogComponentEntryDTO() {
        return this.changeLogComponentEntryDTOEClass;
    }
    
    public EAttribute getChangeLogComponentEntryDTO_ChangeType() {
        return (EAttribute)this.changeLogComponentEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getChangeLogChangeSetEntryDTO() {
        return this.changeLogChangeSetEntryDTOEClass;
    }
    
    public EReference getChangeLogChangeSetEntryDTO_WorkItems() {
        return (EReference)this.changeLogChangeSetEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getChangeLogChangeSetEntryDTO_OslcLinks() {
        return (EReference)this.changeLogChangeSetEntryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getChangeLogChangeSetEntryDTO_CreationDate() {
        return (EAttribute)this.changeLogChangeSetEntryDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getChangeLogChangeSetEntryDTO_Creator() {
        return (EReference)this.changeLogChangeSetEntryDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getChangeLogVersionableEntryDTO() {
        return this.changeLogVersionableEntryDTOEClass;
    }
    
    public EAttribute getChangeLogVersionableEntryDTO_Segments() {
        return (EAttribute)this.changeLogVersionableEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getChangeLogVersionableEntryDTO_Resolved() {
        return (EAttribute)this.changeLogVersionableEntryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getChangeLogVersionableEntry2DTO() {
        return this.changeLogVersionableEntry2DTOEClass;
    }
    
    public EAttribute getChangeLogVersionableEntry2DTO_ShortVersionId() {
        return (EAttribute)this.changeLogVersionableEntry2DTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getChangeLogVersionableEntry2DTO_LongVersionId() {
        return (EAttribute)this.changeLogVersionableEntry2DTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getChangeLogWorkItemEntryDTO() {
        return this.changeLogWorkItemEntryDTOEClass;
    }
    
    public EAttribute getChangeLogWorkItemEntryDTO_WorkItemNumber() {
        return (EAttribute)this.changeLogWorkItemEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getChangeLogWorkItemEntryDTO_Resolver() {
        return (EReference)this.changeLogWorkItemEntryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getChangeLogBaselineEntryDTO() {
        return this.changeLogBaselineEntryDTOEClass;
    }
    
    public EAttribute getChangeLogBaselineEntryDTO_BaselineId() {
        return (EAttribute)this.changeLogBaselineEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getChangeLogBaselineEntryDTO_CreationDate() {
        return (EAttribute)this.changeLogBaselineEntryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getChangeLogBaselineEntryDTO_Creator() {
        return (EReference)this.changeLogBaselineEntryDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getChangeLogDirectionEntryDTO() {
        return this.changeLogDirectionEntryDTOEClass;
    }
    
    public EAttribute getChangeLogDirectionEntryDTO_FlowDirection() {
        return (EAttribute)this.changeLogDirectionEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getChangeLogRootEntryDTO() {
        return this.changeLogRootEntryDTOEClass;
    }
    
    public EAttribute getChangeLogRootEntryDTO_RepositoryId() {
        return (EAttribute)this.changeLogRootEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getChangeLogRootEntryDTO_RepositoryUri() {
        return (EAttribute)this.changeLogRootEntryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getChangeLogOslcLinkEntryDTO() {
        return this.changeLogOslcLinkEntryDTOEClass;
    }
    
    public EAttribute getChangeLogOslcLinkEntryDTO_TargetUri() {
        return (EAttribute)this.changeLogOslcLinkEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public FilesystemRestClientDTOchangelogFactory getFilesystemRestClientDTOchangelogFactory() {
        return (FilesystemRestClientDTOchangelogFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEAttribute(this.changeLogEntryDTOEClass = this.createEClass(0), 0);
        this.createEAttribute(this.changeLogEntryDTOEClass, 1);
        this.createEReference(this.changeLogEntryDTOEClass, 2);
        this.createEAttribute(this.changeLogEntryDTOEClass, 3);
        this.createEAttribute(this.changeLogComponentEntryDTOEClass = this.createEClass(1), 4);
        this.createEReference(this.changeLogChangeSetEntryDTOEClass = this.createEClass(2), 4);
        this.createEReference(this.changeLogChangeSetEntryDTOEClass, 5);
        this.createEAttribute(this.changeLogChangeSetEntryDTOEClass, 6);
        this.createEReference(this.changeLogChangeSetEntryDTOEClass, 7);
        this.createEAttribute(this.changeLogVersionableEntryDTOEClass = this.createEClass(3), 4);
        this.createEAttribute(this.changeLogVersionableEntryDTOEClass, 5);
        this.createEAttribute(this.changeLogVersionableEntry2DTOEClass = this.createEClass(4), 6);
        this.createEAttribute(this.changeLogVersionableEntry2DTOEClass, 7);
        this.createEAttribute(this.changeLogWorkItemEntryDTOEClass = this.createEClass(5), 4);
        this.createEReference(this.changeLogWorkItemEntryDTOEClass, 5);
        this.createEAttribute(this.changeLogBaselineEntryDTOEClass = this.createEClass(6), 4);
        this.createEAttribute(this.changeLogBaselineEntryDTOEClass, 5);
        this.createEReference(this.changeLogBaselineEntryDTOEClass, 6);
        this.createEAttribute(this.changeLogDirectionEntryDTOEClass = this.createEClass(7), 4);
        this.createEAttribute(this.changeLogRootEntryDTOEClass = this.createEClass(8), 4);
        this.createEAttribute(this.changeLogRootEntryDTOEClass, 5);
        this.createEAttribute(this.changeLogOslcLinkEntryDTOEClass = this.createEClass(9), 4);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("changelog");
        this.setNsPrefix("filesystemRestClientDTOsync");
        this.setNsURI("com.ibm.team.filesystem.rest.client.changelog");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        this.changeLogComponentEntryDTOEClass.getESuperTypes().add((Object)this.getChangeLogEntryDTO());
        this.changeLogChangeSetEntryDTOEClass.getESuperTypes().add((Object)this.getChangeLogEntryDTO());
        this.changeLogVersionableEntryDTOEClass.getESuperTypes().add((Object)this.getChangeLogEntryDTO());
        this.changeLogVersionableEntry2DTOEClass.getESuperTypes().add((Object)this.getChangeLogVersionableEntryDTO());
        this.changeLogWorkItemEntryDTOEClass.getESuperTypes().add((Object)this.getChangeLogEntryDTO());
        this.changeLogBaselineEntryDTOEClass.getESuperTypes().add((Object)this.getChangeLogEntryDTO());
        this.changeLogDirectionEntryDTOEClass.getESuperTypes().add((Object)this.getChangeLogEntryDTO());
        this.changeLogRootEntryDTOEClass.getESuperTypes().add((Object)this.getChangeLogEntryDTO());
        this.changeLogOslcLinkEntryDTOEClass.getESuperTypes().add((Object)this.getChangeLogEntryDTO());
        this.initEClass(this.changeLogEntryDTOEClass, (Class)ChangeLogEntryDTO.class, "ChangeLogEntryDTO", false, false, true);
        this.initEAttribute(this.getChangeLogEntryDTO_EntryType(), (EClassifier)this.ecorePackage.getEString(), "entryType", (String)null, 0, 1, (Class)ChangeLogEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeLogEntryDTO_ItemId(), (EClassifier)this.ecorePackage.getEString(), "itemId", (String)null, 0, 1, (Class)ChangeLogEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getChangeLogEntryDTO_ChildEntries(), (EClassifier)this.getChangeLogEntryDTO(), (EReference)null, "childEntries", (String)null, 0, -1, (Class)ChangeLogEntryDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getChangeLogEntryDTO_EntryName(), (EClassifier)this.ecorePackage.getEString(), "entryName", (String)null, 0, 1, (Class)ChangeLogEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.changeLogComponentEntryDTOEClass, (Class)ChangeLogComponentEntryDTO.class, "ChangeLogComponentEntryDTO", false, false, true);
        this.initEAttribute(this.getChangeLogComponentEntryDTO_ChangeType(), (EClassifier)this.ecorePackage.getEString(), "changeType", (String)null, 0, 1, (Class)ChangeLogComponentEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.changeLogChangeSetEntryDTOEClass, (Class)ChangeLogChangeSetEntryDTO.class, "ChangeLogChangeSetEntryDTO", false, false, true);
        this.initEReference(this.getChangeLogChangeSetEntryDTO_WorkItems(), (EClassifier)this.getChangeLogWorkItemEntryDTO(), (EReference)null, "workItems", (String)null, 0, -1, (Class)ChangeLogChangeSetEntryDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getChangeLogChangeSetEntryDTO_OslcLinks(), (EClassifier)this.getChangeLogOslcLinkEntryDTO(), (EReference)null, "oslcLinks", (String)null, 0, -1, (Class)ChangeLogChangeSetEntryDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getChangeLogChangeSetEntryDTO_CreationDate(), (EClassifier)this.ecorePackage.getELong(), "creationDate", (String)null, 0, 1, (Class)ChangeLogChangeSetEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getChangeLogChangeSetEntryDTO_Creator(), (EClassifier)theFilesystemRestClientDTOcorePackage.getContributorDTO(), (EReference)null, "creator", (String)null, 0, 1, (Class)ChangeLogChangeSetEntryDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.changeLogVersionableEntryDTOEClass, (Class)ChangeLogVersionableEntryDTO.class, "ChangeLogVersionableEntryDTO", false, false, true);
        this.initEAttribute(this.getChangeLogVersionableEntryDTO_Segments(), (EClassifier)this.ecorePackage.getEString(), "segments", (String)null, 0, -1, (Class)ChangeLogVersionableEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeLogVersionableEntryDTO_Resolved(), (EClassifier)this.ecorePackage.getEBoolean(), "resolved", (String)null, 0, 1, (Class)ChangeLogVersionableEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.changeLogVersionableEntry2DTOEClass, (Class)ChangeLogVersionableEntry2DTO.class, "ChangeLogVersionableEntry2DTO", false, false, true);
        this.initEAttribute(this.getChangeLogVersionableEntry2DTO_ShortVersionId(), (EClassifier)this.ecorePackage.getEString(), "shortVersionId", (String)null, 1, 1, (Class)ChangeLogVersionableEntry2DTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeLogVersionableEntry2DTO_LongVersionId(), (EClassifier)this.ecorePackage.getEString(), "longVersionId", (String)null, 1, 1, (Class)ChangeLogVersionableEntry2DTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.changeLogWorkItemEntryDTOEClass, (Class)ChangeLogWorkItemEntryDTO.class, "ChangeLogWorkItemEntryDTO", false, false, true);
        this.initEAttribute(this.getChangeLogWorkItemEntryDTO_WorkItemNumber(), (EClassifier)this.ecorePackage.getELong(), "workItemNumber", (String)null, 0, 1, (Class)ChangeLogWorkItemEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getChangeLogWorkItemEntryDTO_Resolver(), (EClassifier)theFilesystemRestClientDTOcorePackage.getContributorDTO(), (EReference)null, "resolver", (String)null, 0, 1, (Class)ChangeLogWorkItemEntryDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.changeLogBaselineEntryDTOEClass, (Class)ChangeLogBaselineEntryDTO.class, "ChangeLogBaselineEntryDTO", false, false, true);
        this.initEAttribute(this.getChangeLogBaselineEntryDTO_BaselineId(), (EClassifier)this.ecorePackage.getEInt(), "baselineId", (String)null, 0, 1, (Class)ChangeLogBaselineEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeLogBaselineEntryDTO_CreationDate(), (EClassifier)this.ecorePackage.getELong(), "creationDate", (String)null, 0, 1, (Class)ChangeLogBaselineEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getChangeLogBaselineEntryDTO_Creator(), (EClassifier)theFilesystemRestClientDTOcorePackage.getContributorDTO(), (EReference)null, "creator", (String)null, 0, 1, (Class)ChangeLogBaselineEntryDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.changeLogDirectionEntryDTOEClass, (Class)ChangeLogDirectionEntryDTO.class, "ChangeLogDirectionEntryDTO", false, false, true);
        this.initEAttribute(this.getChangeLogDirectionEntryDTO_FlowDirection(), (EClassifier)this.ecorePackage.getEString(), "flowDirection", (String)null, 0, 1, (Class)ChangeLogDirectionEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.changeLogRootEntryDTOEClass, (Class)ChangeLogRootEntryDTO.class, "ChangeLogRootEntryDTO", false, false, true);
        this.initEAttribute(this.getChangeLogRootEntryDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)ChangeLogRootEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeLogRootEntryDTO_RepositoryUri(), (EClassifier)this.ecorePackage.getEString(), "repositoryUri", (String)null, 0, 1, (Class)ChangeLogRootEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.changeLogOslcLinkEntryDTOEClass, (Class)ChangeLogOslcLinkEntryDTO.class, "ChangeLogOslcLinkEntryDTO", false, false, true);
        this.initEAttribute(this.getChangeLogOslcLinkEntryDTO_TargetUri(), (EClassifier)this.ecorePackage.getEString(), "targetUri", (String)null, 0, 1, (Class)ChangeLogOslcLinkEntryDTO.class, false, false, true, true, false, true, false, true);
        this.createResource("com.ibm.team.filesystem.rest.client.changelog");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamAttributeAnnotations();
        this.createTeamReferenceAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOchangelog", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.changeLogEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeLogComponentEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeLogChangeSetEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeLogVersionableEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeLogVersionableEntry2DTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeLogWorkItemEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeLogBaselineEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeLogDirectionEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeLogRootEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeLogOslcLinkEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getChangeLogEntryDTO_EntryType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogEntryDTO_ItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogEntryDTO_EntryName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogComponentEntryDTO_ChangeType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogChangeSetEntryDTO_CreationDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogVersionableEntryDTO_Segments(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogVersionableEntryDTO_Resolved(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogVersionableEntry2DTO_ShortVersionId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogVersionableEntry2DTO_LongVersionId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogWorkItemEntryDTO_WorkItemNumber(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogBaselineEntryDTO_BaselineId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogBaselineEntryDTO_CreationDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogDirectionEntryDTO_FlowDirection(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogRootEntryDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogRootEntryDTO_RepositoryUri(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogOslcLinkEntryDTO_TargetUri(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getChangeLogEntryDTO_ChildEntries(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogChangeSetEntryDTO_WorkItems(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogChangeSetEntryDTO_OslcLinks(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogChangeSetEntryDTO_Creator(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogWorkItemEntryDTO_Resolver(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeLogBaselineEntryDTO_Creator(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
}
