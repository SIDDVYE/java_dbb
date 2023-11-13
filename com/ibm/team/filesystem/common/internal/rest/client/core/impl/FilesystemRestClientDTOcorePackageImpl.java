// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.core.HierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineHierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConnectionDescriptor2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptor2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChanges2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.StackTraceElementDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ExceptionDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.StatusDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ChangeSetDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChangesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ReadScopeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.SandboxDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceFlowEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentHierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceComponentDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceDetailsDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineSetDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConnectionDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.TeamRepositoriesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.TeamRepositoryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import com.ibm.team.repository.common.model.RepositoryPackage;
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
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.impl.FilesystemRestClientDTOchangelogPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import com.ibm.team.filesystem.common.internal.rest.client.sync.impl.FilesystemRestClientDTOsyncPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import com.ibm.team.filesystem.common.internal.rest.client.load.impl.FilesystemRestClientDTOloadPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl.FilesystemRestClientDTOdilemmaPackageImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcoreFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOcorePackageImpl extends EPackageImpl implements FilesystemRestClientDTOcorePackage
{
    private EClass shareDTOEClass;
    private EClass pathDTOEClass;
    private EClass teamRepositoryDTOEClass;
    private EClass teamRepositoriesDTOEClass;
    private EClass connectionDescriptorDTOEClass;
    private EClass configurationDescriptorDTOEClass;
    private EClass baselineSetDTOEClass;
    private EClass baselineDTOEClass;
    private EClass workspaceDetailsDTOEClass;
    private EClass workspaceComponentDTOEClass;
    private EClass workspaceFlowEntryDTOEClass;
    private EClass shareableDTOEClass;
    private EClass sandboxDTOEClass;
    private EClass contributorDTOEClass;
    private EClass readScopeDTOEClass;
    private EClass configurationWithUncheckedInChangesDTOEClass;
    private EClass changeSetDTOEClass;
    private EClass componentDTOEClass;
    private EClass componentHierarchyDTOEClass;
    private EClass statusDTOEClass;
    private EClass exceptionDTOEClass;
    private EClass stackTraceElementDTOEClass;
    private EClass configurationWithUncheckedInChanges2DTOEClass;
    private EClass configurationDescriptor2DTOEClass;
    private EClass connectionDescriptor2DTOEClass;
    private EClass baselineHierarchyDTOEClass;
    private EClass hierarchyDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOcorePackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOcorePackageImpl() {
        super("com.ibm.team.filesystem.rest.client.core", (EFactory)FilesystemRestClientDTOcoreFactory.eINSTANCE);
        this.shareDTOEClass = null;
        this.pathDTOEClass = null;
        this.teamRepositoryDTOEClass = null;
        this.teamRepositoriesDTOEClass = null;
        this.connectionDescriptorDTOEClass = null;
        this.configurationDescriptorDTOEClass = null;
        this.baselineSetDTOEClass = null;
        this.baselineDTOEClass = null;
        this.workspaceDetailsDTOEClass = null;
        this.workspaceComponentDTOEClass = null;
        this.workspaceFlowEntryDTOEClass = null;
        this.shareableDTOEClass = null;
        this.sandboxDTOEClass = null;
        this.contributorDTOEClass = null;
        this.readScopeDTOEClass = null;
        this.configurationWithUncheckedInChangesDTOEClass = null;
        this.changeSetDTOEClass = null;
        this.componentDTOEClass = null;
        this.componentHierarchyDTOEClass = null;
        this.statusDTOEClass = null;
        this.exceptionDTOEClass = null;
        this.stackTraceElementDTOEClass = null;
        this.configurationWithUncheckedInChanges2DTOEClass = null;
        this.configurationDescriptor2DTOEClass = null;
        this.connectionDescriptor2DTOEClass = null;
        this.baselineHierarchyDTOEClass = null;
        this.hierarchyDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOcorePackage init() {
        if (FilesystemRestClientDTOcorePackageImpl.isInited) {
            return (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        }
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.core") : new FilesystemRestClientDTOcorePackageImpl());
        FilesystemRestClientDTOcorePackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
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
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
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
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
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
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.core", (Object)theFilesystemRestClientDTOcorePackage);
        return theFilesystemRestClientDTOcorePackage;
    }
    
    public EClass getShareDTO() {
        return this.shareDTOEClass;
    }
    
    public EAttribute getShareDTO_ComponentItemId() {
        return (EAttribute)this.shareDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getShareDTO_ComponentName() {
        return (EAttribute)this.shareDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getShareDTO_RootVersionableItemId() {
        return (EAttribute)this.shareDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getShareDTO_RootVersionableItemType() {
        return (EAttribute)this.shareDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getShareDTO_SandboxPath() {
        return (EAttribute)this.shareDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getShareDTO_IsLoadedWithAnotherName() {
        return (EAttribute)this.shareDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EReference getShareDTO_Path() {
        return (EReference)this.shareDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getShareDTO_RepositoryId() {
        return (EAttribute)this.shareDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getShareDTO_ContextItemId() {
        return (EAttribute)this.shareDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getShareDTO_IsWorkspaceContext() {
        return (EAttribute)this.shareDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getShareDTO_ContextName() {
        return (EAttribute)this.shareDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getPathDTO() {
        return this.pathDTOEClass;
    }
    
    public EAttribute getPathDTO_Segments() {
        return (EAttribute)this.pathDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getTeamRepositoryDTO() {
        return this.teamRepositoryDTOEClass;
    }
    
    public EAttribute getTeamRepositoryDTO_RepositoryURI() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getTeamRepositoryDTO_StateLoggingIn() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getTeamRepositoryDTO_StateLoggedIn() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getTeamRepositoryDTO_StateLoggingOut() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EAttribute getTeamRepositoryDTO_StateLoggedOut() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EAttribute getTeamRepositoryDTO_ErrorStateNone() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getTeamRepositoryDTO_ErrorStateIO() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getTeamRepositoryDTO_ErrorStateAuth() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getTeamRepositoryDTO_LastError() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getTeamRepositoryDTO_Name() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getTeamRepositoryDTO_RepositoryId() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getTeamRepositoryDTO_RepositoryItemIdId() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getTeamRepositoryDTO_UserId() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EAttribute getTeamRepositoryDTO_ConnectionTimeout() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getTeamRepositoryDTO_ContributorItemIdLoggedInContributor() {
        return (EAttribute)this.teamRepositoryDTOEClass.getEStructuralFeatures().get(14);
    }
    
    public EClass getTeamRepositoriesDTO() {
        return this.teamRepositoriesDTOEClass;
    }
    
    public EReference getTeamRepositoriesDTO_Repositories() {
        return (EReference)this.teamRepositoriesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getConnectionDescriptorDTO() {
        return this.connectionDescriptorDTOEClass;
    }
    
    public EAttribute getConnectionDescriptorDTO_RepositoryURL() {
        return (EAttribute)this.connectionDescriptorDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getConnectionDescriptorDTO_ContextItemId() {
        return (EAttribute)this.connectionDescriptorDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getConnectionDescriptorDTO_IsWorkspaceContext() {
        return (EAttribute)this.connectionDescriptorDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getConnectionDescriptorDTO_RepositoryId() {
        return (EAttribute)this.connectionDescriptorDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getConfigurationDescriptorDTO() {
        return this.configurationDescriptorDTOEClass;
    }
    
    public EReference getConfigurationDescriptorDTO_Connection() {
        return (EReference)this.configurationDescriptorDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getConfigurationDescriptorDTO_ComponentItemId() {
        return (EAttribute)this.configurationDescriptorDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getBaselineSetDTO() {
        return this.baselineSetDTOEClass;
    }
    
    public EAttribute getBaselineSetDTO_RepositoryURL() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getBaselineSetDTO_ItemId() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getBaselineSetDTO_Name() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getBaselineSetDTO_Comment() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getBaselineSetDTO_OwnerWorkspaceItemId() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getBaselineSetDTO_RepositoryId() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getBaselineSetDTO_BaselineItemIds() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getBaselineSetDTO_CreatorContributorItemId() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getBaselineSetDTO_CreationDate() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getBaselineSetDTO_ModifierContributorItemId() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getBaselineSetDTO_ModifiedDate() {
        return (EAttribute)this.baselineSetDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getBaselineDTO() {
        return this.baselineDTOEClass;
    }
    
    public EAttribute getBaselineDTO_RepositoryURL() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EReference getBaselineDTO_Hierarchy() {
        return (EReference)this.baselineDTOEClass.getEStructuralFeatures().get(13);
    }
    
    public EAttribute getBaselineDTO_ComponentName() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(14);
    }
    
    public EAttribute getBaselineDTO_ItemId() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getBaselineDTO_Name() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getBaselineDTO_RepositoryId() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EAttribute getBaselineDTO_Comment() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getBaselineDTO_Id() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getBaselineDTO_ComponentItemId() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getBaselineDTO_CreatorContributorItemId() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getBaselineDTO_CreationDate() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getBaselineDTO_ModifierContributorItemId() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getBaselineDTO_ModifiedDate() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getBaselineDTO_CreatorContributorName() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getBaselineDTO_ModifierContributorName() {
        return (EAttribute)this.baselineDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EClass getWorkspaceDetailsDTO() {
        return this.workspaceDetailsDTOEClass;
    }
    
    public EAttribute getWorkspaceDetailsDTO_RepositoryURL() {
        return (EAttribute)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getWorkspaceDetailsDTO_ItemId() {
        return (EAttribute)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getWorkspaceDetailsDTO_Name() {
        return (EAttribute)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getWorkspaceDetailsDTO_Description() {
        return (EAttribute)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getWorkspaceDetailsDTO_Stream() {
        return (EAttribute)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getWorkspaceDetailsDTO_ExclusiveFileLockPatterns() {
        return (EAttribute)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EReference getWorkspaceDetailsDTO_Owner() {
        return (EReference)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EReference getWorkspaceDetailsDTO_Components() {
        return (EReference)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getWorkspaceDetailsDTO_ComponentHierarchies() {
        return (EReference)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getWorkspaceDetailsDTO_FlowEntries() {
        return (EReference)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getWorkspaceDetailsDTO_ReadScope() {
        return (EReference)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getWorkspaceDetailsDTO_RepositoryId() {
        return (EAttribute)this.workspaceDetailsDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EClass getWorkspaceComponentDTO() {
        return this.workspaceComponentDTOEClass;
    }
    
    public EReference getWorkspaceComponentDTO_Baseline() {
        return (EReference)this.workspaceComponentDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getWorkspaceComponentDTO_RootFolder() {
        return (EAttribute)this.workspaceComponentDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getWorkspaceComponentDTO_Owner() {
        return (EReference)this.workspaceComponentDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getWorkspaceComponentDTO_CurrentChangeSetId() {
        return (EAttribute)this.workspaceComponentDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getWorkspaceComponentDTO_ReadScope() {
        return (EReference)this.workspaceComponentDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getWorkspaceComponentDTO_ActiveChangeSetIds() {
        return (EAttribute)this.workspaceComponentDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getWorkspaceFlowEntryDTO() {
        return this.workspaceFlowEntryDTOEClass;
    }
    
    public EAttribute getWorkspaceFlowEntryDTO_RepositoryURL() {
        return (EAttribute)this.workspaceFlowEntryDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getWorkspaceFlowEntryDTO_RepositoryId() {
        return (EAttribute)this.workspaceFlowEntryDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getWorkspaceFlowEntryDTO_WorkspaceItemId() {
        return (EAttribute)this.workspaceFlowEntryDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getWorkspaceFlowEntryDTO_ScopedComponentItemIds() {
        return (EAttribute)this.workspaceFlowEntryDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getWorkspaceFlowEntryDTO_DefaultFlow() {
        return (EAttribute)this.workspaceFlowEntryDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getWorkspaceFlowEntryDTO_CurrentFlow() {
        return (EAttribute)this.workspaceFlowEntryDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getShareableDTO() {
        return this.shareableDTOEClass;
    }
    
    public EAttribute getShareableDTO_SandboxPath() {
        return (EAttribute)this.shareableDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getShareableDTO_RelativePath() {
        return (EReference)this.shareableDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getSandboxDTO() {
        return this.sandboxDTOEClass;
    }
    
    public EAttribute getSandboxDTO_SandboxPath() {
        return (EAttribute)this.sandboxDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getSandboxDTO_AllShares() {
        return (EReference)this.sandboxDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getSandboxDTO_CaseSensitive() {
        return (EAttribute)this.sandboxDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getSandboxDTO_Corrupted() {
        return (EAttribute)this.sandboxDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getSandboxDTO_SandboxListening() {
        return (EAttribute)this.sandboxDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getContributorDTO() {
        return this.contributorDTOEClass;
    }
    
    public EAttribute getContributorDTO_UserId() {
        return (EAttribute)this.contributorDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getContributorDTO_FullName() {
        return (EAttribute)this.contributorDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getContributorDTO_EmailAddress() {
        return (EAttribute)this.contributorDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getContributorDTO_ContributorItemId() {
        return (EAttribute)this.contributorDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getReadScopeDTO() {
        return this.readScopeDTOEClass;
    }
    
    public EAttribute getReadScopeDTO_ReadScope() {
        return (EAttribute)this.readScopeDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getReadScopeDTO_DefersTo() {
        return (EReference)this.readScopeDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getConfigurationWithUncheckedInChangesDTO() {
        return this.configurationWithUncheckedInChangesDTOEClass;
    }
    
    public EReference getConfigurationWithUncheckedInChangesDTO_Configuration() {
        return (EReference)this.configurationWithUncheckedInChangesDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getConfigurationWithUncheckedInChangesDTO_ChangeCount() {
        return (EAttribute)this.configurationWithUncheckedInChangesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getChangeSetDTO() {
        return this.changeSetDTOEClass;
    }
    
    public EAttribute getChangeSetDTO_ItemId() {
        return (EAttribute)this.changeSetDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getChangeSetDTO_Comment() {
        return (EAttribute)this.changeSetDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getChangeSetDTO_LastChangeDate() {
        return (EAttribute)this.changeSetDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getChangeSetDTO_Component() {
        return (EReference)this.changeSetDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getChangeSetDTO_Author() {
        return (EReference)this.changeSetDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getComponentDTO() {
        return this.componentDTOEClass;
    }
    
    public EAttribute getComponentDTO_ItemId() {
        return (EAttribute)this.componentDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getComponentDTO_Name() {
        return (EAttribute)this.componentDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getComponentHierarchyDTO() {
        return this.componentHierarchyDTOEClass;
    }
    
    public EAttribute getComponentHierarchyDTO_WorkspaceItemId() {
        return (EAttribute)this.componentHierarchyDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getComponentHierarchyDTO_Subcomponents() {
        return (EReference)this.componentHierarchyDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getComponentHierarchyDTO_InWorkspace() {
        return (EAttribute)this.componentHierarchyDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getStatusDTO() {
        return this.statusDTOEClass;
    }
    
    public EAttribute getStatusDTO_Severity() {
        return (EAttribute)this.statusDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getStatusDTO_PluginId() {
        return (EAttribute)this.statusDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getStatusDTO_Code() {
        return (EAttribute)this.statusDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getStatusDTO_Message() {
        return (EAttribute)this.statusDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getStatusDTO_Exception() {
        return (EReference)this.statusDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getStatusDTO_Children() {
        return (EReference)this.statusDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getExceptionDTO() {
        return this.exceptionDTOEClass;
    }
    
    public EAttribute getExceptionDTO_Message() {
        return (EAttribute)this.exceptionDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getExceptionDTO_StackTrace() {
        return (EReference)this.exceptionDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getExceptionDTO_Cause() {
        return (EReference)this.exceptionDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getStackTraceElementDTO() {
        return this.stackTraceElementDTOEClass;
    }
    
    public EAttribute getStackTraceElementDTO_ClassName() {
        return (EAttribute)this.stackTraceElementDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getStackTraceElementDTO_MethodName() {
        return (EAttribute)this.stackTraceElementDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getConfigurationWithUncheckedInChanges2DTO() {
        return this.configurationWithUncheckedInChanges2DTOEClass;
    }
    
    public EAttribute getConfigurationWithUncheckedInChanges2DTO_ChangeCount() {
        return (EAttribute)this.configurationWithUncheckedInChanges2DTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getConfigurationWithUncheckedInChanges2DTO_Configuration() {
        return (EReference)this.configurationWithUncheckedInChanges2DTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getConfigurationDescriptor2DTO() {
        return this.configurationDescriptor2DTOEClass;
    }
    
    public EAttribute getConfigurationDescriptor2DTO_ComponentItemId() {
        return (EAttribute)this.configurationDescriptor2DTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getConfigurationDescriptor2DTO_Connection() {
        return (EReference)this.configurationDescriptor2DTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getConnectionDescriptor2DTO() {
        return this.connectionDescriptor2DTOEClass;
    }
    
    public EAttribute getConnectionDescriptor2DTO_ContextItemId() {
        return (EAttribute)this.connectionDescriptor2DTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getConnectionDescriptor2DTO_IsWorkspaceContext() {
        return (EAttribute)this.connectionDescriptor2DTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getConnectionDescriptor2DTO_RepositoryId() {
        return (EAttribute)this.connectionDescriptor2DTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getBaselineHierarchyDTO() {
        return this.baselineHierarchyDTOEClass;
    }
    
    public EReference getBaselineHierarchyDTO_Subbaselines() {
        return (EReference)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getBaselineHierarchyDTO_Comment() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getBaselineHierarchyDTO_CreationDate() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getBaselineHierarchyDTO_CreatorContributorItemId() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getBaselineHierarchyDTO_CreatorContributorName() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getBaselineHierarchyDTO_ModifiedDate() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getBaselineHierarchyDTO_ModifierContributorItemId() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getBaselineHierarchyDTO_ModifierContributorName() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getBaselineHierarchyDTO_RepositoryId() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(8);
    }
    
    public EAttribute getBaselineHierarchyDTO_RepositoryURL() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getBaselineHierarchyDTO_ItemId() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(10);
    }
    
    public EAttribute getBaselineHierarchyDTO_Id() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(11);
    }
    
    public EAttribute getBaselineHierarchyDTO_ComponentName() {
        return (EAttribute)this.baselineHierarchyDTOEClass.getEStructuralFeatures().get(12);
    }
    
    public EClass getHierarchyDTO() {
        return this.hierarchyDTOEClass;
    }
    
    public EAttribute getHierarchyDTO_Name() {
        return (EAttribute)this.hierarchyDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getHierarchyDTO_AncestorPath() {
        return (EAttribute)this.hierarchyDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getHierarchyDTO_Root() {
        return (EAttribute)this.hierarchyDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getHierarchyDTO_BranchContainsCycles() {
        return (EAttribute)this.hierarchyDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getHierarchyDTO_InCycle() {
        return (EAttribute)this.hierarchyDTOEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getHierarchyDTO_ComponentItemId() {
        return (EAttribute)this.hierarchyDTOEClass.getEStructuralFeatures().get(5);
    }
    
    public EAttribute getHierarchyDTO_Accessible() {
        return (EAttribute)this.hierarchyDTOEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getStackTraceElementDTO_FileName() {
        return (EAttribute)this.stackTraceElementDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getStackTraceElementDTO_LineNumber() {
        return (EAttribute)this.stackTraceElementDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public FilesystemRestClientDTOcoreFactory getFilesystemRestClientDTOcoreFactory() {
        return (FilesystemRestClientDTOcoreFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEAttribute(this.shareDTOEClass = this.createEClass(0), 0);
        this.createEAttribute(this.shareDTOEClass, 1);
        this.createEAttribute(this.shareDTOEClass, 2);
        this.createEAttribute(this.shareDTOEClass, 3);
        this.createEAttribute(this.shareDTOEClass, 4);
        this.createEReference(this.shareDTOEClass, 5);
        this.createEAttribute(this.shareDTOEClass, 6);
        this.createEAttribute(this.shareDTOEClass, 7);
        this.createEAttribute(this.shareDTOEClass, 8);
        this.createEAttribute(this.shareDTOEClass, 9);
        this.createEAttribute(this.shareDTOEClass, 10);
        this.createEAttribute(this.pathDTOEClass = this.createEClass(1), 0);
        this.createEAttribute(this.teamRepositoryDTOEClass = this.createEClass(2), 0);
        this.createEAttribute(this.teamRepositoryDTOEClass, 1);
        this.createEAttribute(this.teamRepositoryDTOEClass, 2);
        this.createEAttribute(this.teamRepositoryDTOEClass, 3);
        this.createEAttribute(this.teamRepositoryDTOEClass, 4);
        this.createEAttribute(this.teamRepositoryDTOEClass, 5);
        this.createEAttribute(this.teamRepositoryDTOEClass, 6);
        this.createEAttribute(this.teamRepositoryDTOEClass, 7);
        this.createEAttribute(this.teamRepositoryDTOEClass, 8);
        this.createEAttribute(this.teamRepositoryDTOEClass, 9);
        this.createEAttribute(this.teamRepositoryDTOEClass, 10);
        this.createEAttribute(this.teamRepositoryDTOEClass, 11);
        this.createEAttribute(this.teamRepositoryDTOEClass, 12);
        this.createEAttribute(this.teamRepositoryDTOEClass, 13);
        this.createEAttribute(this.teamRepositoryDTOEClass, 14);
        this.createEReference(this.teamRepositoriesDTOEClass = this.createEClass(3), 0);
        this.createEAttribute(this.connectionDescriptorDTOEClass = this.createEClass(4), 0);
        this.createEAttribute(this.connectionDescriptorDTOEClass, 1);
        this.createEAttribute(this.connectionDescriptorDTOEClass, 2);
        this.createEAttribute(this.connectionDescriptorDTOEClass, 3);
        this.createEAttribute(this.configurationDescriptorDTOEClass = this.createEClass(5), 0);
        this.createEReference(this.configurationDescriptorDTOEClass, 1);
        this.createEAttribute(this.baselineSetDTOEClass = this.createEClass(6), 0);
        this.createEAttribute(this.baselineSetDTOEClass, 1);
        this.createEAttribute(this.baselineSetDTOEClass, 2);
        this.createEAttribute(this.baselineSetDTOEClass, 3);
        this.createEAttribute(this.baselineSetDTOEClass, 4);
        this.createEAttribute(this.baselineSetDTOEClass, 5);
        this.createEAttribute(this.baselineSetDTOEClass, 6);
        this.createEAttribute(this.baselineSetDTOEClass, 7);
        this.createEAttribute(this.baselineSetDTOEClass, 8);
        this.createEAttribute(this.baselineSetDTOEClass, 9);
        this.createEAttribute(this.baselineSetDTOEClass, 10);
        this.createEAttribute(this.baselineDTOEClass = this.createEClass(7), 0);
        this.createEAttribute(this.baselineDTOEClass, 1);
        this.createEAttribute(this.baselineDTOEClass, 2);
        this.createEAttribute(this.baselineDTOEClass, 3);
        this.createEAttribute(this.baselineDTOEClass, 4);
        this.createEAttribute(this.baselineDTOEClass, 5);
        this.createEAttribute(this.baselineDTOEClass, 6);
        this.createEAttribute(this.baselineDTOEClass, 7);
        this.createEAttribute(this.baselineDTOEClass, 8);
        this.createEAttribute(this.baselineDTOEClass, 9);
        this.createEAttribute(this.baselineDTOEClass, 10);
        this.createEAttribute(this.baselineDTOEClass, 11);
        this.createEAttribute(this.baselineDTOEClass, 12);
        this.createEReference(this.baselineDTOEClass, 13);
        this.createEAttribute(this.baselineDTOEClass, 14);
        this.createEReference(this.workspaceDetailsDTOEClass = this.createEClass(8), 0);
        this.createEReference(this.workspaceDetailsDTOEClass, 1);
        this.createEAttribute(this.workspaceDetailsDTOEClass, 2);
        this.createEReference(this.workspaceDetailsDTOEClass, 3);
        this.createEAttribute(this.workspaceDetailsDTOEClass, 4);
        this.createEAttribute(this.workspaceDetailsDTOEClass, 5);
        this.createEReference(this.workspaceDetailsDTOEClass, 6);
        this.createEReference(this.workspaceDetailsDTOEClass, 7);
        this.createEAttribute(this.workspaceDetailsDTOEClass, 8);
        this.createEAttribute(this.workspaceDetailsDTOEClass, 9);
        this.createEAttribute(this.workspaceDetailsDTOEClass, 10);
        this.createEAttribute(this.workspaceDetailsDTOEClass, 11);
        this.createEAttribute(this.workspaceComponentDTOEClass = this.createEClass(9), 2);
        this.createEReference(this.workspaceComponentDTOEClass, 3);
        this.createEReference(this.workspaceComponentDTOEClass, 4);
        this.createEAttribute(this.workspaceComponentDTOEClass, 5);
        this.createEReference(this.workspaceComponentDTOEClass, 6);
        this.createEAttribute(this.workspaceComponentDTOEClass, 7);
        this.createEAttribute(this.componentHierarchyDTOEClass = this.createEClass(10), 8);
        this.createEReference(this.componentHierarchyDTOEClass, 9);
        this.createEAttribute(this.componentHierarchyDTOEClass, 10);
        this.createEAttribute(this.workspaceFlowEntryDTOEClass = this.createEClass(11), 0);
        this.createEAttribute(this.workspaceFlowEntryDTOEClass, 1);
        this.createEAttribute(this.workspaceFlowEntryDTOEClass, 2);
        this.createEAttribute(this.workspaceFlowEntryDTOEClass, 3);
        this.createEAttribute(this.workspaceFlowEntryDTOEClass, 4);
        this.createEAttribute(this.workspaceFlowEntryDTOEClass, 5);
        this.createEReference(this.shareableDTOEClass = this.createEClass(12), 0);
        this.createEAttribute(this.shareableDTOEClass, 1);
        this.createEReference(this.sandboxDTOEClass = this.createEClass(13), 0);
        this.createEAttribute(this.sandboxDTOEClass, 1);
        this.createEAttribute(this.sandboxDTOEClass, 2);
        this.createEAttribute(this.sandboxDTOEClass, 3);
        this.createEAttribute(this.sandboxDTOEClass, 4);
        this.createEAttribute(this.contributorDTOEClass = this.createEClass(14), 0);
        this.createEAttribute(this.contributorDTOEClass, 1);
        this.createEAttribute(this.contributorDTOEClass, 2);
        this.createEAttribute(this.contributorDTOEClass, 3);
        this.createEReference(this.readScopeDTOEClass = this.createEClass(15), 0);
        this.createEAttribute(this.readScopeDTOEClass, 1);
        this.createEAttribute(this.configurationWithUncheckedInChangesDTOEClass = this.createEClass(16), 0);
        this.createEReference(this.configurationWithUncheckedInChangesDTOEClass, 1);
        this.createEReference(this.changeSetDTOEClass = this.createEClass(17), 0);
        this.createEAttribute(this.changeSetDTOEClass, 1);
        this.createEReference(this.changeSetDTOEClass, 2);
        this.createEAttribute(this.changeSetDTOEClass, 3);
        this.createEAttribute(this.changeSetDTOEClass, 4);
        this.createEAttribute(this.componentDTOEClass = this.createEClass(18), 0);
        this.createEAttribute(this.componentDTOEClass, 1);
        this.createEReference(this.statusDTOEClass = this.createEClass(19), 0);
        this.createEAttribute(this.statusDTOEClass, 1);
        this.createEReference(this.statusDTOEClass, 2);
        this.createEAttribute(this.statusDTOEClass, 3);
        this.createEAttribute(this.statusDTOEClass, 4);
        this.createEAttribute(this.statusDTOEClass, 5);
        this.createEReference(this.exceptionDTOEClass = this.createEClass(20), 0);
        this.createEAttribute(this.exceptionDTOEClass, 1);
        this.createEReference(this.exceptionDTOEClass, 2);
        this.createEAttribute(this.stackTraceElementDTOEClass = this.createEClass(21), 0);
        this.createEAttribute(this.stackTraceElementDTOEClass, 1);
        this.createEAttribute(this.stackTraceElementDTOEClass, 2);
        this.createEAttribute(this.stackTraceElementDTOEClass, 3);
        this.createEAttribute(this.configurationWithUncheckedInChanges2DTOEClass = this.createEClass(22), 0);
        this.createEReference(this.configurationWithUncheckedInChanges2DTOEClass, 1);
        this.createEAttribute(this.configurationDescriptor2DTOEClass = this.createEClass(23), 0);
        this.createEReference(this.configurationDescriptor2DTOEClass, 1);
        this.createEAttribute(this.connectionDescriptor2DTOEClass = this.createEClass(24), 0);
        this.createEAttribute(this.connectionDescriptor2DTOEClass, 1);
        this.createEAttribute(this.connectionDescriptor2DTOEClass, 2);
        this.createEReference(this.baselineHierarchyDTOEClass = this.createEClass(25), 8);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 9);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 10);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 11);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 12);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 13);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 14);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 15);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 16);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 17);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 18);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 19);
        this.createEAttribute(this.baselineHierarchyDTOEClass, 20);
        this.createEAttribute(this.hierarchyDTOEClass = this.createEClass(26), 1);
        this.createEAttribute(this.hierarchyDTOEClass, 2);
        this.createEAttribute(this.hierarchyDTOEClass, 3);
        this.createEAttribute(this.hierarchyDTOEClass, 4);
        this.createEAttribute(this.hierarchyDTOEClass, 5);
        this.createEAttribute(this.hierarchyDTOEClass, 6);
        this.createEAttribute(this.hierarchyDTOEClass, 7);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("core");
        this.setNsPrefix("filesystemRestClientDTOcore");
        this.setNsURI("com.ibm.team.filesystem.rest.client.core");
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.repository");
        this.workspaceComponentDTOEClass.getESuperTypes().add((Object)this.getComponentDTO());
        this.componentHierarchyDTOEClass.getESuperTypes().add((Object)this.getHierarchyDTO());
        this.baselineHierarchyDTOEClass.getESuperTypes().add((Object)this.getHierarchyDTO());
        this.hierarchyDTOEClass.getESuperTypes().add((Object)theRepositoryPackage.getHelper());
        this.initEClass(this.shareDTOEClass, (Class)ShareDTO.class, "ShareDTO", false, false, true);
        this.initEAttribute(this.getShareDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getShareDTO_ComponentName(), (EClassifier)this.ecorePackage.getEString(), "componentName", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getShareDTO_ContextItemId(), (EClassifier)this.ecorePackage.getEString(), "contextItemId", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getShareDTO_ContextName(), (EClassifier)this.ecorePackage.getEString(), "contextName", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getShareDTO_IsWorkspaceContext(), (EClassifier)this.ecorePackage.getEBoolean(), "isWorkspaceContext", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getShareDTO_Path(), (EClassifier)this.getPathDTO(), (EReference)null, "path", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, false, true);
        this.initEAttribute(this.getShareDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getShareDTO_RootVersionableItemId(), (EClassifier)this.ecorePackage.getEString(), "rootVersionableItemId", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getShareDTO_RootVersionableItemType(), (EClassifier)this.ecorePackage.getEString(), "rootVersionableItemType", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getShareDTO_SandboxPath(), (EClassifier)this.ecorePackage.getEString(), "sandboxPath", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getShareDTO_IsLoadedWithAnotherName(), (EClassifier)this.ecorePackage.getEBoolean(), "isLoadedWithAnotherName", (String)null, 0, 1, (Class)ShareDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.pathDTOEClass, (Class)PathDTO.class, "PathDTO", false, false, true);
        this.initEAttribute(this.getPathDTO_Segments(), (EClassifier)this.ecorePackage.getEString(), "segments", (String)null, 0, -1, (Class)PathDTO.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.teamRepositoryDTOEClass, (Class)TeamRepositoryDTO.class, "TeamRepositoryDTO", false, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_ConnectionTimeout(), (EClassifier)this.ecorePackage.getEInt(), "connectionTimeout", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_ErrorStateAuth(), (EClassifier)this.ecorePackage.getEBoolean(), "errorStateAuth", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_ErrorStateIO(), (EClassifier)this.ecorePackage.getEBoolean(), "errorStateIO", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_ErrorStateNone(), (EClassifier)this.ecorePackage.getEBoolean(), "errorStateNone", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_LastError(), (EClassifier)this.ecorePackage.getEString(), "lastError", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_RepositoryItemIdId(), (EClassifier)this.ecorePackage.getEString(), "repositoryItemIdId", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_RepositoryURI(), (EClassifier)this.ecorePackage.getEString(), "repositoryURI", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_StateLoggedIn(), (EClassifier)this.ecorePackage.getEBoolean(), "stateLoggedIn", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_StateLoggingIn(), (EClassifier)this.ecorePackage.getEBoolean(), "stateLoggingIn", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_StateLoggedOut(), (EClassifier)this.ecorePackage.getEBoolean(), "stateLoggedOut", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_StateLoggingOut(), (EClassifier)this.ecorePackage.getEBoolean(), "stateLoggingOut", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_UserId(), (EClassifier)this.ecorePackage.getEString(), "userId", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getTeamRepositoryDTO_ContributorItemIdLoggedInContributor(), (EClassifier)this.ecorePackage.getEString(), "ContributorItemIdLoggedInContributor", (String)null, 0, 1, (Class)TeamRepositoryDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.teamRepositoriesDTOEClass, (Class)TeamRepositoriesDTO.class, "TeamRepositoriesDTO", false, false, true);
        this.initEReference(this.getTeamRepositoriesDTO_Repositories(), (EClassifier)this.getTeamRepositoryDTO(), (EReference)null, "repositories", (String)null, 0, -1, (Class)TeamRepositoriesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.connectionDescriptorDTOEClass, (Class)ConnectionDescriptorDTO.class, "ConnectionDescriptorDTO", false, false, true);
        this.initEAttribute(this.getConnectionDescriptorDTO_ContextItemId(), (EClassifier)this.ecorePackage.getEString(), "contextItemId", (String)null, 1, 1, (Class)ConnectionDescriptorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConnectionDescriptorDTO_IsWorkspaceContext(), (EClassifier)this.ecorePackage.getEBoolean(), "isWorkspaceContext", (String)null, 1, 1, (Class)ConnectionDescriptorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConnectionDescriptorDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 1, 1, (Class)ConnectionDescriptorDTO.class, false, false, true, true, false, false, false, false);
        this.initEAttribute(this.getConnectionDescriptorDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 1, 1, (Class)ConnectionDescriptorDTO.class, false, false, true, true, false, false, false, false);
        this.initEClass(this.configurationDescriptorDTOEClass, (Class)ConfigurationDescriptorDTO.class, "ConfigurationDescriptorDTO", false, false, true);
        this.initEAttribute(this.getConfigurationDescriptorDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 1, 1, (Class)ConfigurationDescriptorDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getConfigurationDescriptorDTO_Connection(), (EClassifier)this.getConnectionDescriptorDTO(), (EReference)null, "connection", (String)null, 1, 1, (Class)ConfigurationDescriptorDTO.class, false, false, true, true, false, true, false, false, false);
        this.initEClass(this.baselineSetDTOEClass, (Class)BaselineSetDTO.class, "BaselineSetDTO", false, false, true);
        this.initEAttribute(this.getBaselineSetDTO_BaselineItemIds(), (EClassifier)this.ecorePackage.getEString(), "baselineItemIds", (String)null, 0, -1, (Class)BaselineSetDTO.class, false, false, true, true, false, false, false, false);
        this.initEAttribute(this.getBaselineSetDTO_Comment(), (EClassifier)this.ecorePackage.getEString(), "comment", (String)null, 0, 1, (Class)BaselineSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSetDTO_CreatorContributorItemId(), (EClassifier)this.ecorePackage.getEString(), "creatorContributorItemId", (String)null, 0, 1, (Class)BaselineSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSetDTO_CreationDate(), (EClassifier)this.ecorePackage.getELong(), "creationDate", (String)null, 0, 1, (Class)BaselineSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSetDTO_ItemId(), (EClassifier)this.ecorePackage.getEString(), "itemId", (String)null, 0, 1, (Class)BaselineSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSetDTO_ModifiedDate(), (EClassifier)this.ecorePackage.getELong(), "modifiedDate", (String)null, 0, 1, (Class)BaselineSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSetDTO_ModifierContributorItemId(), (EClassifier)this.ecorePackage.getEString(), "modifierContributorItemId", (String)null, 0, 1, (Class)BaselineSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSetDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 0, 1, (Class)BaselineSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSetDTO_OwnerWorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "ownerWorkspaceItemId", (String)null, 0, 1, (Class)BaselineSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSetDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)BaselineSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineSetDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 0, 1, (Class)BaselineSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.baselineDTOEClass, (Class)BaselineDTO.class, "BaselineDTO", false, false, true);
        this.initEAttribute(this.getBaselineDTO_Comment(), (EClassifier)this.ecorePackage.getEString(), "comment", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineDTO_CreationDate(), (EClassifier)this.ecorePackage.getELong(), "creationDate", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineDTO_CreatorContributorItemId(), (EClassifier)this.ecorePackage.getEString(), "creatorContributorItemId", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineDTO_CreatorContributorName(), (EClassifier)this.ecorePackage.getEString(), "creatorContributorName", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getBaselineDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineDTO_ItemId(), (EClassifier)this.ecorePackage.getEString(), "itemId", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineDTO_ModifiedDate(), (EClassifier)this.ecorePackage.getELong(), "modifiedDate", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineDTO_ModifierContributorItemId(), (EClassifier)this.ecorePackage.getEString(), "modifierContributorItemId", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineDTO_ModifierContributorName(), (EClassifier)this.ecorePackage.getEString(), "modifierContributorName", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getBaselineDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getBaselineDTO_Hierarchy(), (EClassifier)this.getBaselineHierarchyDTO(), (EReference)null, "hierarchy", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getBaselineDTO_ComponentName(), (EClassifier)this.ecorePackage.getEString(), "componentName", (String)null, 0, 1, (Class)BaselineDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.workspaceDetailsDTOEClass, (Class)WorkspaceDetailsDTO.class, "WorkspaceDetailsDTO", false, false, true);
        this.initEReference(this.getWorkspaceDetailsDTO_Components(), (EClassifier)this.getWorkspaceComponentDTO(), (EReference)null, "components", (String)null, 0, -1, (Class)WorkspaceDetailsDTO.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getWorkspaceDetailsDTO_ComponentHierarchies(), (EClassifier)this.getComponentHierarchyDTO(), (EReference)null, "componentHierarchies", (String)null, 0, -1, (Class)WorkspaceDetailsDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getWorkspaceDetailsDTO_Description(), (EClassifier)this.ecorePackage.getEString(), "description", (String)null, 0, 1, (Class)WorkspaceDetailsDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getWorkspaceDetailsDTO_FlowEntries(), (EClassifier)this.getWorkspaceFlowEntryDTO(), (EReference)null, "flowEntries", (String)null, 0, -1, (Class)WorkspaceDetailsDTO.class, false, false, true, false, true, true, false, false, false);
        this.initEAttribute(this.getWorkspaceDetailsDTO_ItemId(), (EClassifier)this.ecorePackage.getEString(), "itemId", (String)null, 0, 1, (Class)WorkspaceDetailsDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceDetailsDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 0, 1, (Class)WorkspaceDetailsDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getWorkspaceDetailsDTO_Owner(), (EClassifier)theRepositoryPackage.getAuditableHandleFacade(), (EReference)null, "owner", (String)null, 0, 1, (Class)WorkspaceDetailsDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getWorkspaceDetailsDTO_ReadScope(), (EClassifier)this.getReadScopeDTO(), (EReference)null, "readScope", (String)null, 0, 1, (Class)WorkspaceDetailsDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getWorkspaceDetailsDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)WorkspaceDetailsDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceDetailsDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 0, 1, (Class)WorkspaceDetailsDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceDetailsDTO_Stream(), (EClassifier)this.ecorePackage.getEBoolean(), "stream", (String)null, 0, 1, (Class)WorkspaceDetailsDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceDetailsDTO_ExclusiveFileLockPatterns(), (EClassifier)this.ecorePackage.getEString(), "exclusiveFileLockPatterns", (String)null, 0, 1, (Class)WorkspaceDetailsDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.workspaceComponentDTOEClass, (Class)WorkspaceComponentDTO.class, "WorkspaceComponentDTO", false, false, true);
        this.initEAttribute(this.getWorkspaceComponentDTO_ActiveChangeSetIds(), (EClassifier)this.ecorePackage.getEString(), "activeChangeSetIds", (String)null, 0, -1, (Class)WorkspaceComponentDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getWorkspaceComponentDTO_Baseline(), (EClassifier)this.getBaselineDTO(), (EReference)null, "baseline", (String)null, 0, 1, (Class)WorkspaceComponentDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEReference(this.getWorkspaceComponentDTO_ReadScope(), (EClassifier)this.getReadScopeDTO(), (EReference)null, "readScope", (String)null, 0, 1, (Class)WorkspaceComponentDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getWorkspaceComponentDTO_RootFolder(), (EClassifier)this.ecorePackage.getEString(), "rootFolder", (String)null, 0, 1, (Class)WorkspaceComponentDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getWorkspaceComponentDTO_Owner(), (EClassifier)theRepositoryPackage.getAuditableHandleFacade(), (EReference)null, "owner", (String)null, 0, 1, (Class)WorkspaceComponentDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getWorkspaceComponentDTO_CurrentChangeSetId(), (EClassifier)this.ecorePackage.getEString(), "currentChangeSetId", (String)null, 0, 1, (Class)WorkspaceComponentDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.componentHierarchyDTOEClass, (Class)ComponentHierarchyDTO.class, "ComponentHierarchyDTO", false, false, true);
        this.initEAttribute(this.getComponentHierarchyDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)ComponentHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getComponentHierarchyDTO_Subcomponents(), (EClassifier)this.getComponentHierarchyDTO(), (EReference)null, "subcomponents", (String)null, 0, -1, (Class)ComponentHierarchyDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getComponentHierarchyDTO_InWorkspace(), (EClassifier)this.ecorePackage.getEBoolean(), "inWorkspace", (String)null, 0, 1, (Class)ComponentHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.workspaceFlowEntryDTOEClass, (Class)WorkspaceFlowEntryDTO.class, "WorkspaceFlowEntryDTO", false, false, true);
        this.initEAttribute(this.getWorkspaceFlowEntryDTO_CurrentFlow(), (EClassifier)this.ecorePackage.getEBoolean(), "currentFlow", (String)null, 0, 1, (Class)WorkspaceFlowEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceFlowEntryDTO_DefaultFlow(), (EClassifier)this.ecorePackage.getEBoolean(), "defaultFlow", (String)null, 0, 1, (Class)WorkspaceFlowEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceFlowEntryDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)WorkspaceFlowEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceFlowEntryDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 0, 1, (Class)WorkspaceFlowEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getWorkspaceFlowEntryDTO_ScopedComponentItemIds(), (EClassifier)this.ecorePackage.getEString(), "scopedComponentItemIds", (String)null, 0, -1, (Class)WorkspaceFlowEntryDTO.class, false, false, true, true, false, false, false, false);
        this.initEAttribute(this.getWorkspaceFlowEntryDTO_WorkspaceItemId(), (EClassifier)this.ecorePackage.getEString(), "workspaceItemId", (String)null, 0, 1, (Class)WorkspaceFlowEntryDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.shareableDTOEClass, (Class)ShareableDTO.class, "ShareableDTO", false, false, true);
        this.initEReference(this.getShareableDTO_RelativePath(), (EClassifier)this.getPathDTO(), (EReference)null, "relativePath", (String)null, 0, 1, (Class)ShareableDTO.class, false, false, true, true, false, true, false, false, false);
        this.initEAttribute(this.getShareableDTO_SandboxPath(), (EClassifier)this.ecorePackage.getEString(), "sandboxPath", (String)null, 0, 1, (Class)ShareableDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.sandboxDTOEClass, (Class)SandboxDTO.class, "SandboxDTO", false, false, true);
        this.initEReference(this.getSandboxDTO_AllShares(), (EClassifier)this.getShareDTO(), (EReference)null, "allShares", (String)null, 0, -1, (Class)SandboxDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getSandboxDTO_CaseSensitive(), (EClassifier)this.ecorePackage.getEBooleanObject(), "caseSensitive", (String)null, 0, 1, (Class)SandboxDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSandboxDTO_Corrupted(), (EClassifier)this.ecorePackage.getEBooleanObject(), "corrupted", (String)null, 0, 1, (Class)SandboxDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSandboxDTO_SandboxListening(), (EClassifier)this.ecorePackage.getEBooleanObject(), "sandboxListening", (String)null, 0, 1, (Class)SandboxDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getSandboxDTO_SandboxPath(), (EClassifier)this.ecorePackage.getEString(), "sandboxPath", (String)null, 0, 1, (Class)SandboxDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.contributorDTOEClass, (Class)ContributorDTO.class, "ContributorDTO", false, false, true);
        this.initEAttribute(this.getContributorDTO_ContributorItemId(), (EClassifier)this.ecorePackage.getEString(), "contributorItemId", (String)null, 0, 1, (Class)ContributorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getContributorDTO_EmailAddress(), (EClassifier)this.ecorePackage.getEString(), "emailAddress", (String)null, 0, 1, (Class)ContributorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getContributorDTO_FullName(), (EClassifier)this.ecorePackage.getEString(), "fullName", (String)null, 0, 1, (Class)ContributorDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getContributorDTO_UserId(), (EClassifier)this.ecorePackage.getEString(), "userId", (String)null, 0, 1, (Class)ContributorDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.readScopeDTOEClass, (Class)ReadScopeDTO.class, "ReadScopeDTO", false, false, true);
        this.initEReference(this.getReadScopeDTO_DefersTo(), (EClassifier)theRepositoryPackage.getAuditableHandleFacade(), (EReference)null, "defersTo", (String)null, 0, 1, (Class)ReadScopeDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getReadScopeDTO_ReadScope(), (EClassifier)this.ecorePackage.getEString(), "readScope", (String)null, 0, 1, (Class)ReadScopeDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.configurationWithUncheckedInChangesDTOEClass, (Class)ConfigurationWithUncheckedInChangesDTO.class, "ConfigurationWithUncheckedInChangesDTO", false, false, true);
        this.initEAttribute(this.getConfigurationWithUncheckedInChangesDTO_ChangeCount(), (EClassifier)this.ecorePackage.getEInt(), "changeCount", (String)null, 0, 1, (Class)ConfigurationWithUncheckedInChangesDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getConfigurationWithUncheckedInChangesDTO_Configuration(), (EClassifier)this.getConfigurationDescriptorDTO(), (EReference)null, "configuration", (String)null, 0, 1, (Class)ConfigurationWithUncheckedInChangesDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.changeSetDTOEClass, (Class)ChangeSetDTO.class, "ChangeSetDTO", false, false, true);
        this.initEReference(this.getChangeSetDTO_Author(), (EClassifier)this.getContributorDTO(), (EReference)null, "author", (String)null, 0, 1, (Class)ChangeSetDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getChangeSetDTO_Comment(), (EClassifier)this.ecorePackage.getEString(), "comment", (String)null, 0, 1, (Class)ChangeSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getChangeSetDTO_Component(), (EClassifier)this.getComponentDTO(), (EReference)null, "component", (String)null, 0, 1, (Class)ChangeSetDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getChangeSetDTO_ItemId(), (EClassifier)this.ecorePackage.getEString(), "itemId", (String)null, 0, 1, (Class)ChangeSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getChangeSetDTO_LastChangeDate(), (EClassifier)this.ecorePackage.getELong(), "lastChangeDate", (String)null, 0, 1, (Class)ChangeSetDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.componentDTOEClass, (Class)ComponentDTO.class, "ComponentDTO", false, false, true);
        this.initEAttribute(this.getComponentDTO_ItemId(), (EClassifier)this.ecorePackage.getEString(), "itemId", (String)null, 0, 1, (Class)ComponentDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getComponentDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 0, 1, (Class)ComponentDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.statusDTOEClass, (Class)StatusDTO.class, "StatusDTO", false, false, true);
        this.initEReference(this.getStatusDTO_Children(), (EClassifier)this.getStatusDTO(), (EReference)null, "children", (String)null, 0, -1, (Class)StatusDTO.class, false, false, true, false, true, true, false, false, false);
        this.initEAttribute(this.getStatusDTO_Code(), (EClassifier)this.ecorePackage.getEInt(), "code", "0", 0, 1, (Class)StatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getStatusDTO_Exception(), (EClassifier)this.getExceptionDTO(), (EReference)null, "exception", (String)null, 0, 1, (Class)StatusDTO.class, false, false, true, true, false, true, false, false, true);
        this.initEAttribute(this.getStatusDTO_Message(), (EClassifier)this.ecorePackage.getEString(), "message", (String)null, 0, 1, (Class)StatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStatusDTO_PluginId(), (EClassifier)this.ecorePackage.getEString(), "pluginId", (String)null, 0, 1, (Class)StatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStatusDTO_Severity(), (EClassifier)this.ecorePackage.getEInt(), "severity", "0", 0, 1, (Class)StatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.exceptionDTOEClass, (Class)ExceptionDTO.class, "ExceptionDTO", false, false, true);
        this.initEReference(this.getExceptionDTO_Cause(), (EClassifier)this.getExceptionDTO(), (EReference)null, "cause", (String)null, 0, 1, (Class)ExceptionDTO.class, false, false, true, true, false, true, false, false, true);
        this.initEAttribute(this.getExceptionDTO_Message(), (EClassifier)this.ecorePackage.getEString(), "message", (String)null, 0, 1, (Class)ExceptionDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getExceptionDTO_StackTrace(), (EClassifier)this.getStackTraceElementDTO(), (EReference)null, "stackTrace", (String)null, 0, -1, (Class)ExceptionDTO.class, false, false, true, false, true, true, false, false, false);
        this.initEClass(this.stackTraceElementDTOEClass, (Class)StackTraceElementDTO.class, "StackTraceElementDTO", false, false, true);
        this.initEAttribute(this.getStackTraceElementDTO_ClassName(), (EClassifier)this.ecorePackage.getEString(), "className", "", 0, 1, (Class)StackTraceElementDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStackTraceElementDTO_FileName(), (EClassifier)this.ecorePackage.getEString(), "fileName", (String)null, 0, 1, (Class)StackTraceElementDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStackTraceElementDTO_LineNumber(), (EClassifier)this.ecorePackage.getEInt(), "lineNumber", "0", 0, 1, (Class)StackTraceElementDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStackTraceElementDTO_MethodName(), (EClassifier)this.ecorePackage.getEString(), "methodName", (String)null, 0, 1, (Class)StackTraceElementDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.configurationWithUncheckedInChanges2DTOEClass, (Class)ConfigurationWithUncheckedInChanges2DTO.class, "ConfigurationWithUncheckedInChanges2DTO", false, false, true);
        this.initEAttribute(this.getConfigurationWithUncheckedInChanges2DTO_ChangeCount(), (EClassifier)this.ecorePackage.getEInt(), "changeCount", (String)null, 0, 1, (Class)ConfigurationWithUncheckedInChanges2DTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getConfigurationWithUncheckedInChanges2DTO_Configuration(), (EClassifier)this.getConfigurationDescriptor2DTO(), (EReference)null, "configuration", (String)null, 0, 1, (Class)ConfigurationWithUncheckedInChanges2DTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.configurationDescriptor2DTOEClass, (Class)ConfigurationDescriptor2DTO.class, "ConfigurationDescriptor2DTO", false, false, true);
        this.initEAttribute(this.getConfigurationDescriptor2DTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 1, 1, (Class)ConfigurationDescriptor2DTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getConfigurationDescriptor2DTO_Connection(), (EClassifier)this.getConnectionDescriptor2DTO(), (EReference)null, "connection", (String)null, 1, 1, (Class)ConfigurationDescriptor2DTO.class, false, false, true, true, false, true, false, false, false);
        this.initEClass(this.connectionDescriptor2DTOEClass, (Class)ConnectionDescriptor2DTO.class, "ConnectionDescriptor2DTO", false, false, true);
        this.initEAttribute(this.getConnectionDescriptor2DTO_ContextItemId(), (EClassifier)this.ecorePackage.getEString(), "contextItemId", (String)null, 1, 1, (Class)ConnectionDescriptor2DTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConnectionDescriptor2DTO_IsWorkspaceContext(), (EClassifier)this.ecorePackage.getEBoolean(), "isWorkspaceContext", (String)null, 1, 1, (Class)ConnectionDescriptor2DTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getConnectionDescriptor2DTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 1, 1, (Class)ConnectionDescriptor2DTO.class, false, false, true, true, false, false, false, false);
        this.initEClass(this.baselineHierarchyDTOEClass, (Class)BaselineHierarchyDTO.class, "BaselineHierarchyDTO", false, false, true);
        this.initEReference(this.getBaselineHierarchyDTO_Subbaselines(), (EClassifier)this.getBaselineHierarchyDTO(), (EReference)null, "subbaselines", (String)null, 0, -1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_Comment(), (EClassifier)this.ecorePackage.getEString(), "comment", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_CreationDate(), (EClassifier)this.ecorePackage.getELong(), "creationDate", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_CreatorContributorItemId(), (EClassifier)this.ecorePackage.getEString(), "creatorContributorItemId", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_CreatorContributorName(), (EClassifier)this.ecorePackage.getEString(), "creatorContributorName", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_ModifiedDate(), (EClassifier)this.ecorePackage.getELong(), "modifiedDate", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_ModifierContributorItemId(), (EClassifier)this.ecorePackage.getEString(), "modifierContributorItemId", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_ModifierContributorName(), (EClassifier)this.ecorePackage.getEString(), "modifierContributorName", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_RepositoryId(), (EClassifier)this.ecorePackage.getEString(), "repositoryId", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_RepositoryURL(), (EClassifier)this.ecorePackage.getEString(), "repositoryURL", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_ItemId(), (EClassifier)this.ecorePackage.getEString(), "itemId", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_Id(), (EClassifier)this.ecorePackage.getEInt(), "id", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getBaselineHierarchyDTO_ComponentName(), (EClassifier)this.ecorePackage.getEString(), "componentName", (String)null, 0, 1, (Class)BaselineHierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.hierarchyDTOEClass, (Class)HierarchyDTO.class, "HierarchyDTO", false, false, true);
        this.initEAttribute(this.getHierarchyDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 0, 1, (Class)HierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getHierarchyDTO_AncestorPath(), (EClassifier)this.ecorePackage.getEString(), "ancestorPath", (String)null, 0, -1, (Class)HierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getHierarchyDTO_Root(), (EClassifier)this.ecorePackage.getEBoolean(), "root", (String)null, 0, 1, (Class)HierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getHierarchyDTO_BranchContainsCycles(), (EClassifier)this.ecorePackage.getEBoolean(), "branchContainsCycles", (String)null, 0, 1, (Class)HierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getHierarchyDTO_InCycle(), (EClassifier)this.ecorePackage.getEBoolean(), "inCycle", (String)null, 0, 1, (Class)HierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getHierarchyDTO_ComponentItemId(), (EClassifier)this.ecorePackage.getEString(), "componentItemId", (String)null, 0, 1, (Class)HierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getHierarchyDTO_Accessible(), (EClassifier)this.ecorePackage.getEBoolean(), "accessible", (String)null, 0, 1, (Class)HierarchyDTO.class, false, false, true, true, false, true, false, true);
        this.createResource("com.ibm.team.filesystem.rest.client.core");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamAttributeAnnotations();
        this.createTeamReferenceAnnotations();
        this.createComAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOcore", "clientPackageSuffix", "", "dbMapQueryablePropertiesOnly", "false", "queryFacadePackage", "" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.shareDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.pathDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.teamRepositoryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.teamRepositoriesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.connectionDescriptorDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.configurationDescriptorDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.baselineSetDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.baselineDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.workspaceDetailsDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.workspaceComponentDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.componentHierarchyDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.workspaceFlowEntryDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.shareableDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.sandboxDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.contributorDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.readScopeDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.configurationWithUncheckedInChangesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeSetDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.componentDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.statusDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.exceptionDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.stackTraceElementDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.configurationWithUncheckedInChanges2DTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.configurationDescriptor2DTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.connectionDescriptor2DTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.baselineHierarchyDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.hierarchyDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getShareDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareDTO_ComponentName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareDTO_ContextItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareDTO_ContextName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareDTO_IsWorkspaceContext(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareDTO_RootVersionableItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareDTO_RootVersionableItemType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareDTO_SandboxPath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareDTO_IsLoadedWithAnotherName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPathDTO_Segments(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_ConnectionTimeout(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_ErrorStateAuth(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_ErrorStateIO(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_ErrorStateNone(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_LastError(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_RepositoryItemIdId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_RepositoryURI(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_StateLoggedIn(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_StateLoggingIn(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_StateLoggedOut(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_StateLoggingOut(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_UserId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoryDTO_ContributorItemIdLoggedInContributor(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConnectionDescriptorDTO_ContextItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConnectionDescriptorDTO_IsWorkspaceContext(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConnectionDescriptorDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConnectionDescriptorDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConfigurationDescriptorDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_BaselineItemIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_Comment(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_CreatorContributorItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_CreationDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_ItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_ModifiedDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_ModifierContributorItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_OwnerWorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineSetDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_Comment(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_CreationDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_CreatorContributorItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_CreatorContributorName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_ItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_ModifiedDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_ModifierContributorItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_ModifierContributorName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_ComponentName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_Description(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_ItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_Stream(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_ExclusiveFileLockPatterns(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceComponentDTO_ActiveChangeSetIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceComponentDTO_RootFolder(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceComponentDTO_CurrentChangeSetId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentHierarchyDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentHierarchyDTO_InWorkspace(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceFlowEntryDTO_CurrentFlow(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceFlowEntryDTO_DefaultFlow(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceFlowEntryDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceFlowEntryDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceFlowEntryDTO_ScopedComponentItemIds(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceFlowEntryDTO_WorkspaceItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareableDTO_SandboxPath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxDTO_CaseSensitive(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxDTO_Corrupted(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxDTO_SandboxListening(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxDTO_SandboxPath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContributorDTO_ContributorItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContributorDTO_EmailAddress(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContributorDTO_FullName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getContributorDTO_UserId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getReadScopeDTO_ReadScope(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConfigurationWithUncheckedInChangesDTO_ChangeCount(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetDTO_Comment(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetDTO_ItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetDTO_LastChangeDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentDTO_ItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStatusDTO_Code(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStatusDTO_Message(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStatusDTO_PluginId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStatusDTO_Severity(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getExceptionDTO_Message(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStackTraceElementDTO_ClassName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStackTraceElementDTO_FileName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStackTraceElementDTO_LineNumber(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStackTraceElementDTO_MethodName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConfigurationWithUncheckedInChanges2DTO_ChangeCount(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConfigurationDescriptor2DTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConnectionDescriptor2DTO_ContextItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConnectionDescriptor2DTO_IsWorkspaceContext(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConnectionDescriptor2DTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_Comment(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_CreationDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_CreatorContributorItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_CreatorContributorName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_ModifiedDate(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_ModifierContributorItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_ModifierContributorName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_RepositoryId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_RepositoryURL(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_ItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_ComponentName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getHierarchyDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getHierarchyDTO_AncestorPath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getHierarchyDTO_Root(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getHierarchyDTO_BranchContainsCycles(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getHierarchyDTO_InCycle(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getHierarchyDTO_ComponentItemId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getHierarchyDTO_Accessible(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getShareDTO_Path(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getTeamRepositoriesDTO_Repositories(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConfigurationDescriptorDTO_Connection(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineDTO_Hierarchy(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_Components(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_ComponentHierarchies(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_FlowEntries(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_Owner(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceDetailsDTO_ReadScope(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceComponentDTO_Baseline(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceComponentDTO_ReadScope(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getWorkspaceComponentDTO_Owner(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getComponentHierarchyDTO_Subcomponents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getShareableDTO_RelativePath(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSandboxDTO_AllShares(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getReadScopeDTO_DefersTo(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConfigurationWithUncheckedInChangesDTO_Configuration(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetDTO_Author(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetDTO_Component(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStatusDTO_Children(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStatusDTO_Exception(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getExceptionDTO_Cause(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getExceptionDTO_StackTrace(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConfigurationWithUncheckedInChanges2DTO_Configuration(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConfigurationDescriptor2DTO_Connection(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBaselineHierarchyDTO_Subbaselines(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createComAnnotations() {
        final String source = "com.ibm.team.codegen.helperTypeMarker";
        this.addAnnotation((ENamedElement)this.componentHierarchyDTOEClass, source, new String[0]);
        this.addAnnotation((ENamedElement)this.baselineHierarchyDTOEClass, source, new String[0]);
        this.addAnnotation((ENamedElement)this.hierarchyDTOEClass, source, new String[0]);
    }
}
