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
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineHierarchyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class BaselineDTOImpl extends EObjectImpl implements BaselineDTO
{
    protected int ALL_FLAGS;
    protected static final String COMMENT_EDEFAULT;
    protected String comment;
    protected static final int COMMENT_ESETFLAG = 1;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 2;
    protected static final long CREATION_DATE_EDEFAULT = 0L;
    protected long creationDate;
    protected static final int CREATION_DATE_ESETFLAG = 4;
    protected static final String CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
    protected String creatorContributorItemId;
    protected static final int CREATOR_CONTRIBUTOR_ITEM_ID_ESETFLAG = 8;
    protected static final String CREATOR_CONTRIBUTOR_NAME_EDEFAULT;
    protected String creatorContributorName;
    protected static final int CREATOR_CONTRIBUTOR_NAME_ESETFLAG = 16;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 32;
    protected static final String ITEM_ID_EDEFAULT;
    protected String itemId;
    protected static final int ITEM_ID_ESETFLAG = 64;
    protected static final long MODIFIED_DATE_EDEFAULT = 0L;
    protected long modifiedDate;
    protected static final int MODIFIED_DATE_ESETFLAG = 128;
    protected static final String MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT;
    protected String modifierContributorItemId;
    protected static final int MODIFIER_CONTRIBUTOR_ITEM_ID_ESETFLAG = 256;
    protected static final String MODIFIER_CONTRIBUTOR_NAME_EDEFAULT;
    protected String modifierContributorName;
    protected static final int MODIFIER_CONTRIBUTOR_NAME_ESETFLAG = 512;
    protected static final String NAME_EDEFAULT;
    protected String name;
    protected static final int NAME_ESETFLAG = 1024;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 2048;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryURL;
    protected static final int REPOSITORY_URL_ESETFLAG = 4096;
    protected BaselineHierarchyDTO hierarchy;
    protected static final int HIERARCHY_ESETFLAG = 8192;
    protected static final String COMPONENT_NAME_EDEFAULT;
    protected String componentName;
    protected static final int COMPONENT_NAME_ESETFLAG = 16384;
    
    static {
        COMMENT_EDEFAULT = null;
        COMPONENT_ITEM_ID_EDEFAULT = null;
        CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT = null;
        CREATOR_CONTRIBUTOR_NAME_EDEFAULT = null;
        ITEM_ID_EDEFAULT = null;
        MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT = null;
        MODIFIER_CONTRIBUTOR_NAME_EDEFAULT = null;
        NAME_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        COMPONENT_NAME_EDEFAULT = null;
    }
    
    protected BaselineDTOImpl() {
        this.ALL_FLAGS = 0;
        this.comment = BaselineDTOImpl.COMMENT_EDEFAULT;
        this.componentItemId = BaselineDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.creationDate = 0L;
        this.creatorContributorItemId = BaselineDTOImpl.CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.creatorContributorName = BaselineDTOImpl.CREATOR_CONTRIBUTOR_NAME_EDEFAULT;
        this.id = 0;
        this.itemId = BaselineDTOImpl.ITEM_ID_EDEFAULT;
        this.modifiedDate = 0L;
        this.modifierContributorItemId = BaselineDTOImpl.MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.modifierContributorName = BaselineDTOImpl.MODIFIER_CONTRIBUTOR_NAME_EDEFAULT;
        this.name = BaselineDTOImpl.NAME_EDEFAULT;
        this.repositoryId = BaselineDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryURL = BaselineDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.componentName = BaselineDTOImpl.COMPONENT_NAME_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.BASELINE_DTO;
    }
    
    public String getRepositoryURL() {
        return this.repositoryURL;
    }
    
    public void setRepositoryURL(final String newRepositoryURL) {
        final String oldRepositoryURL = this.repositoryURL;
        this.repositoryURL = newRepositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 12, (Object)oldRepositoryURL, (Object)this.repositoryURL, !oldRepositoryURLESet));
        }
    }
    
    public void unsetRepositoryURL() {
        final String oldRepositoryURL = this.repositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.repositoryURL = BaselineDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 12, (Object)oldRepositoryURL, (Object)BaselineDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryURLESet));
        }
    }
    
    public boolean isSetRepositoryURL() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public BaselineHierarchyDTO getHierarchy() {
        if (this.hierarchy != null && ((EObject)this.hierarchy).eIsProxy()) {
            final InternalEObject oldHierarchy = (InternalEObject)this.hierarchy;
            this.hierarchy = (BaselineHierarchyDTO)this.eResolveProxy(oldHierarchy);
            if (this.hierarchy != oldHierarchy && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 13, (Object)oldHierarchy, (Object)this.hierarchy));
            }
        }
        return this.hierarchy;
    }
    
    public BaselineHierarchyDTO basicGetHierarchy() {
        return this.hierarchy;
    }
    
    public void setHierarchy(final BaselineHierarchyDTO newHierarchy) {
        final BaselineHierarchyDTO oldHierarchy = this.hierarchy;
        this.hierarchy = newHierarchy;
        final boolean oldHierarchyESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13, (Object)oldHierarchy, (Object)this.hierarchy, !oldHierarchyESet));
        }
    }
    
    public void unsetHierarchy() {
        final BaselineHierarchyDTO oldHierarchy = this.hierarchy;
        final boolean oldHierarchyESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.hierarchy = null;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13, (Object)oldHierarchy, (Object)null, oldHierarchyESet));
        }
    }
    
    public boolean isSetHierarchy() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public String getComponentName() {
        return this.componentName;
    }
    
    public void setComponentName(final String newComponentName) {
        final String oldComponentName = this.componentName;
        this.componentName = newComponentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS |= 0x4000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 14, (Object)oldComponentName, (Object)this.componentName, !oldComponentNameESet));
        }
    }
    
    public void unsetComponentName() {
        final String oldComponentName = this.componentName;
        final boolean oldComponentNameESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.componentName = BaselineDTOImpl.COMPONENT_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 14, (Object)oldComponentName, (Object)BaselineDTOImpl.COMPONENT_NAME_EDEFAULT, oldComponentNameESet));
        }
    }
    
    public boolean isSetComponentName() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    public String getItemId() {
        return this.itemId;
    }
    
    public void setItemId(final String newItemId) {
        final String oldItemId = this.itemId;
        this.itemId = newItemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldItemId, (Object)this.itemId, !oldItemIdESet));
        }
    }
    
    public void unsetItemId() {
        final String oldItemId = this.itemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.itemId = BaselineDTOImpl.ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldItemId, (Object)BaselineDTOImpl.ITEM_ID_EDEFAULT, oldItemIdESet));
        }
    }
    
    public boolean isSetItemId() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.name = BaselineDTOImpl.NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, (Object)oldName, (Object)BaselineDTOImpl.NAME_EDEFAULT, oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.ALL_FLAGS |= 0x800;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x800) != 0x0;
        this.repositoryId = BaselineDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, (Object)oldRepositoryId, (Object)BaselineDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldComment, (Object)this.comment, !oldCommentESet));
        }
    }
    
    public void unsetComment() {
        final String oldComment = this.comment;
        final boolean oldCommentESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.comment = BaselineDTOImpl.COMMENT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldComment, (Object)BaselineDTOImpl.COMMENT_EDEFAULT, oldCommentESet));
        }
    }
    
    public boolean isSetComment() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int newId) {
        final int oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getComponentItemId() {
        return this.componentItemId;
    }
    
    public void setComponentItemId(final String newComponentItemId) {
        final String oldComponentItemId = this.componentItemId;
        this.componentItemId = newComponentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.componentItemId = BaselineDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldComponentItemId, (Object)BaselineDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getCreatorContributorItemId() {
        return this.creatorContributorItemId;
    }
    
    public void setCreatorContributorItemId(final String newCreatorContributorItemId) {
        final String oldCreatorContributorItemId = this.creatorContributorItemId;
        this.creatorContributorItemId = newCreatorContributorItemId;
        final boolean oldCreatorContributorItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldCreatorContributorItemId, (Object)this.creatorContributorItemId, !oldCreatorContributorItemIdESet));
        }
    }
    
    public void unsetCreatorContributorItemId() {
        final String oldCreatorContributorItemId = this.creatorContributorItemId;
        final boolean oldCreatorContributorItemIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.creatorContributorItemId = BaselineDTOImpl.CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldCreatorContributorItemId, (Object)BaselineDTOImpl.CREATOR_CONTRIBUTOR_ITEM_ID_EDEFAULT, oldCreatorContributorItemIdESet));
        }
    }
    
    public boolean isSetCreatorContributorItemId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldCreationDate, this.creationDate, !oldCreationDateESet));
        }
    }
    
    public void unsetCreationDate() {
        final long oldCreationDate = this.creationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.creationDate = 0L;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldCreationDate, 0L, oldCreationDateESet));
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
        final boolean oldModifierContributorItemIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldModifierContributorItemId, (Object)this.modifierContributorItemId, !oldModifierContributorItemIdESet));
        }
    }
    
    public void unsetModifierContributorItemId() {
        final String oldModifierContributorItemId = this.modifierContributorItemId;
        final boolean oldModifierContributorItemIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.modifierContributorItemId = BaselineDTOImpl.MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldModifierContributorItemId, (Object)BaselineDTOImpl.MODIFIER_CONTRIBUTOR_ITEM_ID_EDEFAULT, oldModifierContributorItemIdESet));
        }
    }
    
    public boolean isSetModifierContributorItemId() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public long getModifiedDate() {
        return this.modifiedDate;
    }
    
    public void setModifiedDate(final long newModifiedDate) {
        final long oldModifiedDate = this.modifiedDate;
        this.modifiedDate = newModifiedDate;
        final boolean oldModifiedDateESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, oldModifiedDate, this.modifiedDate, !oldModifiedDateESet));
        }
    }
    
    public void unsetModifiedDate() {
        final long oldModifiedDate = this.modifiedDate;
        final boolean oldModifiedDateESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.modifiedDate = 0L;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, oldModifiedDate, 0L, oldModifiedDateESet));
        }
    }
    
    public boolean isSetModifiedDate() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public String getCreatorContributorName() {
        return this.creatorContributorName;
    }
    
    public void setCreatorContributorName(final String newCreatorContributorName) {
        final String oldCreatorContributorName = this.creatorContributorName;
        this.creatorContributorName = newCreatorContributorName;
        final boolean oldCreatorContributorNameESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldCreatorContributorName, (Object)this.creatorContributorName, !oldCreatorContributorNameESet));
        }
    }
    
    public void unsetCreatorContributorName() {
        final String oldCreatorContributorName = this.creatorContributorName;
        final boolean oldCreatorContributorNameESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.creatorContributorName = BaselineDTOImpl.CREATOR_CONTRIBUTOR_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldCreatorContributorName, (Object)BaselineDTOImpl.CREATOR_CONTRIBUTOR_NAME_EDEFAULT, oldCreatorContributorNameESet));
        }
    }
    
    public boolean isSetCreatorContributorName() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getModifierContributorName() {
        return this.modifierContributorName;
    }
    
    public void setModifierContributorName(final String newModifierContributorName) {
        final String oldModifierContributorName = this.modifierContributorName;
        this.modifierContributorName = newModifierContributorName;
        final boolean oldModifierContributorNameESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldModifierContributorName, (Object)this.modifierContributorName, !oldModifierContributorNameESet));
        }
    }
    
    public void unsetModifierContributorName() {
        final String oldModifierContributorName = this.modifierContributorName;
        final boolean oldModifierContributorNameESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.modifierContributorName = BaselineDTOImpl.MODIFIER_CONTRIBUTOR_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldModifierContributorName, (Object)BaselineDTOImpl.MODIFIER_CONTRIBUTOR_NAME_EDEFAULT, oldModifierContributorNameESet));
        }
    }
    
    public boolean isSetModifierContributorName() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getComment();
            }
            case 1: {
                return this.getComponentItemId();
            }
            case 2: {
                return new Long(this.getCreationDate());
            }
            case 3: {
                return this.getCreatorContributorItemId();
            }
            case 4: {
                return this.getCreatorContributorName();
            }
            case 5: {
                return new Integer(this.getId());
            }
            case 6: {
                return this.getItemId();
            }
            case 7: {
                return new Long(this.getModifiedDate());
            }
            case 8: {
                return this.getModifierContributorItemId();
            }
            case 9: {
                return this.getModifierContributorName();
            }
            case 10: {
                return this.getName();
            }
            case 11: {
                return this.getRepositoryId();
            }
            case 12: {
                return this.getRepositoryURL();
            }
            case 13: {
                if (resolve) {
                    return this.getHierarchy();
                }
                return this.basicGetHierarchy();
            }
            case 14: {
                return this.getComponentName();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setComment((String)newValue);
            }
            case 1: {
                this.setComponentItemId((String)newValue);
            }
            case 2: {
                this.setCreationDate((long)newValue);
            }
            case 3: {
                this.setCreatorContributorItemId((String)newValue);
            }
            case 4: {
                this.setCreatorContributorName((String)newValue);
            }
            case 5: {
                this.setId((int)newValue);
            }
            case 6: {
                this.setItemId((String)newValue);
            }
            case 7: {
                this.setModifiedDate((long)newValue);
            }
            case 8: {
                this.setModifierContributorItemId((String)newValue);
            }
            case 9: {
                this.setModifierContributorName((String)newValue);
            }
            case 10: {
                this.setName((String)newValue);
            }
            case 11: {
                this.setRepositoryId((String)newValue);
            }
            case 12: {
                this.setRepositoryURL((String)newValue);
            }
            case 13: {
                this.setHierarchy((BaselineHierarchyDTO)newValue);
            }
            case 14: {
                this.setComponentName((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetComment();
            }
            case 1: {
                this.unsetComponentItemId();
            }
            case 2: {
                this.unsetCreationDate();
            }
            case 3: {
                this.unsetCreatorContributorItemId();
            }
            case 4: {
                this.unsetCreatorContributorName();
            }
            case 5: {
                this.unsetId();
            }
            case 6: {
                this.unsetItemId();
            }
            case 7: {
                this.unsetModifiedDate();
            }
            case 8: {
                this.unsetModifierContributorItemId();
            }
            case 9: {
                this.unsetModifierContributorName();
            }
            case 10: {
                this.unsetName();
            }
            case 11: {
                this.unsetRepositoryId();
            }
            case 12: {
                this.unsetRepositoryURL();
            }
            case 13: {
                this.unsetHierarchy();
            }
            case 14: {
                this.unsetComponentName();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetComment();
            }
            case 1: {
                return this.isSetComponentItemId();
            }
            case 2: {
                return this.isSetCreationDate();
            }
            case 3: {
                return this.isSetCreatorContributorItemId();
            }
            case 4: {
                return this.isSetCreatorContributorName();
            }
            case 5: {
                return this.isSetId();
            }
            case 6: {
                return this.isSetItemId();
            }
            case 7: {
                return this.isSetModifiedDate();
            }
            case 8: {
                return this.isSetModifierContributorItemId();
            }
            case 9: {
                return this.isSetModifierContributorName();
            }
            case 10: {
                return this.isSetName();
            }
            case 11: {
                return this.isSetRepositoryId();
            }
            case 12: {
                return this.isSetRepositoryURL();
            }
            case 13: {
                return this.isSetHierarchy();
            }
            case 14: {
                return this.isSetComponentName();
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
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.comment);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentItemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.componentItemId);
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
        result.append(", creatorContributorItemId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.creatorContributorItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", creatorContributorName: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.creatorContributorName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", id: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(", itemId: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.itemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", modifiedDate: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.modifiedDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(", modifierContributorItemId: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.modifierContributorItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", modifierContributorName: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.modifierContributorName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", name: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x800) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryURL: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append(this.repositoryURL);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentName: ");
        if ((this.ALL_FLAGS & 0x4000) != 0x0) {
            result.append(this.componentName);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
