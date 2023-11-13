// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import com.ibm.team.scm.common.internal.dto.RemoteRepoDescriptor;
import com.ibm.team.scm.common.dto.IComponentStateSummary;
import com.ibm.team.filesystem.common.internal.dto.OverlapResponse;
import com.ibm.team.filesystem.common.internal.dto.OverlapRequest;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolution2;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolutionReport;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolution;
import com.ibm.team.scm.common.dto.IItemConflictReport;
import com.ibm.team.scm.common.IChangeSetHandle;
import com.ibm.team.scm.common.IBaselineHandle;
import com.ibm.team.filesystem.common.internal.dto.LocalChangeUndoReport;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdateReport2;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdateReport;
import com.ibm.team.filesystem.common.internal.dto.SharePoint;
import com.ibm.team.scm.common.dto.IUpdateReport;
import com.ibm.team.scm.common.IWorkspaceHandle;
import com.ibm.team.repository.common.TeamRepositoryException;
import com.ibm.team.filesystem.common.internal.dto.LoadTree;
import com.ibm.team.scm.common.IRepositoryProgressMonitor;
import com.ibm.team.scm.common.dto.ISynchronizationTimes;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.IContextHandle;

public interface IFilesystemService
{
    public static final int COMPATIBILITY_LEVEL = 4;
    public static final int BASIC = 1;
    public static final int SYMBOLIC_LINK_SUPPORT = 2;
    public static final int PROPERTIES_SUPPORT = 3;
    public static final int TYPED_SYMBOLIC_LINK_DELETE_CONTENT_PERMISSIONS_SUPPORT = 4;
    public static final int PROCESS_UPDATES = 1;
    public static final int PROCESS_INCIDENTAL_UPDATES = 2;
    
    @Deprecated
    LoadTree getFileTreeByVersionable(final IContextHandle p0, final IComponentHandle p1, final IVersionableHandle[] p2, final int p3, final boolean p4, final ISynchronizationTimes[] p5, final IRepositoryProgressMonitor p6) throws TeamRepositoryException;
    
    @Deprecated
    LoadTree getFileTreeByVersionable2(final IContextHandle p0, final IComponentHandle p1, final IVersionableHandle[] p2, final int p3, final boolean p4, final ISynchronizationTimes[] p5, final IRepositoryProgressMonitor p6) throws TeamRepositoryException;
    
    @Deprecated
    LoadTree getFileTreeByVersionable3(final IContextHandle p0, final IComponentHandle p1, final IVersionableHandle[] p2, final int p3, final boolean p4, final ISynchronizationTimes[] p5, final IRepositoryProgressMonitor p6) throws TeamRepositoryException;
    
    LoadTree getFileTreeByVersionable4(final IContextHandle p0, final IComponentHandle p1, final IVersionableHandle[] p2, final int p3, final boolean p4, final ISynchronizationTimes[] p5, final IRepositoryProgressMonitor p6) throws TeamRepositoryException;
    
    @Deprecated
    FileAreaUpdateReport incrementalFileLoadStream(final IWorkspaceHandle p0, final IUpdateReport p1, final IComponentHandle[] p2, final SharePoint[] p3, final boolean p4, final int p5, final ISynchronizationTimes[] p6, final IRepositoryProgressMonitor p7) throws TeamRepositoryException;
    
    @Deprecated
    FileAreaUpdateReport incrementalFileLoadStream2(final IWorkspaceHandle p0, final IUpdateReport p1, final IComponentHandle[] p2, final SharePoint[] p3, final boolean p4, final int p5, final ISynchronizationTimes[] p6, final IRepositoryProgressMonitor p7) throws TeamRepositoryException;
    
    @Deprecated
    FileAreaUpdateReport incrementalFileLoadStream3(final IWorkspaceHandle p0, final IUpdateReport p1, final IComponentHandle[] p2, final SharePoint[] p3, final boolean p4, final int p5, final ISynchronizationTimes[] p6, final IRepositoryProgressMonitor p7) throws TeamRepositoryException;
    
