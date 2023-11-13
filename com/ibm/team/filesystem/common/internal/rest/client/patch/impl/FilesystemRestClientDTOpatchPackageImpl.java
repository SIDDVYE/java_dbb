// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.patch.PageDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ProcessAcceptQueueResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CompleteCurrentPatchResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.UpdateCurrentPatchResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.AbortCurrentPatchResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ExecuteBitChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.EncodingChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.LineDelimiterChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ContentTypeChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ContentChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.SymbolicLinkChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.MoveChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.PropertyChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.VersionableChangeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CurrentPatchDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeSetSourceDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.patch.AcceptQueueDTO;
import com.ibm.team.repository.common.model.RepositoryPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
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
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl.FilesystemRestClientDTOdilemmaPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import com.ibm.team.filesystem.common.internal.rest.client.core.impl.FilesystemRestClientDTOcorePackageImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOpatchPackageImpl extends EPackageImpl implements FilesystemRestClientDTOpatchPackage
{
    private EClass acceptQueueDTOEClass;
    private EClass changeSetSourceDTOEClass;
    private EClass currentPatchDTOEClass;
    private EClass versionableChangeDTOEClass;
    private EClass changeDetailDTOEClass;
    private EClass propertyChangeDetailDTOEClass;
    private EClass moveChangeDetailDTOEClass;
    private EClass symbolicLinkChangeDetailDTOEClass;
    private EClass contentChangeDetailDTOEClass;
    private EClass contentTypeChangeDetailDTOEClass;
    private EClass lineDelimiterChangeDetailDTOEClass;
    private EClass encodingChangeDetailDTOEClass;
    private EClass executeBitChangeDetailDTOEClass;
    private EClass abortCurrentPatchResultDTOEClass;
    private EClass updateCurrentPatchResultDTOEClass;
    private EClass completeCurrentPatchResultDTOEClass;
    private EClass processAcceptQueueResultDTOEClass;
    private EClass pageDescriptorDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOpatchPackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOpatchPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.patch", (EFactory)FilesystemRestClientDTOpatchFactory.eINSTANCE);
        this.acceptQueueDTOEClass = null;
        this.changeSetSourceDTOEClass = null;
        this.currentPatchDTOEClass = null;
        this.versionableChangeDTOEClass = null;
        this.changeDetailDTOEClass = null;
        this.propertyChangeDetailDTOEClass = null;
        this.moveChangeDetailDTOEClass = null;
        this.symbolicLinkChangeDetailDTOEClass = null;
        this.contentChangeDetailDTOEClass = null;
        this.contentTypeChangeDetailDTOEClass = null;
        this.lineDelimiterChangeDetailDTOEClass = null;
        this.encodingChangeDetailDTOEClass = null;
        this.executeBitChangeDetailDTOEClass = null;
        this.abortCurrentPatchResultDTOEClass = null;
        this.updateCurrentPatchResultDTOEClass = null;
        this.completeCurrentPatchResultDTOEClass = null;
        this.processAcceptQueueResultDTOEClass = null;
        this.pageDescriptorDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOpatchPackage init() {
        if (FilesystemRestClientDTOpatchPackageImpl.isInited) {
            return (FilesystemRestClientDTOpatchPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch");
        }
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.patch") : new FilesystemRestClientDTOpatchPackageImpl());
        FilesystemRestClientDTOpatchPackageImpl.isInited = true;
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
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") : FilesystemRestClientDTOlocksPackage.eINSTANCE);
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
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
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
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
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.patch", (Object)theFilesystemRestClientDTOpatchPackage);
        return theFilesystemRestClientDTOpatchPackage;
    }
    
    public EClass getAcceptQueueDTO() {
        return this.acceptQueueDTOEClass;
    }
    
    public EReference getAcceptQueueDTO_AcceptQueue() {
        return (EReference)this.acceptQueueDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getAcceptQueueDTO_CurrentPatch() {
        return (EReference)this.acceptQueueDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getAcceptQueueDTO_PageDescriptor() {
        return (EReference)this.acceptQueueDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getChangeSetSourceDTO() {
        return this.changeSetSourceDTOEClass;
    }
    
    public EAttribute getChangeSetSourceDTO_SourceId() {
        return (EAttribute)this.changeSetSourceDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getChangeSetSourceDTO_SourceType() {
        return (EAttribute)this.changeSetSourceDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getCurrentPatchDTO() {
        return this.currentPatchDTOEClass;
    }
    
    public EAttribute getCurrentPatchDTO_WorkspaceId() {
        return (EAttribute)this.currentPatchDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getCurrentPatchDTO_ComponentId() {
        return (EAttribute)this.currentPatchDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getCurrentPatchDTO_Source() {
        return (EReference)this.currentPatchDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getCurrentPatchDTO_TargetChangeSetId() {
        return (EAttribute)this.currentPatchDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getCurrentPatchDTO_Changes() {
        return (EReference)this.currentPatchDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EClass getVersionableChangeDTO() {
        return this.versionableChangeDTOEClass;
    }
    
    public EAttribute getVersionableChangeDTO_Resolved() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getVersionableChangeDTO_VersionableItemId() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getVersionableChangeDTO_VersionableType() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getVersionableChangeDTO_Name() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getVersionableChangeDTO_ParentPathHint() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getVersionableChangeDTO_BeforeStateId() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getVersionableChangeDTO_AfterStateId() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getVersionableChangeDTO_ConfigurationStateId() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getVersionableChangeDTO_Kind() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getVersionableChangeDTO_ChangeType() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getVersionableChangeDTO_Incidentals() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EReference getVersionableChangeDTO_ChangeDetails() {
        return (EReference)this.versionableChangeDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EAttribute getVersionableChangeDTO_ChildChanges() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EAttribute getVersionableChangeDTO_DependsOnId() {
        return (EAttribute)this.versionableChangeDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EClass getChangeDetailDTO() {
        return this.changeDetailDTOEClass;
    }
    
    public EAttribute getChangeDetailDTO_PortChangeId() {
        return (EAttribute)this.changeDetailDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getChangeDetailDTO_Id() {
        return (EAttribute)this.changeDetailDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getChangeDetailDTO_Resolved() {
        return (EAttribute)this.changeDetailDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getChangeDetailDTO_Kind() {
        return (EAttribute)this.changeDetailDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getPropertyChangeDetailDTO() {
        return this.propertyChangeDetailDTOEClass;
    }
    
    public EAttribute getPropertyChangeDetailDTO_PropertyName() {
        return (EAttribute)this.propertyChangeDetailDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getPropertyChangeDetailDTO_BeforeValue() {
        return (EAttribute)this.propertyChangeDetailDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getPropertyChangeDetailDTO_AfterValue() {
        return (EAttribute)this.propertyChangeDetailDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getPropertyChangeDetailDTO_Type() {
        return (EAttribute)this.propertyChangeDetailDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getMoveChangeDetailDTO() {
        return this.moveChangeDetailDTOEClass;
    }
    
    public EAttribute getMoveChangeDetailDTO_BeforeParentId() {
        return (EAttribute)this.moveChangeDetailDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getMoveChangeDetailDTO_AfterParentId() {
        return (EAttribute)this.moveChangeDetailDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getMoveChangeDetailDTO_BeforeName() {
        return (EAttribute)this.moveChangeDetailDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getMoveChangeDetailDTO_AfterName() {
        return (EAttribute)this.moveChangeDetailDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getMoveChangeDetailDTO_BeforeParentPathHint() {
        return (EAttribute)this.moveChangeDetailDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getMoveChangeDetailDTO_AfterParentPathHint() {
        return (EAttribute)this.moveChangeDetailDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getMoveChangeDetailDTO_Move() {
        return (EAttribute)this.moveChangeDetailDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getMoveChangeDetailDTO_Rename() {
        return (EAttribute)this.moveChangeDetailDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getMoveChangeDetailDTO_IncidentalDetails() {
        return (EAttribute)this.moveChangeDetailDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EClass getSymbolicLinkChangeDetailDTO() {
        return this.symbolicLinkChangeDetailDTOEClass;
    }
    
    public EAttribute getSymbolicLinkChangeDetailDTO_BeforeTarget() {
        return (EAttribute)this.symbolicLinkChangeDetailDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getSymbolicLinkChangeDetailDTO_AfterTarget() {
        return (EAttribute)this.symbolicLinkChangeDetailDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getSymbolicLinkChangeDetailDTO_BeforeDirectory() {
        return (EAttribute)this.symbolicLinkChangeDetailDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getSymbolicLinkChangeDetailDTO_AfterDirectory() {
        return (EAttribute)this.symbolicLinkChangeDetailDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getContentChangeDetailDTO() {
        return this.contentChangeDetailDTOEClass;
    }
    
    public EAttribute getContentChangeDetailDTO_BeforeContentHash() {
        return (EAttribute)this.contentChangeDetailDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getContentChangeDetailDTO_AfterContentHash() {
        return (EAttribute)this.contentChangeDetailDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getContentTypeChangeDetailDTO() {
        return this.contentTypeChangeDetailDTOEClass;
    }
    
    public EAttribute getContentTypeChangeDetailDTO_BeforeContentType() {
        return (EAttribute)this.contentTypeChangeDetailDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getContentTypeChangeDetailDTO_AfterContentType() {
        return (EAttribute)this.contentTypeChangeDetailDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getLineDelimiterChangeDetailDTO() {
        return this.lineDelimiterChangeDetailDTOEClass;
    }
    
    public EAttribute getLineDelimiterChangeDetailDTO_BeforeLineDelimiter() {
        return (EAttribute)this.lineDelimiterChangeDetailDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getLineDelimiterChangeDetailDTO_AfterLineDelimiter() {
        return (EAttribute)this.lineDelimiterChangeDetailDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getEncodingChangeDetailDTO() {
        return this.encodingChangeDetailDTOEClass;
    }
    
    public EAttribute getEncodingChangeDetailDTO_BeforeCharacterEncoding() {
        return (EAttribute)this.encodingChangeDetailDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getEncodingChangeDetailDTO_AfterCharacterEncoding() {
        return (EAttribute)this.encodingChangeDetailDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getExecuteBitChangeDetailDTO() {
        return this.executeBitChangeDetailDTOEClass;
    }
    
    public EAttribute getExecuteBitChangeDetailDTO_Executable() {
        return (EAttribute)this.executeBitChangeDetailDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getAbortCurrentPatchResultDTO() {
        return this.abortCurrentPatchResultDTOEClass;
    }
    
    public EAttribute getAbortCurrentPatchResultDTO_Cancelled() {
        return (EAttribute)this.abortCurrentPatchResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getAbortCurrentPatchResultDTO_CommitDilemma() {
        return (EReference)this.abortCurrentPatchResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getAbortCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.abortCurrentPatchResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getAbortCurrentPatchResultDTO_OutOfSyncShares() {
        return (EReference)this.abortCurrentPatchResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getAbortCurrentPatchResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.abortCurrentPatchResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getAbortCurrentPatchResultDTO_UpdateDilemma() {
        return (EReference)this.abortCurrentPatchResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getUpdateCurrentPatchResultDTO() {
        return this.updateCurrentPatchResultDTOEClass;
    }
    
    public EReference getUpdateCurrentPatchResultDTO_CurrentPatch() {
        return (EReference)this.updateCurrentPatchResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getUpdateCurrentPatchResultDTO_ResolvedVersionableIds() {
        return (EAttribute)this.updateCurrentPatchResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getUpdateCurrentPatchResultDTO_ResolvedChangeDetailIds() {
        return (EAttribute)this.updateCurrentPatchResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getUpdateCurrentPatchResultDTO_Cancelled() {
        return (EAttribute)this.updateCurrentPatchResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getUpdateCurrentPatchResultDTO_OutOfSyncShares() {
        return (EReference)this.updateCurrentPatchResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getUpdateCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.updateCurrentPatchResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getUpdateCurrentPatchResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.updateCurrentPatchResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getUpdateCurrentPatchResultDTO_CommitDilemma() {
        return (EReference)this.updateCurrentPatchResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EReference getUpdateCurrentPatchResultDTO_UpdateDilemma() {
        return (EReference)this.updateCurrentPatchResultDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getUpdateCurrentPatchResultDTO_VersionableIds() {
        return (EAttribute)this.updateCurrentPatchResultDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EClass getCompleteCurrentPatchResultDTO() {
        return this.completeCurrentPatchResultDTOEClass;
    }
    
    public EAttribute getCompleteCurrentPatchResultDTO_Cancelled() {
        return (EAttribute)this.completeCurrentPatchResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getCompleteCurrentPatchResultDTO_OutOfSyncShares() {
        return (EReference)this.completeCurrentPatchResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getCompleteCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.completeCurrentPatchResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getCompleteCurrentPatchResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.completeCurrentPatchResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getCompleteCurrentPatchResultDTO_CommitDilemma() {
        return (EReference)this.completeCurrentPatchResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getCompleteCurrentPatchResultDTO_UpdateDilemma() {
        return (EReference)this.completeCurrentPatchResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getCompleteCurrentPatchResultDTO_UnresolvedChanges() {
        return (EReference)this.completeCurrentPatchResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getCompleteCurrentPatchResultDTO_AcceptQueueSize() {
        return (EAttribute)this.completeCurrentPatchResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EClass getProcessAcceptQueueResultDTO() {
        return this.processAcceptQueueResultDTOEClass;
    }
    
    public EReference getProcessAcceptQueueResultDTO_CurrentPatch() {
        return (EReference)this.processAcceptQueueResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getProcessAcceptQueueResultDTO_Cancelled() {
        return (EAttribute)this.processAcceptQueueResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getProcessAcceptQueueResultDTO_OutOfSyncShares() {
        return (EReference)this.processAcceptQueueResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getProcessAcceptQueueResultDTO_ConfigurationsWithUncheckedInChanges() {
        return (EReference)this.processAcceptQueueResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getProcessAcceptQueueResultDTO_SandboxUpdateDilemma() {
        return (EReference)this.processAcceptQueueResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getProcessAcceptQueueResultDTO_CommitDilemma() {
        return (EReference)this.processAcceptQueueResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getProcessAcceptQueueResultDTO_UpdateDilemma() {
        return (EReference)this.processAcceptQueueResultDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getProcessAcceptQueueResultDTO_AcceptQueueSize() {
        return (EAttribute)this.processAcceptQueueResultDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EClass getPageDescriptorDTO() {
        return this.pageDescriptorDTOEClass;
    }
    
    public EAttribute getPageDescriptorDTO_RepositoryURI() {
        return (EAttribute)this.pageDescriptorDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getPageDescriptorDTO_WorkspaceID() {
        return (EAttribute)this.pageDescriptorDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getPageDescriptorDTO_ComponentID() {
        return (EAttribute)this.pageDescriptorDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getPageDescriptorDTO_MaxPageSize() {
        return (EAttribute)this.pageDescriptorDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getPageDescriptorDTO_StartIndex() {
        return (EAttribute)this.pageDescriptorDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getPageDescriptorDTO_TotalSize() {
        return (EAttribute)this.pageDescriptorDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getPageDescriptorDTO_SyncTime() {
        return (EAttribute)this.pageDescriptorDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public FilesystemRestClientDTOpatchFactory getFilesystemRestClientDTOpatchFactory() {
        return (FilesystemRestClientDTOpatchFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEReference(this.acceptQueueDTOEClass = this.createEClass(0), 0);
        this.createEReference(this.acceptQueueDTOEClass, 1);
        this.createEReference(this.acceptQueueDTOEClass, 2);
        this.createEAttribute(this.changeSetSourceDTOEClass = this.createEClass(1), 1);
        this.createEAttribute(this.changeSetSourceDTOEClass, 2);
        this.createEAttribute(this.currentPatchDTOEClass = this.createEClass(2), 0);
        this.createEAttribute(this.currentPatchDTOEClass, 1);
        this.createEReference(this.currentPatchDTOEClass, 2);
        this.createEAttribute(this.currentPatchDTOEClass, 3);
        this.createEReference(this.currentPatchDTOEClass, 4);
        this.createEAttribute(this.versionableChangeDTOEClass = this.createEClass(3), 0);
        this.createEAttribute(this.versionableChangeDTOEClass, 1);
        this.createEAttribute(this.versionableChangeDTOEClass, 2);
        this.createEAttribute(this.versionableChangeDTOEClass, 3);
        this.createEAttribute(this.versionableChangeDTOEClass, 4);
        this.createEAttribute(this.versionableChangeDTOEClass, 5);
        this.createEAttribute(this.versionableChangeDTOEClass, 6);
        this.createEAttribute(this.versionableChangeDTOEClass, 7);
        this.createEAttribute(this.versionableChangeDTOEClass, 8);
        this.createEAttribute(this.versionableChangeDTOEClass, 9);
        this.createEAttribute(this.versionableChangeDTOEClass, 10);
        this.createEReference(this.versionableChangeDTOEClass, 11);
        this.createEAttribute(this.versionableChangeDTOEClass, 12);
        this.createEAttribute(this.versionableChangeDTOEClass, 13);
        this.createEAttribute(this.changeDetailDTOEClass = this.createEClass(4), 0);
        this.createEAttribute(this.changeDetailDTOEClass, 1);
        this.createEAttribute(this.changeDetailDTOEClass, 2);
        this.createEAttribute(this.changeDetailDTOEClass, 3);
        this.createEAttribute(this.propertyChangeDetailDTOEClass = this.createEClass(5), 4);
        this.createEAttribute(this.propertyChangeDetailDTOEClass, 5);
        this.createEAttribute(this.propertyChangeDetailDTOEClass, 6);
        this.createEAttribute(this.propertyChangeDetailDTOEClass, 7);
        this.createEAttribute(this.moveChangeDetailDTOEClass = this.createEClass(6), 4);
        this.createEAttribute(this.moveChangeDetailDTOEClass, 5);
        this.createEAttribute(this.moveChangeDetailDTOEClass, 6);
        this.createEAttribute(this.moveChangeDetailDTOEClass, 7);
        this.createEAttribute(this.moveChangeDetailDTOEClass, 8);
        this.createEAttribute(this.moveChangeDetailDTOEClass, 9);
        this.createEAttribute(this.moveChangeDetailDTOEClass, 10);
        this.createEAttribute(this.moveChangeDetailDTOEClass, 11);
        this.createEAttribute(this.moveChangeDetailDTOEClass, 12);
        this.createEAttribute(this.symbolicLinkChangeDetailDTOEClass = this.createEClass(7), 4);
        this.createEAttribute(this.symbolicLinkChangeDetailDTOEClass, 5);
        this.createEAttribute(this.symbolicLinkChangeDetailDTOEClass, 6);
        this.createEAttribute(this.symbolicLinkChangeDetailDTOEClass, 7);
        this.createEAttribute(this.contentChangeDetailDTOEClass = this.createEClass(8), 4);
        this.createEAttribute(this.contentChangeDetailDTOEClass, 5);
        this.createEAttribute(this.contentTypeChangeDetailDTOEClass = this.createEClass(9), 4);
        this.createEAttribute(this.contentTypeChangeDetailDTOEClass, 5);
        this.createEAttribute(this.lineDelimiterChangeDetailDTOEClass = this.createEClass(10), 4);
        this.createEAttribute(this.lineDelimiterChangeDetailDTOEClass, 5);
        this.createEAttribute(this.encodingChangeDetailDTOEClass = this.createEClass(11), 4);
        this.createEAttribute(this.encodingChangeDetailDTOEClass, 5);
        this.createEAttribute(this.executeBitChangeDetailDTOEClass = this.createEClass(12), 4);
        this.createEAttribute(this.abortCurrentPatchResultDTOEClass = this.createEClass(13), 0);
        this.createEReference(this.abortCurrentPatchResultDTOEClass, 1);
        this.createEReference(this.abortCurrentPatchResultDTOEClass, 2);
        this.createEReference(this.abortCurrentPatchResultDTOEClass, 3);
        this.createEReference(this.abortCurrentPatchResultDTOEClass, 4);
        this.createEReference(this.abortCurrentPatchResultDTOEClass, 5);
        this.createEReference(this.updateCurrentPatchResultDTOEClass = this.createEClass(14), 0);
        this.createEAttribute(this.updateCurrentPatchResultDTOEClass, 1);
        this.createEAttribute(this.updateCurrentPatchResultDTOEClass, 2);
        this.createEAttribute(this.updateCurrentPatchResultDTOEClass, 3);
        this.createEReference(this.updateCurrentPatchResultDTOEClass, 4);
        this.createEReference(this.updateCurrentPatchResultDTOEClass, 5);
        this.createEReference(this.updateCurrentPatchResultDTOEClass, 6);
        this.createEReference(this.updateCurrentPatchResultDTOEClass, 7);
        this.createEReference(this.updateCurrentPatchResultDTOEClass, 8);
        this.createEAttribute(this.updateCurrentPatchResultDTOEClass, 9);
        this.createEAttribute(this.completeCurrentPatchResultDTOEClass = this.createEClass(15), 0);
        this.createEReference(this.completeCurrentPatchResultDTOEClass, 1);
        this.createEReference(this.completeCurrentPatchResultDTOEClass, 2);
        this.createEReference(this.completeCurrentPatchResultDTOEClass, 3);
        this.createEReference(this.completeCurrentPatchResultDTOEClass, 4);
        this.createEReference(this.completeCurrentPatchResultDTOEClass, 5);
        this.createEReference(this.completeCurrentPatchResultDTOEClass, 6);
        this.createEAttribute(this.completeCurrentPatchResultDTOEClass, 7);
        this.createEReference(this.processAcceptQueueResultDTOEClass = this.createEClass(16), 0);
        this.createEAttribute(this.processAcceptQueueResultDTOEClass, 1);
        this.createEReference(this.processAcceptQueueResultDTOEClass, 2);
        this.createEReference(this.processAcceptQueueResultDTOEClass, 3);
        this.createEReference(this.processAcceptQueueResultDTOEClass, 4);
        this.createEReference(this.processAcceptQueueResultDTOEClass, 5);
        this.createEReference(this.processAcceptQueueResultDTOEClass, 6);
        this.createEAttribute(this.processAcceptQueueResultDTOEClass, 7);
        this.createEAttribute(this.pageDescriptorDTOEClass = this.createEClass(17), 1);
        this.createEAttribute(this.pageDescriptorDTOEClass, 2);
        this.createEAttribute(this.pageDescriptorDTOEClass, 3);
        this.createEAttribute(this.pageDescriptorDTOEClass, 4);
        this.createEAttribute(this.pageDescriptorDTOEClass, 5);
        this.createEAttribute(this.pageDescriptorDTOEClass, 6);
        this.createEAttribute(this.pageDescriptorDTOEClass, 7);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("patch");
        this.setNsPrefix("filesystemRestClientDTOpatch");
        this.setNsURI("com.ibm.team.filesystem.rest.client.patch");
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.repository");
        final FilesystemRestClientDTOdilemmaPackage theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        this.changeSetSourceDTOEClass.getESuperTypes().add((Object)theRepositoryPackage.getHelper());
        this.propertyChangeDetailDTOEClass.getESuperTypes().add((Object)this.getChangeDetailDTO());
        this.moveChangeDetailDTOEClass.getESuperTypes().add((Object)this.getChangeDetailDTO());
        this.symbolicLinkChangeDetailDTOEClass.getESuperTypes().add((Object)this.getChangeDetailDTO());
        this.contentChangeDetailDTOEClass.getESuperTypes().add((Object)this.getChangeDetailDTO());
        this.contentTypeChangeDetailDTOEClass.getESuperTypes().add((Object)this.getChangeDetailDTO());
        this.lineDelimiterChangeDetailDTOEClass.getESuperTypes().add((Object)this.getChangeDetailDTO());
        this.encodingChangeDetailDTOEClass.getESuperTypes().add((Object)this.getChangeDetailDTO());
        this.executeBitChangeDetailDTOEClass.getESuperTypes().add((Object)this.getChangeDetailDTO());
        this.pageDescriptorDTOEClass.getESuperTypes().add((Object)theRepositoryPackage.getHelper());
        this.initEClass(this.acceptQueueDTOEClass, (Class)AcceptQueueDTO.class, "AcceptQueueDTO", false, false, true);
        this.initEReference(this.getAcceptQueueDTO_AcceptQueue(), (EClassifier)this.getChangeSetSourceDTO(), (EReference)null, "acceptQueue", (String)null, 0, -1, (Class)AcceptQueueDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getAcceptQueueDTO_CurrentPatch(), (EClassifier)this.getCurrentPatchDTO(), (EReference)null, "currentPatch", (String)null, 0, 1, (Class)AcceptQueueDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getAcceptQueueDTO_PageDescriptor(), (EClassifier)this.getPageDescriptorDTO(), (EReference)null, "pageDescriptor", (String)null, 0, 1, (Class)AcceptQueueDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.changeSetSourceDTOEClass, (Class)ChangeSetSourceDTO.class, "ChangeSetSourceDTO", false, false, true);
        this.initEAttribute(this.getChangeSetSourceDTO_SourceId(), (EClassifier)this.ecorePackage.getEString(), "sourceId", "", 1, 1, (Class)ChangeSetSourceDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetSourceDTO_SourceType(), (EClassifier)this.ecorePackage.getEString(), "sourceType", "", 1, 1, (Class)ChangeSetSourceDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.currentPatchDTOEClass, (Class)CurrentPatchDTO.class, "CurrentPatchDTO", false, false, true);
        this.initEAttribute(this.getCurrentPatchDTO_WorkspaceId(), (EClassifier)this.ecorePackage.getEString(), "workspaceId", "", 1, 1, (Class)CurrentPatchDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getCurrentPatchDTO_ComponentId(), (EClassifier)this.ecorePackage.getEString(), "componentId", "", 1, 1, (Class)CurrentPatchDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getCurrentPatchDTO_Source(), (EClassifier)this.getChangeSetSourceDTO(), (EReference)null, "source", (String)null, 1, 1, (Class)CurrentPatchDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getCurrentPatchDTO_TargetChangeSetId(), (EClassifier)this.ecorePackage.getEString(), "targetChangeSetId", "", 0, 1, (Class)CurrentPatchDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getCurrentPatchDTO_Changes(), (EClassifier)this.getVersionableChangeDTO(), (EReference)null, "changes", (String)null, 0, -1, (Class)CurrentPatchDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.versionableChangeDTOEClass, (Class)VersionableChangeDTO.class, "VersionableChangeDTO", false, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_Resolved(), (EClassifier)this.ecorePackage.getEBoolean(), "resolved", (String)null, 0, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_VersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "versionableItemId", (String)null, 1, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_VersionableType(), (EClassifier)this.ecorePackage.getEString(), "versionableType", (String)null, 1, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 1, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_ParentPathHint(), (EClassifier)this.ecorePackage.getEString(), "parentPathHint", (String)null, 0, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_BeforeStateId(), (EClassifier)this.ecorePackage.getEString(), "beforeStateId", (String)null, 0, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_AfterStateId(), (EClassifier)this.ecorePackage.getEString(), "afterStateId", (String)null, 0, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_ConfigurationStateId(), (EClassifier)this.ecorePackage.getEString(), "configurationStateId", (String)null, 0, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_Kind(), (EClassifier)this.ecorePackage.getEString(), "kind", (String)null, 1, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_ChangeType(), (EClassifier)this.ecorePackage.getEString(), "changeType", (String)null, 1, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_Incidentals(), (EClassifier)this.ecorePackage.getEString(), "incidentals", (String)null, 0, -1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getVersionableChangeDTO_ChangeDetails(), (EClassifier)this.getChangeDetailDTO(), (EReference)null, "changeDetails", (String)null, 0, -1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_ChildChanges(), (EClassifier)this.ecorePackage.getEString(), "childChanges", (String)null, 0, -1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getVersionableChangeDTO_DependsOnId(), (EClassifier)this.ecorePackage.getEString(), "dependsOnId", (String)null, 0, 1, (Class)VersionableChangeDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.changeDetailDTOEClass, (Class)ChangeDetailDTO.class, "ChangeDetailDTO", true, false, true);
        this.initEAttribute(this.getChangeDetailDTO_PortChangeId(), (EClassifier)this.ecorePackage.getEString(), "portChangeId", "", 1, 1, (Class)ChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeDetailDTO_Id(), (EClassifier)this.ecorePackage.getEString(), "id", "", 1, 1, (Class)ChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeDetailDTO_Resolved(), (EClassifier)this.ecorePackage.getEBoolean(), "resolved", (String)null, 0, 1, (Class)ChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeDetailDTO_Kind(), (EClassifier)this.ecorePackage.getEString(), "kind", (String)null, 1, 1, (Class)ChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.propertyChangeDetailDTOEClass, (Class)PropertyChangeDetailDTO.class, "PropertyChangeDetailDTO", false, false, true);
        this.initEAttribute(this.getPropertyChangeDetailDTO_PropertyName(), (EClassifier)this.ecorePackage.getEString(), "propertyName", (String)null, 1, 1, (Class)PropertyChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getPropertyChangeDetailDTO_BeforeValue(), (EClassifier)this.ecorePackage.getEString(), "beforeValue", (String)null, 0, 1, (Class)PropertyChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getPropertyChangeDetailDTO_AfterValue(), (EClassifier)this.ecorePackage.getEString(), "afterValue", (String)null, 0, 1, (Class)PropertyChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getPropertyChangeDetailDTO_Type(), (EClassifier)this.ecorePackage.getEString(), "type", (String)null, 1, 1, (Class)PropertyChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.moveChangeDetailDTOEClass, (Class)MoveChangeDetailDTO.class, "MoveChangeDetailDTO", false, false, true);
        this.initEAttribute(this.getMoveChangeDetailDTO_BeforeParentId(), (EClassifier)this.ecorePackage.getEString(), "beforeParentId", (String)null, 1, 1, (Class)MoveChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMoveChangeDetailDTO_AfterParentId(), (EClassifier)this.ecorePackage.getEString(), "afterParentId", (String)null, 1, 1, (Class)MoveChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMoveChangeDetailDTO_BeforeName(), (EClassifier)this.ecorePackage.getEString(), "beforeName", (String)null, 1, 1, (Class)MoveChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMoveChangeDetailDTO_AfterName(), (EClassifier)this.ecorePackage.getEString(), "afterName", (String)null, 1, 1, (Class)MoveChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMoveChangeDetailDTO_BeforeParentPathHint(), (EClassifier)this.ecorePackage.getEString(), "beforeParentPathHint", (String)null, 0, 1, (Class)MoveChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMoveChangeDetailDTO_AfterParentPathHint(), (EClassifier)this.ecorePackage.getEString(), "afterParentPathHint", (String)null, 0, 1, (Class)MoveChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMoveChangeDetailDTO_Move(), (EClassifier)this.ecorePackage.getEBoolean(), "move", (String)null, 0, 1, (Class)MoveChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMoveChangeDetailDTO_Rename(), (EClassifier)this.ecorePackage.getEBoolean(), "rename", (String)null, 0, 1, (Class)MoveChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMoveChangeDetailDTO_IncidentalDetails(), (EClassifier)this.ecorePackage.getEString(), "incidentalDetails", (String)null, 1, 1, (Class)MoveChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.symbolicLinkChangeDetailDTOEClass, (Class)SymbolicLinkChangeDetailDTO.class, "SymbolicLinkChangeDetailDTO", false, false, true);
        this.initEAttribute(this.getSymbolicLinkChangeDetailDTO_BeforeTarget(), (EClassifier)this.ecorePackage.getEString(), "beforeTarget", (String)null, 1, 1, (Class)SymbolicLinkChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSymbolicLinkChangeDetailDTO_AfterTarget(), (EClassifier)this.ecorePackage.getEString(), "afterTarget", (String)null, 1, 1, (Class)SymbolicLinkChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSymbolicLinkChangeDetailDTO_BeforeDirectory(), (EClassifier)this.ecorePackage.getEBoolean(), "beforeDirectory", (String)null, 1, 1, (Class)SymbolicLinkChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSymbolicLinkChangeDetailDTO_AfterDirectory(), (EClassifier)this.ecorePackage.getEBoolean(), "afterDirectory", (String)null, 1, 1, (Class)SymbolicLinkChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.contentChangeDetailDTOEClass, (Class)ContentChangeDetailDTO.class, "ContentChangeDetailDTO", false, false, true);
        this.initEAttribute(this.getContentChangeDetailDTO_BeforeContentHash(), (EClassifier)this.ecorePackage.getEString(), "beforeContentHash", (String)null, 1, 1, (Class)ContentChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getContentChangeDetailDTO_AfterContentHash(), (EClassifier)this.ecorePackage.getEString(), "afterContentHash", (String)null, 1, 1, (Class)ContentChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.contentTypeChangeDetailDTOEClass, (Class)ContentTypeChangeDetailDTO.class, "ContentTypeChangeDetailDTO", false, false, true);
        this.initEAttribute(this.getContentTypeChangeDetailDTO_BeforeContentType(), (EClassifier)this.ecorePackage.getEString(), "beforeContentType", (String)null, 1, 1, (Class)ContentTypeChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getContentTypeChangeDetailDTO_AfterContentType(), (EClassifier)this.ecorePackage.getEString(), "afterContentType", (String)null, 1, 1, (Class)ContentTypeChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.lineDelimiterChangeDetailDTOEClass, (Class)LineDelimiterChangeDetailDTO.class, "LineDelimiterChangeDetailDTO", false, false, true);
        this.initEAttribute(this.getLineDelimiterChangeDetailDTO_BeforeLineDelimiter(), (EClassifier)this.ecorePackage.getEString(), "beforeLineDelimiter", (String)null, 1, 1, (Class)LineDelimiterChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLineDelimiterChangeDetailDTO_AfterLineDelimiter(), (EClassifier)this.ecorePackage.getEString(), "afterLineDelimiter", (String)null, 1, 1, (Class)LineDelimiterChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.encodingChangeDetailDTOEClass, (Class)EncodingChangeDetailDTO.class, "EncodingChangeDetailDTO", false, false, true);
        this.initEAttribute(this.getEncodingChangeDetailDTO_BeforeCharacterEncoding(), (EClassifier)this.ecorePackage.getEString(), "beforeCharacterEncoding", (String)null, 1, 1, (Class)EncodingChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getEncodingChangeDetailDTO_AfterCharacterEncoding(), (EClassifier)this.ecorePackage.getEString(), "afterCharacterEncoding", (String)null, 1, 1, (Class)EncodingChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.executeBitChangeDetailDTOEClass, (Class)ExecuteBitChangeDetailDTO.class, "ExecuteBitChangeDetailDTO", false, false, true);
        this.initEAttribute(this.getExecuteBitChangeDetailDTO_Executable(), (EClassifier)this.ecorePackage.getEBoolean(), "executable", (String)null, 1, 1, (Class)ExecuteBitChangeDetailDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.abortCurrentPatchResultDTOEClass, (Class)AbortCurrentPatchResultDTO.class, "AbortCurrentPatchResultDTO", false, false, true);
        this.initEAttribute(this.getAbortCurrentPatchResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)AbortCurrentPatchResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getAbortCurrentPatchResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)AbortCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getAbortCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)AbortCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getAbortCurrentPatchResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)AbortCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getAbortCurrentPatchResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)AbortCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getAbortCurrentPatchResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)AbortCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.updateCurrentPatchResultDTOEClass, (Class)UpdateCurrentPatchResultDTO.class, "UpdateCurrentPatchResultDTO", false, false, true);
        this.initEReference(this.getUpdateCurrentPatchResultDTO_CurrentPatch(), (EClassifier)this.getCurrentPatchDTO(), (EReference)null, "currentPatch", (String)null, 0, 1, (Class)UpdateCurrentPatchResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getUpdateCurrentPatchResultDTO_ResolvedVersionableIds(), (EClassifier)this.ecorePackage.getEString(), "resolvedVersionableIds", "", 0, -1, (Class)UpdateCurrentPatchResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getUpdateCurrentPatchResultDTO_ResolvedChangeDetailIds(), (EClassifier)this.ecorePackage.getEString(), "resolvedChangeDetailIds", "", 0, -1, (Class)UpdateCurrentPatchResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getUpdateCurrentPatchResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)UpdateCurrentPatchResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getUpdateCurrentPatchResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)UpdateCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUpdateCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)UpdateCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUpdateCurrentPatchResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)UpdateCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUpdateCurrentPatchResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)UpdateCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getUpdateCurrentPatchResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)UpdateCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getUpdateCurrentPatchResultDTO_VersionableIds(), (EClassifier)this.ecorePackage.getEString(), "versionableIds", "", 0, -1, (Class)UpdateCurrentPatchResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.completeCurrentPatchResultDTOEClass, (Class)CompleteCurrentPatchResultDTO.class, "CompleteCurrentPatchResultDTO", false, false, true);
        this.initEAttribute(this.getCompleteCurrentPatchResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)CompleteCurrentPatchResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getCompleteCurrentPatchResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)CompleteCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCompleteCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)CompleteCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCompleteCurrentPatchResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)CompleteCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCompleteCurrentPatchResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)CompleteCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCompleteCurrentPatchResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)CompleteCurrentPatchResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getCompleteCurrentPatchResultDTO_UnresolvedChanges(), (EClassifier)this.getVersionableChangeDTO(), (EReference)null, "unresolvedChanges", (String)null, 0, -1, (Class)CompleteCurrentPatchResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getCompleteCurrentPatchResultDTO_AcceptQueueSize(), (EClassifier)this.ecorePackage.getELong(), "acceptQueueSize", (String)null, 0, 1, (Class)CompleteCurrentPatchResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.processAcceptQueueResultDTOEClass, (Class)ProcessAcceptQueueResultDTO.class, "ProcessAcceptQueueResultDTO", false, false, true);
        this.initEReference(this.getProcessAcceptQueueResultDTO_CurrentPatch(), (EClassifier)this.getCurrentPatchDTO(), (EReference)null, "currentPatch", (String)null, 0, 1, (Class)ProcessAcceptQueueResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getProcessAcceptQueueResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)ProcessAcceptQueueResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getProcessAcceptQueueResultDTO_OutOfSyncShares(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "outOfSyncShares", (String)null, 0, -1, (Class)ProcessAcceptQueueResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getProcessAcceptQueueResultDTO_ConfigurationsWithUncheckedInChanges(), (EClassifier)theFilesystemRestClientDTOcorePackage.getConfigurationWithUncheckedInChangesDTO(), (EReference)null, "configurationsWithUncheckedInChanges", (String)null, 0, -1, (Class)ProcessAcceptQueueResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getProcessAcceptQueueResultDTO_SandboxUpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getSandboxUpdateDilemmaDTO(), (EReference)null, "sandboxUpdateDilemma", (String)null, 1, 1, (Class)ProcessAcceptQueueResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getProcessAcceptQueueResultDTO_CommitDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getCommitDilemmaDTO(), (EReference)null, "commitDilemma", (String)null, 1, 1, (Class)ProcessAcceptQueueResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getProcessAcceptQueueResultDTO_UpdateDilemma(), (EClassifier)theFilesystemRestClientDTOdilemmaPackage.getUpdateDilemmaDTO(), (EReference)null, "updateDilemma", (String)null, 1, 1, (Class)ProcessAcceptQueueResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEAttribute(this.getProcessAcceptQueueResultDTO_AcceptQueueSize(), (EClassifier)this.ecorePackage.getELong(), "acceptQueueSize", (String)null, 0, 1, (Class)ProcessAcceptQueueResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.pageDescriptorDTOEClass, (Class)PageDescriptorDTO.class, "PageDescriptorDTO", false, false, true);
        this.initEAttribute(this.getPageDescriptorDTO_RepositoryURI(), (EClassifier)this.ecorePackage.getEString(), "repositoryURI", (String)null, 1, 1, (Class)PageDescriptorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getPageDescriptorDTO_WorkspaceID(), (EClassifier)this.ecorePackage.getEString(), "workspaceID", (String)null, 1, 1, (Class)PageDescriptorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getPageDescriptorDTO_ComponentID(), (EClassifier)this.ecorePackage.getEString(), "componentID", (String)null, 1, 1, (Class)PageDescriptorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getPageDescriptorDTO_MaxPageSize(), (EClassifier)this.ecorePackage.getEInt(), "maxPageSize", (String)null, 1, 1, (Class)PageDescriptorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getPageDescriptorDTO_StartIndex(), (EClassifier)this.ecorePackage.getELong(), "startIndex", (String)null, 1, 1, (Class)PageDescriptorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getPageDescriptorDTO_TotalSize(), (EClassifier)this.ecorePackage.getELong(), "totalSize", (String)null, 0, 1, (Class)PageDescriptorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getPageDescriptorDTO_SyncTime(), (EClassifier)this.ecorePackage.getELong(), "syncTime", (String)null, 0, 1, (Class)PageDescriptorDTO.class, false, false, true, true, false, true, false, true);
        this.createResource("com.ibm.team.filesystem.rest.client.patch");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamAttributeAnnotations();
        this.createTeamReferenceAnnotations();
        this.createComAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOpatch", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.acceptQueueDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeSetSourceDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.currentPatchDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.versionableChangeDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeDetailDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.propertyChangeDetailDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.moveChangeDetailDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.symbolicLinkChangeDetailDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.contentChangeDetailDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.contentTypeChangeDetailDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.lineDelimiterChangeDetailDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.encodingChangeDetailDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.executeBitChangeDetailDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.abortCurrentPatchResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.updateCurrentPatchResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.completeCurrentPatchResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.processAcceptQueueResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.pageDescriptorDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getAcceptQueueDTO_AcceptQueue(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAcceptQueueDTO_CurrentPatch(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSourceDTO_SourceId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSourceDTO_SourceType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCurrentPatchDTO_WorkspaceId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCurrentPatchDTO_ComponentId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCurrentPatchDTO_Source(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCurrentPatchDTO_TargetChangeSetId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCurrentPatchDTO_Changes(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_Resolved(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_VersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_VersionableType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_ParentPathHint(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_BeforeStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_AfterStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_ConfigurationStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_Kind(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_ChangeType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_Incidentals(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_ChangeDetails(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_ChildChanges(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_DependsOnId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeDetailDTO_PortChangeId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeDetailDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeDetailDTO_Resolved(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeDetailDTO_Kind(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPropertyChangeDetailDTO_PropertyName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPropertyChangeDetailDTO_BeforeValue(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPropertyChangeDetailDTO_AfterValue(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPropertyChangeDetailDTO_Type(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveChangeDetailDTO_BeforeParentId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveChangeDetailDTO_AfterParentId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveChangeDetailDTO_BeforeName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveChangeDetailDTO_AfterName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveChangeDetailDTO_BeforeParentPathHint(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveChangeDetailDTO_AfterParentPathHint(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveChangeDetailDTO_Move(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveChangeDetailDTO_Rename(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMoveChangeDetailDTO_IncidentalDetails(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymbolicLinkChangeDetailDTO_BeforeTarget(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymbolicLinkChangeDetailDTO_AfterTarget(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymbolicLinkChangeDetailDTO_BeforeDirectory(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymbolicLinkChangeDetailDTO_AfterDirectory(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContentChangeDetailDTO_BeforeContentHash(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContentChangeDetailDTO_AfterContentHash(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContentTypeChangeDetailDTO_BeforeContentType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContentTypeChangeDetailDTO_AfterContentType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLineDelimiterChangeDetailDTO_BeforeLineDelimiter(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLineDelimiterChangeDetailDTO_AfterLineDelimiter(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getEncodingChangeDetailDTO_BeforeCharacterEncoding(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getEncodingChangeDetailDTO_AfterCharacterEncoding(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getExecuteBitChangeDetailDTO_Executable(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAbortCurrentPatchResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_CurrentPatch(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_ResolvedVersionableIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_ResolvedChangeDetailIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_VersionableIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompleteCurrentPatchResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompleteCurrentPatchResultDTO_AcceptQueueSize(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProcessAcceptQueueResultDTO_CurrentPatch(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProcessAcceptQueueResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProcessAcceptQueueResultDTO_AcceptQueueSize(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPageDescriptorDTO_RepositoryURI(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPageDescriptorDTO_WorkspaceID(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPageDescriptorDTO_ComponentID(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPageDescriptorDTO_MaxPageSize(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPageDescriptorDTO_StartIndex(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPageDescriptorDTO_TotalSize(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPageDescriptorDTO_SyncTime(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getAcceptQueueDTO_AcceptQueue(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAcceptQueueDTO_CurrentPatch(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAcceptQueueDTO_PageDescriptor(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCurrentPatchDTO_Source(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCurrentPatchDTO_Changes(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getVersionableChangeDTO_ChangeDetails(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAbortCurrentPatchResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAbortCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAbortCurrentPatchResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAbortCurrentPatchResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getAbortCurrentPatchResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_CurrentPatch(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUpdateCurrentPatchResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompleteCurrentPatchResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompleteCurrentPatchResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompleteCurrentPatchResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompleteCurrentPatchResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompleteCurrentPatchResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompleteCurrentPatchResultDTO_UnresolvedChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProcessAcceptQueueResultDTO_CurrentPatch(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProcessAcceptQueueResultDTO_OutOfSyncShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProcessAcceptQueueResultDTO_ConfigurationsWithUncheckedInChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProcessAcceptQueueResultDTO_SandboxUpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProcessAcceptQueueResultDTO_CommitDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProcessAcceptQueueResultDTO_UpdateDilemma(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createComAnnotations() {
        final String source = "com.ibm.team.codegen.helperTypeMarker";
        this.addAnnotation((ENamedElement)this.changeSetSourceDTOEClass, source, new String[0]);
        this.addAnnotation((ENamedElement)this.pageDescriptorDTOEClass, source, new String[0]);
    }
}
