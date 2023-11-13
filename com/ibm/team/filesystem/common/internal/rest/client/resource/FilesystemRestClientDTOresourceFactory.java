// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource;

import com.ibm.team.filesystem.common.internal.rest.client.resource.impl.FilesystemRestClientDTOresourceFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOresourceFactory extends EFactory
{
    public static final FilesystemRestClientDTOresourceFactory eINSTANCE = FilesystemRestClientDTOresourceFactoryImpl.init();
    
    ResourcesDTO createResourcesDTO();
    
    ResourcePropertyChangeResultDTO createResourcePropertyChangeResultDTO();
    
    ResourcePropertiesDTO createResourcePropertiesDTO();
    
    FilePropertiesDTO createFilePropertiesDTO();
    
    IgnoreReasonDTO createIgnoreReasonDTO();
    
    LineDelimiterErrorDTO createLineDelimiterErrorDTO();
    
    SandboxPathsResultDTO createSandboxPathsResultDTO();
    
    CheckinPolicyDTO createCheckinPolicyDTO();
    
    ContentTransferDTO createContentTransferDTO();
    
    ChangeSummaryDTO createChangeSummaryDTO();
    
    MagicDTO createMagicDTO();
    
    FindShareablesDTO createFindShareablesDTO();
    
    FindShareableDTO createFindShareableDTO();
    
    EncodingErrorDTO createEncodingErrorDTO();
    
    PropertyFailureDTO createPropertyFailureDTO();
    
    InvalidPropertyDTO createInvalidPropertyDTO();
    
    SymlinkPropertiesDTO createSymlinkPropertiesDTO();
    
    SymlinkWarningDTO createSymlinkWarningDTO();
    
    MimeTypeErrorDTO createMimeTypeErrorDTO();
    
    PermissionsContextDTO createPermissionsContextDTO();
    
    CustomAttributesDTO createCustomAttributesDTO();
    
    FilesystemRestClientDTOresourcePackage getFilesystemRestClientDTOresourcePackage();
}
