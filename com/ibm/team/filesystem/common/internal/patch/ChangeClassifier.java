// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.patch;

import java.util.Iterator;
import com.ibm.team.filesystem.common.ISymbolicLink;
import com.ibm.team.scm.common.IFolder;
import com.ibm.team.scm.common.internal.util.NewCollection;
import com.ibm.team.filesystem.common.changemodel.FileChange;
import java.util.Collection;

public class ChangeClassifier
{
    private final Collection<FileChange> nonText;
    private final Collection<FileChange> textChanges;
    private final Collection<FileChange> folderChanges;
    private final Collection<FileChange> linkChanges;
    private final Collection<FileChange> propertyChanges;
    private final Collection<FileChange> subcomponentChanges;
    
    public ChangeClassifier(final Collection<FileChange> changes) {
        this.nonText = (Collection<FileChange>)NewCollection.arrayList();
        this.textChanges = (Collection<FileChange>)NewCollection.arrayList();
        this.folderChanges = (Collection<FileChange>)NewCollection.arrayList();
        this.linkChanges = (Collection<FileChange>)NewCollection.arrayList();
        this.propertyChanges = (Collection<FileChange>)NewCollection.arrayList();
        this.subcomponentChanges = (Collection<FileChange>)NewCollection.arrayList();
        for (final FileChange change : changes) {
            if (change.getItemId().getItemType() == IFolder.ITEM_TYPE) {
                this.folderChanges.add(change);
            }
            else if (change.getItemId().getItemType() == ISymbolicLink.ITEM_TYPE) {
                this.linkChanges.add(change);
            }
            else if (change.getInitial().isTextType() || change.getFinal().isTextType()) {
                this.textChanges.add(change);
            }
            else if (change.isSubcomponentChange()) {
                this.subcomponentChanges.add(change);
            }
            else {
                this.nonText.add(change);
            }
            if (change.hasPropertyChange()) {
                this.propertyChanges.add(change);
            }
        }
    }
    
    public Collection<FileChange> getNonText() {
        return this.nonText;
    }
    
    public Collection<FileChange> getTextChanges() {
        return this.textChanges;
    }
    
    public Collection<FileChange> getFolderChanges() {
        return this.folderChanges;
    }
    
    public Collection<FileChange> getLinkChanges() {
        return this.linkChanges;
    }
    
    public Collection<FileChange> getPropertyChanges() {
        return this.propertyChanges;
    }
    
    public Collection<FileChange> getSubcomponentChanges() {
        return this.subcomponentChanges;
    }
}
