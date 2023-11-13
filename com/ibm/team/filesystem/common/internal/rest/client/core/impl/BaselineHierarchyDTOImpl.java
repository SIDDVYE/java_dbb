// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineHierarchyDTO;

public class BaselineHierarchyDTOImpl extends HierarchyDTOImpl implements BaselineHierarchyDTO
{
    protected EList subbaselines;
    protected static final String COMMENT_EDEFAULT;
    protected String comment;
    protected static final int COMMENT_ESETFLAG = 2048;
    protected static final long CREATION_DATE_EDEFAULT = 0L;
    protected long creationDate;
    protected static final int CREATION_DATE_ESETFLAG = 4096;
    protected static final String CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
    protected String creatorContributorItemId;
    protected static final int CREATOR_CONTRIBUTOR_ITEM_ID_ESETFLAG = 8192;
    protected static final String CREATOR_CONTRIBUTOR_NAME_EDEFAULT;
    protected String creatorContributorName;
    protected static final int CREATOR_CONTRIBUTOR_NAME_ESETFLAG = 16384;
    protected static final long MODIFIED_DATE_EDEFAULT = 0L;
    protected long modifiedDate;
    protected static final int MODIFIED_DATE_ESETFLAG = 32768;
    protected static final String MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT;
    protected String modifierContributorItemId;
    protected static final int MODIFIER_CONTRIBUTOR_ITEM_ID_ESETFLAG = 65536;
    protected static final String MODIFIER_CONTRIBUTOR_NAME_EDEFAULT;
    protected String modifierContributorName;
    protected static final int MODIFIER_CONTRIBUTOR_NAME_ESETFLAG = 131072;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 262144;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryURL;
    protected static final int REPOSITORY_URL_ESETFLAG = 524288;
    protected static final String ITEM_ID_EDEFAULT;
    protected String itemId;
    protected static final int ITEM_ID_ESETFLAG = 1048576;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 2097152;
    protected static final String COMPONENT_NAME_EDEFAULT;
    protected String componentName;
    protected static final int COMPONENT_NAME_ESETFLAG = 4194304;
    private static final int EOFFSET_CORRECTION;
    
    static {
        COMMENT_EDEFAULT = null;
        CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT = null;
        CREATOR_CONTRIBUTOR_NAME_EDEFAULT = null;
        MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT = null;
        MODIFIER_CONTRIBUTOR_NAME_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        ITEM_ID_EDEFAULT = null;
        COMPONENT_NAME_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemRestClientDTOcorePackage.Literals.BASELINE_HIERARCHY_DTO.getFeatureID((EStructuralFeature)FilesystemRestClientDTOcorePackage.Literals.BASELINE_HIERARCHY_DTO__SUBBASELINES) - 8;
    }
    
    protected BaselineHierarchyDTOImpl() {
        this.comment = BaselineHierarchyDTOImpl.COMMENT_EDEFAULT;
        this.creationDate = 0L;
        this.creatorContributorItemId = BaselineHierarchyDTOImpl.CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.creatorContributorName = BaselineHierarchyDTOImpl.CREATOR_CONTRIBUTOR_NAME_EDEFAULT;
        this.modifiedDate = 0L;
        this.modifierContributorItemId = BaselineHierarchyDTOImpl.MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.modifierContributorName = BaselineHierarchyDTOImpl.MODIFIER_CONTRIBUTOR_NAME_EDEFAULT;
        this.repositoryId = BaselineHierarchyDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryURL = BaselineHierarchyDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.itemId = BaselineHierarchyDTOImpl.ITEM_ID_EDEFAULT;
        this.id = 0;
        this.componentName = BaselineHierarchyDTOImpl.COMPONENT_NAME_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.BASELINE_HIERARCHY_DTO;
    }
    
    @Override
    public List getSubbaselines() {
        if (this.subbaselines == null) {
            this.subbaselines = (EList)new EObjectContainmentEList.Unsettable((Class)BaselineHierarchyDTO.class, (InternalEObject)this, 8 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION);
        }
        return (List)this.subbaselines;
    }
    
