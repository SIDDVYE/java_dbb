// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.changemodel;

import com.ibm.team.repository.common.IItem;
import java.util.Arrays;
import java.util.Iterator;
import com.ibm.team.repository.common.IItemHandle;
import com.ibm.team.scm.common.dto.INameItemPair;
import com.ibm.team.scm.common.IFolder;
import java.util.ArrayList;
import com.ibm.team.scm.common.IComponent;
import com.ibm.team.scm.common.dto.IAncestorReport;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.IPath;
import com.ibm.team.scm.common.internal.util.ItemId;
import java.util.List;
import com.ibm.team.filesystem.common.internal.Messages;
import com.ibm.team.scm.common.IVersionable;
import com.ibm.team.scm.common.internal.util.SiloedItemId;

public final class VersionablePath
{
    private static final String UNRESOLVED_PATH;
    private static VersionablePath nullPath;
    private final VersionablePathSegment[] segments;
    private final SiloedItemId<IVersionable> item;
    private final boolean absolute;
    private final boolean resolved;
    
    static {
        UNRESOLVED_PATH = Messages.getString("UNRESOLVED_PATH");
    }
    
    public static VersionablePath create(final VersionablePathSegment[] segments, final SiloedItemId<IVersionable> item, final boolean absolute, final boolean resolved) {
        return new VersionablePath(segments, item, absolute, resolved);
    }
    
    public static VersionablePath create(final List<VersionablePathSegment> segments, final SiloedItemId<IVersionable> item, final boolean absolute, final boolean resolved) {
        final VersionablePathSegment[] array = new VersionablePathSegment[segments.size()];
        segments.toArray(array);
        return create(array, item, absolute, resolved);
    }
    
    private VersionablePath(final VersionablePathSegment[] segments, final SiloedItemId<IVersionable> item, final boolean absolute, final boolean resolved) {
        this.segments = segments;
        this.item = item;
        this.absolute = absolute;
        this.resolved = resolved;
    }
    
    public boolean isAbsolute() {
        return this.absolute;
    }
    
    public boolean isResolved() {
        return this.resolved;
    }
    
    public ItemId<IVersionable> getRoot() {
        if (this.segments.length > 0) {
            final ItemId<IVersionable> upcast = (ItemId<IVersionable>)ItemId.upcast((ItemId)this.segments[0].getParent());
            if (!upcast.isNull()) {
                return upcast;
            }
            if (this.segments.length > 1) {
                return (ItemId<IVersionable>)ItemId.upcast((ItemId)this.segments[1].getParent());
            }
        }
        return this.getItemId();
    }
    
    public SiloedItemId<IVersionable> getSiloedRoot() {
        return (SiloedItemId<IVersionable>)SiloedItemId.create((ItemId)this.getRoot(), this.item.getComponent());
    }
    
    public int segmentCount() {
        return this.segments.length;
    }
    
    public ItemId<IVersionable> getItemId() {
        return (ItemId<IVersionable>)this.item.getItemId();
    }
    
    public SiloedItemId<IVersionable> getSiloedItemId() {
        return this.item;
    }
    
    public VersionablePath append(final VersionablePath nextPath) {
        if (!this.isResolved() && this.segmentCount() == 0 && this.item.equals((Object)nextPath.getSiloedRoot())) {
            return nextPath;
        }
        int start = 0;
        if (nextPath.isResolved() && nextPath.segmentCount() > 0 && this.item.equals((Object)nextPath.getSiloedRoot())) {
            start = 1;
        }
        final VersionablePathSegment[] newPath = new VersionablePathSegment[this.segments.length + nextPath.segments.length - start];
        System.arraycopy(this.segments, 0, newPath, 0, this.segments.length);
        System.arraycopy(nextPath.segments, start, newPath, this.segments.length, nextPath.segments.length - start);
        return new VersionablePath(newPath, nextPath.getSiloedItemId(), this.isAbsolute(), this.isResolved());
    }
    
    public VersionablePathSegment segment(final int idx) {
        return this.segments[idx];
    }
    
    public IPath toPath() {
        final String pathString = this.computePathString();
        if (this.isResolved()) {
            return (IPath)new Path(pathString);
        }
        final String unresolvedString = "unresolved/" + this.getRoot().getItemUUID().getUuidValue();
        if (pathString.equals("")) {
            return (IPath)new Path(unresolvedString);
        }
        return (IPath)new Path(String.valueOf(unresolvedString) + "/" + pathString);
    }
    
    @Override
    public String toString() {
        final String pathString = this.computePathString();
        if (this.isResolved()) {
            return pathString;
        }
        if (pathString.equals("")) {
            return VersionablePath.UNRESOLVED_PATH;
        }
        return String.valueOf(VersionablePath.UNRESOLVED_PATH) + "/" + pathString;
    }
    
    private String computePathString() {
        final StringBuffer buf = new StringBuffer();
        boolean isFirst = true;
        for (int idx = 0; idx < this.segments.length; ++idx) {
            if (isFirst) {
                isFirst = false;
            }
            else {
                buf.append("/");
            }
            buf.append(this.segments[idx].getName());
        }
        return buf.toString();
    }
    
