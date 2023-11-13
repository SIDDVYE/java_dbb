// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.resource.CustomAttributesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.PermissionsContextDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FileErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.MimeTypeErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.SymlinkWarningDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.SymlinkPropertiesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.InvalidPropertyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.PropertyFailureDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.EncodingErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FindShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FindShareablesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.MagicDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ChangeSummaryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ContentTransferDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.CheckinPolicyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.SandboxPathsResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.LineDelimiterErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.IgnoreReasonDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilePropertiesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcePropertiesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcePropertyChangeResultDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcesDTO;
import com.ibm.team.repository.common.model.RepositoryPackage;
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
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourceFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOresourcePackageImpl extends EPackageImpl implements FilesystemRestClientDTOresourcePackage
{
    private EClass resourcesDTOEClass;
    private EClass resourcePropertyChangeResultDTOEClass;
    private EClass resourcePropertiesDTOEClass;
    private EClass filePropertiesDTOEClass;
    private EClass ignoreReasonDTOEClass;
    private EClass lineDelimiterErrorDTOEClass;
    private EClass sandboxPathsResultDTOEClass;
    private EClass checkinPolicyDTOEClass;
    private EClass contentTransferDTOEClass;
    private EClass changeSummaryDTOEClass;
    private EClass magicDTOEClass;
    private EClass findShareablesDTOEClass;
    private EClass findShareableDTOEClass;
    private EClass encodingErrorDTOEClass;
    private EClass propertyFailureDTOEClass;
    private EClass invalidPropertyDTOEClass;
    private EClass symlinkPropertiesDTOEClass;
    private EClass symlinkWarningDTOEClass;
    private EClass mimeTypeErrorDTOEClass;
    private EClass fileErrorDTOEClass;
    private EClass permissionsContextDTOEClass;
    private EClass customAttributesDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOresourcePackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOresourcePackageImpl() {
        super("com.ibm.team.filesystem.rest.client.resource", (EFactory)FilesystemRestClientDTOresourceFactory.eINSTANCE);
        this.resourcesDTOEClass = null;
        this.resourcePropertyChangeResultDTOEClass = null;
        this.resourcePropertiesDTOEClass = null;
        this.filePropertiesDTOEClass = null;
        this.ignoreReasonDTOEClass = null;
        this.lineDelimiterErrorDTOEClass = null;
        this.sandboxPathsResultDTOEClass = null;
        this.checkinPolicyDTOEClass = null;
        this.contentTransferDTOEClass = null;
        this.changeSummaryDTOEClass = null;
        this.magicDTOEClass = null;
        this.findShareablesDTOEClass = null;
        this.findShareableDTOEClass = null;
        this.encodingErrorDTOEClass = null;
        this.propertyFailureDTOEClass = null;
        this.invalidPropertyDTOEClass = null;
        this.symlinkPropertiesDTOEClass = null;
        this.symlinkWarningDTOEClass = null;
        this.mimeTypeErrorDTOEClass = null;
        this.fileErrorDTOEClass = null;
        this.permissionsContextDTOEClass = null;
        this.customAttributesDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOresourcePackage init() {
        if (FilesystemRestClientDTOresourcePackageImpl.isInited) {
            return (FilesystemRestClientDTOresourcePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource");
        }
        final FilesystemRestClientDTOresourcePackageImpl theFilesystemRestClientDTOresourcePackage = (FilesystemRestClientDTOresourcePackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.resource") instanceof FilesystemRestClientDTOresourcePackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.resource") : new FilesystemRestClientDTOresourcePackageImpl());
        FilesystemRestClientDTOresourcePackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") : FilesystemRestClientDTOcorePackage.eINSTANCE);
        final FilesystemRestClientDTOdilemmaPackageImpl theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") instanceof FilesystemRestClientDTOdilemmaPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") : FilesystemRestClientDTOdilemmaPackage.eINSTANCE);
        final FilesystemRestClientDTOloadPackageImpl theFilesystemRestClientDTOloadPackage = (FilesystemRestClientDTOloadPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") instanceof FilesystemRestClientDTOloadPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") : FilesystemRestClientDTOloadPackage.eINSTANCE);
        final FilesystemRestClientDTOsyncPackageImpl theFilesystemRestClientDTOsyncPackage = (FilesystemRestClientDTOsyncPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") instanceof FilesystemRestClientDTOsyncPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") : FilesystemRestClientDTOsyncPackage.eINSTANCE);
        final FilesystemRestClientDTOchangelogPackageImpl theFilesystemRestClientDTOchangelogPackage = (FilesystemRestClientDTOchangelogPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") instanceof FilesystemRestClientDTOchangelogPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") : FilesystemRestClientDTOchangelogPackage.eINSTANCE);
        final FilesystemRestClientDTOsharePackageImpl theFilesystemRestClientDTOsharePackage = (FilesystemRestClientDTOsharePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") instanceof FilesystemRestClientDTOsharePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") : FilesystemRestClientDTOsharePackage.eINSTANCE);
        final FilesystemRestClientDTOchangesetPackageImpl theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") instanceof FilesystemRestClientDTOchangesetPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") : FilesystemRestClientDTOchangesetPackage.eINSTANCE);
        final FilesystemRestClientDTOconflictPackageImpl theFilesystemRestClientDTOconflictPackage = (FilesystemRestClientDTOconflictPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") instanceof FilesystemRestClientDTOconflictPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") : FilesystemRestClientDTOconflictPackage.eINSTANCE);
        final FilesystemRestClientDTOignoresPackageImpl theFilesystemRestClientDTOignoresPackage = (FilesystemRestClientDTOignoresPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") instanceof FilesystemRestClientDTOignoresPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores") : FilesystemRestClientDTOignoresPackage.eINSTANCE);
        final FilesystemRestClientDTOworkspacePackageImpl theFilesystemRestClientDTOworkspacePackage = (FilesystemRestClientDTOworkspacePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") instanceof FilesystemRestClientDTOworkspacePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") : FilesystemRestClientDTOworkspacePackage.eINSTANCE);
        final FilesystemRestClientDTOcorruptionPackageImpl theFilesystemRestClientDTOcorruptionPackage = (FilesystemRestClientDTOcorruptionPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") instanceof FilesystemRestClientDTOcorruptionPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") : FilesystemRestClientDTOcorruptionPackage.eINSTANCE);
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") : FilesystemRestClientDTOlocksPackage.eINSTANCE);
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
        theFilesystemRestClientDTOresourcePackage.createPackageContents();
        theFilesystemRestClientDTOcorePackage.createPackageContents();
        theFilesystemRestClientDTOdilemmaPackage.createPackageContents();
        theFilesystemRestClientDTOloadPackage.createPackageContents();
        theFilesystemRestClientDTOsyncPackage.createPackageContents();
        theFilesystemRestClientDTOchangelogPackage.createPackageContents();
        theFilesystemRestClientDTOsharePackage.createPackageContents();
        theFilesystemRestClientDTOchangesetPackage.createPackageContents();
        theFilesystemRestClientDTOconflictPackage.createPackageContents();
        theFilesystemRestClientDTOignoresPackage.createPackageContents();
        theFilesystemRestClientDTOworkspacePackage.createPackageContents();
        theFilesystemRestClientDTOcorruptionPackage.createPackageContents();
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
        theFilesystemRestClientDTOresourcePackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.initializePackageContents();
        theFilesystemRestClientDTOdilemmaPackage.initializePackageContents();
        theFilesystemRestClientDTOloadPackage.initializePackageContents();
        theFilesystemRestClientDTOsyncPackage.initializePackageContents();
        theFilesystemRestClientDTOchangelogPackage.initializePackageContents();
        theFilesystemRestClientDTOsharePackage.initializePackageContents();
        theFilesystemRestClientDTOchangesetPackage.initializePackageContents();
        theFilesystemRestClientDTOconflictPackage.initializePackageContents();
        theFilesystemRestClientDTOignoresPackage.initializePackageContents();
        theFilesystemRestClientDTOworkspacePackage.initializePackageContents();
        theFilesystemRestClientDTOcorruptionPackage.initializePackageContents();
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOresourcePackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.resource", (Object)theFilesystemRestClientDTOresourcePackage);
        return theFilesystemRestClientDTOresourcePackage;
    }
    
    public EClass getResourcesDTO() {
        return this.resourcesDTOEClass;
    }
    
    public EReference getResourcesDTO_ResourceProperties() {
        return (EReference)this.resourcesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getResourcePropertyChangeResultDTO() {
        return this.resourcePropertyChangeResultDTOEClass;
    }
    
    public EAttribute getResourcePropertyChangeResultDTO_Cancelled() {
        return (EAttribute)this.resourcePropertyChangeResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getResourcePropertyChangeResultDTO_LineDelimiterFailures() {
        return (EReference)this.resourcePropertyChangeResultDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getResourcePropertyChangeResultDTO_BackedUpToShed() {
        return (EReference)this.resourcePropertyChangeResultDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getResourcePropertyChangeResultDTO_PropertyFailures() {
        return (EReference)this.resourcePropertyChangeResultDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getResourcePropertyChangeResultDTO_MimeTypeFailures() {
        return (EReference)this.resourcePropertyChangeResultDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getResourcePropertyChangeResultDTO_ExecutableFailures() {
        return (EReference)this.resourcePropertyChangeResultDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getResourcePropertiesDTO() {
        return this.resourcePropertiesDTOEClass;
    }
    
    public EAttribute getResourcePropertiesDTO_FullPath() {
        return (EAttribute)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getResourcePropertiesDTO_Path() {
        return (EReference)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getResourcePropertiesDTO_RemotePath() {
        return (EReference)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getResourcePropertiesDTO_Shared() {
        return (EAttribute)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getResourcePropertiesDTO_Share() {
        return (EReference)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getResourcePropertiesDTO_VersionableItemType() {
        return (EAttribute)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getResourcePropertiesDTO_ItemId() {
        return (EAttribute)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getResourcePropertiesDTO_StateId() {
        return (EAttribute)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getResourcePropertiesDTO_Ignored() {
        return (EAttribute)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getResourcePropertiesDTO_Local() {
        return (EAttribute)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getResourcePropertiesDTO_Remote() {
        return (EAttribute)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getResourcePropertiesDTO_Dirty() {
        return (EAttribute)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EReference getResourcePropertiesDTO_FileProperties() {
        return (EReference)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EReference getResourcePropertiesDTO_IgnoreReason() {
        return (EReference)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EReference getResourcePropertiesDTO_UserProperties() {
        return (EReference)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(14);
    }
    
    public EReference getResourcePropertiesDTO_SymlinkProperties() {
        return (EReference)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(15);
    }
    
    public EReference getResourcePropertiesDTO_PermissionsContext() {
        return (EReference)this.resourcePropertiesDTOEClass.getEStructuralFeatures().get(16);
    }
    
    public EClass getFilePropertiesDTO() {
        return this.filePropertiesDTOEClass;
    }
    
    public EAttribute getFilePropertiesDTO_OriginalLineDelimiter() {
        return (EAttribute)this.filePropertiesDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getFilePropertiesDTO_OriginalContentType() {
        return (EAttribute)this.filePropertiesDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getFilePropertiesDTO_LineDelimiter() {
        return (EAttribute)this.filePropertiesDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getFilePropertiesDTO_ContentType() {
        return (EAttribute)this.filePropertiesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getFilePropertiesDTO_Executable() {
        return (EAttribute)this.filePropertiesDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getFilePropertiesDTO_Encoding() {
        return (EAttribute)this.filePropertiesDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getFilePropertiesDTO_OriginalExecutable() {
        return (EAttribute)this.filePropertiesDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getFilePropertiesDTO_OriginalEncoding() {
        return (EAttribute)this.filePropertiesDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EClass getIgnoreReasonDTO() {
        return this.ignoreReasonDTOEClass;
    }
    
    public EReference getIgnoreReasonDTO_Rules() {
        return (EReference)this.ignoreReasonDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getIgnoreReasonDTO_InheritsFrom() {
        return (EReference)this.ignoreReasonDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getLineDelimiterErrorDTO() {
        return this.lineDelimiterErrorDTOEClass;
    }
    
    public EAttribute getLineDelimiterErrorDTO_LineDelimiter() {
        return (EAttribute)this.lineDelimiterErrorDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getSandboxPathsResultDTO() {
        return this.sandboxPathsResultDTOEClass;
    }
    
    public EReference getSandboxPathsResultDTO_Paths() {
        return (EReference)this.sandboxPathsResultDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getCheckinPolicyDTO() {
        return this.checkinPolicyDTOEClass;
    }
    
    public EAttribute getCheckinPolicyDTO_AutoCheckin() {
        return (EAttribute)this.checkinPolicyDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getCheckinPolicyDTO_AutoCheckinDefault() {
        return (EAttribute)this.checkinPolicyDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getContentTransferDTO() {
        return this.contentTransferDTOEClass;
    }
    
    public EAttribute getContentTransferDTO_MaxThreads() {
        return (EAttribute)this.contentTransferDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getContentTransferDTO_MaxThreadsDefault() {
        return (EAttribute)this.contentTransferDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getContentTransferDTO_MaxThreadsLimit() {
        return (EAttribute)this.contentTransferDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getChangeSummaryDTO() {
        return this.changeSummaryDTOEClass;
    }
    
    public EAttribute getChangeSummaryDTO_BeforeStateId() {
        return (EAttribute)this.changeSummaryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getChangeSummaryDTO_AfterStateId() {
        return (EAttribute)this.changeSummaryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getChangeSummaryDTO_LastMergeState() {
        return (EAttribute)this.changeSummaryDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getChangeSummaryDTO_PathHint() {
        return (EAttribute)this.changeSummaryDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getChangeSummaryDTO_NewPathHint() {
        return (EAttribute)this.changeSummaryDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EClass getMagicDTO() {
        return this.magicDTOEClass;
    }
    
    public EAttribute getMagicDTO_Pattern() {
        return (EAttribute)this.magicDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getMagicDTO_Encoding() {
        return (EAttribute)this.magicDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getMagicDTO_MimeType() {
        return (EAttribute)this.magicDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getMagicDTO_LineDelimiter() {
        return (EAttribute)this.magicDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getMagicDTO_BuiltIn() {
        return (EAttribute)this.magicDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getMagicDTO_IgnoreCase() {
        return (EAttribute)this.magicDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getFindShareablesDTO() {
        return this.findShareablesDTOEClass;
    }
    
    public EReference getFindShareablesDTO_Results() {
        return (EReference)this.findShareablesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getFindShareableDTO() {
        return this.findShareableDTOEClass;
    }
    
    public EReference getFindShareableDTO_Shareables() {
        return (EReference)this.findShareableDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getEncodingErrorDTO() {
        return this.encodingErrorDTOEClass;
    }
    
    public EReference getEncodingErrorDTO_Shareable() {
        return (EReference)this.encodingErrorDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getEncodingErrorDTO_MalformedContent() {
        return (EAttribute)this.encodingErrorDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getEncodingErrorDTO_UnknownEncoding() {
        return (EAttribute)this.encodingErrorDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getEncodingErrorDTO_Encoding() {
        return (EAttribute)this.encodingErrorDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getEncodingErrorDTO_PredecessorEncoding() {
        return (EAttribute)this.encodingErrorDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getEncodingErrorDTO_AtomicCommit() {
        return (EAttribute)this.encodingErrorDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getEncodingErrorDTO_DirectionProvided() {
        return (EAttribute)this.encodingErrorDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EClass getPropertyFailureDTO() {
        return this.propertyFailureDTOEClass;
    }
    
    public EReference getPropertyFailureDTO_FileName() {
        return (EReference)this.propertyFailureDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getPropertyFailureDTO_Share() {
        return (EReference)this.propertyFailureDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getPropertyFailureDTO_InvalidProperties() {
        return (EReference)this.propertyFailureDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getInvalidPropertyDTO() {
        return this.invalidPropertyDTOEClass;
    }
    
    public EAttribute getInvalidPropertyDTO_PropertyName() {
        return (EAttribute)this.invalidPropertyDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getInvalidPropertyDTO_Reason() {
        return (EAttribute)this.invalidPropertyDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getSymlinkPropertiesDTO() {
        return this.symlinkPropertiesDTOEClass;
    }
    
    public EAttribute getSymlinkPropertiesDTO_Type() {
        return (EAttribute)this.symlinkPropertiesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getSymlinkWarningDTO() {
        return this.symlinkWarningDTOEClass;
    }
    
    public EAttribute getSymlinkWarningDTO_Location() {
        return (EAttribute)this.symlinkWarningDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getSymlinkWarningDTO_Target() {
        return (EAttribute)this.symlinkWarningDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getSymlinkWarningDTO_Type() {
        return (EAttribute)this.symlinkWarningDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getSymlinkWarningDTO_SandboxLocation() {
        return (EAttribute)this.symlinkWarningDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getMimeTypeErrorDTO() {
        return this.mimeTypeErrorDTOEClass;
    }
    
    public EAttribute getMimeTypeErrorDTO_MimeType() {
        return (EAttribute)this.mimeTypeErrorDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getFileErrorDTO() {
        return this.fileErrorDTOEClass;
    }
    
    public EReference getFileErrorDTO_FileName() {
        return (EReference)this.fileErrorDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getFileErrorDTO_Share() {
        return (EReference)this.fileErrorDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getPermissionsContextDTO() {
        return this.permissionsContextDTOEClass;
    }
    
    public EAttribute getPermissionsContextDTO_Accessible() {
        return (EAttribute)this.permissionsContextDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getPermissionsContextDTO_ReadContext() {
        return (EReference)this.permissionsContextDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getCustomAttributesDTO() {
        return this.customAttributesDTOEClass;
    }
    
    public EAttribute getCustomAttributesDTO_FullPath() {
        return (EAttribute)this.customAttributesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getCustomAttributesDTO_ItemId() {
        return (EAttribute)this.customAttributesDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getCustomAttributesDTO_CustomAttributes() {
        return (EReference)this.customAttributesDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public FilesystemRestClientDTOresourceFactory getFilesystemRestClientDTOresourceFactory() {
        return (FilesystemRestClientDTOresourceFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEReference(this.resourcesDTOEClass = this.createEClass(0), 0);
        this.createEAttribute(this.resourcePropertyChangeResultDTOEClass = this.createEClass(1), 0);
        this.createEReference(this.resourcePropertyChangeResultDTOEClass, 1);
        this.createEReference(this.resourcePropertyChangeResultDTOEClass, 2);
        this.createEReference(this.resourcePropertyChangeResultDTOEClass, 3);
        this.createEReference(this.resourcePropertyChangeResultDTOEClass, 4);
        this.createEReference(this.resourcePropertyChangeResultDTOEClass, 5);
        this.createEAttribute(this.resourcePropertiesDTOEClass = this.createEClass(2), 0);
        this.createEReference(this.resourcePropertiesDTOEClass, 1);
        this.createEReference(this.resourcePropertiesDTOEClass, 2);
        this.createEAttribute(this.resourcePropertiesDTOEClass, 3);
        this.createEReference(this.resourcePropertiesDTOEClass, 4);
        this.createEAttribute(this.resourcePropertiesDTOEClass, 5);
        this.createEAttribute(this.resourcePropertiesDTOEClass, 6);
        this.createEAttribute(this.resourcePropertiesDTOEClass, 7);
        this.createEAttribute(this.resourcePropertiesDTOEClass, 8);
        this.createEAttribute(this.resourcePropertiesDTOEClass, 9);
        this.createEAttribute(this.resourcePropertiesDTOEClass, 10);
        this.createEAttribute(this.resourcePropertiesDTOEClass, 11);
        this.createEReference(this.resourcePropertiesDTOEClass, 12);
        this.createEReference(this.resourcePropertiesDTOEClass, 13);
        this.createEReference(this.resourcePropertiesDTOEClass, 14);
        this.createEReference(this.resourcePropertiesDTOEClass, 15);
        this.createEReference(this.resourcePropertiesDTOEClass, 16);
        this.createEAttribute(this.filePropertiesDTOEClass = this.createEClass(3), 0);
        this.createEAttribute(this.filePropertiesDTOEClass, 1);
        this.createEAttribute(this.filePropertiesDTOEClass, 2);
        this.createEAttribute(this.filePropertiesDTOEClass, 3);
        this.createEAttribute(this.filePropertiesDTOEClass, 4);
        this.createEAttribute(this.filePropertiesDTOEClass, 5);
        this.createEAttribute(this.filePropertiesDTOEClass, 6);
        this.createEAttribute(this.filePropertiesDTOEClass, 7);
        this.createEReference(this.ignoreReasonDTOEClass = this.createEClass(4), 0);
        this.createEReference(this.ignoreReasonDTOEClass, 1);
        this.createEAttribute(this.lineDelimiterErrorDTOEClass = this.createEClass(5), 2);
        this.createEReference(this.sandboxPathsResultDTOEClass = this.createEClass(6), 0);
        this.createEAttribute(this.checkinPolicyDTOEClass = this.createEClass(7), 0);
        this.createEAttribute(this.checkinPolicyDTOEClass, 1);
        this.createEAttribute(this.contentTransferDTOEClass = this.createEClass(8), 0);
        this.createEAttribute(this.contentTransferDTOEClass, 1);
        this.createEAttribute(this.contentTransferDTOEClass, 2);
        this.createEAttribute(this.changeSummaryDTOEClass = this.createEClass(9), 0);
        this.createEAttribute(this.changeSummaryDTOEClass, 1);
        this.createEAttribute(this.changeSummaryDTOEClass, 2);
        this.createEAttribute(this.changeSummaryDTOEClass, 3);
        this.createEAttribute(this.changeSummaryDTOEClass, 4);
        this.createEAttribute(this.magicDTOEClass = this.createEClass(10), 0);
        this.createEAttribute(this.magicDTOEClass, 1);
        this.createEAttribute(this.magicDTOEClass, 2);
        this.createEAttribute(this.magicDTOEClass, 3);
        this.createEAttribute(this.magicDTOEClass, 4);
        this.createEAttribute(this.magicDTOEClass, 5);
        this.createEReference(this.findShareablesDTOEClass = this.createEClass(11), 0);
        this.createEReference(this.findShareableDTOEClass = this.createEClass(12), 0);
        this.createEReference(this.encodingErrorDTOEClass = this.createEClass(13), 0);
        this.createEAttribute(this.encodingErrorDTOEClass, 1);
        this.createEAttribute(this.encodingErrorDTOEClass, 2);
        this.createEAttribute(this.encodingErrorDTOEClass, 3);
        this.createEAttribute(this.encodingErrorDTOEClass, 4);
        this.createEAttribute(this.encodingErrorDTOEClass, 5);
        this.createEAttribute(this.encodingErrorDTOEClass, 6);
        this.createEReference(this.propertyFailureDTOEClass = this.createEClass(14), 0);
        this.createEReference(this.propertyFailureDTOEClass, 1);
        this.createEReference(this.propertyFailureDTOEClass, 2);
        this.createEAttribute(this.invalidPropertyDTOEClass = this.createEClass(15), 0);
        this.createEAttribute(this.invalidPropertyDTOEClass, 1);
        this.createEAttribute(this.symlinkPropertiesDTOEClass = this.createEClass(16), 0);
        this.createEAttribute(this.symlinkWarningDTOEClass = this.createEClass(17), 0);
        this.createEAttribute(this.symlinkWarningDTOEClass, 1);
        this.createEAttribute(this.symlinkWarningDTOEClass, 2);
        this.createEAttribute(this.symlinkWarningDTOEClass, 3);
        this.createEAttribute(this.mimeTypeErrorDTOEClass = this.createEClass(18), 2);
        this.createEReference(this.fileErrorDTOEClass = this.createEClass(19), 0);
        this.createEReference(this.fileErrorDTOEClass, 1);
        this.createEAttribute(this.permissionsContextDTOEClass = this.createEClass(20), 0);
        this.createEReference(this.permissionsContextDTOEClass, 1);
        this.createEAttribute(this.customAttributesDTOEClass = this.createEClass(21), 0);
        this.createEAttribute(this.customAttributesDTOEClass, 1);
        this.createEReference(this.customAttributesDTOEClass, 2);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("resource");
        this.setNsPrefix("filesystemRestClientDTOresource");
        this.setNsURI("com.ibm.team.filesystem.rest.client.resource");
        final FilesystemRestClientDTOchangesetPackage theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        final ScmPackage theScmPackage = (ScmPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.scm");
        final FilesystemRestClientDTOignoresPackage theFilesystemRestClientDTOignoresPackage = (FilesystemRestClientDTOignoresPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores");
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.repository");
        this.lineDelimiterErrorDTOEClass.getESuperTypes().add((Object)this.getFileErrorDTO());
        this.mimeTypeErrorDTOEClass.getESuperTypes().add((Object)this.getFileErrorDTO());
        this.initEClass(this.resourcesDTOEClass, (Class)ResourcesDTO.class, "ResourcesDTO", false, false, true);
        this.initEReference(this.getResourcesDTO_ResourceProperties(), (EClassifier)this.getResourcePropertiesDTO(), (EReference)null, "resourceProperties", (String)null, 0, -1, (Class)ResourcesDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.resourcePropertyChangeResultDTOEClass, (Class)ResourcePropertyChangeResultDTO.class, "ResourcePropertyChangeResultDTO", false, false, true);
        this.initEAttribute(this.getResourcePropertyChangeResultDTO_Cancelled(), (EClassifier)this.ecorePackage.getEBoolean(), "cancelled", (String)null, 0, 1, (Class)ResourcePropertyChangeResultDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getResourcePropertyChangeResultDTO_LineDelimiterFailures(), (EClassifier)this.getLineDelimiterErrorDTO(), (EReference)null, "lineDelimiterFailures", (String)null, 0, -1, (Class)ResourcePropertyChangeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResourcePropertyChangeResultDTO_BackedUpToShed(), (EClassifier)theFilesystemRestClientDTOchangesetPackage.getBackupInShedDTO(), (EReference)null, "backedUpToShed", (String)null, 0, -1, (Class)ResourcePropertyChangeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResourcePropertyChangeResultDTO_PropertyFailures(), (EClassifier)this.getPropertyFailureDTO(), (EReference)null, "propertyFailures", (String)null, 0, -1, (Class)ResourcePropertyChangeResultDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResourcePropertyChangeResultDTO_MimeTypeFailures(), (EClassifier)this.getMimeTypeErrorDTO(), (EReference)null, "mimeTypeFailures", (String)null, 0, -1, (Class)ResourcePropertyChangeResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getResourcePropertyChangeResultDTO_ExecutableFailures(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "executableFailures", (String)null, 0, -1, (Class)ResourcePropertyChangeResultDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.resourcePropertiesDTOEClass, (Class)ResourcePropertiesDTO.class, "ResourcePropertiesDTO", false, false, true);
        this.initEAttribute(this.getResourcePropertiesDTO_FullPath(), (EClassifier)this.ecorePackage.getEString(), "fullPath", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getResourcePropertiesDTO_Path(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "path", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getResourcePropertiesDTO_RemotePath(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "remotePath", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getResourcePropertiesDTO_Shared(), (EClassifier)this.ecorePackage.getEBoolean(), "shared", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getResourcePropertiesDTO_Share(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "share", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getResourcePropertiesDTO_VersionableItemType(), (EClassifier)this.ecorePackage.getEString(), "versionableItemType", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getResourcePropertiesDTO_ItemId(), (EClassifier)this.ecorePackage.getEString(), "itemId", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getResourcePropertiesDTO_StateId(), (EClassifier)this.ecorePackage.getEString(), "stateId", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getResourcePropertiesDTO_Ignored(), (EClassifier)this.ecorePackage.getEBoolean(), "ignored", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getResourcePropertiesDTO_Local(), (EClassifier)this.ecorePackage.getEBoolean(), "local", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getResourcePropertiesDTO_Remote(), (EClassifier)this.ecorePackage.getEBoolean(), "remote", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getResourcePropertiesDTO_Dirty(), (EClassifier)this.ecorePackage.getEBoolean(), "dirty", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getResourcePropertiesDTO_FileProperties(), (EClassifier)this.getFilePropertiesDTO(), (EReference)null, "fileProperties", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getResourcePropertiesDTO_IgnoreReason(), (EClassifier)this.getIgnoreReasonDTO(), (EReference)null, "ignoreReason", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getResourcePropertiesDTO_UserProperties(), (EClassifier)theScmPackage.getProperty(), (EReference)null, "userProperties", (String)null, 0, -1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getResourcePropertiesDTO_SymlinkProperties(), (EClassifier)this.getSymlinkPropertiesDTO(), (EReference)null, "symlinkProperties", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getResourcePropertiesDTO_PermissionsContext(), (EClassifier)this.getPermissionsContextDTO(), (EReference)null, "permissionsContext", (String)null, 0, 1, (Class)ResourcePropertiesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.filePropertiesDTOEClass, (Class)FilePropertiesDTO.class, "FilePropertiesDTO", false, false, true);
        this.initEAttribute(this.getFilePropertiesDTO_ContentType(), (EClassifier)this.ecorePackage.getEString(), "contentType", (String)null, 0, 1, (Class)FilePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFilePropertiesDTO_LineDelimiter(), (EClassifier)this.ecorePackage.getEString(), "lineDelimiter", (String)null, 0, 1, (Class)FilePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFilePropertiesDTO_Executable(), (EClassifier)this.ecorePackage.getEBoolean(), "executable", (String)null, 0, 1, (Class)FilePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFilePropertiesDTO_Encoding(), (EClassifier)this.ecorePackage.getEString(), "encoding", (String)null, 0, 1, (Class)FilePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFilePropertiesDTO_OriginalContentType(), (EClassifier)this.ecorePackage.getEString(), "originalContentType", (String)null, 0, 1, (Class)FilePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFilePropertiesDTO_OriginalLineDelimiter(), (EClassifier)this.ecorePackage.getEString(), "originalLineDelimiter", (String)null, 0, 1, (Class)FilePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFilePropertiesDTO_OriginalExecutable(), (EClassifier)this.ecorePackage.getEBoolean(), "originalExecutable", (String)null, 0, 1, (Class)FilePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFilePropertiesDTO_OriginalEncoding(), (EClassifier)this.ecorePackage.getEString(), "originalEncoding", (String)null, 0, 1, (Class)FilePropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.ignoreReasonDTOEClass, (Class)IgnoreReasonDTO.class, "IgnoreReasonDTO", false, false, true);
        this.initEReference(this.getIgnoreReasonDTO_Rules(), (EClassifier)theFilesystemRestClientDTOignoresPackage.getIgnoreRuleDTO(), (EReference)null, "rules", (String)null, 0, -1, (Class)IgnoreReasonDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getIgnoreReasonDTO_InheritsFrom(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "inheritsFrom", (String)null, 0, 1, (Class)IgnoreReasonDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.lineDelimiterErrorDTOEClass, (Class)LineDelimiterErrorDTO.class, "LineDelimiterErrorDTO", false, false, true);
        this.initEAttribute(this.getLineDelimiterErrorDTO_LineDelimiter(), (EClassifier)this.ecorePackage.getEString(), "lineDelimiter", (String)null, 0, 1, (Class)LineDelimiterErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.sandboxPathsResultDTOEClass, (Class)SandboxPathsResultDTO.class, "SandboxPathsResultDTO", false, false, true);
        this.initEReference(this.getSandboxPathsResultDTO_Paths(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "paths", (String)null, 0, -1, (Class)SandboxPathsResultDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.checkinPolicyDTOEClass, (Class)CheckinPolicyDTO.class, "CheckinPolicyDTO", false, false, true);
        this.initEAttribute(this.getCheckinPolicyDTO_AutoCheckin(), (EClassifier)this.ecorePackage.getEBoolean(), "autoCheckin", (String)null, 0, 1, (Class)CheckinPolicyDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getCheckinPolicyDTO_AutoCheckinDefault(), (EClassifier)this.ecorePackage.getEBoolean(), "autoCheckinDefault", (String)null, 0, 1, (Class)CheckinPolicyDTO.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.contentTransferDTOEClass, (Class)ContentTransferDTO.class, "ContentTransferDTO", false, false, true);
        this.initEAttribute(this.getContentTransferDTO_MaxThreads(), (EClassifier)this.ecorePackage.getEInt(), "maxThreads", (String)null, 0, 1, (Class)ContentTransferDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getContentTransferDTO_MaxThreadsDefault(), (EClassifier)this.ecorePackage.getEInt(), "maxThreadsDefault", (String)null, 0, 1, (Class)ContentTransferDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getContentTransferDTO_MaxThreadsLimit(), (EClassifier)this.ecorePackage.getEInt(), "maxThreadsLimit", (String)null, 0, 1, (Class)ContentTransferDTO.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.changeSummaryDTOEClass, (Class)ChangeSummaryDTO.class, "ChangeSummaryDTO", false, false, true);
        this.initEAttribute(this.getChangeSummaryDTO_BeforeStateId(), (EClassifier)this.ecorePackage.getEString(), "beforeStateId", (String)null, 0, 1, (Class)ChangeSummaryDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getChangeSummaryDTO_AfterStateId(), (EClassifier)this.ecorePackage.getEString(), "afterStateId", (String)null, 0, 1, (Class)ChangeSummaryDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getChangeSummaryDTO_LastMergeState(), (EClassifier)this.ecorePackage.getEString(), "lastMergeState", (String)null, 0, 1, (Class)ChangeSummaryDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getChangeSummaryDTO_PathHint(), (EClassifier)this.ecorePackage.getEString(), "pathHint", (String)null, 0, 1, (Class)ChangeSummaryDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getChangeSummaryDTO_NewPathHint(), (EClassifier)this.ecorePackage.getEString(), "newPathHint", (String)null, 0, 1, (Class)ChangeSummaryDTO.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.magicDTOEClass, (Class)MagicDTO.class, "MagicDTO", false, false, true);
        this.initEAttribute(this.getMagicDTO_Pattern(), (EClassifier)this.ecorePackage.getEString(), "pattern", (String)null, 0, 1, (Class)MagicDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMagicDTO_Encoding(), (EClassifier)this.ecorePackage.getEString(), "encoding", (String)null, 0, 1, (Class)MagicDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMagicDTO_MimeType(), (EClassifier)this.ecorePackage.getEString(), "mimeType", (String)null, 0, 1, (Class)MagicDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMagicDTO_LineDelimiter(), (EClassifier)this.ecorePackage.getEString(), "lineDelimiter", (String)null, 0, 1, (Class)MagicDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMagicDTO_BuiltIn(), (EClassifier)this.ecorePackage.getEBoolean(), "builtIn", (String)null, 0, 1, (Class)MagicDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMagicDTO_IgnoreCase(), (EClassifier)this.ecorePackage.getEBoolean(), "ignoreCase", (String)null, 0, 1, (Class)MagicDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.findShareablesDTOEClass, (Class)FindShareablesDTO.class, "FindShareablesDTO", false, false, true);
        this.initEReference(this.getFindShareablesDTO_Results(), (EClassifier)this.getFindShareableDTO(), (EReference)null, "results", (String)null, 0, -1, (Class)FindShareablesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.findShareableDTOEClass, (Class)FindShareableDTO.class, "FindShareableDTO", false, false, true);
        this.initEReference(this.getFindShareableDTO_Shareables(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "shareables", (String)null, 0, -1, (Class)FindShareableDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.encodingErrorDTOEClass, (Class)EncodingErrorDTO.class, "EncodingErrorDTO", false, false, true);
        this.initEReference(this.getEncodingErrorDTO_Shareable(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareableDTO(), (EReference)null, "shareable", (String)null, 1, 1, (Class)EncodingErrorDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getEncodingErrorDTO_MalformedContent(), (EClassifier)this.ecorePackage.getEBoolean(), "malformedContent", (String)null, 1, 1, (Class)EncodingErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getEncodingErrorDTO_UnknownEncoding(), (EClassifier)this.ecorePackage.getEBoolean(), "unknownEncoding", (String)null, 1, 1, (Class)EncodingErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getEncodingErrorDTO_Encoding(), (EClassifier)this.ecorePackage.getEString(), "encoding", (String)null, 1, 1, (Class)EncodingErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getEncodingErrorDTO_PredecessorEncoding(), (EClassifier)this.ecorePackage.getEString(), "predecessorEncoding", (String)null, 0, 1, (Class)EncodingErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getEncodingErrorDTO_AtomicCommit(), (EClassifier)this.ecorePackage.getEBoolean(), "atomicCommit", (String)null, 1, 1, (Class)EncodingErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getEncodingErrorDTO_DirectionProvided(), (EClassifier)this.ecorePackage.getEBoolean(), "directionProvided", (String)null, 1, 1, (Class)EncodingErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.propertyFailureDTOEClass, (Class)PropertyFailureDTO.class, "PropertyFailureDTO", false, false, true);
        this.initEReference(this.getPropertyFailureDTO_FileName(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "fileName", (String)null, 1, 1, (Class)PropertyFailureDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getPropertyFailureDTO_Share(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "share", (String)null, 1, 1, (Class)PropertyFailureDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getPropertyFailureDTO_InvalidProperties(), (EClassifier)this.getInvalidPropertyDTO(), (EReference)null, "invalidProperties", (String)null, 1, -1, (Class)PropertyFailureDTO.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.invalidPropertyDTOEClass, (Class)InvalidPropertyDTO.class, "InvalidPropertyDTO", false, false, true);
        this.initEAttribute(this.getInvalidPropertyDTO_PropertyName(), (EClassifier)this.ecorePackage.getEString(), "propertyName", (String)null, 1, 1, (Class)InvalidPropertyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getInvalidPropertyDTO_Reason(), (EClassifier)this.ecorePackage.getEString(), "reason", (String)null, 1, 1, (Class)InvalidPropertyDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.symlinkPropertiesDTOEClass, (Class)SymlinkPropertiesDTO.class, "SymlinkPropertiesDTO", false, false, true);
        this.initEAttribute(this.getSymlinkPropertiesDTO_Type(), (EClassifier)this.ecorePackage.getEString(), "type", (String)null, 0, 1, (Class)SymlinkPropertiesDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.symlinkWarningDTOEClass, (Class)SymlinkWarningDTO.class, "SymlinkWarningDTO", false, false, true);
        this.initEAttribute(this.getSymlinkWarningDTO_Target(), (EClassifier)this.ecorePackage.getEString(), "target", (String)null, 1, 1, (Class)SymlinkWarningDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSymlinkWarningDTO_Type(), (EClassifier)this.ecorePackage.getEString(), "type", (String)null, 1, 1, (Class)SymlinkWarningDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSymlinkWarningDTO_Location(), (EClassifier)this.ecorePackage.getEString(), "location", (String)null, 1, 1, (Class)SymlinkWarningDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSymlinkWarningDTO_SandboxLocation(), (EClassifier)this.ecorePackage.getEString(), "sandboxLocation", (String)null, 1, 1, (Class)SymlinkWarningDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.mimeTypeErrorDTOEClass, (Class)MimeTypeErrorDTO.class, "MimeTypeErrorDTO", false, false, true);
        this.initEAttribute(this.getMimeTypeErrorDTO_MimeType(), (EClassifier)this.ecorePackage.getEString(), "mimeType", (String)null, 0, 1, (Class)MimeTypeErrorDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.fileErrorDTOEClass, (Class)FileErrorDTO.class, "FileErrorDTO", true, false, true);
        this.initEReference(this.getFileErrorDTO_FileName(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "fileName", (String)null, 1, 1, (Class)FileErrorDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getFileErrorDTO_Share(), (EClassifier)theFilesystemRestClientDTOcorePackage.getShareDTO(), (EReference)null, "share", (String)null, 1, 1, (Class)FileErrorDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.permissionsContextDTOEClass, (Class)PermissionsContextDTO.class, "PermissionsContextDTO", false, false, true);
        this.initEAttribute(this.getPermissionsContextDTO_Accessible(), (EClassifier)this.ecorePackage.getEBoolean(), "accessible", (String)null, 0, 1, (Class)PermissionsContextDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getPermissionsContextDTO_ReadContext(), (EClassifier)theRepositoryPackage.getAuditableHandleFacade(), (EReference)null, "readContext", (String)null, 0, 1, (Class)PermissionsContextDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.customAttributesDTOEClass, (Class)CustomAttributesDTO.class, "CustomAttributesDTO", false, false, true);
        this.initEAttribute(this.getCustomAttributesDTO_FullPath(), (EClassifier)this.ecorePackage.getEString(), "fullPath", (String)null, 0, 1, (Class)CustomAttributesDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getCustomAttributesDTO_ItemId(), (EClassifier)this.ecorePackage.getEString(), "itemId", (String)null, 0, 1, (Class)CustomAttributesDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getCustomAttributesDTO_CustomAttributes(), (EClassifier)theScmPackage.getProperty(), (EReference)null, "customAttributes", (String)null, 0, -1, (Class)CustomAttributesDTO.class, false, false, true, true, false, true, true, false, false);
        this.createResource("com.ibm.team.filesystem.rest.client.resource");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamReferenceAnnotations();
        this.createTeamAttributeAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOresource", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.resourcesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.resourcePropertyChangeResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.resourcePropertiesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.filePropertiesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.ignoreReasonDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.lineDelimiterErrorDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.sandboxPathsResultDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.checkinPolicyDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.contentTransferDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeSummaryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.magicDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.findShareablesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.findShareableDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.encodingErrorDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.propertyFailureDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.invalidPropertyDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.symlinkPropertiesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.symlinkWarningDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.mimeTypeErrorDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.fileErrorDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.permissionsContextDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.customAttributesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getResourcesDTO_ResourceProperties(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertyChangeResultDTO_LineDelimiterFailures(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertyChangeResultDTO_BackedUpToShed(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertyChangeResultDTO_PropertyFailures(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertyChangeResultDTO_MimeTypeFailures(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertyChangeResultDTO_ExecutableFailures(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_Path(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_RemotePath(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_Share(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_FileProperties(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_IgnoreReason(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_UserProperties(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_SymlinkProperties(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_PermissionsContext(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getIgnoreReasonDTO_Rules(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getIgnoreReasonDTO_InheritsFrom(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxPathsResultDTO_Paths(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFindShareablesDTO_Results(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFindShareableDTO_Shareables(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getEncodingErrorDTO_Shareable(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPropertyFailureDTO_FileName(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPropertyFailureDTO_Share(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPropertyFailureDTO_InvalidProperties(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileErrorDTO_FileName(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileErrorDTO_Share(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPermissionsContextDTO_ReadContext(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCustomAttributesDTO_CustomAttributes(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getResourcePropertyChangeResultDTO_Cancelled(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_FullPath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_Shared(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_VersionableItemType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_ItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_StateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_Ignored(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_Local(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_Remote(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResourcePropertiesDTO_Dirty(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFilePropertiesDTO_ContentType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFilePropertiesDTO_LineDelimiter(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFilePropertiesDTO_Executable(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFilePropertiesDTO_Encoding(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFilePropertiesDTO_OriginalContentType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFilePropertiesDTO_OriginalLineDelimiter(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFilePropertiesDTO_OriginalExecutable(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFilePropertiesDTO_OriginalEncoding(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLineDelimiterErrorDTO_LineDelimiter(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCheckinPolicyDTO_AutoCheckin(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCheckinPolicyDTO_AutoCheckinDefault(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContentTransferDTO_MaxThreads(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContentTransferDTO_MaxThreadsDefault(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContentTransferDTO_MaxThreadsLimit(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSummaryDTO_BeforeStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSummaryDTO_AfterStateId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSummaryDTO_LastMergeState(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSummaryDTO_PathHint(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSummaryDTO_NewPathHint(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMagicDTO_Pattern(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMagicDTO_Encoding(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMagicDTO_MimeType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMagicDTO_LineDelimiter(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMagicDTO_BuiltIn(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMagicDTO_IgnoreCase(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getEncodingErrorDTO_MalformedContent(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getEncodingErrorDTO_UnknownEncoding(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getEncodingErrorDTO_Encoding(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getEncodingErrorDTO_PredecessorEncoding(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getEncodingErrorDTO_AtomicCommit(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getEncodingErrorDTO_DirectionProvided(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getInvalidPropertyDTO_PropertyName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getInvalidPropertyDTO_Reason(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymlinkPropertiesDTO_Type(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymlinkWarningDTO_Target(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymlinkWarningDTO_Type(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymlinkWarningDTO_Location(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymlinkWarningDTO_SandboxLocation(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMimeTypeErrorDTO_MimeType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPermissionsContextDTO_Accessible(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCustomAttributesDTO_FullPath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCustomAttributesDTO_ItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
}
