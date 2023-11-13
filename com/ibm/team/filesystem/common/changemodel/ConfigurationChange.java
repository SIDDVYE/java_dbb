// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.changemodel;

import java.util.LinkedList;
import com.ibm.team.repository.rcp.common.collection.CollectionUtil;
import java.util.List;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.scm.common.internal.util.SiloedItemId;
import java.util.Iterator;
import com.ibm.team.scm.common.internal.util.NewCollection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.Map;

public final class ConfigurationChange
{
    private Map<FileState, StateNode> stateGraph;
    private Set<FileState> rootNodes;
    private Collection<FileChange> cachedChanges;
    private boolean excludeNoOps;
    
    public ConfigurationChange() {
        this(true);
    }
    
    public ConfigurationChange(final boolean excludeNoOps) {
        this(new ArrayList<FileChange>());
        this.excludeNoOps = excludeNoOps;
    }
    
    public ConfigurationChange(final Collection<FileChange> changes) {
        this.stateGraph = new HashMap<FileState, StateNode>();
        this.rootNodes = (Set<FileState>)NewCollection.hashSet();
        this.cachedChanges = null;
        this.excludeNoOps = true;
        for (final FileChange next : changes) {
            this.addChange(next, true);
        }
    }
    
    public void addChange(final FileChange toAdd) {
        this.addChange(toAdd, true);
    }
    
    public void addMerge(final FileChange toAdd) {
        this.addChange(toAdd, false);
    }
    
    private void addChange(final FileChange toAdd, final boolean activeChange) {
        this.cachedChanges = null;
        final StateNode beforeNode = this.getNode(toAdd.getInitial());
        beforeNode.addOutgoing(toAdd);
        final StateNode afterNode = this.getNode(toAdd.getFinal());
        if (activeChange) {
            afterNode.addActiveIncoming(toAdd);
        }
        else {
            afterNode.addMerge(toAdd);
        }
        if (beforeNode.getOutgoing().size() == 1 && !toAdd.getInitial().isDeleted() && (beforeNode != afterNode || (this.excludeNoOps && (beforeNode.getMerges().size() < 1 || afterNode.getMerges().size() < 1)))) {
            this.rootNodes.remove(toAdd.getInitial());
        }
    }
    
    public Map<SiloedItemId<IVersionable>, List<FileChange>> getChangesByItem() {
        final HashMap<SiloedItemId<IVersionable>, List<FileChange>> changesByItem = new HashMap<SiloedItemId<IVersionable>, List<FileChange>>();
        for (final FileChange next : this.getChanges()) {
            CollectionUtil.addToMapOfLists((Map)changesByItem, (Object)next.getSiloedItemId(), (Object)next);
        }
        return changesByItem;
    }
    
    private StateNode getNode(final FileState key) {
        StateNode result = this.stateGraph.get(key);
        if (result == null) {
            result = new StateNode(key);
            this.stateGraph.put(key, result);
            this.rootNodes.add(key);
        }
        return result;
    }
    
    public Collection<FileChange> getChanges() {
        if (this.cachedChanges == null) {
            this.cachedChanges = this.computeChanges();
        }
        return this.cachedChanges;
    }
    
    private Collection<FileChange> computeChanges() {
        final Set<FileChange> result = (Set<FileChange>)NewCollection.hashSet();
        final Set<FileState> visited = (Set<FileState>)NewCollection.hashSet();
        for (final FileState next : this.rootNodes) {
            final StateNode nextNode = this.stateGraph.get(next);
            visited.add(next);
            final LinkedList<FileChange> changes = new LinkedList<FileChange>();
            changes.addAll(nextNode.getActiveIncoming());
            final Set<FileState> visitedThisRoot = (Set<FileState>)NewCollection.hashSet();
            visitedThisRoot.add(next);
            while (!changes.isEmpty()) {
                final FileChange nextChange = changes.removeFirst();
                FileState beforeState = nextChange.getFinal();
                final FileState afterState = nextChange.getFinal();
                FileChange iter = nextChange;
                boolean redundantChain = false;
                final SiloedItemId item = nextChange.getSiloedItemId();
                while (iter != null) {
                    beforeState = iter.getInitial();
                    redundantChain = !visitedThisRoot.add(beforeState);
                    if (redundantChain || !visited.add(beforeState)) {
                        break;
                    }
                    if (beforeState.isDeleted()) {
                        break;
                    }
                    iter = null;
                    final List<FileChange> predecessors = this.stateGraph.get(beforeState).getActiveIncoming();
                    for (final FileChange nextPredecessor : predecessors) {
                        if (iter == null && nextPredecessor.getSiloedItemId().equals((Object)item)) {
                            iter = nextPredecessor;
                        }
                        else {
                            changes.add(nextPredecessor);
                        }
                    }
                }
                if (!redundantChain || beforeState.equals(afterState)) {
                    final FileChange toAdd = new FileChange(beforeState, afterState, (SiloedItemId<IVersionable>)item);
                    result.add(toAdd);
                }
            }
        }
        return result;
    }
    
    public List<FileChange> getChanges(final SiloedItemId<IVersionable> versionable) {
        final List<FileChange> result = new ArrayList<FileChange>();
        for (final FileChange next : this.getChanges()) {
            if (next.getSiloedItemId().equals((Object)versionable)) {
                result.add(next);
            }
        }
        return result;
    }
    
    public ConfigurationChange reverse() {
        final ConfigurationChange result = new ConfigurationChange();
        for (final StateNode next : this.stateGraph.values()) {
            for (final FileChange nextMerge : next.getMerges()) {
                result.addMerge(nextMerge.reverse());
            }
            for (final FileChange nextChange : next.getActiveIncoming()) {
                result.addChange(nextChange.reverse());
            }
        }
        return result;
    }
    
    public boolean isEmpty() {
        return this.getChanges().isEmpty();
    }
    
    public ConfigurationChange merge(final ConfigurationChange individualChanges) {
        final ArrayList<ConfigurationChange> changes = (ArrayList<ConfigurationChange>)NewCollection.arrayList();
        changes.add(this);
        changes.add(individualChanges);
        return merge(changes);
    }
    
    public static ConfigurationChange merge(final Collection<ConfigurationChange> toMerge) {
        final ConfigurationChange result = new ConfigurationChange();
        for (final ConfigurationChange nextConfig : toMerge) {
            for (final StateNode next : nextConfig.stateGraph.values()) {
                for (final FileChange nextChange : next.getActiveIncoming()) {
                    result.addChange(nextChange);
                }
                for (final FileChange nextMerge : next.getMerges()) {
                    result.addMerge(nextMerge);
                }
            }
        }
        return result;
    }
    
    public Map<FileState, StateNode> getStateGraph() {
        return this.stateGraph;
    }
}
