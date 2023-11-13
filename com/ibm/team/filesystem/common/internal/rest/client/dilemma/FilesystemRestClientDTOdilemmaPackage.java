// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl.FilesystemRestClientDTOdilemmaPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOdilemmaPackage extends EPackage
{
    public static final String eNAME = "dilemma";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.dilemma";
    public static final String eNS_PREFIX = "filesystemRestClientDTOdilemma";
    public static final FilesystemRestClientDTOdilemmaPackage eINSTANCE = FilesystemRestClientDTOdilemmaPackageImpl.init();
    public static final int SANDBOX_UPDATE_DILEMMA_DTO = 0;
    public static final int SANDBOX_UPDATE_DILEMMA_DTO__BACKED_UP_TO_SHED = 0;
    public static final int SANDBOX_UPDATE_DILEMMA_DTO__DELETED_CONTENT_SHAREABLES = 1;
    public static final int SANDBOX_UPDATE_DILEMMA_DTO_FEATURE_COUNT = 2;
    public static final int COMMIT_DILEMMA_DTO = 1;
    public static final int COMMIT_DILEMMA_DTO__BROKEN_LINKS = 0;
    public static final int COMMIT_DILEMMA_DTO__ENCODING_FAILURES = 1;
    public static final int COMMIT_DILEMMA_DTO__LINE_DELIMITER_FAILURES = 2;
    public static final int COMMIT_DILEMMA_DTO__NON_INTEROPERABLE_LINKS = 3;
    public static final int COMMIT_DILEMMA_DTO__PREDECESSOR_DELETED_SHAREABLES = 4;
    public static final int COMMIT_DILEMMA_DTO__NON_PATCH_SHAREABLES = 5;
    public static final int COMMIT_DILEMMA_DTO_FEATURE_COUNT = 6;
    public static final int UPDATE_DILEMMA_DTO = 2;
    public static final int UPDATE_DILEMMA_DTO__INACCESSIBLE_FOR_UPDATE = 0;
    public static final int UPDATE_DILEMMA_DTO__SIBLING_SHARES_TO_ADD = 1;
    public static final int UPDATE_DILEMMA_DTO_FEATURE_COUNT = 2;
    
    EClass getSandboxUpdateDilemmaDTO();
    
    EReference getSandboxUpdateDilemmaDTO_DeletedContentShareables();
    
    EReference getSandboxUpdateDilemmaDTO_BackedUpToShed();
    
    EClass getCommitDilemmaDTO();
    
    EReference getCommitDilemmaDTO_LineDelimiterFailures();
    
    EReference getCommitDilemmaDTO_EncodingFailures();
    
    EReference getCommitDilemmaDTO_BrokenLinks();
    
    EReference getCommitDilemmaDTO_NonInteroperableLinks();
    
    EReference getCommitDilemmaDTO_PredecessorDeletedShareables();
    
    EReference getCommitDilemmaDTO_NonPatchShareables();
    
    EClass getUpdateDilemmaDTO();
    
    EReference getUpdateDilemmaDTO_InaccessibleForUpdate();
    
    EReference getUpdateDilemmaDTO_SiblingSharesToAdd();
    
    FilesystemRestClientDTOdilemmaFactory getFilesystemRestClientDTOdilemmaFactory();
    
    public interface Literals
    {
        public static final EClass SANDBOX_UPDATE_DILEMMA_DTO = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getSandboxUpdateDilemmaDTO();
        public static final EReference SANDBOX_UPDATE_DILEMMA_DTO__DELETED_CONTENT_SHAREABLES = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getSandboxUpdateDilemmaDTO_DeletedContentShareables();
        public static final EReference SANDBOX_UPDATE_DILEMMA_DTO__BACKED_UP_TO_SHED = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getSandboxUpdateDilemmaDTO_BackedUpToShed();
        public static final EClass COMMIT_DILEMMA_DTO = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getCommitDilemmaDTO();
        public static final EReference COMMIT_DILEMMA_DTO__LINE_DELIMITER_FAILURES = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getCommitDilemmaDTO_LineDelimiterFailures();
        public static final EReference COMMIT_DILEMMA_DTO__ENCODING_FAILURES = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getCommitDilemmaDTO_EncodingFailures();
        public static final EReference COMMIT_DILEMMA_DTO__BROKEN_LINKS = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getCommitDilemmaDTO_BrokenLinks();
        public static final EReference COMMIT_DILEMMA_DTO__NON_INTEROPERABLE_LINKS = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getCommitDilemmaDTO_NonInteroperableLinks();
        public static final EReference COMMIT_DILEMMA_DTO__PREDECESSOR_DELETED_SHAREABLES = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getCommitDilemmaDTO_PredecessorDeletedShareables();
        public static final EReference COMMIT_DILEMMA_DTO__NON_PATCH_SHAREABLES = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getCommitDilemmaDTO_NonPatchShareables();
        public static final EClass UPDATE_DILEMMA_DTO = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getUpdateDilemmaDTO();
        public static final EReference UPDATE_DILEMMA_DTO__INACCESSIBLE_FOR_UPDATE = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getUpdateDilemmaDTO_InaccessibleForUpdate();
        public static final EReference UPDATE_DILEMMA_DTO__SIBLING_SHARES_TO_ADD = FilesystemRestClientDTOdilemmaPackage.eINSTANCE.getUpdateDilemmaDTO_SiblingSharesToAdd();
    }
}