    public static VersionablePath create(final IAncestorReport nextReport, final ItemId<IComponent> component) {
        final List<VersionablePathSegment> pathSegments = new ArrayList<VersionablePathSegment>();
        final List<INameItemPair> nameItemPairs = (List<INameItemPair>)nextReport.getNameItemPairs();
        ItemId<IVersionable> parent = (ItemId<IVersionable>)ItemId.getNullItem(IFolder.ITEM_TYPE);
        boolean isFirst = true;
        for (final INameItemPair next : nameItemPairs) {
            if (isFirst) {
                isFirst = false;
            }
            else {
                final ItemId<IVersionable> itemId = (ItemId<IVersionable>)ItemId.create((IItemHandle)next.getItem());
                pathSegments.add(VersionablePathSegment.create((ItemId<IFolder>)parent, itemId, next.getName()));
                parent = (ItemId<IVersionable>)ItemId.create((IItemHandle)next.getItem());
            }
        }
        return create(pathSegments, (SiloedItemId<IVersionable>)SiloedItemId.create((ItemId)parent, (ItemId)component), !nameItemPairs.isEmpty(), !nameItemPairs.isEmpty());
    }
    
    public VersionablePath append(final String filename, final SiloedItemId<IVersionable> itemId) {
        final VersionablePathSegment newSegment = VersionablePathSegment.create((ItemId<IFolder>)this.item.getItemId(), (ItemId<IVersionable>)itemId.getItemId(), filename);
        return this.appendSegment(newSegment, itemId);
    }
    
    public VersionablePath append(final String filename, final ItemId<IVersionable> itemId) {
        final VersionablePathSegment newSegment = VersionablePathSegment.create((ItemId<IFolder>)this.item.getItemId(), itemId, filename);
        return this.appendSegment(newSegment, (SiloedItemId<IVersionable>)SiloedItemId.create((ItemId)itemId, this.item.getComponent()));
    }
    
    private VersionablePath appendSegment(final VersionablePathSegment segment, final SiloedItemId<IVersionable> itemId) {
        final int newLength = this.segments.length + 1;
        final VersionablePathSegment[] segments = new VersionablePathSegment[newLength];
        System.arraycopy(this.segments, 0, segments, 0, this.segments.length);
        segments[newLength - 1] = segment;
        return new VersionablePath(segments, itemId, this.isAbsolute(), this.isResolved());
    }
    
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.absolute ? 1231 : 1237);
        result = 31 * result + ((this.item == null) ? 0 : this.item.hashCode());
        result = 31 * result + Arrays.hashCode(this.segments);
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
        final VersionablePath other = (VersionablePath)obj;
        if (this.absolute != other.absolute) {
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
        return Arrays.equals(this.segments, other.segments);
    }
    
    public VersionablePath removeLastSegment() {
        if (this.segments.length == 0) {
            final SiloedItemId id = SiloedItemId.create(this.getItemId().getItemType(), ItemId.getNullItemUUID(), this.getSiloedItemId().getComponentUUID());
            return new VersionablePath(this.segments, (SiloedItemId<IVersionable>)id, this.isAbsolute(), this.isResolved());
        }
        final int newLength = this.segments.length - 1;
        final VersionablePathSegment[] segments = new VersionablePathSegment[newLength];
        System.arraycopy(this.segments, 0, segments, 0, newLength);
        final ItemId<IVersionable> parentId = (ItemId<IVersionable>)ItemId.upcast((ItemId)this.segments[newLength].getParent());
        final SiloedItemId<IVersionable> item = (SiloedItemId<IVersionable>)SiloedItemId.create((ItemId)parentId, this.item.getComponent());
        return new VersionablePath(segments, item, this.isAbsolute(), this.isResolved());
    }
    
    public static VersionablePath getNullPath() {
        if (VersionablePath.nullPath == null) {
            final SiloedItemId id = SiloedItemId.getNullItem(ItemId.getNullItemType());
            VersionablePath.nullPath = new VersionablePath(new VersionablePathSegment[0], (SiloedItemId<IVersionable>)id, false, false);
        }
        return VersionablePath.nullPath;
    }
    
    public static VersionablePath getUnresolvedPath(final IVersionable versionable, final ItemId<IComponent> component) {
        return new VersionablePath(new VersionablePathSegment[] { VersionablePathSegment.pathFor(versionable) }, (SiloedItemId<IVersionable>)SiloedItemId.create(ItemId.forItem((IItem)versionable), (ItemId)component), false, false);
    }
    
    public static VersionablePath getUnresolvedPath(final SiloedItemId itemId) {
        return new VersionablePath(new VersionablePathSegment[0], (SiloedItemId<IVersionable>)itemId, false, false);
    }
    
    public static VersionablePath getUnresolvedPath(final ItemId<IVersionable> itemId) {
        return getUnresolvedPath(itemId, (ItemId<IComponent>)ItemId.getNullItem(IComponent.ITEM_TYPE));
    }
    
    public static VersionablePath getUnresolvedPath(final ItemId<IVersionable> itemId, final ItemId<IComponent> component) {
        return new VersionablePath(new VersionablePathSegment[0], (SiloedItemId<IVersionable>)SiloedItemId.create((ItemId)itemId, (ItemId)component), false, false);
    }
    
    public String getFileName() {
        if (this.segments.length > 0) {
            return this.segments[this.segments.length - 1].getName();
        }
        return this.item.getItemUUID().getUuidValue();
    }
    
    public String[] getStringSegments() {
        final String[] result = new String[this.segments.length];
        for (int i = 0; i < this.segments.length; ++i) {
            result[i] = this.segments[i].getName();
        }
        return result;
    }
}
