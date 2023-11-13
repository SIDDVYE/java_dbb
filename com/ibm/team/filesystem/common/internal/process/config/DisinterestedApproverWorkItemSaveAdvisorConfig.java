// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.process.config;

import com.ibm.team.scm.common.internal.process.PCD_asObject;

public class DisinterestedApproverWorkItemSaveAdvisorConfig
{
    @PCD_asObject
    public WorkItemDescendentTraversalType traverseWorkitemDescendents;
    
    public enum WorkItemDescendentTraversalType
    {
        NONE("NONE", 0), 
        CHILDREN("CHILDREN", 1);
        
        private WorkItemDescendentTraversalType(final String name, final int ordinal) {
        }
    }
}
