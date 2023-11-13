// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.corruption;

import com.ibm.team.filesystem.common.internal.rest.client.corruption.impl.FilesystemRestClientDTOcorruptionFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOcorruptionFactory extends EFactory
{
    public static final FilesystemRestClientDTOcorruptionFactory eINSTANCE = FilesystemRestClientDTOcorruptionFactoryImpl.init();
    
    RebuildCopyFileAreaDTO createRebuildCopyFileAreaDTO();
    
    MetadataValidationResultDTO createMetadataValidationResultDTO();
    
    FilesystemRestClientDTOcorruptionPackage getFilesystemRestClientDTOcorruptionPackage();
}
