// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.corruption;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.impl.FilesystemRestClientDTOcorruptionPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOcorruptionPackage extends EPackage
{
    public static final String eNAME = "corruption";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.corruption";
    public static final String eNS_PREFIX = "filesystemRestClientDTOcorruption";
    public static final FilesystemRestClientDTOcorruptionPackage eINSTANCE = FilesystemRestClientDTOcorruptionPackageImpl.init();
    public static final int REBUILD_COPY_FILE_AREA_DTO = 0;
    public static final int REBUILD_COPY_FILE_AREA_DTO__NO_DESCRIPTORS_FOUND = 0;
    public static final int REBUILD_COPY_FILE_AREA_DTO__IGNORED_ERRORS = 1;
    public static final int REBUILD_COPY_FILE_AREA_DTO_FEATURE_COUNT = 2;
    public static final int METADATA_VALIDATION_RESULT_DTO = 1;
    public static final int METADATA_VALIDATION_RESULT_DTO__IS_VALID = 0;
    public static final int METADATA_VALIDATION_RESULT_DTO_FEATURE_COUNT = 1;
    
    EClass getRebuildCopyFileAreaDTO();
    
    EAttribute getRebuildCopyFileAreaDTO_NoDescriptorsFound();
    
    EAttribute getRebuildCopyFileAreaDTO_IgnoredErrors();
    
    EClass getMetadataValidationResultDTO();
    
    EAttribute getMetadataValidationResultDTO_IsValid();
    
    FilesystemRestClientDTOcorruptionFactory getFilesystemRestClientDTOcorruptionFactory();
    
    public interface Literals
    {
        public static final EClass REBUILD_COPY_FILE_AREA_DTO = FilesystemRestClientDTOcorruptionPackage.eINSTANCE.getRebuildCopyFileAreaDTO();
        public static final EAttribute REBUILD_COPY_FILE_AREA_DTO__NO_DESCRIPTORS_FOUND = FilesystemRestClientDTOcorruptionPackage.eINSTANCE.getRebuildCopyFileAreaDTO_NoDescriptorsFound();
        public static final EAttribute REBUILD_COPY_FILE_AREA_DTO__IGNORED_ERRORS = FilesystemRestClientDTOcorruptionPackage.eINSTANCE.getRebuildCopyFileAreaDTO_IgnoredErrors();
        public static final EClass METADATA_VALIDATION_RESULT_DTO = FilesystemRestClientDTOcorruptionPackage.eINSTANCE.getMetadataValidationResultDTO();
        public static final EAttribute METADATA_VALIDATION_RESULT_DTO__IS_VALID = FilesystemRestClientDTOcorruptionPackage.eINSTANCE.getMetadataValidationResultDTO_IsValid();
    }
}
