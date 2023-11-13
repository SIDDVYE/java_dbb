// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog;

import com.ibm.team.filesystem.common.internal.rest.client.changelog.impl.FilesystemRestClientDTOchangelogFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOchangelogFactory extends EFactory
{
    public static final FilesystemRestClientDTOchangelogFactory eINSTANCE = FilesystemRestClientDTOchangelogFactoryImpl.init();
    
    ChangeLogEntryDTO createChangeLogEntryDTO();
    
    ChangeLogComponentEntryDTO createChangeLogComponentEntryDTO();
    
    ChangeLogChangeSetEntryDTO createChangeLogChangeSetEntryDTO();
    
    ChangeLogVersionableEntryDTO createChangeLogVersionableEntryDTO();
    
    ChangeLogVersionableEntry2DTO createChangeLogVersionableEntry2DTO();
    
    ChangeLogWorkItemEntryDTO createChangeLogWorkItemEntryDTO();
    
    ChangeLogBaselineEntryDTO createChangeLogBaselineEntryDTO();
    
    ChangeLogDirectionEntryDTO createChangeLogDirectionEntryDTO();
    
    ChangeLogRootEntryDTO createChangeLogRootEntryDTO();
    
    ChangeLogOslcLinkEntryDTO createChangeLogOslcLinkEntryDTO();
    
    FilesystemRestClientDTOchangelogPackage getFilesystemRestClientDTOchangelogPackage();
}
