// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch;

import com.ibm.team.filesystem.common.internal.rest.client.patch.impl.FilesystemRestClientDTOpatchFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOpatchFactory extends EFactory
{
    public static final FilesystemRestClientDTOpatchFactory eINSTANCE = FilesystemRestClientDTOpatchFactoryImpl.init();
    
    AcceptQueueDTO createAcceptQueueDTO();
    
    ChangeSetSourceDTO createChangeSetSourceDTO();
    
    CurrentPatchDTO createCurrentPatchDTO();
    
    VersionableChangeDTO createVersionableChangeDTO();
    
    PropertyChangeDetailDTO createPropertyChangeDetailDTO();
    
    MoveChangeDetailDTO createMoveChangeDetailDTO();
    
    SymbolicLinkChangeDetailDTO createSymbolicLinkChangeDetailDTO();
    
    ContentChangeDetailDTO createContentChangeDetailDTO();
    
    ContentTypeChangeDetailDTO createContentTypeChangeDetailDTO();
    
    LineDelimiterChangeDetailDTO createLineDelimiterChangeDetailDTO();
    
    EncodingChangeDetailDTO createEncodingChangeDetailDTO();
    
    ExecuteBitChangeDetailDTO createExecuteBitChangeDetailDTO();
    
    AbortCurrentPatchResultDTO createAbortCurrentPatchResultDTO();
    
    UpdateCurrentPatchResultDTO createUpdateCurrentPatchResultDTO();
    
    CompleteCurrentPatchResultDTO createCompleteCurrentPatchResultDTO();
    
    ProcessAcceptQueueResultDTO createProcessAcceptQueueResultDTO();
    
    PageDescriptorDTO createPageDescriptorDTO();
    
    FilesystemRestClientDTOpatchPackage getFilesystemRestClientDTOpatchPackage();
}
