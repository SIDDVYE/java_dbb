// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import com.ibm.team.filesystem.common.internal.rest.client.patch.PageDescriptorDTO;
import com.ibm.team.repository.common.model.impl.HelperImpl;

public class PageDescriptorDTOImpl extends HelperImpl implements PageDescriptorDTO
{
    protected int ALL_FLAGS;
    protected static final String REPOSITORY_URI_EDEFAULT;
    protected String repositoryURI;
    protected static final int REPOSITORY_URI_ESETFLAG = 2;
    protected static final String WORKSPACE_ID_EDEFAULT;
    protected String workspaceID;
    protected static final int WORKSPACE_ID_ESETFLAG = 4;
    protected static final String COMPONENT_ID_EDEFAULT;
    protected String componentID;
    protected static final int COMPONENT_ID_ESETFLAG = 8;
    protected static final int MAX_PAGE_SIZE_EDEFAULT = 0;
    protected int maxPageSize;
    protected static final int MAX_PAGE_SIZE_ESETFLAG = 16;
    protected static final long START_INDEX_EDEFAULT = 0L;
    protected long startIndex;
    protected static final int START_INDEX_ESETFLAG = 32;
    protected static final long TOTAL_SIZE_EDEFAULT = 0L;
    protected long totalSize;
    protected static final int TOTAL_SIZE_ESETFLAG = 64;
    protected static final long SYNC_TIME_EDEFAULT = 0L;
    protected long syncTime;
    protected static final int SYNC_TIME_ESETFLAG = 128;
    private static final int EOFFSET_CORRECTION;
    
    static {
        REPOSITORY_URI_EDEFAULT = null;
        WORKSPACE_ID_EDEFAULT = null;
        COMPONENT_ID_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemRestClientDTOpatchPackage.Literals.PAGE_DESCRIPTOR_DTO.getFeatureID((EStructuralFeature)FilesystemRestClientDTOpatchPackage.Literals.PAGE_DESCRIPTOR_DTO__REPOSITORY_URI) - 1;
    }
    
    protected PageDescriptorDTOImpl() {
        this.ALL_FLAGS = 0;
        this.repositoryURI = PageDescriptorDTOImpl.REPOSITORY_URI_EDEFAULT;
        this.workspaceID = PageDescriptorDTOImpl.WORKSPACE_ID_EDEFAULT;
        this.componentID = PageDescriptorDTOImpl.COMPONENT_ID_EDEFAULT;
        this.maxPageSize = 0;
        this.startIndex = 0L;
        this.totalSize = 0L;
        this.syncTime = 0L;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.PAGE_DESCRIPTOR_DTO;
    }
    
    public String getRepositoryURI() {
        return this.repositoryURI;
    }
    