    @Override
    public void unsetSubbaselines() {
        if (this.subbaselines != null) {
            ((InternalEList.Unsettable)this.subbaselines).unset();
        }
    }
    
    @Override
    public boolean isSetSubbaselines() {
        return this.subbaselines != null && ((InternalEList.Unsettable)this.subbaselines).isSet();
    }
    
    @Override
    public String getComment() {
        return this.comment;
    }
    
    @Override
    public void setComment(final String newComment) {
        final String oldComment = this.comment;
        this.comment = newComment;
        final boolean oldCommentESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldComment, (Object)this.comment, !oldCommentESet));
        }
    }
    
    @Override
    public void unsetComment() {
        final String oldComment = this.comment;
        final boolean oldCommentESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.comment = BaselineHierarchyDTOImpl.COMMENT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldComment, (Object)BaselineHierarchyDTOImpl.COMMENT_EDEFAULT, oldCommentESet));
        }
    }
    
    @Override
    public boolean isSetComment() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    @Override
    public long getCreationDate() {
        return this.creationDate;
    }
    
    @Override
    public void setCreationDate(final long newCreationDate) {
        final long oldCreationDate = this.creationDate;
        this.creationDate = newCreationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, oldCreationDate, this.creationDate, !oldCreationDateESet));
        }
    }
    
    @Override
    public void unsetCreationDate() {
        final long oldCreationDate = this.creationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.creationDate = 0L;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, oldCreationDate, 0L, oldCreationDateESet));
        }
    }
    
    @Override
    public boolean isSetCreationDate() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    @Override
    public String getCreatorContributorItemId() {
        return this.creatorContributorItemId;
    }
    
    @Override
    public void setCreatorContributorItemId(final String newCreatorContributorItemId) {
        final String oldCreatorContributorItemId = this.creatorContributorItemId;
        this.creatorContributorItemId = newCreatorContributorItemId;
        final boolean oldCreatorContributorItemIdESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldCreatorContributorItemId, (Object)this.creatorContributorItemId, !oldCreatorContributorItemIdESet));
        }
    }
    
    @Override
    public void unsetCreatorContributorItemId() {
        final String oldCreatorContributorItemId = this.creatorContributorItemId;
        final boolean oldCreatorContributorItemIdESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.creatorContributorItemId = BaselineHierarchyDTOImpl.CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldCreatorContributorItemId, (Object)BaselineHierarchyDTOImpl.CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT, oldCreatorContributorItemIdESet));
        }
    }
    
    @Override
    public boolean isSetCreatorContributorItemId() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    @Override
    public String getCreatorContributorName() {
        return this.creatorContributorName;
    }
    
    @Override
    public void setCreatorContributorName(final String newCreatorContributorName) {
        final String oldCreatorContributorName = this.creatorContributorName;
        this.creatorContributorName = newCreatorContributorName;
        final boolean oldCreatorContributorNameESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS |= 0x4000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 12 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldCreatorContributorName, (Object)this.creatorContributorName, !oldCreatorContributorNameESet));
        }
    }
    
    @Override
    public void unsetCreatorContributorName() {
        final String oldCreatorContributorName = this.creatorContributorName;
        final boolean oldCreatorContributorNameESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.creatorContributorName = BaselineHierarchyDTOImpl.CREATOR_CONTRIBUTOR_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 12 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldCreatorContributorName, (Object)BaselineHierarchyDTOImpl.CREATOR_CONTRIBUTOR_NAME_EDEFAULT, oldCreatorContributorNameESet));
        }
    }
    
    @Override
    public boolean isSetCreatorContributorName() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    @Override
    public long getModifiedDate() {
        return this.modifiedDate;
    }
    
    @Override
    public void setModifiedDate(final long newModifiedDate) {
        final long oldModifiedDate = this.modifiedDate;
        this.modifiedDate = newModifiedDate;
        final boolean oldModifiedDateESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.ALL_FLAGS |= 0x8000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, oldModifiedDate, this.modifiedDate, !oldModifiedDateESet));
        }
    }
    
    @Override
    public void unsetModifiedDate() {
        final long oldModifiedDate = this.modifiedDate;
        final boolean oldModifiedDateESet = (this.ALL_FLAGS & 0x8000) != 0x0;
        this.modifiedDate = 0L;
        this.ALL_FLAGS &= 0xFFFF7FFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, oldModifiedDate, 0L, oldModifiedDateESet));
        }
    }
    
    @Override
    public boolean isSetModifiedDate() {
        return (this.ALL_FLAGS & 0x8000) != 0x0;
    }
    
    @Override
    public String getModifierContributorItemId() {
        return this.modifierContributorItemId;
    }
    
    @Override
    public void setModifierContributorItemId(final String newModifierContributorItemId) {
        final String oldModifierContributorItemId = this.modifierContributorItemId;
        this.modifierContributorItemId = newModifierContributorItemId;
        final boolean oldModifierContributorItemIdESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.ALL_FLAGS |= 0x10000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 14 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldModifierContributorItemId, (Object)this.modifierContributorItemId, !oldModifierContributorItemIdESet));
        }
    }
    
    @Override
    public void unsetModifierContributorItemId() {
        final String oldModifierContributorItemId = this.modifierContributorItemId;
        final boolean oldModifierContributorItemIdESet = (this.ALL_FLAGS & 0x10000) != 0x0;
        this.modifierContributorItemId = BaselineHierarchyDTOImpl.MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFEFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 14 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldModifierContributorItemId, (Object)BaselineHierarchyDTOImpl.MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT, oldModifierContributorItemIdESet));
        }
    }
    
    @Override
    public boolean isSetModifierContributorItemId() {
        return (this.ALL_FLAGS & 0x10000) != 0x0;
    }
    
    @Override
    public String getModifierContributorName() {
        return this.modifierContributorName;
    }
    
    @Override
    public void setModifierContributorName(final String newModifierContributorName) {
        final String oldModifierContributorName = this.modifierContributorName;
        this.modifierContributorName = newModifierContributorName;
        final boolean oldModifierContributorNameESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.ALL_FLAGS |= 0x20000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 15 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldModifierContributorName, (Object)this.modifierContributorName, !oldModifierContributorNameESet));
        }
    }
    
    @Override
    public void unsetModifierContributorName() {
        final String oldModifierContributorName = this.modifierContributorName;
        final boolean oldModifierContributorNameESet = (this.ALL_FLAGS & 0x20000) != 0x0;
        this.modifierContributorName = BaselineHierarchyDTOImpl.MODIFIER_CONTRIBUTOR_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFDFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 15 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldModifierContributorName, (Object)BaselineHierarchyDTOImpl.MODIFIER_CONTRIBUTOR_NAME_EDEFAULT, oldModifierContributorNameESet));
        }
    }
    
    @Override
    public boolean isSetModifierContributorName() {
        return (this.ALL_FLAGS & 0x20000) != 0x0;
    }
    
    @Override
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    @Override
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x40000) != 0x0;
        this.ALL_FLAGS |= 0x40000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 16 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    @Override
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x40000) != 0x0;
        this.repositoryId = BaselineHierarchyDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFBFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 16 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldRepositoryId, (Object)BaselineHierarchyDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    @Override
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x40000) != 0x0;
    }
    
    @Override
    public String getRepositoryURL() {
        return this.repositoryURL;
    }
    
    @Override
    public void setRepositoryURL(final String newRepositoryURL) {
        final String oldRepositoryURL = this.repositoryURL;
        this.repositoryURL = newRepositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x80000) != 0x0;
        this.ALL_FLAGS |= 0x80000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 17 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldRepositoryURL, (Object)this.repositoryURL, !oldRepositoryURLESet));
        }
    }
    
    @Override
    public void unsetRepositoryURL() {
        final String oldRepositoryURL = this.repositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x80000) != 0x0;
        this.repositoryURL = BaselineHierarchyDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFF7FFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 17 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldRepositoryURL, (Object)BaselineHierarchyDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryURLESet));
        }
    }
    
    @Override
    public boolean isSetRepositoryURL() {
        return (this.ALL_FLAGS & 0x80000) != 0x0;
    }
    
    @Override
    public String getItemId() {
        return this.itemId;
    }
    
    @Override
    public void setItemId(final String newItemId) {
        final String oldItemId = this.itemId;
        this.itemId = newItemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x100000) != 0x0;
        this.ALL_FLAGS |= 0x100000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 18 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldItemId, (Object)this.itemId, !oldItemIdESet));
        }
    }
    
    @Override
    public void unsetItemId() {
        final String oldItemId = this.itemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x100000) != 0x0;
        this.itemId = BaselineHierarchyDTOImpl.ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFEFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 18 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldItemId, (Object)BaselineHierarchyDTOImpl.ITEM_ID_EDEFAULT, oldItemIdESet));
        }
    }
    
    @Override
    public boolean isSetItemId() {
        return (this.ALL_FLAGS & 0x100000) != 0x0;
    }
    
    @Override
    public int getId() {
        return this.id;
    }
    
    @Override
    public void setId(final int newId) {
        final int oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x200000) != 0x0;
        this.ALL_FLAGS |= 0x200000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 19 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, oldId, this.id, !oldIdESet));
        }
    }
    
    @Override
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x200000) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFDFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 19 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, oldId, 0, oldIdESet));
        }
    }
    
    @Override
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x200000) != 0x0;
    }
    
    @Override
    public String getComponentName() {
        return this.componentName;
    }
    
    @Override
    public void setComponentName(final String newComponentName) {
        final String oldComponentName = this.componentName;
        this.componentName = newComponentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x400000) != 0x0;
        this.ALL_FLAGS |= 0x400000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 20 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldComponentName, (Object)this.componentName, !oldComponentNameESet));
        }
    }
    
    @Override
    public void unsetComponentName() {
        final String oldComponentName = this.componentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x400000) != 0x0;
        this.componentName = BaselineHierarchyDTOImpl.COMPONENT_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFBFFFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 20 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldComponentName, (Object)BaselineHierarchyDTOImpl.COMPONENT_NAME_EDEFAULT, oldComponentNameESet));
        }
    }
    
    @Override
    public boolean isSetComponentName() {
        return (this.ALL_FLAGS & 0x400000) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID - BaselineHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                return ((InternalEList)this.getSubbaselines()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - BaselineHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                return this.getSubbaselines();
            }
            case 9: {
                return this.getComment();
            }
            case 10: {
                return new Long(this.getCreationDate());
            }
            case 11: {
                return this.getCreatorContributorItemId();
            }
            case 12: {
                return this.getCreatorContributorName();
            }
            case 13: {
                return new Long(this.getModifiedDate());
            }
            case 14: {
                return this.getModifierContributorItemId();
            }
            case 15: {
                return this.getModifierContributorName();
            }
            case 16: {
                return this.getRepositoryId();
            }
            case 17: {
                return this.getRepositoryURL();
            }
            case 18: {
                return this.getItemId();
            }
            case 19: {
                return new Integer(this.getId());
            }
            case 20: {
                return this.getComponentName();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - BaselineHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                this.getSubbaselines().clear();
                this.getSubbaselines().addAll((Collection)newValue);
            }
            case 9: {
                this.setComment((String)newValue);
            }
            case 10: {
                this.setCreationDate((long)newValue);
            }
            case 11: {
                this.setCreatorContributorItemId((String)newValue);
            }
            case 12: {
                this.setCreatorContributorName((String)newValue);
            }
            case 13: {
                this.setModifiedDate((long)newValue);
            }
            case 14: {
                this.setModifierContributorItemId((String)newValue);
            }
            case 15: {
                this.setModifierContributorName((String)newValue);
            }
            case 16: {
                this.setRepositoryId((String)newValue);
            }
            case 17: {
                this.setRepositoryURL((String)newValue);
            }
            case 18: {
                this.setItemId((String)newValue);
            }
            case 19: {
                this.setId((int)newValue);
            }
            case 20: {
                this.setComponentName((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID - BaselineHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                this.unsetSubbaselines();
            }
            case 9: {
                this.unsetComment();
            }
            case 10: {
                this.unsetCreationDate();
            }
            case 11: {
                this.unsetCreatorContributorItemId();
            }
            case 12: {
                this.unsetCreatorContributorName();
            }
            case 13: {
                this.unsetModifiedDate();
            }
            case 14: {
                this.unsetModifierContributorItemId();
            }
            case 15: {
                this.unsetModifierContributorName();
            }
            case 16: {
                this.unsetRepositoryId();
            }
            case 17: {
                this.unsetRepositoryURL();
            }
            case 18: {
                this.unsetItemId();
            }
            case 19: {
                this.unsetId();
            }
            case 20: {
                this.unsetComponentName();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID - BaselineHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                return this.isSetSubbaselines();
            }
            case 9: {
                return this.isSetComment();
            }
            case 10: {
                return this.isSetCreationDate();
            }
            case 11: {
                return this.isSetCreatorContributorItemId();
            }
            case 12: {
                return this.isSetCreatorContributorName();
            }
            case 13: {
                return this.isSetModifiedDate();
            }
            case 14: {
                return this.isSetModifierContributorItemId();
            }
            case 15: {
                return this.isSetModifierContributorName();
            }
            case 16: {
                return this.isSetRepositoryId();
            }
            case 17: {
                return this.isSetRepositoryURL();
            }
            case 18: {
                return this.isSetItemId();
            }
            case 19: {
                return this.isSetId();
            }
            case 20: {
                return this.isSetComponentName();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    @Override
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass != BaselineHierarchyDTO.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - BaselineHierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 8: {
                return 8 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 9: {
                return 9 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 10: {
                return 10 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 11: {
                return 11 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 12: {
                return 12 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 13: {
                return 13 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 14: {
                return 14 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 15: {
                return 15 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 16: {
                return 16 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 17: {
                return 17 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 18: {
                return 18 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 19: {
                return 19 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 20: {
                return 20 + BaselineHierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            default: {
                return -1;
            }
        }
    }
    
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (comment: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append(this.comment);
        }
        else {
            result.append("<unset>");
        }
        result.append(", creationDate: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append(this.creationDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(", creatorContributorItemId: ");
        if ((this.ALL_FLAGS & 0x2000) != 0x0) {
            result.append(this.creatorContributorItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", creatorContributorName: ");
        if ((this.ALL_FLAGS & 0x4000) != 0x0) {
            result.append(this.creatorContributorName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", modifiedDate: ");
        if ((this.ALL_FLAGS & 0x8000) != 0x0) {
            result.append(this.modifiedDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(", modifierContributorItemId: ");
        if ((this.ALL_FLAGS & 0x10000) != 0x0) {
            result.append(this.modifierContributorItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", modifierContributorName: ");
        if ((this.ALL_FLAGS & 0x20000) != 0x0) {
            result.append(this.modifierContributorName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x40000) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryURL: ");
        if ((this.ALL_FLAGS & 0x80000) != 0x0) {
            result.append(this.repositoryURL);
        }
        else {
            result.append("<unset>");
        }
        result.append(", itemId: ");
        if ((this.ALL_FLAGS & 0x100000) != 0x0) {
            result.append(this.itemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", id: ");
        if ((this.ALL_FLAGS & 0x200000) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentName: ");
        if ((this.ALL_FLAGS & 0x400000) != 0x0) {
            result.append(this.componentName);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
