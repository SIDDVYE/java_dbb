// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.changemodel;

import com.ibm.team.repository.common.TeamRepositoryException;
import java.util.Map;
import org.eclipse.core.runtime.IProgressMonitor;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.scm.common.internal.util.SiloedItemId;
import java.util.Collection;

public interface IComparePathResolver extends IPathResolver
{
    Map<SiloedItemId<IVersionable>, VersionablePath> resolve(final Direction p0, final Collection<SiloedItemId<IVersionable>> p1, final IProgressMonitor p2) throws TeamRepositoryException;
    
    public enum Direction
    {
        Outgoing("Outgoing", 0), 
        Incoming("Incoming", 1);
        
        private Direction(final String name, final int ordinal) {
        }
    }
}
