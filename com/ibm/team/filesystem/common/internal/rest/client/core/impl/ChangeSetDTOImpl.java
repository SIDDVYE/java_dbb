// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ChangeSetDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ChangeSetDTOImpl extends EObjectImpl implements ChangeSetDTO
{
    protected int ALL_FLAGS;
    protected ContributorDTO author;
    protected static final int AUTHOR_ESETFLAG = 1;
    protected static final String COMMENT_EDEFAULT;
    protected String comment;
    protected static final int COMMENT_ESETFLAG = 2;
    protected ComponentDTO component;
    protected static final int COMPONENT_ESETFLAG = 4;
    protected static final String ITEM_ID_EDEFAULT;
    protected String itemId;
    protected static final int ITEM_ID_ESETFLAG = 8;
    protected static final long LAST_CHANGE_DATE_EDEFAULT = 0L;
    protected long lastChangeDate;
    protected static final int LAST_CHANGE_DATE_ESETFLAG = 16;
    
    static {
        COMMENT_EDEFAULT = null;
        ITEM_ID_EDEFAULT = null;
    }
    
    protected ChangeSetDTOImpl() {
        this.ALL_FLAGS = 0;
        this.comment = ChangeSetDTOImpl.COMMENT_EDEFAULT;
        this.itemId = ChangeSetDTOImpl.ITEM_ID_EDEFAULT;
        this.lastChangeDate = 0L;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.CHANGE_SET_DTO;
    }
    
    public String getItemId() {
        return this.itemId;
    }
    
    public void setItemId(final String newItemId) {
        final String oldItemId = this.itemId;
        this.itemId = newItemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldItemId, (Object)this.itemId, !oldItemIdESet));
        }
    }
    
    public void unsetItemId() {
        final String oldItemId = this.itemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.itemId = ChangeSetDTOImpl.ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldItemId, (Object)ChangeSetDTOImpl.ITEM_ID_EDEFAULT, oldItemIdESet));
        }
    }
    
    public boolean isSetItemId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(final String newComment) {
        final String oldComment = this.comment;
        this.comment = newComment;
        final boolean oldCommentESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldComment, (Object)this.comment, !oldCommentESet));
        }
    }
    
    public void unsetComment() {
        final String oldComment = this.comment;
        final boolean oldCommentESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.comment = ChangeSetDTOImpl.COMMENT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldComment, (Object)ChangeSetDTOImpl.COMMENT_EDEFAULT, oldCommentESet));
        }
    }
    
    public boolean isSetComment() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public long getLastChangeDate() {
        return this.lastChangeDate;
    }
    
    public void setLastChangeDate(final long newLastChangeDate) {
        final long oldLastChangeDate = this.lastChangeDate;
        this.lastChangeDate = newLastChangeDate;
        final boolean oldLastChangeDateESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldLastChangeDate, this.lastChangeDate, !oldLastChangeDateESet));
        }
    }
    
    public void unsetLastChangeDate() {
        final long oldLastChangeDate = this.lastChangeDate;
        final boolean oldLastChangeDateESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.lastChangeDate = 0L;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldLastChangeDate, 0L, oldLastChangeDateESet));
        }
    }
    
    public boolean isSetLastChangeDate() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public ComponentDTO getComponent() {
        if (this.component != null && ((EObject)this.component).eIsProxy()) {
            final InternalEObject oldComponent = (InternalEObject)this.component;
            this.component = (ComponentDTO)this.eResolveProxy(oldComponent);
            if (this.component != oldComponent && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 2, (Object)oldComponent, (Object)this.component));
            }
        }
        return this.component;
    }
    
    public ComponentDTO basicGetComponent() {
        return this.component;
    }
    
    public void setComponent(final ComponentDTO newComponent) {
        final ComponentDTO oldComponent = this.component;
        this.component = newComponent;
        final boolean oldComponentESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldComponent, (Object)this.component, !oldComponentESet));
        }
    }
    
    public void unsetComponent() {
        final ComponentDTO oldComponent = this.component;
        final boolean oldComponentESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.component = null;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldComponent, (Object)null, oldComponentESet));
        }
    }
    
    public boolean isSetComponent() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public ContributorDTO getAuthor() {
        if (this.author != null && ((EObject)this.author).eIsProxy()) {
            final InternalEObject oldAuthor = (InternalEObject)this.author;
            this.author = (ContributorDTO)this.eResolveProxy(oldAuthor);
            if (this.author != oldAuthor && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 0, (Object)oldAuthor, (Object)this.author));
            }
        }
        return this.author;
    }
    
    public ContributorDTO basicGetAuthor() {
        return this.author;
    }
    
    public void setAuthor(final ContributorDTO newAuthor) {
        final ContributorDTO oldAuthor = this.author;
        this.author = newAuthor;
        final boolean oldAuthorESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldAuthor, (Object)this.author, !oldAuthorESet));
        }
    }
    
    public void unsetAuthor() {
        final ContributorDTO oldAuthor = this.author;
        final boolean oldAuthorESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.author = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldAuthor, (Object)null, oldAuthorESet));
        }
    }
    
    public boolean isSetAuthor() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                if (resolve) {
                    return this.getAuthor();
                }
                return this.basicGetAuthor();
            }
            case 1: {
                return this.getComment();
            }
            case 2: {
                if (resolve) {
                    return this.getComponent();
                }
                return this.basicGetComponent();
            }
            case 3: {
                return this.getItemId();
            }
            case 4: {
                return new Long(this.getLastChangeDate());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setAuthor((ContributorDTO)newValue);
            }
            case 1: {
                this.setComment((String)newValue);
            }
            case 2: {
                this.setComponent((ComponentDTO)newValue);
            }
            case 3: {
                this.setItemId((String)newValue);
            }
            case 4: {
                this.setLastChangeDate((long)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetAuthor();
            }
            case 1: {
                this.unsetComment();
            }
            case 2: {
                this.unsetComponent();
            }
            case 3: {
                this.unsetItemId();
            }
            case 4: {
                this.unsetLastChangeDate();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetAuthor();
            }
            case 1: {
                return this.isSetComment();
            }
            case 2: {
                return this.isSetComponent();
            }
            case 3: {
                return this.isSetItemId();
            }
            case 4: {
                return this.isSetLastChangeDate();
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
        result.append(" (comment: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.comment);
        }
        else {
            result.append("<unset>");
        }
        result.append(", itemId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.itemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", lastChangeDate: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.lastChangeDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
