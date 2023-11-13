// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineSetDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class BaselineSetDTOImpl extends EObjectImpl implements BaselineSetDTO
{
    protected int ALL_FLAGS;
    protected EList baselineItemIds;
    protected static final String COMMENT_EDEFAULT;
    protected String comment;
    protected static final int COMMENT_ESETFLAG = 1;
    protected static final String CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
    protected String creatorContributorItemId;
    protected static final int CREATOR_CONTRIBUTOR_ITEM_ID_ESETFLAG = 2;
    protected static final long CREATION_DATE_EDEFAULT = 0L;
    protected long creationDate;
    protected static final int CREATION_DATE_ESETFLAG = 4;
    protected static final String ITEM_ID_EDEFAULT;
    protected String itemId;
    protected static final int ITEM_ID_ESETFLAG = 8;
    protected static final long MODIFIED_DATE_EDEFAULT = 0L;
    protected long modifiedDate;
    protected static final int MODIFIED_DATE_ESETFLAG = 16;
    protected static final String MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT;
    protected String modifierContributorItemId;
    protected static final int MODIFIER_CONTRIBUTOR_ITEM_ID_ESETFLAG = 32;
    protected static final String NAME_EDEFAULT;
    protected String name;
    protected static final int NAME_ESETFLAG = 64;
    protected static final String OWNER_WORKSPACE_ITEM_ID_EDEFAULT;
    protected String ownerWorkspaceItemId;
    protected static final int OWNER_WORKSPACE_ITEM_ID_ESETFLAG = 128;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 256;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryURL;
    protected static final int REPOSITORY_URL_ESETFLAG = 512;
    
    static {
        COMMENT_EDEFAULT = null;
        CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT = null;
        ITEM_ID_EDEFAULT = null;
        MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT = null;
        NAME_EDEFAULT = null;
        OWNER_WORKSPACE_ITEM_ID_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
    }
    
    protected BaselineSetDTOImpl() {
        this.ALL_FLAGS = 0;
        this.comment = BaselineSetDTOImpl.COMMENT_EDEFAULT;
        this.creatorContributorItemId = BaselineSetDTOImpl.CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.creationDate = 0L;
        this.itemId = BaselineSetDTOImpl.ITEM_ID_EDEFAULT;
        this.modifiedDate = 0L;
        this.modifierContributorItemId = BaselineSetDTOImpl.MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.name = BaselineSetDTOImpl.NAME_EDEFAULT;
        this.ownerWorkspaceItemId = BaselineSetDTOImpl.OWNER_WORKSPACE_ITEM_ID_EDEFAULT;
        this.repositoryId = BaselineSetDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryURL = BaselineSetDTOImpl.REPOSITORY_URL_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.BASELINE_SET_DTO;
    }
    
    public String getRepositoryURL() {
        return this.repositoryURL;
    }
    
    public void setRepositoryURL(final String newRepositoryURL) {
        final String oldRepositoryURL = this.repositoryURL;
        this.repositoryURL = newRepositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, (Object)oldRepositoryURL, (Object)this.repositoryURL, !oldRepositoryURLESet));
        }
    }
    
    public void unsetRepositoryURL() {
        final String oldRepositoryURL = this.repositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.repositoryURL = BaselineSetDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, (Object)oldRepositoryURL, (Object)BaselineSetDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryURLESet));
        }
    }
    
    public boolean isSetRepositoryURL() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldItemId, (Object)this.itemId, !oldItemIdESet));
        }
    }
    
    public void unsetItemId() {
        final String oldItemId = this.itemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.itemId = BaselineSetDTOImpl.ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldItemId, (Object)BaselineSetDTOImpl.ITEM_ID_EDEFAULT, oldItemIdESet));
        }
    }
    
    public boolean isSetItemId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.name = BaselineSetDTOImpl.NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldName, (Object)BaselineSetDTOImpl.NAME_EDEFAULT, oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(final String newComment) {
        final String oldComment = this.comment;
        this.comment = newComment;
        final boolean oldCommentESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldComment, (Object)this.comment, !oldCommentESet));
        }
    }
    
    public void unsetComment() {
        final String oldComment = this.comment;
        final boolean oldCommentESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.comment = BaselineSetDTOImpl.COMMENT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldComment, (Object)BaselineSetDTOImpl.COMMENT_EDEFAULT, oldCommentESet));
        }
    }
    
    public boolean isSetComment() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getOwnerWorkspaceItemId() {
        return this.ownerWorkspaceItemId;
    }
    
    public void setOwnerWorkspaceItemId(final String newOwnerWorkspaceItemId) {
        final String oldOwnerWorkspaceItemId = this.ownerWorkspaceItemId;
        this.ownerWorkspaceItemId = newOwnerWorkspaceItemId;
        final boolean oldOwnerWorkspaceItemIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldOwnerWorkspaceItemId, (Object)this.ownerWorkspaceItemId, !oldOwnerWorkspaceItemIdESet));
        }
    }
    
    public void unsetOwnerWorkspaceItemId() {
        final String oldOwnerWorkspaceItemId = this.ownerWorkspaceItemId;
        final boolean oldOwnerWorkspaceItemIdESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ownerWorkspaceItemId = BaselineSetDTOImpl.OWNER_WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldOwnerWorkspaceItemId, (Object)BaselineSetDTOImpl.OWNER_WORKSPACE_ITEM_ID_EDEFAULT, oldOwnerWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetOwnerWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.repositoryId = BaselineSetDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldRepositoryId, (Object)BaselineSetDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public List getBaselineItemIds() {
        if (this.baselineItemIds == null) {
            this.baselineItemIds = (EList)new EDataTypeEList.Unsettable((Class)String.class, (InternalEObject)this, 0);
        }
        return (List)this.baselineItemIds;
    }
    
    public void unsetBaselineItemIds() {
        if (this.baselineItemIds != null) {
            ((InternalEList.Unsettable)this.baselineItemIds).unset();
        }
    }
    
    public boolean isSetBaselineItemIds() {
        return this.baselineItemIds != null && ((InternalEList.Unsettable)this.baselineItemIds).isSet();
    }
    
    public String getCreatorContributorItemId() {
        return this.creatorContributorItemId;
    }
    
    public void setCreatorContributorItemId(final String newCreatorContributorItemId) {
        final String oldCreatorContributorItemId = this.creatorContributorItemId;
        this.creatorContributorItemId = newCreatorContributorItemId;
        final boolean oldCreatorContributorItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldCreatorContributorItemId, (Object)this.creatorContributorItemId, !oldCreatorContributorItemIdESet));
        }
    }
    
    public void unsetCreatorContributorItemId() {
        final String oldCreatorContributorItemId = this.creatorContributorItemId;
        final boolean oldCreatorContributorItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.creatorContributorItemId = BaselineSetDTOImpl.CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldCreatorContributorItemId, (Object)BaselineSetDTOImpl.CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT, oldCreatorContributorItemIdESet));
        }
    }
    
    public boolean isSetCreatorContributorItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public long getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(final long newCreationDate) {
        final long oldCreationDate = this.creationDate;
        this.creationDate = newCreationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldCreationDate, this.creationDate, !oldCreationDateESet));
        }
    }
    
    public void unsetCreationDate() {
        final long oldCreationDate = this.creationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.creationDate = 0L;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldCreationDate, 0L, oldCreationDateESet));
        }
    }
    
    public boolean isSetCreationDate() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getModifierContributorItemId() {
        return this.modifierContributorItemId;
    }
    
    public void setModifierContributorItemId(final String newModifierContributorItemId) {
        final String oldModifierContributorItemId = this.modifierContributorItemId;
        this.modifierContributorItemId = newModifierContributorItemId;
        final boolean oldModifierContributorItemIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldModifierContributorItemId, (Object)this.modifierContributorItemId, !oldModifierContributorItemIdESet));
        }
    }
    
    public void unsetModifierContributorItemId() {
        final String oldModifierContributorItemId = this.modifierContributorItemId;
        final boolean oldModifierContributorItemIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.modifierContributorItemId = BaselineSetDTOImpl.MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldModifierContributorItemId, (Object)BaselineSetDTOImpl.MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT, oldModifierContributorItemIdESet));
        }
    }
    
    public boolean isSetModifierContributorItemId() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public long getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(final long newModifiedDate) {
        final long oldModifiedDate = this.modifiedDate;
        this.modifiedDate = newModifiedDate;
        final boolean oldModifiedDateESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldModifiedDate, this.modifiedDate, !oldModifiedDateESet));
        }
    }
    
    public void unsetModifiedDate() {
        final long oldModifiedDate = this.modifiedDate;
        final boolean oldModifiedDateESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.modifiedDate = 0L;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldModifiedDate, 0L, oldModifiedDateESet));
        }
    }
    
    public boolean isSetModifiedDate() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getBaselineItemIds();
            }
            case 1: {
                return this.getComment();
            }
            case 2: {
                return this.getCreatorContributorItemId();
            }
            case 3: {
                return new Long(this.getCreationDate());
            }
            case 4: {
                return this.getItemId();
            }
            case 5: {
                return new Long(this.getModifiedDate());
            }
            case 6: {
                return this.getModifierContributorItemId();
            }
            case 7: {
                return this.getName();
            }
            case 8: {
                return this.getOwnerWorkspaceItemId();
            }
            case 9: {
                return this.getRepositoryId();
            }
            case 10: {
                return this.getRepositoryURL();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getBaselineItemIds().clear();
                this.getBaselineItemIds().addAll((Collection)newValue);
            }
            case 1: {
                this.setComment((String)newValue);
            }
            case 2: {
                this.setCreatorContributorItemId((String)newValue);
            }
            case 3: {
                this.setCreationDate((long)newValue);
            }
            case 4: {
                this.setItemId((String)newValue);
            }
            case 5: {
                this.setModifiedDate((long)newValue);
            }
            case 6: {
                this.setModifierContributorItemId((String)newValue);
            }
            case 7: {
                this.setName((String)newValue);
            }
            case 8: {
                this.setOwnerWorkspaceItemId((String)newValue);
            }
            case 9: {
                this.setRepositoryId((String)newValue);
            }
            case 10: {
                this.setRepositoryURL((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBaselineItemIds();
            }
            case 1: {
                this.unsetComment();
            }
            case 2: {
                this.unsetCreatorContributorItemId();
            }
            case 3: {
                this.unsetCreationDate();
            }
            case 4: {
                this.unsetItemId();
            }
            case 5: {
                this.unsetModifiedDate();
            }
            case 6: {
                this.unsetModifierContributorItemId();
            }
            case 7: {
                this.unsetName();
            }
            case 8: {
                this.unsetOwnerWorkspaceItemId();
            }
            case 9: {
                this.unsetRepositoryId();
            }
            case 10: {
                this.unsetRepositoryURL();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBaselineItemIds();
            }
            case 1: {
                return this.isSetComment();
            }
            case 2: {
                return this.isSetCreatorContributorItemId();
            }
            case 3: {
                return this.isSetCreationDate();
            }
            case 4: {
                return this.isSetItemId();
            }
            case 5: {
                return this.isSetModifiedDate();
            }
            case 6: {
                return this.isSetModifierContributorItemId();
            }
            case 7: {
                return this.isSetName();
            }
            case 8: {
                return this.isSetOwnerWorkspaceItemId();
            }
            case 9: {
                return this.isSetRepositoryId();
            }
            case 10: {
                return this.isSetRepositoryURL();
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
        result.append(" (baselineItemIds: ");
        result.append(this.baselineItemIds);
        result.append(", comment: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.comment);
        }
        else {
            result.append("<unset>");
        }
        result.append(", creatorContributorItemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.creatorContributorItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", creationDate: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.creationDate);
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
        result.append(", modifiedDate: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.modifiedDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(", modifierContributorItemId: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.modifierContributorItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", name: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", ownerWorkspaceItemId: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.ownerWorkspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryURL: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.repositoryURL);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
