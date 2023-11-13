// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.changemodel;

import org.eclipse.core.runtime.Path;
import com.ibm.team.repository.common.IItem;
import com.ibm.team.filesystem.common.internal.util.ItemUtil;
import org.eclipse.core.runtime.Assert;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.scm.common.IFolder;
import com.ibm.team.scm.common.internal.util.ItemId;

public final class VersionablePathSegment
{
    private ItemId<IFolder> parent;
    private ItemId<IVersionable> item;
    private String name;
    private static VersionablePathSegment root;
    
    private VersionablePathSegment(final ItemId<IFolder> parent, final ItemId<IVersionable> item, final String filename) {
        if (parent.getItemType() != IFolder.ITEM_TYPE) {
            throw new IllegalArgumentException();
        }
        Assert.isNotNull((Object)item);
        this.parent = parent;
        this.item = item;
        this.name = filename;
    }
    
    public static VersionablePathSegment pathFor(final IVersionable folder) {
        return create(ItemUtil.getParent(folder), (ItemId<IVersionable>)ItemId.forItem((IItem)folder), folder.getName());
    }
    
    public static VersionablePathSegment create(final ItemId<IFolder> parent, final ItemId<IVersionable> item, final String name) {
        return new VersionablePathSegment(parent, item, name);
    }
    
    @Deprecated
    public static VersionablePathSegment create(final ItemId<IFolder> parent, final String name) {
        return new VersionablePathSegment(asFolderItem(parent), (ItemId<IVersionable>)ItemId.getNullItem(ItemId.getNullItemType()), name);
    }
    
    private static ItemId<IFolder> asFolderItem(final ItemId<IFolder> itemId) {
        if (itemId.getItemType() == IFolder.ITEM_TYPE) {
            return itemId;
        }
        return (ItemId<IFolder>)new ItemId(IFolder.ITEM_TYPE, itemId.getItemUUID());
    }
    
    public static VersionablePathSegment emptyPath() {
        if (VersionablePathSegment.root == null) {
            VersionablePathSegment.root = create((ItemId<IFolder>)ItemId.getNullItem(IFolder.ITEM_TYPE), (ItemId<IVersionable>)ItemId.getNullItem(ItemId.getNullItemType()), "");
        }
        return VersionablePathSegment.root;
    }
    
    public boolean isResolved() {
        return this.parent.isNull();
    }
    
    public boolean isEmpty() {
        return this.parent.isNull() && this.name.equals("");
    }
    
    public ItemId<IFolder> getParent() {
        return this.parent;
    }
    
    public ItemId<IVersionable> getItem() {
        return this.item;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((this.parent == null) ? 0 : this.parent.hashCode());
        result = 31 * result + ((this.item == null) ? 0 : this.item.hashCode());
        result = 31 * result + ((this.name == null) ? 0 : this.name.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final VersionablePathSegment other = (VersionablePathSegment)obj;
        if (this.parent == null) {
            if (other.parent != null) {
                return false;
            }
        }
        else if (!this.parent.equals((Object)other.parent)) {
            return false;
        }
        if (this.item == null) {
            if (other.item != null) {
                return false;
            }
        }
        else if (!this.item.equals((Object)other.item)) {
            return false;
        }
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    public String getFileExtension() {
        return new Path(this.name).getFileExtension();
    }
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "";
        }
        return String.valueOf(this.parent.getItemUUID().getUuidValue()) + "/" + this.name;
    }
}
