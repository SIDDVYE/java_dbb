// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common;

import com.ibm.team.scm.common.dto.IUpdateReport;
import java.util.List;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IComponentHandle;
import java.util.Collection;

public interface ILogicalConflictReport
{
    Collection<IComponentHandle> getAffectedComponents();
    
    Collection<ILogicalConflict> conflicts();
    
    Collection<ILogicalConflict> getConflictsForComponent(final IComponentHandle p0);
    
    @Deprecated
    Collection getPendingConflict(final IComponentHandle p0, final IVersionableHandle p1);
    
    Collection<ILogicalChange> getPendingChanges(final IComponentHandle p0, final IChangeSummary p1);
    
    @Deprecated
    Collection getConflict(final IComponentHandle p0, final IVersionableHandle p1);
    
    Collection<ILogicalChange> getChange(final IComponentHandle p0, final IVersionableHandle p1);
    
    Collection<ILogicalChange> autoMergeChanges();
    
    Collection<ILogicalChange> getAutoMergeChangesForComponent(final IComponentHandle p0);
    
    Collection<ILogicalChange> incidentalChanges();
    
    Collection<ILogicalChange> getIncidentalChangesForComponent(final IComponentHandle p0);
    
    List<ILogicalChange> getDependentChanges(final ILogicalChange p0);
    
    List<ILogicalChange> getRequiredChanges(final ILogicalChange p0);
    
    IUpdateReport conflictReport();
}
