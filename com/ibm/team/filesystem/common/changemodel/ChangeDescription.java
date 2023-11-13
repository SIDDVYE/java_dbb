// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.changemodel;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import com.ibm.team.scm.common.internal.util.NewCollection;
import com.ibm.team.repository.common.util.NLS;
import com.ibm.team.filesystem.common.internal.Messages;
import java.util.HashSet;
import java.util.Collections;
import com.ibm.team.repository.common.IContributor;
import com.ibm.team.scm.common.IChangeSet;
import java.util.Date;
import com.ibm.team.scm.common.IComponent;
import com.ibm.team.repository.common.IAuditable;
import com.ibm.team.scm.common.internal.util.ItemId;
import java.util.Collection;

public final class ChangeDescription
{
    private String comment;
    private Collection<ItemId<IAuditable>> workItems;
    private ItemId<IComponent> component;
    private Date date;
    private Collection<ItemId<IChangeSet>> changeSets;
    private Collection<ItemId<IContributor>> authors;
    private ItemId<IChangeSet> portSource;
    private ItemId<IChangeSet> originalPortSource;
    
    public ChangeDescription() {
        this("", Collections.EMPTY_LIST, (ItemId<IComponent>)ItemId.getNullItem(IComponent.ITEM_TYPE), Collections.EMPTY_LIST, new Date(), (Collection<ItemId<IContributor>>)Collections.emptyList());
    }
    
    public ChangeDescription(final String comment, final Collection<ItemId<IAuditable>> workItems, final ItemId<IComponent> component, final Collection<ItemId<IChangeSet>> changeSets, final Date date) {
        this(comment, workItems, component, changeSets, date, (Collection<ItemId<IContributor>>)Collections.emptyList());
    }
    
    public ChangeDescription(final String comment, final Collection<ItemId<IAuditable>> workItems, final ItemId<IComponent> component, final Collection<ItemId<IChangeSet>> changeSets, final Date date, final Collection<ItemId<IContributor>> authors) {
        this.comment = comment;
        (this.workItems = new HashSet<ItemId<IAuditable>>()).addAll(workItems);
        this.component = component;
        this.date = date;
        (this.changeSets = new HashSet<ItemId<IChangeSet>>()).addAll(changeSets);
        this.authors = authors;
    }
    
    public ChangeDescription withComment(final String newComment) {
        final ChangeDescription result = this.copy();
        result.comment = newComment;
        return result;
    }
    
    public ChangeDescription copy() {
        final ChangeDescription changeDescription = new ChangeDescription(this.comment, this.workItems, this.component, this.changeSets, this.date, this.authors);
        if (this.portSource != null) {
            changeDescription.setPortData(this.portSource, this.originalPortSource);
        }
        return changeDescription;
    }
    
    public String getComment() {
        return this.comment;
    }
    
    public Collection<ItemId<IAuditable>> getWorkItems() {
        return this.workItems;
    }
    
    public ItemId<IComponent> getComponent() {
        return this.component;
    }
    
    public Date getDate() {
        return this.date;
    }
    
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ((this.changeSets == null) ? 0 : this.changeSets.hashCode());
        result = 31 * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = 31 * result + ((this.component == null) ? 0 : this.component.hashCode());
        result = 31 * result + ((this.date == null) ? 0 : this.date.hashCode());
        result = 31 * result + ((this.workItems == null) ? 0 : this.workItems.hashCode());
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
        final ChangeDescription other = (ChangeDescription)obj;
        if (this.changeSets == null) {
            if (other.changeSets != null) {
                return false;
            }
        }
        else if (!this.changeSets.equals(other.changeSets)) {
            return false;
        }
        if (this.comment == null) {
            if (other.comment != null) {
                return false;
            }
        }
        else if (!this.comment.equals(other.comment)) {
            return false;
        }
        if (this.component == null) {
            if (other.component != null) {
                return false;
            }
        }
        else if (!this.component.equals((Object)other.component)) {
            return false;
        }
        if (this.date == null) {
            if (other.date != null) {
                return false;
            }
        }
        else if (!this.date.equals(other.date)) {
            return false;
        }
        if (this.workItems == null) {
            if (other.workItems != null) {
                return false;
            }
        }
        else if (!this.workItems.equals(other.workItems)) {
            return false;
        }
        return true;
    }
    
    public ChangeDescription reverse() {
        final String text = this.getComment();
        String newText;
        if (text.equals("")) {
            newText = NLS.bind(Messages.getString("ChangeDescription.0"), (Object)this.getDate(), new Object[0]);
        }
        else {
            newText = NLS.bind(Messages.getString("ChangeDescription.1"), (Object)text, new Object[0]);
        }
        return new ChangeDescription(newText, this.getWorkItems(), this.getComponent(), Collections.EMPTY_LIST, this.getDate(), this.authors);
    }
    
    public Collection<ItemId<IChangeSet>> getChangeSets() {
        return this.changeSets;
    }
    
    public ChangeDescription merge(final ChangeDescription description) {
        final Date resultingDate = (this.getDate().compareTo(description.getDate()) > 0) ? this.getDate() : description.getDate();
        final String comment = this.getComment().equals("") ? description.getComment() : this.getComment();
        final ItemId<IComponent> component = (ItemId<IComponent>)(this.component.equals((Object)description.getComponent()) ? this.component : ItemId.getNullItem(IComponent.ITEM_TYPE));
        final Set<ItemId<IChangeSet>> changeSets = (Set<ItemId<IChangeSet>>)NewCollection.hashSet();
        changeSets.addAll(this.getChangeSets());
        changeSets.addAll(description.getChangeSets());
        final Set<ItemId<IAuditable>> workItems = (Set<ItemId<IAuditable>>)NewCollection.hashSet();
        workItems.addAll(this.getWorkItems());
        workItems.addAll(description.getWorkItems());
        final List<ItemId<IContributor>> newAuthors = (List<ItemId<IContributor>>)NewCollection.arrayList();
        newAuthors.addAll(this.authors);
        newAuthors.addAll(description.authors);
        return new ChangeDescription(comment, workItems, component, changeSets, resultingDate, newAuthors);
    }
    
    public static ChangeDescription merge(final List<ChangeDescription> orderedDescriptions) {
        ChangeDescription result = new ChangeDescription();
        for (final ChangeDescription next : orderedDescriptions) {
            result = result.merge(next);
        }
        return result;
    }
    
    public Collection<ItemId<IContributor>> getAuthors() {
        return this.authors;
    }
    
    public void setPortData(final ItemId<IChangeSet> portSource, final ItemId<IChangeSet> originalPortSource) {
        this.portSource = portSource;
        this.originalPortSource = originalPortSource;
    }
    
    public ItemId<IChangeSet> getPortSource() {
        return this.portSource;
    }
    
    public ItemId<IChangeSet> getOriginalPortSource() {
        return this.originalPortSource;
    }
}
