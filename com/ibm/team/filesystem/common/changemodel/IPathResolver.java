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

public interface IPathResolver
{
    Map<SiloedItemId<IVersionable>, VersionablePath> resolve(final Collection<SiloedItemId<IVersionable>> p0, final IProgressMonitor p1) throws TeamRepositoryException;
}
