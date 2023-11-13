// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import com.ibm.team.repository.common.TeamRepositoryException;

public class ConflictResolutionFailed extends TeamRepositoryException
{
    private static final long serialVersionUID = -2672851121742177253L;
    
    public ConflictResolutionFailed(final String message, final Throwable cause) {
        super(message, cause);
    }
}
