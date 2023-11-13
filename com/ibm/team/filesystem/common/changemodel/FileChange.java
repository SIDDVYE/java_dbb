// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.changemodel;

import com.ibm.team.scm.common.internal.subcomponents.SubcomponentCommonUtils;
import java.util.Map;
import java.util.Iterator;
import com.ibm.team.scm.common.internal.util.NewCollection;
import java.util.List;
import java.util.Collection;
import com.ibm.team.scm.common.internal.util.ItemId;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.scm.common.internal.util.SiloedItemId;

public final class FileChange
{
    private FileState initialState;
    private FileState finalState;
    private SiloedItemId itemId;
    
    public FileChange(final FileState initialState, final FileState finalState, final SiloedItemId<IVersionable> itemId) {
        this.initialState = initialState;
        this.finalState = finalState;
        this.itemId = itemId;
    }
    
    public FileState getNonDeleted(final boolean before) {
        if (before) {
            return this.initialState.isDeleted() ? this.finalState : this.initialState;
        }
        return this.finalState.isDeleted() ? this.initialState : this.finalState;
    }
    
    public FileState getInitial() {
        return this.initialState;
    }
    
    public FileState getFinal() {
        return this.finalState;
    }
    
    public ItemId<IVersionable> getItemId() {
        return (ItemId<IVersionable>)this.itemId.getItemId();
    }
    
    public SiloedItemId<IVersionable> getSiloedItemId() {
        return (SiloedItemId<IVersionable>)this.itemId;
    }
    
    public FileChange reverse() {
        return new FileChange(this.finalState, this.initialState, (SiloedItemId<IVersionable>)this.itemId);
    }
    
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ((this.finalState == null) ? 0 : this.finalState.hashCode());
        result = 31 * result + ((this.initialState == null) ? 0 : this.initialState.hashCode());
        result = 31 * result + ((this.itemId == null) ? 0 : this.itemId.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final FileChange other = (FileChange)obj;
        if (this.finalState == null) {
            if (other.finalState != null) {
                return false;
            }
        }
        else if (!this.finalState.equals(other.finalState)) {
            return false;
        }
        if (this.initialState == null) {
            if (other.initialState != null) {
                return false;
            }
        }
        else if (!this.initialState.equals(other.initialState)) {
            return false;
        }
        if (this.itemId == null) {
            if (other.itemId != null) {
                return false;
            }
        }
        else if (!this.itemId.equals((Object)other.itemId)) {
            return false;
        }
        return true;
    }
    
    public boolean isModify() {
        return !this.initialState.isDeleted() && !this.finalState.isDeleted();
    }
    
    public boolean isFolder() {
        return this.getNonDeleted(true).isFolder();
    }
    
    public static List<FileChange> filterNops(final Collection<FileChange> changes) {
        final List<FileChange> result = (List<FileChange>)NewCollection.arrayList();
        for (final FileChange next : changes) {
            if (next.getInitial().equals(next.getFinal())) {
                continue;
            }
            result.add(next);
        }
        return result;
    }
    
    public boolean hasPropertyChange() {
        final FileState initialState = this.getInitial();
        if (initialState.isDeleted()) {
            return false;
        }
        final FileState finalState = this.getFinal();
        if (finalState.isDeleted()) {
            return false;
        }
        final Map<String, String> initialProperties = initialState.getProperties();
        final Map<String, String> finalProperties = finalState.getProperties();
        if (initialProperties.size() != finalProperties.size()) {
            return true;
        }
        for (final String name : initialProperties.keySet()) {
            final String otherValue = finalProperties.get(name);
            if (otherValue == null) {
                return true;
            }
            if (!otherValue.equals(initialProperties.get(name))) {
                return true;
            }
        }
        return initialState.isExectuable() != finalState.isExectuable() || initialState.getLineDelimiter() != finalState.getLineDelimiter() || !initialState.getContentType().equals(finalState.getContentType());
    }
    
    public boolean isSubcomponentChange() {
        return SubcomponentCommonUtils.contentType().equals(this.getInitial().getContentType()) || SubcomponentCommonUtils.contentType().equals(this.getFinal().getContentType());
    }
}
