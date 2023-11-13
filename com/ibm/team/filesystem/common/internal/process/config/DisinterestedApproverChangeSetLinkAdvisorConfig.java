// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.process.config;

import com.ibm.team.scm.common.internal.process.PCD_asObject;

public class DisinterestedApproverChangeSetLinkAdvisorConfig
{
    @PCD_asObject
    public WorkItemAncestorTraversalType traverseWorkitemAncestors;
    
    public enum WorkItemAncestorTraversalType
    {
        NONE("NONE", 0), 
        ANCESTORS("ANCESTORS", 1);
        
        private WorkItemAncestorTraversalType(final String name, final int ordinal) {
        }
    }
}
