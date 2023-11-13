// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.util;

import com.ibm.team.filesystem.common.ISymbolicLinkHandle;
import com.ibm.team.filesystem.common.IFileItemHandle;
import com.ibm.team.filesystem.common.internal.Messages;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IWorkspace;
import java.util.Collection;
import com.ibm.team.scm.common.internal.util.ItemLists;
import com.ibm.team.links.common.ILink;
import java.util.List;
import com.ibm.team.scm.common.dto.IChangeSetLinkSummary;
import java.lang.reflect.Field;
import com.ibm.team.repository.common.IItemType;
import com.ibm.team.repository.common.IItem;
import com.ibm.team.scm.common.IBaseline;
import com.ibm.team.repository.common.IContributorHandle;
import com.ibm.team.repository.common.IContributor;
import com.ibm.team.scm.common.IBaselineSet;
import com.ibm.team.scm.common.IComponent;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.IFolderHandle;
import com.ibm.team.repository.common.IItemHandle;
import com.ibm.team.scm.common.IFolder;
import com.ibm.team.scm.common.internal.util.ItemId;
import com.ibm.team.scm.common.IVersionable;

public class ItemUtil
{
    private ItemUtil() {
    }
    
    public static ItemId<IFolder> getParent(final IVersionable versionable) {
        final IFolderHandle folder = versionable.getParent();
        if (folder != null) {
            return (ItemId<IFolder>)new ItemId((IItemHandle)versionable.getParent());
        }
        return (ItemId<IFolder>)ItemId.getNullItem(IFolder.ITEM_TYPE);
    }
    
    public static ItemId<IComponent> getComponent(final IComponentHandle component) {
        if (component == null) {
            return (ItemId<IComponent>)ItemId.getNullItem(IComponent.ITEM_TYPE);
        }
        return (ItemId<IComponent>)new ItemId((IItemHandle)component);
    }
    
    public static boolean containsItem(final ItemId<IFolder> folder, final IVersionable item) {
        return (item.getParent() == null && folder == null) || (item.getParent() != null && item.getParent().getItemId().equals((Object)folder.getItemUUID()));
    }
    
    public static ItemId<IContributor> getCreator(final IBaselineSet snapshot) {
        final IContributorHandle handle = snapshot.getCreator();
        if (handle == null) {
            return (ItemId<IContributor>)ItemId.getNullItem(IContributor.ITEM_TYPE);
        }
        return (ItemId<IContributor>)new ItemId((IItemHandle)handle);
    }
    
    public static ItemId<IContributor> getCreator(final IBaseline baseline) {
        final IContributorHandle handle = baseline.getCreator();
        if (handle == null) {
            return (ItemId<IContributor>)ItemId.getNullItem(IContributor.ITEM_TYPE);
        }
        return (ItemId<IContributor>)new ItemId((IItemHandle)handle);
    }
    
    public static ItemId<IContributor> getContributor(final IContributor contributor) {
        if (contributor == null) {
            return (ItemId<IContributor>)ItemId.getNullItem(IContributor.ITEM_TYPE);
        }
        return (ItemId<IContributor>)ItemId.forItem((IItem)contributor);
    }
    
    public static IItemType getItemTypeForClass(final Class clazz) {
        try {
            final Field field = clazz.getDeclaredField("ITEM_TYPE");
            final IItemType type = (IItemType)field.get(null);
            return type;
        }
        catch (Exception ex) {
            throw new IllegalArgumentException("Unable to determine the item type for class " + clazz.getName());
        }
    }
    
    public static List<ItemId<ILink>> getLinks(final IChangeSetLinkSummary nextSummary) {
        return (List<ItemId<ILink>>)ItemLists.handlesToIds((Collection)nextSummary.getLinks());
    }
    
    public static ItemId getOwner(final IWorkspace workspace) {
        return new ItemId((IItemHandle)workspace.getOwner());
    }
    
    public static ItemId<IComponent> getComponent(final IBaseline baseline) {
        return getComponent(baseline.getComponent());
    }
    
    public static String getVersionableType(final IVersionableHandle versionable, final boolean titleCase) {
        String type = titleCase ? Messages.getString("ItemUtil.RESOURCE_TITLE_CASE") : Messages.getString("ItemUtil.RESOURCE");
        if (versionable instanceof IFileItemHandle) {
            if (titleCase) {
                type = Messages.getString("ItemUtil.FILE_TITLE_CASE");
            }
            else {
                type = Messages.getString("ItemUtil.FILE");
            }
        }
        if (versionable instanceof IFolderHandle) {
            if (titleCase) {
                type = Messages.getString("ItemUtil.FOLDER_TITLE_CASE");
            }
            else {
                type = Messages.getString("ItemUtil.FOLDER");
            }
        }
        if (versionable instanceof ISymbolicLinkHandle) {
            if (titleCase) {
                type = Messages.getString("ItemUtil.SYM_LINK_TITLE_CASE");
            }
            else {
                type = Messages.getString("ItemUtil.SYM_LINK");
            }
        }
        return type;
    }
}
