// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share;

import com.ibm.team.filesystem.common.internal.rest.client.share.impl.FilesystemRestClientDTOshareFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOshareFactory extends EFactory
{
    public static final FilesystemRestClientDTOshareFactory eINSTANCE = FilesystemRestClientDTOshareFactoryImpl.init();
    
    ShareResultDTO createShareResultDTO();
    
    ShareOverlapDTO createShareOverlapDTO();
    
    MultipleSandboxShareDTO createMultipleSandboxShareDTO();
    
    FilesystemRestClientDTOsharePackage getFilesystemRestClientDTOsharePackage();
}
