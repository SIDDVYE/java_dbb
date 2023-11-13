// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import com.ibm.team.repository.common.IContributor;
import com.ibm.team.scm.common.IChangeSetHandle;
import com.ibm.team.repository.common.IItemHandle;
import com.ibm.team.scm.common.IComponent;
import com.ibm.team.scm.common.internal.util.ItemId;
import com.ibm.team.scm.common.IChangeSet;
import java.util.Iterator;
import com.ibm.team.scm.common.IVersionableHandle;
import java.util.ArrayList;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.scm.common.internal.util.StateId;
import java.util.List;
import com.ibm.team.scm.common.IChange;

public class ChangeSetUtil
{
    public static List<StateId<IVersionable>> getBeforeStates(final IChange change) {
        final ArrayList<StateId<IVersionable>> result = new ArrayList<StateId<IVersionable>>();
        result.add((StateId<IVersionable>)adaptState(change, change.beforeState()));
        final List mergeStates = change.mergeStates();
        for (final IVersionableHandle handle : mergeStates) {
            result.add((StateId<IVersionable>)adaptState(change, handle));
        }
        return result;
    }
    
    public static StateId<IVersionable> getLastMergeState(final IChange change) {
        if (change.mergeStates().isEmpty()) {
            return (StateId<IVersionable>)adaptState(change, change.beforeState());
        }
        final IVersionableHandle handle = change.mergeStates().get(change.mergeStates().size() - 1);
        return (StateId<IVersionable>)adaptState(change, handle);
    }
    
    public static StateId<IVersionable> getBeforeState(final IChange change) {
        return (StateId<IVersionable>)adaptState(change, change.beforeState());
    }
    
    public static StateId<IVersionable> getAfterState(final IChange change) {
        return (StateId<IVersionable>)adaptState(change, change.afterState());
    }
    
    public static ItemId<IComponent> getComponent(final IChangeSet changeSet) {
        return ItemUtil.getComponent(changeSet.getComponent());
    }
    
    public static ItemId getItem(final IChange nextChange) {
        return new ItemId((IItemHandle)nextChange.item());
    }
    
    public static IChange getChangeFor(final IChangeSet change, final ItemId item) {
        for (final IChange next : change.changes()) {
            if (next.item().getItemId().equals((Object)item.getItemUUID())) {
                return next;
            }
        }
        return null;
    }
    
    public static ItemId<IChangeSet> getChangeSet(final IChangeSetHandle changeSet) {
        if (changeSet == null) {
            return (ItemId<IChangeSet>)ItemId.getNullItem(IChangeSet.ITEM_TYPE);
        }
        return (ItemId<IChangeSet>)new ItemId((IItemHandle)changeSet);
    }
    
    public static ItemId<IContributor> getAuthor(final IChangeSet changeSet) {
        return (ItemId<IContributor>)ItemId.create((IItemHandle)changeSet.getAuthor());
    }
    
    static StateId adaptState(final IChange change, final IVersionableHandle handle) {
        if (handle == null) {
            return new StateId(change.item().getItemType(), change.item().getItemId(), StateId.STATE_DELETED);
        }
        return new StateId((IItemHandle)handle);
    }
}
