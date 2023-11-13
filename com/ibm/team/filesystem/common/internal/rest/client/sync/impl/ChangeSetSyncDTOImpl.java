// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OslcLinkDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeFolderSyncDTO;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.WorkItemSyncDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeSetSourceDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeSetSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ChangeSetSyncDTOImpl extends EObjectImpl implements ChangeSetSyncDTO
{
    protected int ALL_FLAGS;
    protected static final String AUTHOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
    protected String authorContributorItemId;
    protected static final int AUTHOR_CONTRIBUTOR_ITEM_ID_ESETFLAG = 1;
    protected static final String AUTHOR_CONTRIBUTOR_NAME_EDEFAULT;
    protected String authorContributorName;
    protected static final int AUTHOR_CONTRIBUTOR_NAME_ESETFLAG = 2;
    protected static final String CHANGE_SET_COMMENT_EDEFAULT;
    protected String changeSetComment;
    protected static final int CHANGE_SET_COMMENT_ESETFLAG = 4;
    protected static final String CHANGE_SET_ITEM_ID_EDEFAULT = "";
    protected String changeSetItemId;
    protected static final int CHANGE_SET_ITEM_ID_ESETFLAG = 8;
    protected EList changes;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 16;
    protected static final String COMPONENT_NAME_EDEFAULT;
    protected String componentName;
    protected static final int COMPONENT_NAME_ESETFLAG = 32;
    protected static final int HIDDEN_CHANGES_EDEFAULT = 0;
    protected int hiddenChanges;
    protected static final int HIDDEN_CHANGES_ESETFLAG = 64;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 128;
    protected static final int INACCESSIBLE_CHANGES_EDEFAULT = 0;
    protected int inaccessibleChanges;
    protected static final int INACCESSIBLE_CHANGES_ESETFLAG = 256;
    protected static final boolean IS_ACTIVE_EDEFAULT = false;
    protected static final int IS_ACTIVE_EFLAG = 512;
    protected static final int IS_ACTIVE_ESETFLAG = 1024;
    protected static final long LAST_CHANGE_DATE_EDEFAULT = 0L;
    protected long lastChangeDate;
    protected static final int LAST_CHANGE_DATE_ESETFLAG = 2048;
    protected static final String LAST_CHANGE_FORMATTED_DATE_EDEFAULT;
    protected String lastChangeFormattedDate;
    protected static final int LAST_CHANGE_FORMATTED_DATE_ESETFLAG = 4096;
    protected EList oslcLinks;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 8192;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryUrl;
    protected static final int REPOSITORY_URL_ESETFLAG = 16384;
    protected EList workItems;
    protected ChangeSetSourceDTO source;
    protected static final int SOURCE_ESETFLAG = 32768;
    protected ChangeSetSourceDTO originalSource;
    protected static final int ORIGINAL_SOURCE_ESETFLAG = 65536;
    protected static final boolean LINKED_TO_CHANGE_SET_IN_OTHER_DIRECTION_EDEFAULT = false;
    protected static final int LINKED_TO_CHANGE_SET_IN_OTHER_DIRECTION_EFLAG = 131072;
    protected static final int LINKED_TO_CHANGE_SET_IN_OTHER_DIRECTION_ESETFLAG = 262144;
    
    static {
        AUTHOR_CONTRIBUTOR_ITEM_ID_EDEFAULT = null;
        AUTHOR_CONTRIBUTOR_NAME_EDEFAULT = null;
        CHANGE_SET_COMMENT_EDEFAULT = null;
        COMPONENT_ITEM_ID_EDEFAULT = null;
        COMPONENT_NAME_EDEFAULT = null;
        LAST_CHANGE_FORMATTED_DATE_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
    }
    
    protected ChangeSetSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.authorContributorItemId = ChangeSetSyncDTOImpl.AUTHOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.authorContributorName = ChangeSetSyncDTOImpl.AUTHOR_CONTRIBUTOR_NAME_EDEFAULT;
        this.changeSetComment = ChangeSetSyncDTOImpl.CHANGE_SET_COMMENT_EDEFAULT;
        this.changeSetItemId = "";
        this.componentItemId = ChangeSetSyncDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.componentName = ChangeSetSyncDTOImpl.COMPONENT_NAME_EDEFAULT;
        this.hiddenChanges = 0;
        this.id = 0;
        this.inaccessibleChanges = 0;
        this.lastChangeDate = 0L;
        this.lastChangeFormattedDate = ChangeSetSyncDTOImpl.LAST_CHANGE_FORMATTED_DATE_EDEFAULT;
        this.repositoryId = ChangeSetSyncDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryUrl = ChangeSetSyncDTOImpl.REPOSITORY_URL_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.CHANGE_SET_SYNC_DTO;
    }
    
    public String getChangeSetComment() {
        return this.changeSetComment;
    }
    
    public void setChangeSetComment(final String newChangeSetComment) {
        final String oldChangeSetComment = this.changeSetComment;
        this.changeSetComment = newChangeSetComment;
        final boolean oldChangeSetCommentESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldChangeSetComment, (Object)this.changeSetComment, !oldChangeSetCommentESet));
        }
    }
    
    public void unsetChangeSetComment() {
        final String oldChangeSetComment = this.changeSetComment;
        final boolean oldChangeSetCommentESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.changeSetComment = ChangeSetSyncDTOImpl.CHANGE_SET_COMMENT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldChangeSetComment, (Object)ChangeSetSyncDTOImpl.CHANGE_SET_COMMENT_EDEFAULT, oldChangeSetCommentESet));
        }
    }
    
    public boolean isSetChangeSetComment() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getChangeSetItemId() {
        return this.changeSetItemId;
    }
    
    public void setChangeSetItemId(final String newChangeSetItemId) {
        final String oldChangeSetItemId = this.changeSetItemId;
        this.changeSetItemId = newChangeSetItemId;
        final boolean oldChangeSetItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldChangeSetItemId, (Object)this.changeSetItemId, !oldChangeSetItemIdESet));
        }
    }
    
    public void unsetChangeSetItemId() {
        final String oldChangeSetItemId = this.changeSetItemId;
        final boolean oldChangeSetItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.changeSetItemId = "";
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldChangeSetItemId, (Object)"", oldChangeSetItemIdESet));
        }
    }
    
    public boolean isSetChangeSetItemId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public List getWorkItems() {
        if (this.workItems == null) {
            this.workItems = (EList)new EObjectContainmentEList.Unsettable((Class)WorkItemSyncDTO.class, (InternalEObject)this, 16);
        }
        return (List)this.workItems;
    }
    
    public void unsetWorkItems() {
        if (this.workItems != null) {
            ((InternalEList.Unsettable)this.workItems).unset();
        }
    }
    
    public boolean isSetWorkItems() {
        return this.workItems != null && ((InternalEList.Unsettable)this.workItems).isSet();
    }
    
    public ChangeSetSourceDTO getSource() {
        return this.source;
    }
    
    public NotificationChain basicSetSource(final ChangeSetSourceDTO newSource, NotificationChain msgs) {
        final ChangeSetSourceDTO oldSource = this.source;
        this.source = newSource;
        final boolean oldSourceESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS |= 0x8000;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 17, (Object)oldSource, (Object)newSource, !oldSourceESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setSource(final ChangeSetSourceDTO newSource) {
        if (newSource != this.source) {
            NotificationChain msgs = null;
            if (this.source != null) {
                msgs = ((InternalEObject)this.source).eInverseRemove((InternalEObject)this, -18, (Class)null, msgs);
            }
            if (newSource != null) {
                msgs = ((InternalEObject)newSource).eInverseAdd((InternalEObject)this, -18, (Class)null, msgs);
            }
            msgs = this.basicSetSource(newSource, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSourceESet = (this.ALL_FLAGS & 0x8000) != 0x0;
            this.ALL_FLAGS |= 0x8000;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 17, (Object)newSource, (Object)newSource, !oldSourceESet));
            }
        }
    }
    
    public NotificationChain basicUnsetSource(NotificationChain msgs) {
        final ChangeSetSourceDTO oldSource = this.source;
        this.source = null;
        final boolean oldSourceESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS &= 0xFFFF7FFF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 17, (Object)oldSource, (Object)null, oldSourceESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetSource() {
        if (this.source != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.source).eInverseRemove((InternalEObject)this, -18, (Class)null, msgs);
            msgs = this.basicUnsetSource(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSourceESet = (this.ALL_FLAGS & 0x8000) != 0x0;
            this.ALL_FLAGS &= 0xFFFF7FFF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 17, (Object)null, (Object)null, oldSourceESet));
            }
        }
    }
    
    public boolean isSetSource() {
        return (this.ALL_FLAGS & 0x8000) != 0x0;
    }
    
    public ChangeSetSourceDTO getOriginalSource() {
        return this.originalSource;
    }
    
    public NotificationChain basicSetOriginalSource(final ChangeSetSourceDTO newOriginalSource, NotificationChain msgs) {
        final ChangeSetSourceDTO oldOriginalSource = this.originalSource;
        this.originalSource = newOriginalSource;
        final boolean oldOriginalSourceESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.ALL_FLAGS |= 0x10000;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 18, (Object)oldOriginalSource, (Object)newOriginalSource, !oldOriginalSourceESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setOriginalSource(final ChangeSetSourceDTO newOriginalSource) {
        if (newOriginalSource != this.originalSource) {
            NotificationChain msgs = null;
            if (this.originalSource != null) {
                msgs = ((InternalEObject)this.originalSource).eInverseRemove((InternalEObject)this, -19, (Class)null, msgs);
            }
            if (newOriginalSource != null) {
                msgs = ((InternalEObject)newOriginalSource).eInverseAdd((InternalEObject)this, -19, (Class)null, msgs);
            }
            msgs = this.basicSetOriginalSource(newOriginalSource, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldOriginalSourceESet = (this.ALL_FLAGS & 0x10000) != 0x0;
            this.ALL_FLAGS |= 0x10000;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 18, (Object)newOriginalSource, (Object)newOriginalSource, !oldOriginalSourceESet));
            }
        }
    }
    
    public NotificationChain basicUnsetOriginalSource(NotificationChain msgs) {
        final ChangeSetSourceDTO oldOriginalSource = this.originalSource;
        this.originalSource = null;
        final boolean oldOriginalSourceESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.ALL_FLAGS &= 0xFFFEFFFF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 18, (Object)oldOriginalSource, (Object)null, oldOriginalSourceESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetOriginalSource() {
        if (this.originalSource != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.originalSource).eInverseRemove((InternalEObject)this, -19, (Class)null, msgs);
            msgs = this.basicUnsetOriginalSource(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldOriginalSourceESet = (this.ALL_FLAGS & 0x10000) != 0x0;
            this.ALL_FLAGS &= 0xFFFEFFFF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 18, (Object)null, (Object)null, oldOriginalSourceESet));
            }
        }
    }
    
    public boolean isSetOriginalSource() {
        return (this.ALL_FLAGS & 0x10000) != 0x0;
    }
    
    public boolean isLinkedToChangeSetInOtherDirection() {
        return (this.ALL_FLAGS & 0x20000) != 0x0;
    }
    
    public void setLinkedToChangeSetInOtherDirection(final boolean newLinkedToChangeSetInOtherDirection) {
        final boolean oldLinkedToChangeSetInOtherDirection = (this.ALL_FLAGS & 0x20000) != 0x0;
        if (newLinkedToChangeSetInOtherDirection) {
            this.ALL_FLAGS |= 0x20000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFDFFFF;
        }
        final boolean oldLinkedToChangeSetInOtherDirectionESet = (this.ALL_FLAGS & 0x40000) != 0x0;
        this.ALL_FLAGS |= 0x40000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 19, oldLinkedToChangeSetInOtherDirection, newLinkedToChangeSetInOtherDirection, !oldLinkedToChangeSetInOtherDirectionESet));
        }
    }
    
    public void unsetLinkedToChangeSetInOtherDirection() {
        final boolean oldLinkedToChangeSetInOtherDirection = (this.ALL_FLAGS & 0x20000) != 0x0;
        final boolean oldLinkedToChangeSetInOtherDirectionESet = (this.ALL_FLAGS & 0x40000) != 0x0;
        this.ALL_FLAGS &= 0xFFFDFFFF;
        this.ALL_FLAGS &= 0xFFFBFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 19, oldLinkedToChangeSetInOtherDirection, false, oldLinkedToChangeSetInOtherDirectionESet));
        }
    }
    
    public boolean isSetLinkedToChangeSetInOtherDirection() {
        return (this.ALL_FLAGS & 0x40000) != 0x0;
    }
    
    public List getChanges() {
        if (this.changes == null) {
            this.changes = (EList)new EObjectContainmentEList.Unsettable((Class)ChangeFolderSyncDTO.class, (InternalEObject)this, 4);
        }
        return (List)this.changes;
    }
    
    public void unsetChanges() {
        if (this.changes != null) {
            ((InternalEList.Unsettable)this.changes).unset();
        }
    }
    
    public boolean isSetChanges() {
        return this.changes != null && ((InternalEList.Unsettable)this.changes).isSet();
    }
    
    public int getHiddenChanges() {
        return this.hiddenChanges;
    }
    
    public void setHiddenChanges(final int newHiddenChanges) {
        final int oldHiddenChanges = this.hiddenChanges;
        this.hiddenChanges = newHiddenChanges;
        final boolean oldHiddenChangesESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, oldHiddenChanges, this.hiddenChanges, !oldHiddenChangesESet));
        }
    }
    
    public void unsetHiddenChanges() {
        final int oldHiddenChanges = this.hiddenChanges;
        final boolean oldHiddenChangesESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.hiddenChanges = 0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, oldHiddenChanges, 0, oldHiddenChangesESet));
        }
    }
    
    public boolean isSetHiddenChanges() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public int getInaccessibleChanges() {
        return this.inaccessibleChanges;
    }
    
    public void setInaccessibleChanges(final int newInaccessibleChanges) {
        final int oldInaccessibleChanges = this.inaccessibleChanges;
        this.inaccessibleChanges = newInaccessibleChanges;
        final boolean oldInaccessibleChangesESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, oldInaccessibleChanges, this.inaccessibleChanges, !oldInaccessibleChangesESet));
        }
    }
    
    public void unsetInaccessibleChanges() {
        final int oldInaccessibleChanges = this.inaccessibleChanges;
        final boolean oldInaccessibleChangesESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.inaccessibleChanges = 0;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, oldInaccessibleChanges, 0, oldInaccessibleChangesESet));
        }
    }
    
    public boolean isSetInaccessibleChanges() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public boolean isIsActive() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public void setIsActive(final boolean newIsActive) {
        final boolean oldIsActive = (this.ALL_FLAGS & 0x200) != 0x0;
        if (newIsActive) {
            this.ALL_FLAGS |= 0x200;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFDFF;
        }
        final boolean oldIsActiveESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, oldIsActive, newIsActive, !oldIsActiveESet));
        }
    }
    
    public void unsetIsActive() {
        final boolean oldIsActive = (this.ALL_FLAGS & 0x200) != 0x0;
        final boolean oldIsActiveESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, oldIsActive, false, oldIsActiveESet));
        }
    }
    
    public boolean isSetIsActive() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public String getAuthorContributorItemId() {
        return this.authorContributorItemId;
    }
    
    public void setAuthorContributorItemId(final String newAuthorContributorItemId) {
        final String oldAuthorContributorItemId = this.authorContributorItemId;
        this.authorContributorItemId = newAuthorContributorItemId;
        final boolean oldAuthorContributorItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldAuthorContributorItemId, (Object)this.authorContributorItemId, !oldAuthorContributorItemIdESet));
        }
    }
    
    public void unsetAuthorContributorItemId() {
        final String oldAuthorContributorItemId = this.authorContributorItemId;
        final boolean oldAuthorContributorItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.authorContributorItemId = ChangeSetSyncDTOImpl.AUTHOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldAuthorContributorItemId, (Object)ChangeSetSyncDTOImpl.AUTHOR_CONTRIBUTOR_ITEM_ID_EDEFAULT, oldAuthorContributorItemIdESet));
        }
    }
    
    public boolean isSetAuthorContributorItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getLastChangeFormattedDate() {
        return this.lastChangeFormattedDate;
    }
    
    public void setLastChangeFormattedDate(final String newLastChangeFormattedDate) {
        final String oldLastChangeFormattedDate = this.lastChangeFormattedDate;
        this.lastChangeFormattedDate = newLastChangeFormattedDate;
        final boolean oldLastChangeFormattedDateESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 12, (Object)oldLastChangeFormattedDate, (Object)this.lastChangeFormattedDate, !oldLastChangeFormattedDateESet));
        }
    }
    
    public void unsetLastChangeFormattedDate() {
        final String oldLastChangeFormattedDate = this.lastChangeFormattedDate;
        final boolean oldLastChangeFormattedDateESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.lastChangeFormattedDate = ChangeSetSyncDTOImpl.LAST_CHANGE_FORMATTED_DATE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 12, (Object)oldLastChangeFormattedDate, (Object)ChangeSetSyncDTOImpl.LAST_CHANGE_FORMATTED_DATE_EDEFAULT, oldLastChangeFormattedDateESet));
        }
    }
    
    public boolean isSetLastChangeFormattedDate() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public long getLastChangeDate() {
        return this.lastChangeDate;
    }
    
    public void setLastChangeDate(final long newLastChangeDate) {
        final long oldLastChangeDate = this.lastChangeDate;
        this.lastChangeDate = newLastChangeDate;
        final boolean oldLastChangeDateESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, oldLastChangeDate, this.lastChangeDate, !oldLastChangeDateESet));
        }
    }
    
    public void unsetLastChangeDate() {
        final long oldLastChangeDate = this.lastChangeDate;
        final boolean oldLastChangeDateESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.lastChangeDate = 0L;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, oldLastChangeDate, 0L, oldLastChangeDateESet));
        }
    }
    
    public boolean isSetLastChangeDate() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    public String getAuthorContributorName() {
        return this.authorContributorName;
    }
    
    public void setAuthorContributorName(final String newAuthorContributorName) {
        final String oldAuthorContributorName = this.authorContributorName;
        this.authorContributorName = newAuthorContributorName;
        final boolean oldAuthorContributorNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldAuthorContributorName, (Object)this.authorContributorName, !oldAuthorContributorNameESet));
        }
    }
    
    public void unsetAuthorContributorName() {
        final String oldAuthorContributorName = this.authorContributorName;
        final boolean oldAuthorContributorNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.authorContributorName = ChangeSetSyncDTOImpl.AUTHOR_CONTRIBUTOR_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldAuthorContributorName, (Object)ChangeSetSyncDTOImpl.AUTHOR_CONTRIBUTOR_NAME_EDEFAULT, oldAuthorContributorNameESet));
        }
    }
    
    public boolean isSetAuthorContributorName() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getComponentItemId() {
        return this.componentItemId;
    }
    
    public void setComponentItemId(final String newComponentItemId) {
        final String oldComponentItemId = this.componentItemId;
        this.componentItemId = newComponentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.componentItemId = ChangeSetSyncDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldComponentItemId, (Object)ChangeSetSyncDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getComponentName() {
        return this.componentName;
    }
    
    public void setComponentName(final String newComponentName) {
        final String oldComponentName = this.componentName;
        this.componentName = newComponentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldComponentName, (Object)this.componentName, !oldComponentNameESet));
        }
    }
    
    public void unsetComponentName() {
        final String oldComponentName = this.componentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.componentName = ChangeSetSyncDTOImpl.COMPONENT_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldComponentName, (Object)ChangeSetSyncDTOImpl.COMPONENT_NAME_EDEFAULT, oldComponentNameESet));
        }
    }
    
    public boolean isSetComponentName() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    
    public void setRepositoryUrl(final String newRepositoryUrl) {
        final String oldRepositoryUrl = this.repositoryUrl;
        this.repositoryUrl = newRepositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS |= 0x4000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 15, (Object)oldRepositoryUrl, (Object)this.repositoryUrl, !oldRepositoryUrlESet));
        }
    }
    
    public void unsetRepositoryUrl() {
        final String oldRepositoryUrl = this.repositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.repositoryUrl = ChangeSetSyncDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 15, (Object)oldRepositoryUrl, (Object)ChangeSetSyncDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryUrlESet));
        }
    }
    
    public boolean isSetRepositoryUrl() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int newId) {
        final int oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public List getOslcLinks() {
        if (this.oslcLinks == null) {
            this.oslcLinks = (EList)new EObjectContainmentEList.Unsettable((Class)OslcLinkDTO.class, (InternalEObject)this, 13);
        }
        return (List)this.oslcLinks;
    }
    
    public void unsetOslcLinks() {
        if (this.oslcLinks != null) {
            ((InternalEList.Unsettable)this.oslcLinks).unset();
        }
    }
    
    public boolean isSetOslcLinks() {
        return this.oslcLinks != null && ((InternalEList.Unsettable)this.oslcLinks).isSet();
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 14, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.repositoryId = ChangeSetSyncDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 14, (Object)oldRepositoryId, (Object)ChangeSetSyncDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 4: {
                return ((InternalEList)this.getChanges()).basicRemove((Object)otherEnd, msgs);
            }
            case 13: {
                return ((InternalEList)this.getOslcLinks()).basicRemove((Object)otherEnd, msgs);
            }
            case 16: {
                return ((InternalEList)this.getWorkItems()).basicRemove((Object)otherEnd, msgs);
            }
            case 17: {
                return this.basicUnsetSource(msgs);
            }
            case 18: {
                return this.basicUnsetOriginalSource(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getAuthorContributorItemId();
            }
            case 1: {
                return this.getAuthorContributorName();
            }
            case 2: {
                return this.getChangeSetComment();
            }
            case 3: {
                return this.getChangeSetItemId();
            }
            case 4: {
                return this.getChanges();
            }
            case 5: {
                return this.getComponentItemId();
            }
            case 6: {
                return this.getComponentName();
            }
            case 7: {
                return new Integer(this.getHiddenChanges());
            }
            case 8: {
                return new Integer(this.getId());
            }
            case 9: {
                return new Integer(this.getInaccessibleChanges());
            }
            case 10: {
                return this.isIsActive() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 11: {
                return new Long(this.getLastChangeDate());
            }
            case 12: {
                return this.getLastChangeFormattedDate();
            }
            case 13: {
                return this.getOslcLinks();
            }
            case 14: {
                return this.getRepositoryId();
            }
            case 15: {
                return this.getRepositoryUrl();
            }
            case 16: {
                return this.getWorkItems();
            }
            case 17: {
                return this.getSource();
            }
            case 18: {
                return this.getOriginalSource();
            }
            case 19: {
                return this.isLinkedToChangeSetInOtherDirection() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setAuthorContributorItemId((String)newValue);
            }
            case 1: {
                this.setAuthorContributorName((String)newValue);
            }
            case 2: {
                this.setChangeSetComment((String)newValue);
            }
            case 3: {
                this.setChangeSetItemId((String)newValue);
            }
            case 4: {
                this.getChanges().clear();
                this.getChanges().addAll((Collection)newValue);
            }
            case 5: {
                this.setComponentItemId((String)newValue);
            }
            case 6: {
                this.setComponentName((String)newValue);
            }
            case 7: {
                this.setHiddenChanges((int)newValue);
            }
            case 8: {
                this.setId((int)newValue);
            }
            case 9: {
                this.setInaccessibleChanges((int)newValue);
            }
            case 10: {
                this.setIsActive((boolean)newValue);
            }
            case 11: {
                this.setLastChangeDate((long)newValue);
            }
            case 12: {
                this.setLastChangeFormattedDate((String)newValue);
            }
            case 13: {
                this.getOslcLinks().clear();
                this.getOslcLinks().addAll((Collection)newValue);
            }
            case 14: {
                this.setRepositoryId((String)newValue);
            }
            case 15: {
                this.setRepositoryUrl((String)newValue);
            }
            case 16: {
                this.getWorkItems().clear();
                this.getWorkItems().addAll((Collection)newValue);
            }
            case 17: {
                this.setSource((ChangeSetSourceDTO)newValue);
            }
            case 18: {
                this.setOriginalSource((ChangeSetSourceDTO)newValue);
            }
            case 19: {
                this.setLinkedToChangeSetInOtherDirection((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetAuthorContributorItemId();
            }
            case 1: {
                this.unsetAuthorContributorName();
            }
            case 2: {
                this.unsetChangeSetComment();
            }
            case 3: {
                this.unsetChangeSetItemId();
            }
            case 4: {
                this.unsetChanges();
            }
            case 5: {
                this.unsetComponentItemId();
            }
            case 6: {
                this.unsetComponentName();
            }
            case 7: {
                this.unsetHiddenChanges();
            }
            case 8: {
                this.unsetId();
            }
            case 9: {
                this.unsetInaccessibleChanges();
            }
            case 10: {
                this.unsetIsActive();
            }
            case 11: {
                this.unsetLastChangeDate();
            }
            case 12: {
                this.unsetLastChangeFormattedDate();
            }
            case 13: {
                this.unsetOslcLinks();
            }
            case 14: {
                this.unsetRepositoryId();
            }
            case 15: {
                this.unsetRepositoryUrl();
            }
            case 16: {
                this.unsetWorkItems();
            }
            case 17: {
                this.unsetSource();
            }
            case 18: {
                this.unsetOriginalSource();
            }
            case 19: {
                this.unsetLinkedToChangeSetInOtherDirection();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetAuthorContributorItemId();
            }
            case 1: {
                return this.isSetAuthorContributorName();
            }
            case 2: {
                return this.isSetChangeSetComment();
            }
            case 3: {
                return this.isSetChangeSetItemId();
            }
            case 4: {
                return this.isSetChanges();
            }
            case 5: {
                return this.isSetComponentItemId();
            }
            case 6: {
                return this.isSetComponentName();
            }
            case 7: {
                return this.isSetHiddenChanges();
            }
            case 8: {
                return this.isSetId();
            }
            case 9: {
                return this.isSetInaccessibleChanges();
            }
            case 10: {
                return this.isSetIsActive();
            }
            case 11: {
                return this.isSetLastChangeDate();
            }
            case 12: {
                return this.isSetLastChangeFormattedDate();
            }
            case 13: {
                return this.isSetOslcLinks();
            }
            case 14: {
                return this.isSetRepositoryId();
            }
            case 15: {
                return this.isSetRepositoryUrl();
            }
            case 16: {
                return this.isSetWorkItems();
            }
            case 17: {
                return this.isSetSource();
            }
            case 18: {
                return this.isSetOriginalSource();
            }
            case 19: {
                return this.isSetLinkedToChangeSetInOtherDirection();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (authorContributorItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.authorContributorItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", authorContributorName: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.authorContributorName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", changeSetComment: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.changeSetComment);
        }
        else {
            result.append("<unset>");
        }
        result.append(", changeSetItemId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.changeSetItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentItemId: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.componentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentName: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.componentName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", hiddenChanges: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.hiddenChanges);
        }
        else {
            result.append("<unset>");
        }
        result.append(", id: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", inaccessibleChanges: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.inaccessibleChanges);
        }
        else {
            result.append("<unset>");
        }
        result.append(", isActive: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append((this.ALL_FLAGS & 0x200) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", lastChangeDate: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append(this.lastChangeDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(", lastChangeFormattedDate: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append(this.lastChangeFormattedDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x2000) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryUrl: ");
        if ((this.ALL_FLAGS & 0x4000) != 0x0) {
            result.append(this.repositoryUrl);
        }
        else {
            result.append("<unset>");
        }
        result.append(", linkedToChangeSetInOtherDirection: ");
        if ((this.ALL_FLAGS & 0x40000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x20000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
