// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.changemodel;

import com.ibm.team.repository.common.IItemType;
import com.ibm.team.repository.common.UUID;
import com.ibm.team.scm.common.IFolder;
import java.util.Set;
import com.ibm.team.scm.common.IComponent;
import java.util.LinkedList;
import com.ibm.team.scm.common.internal.util.ItemId;
import java.util.Collections;
import com.ibm.team.repository.rcp.common.collection.CollectionUtil;
import org.eclipse.core.runtime.SubMonitor;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import com.ibm.team.repository.common.TeamRepositoryException;
import org.eclipse.core.runtime.IProgressMonitor;
import java.util.Collection;
import java.util.List;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.scm.common.internal.util.SiloedItemId;
import java.util.Map;

public final class ResolvedConfigurationChangePaths
{
    private IPathResolver pathResolver;
    private boolean resolveConflicts;
    private IPathResolver beforeResolver;
    private IPathResolver afterResolver;
    private Map<SiloedItemId<IVersionable>, VersionablePathSegment> resolvedPaths;
    private Map<SiloedItemId<IVersionable>, List<FileChange>> changesByItem;
    private Collection<SiloedItemId<IVersionable>> knownResolvedItems;
    private Collection<SiloedItemId<IVersionable>> knownRootItems;
    private final boolean absolutePathsIfPossible;
    
    private ResolvedConfigurationChangePaths(final IPathResolver resolver, final ConfigurationChange change, final boolean resolveConflicts, final boolean absolutePathsIfPossible) {
        this.beforeResolver = new IPathResolver() {
            @Override
            public Map<SiloedItemId<IVersionable>, VersionablePath> resolve(final Collection<SiloedItemId<IVersionable>> unresolved, final IProgressMonitor monitor) throws TeamRepositoryException {
                return ResolvedConfigurationChangePaths.this.computePaths(unresolved, true, monitor);
            }
        };
        this.afterResolver = new IPathResolver() {
            @Override
            public Map<SiloedItemId<IVersionable>, VersionablePath> resolve(final Collection<SiloedItemId<IVersionable>> unresolved, final IProgressMonitor monitor) throws TeamRepositoryException {
                return ResolvedConfigurationChangePaths.this.computePaths(unresolved, false, monitor);
            }
        };
        this.resolvedPaths = new HashMap<SiloedItemId<IVersionable>, VersionablePathSegment>();
        this.knownResolvedItems = new HashSet<SiloedItemId<IVersionable>>();
        this.knownRootItems = new HashSet<SiloedItemId<IVersionable>>();
        this.absolutePathsIfPossible = absolutePathsIfPossible;
        this.changesByItem = change.getChangesByItem();
        this.pathResolver = resolver;
        this.resolveConflicts = resolveConflicts;
        for (final List<FileChange> changes : this.changesByItem.values()) {
            for (final FileChange next : changes) {
                if (next.getNonDeleted(true).getPath().getParent().isNull()) {
                    this.knownResolvedItems.add(next.getSiloedItemId());
                }
            }
        }
    }
    
    public IPathResolver getPathResolver(final boolean beforePaths) {
        return beforePaths ? this.beforeResolver : this.afterResolver;
    }
    
    public Map<SiloedItemId<IVersionable>, VersionablePath> computePaths(final Collection<SiloedItemId<IVersionable>> versionables, final boolean beforeState, final IProgressMonitor monitor) throws TeamRepositoryException {
        final SubMonitor progress = SubMonitor.convert(monitor, 100);
        final Map<SiloedItemId<IVersionable>, VersionablePath> result = new HashMap<SiloedItemId<IVersionable>, VersionablePath>();
        Map<SiloedItemId<IVersionable>, List<VersionablePath>> toFetch = new HashMap<SiloedItemId<IVersionable>, List<VersionablePath>>();
        this.fetchMoreSegments(versionables, (IProgressMonitor)progress.newChild(10));
        for (final SiloedItemId<IVersionable> next : versionables) {
            final VersionablePath nextPath = this.getKnownSegments(next, beforeState);
            if (nextPath.isResolved()) {
                result.put(next, nextPath);
            }
            if (this.moreSegmentsDesired(nextPath)) {
                CollectionUtil.addToMapOfLists((Map)toFetch, (Object)nextPath.getSiloedRoot(), (Object)nextPath);
            }
        }
        while (!toFetch.isEmpty() && !progress.isCanceled()) {
            final Map<SiloedItemId<IVersionable>, List<VersionablePath>> nextToFetch = new HashMap<SiloedItemId<IVersionable>, List<VersionablePath>>();
            if (this.fetchMoreSegments(toFetch.keySet(), (IProgressMonitor)progress.newChild(50))) {
                for (final SiloedItemId<IVersionable> next2 : toFetch.keySet()) {
                    final VersionablePath beforeSegments = this.getKnownSegments(next2, beforeState);
                    final List<VersionablePath> nextPaths = toFetch.get(next2);
                    if (beforeSegments.segmentCount() == 0) {
                        for (final VersionablePath nextPath2 : nextPaths) {
                            result.put(nextPath2.getSiloedItemId(), nextPath2);
                        }
                    }
                    else {
                        for (final VersionablePath nextPath2 : nextPaths) {
                            final VersionablePath computedPath = beforeSegments.append(nextPath2);
                            if (computedPath.isResolved()) {
                                result.put(nextPath2.getSiloedItemId(), computedPath);
                            }
                            if (this.moreSegmentsDesired(computedPath)) {
                                CollectionUtil.addToMapOfLists((Map)nextToFetch, (Object)computedPath.getSiloedRoot(), (Object)computedPath);
                            }
                        }
                    }
                }
            }
            if (this.wasProgressMade(toFetch, nextToFetch)) {
                toFetch = nextToFetch;
            }
            else {
                toFetch = Collections.emptyMap();
            }
        }
        return result;
    }
    