    public void setRepositoryURI(final String newRepositoryURI) {
        final String oldRepositoryURI = this.repositoryURI;
        this.repositoryURI = newRepositoryURI;
        final boolean oldRepositoryURIESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, (Object)oldRepositoryURI, (Object)this.repositoryURI, !oldRepositoryURIESet));
        }
    }
    
    public void unsetRepositoryURI() {
        final String oldRepositoryURI = this.repositoryURI;
        final boolean oldRepositoryURIESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.repositoryURI = PageDescriptorDTOImpl.REPOSITORY_URI_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, (Object)oldRepositoryURI, (Object)PageDescriptorDTOImpl.REPOSITORY_URI_EDEFAULT, oldRepositoryURIESet));
        }
    }
    
    public boolean isSetRepositoryURI() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getWorkspaceID() {
        return this.workspaceID;
    }
    
    public void setWorkspaceID(final String newWorkspaceID) {
        final String oldWorkspaceID = this.workspaceID;
        this.workspaceID = newWorkspaceID;
        final boolean oldWorkspaceIDESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, (Object)oldWorkspaceID, (Object)this.workspaceID, !oldWorkspaceIDESet));
        }
    }
    
    public void unsetWorkspaceID() {
        final String oldWorkspaceID = this.workspaceID;
        final boolean oldWorkspaceIDESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.workspaceID = PageDescriptorDTOImpl.WORKSPACE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, (Object)oldWorkspaceID, (Object)PageDescriptorDTOImpl.WORKSPACE_ID_EDEFAULT, oldWorkspaceIDESet));
        }
    }
    
    public boolean isSetWorkspaceID() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getComponentID() {
        return this.componentID;
    }
    
    public void setComponentID(final String newComponentID) {
        final String oldComponentID = this.componentID;
        this.componentID = newComponentID;
        final boolean oldComponentIDESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, (Object)oldComponentID, (Object)this.componentID, !oldComponentIDESet));
        }
    }
    
    public void unsetComponentID() {
        final String oldComponentID = this.componentID;
        final boolean oldComponentIDESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.componentID = PageDescriptorDTOImpl.COMPONENT_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, (Object)oldComponentID, (Object)PageDescriptorDTOImpl.COMPONENT_ID_EDEFAULT, oldComponentIDESet));
        }
    }
    
    public boolean isSetComponentID() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public int getMaxPageSize() {
        return this.maxPageSize;
    }
    
    public void setMaxPageSize(final int newMaxPageSize) {
        final int oldMaxPageSize = this.maxPageSize;
        this.maxPageSize = newMaxPageSize;
        final boolean oldMaxPageSizeESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, oldMaxPageSize, this.maxPageSize, !oldMaxPageSizeESet));
        }
    }
    
    public void unsetMaxPageSize() {
        final int oldMaxPageSize = this.maxPageSize;
        final boolean oldMaxPageSizeESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.maxPageSize = 0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, oldMaxPageSize, 0, oldMaxPageSizeESet));
        }
    }
    
    public boolean isSetMaxPageSize() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public long getStartIndex() {
        return this.startIndex;
    }
    
    public void setStartIndex(final long newStartIndex) {
        final long oldStartIndex = this.startIndex;
        this.startIndex = newStartIndex;
        final boolean oldStartIndexESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, oldStartIndex, this.startIndex, !oldStartIndexESet));
        }
    }
    
    public void unsetStartIndex() {
        final long oldStartIndex = this.startIndex;
        final boolean oldStartIndexESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.startIndex = 0L;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, oldStartIndex, 0L, oldStartIndexESet));
        }
    }
    
    public boolean isSetStartIndex() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public long getTotalSize() {
        return this.totalSize;
    }
    
    public void setTotalSize(final long newTotalSize) {
        final long oldTotalSize = this.totalSize;
        this.totalSize = newTotalSize;
        final boolean oldTotalSizeESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, oldTotalSize, this.totalSize, !oldTotalSizeESet));
        }
    }
    
    public void unsetTotalSize() {
        final long oldTotalSize = this.totalSize;
        final boolean oldTotalSizeESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.totalSize = 0L;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, oldTotalSize, 0L, oldTotalSizeESet));
        }
    }
    
    public boolean isSetTotalSize() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public long getSyncTime() {
        return this.syncTime;
    }
    
    public void setSyncTime(final long newSyncTime) {
        final long oldSyncTime = this.syncTime;
        this.syncTime = newSyncTime;
        final boolean oldSyncTimeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, oldSyncTime, this.syncTime, !oldSyncTimeESet));
        }
    }
    
    public void unsetSyncTime() {
        final long oldSyncTime = this.syncTime;
        final boolean oldSyncTimeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.syncTime = 0L;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7 + PageDescriptorDTOImpl.EOFFSET_CORRECTION, oldSyncTime, 0L, oldSyncTimeESet));
        }
    }
    
    public boolean isSetSyncTime() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - PageDescriptorDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.getRepositoryURI();
            }
            case 2: {
                return this.getWorkspaceID();
            }
            case 3: {
                return this.getComponentID();
            }
            case 4: {
                return new Integer(this.getMaxPageSize());
            }
            case 5: {
                return new Long(this.getStartIndex());
            }
            case 6: {
                return new Long(this.getTotalSize());
            }
            case 7: {
                return new Long(this.getSyncTime());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - PageDescriptorDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.setRepositoryURI((String)newValue);
            }
            case 2: {
                this.setWorkspaceID((String)newValue);
            }
            case 3: {
                this.setComponentID((String)newValue);
            }
            case 4: {
                this.setMaxPageSize((int)newValue);
            }
            case 5: {
                this.setStartIndex((long)newValue);
            }
            case 6: {
                this.setTotalSize((long)newValue);
            }
            case 7: {
                this.setSyncTime((long)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - PageDescriptorDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.unsetRepositoryURI();
            }
            case 2: {
                this.unsetWorkspaceID();
            }
            case 3: {
                this.unsetComponentID();
            }
            case 4: {
                this.unsetMaxPageSize();
            }
            case 5: {
                this.unsetStartIndex();
            }
            case 6: {
                this.unsetTotalSize();
            }
            case 7: {
                this.unsetSyncTime();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - PageDescriptorDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.isSetRepositoryURI();
            }
            case 2: {
                return this.isSetWorkspaceID();
            }
            case 3: {
                return this.isSetComponentID();
            }
            case 4: {
                return this.isSetMaxPageSize();
            }
            case 5: {
                return this.isSetStartIndex();
            }
            case 6: {
                return this.isSetTotalSize();
            }
            case 7: {
                return this.isSetSyncTime();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass != PageDescriptorDTO.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - PageDescriptorDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return 1 + PageDescriptorDTOImpl.EOFFSET_CORRECTION;
            }
            case 2: {
                return 2 + PageDescriptorDTOImpl.EOFFSET_CORRECTION;
            }
            case 3: {
                return 3 + PageDescriptorDTOImpl.EOFFSET_CORRECTION;
            }
            case 4: {
                return 4 + PageDescriptorDTOImpl.EOFFSET_CORRECTION;
            }
            case 5: {
                return 5 + PageDescriptorDTOImpl.EOFFSET_CORRECTION;
            }
            case 6: {
                return 6 + PageDescriptorDTOImpl.EOFFSET_CORRECTION;
            }
            case 7: {
                return 7 + PageDescriptorDTOImpl.EOFFSET_CORRECTION;
            }
            default: {
                return -1;
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (repositoryURI: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.repositoryURI);
        }
        else {
            result.append("<unset>");
        }
        result.append(", workspaceID: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.workspaceID);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentID: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.componentID);
        }
        else {
            result.append("<unset>");
        }
        result.append(", maxPageSize: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.maxPageSize);
        }
        else {
            result.append("<unset>");
        }
        result.append(", startIndex: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.startIndex);
        }
        else {
            result.append("<unset>");
        }
        result.append(", totalSize: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.totalSize);
        }
        else {
            result.append("<unset>");
        }
        result.append(", syncTime: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.syncTime);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
