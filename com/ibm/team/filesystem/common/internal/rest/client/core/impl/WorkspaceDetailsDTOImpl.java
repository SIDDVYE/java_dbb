// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceFlowEntryDTO;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentHierarchyDTO;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceComponentDTO;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ReadScopeDTO;
import com.ibm.team.repository.common.IAuditableHandle;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceDetailsDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class WorkspaceDetailsDTOImpl extends EObjectImpl implements WorkspaceDetailsDTO
{
    protected int ALL_FLAGS;
    protected EList components;
    protected EList componentHierarchies;
    protected static final String DESCRIPTION_EDEFAULT;
    protected String description;
    protected static final int DESCRIPTION_ESETFLAG = 1;
    protected EList flowEntries;
    protected static final String ITEM_ID_EDEFAULT;
    protected String itemId;
    protected static final int ITEM_ID_ESETFLAG = 2;
    protected static final String NAME_EDEFAULT;
    protected String name;
    protected static final int NAME_ESETFLAG = 4;
    protected IAuditableHandle owner;
    protected static final int OWNER_ESETFLAG = 8;
    protected ReadScopeDTO readScope;
    protected static final int READ_SCOPE_ESETFLAG = 16;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 32;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryURL;
    protected static final int REPOSITORY_URL_ESETFLAG = 64;
    protected static final boolean STREAM_EDEFAULT = false;
    protected static final int STREAM_EFLAG = 128;
    protected static final int STREAM_ESETFLAG = 256;
    protected static final String EXCLUSIVE_FILE_LOCK_PATTERNS_EDEFAULT;
    protected String exclusiveFileLockPatterns;
    protected static final int EXCLUSIVE_FILE_LOCK_PATTERNS_ESETFLAG = 512;
    
    static {
        DESCRIPTION_EDEFAULT = null;
        ITEM_ID_EDEFAULT = null;
        NAME_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        EXCLUSIVE_FILE_LOCK_PATTERNS_EDEFAULT = null;
    }
    
    protected WorkspaceDetailsDTOImpl() {
        this.ALL_FLAGS = 0;
        this.description = WorkspaceDetailsDTOImpl.DESCRIPTION_EDEFAULT;
        this.itemId = WorkspaceDetailsDTOImpl.ITEM_ID_EDEFAULT;
        this.name = WorkspaceDetailsDTOImpl.NAME_EDEFAULT;
        this.repositoryId = WorkspaceDetailsDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryURL = WorkspaceDetailsDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.exclusiveFileLockPatterns = WorkspaceDetailsDTOImpl.EXCLUSIVE_FILE_LOCK_PATTERNS_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.WORKSPACE_DETAILS_DTO;
    }
    
    public String getRepositoryURL() {
        return this.repositoryURL;
    }
    
    public void setRepositoryURL(final String newRepositoryURL) {
        final String oldRepositoryURL = this.repositoryURL;
        this.repositoryURL = newRepositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldRepositoryURL, (Object)this.repositoryURL, !oldRepositoryURLESet));
        }
    }
    
    public void unsetRepositoryURL() {
        final String oldRepositoryURL = this.repositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.repositoryURL = WorkspaceDetailsDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldRepositoryURL, (Object)WorkspaceDetailsDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryURLESet));
        }
    }
    
    public boolean isSetRepositoryURL() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getItemId() {
        return this.itemId;
    }
    
    public void setItemId(final String newItemId) {
        final String oldItemId = this.itemId;
        this.itemId = newItemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldItemId, (Object)this.itemId, !oldItemIdESet));
        }
    }
    
    public void unsetItemId() {
        final String oldItemId = this.itemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.itemId = WorkspaceDetailsDTOImpl.ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldItemId, (Object)WorkspaceDetailsDTOImpl.ITEM_ID_EDEFAULT, oldItemIdESet));
        }
    }
    
    public boolean isSetItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.name = WorkspaceDetailsDTOImpl.NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldName, (Object)WorkspaceDetailsDTOImpl.NAME_EDEFAULT, oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String newDescription) {
        final String oldDescription = this.description;
        this.description = newDescription;
        final boolean oldDescriptionESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldDescription, (Object)this.description, !oldDescriptionESet));
        }
    }
    
    public void unsetDescription() {
        final String oldDescription = this.description;
        final boolean oldDescriptionESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.description = WorkspaceDetailsDTOImpl.DESCRIPTION_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldDescription, (Object)WorkspaceDetailsDTOImpl.DESCRIPTION_EDEFAULT, oldDescriptionESet));
        }
    }
    
    public boolean isSetDescription() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public boolean isStream() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public void setStream(final boolean newStream) {
        final boolean oldStream = (this.ALL_FLAGS & 0x80) != 0x0;
        if (newStream) {
            this.ALL_FLAGS |= 0x80;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFF7F;
        }
        final boolean oldStreamESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, oldStream, newStream, !oldStreamESet));
        }
    }
    
    public void unsetStream() {
        final boolean oldStream = (this.ALL_FLAGS & 0x80) != 0x0;
        final boolean oldStreamESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, oldStream, false, oldStreamESet));
        }
    }
    
    public boolean isSetStream() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public String getExclusiveFileLockPatterns() {
        return this.exclusiveFileLockPatterns;
    }
    
    public void setExclusiveFileLockPatterns(final String newExclusiveFileLockPatterns) {
        final String oldExclusiveFileLockPatterns = this.exclusiveFileLockPatterns;
        this.exclusiveFileLockPatterns = newExclusiveFileLockPatterns;
        final boolean oldExclusiveFileLockPatternsESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, (Object)oldExclusiveFileLockPatterns, (Object)this.exclusiveFileLockPatterns, !oldExclusiveFileLockPatternsESet));
        }
    }
    
    public void unsetExclusiveFileLockPatterns() {
        final String oldExclusiveFileLockPatterns = this.exclusiveFileLockPatterns;
        final boolean oldExclusiveFileLockPatternsESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.exclusiveFileLockPatterns = WorkspaceDetailsDTOImpl.EXCLUSIVE_FILE_LOCK_PATTERNS_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, (Object)oldExclusiveFileLockPatterns, (Object)WorkspaceDetailsDTOImpl.EXCLUSIVE_FILE_LOCK_PATTERNS_EDEFAULT, oldExclusiveFileLockPatternsESet));
        }
    }
    
    public boolean isSetExclusiveFileLockPatterns() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return ((InternalEList)this.getComponentHierarchies()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public IAuditableHandle getOwner() {
        if (this.owner != null && ((EObject)this.owner).eIsProxy()) {
            final InternalEObject oldOwner = (InternalEObject)this.owner;
            this.owner = (IAuditableHandle)this.eResolveProxy(oldOwner);
            if (this.owner != oldOwner && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 6, (Object)oldOwner, (Object)this.owner));
            }
        }
        return this.owner;
    }
    
    public IAuditableHandle basicGetOwner() {
        return this.owner;
    }
    
    public void setOwner(final IAuditableHandle newOwner) {
        final IAuditableHandle oldOwner = this.owner;
        this.owner = newOwner;
        final boolean oldOwnerESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldOwner, (Object)this.owner, !oldOwnerESet));
        }
    }
    
    public void unsetOwner() {
        final IAuditableHandle oldOwner = this.owner;
        final boolean oldOwnerESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.owner = null;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldOwner, (Object)null, oldOwnerESet));
        }
    }
    
    public boolean isSetOwner() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public List getComponents() {
        if (this.components == null) {
            this.components = (EList)new EObjectResolvingEList.Unsettable((Class)WorkspaceComponentDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.components;
    }
    
    public void unsetComponents() {
        if (this.components != null) {
            ((InternalEList.Unsettable)this.components).unset();
        }
    }
    
    public boolean isSetComponents() {
        return this.components != null && ((InternalEList.Unsettable)this.components).isSet();
    }
    
    public List getComponentHierarchies() {
        if (this.componentHierarchies == null) {
            this.componentHierarchies = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentHierarchyDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.componentHierarchies;
    }
    
    public void unsetComponentHierarchies() {
        if (this.componentHierarchies != null) {
            ((InternalEList.Unsettable)this.componentHierarchies).unset();
        }
    }
    
    public boolean isSetComponentHierarchies() {
        return this.componentHierarchies != null && ((InternalEList.Unsettable)this.componentHierarchies).isSet();
    }
    
    public List getFlowEntries() {
        if (this.flowEntries == null) {
            this.flowEntries = (EList)new EObjectResolvingEList.Unsettable((Class)WorkspaceFlowEntryDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.flowEntries;
    }
    
    public void unsetFlowEntries() {
        if (this.flowEntries != null) {
            ((InternalEList.Unsettable)this.flowEntries).unset();
        }
    }
    
    public boolean isSetFlowEntries() {
        return this.flowEntries != null && ((InternalEList.Unsettable)this.flowEntries).isSet();
    }
    
    public ReadScopeDTO getReadScope() {
        if (this.readScope != null && ((EObject)this.readScope).eIsProxy()) {
            final InternalEObject oldReadScope = (InternalEObject)this.readScope;
            this.readScope = (ReadScopeDTO)this.eResolveProxy(oldReadScope);
            if (this.readScope != oldReadScope && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 7, (Object)oldReadScope, (Object)this.readScope));
            }
        }
        return this.readScope;
    }
    
    public ReadScopeDTO basicGetReadScope() {
        return this.readScope;
    }
    
    public void setReadScope(final ReadScopeDTO newReadScope) {
        final ReadScopeDTO oldReadScope = this.readScope;
        this.readScope = newReadScope;
        final boolean oldReadScopeESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldReadScope, (Object)this.readScope, !oldReadScopeESet));
        }
    }
    
    public void unsetReadScope() {
        final ReadScopeDTO oldReadScope = this.readScope;
        final boolean oldReadScopeESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.readScope = null;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldReadScope, (Object)null, oldReadScopeESet));
        }
    }
    
    public boolean isSetReadScope() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.repositoryId = WorkspaceDetailsDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldRepositoryId, (Object)WorkspaceDetailsDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getComponents();
            }
            case 1: {
                return this.getComponentHierarchies();
            }
            case 2: {
                return this.getDescription();
            }
            case 3: {
                return this.getFlowEntries();
            }
            case 4: {
                return this.getItemId();
            }
            case 5: {
                return this.getName();
            }
            case 6: {
                if (resolve) {
                    return this.getOwner();
                }
                return this.basicGetOwner();
            }
            case 7: {
                if (resolve) {
                    return this.getReadScope();
                }
                return this.basicGetReadScope();
            }
            case 8: {
                return this.getRepositoryId();
            }
            case 9: {
                return this.getRepositoryURL();
            }
            case 10: {
                return this.isStream() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 11: {
                return this.getExclusiveFileLockPatterns();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getComponents().clear();
                this.getComponents().addAll((Collection)newValue);
            }
            case 1: {
                this.getComponentHierarchies().clear();
                this.getComponentHierarchies().addAll((Collection)newValue);
            }
            case 2: {
                this.setDescription((String)newValue);
            }
            case 3: {
                this.getFlowEntries().clear();
                this.getFlowEntries().addAll((Collection)newValue);
            }
            case 4: {
                this.setItemId((String)newValue);
            }
            case 5: {
                this.setName((String)newValue);
            }
            case 6: {
                this.setOwner((IAuditableHandle)newValue);
            }
            case 7: {
                this.setReadScope((ReadScopeDTO)newValue);
            }
            case 8: {
                this.setRepositoryId((String)newValue);
            }
            case 9: {
                this.setRepositoryURL((String)newValue);
            }
            case 10: {
                this.setStream((boolean)newValue);
            }
            case 11: {
                this.setExclusiveFileLockPatterns((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetComponents();
            }
            case 1: {
                this.unsetComponentHierarchies();
            }
            case 2: {
                this.unsetDescription();
            }
            case 3: {
                this.unsetFlowEntries();
            }
            case 4: {
                this.unsetItemId();
            }
            case 5: {
                this.unsetName();
            }
            case 6: {
                this.unsetOwner();
            }
            case 7: {
                this.unsetReadScope();
            }
            case 8: {
                this.unsetRepositoryId();
            }
            case 9: {
                this.unsetRepositoryURL();
            }
            case 10: {
                this.unsetStream();
            }
            case 11: {
                this.unsetExclusiveFileLockPatterns();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetComponents();
            }
            case 1: {
                return this.isSetComponentHierarchies();
            }
            case 2: {
                return this.isSetDescription();
            }
            case 3: {
                return this.isSetFlowEntries();
            }
            case 4: {
                return this.isSetItemId();
            }
            case 5: {
                return this.isSetName();
            }
            case 6: {
                return this.isSetOwner();
            }
            case 7: {
                return this.isSetReadScope();
            }
            case 8: {
                return this.isSetRepositoryId();
            }
            case 9: {
                return this.isSetRepositoryURL();
            }
            case 10: {
                return this.isSetStream();
            }
            case 11: {
                return this.isSetExclusiveFileLockPatterns();
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
        result.append(" (description: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.description);
        }
        else {
            result.append("<unset>");
        }
        result.append(", itemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.itemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", name: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryURL: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.repositoryURL);
        }
        else {
            result.append("<unset>");
        }
        result.append(", stream: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append((this.ALL_FLAGS & 0x80) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", exclusiveFileLockPatterns: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.exclusiveFileLockPatterns);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
