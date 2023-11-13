// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import com.ibm.team.scm.common.IChangeSet;
import com.ibm.team.filesystem.common.IChangeSetSummary;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.scm.common.internal.util.SiloedItemId;
import com.ibm.team.scm.common.internal.util.ItemId;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.repository.common.IItemHandle;
import com.ibm.team.scm.common.internal.util.StateId;
import com.ibm.team.filesystem.common.IChangeSummary;

public class ChangeSummaryUtil
{
    public static StateId getAfterState(final IChangeSummary change) {
        final IVersionableHandle afterState = change.afterState();
        if (afterState == null) {
            return new StateId(change.item().getItemType(), change.item().getItemId(), StateId.STATE_DELETED);
        }
        return new StateId((IItemHandle)afterState);
    }
    
    public static StateId getBeforeState(final IChangeSummary summary) {
        if (summary.beforeState() != null) {
            return new StateId((IItemHandle)summary.beforeState());
        }
        return StateId.getDeletedState(summary.item().getItemType(), summary.item().getItemId());
    }
    
    public static ItemId getItem(final IChangeSummary changeSummary) {
        return new ItemId((IItemHandle)changeSummary.item());
    }
    
    public static SiloedItemId<IVersionable> getSiloedItem(final IChangeSummary changeSummary) {
        return (SiloedItemId<IVersionable>)SiloedItemId.create(changeSummary.item(), changeSummary.component());
    }
    
    public static ItemId<IChangeSet> getChangeSet(final IChangeSetSummary nextSummary) {
        return ChangeSetUtil.getChangeSet(nextSummary.underlyingChange());
    }
}