    FileAreaUpdateReport2 incrementalFileLoadStream4(final IWorkspaceHandle p0, final IUpdateReport p1, final IComponentHandle[] p2, final boolean p3, final int p4, final ISynchronizationTimes[] p5, final IRepositoryProgressMonitor p6) throws TeamRepositoryException;
    
    LocalChangeUndoReport localChangeUndo(final IContextHandle p0, final IComponentHandle p1, final IVersionableHandle[] p2, final ISynchronizationTimes[] p3, final IRepositoryProgressMonitor p4) throws TeamRepositoryException;
    
    IChangeSetHandle[] getBlame(final IBaselineHandle p0, final IFileItemHandle p1, final IChangeSetHandle p2, final ISynchronizationTimes[] p3, final IRepositoryProgressMonitor p4) throws TeamRepositoryException;
    
    IChangeSetHandle[] getBlameWS(final IWorkspaceHandle p0, final IComponentHandle p1, final IFileItemHandle p2, final IChangeSetHandle p3, final ISynchronizationTimes[] p4, final IRepositoryProgressMonitor p5) throws TeamRepositoryException;
    
    @Deprecated
    ILogicalConflictReport interpretConflicts(final IWorkspaceHandle p0, final IItemConflictReport[] p1, final ISynchronizationTimes[] p2, final IRepositoryProgressMonitor p3) throws TeamRepositoryException;
    
    @Deprecated
    ConflictResolutionReport applyAccepted(final IWorkspaceHandle p0, final ILogicalChange[] p1, final ConflictResolution[] p2, final ISynchronizationTimes[] p3, final IRepositoryProgressMonitor p4) throws TeamRepositoryException;
    
    ConflictResolutionReport applyAccepted2(final IWorkspaceHandle p0, final ILogicalChange[] p1, final ConflictResolution2[] p2, final ISynchronizationTimes[] p3, final IRepositoryProgressMonitor p4) throws TeamRepositoryException;
    
    @Deprecated
    ConflictResolutionReport markAsMerged(final IWorkspaceHandle p0, final ILogicalChange[] p1, final ISynchronizationTimes[] p2, final IRepositoryProgressMonitor p3) throws TeamRepositoryException;
    
    ConflictResolutionReport markAsMerged2(final IWorkspaceHandle p0, final ILogicalChange[] p1, final ISynchronizationTimes[] p2, final IRepositoryProgressMonitor p3) throws TeamRepositoryException;
    
    @Deprecated
    IChangeSetSummary[] interpretChanges(final IContextHandle p0, final IChangeSetHandle[] p1, final ISynchronizationTimes[] p2, final IRepositoryProgressMonitor p3) throws TeamRepositoryException;
    
    IChangeSetSummary[] interpretChanges2(final IContextHandle p0, final IChangeSetHandle[] p1, final ISynchronizationTimes[] p2, final IRepositoryProgressMonitor p3) throws TeamRepositoryException;
    
    ILogicalConflictReport conflictReport(final IWorkspaceHandle p0, final ISynchronizationTimes[] p1, final IRepositoryProgressMonitor p2) throws TeamRepositoryException;
    
    OverlapResponse[] detectOverlap(final OverlapRequest[] p0, final ISynchronizationTimes[] p1, final IRepositoryProgressMonitor p2) throws TeamRepositoryException;
    
    IComponentStateSummary[] getComponentStateSummaries(final IContextHandle p0, final IRepositoryProgressMonitor p1) throws TeamRepositoryException;
    
    IWorkspaceCompareReport compareWorkspaces(final IWorkspaceHandle p0, final IWorkspaceHandle p1, final RemoteRepoDescriptor p2, final IComponentHandle[] p3, final int p4, final IRepositoryProgressMonitor p5) throws TeamRepositoryException;
    
    int getCompatabilityLevel(final IRepositoryProgressMonitor p0) throws TeamRepositoryException;
}