    private boolean wasProgressMade(final Map<SiloedItemId<IVersionable>, List<VersionablePath>> toFetch, final Map<SiloedItemId<IVersionable>, List<VersionablePath>> nextToFetch) {
        if (toFetch.size() == nextToFetch.size()) {
            for (final SiloedItemId<IVersionable> key : toFetch.keySet()) {
                final List<VersionablePath> list = toFetch.get(key);
                final List<VersionablePath> nextList = nextToFetch.get(key);
                if (nextList == null || this.wasProgressMade(list, nextList)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    private boolean wasProgressMade(final List<VersionablePath> list, final List<VersionablePath> nextList) {
        for (final VersionablePath path : list) {
            for (final VersionablePath nextPath : nextList) {
                if (path.getSiloedItemId().equals((Object)nextPath.getSiloedItemId()) && !path.equals(nextPath)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean moreSegmentsDesired(final VersionablePath path) {
        return !path.isResolved() || (this.absolutePathsIfPossible && !path.isAbsolute());
    }
    
    private boolean fetchMoreSegments(final Collection<SiloedItemId<IVersionable>> keySet, final IProgressMonitor monitor) throws TeamRepositoryException {
        final Collection<SiloedItemId<IVersionable>> newKeySet = this.getUnresolvedItems(keySet);
        if (!newKeySet.isEmpty()) {
            this.internalFetchMoreSegments(newKeySet, monitor);
            return true;
        }
        return false;
    }
    
    private HashSet<SiloedItemId<IVersionable>> getUnresolvedItems(final Collection<SiloedItemId<IVersionable>> keySet) {
        final HashSet<SiloedItemId<IVersionable>> newKeySet = new HashSet<SiloedItemId<IVersionable>>();
        for (final SiloedItemId<IVersionable> next : keySet) {
            if (!this.resolvedPaths.containsKey(next)) {
                newKeySet.add(next);
            }
        }
        return newKeySet;
    }
    
    private void internalFetchMoreSegments(final Collection<SiloedItemId<IVersionable>> newKeySet, final IProgressMonitor monitor) throws TeamRepositoryException {
        final SubMonitor progress = SubMonitor.convert(monitor, 100);
        final Map<SiloedItemId<IVersionable>, VersionablePath> resolved = this.pathResolver.resolve(newKeySet, (IProgressMonitor)progress.newChild(100));
        for (final VersionablePath next : resolved.values()) {
            SiloedItemId<IVersionable> nextId = next.getSiloedItemId();
            for (int idx = next.segmentCount() - 1; idx >= 0; --idx) {
                final VersionablePathSegment nextSegment = next.segment(idx);
                if (!this.resolvedPaths.containsKey(nextId)) {
                    this.resolvedPaths.put(nextId, nextSegment);
                }
                nextId = (SiloedItemId<IVersionable>)SiloedItemId.upcast(SiloedItemId.create((ItemId)nextSegment.getParent(), next.getSiloedItemId().getComponent()));
            }
            SiloedItemId<IVersionable> topLevelItem = null;
            if (next.isResolved()) {
                if (next.segmentCount() > 1) {
                    topLevelItem = (SiloedItemId<IVersionable>)SiloedItemId.upcast(SiloedItemId.create((ItemId)next.segment(1).getParent(), next.getSiloedItemId().getComponent()));
                }
                else if (next.segmentCount() >= 0) {
                    topLevelItem = next.getSiloedItemId();
                }
                if (topLevelItem == null) {
                    continue;
                }
                this.knownResolvedItems.add(topLevelItem);
                if (!this.absolutePathsIfPossible || !next.isAbsolute()) {
                    continue;
                }
                this.knownRootItems.add(topLevelItem);
            }
        }
    }
    
    private VersionablePath getKnownSegments(final SiloedItemId<IVersionable> siloedItem, final boolean beforeState) {
        final LinkedList<VersionablePathSegment> segments = new LinkedList<VersionablePathSegment>();
        final HashSet<SiloedItemId<IVersionable>> versionables = new HashSet<SiloedItemId<IVersionable>>();
        if (siloedItem.getItemId().isNull()) {
            return VersionablePath.create(new VersionablePathSegment[0], siloedItem, false, false);
        }
        boolean resolved = false;
        boolean absolute = false;
        final ItemId<IComponent> component = (ItemId<IComponent>)siloedItem.getComponent();
        SiloedItemId<IVersionable> nextItem = siloedItem;
        while (nextItem != null && !resolved && (!this.absolutePathsIfPossible || !absolute) && !versionables.contains(nextItem)) {
            versionables.add(nextItem);
            final VersionablePathSegment nextSegment = this.getCachedPath(nextItem, beforeState);
            if (this.knownResolvedItems.contains(nextItem)) {
                resolved = true;
            }
            if (this.knownRootItems.contains(nextItem)) {
                absolute = true;
            }
            if (nextSegment != null) {
                segments.addFirst(nextSegment);
                nextItem = (SiloedItemId<IVersionable>)SiloedItemId.upcast(SiloedItemId.create((ItemId)nextSegment.getParent(), (ItemId)component));
            }
            else {
                nextItem = null;
            }
        }
        return VersionablePath.create(segments, siloedItem, absolute, resolved);
    }
    
    private VersionablePathSegment getPath(final List<FileChange> changes, final boolean beforeStates) {
        final Set<VersionablePathSegment> parentPaths = new HashSet<VersionablePathSegment>();
        for (final FileChange next : changes) {
            final FileState state = next.getNonDeleted(beforeStates);
            parentPaths.add(state.getPath());
        }
        VersionablePathSegment result = null;
        if (parentPaths.size() == 1 || (parentPaths.size() > 1 && this.resolveConflicts)) {
            result = parentPaths.iterator().next();
        }
        if (result == null) {
            return null;
        }
        return result;
    }
    
    private VersionablePathSegment getCachedPath(final SiloedItemId<IVersionable> next, final boolean beforeState) {
        final List<FileChange> changes = this.changesByItem.get(next);
        if (next.getItemId().isNull()) {
            return null;
        }
        if (changes != null) {
            return this.getPath(changes, beforeState);
        }
        final VersionablePathSegment result = this.resolvedPaths.get(next);
        if (result != null && result.getParent().equals((Object)next.getItemId())) {
            throw new IllegalStateException("Error: found an item that has itself as its own parent");
        }
        return result;
    }
    
    public static ResolvedConfigurationChangePaths resolve(final IPathResolver context, final ConfigurationChange config, final IProgressMonitor monitor) throws TeamRepositoryException {
        return resolve(context, config, true, false, monitor);
    }
    
    public static ResolvedConfigurationChangePaths resolve(final IPathResolver context, final ConfigurationChange config, final boolean resolveConflicts, final boolean absolutePathsIfPossible, final IProgressMonitor monitor) throws TeamRepositoryException {
        final ResolvedConfigurationChangePaths result = new ResolvedConfigurationChangePaths(context, config, resolveConflicts, absolutePathsIfPossible);
        result.resolveAll(monitor);
        return result;
    }
    
    public static ResolvedConfigurationChangePaths resolve(final IPathResolver context, final ConfigurationChange config, final boolean resolveConflicts, final IProgressMonitor monitor) throws TeamRepositoryException {
        return resolve(context, config, resolveConflicts, false, monitor);
    }
    
    private void resolveAll(final IProgressMonitor monitor) throws TeamRepositoryException {
        final Set<SiloedItemId<IVersionable>> allVersionables = new HashSet<SiloedItemId<IVersionable>>();
        for (final List<FileChange> next : this.changesByItem.values()) {
            for (final FileChange nextChange : next) {
                final UUID componentId = nextChange.getSiloedItemId().getComponentUUID();
                final IItemType itemType = nextChange.getItemId().getItemType();
                SiloedItemId<IVersionable> nextId = (SiloedItemId<IVersionable>)SiloedItemId.create(itemType, nextChange.getSiloedItemId().getItemUUID(), componentId);
                if (!this.changesByItem.containsKey(nextId)) {
                    allVersionables.add(nextId);
                }
                nextId = (SiloedItemId<IVersionable>)SiloedItemId.create(IFolder.ITEM_TYPE, nextChange.getFinal().getPath().getParent().getItemUUID(), componentId);
                if (!this.changesByItem.containsKey(nextId)) {
                    allVersionables.add(nextId);
                }
            }
        }
        this.fetchMoreSegments(allVersionables, monitor);
    }
    
    public VersionablePath computePath(final SiloedItemId<IVersionable> siloedItemId, final boolean beforePath, final IProgressMonitor monitor) throws TeamRepositoryException {
        final VersionablePath result = this.computePaths(Collections.singleton(siloedItemId), beforePath, monitor).get(siloedItemId);
        if (result == null) {
            throw new TeamRepositoryException("Item not found in configuration");
        }
        return result;
    }
}
