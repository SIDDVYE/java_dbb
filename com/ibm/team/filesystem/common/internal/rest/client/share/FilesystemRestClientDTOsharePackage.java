// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.share.impl.FilesystemRestClientDTOsharePackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOsharePackage extends EPackage
{
    public static final String eNAME = "share";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.share";
    public static final String eNS_PREFIX = "filesystemRestClientDTOshare";
    public static final FilesystemRestClientDTOsharePackage eINSTANCE = FilesystemRestClientDTOsharePackageImpl.init();
    public static final int SHARE_RESULT_DTO = 0;
    public static final int SHARE_RESULT_DTO__CANCELLED = 0;
    public static final int SHARE_RESULT_DTO__CHANGE_SETS_COMMITTED = 1;
    public static final int SHARE_RESULT_DTO__COMMIT_DILEMMA = 2;
    public static final int SHARE_RESULT_DTO__MULTIPLE_SANDBOX_SHARES = 3;
    public static final int SHARE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = 4;
    public static final int SHARE_RESULT_DTO__SHARE_OVERLAPS = 5;
    public static final int SHARE_RESULT_DTO_FEATURE_COUNT = 6;
    public static final int SHARE_OVERLAP_DTO = 1;
    public static final int SHARE_OVERLAP_DTO__COMPONENT_ITEM_ID = 0;
    public static final int SHARE_OVERLAP_DTO__OVERLAPPING_ROOTS = 1;
    public static final int SHARE_OVERLAP_DTO__OVERLAPPING_SHARES = 2;
    public static final int SHARE_OVERLAP_DTO__REPOSITORY_ID = 3;
    public static final int SHARE_OVERLAP_DTO__REPOSITORY_URL = 4;
    public static final int SHARE_OVERLAP_DTO__ROOT = 5;
    public static final int SHARE_OVERLAP_DTO__WORKSPACE_ITEM_ID = 6;
    public static final int SHARE_OVERLAP_DTO_FEATURE_COUNT = 7;
    public static final int MULTIPLE_SANDBOX_SHARE_DTO = 2;
    public static final int MULTIPLE_SANDBOX_SHARE_DTO__CONFIGURATION = 0;
    public static final int MULTIPLE_SANDBOX_SHARE_DTO__SANDBOXES = 1;
    public static final int MULTIPLE_SANDBOX_SHARE_DTO__ROOTS = 2;
    public static final int MULTIPLE_SANDBOX_SHARE_DTO_FEATURE_COUNT = 3;
    
    EClass getShareResultDTO();
    
    EAttribute getShareResultDTO_Cancelled();
    
    EAttribute getShareResultDTO_ChangeSetsCommitted();
    
    EReference getShareResultDTO_ShareOverlaps();
    
    EReference getShareResultDTO_MultipleSandboxShares();
    
    EReference getShareResultDTO_SandboxUpdateDilemma();
    
    EReference getShareResultDTO_CommitDilemma();
    
    EClass getShareOverlapDTO();
    
    EAttribute getShareOverlapDTO_RepositoryURL();
    
    EAttribute getShareOverlapDTO_WorkspaceItemId();
    
    EAttribute getShareOverlapDTO_ComponentItemId();
    
    EReference getShareOverlapDTO_Root();
    
    EReference getShareOverlapDTO_OverlappingShares();
    
    EAttribute getShareOverlapDTO_RepositoryId();
    
    EReference getShareOverlapDTO_OverlappingRoots();
    
    EClass getMultipleSandboxShareDTO();
    
    EReference getMultipleSandboxShareDTO_Configuration();
    
    EAttribute getMultipleSandboxShareDTO_Sandboxes();
    
    EReference getMultipleSandboxShareDTO_Roots();
    
    FilesystemRestClientDTOshareFactory getFilesystemRestClientDTOshareFactory();
    
    public interface Literals
    {
        public static final EClass SHARE_RESULT_DTO = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareResultDTO();
        public static final EAttribute SHARE_RESULT_DTO__CANCELLED = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareResultDTO_Cancelled();
        public static final EAttribute SHARE_RESULT_DTO__CHANGE_SETS_COMMITTED = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareResultDTO_ChangeSetsCommitted();
        public static final EReference SHARE_RESULT_DTO__SHARE_OVERLAPS = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareResultDTO_ShareOverlaps();
        public static final EReference SHARE_RESULT_DTO__MULTIPLE_SANDBOX_SHARES = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareResultDTO_MultipleSandboxShares();
        public static final EReference SHARE_RESULT_DTO__SANDBOX_UPDATE_DILEMMA = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareResultDTO_SandboxUpdateDilemma();
        public static final EReference SHARE_RESULT_DTO__COMMIT_DILEMMA = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareResultDTO_CommitDilemma();
        public static final EClass SHARE_OVERLAP_DTO = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareOverlapDTO();
        public static final EAttribute SHARE_OVERLAP_DTO__REPOSITORY_URL = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareOverlapDTO_RepositoryURL();
        public static final EAttribute SHARE_OVERLAP_DTO__WORKSPACE_ITEM_ID = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareOverlapDTO_WorkspaceItemId();
        public static final EAttribute SHARE_OVERLAP_DTO__COMPONENT_ITEM_ID = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareOverlapDTO_ComponentItemId();
        public static final EReference SHARE_OVERLAP_DTO__ROOT = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareOverlapDTO_Root();
        public static final EReference SHARE_OVERLAP_DTO__OVERLAPPING_SHARES = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareOverlapDTO_OverlappingShares();
        public static final EAttribute SHARE_OVERLAP_DTO__REPOSITORY_ID = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareOverlapDTO_RepositoryId();
        public static final EReference SHARE_OVERLAP_DTO__OVERLAPPING_ROOTS = FilesystemRestClientDTOsharePackage.eINSTANCE.getShareOverlapDTO_OverlappingRoots();
        public static final EClass MULTIPLE_SANDBOX_SHARE_DTO = FilesystemRestClientDTOsharePackage.eINSTANCE.getMultipleSandboxShareDTO();
        public static final EReference MULTIPLE_SANDBOX_SHARE_DTO__CONFIGURATION = FilesystemRestClientDTOsharePackage.eINSTANCE.getMultipleSandboxShareDTO_Configuration();
        public static final EAttribute MULTIPLE_SANDBOX_SHARE_DTO__SANDBOXES = FilesystemRestClientDTOsharePackage.eINSTANCE.getMultipleSandboxShareDTO_Sandboxes();
        public static final EReference MULTIPLE_SANDBOX_SHARE_DTO__ROOTS = FilesystemRestClientDTOsharePackage.eINSTANCE.getMultipleSandboxShareDTO_Roots();
    }
}
