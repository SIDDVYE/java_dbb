// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto;

import com.ibm.team.filesystem.common.internal.dto.impl.FilesystemDTOFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemDTOFactory extends EFactory
{
    public static final FilesystemDTOFactory eINSTANCE = FilesystemDTOFactoryImpl.init();
    
    Resolution createResolution();
    
    LogicalConflictReport createLogicalConflictReport();
    
    LogicalConflict createLogicalConflict();
    
    LogicalChange createLogicalChange();
    
    FileAreaUpdate createFileAreaUpdate();
    
    ConflictResolutionReport createConflictResolutionReport();
    
    ConflictResolution createConflictResolution();
    
    BasicChange createBasicChange();
    
    ChangeSynopsis createChangeSynopsis();
    
    ChangeSetSynopsis createChangeSetSynopsis();
    
    LoadTree createLoadTree();
    
    FileAreaUpdateReport createFileAreaUpdateReport();
    
    OverlapRequest createOverlapRequest();
    
    OverlapDescription createOverlapDescription();
    
    CompareResult createCompareResult();
    
    SharePoint createSharePoint();
    
    ConflictResolution2 createConflictResolution2();
    
    Inaccessible createInaccessible();
    
    FileAreaUpdateReport2 createFileAreaUpdateReport2();
    
    LocalChangeUndoReport createLocalChangeUndoReport();
    
    SymbolicLinkChangeDetail createSymbolicLinkChangeDetail();
    
    ContentChangeDetail createContentChangeDetail();
    
    ExecutableBitChangeDetail createExecutableBitChangeDetail();
    
    ContentTypeChangeDetail createContentTypeChangeDetail();
    
    LineDelimiterChangeDetail createLineDelimiterChangeDetail();
    
    EncodingChangeDetail createEncodingChangeDetail();
    
    OverlapResponse createOverlapResponse();
    
    FilesystemDTOPackage getFilesystemDTOPackage();
}
