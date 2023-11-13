// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OslcLinkDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class OslcLinkDTOImpl extends EObjectImpl implements OslcLinkDTO
{
    protected int ALL_FLAGS;
    protected static final String LINK_TYPE_ID_EDEFAULT;
    protected String linkTypeId;
    protected static final int LINK_TYPE_ID_ESETFLAG = 1;
    protected static final String LOCAL_DESCRIPTION_EDEFAULT;
    protected String localDescription;
    protected static final int LOCAL_DESCRIPTION_ESETFLAG = 2;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 4;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryUrl;
    protected static final int REPOSITORY_URL_ESETFLAG = 8;
    protected static final String RESOLVED_DESCRIPTION_EDEFAULT;
    protected String resolvedDescription;
    protected static final int RESOLVED_DESCRIPTION_ESETFLAG = 16;
    protected static final String RESOLVED_ICON_URI_EDEFAULT;
    protected String resolvedIconUri;
    protected static final int RESOLVED_ICON_URI_ESETFLAG = 32;
    protected static final String TARGET_EXTRA_INFO_EDEFAULT;
    protected String targetExtraInfo;
    protected static final int TARGET_EXTRA_INFO_ESETFLAG = 64;
    protected static final String TARGET_CONTENT_TYPE_EDEFAULT;
    protected String targetContentType;
    protected static final int TARGET_CONTENT_TYPE_ESETFLAG = 128;
    protected static final String TARGET_REPOSITORY_ID_EDEFAULT;
    protected String targetRepositoryId;
    protected static final int TARGET_REPOSITORY_ID_ESETFLAG = 256;
    protected static final String TARGET_REPOSITORY_URL_EDEFAULT;
    protected String targetRepositoryUrl;
    protected static final int TARGET_REPOSITORY_URL_ESETFLAG = 512;
    protected static final String TARGET_URI_EDEFAULT;
    protected String targetUri;
    protected static final int TARGET_URI_ESETFLAG = 1024;
    
    static {
        LINK_TYPE_ID_EDEFAULT = null;
        LOCAL_DESCRIPTION_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        RESOLVED_DESCRIPTION_EDEFAULT = null;
        RESOLVED_ICON_URI_EDEFAULT = null;
        TARGET_EXTRA_INFO_EDEFAULT = null;
        TARGET_CONTENT_TYPE_EDEFAULT = null;
        TARGET_REPOSITORY_ID_EDEFAULT = null;
        TARGET_REPOSITORY_URL_EDEFAULT = null;
        TARGET_URI_EDEFAULT = null;
    }
    
    protected OslcLinkDTOImpl() {
        this.ALL_FLAGS = 0;
        this.linkTypeId = OslcLinkDTOImpl.LINK_TYPE_ID_EDEFAULT;
        this.localDescription = OslcLinkDTOImpl.LOCAL_DESCRIPTION_EDEFAULT;
        this.repositoryId = OslcLinkDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryUrl = OslcLinkDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.resolvedDescription = OslcLinkDTOImpl.RESOLVED_DESCRIPTION_EDEFAULT;
        this.resolvedIconUri = OslcLinkDTOImpl.RESOLVED_ICON_URI_EDEFAULT;
        this.targetExtraInfo = OslcLinkDTOImpl.TARGET_EXTRA_INFO_EDEFAULT;
        this.targetContentType = OslcLinkDTOImpl.TARGET_CONTENT_TYPE_EDEFAULT;
        this.targetRepositoryId = OslcLinkDTOImpl.TARGET_REPOSITORY_ID_EDEFAULT;
        this.targetRepositoryUrl = OslcLinkDTOImpl.TARGET_REPOSITORY_URL_EDEFAULT;
        this.targetUri = OslcLinkDTOImpl.TARGET_URI_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.OSLC_LINK_DTO;
    }
    
    public String getTargetUri() {
        return this.targetUri;
    }
    
    public void setTargetUri(final String newTargetUri) {
        final String oldTargetUri = this.targetUri;
        this.targetUri = newTargetUri;
        final boolean oldTargetUriESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, (Object)oldTargetUri, (Object)this.targetUri, !oldTargetUriESet));
        }
    }
    
    public void unsetTargetUri() {
        final String oldTargetUri = this.targetUri;
        final boolean oldTargetUriESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.targetUri = OslcLinkDTOImpl.TARGET_URI_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, (Object)oldTargetUri, (Object)OslcLinkDTOImpl.TARGET_URI_EDEFAULT, oldTargetUriESet));
        }
    }
    
    public boolean isSetTargetUri() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public String getLinkTypeId() {
        return this.linkTypeId;
    }
    
    public void setLinkTypeId(final String newLinkTypeId) {
        final String oldLinkTypeId = this.linkTypeId;
        this.linkTypeId = newLinkTypeId;
        final boolean oldLinkTypeIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldLinkTypeId, (Object)this.linkTypeId, !oldLinkTypeIdESet));
        }
    }
    
    public void unsetLinkTypeId() {
        final String oldLinkTypeId = this.linkTypeId;
        final boolean oldLinkTypeIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.linkTypeId = OslcLinkDTOImpl.LINK_TYPE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldLinkTypeId, (Object)OslcLinkDTOImpl.LINK_TYPE_ID_EDEFAULT, oldLinkTypeIdESet));
        }
    }
    
    public boolean isSetLinkTypeId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getTargetExtraInfo() {
        return this.targetExtraInfo;
    }
    
    public void setTargetExtraInfo(final String newTargetExtraInfo) {
        final String oldTargetExtraInfo = this.targetExtraInfo;
        this.targetExtraInfo = newTargetExtraInfo;
        final boolean oldTargetExtraInfoESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldTargetExtraInfo, (Object)this.targetExtraInfo, !oldTargetExtraInfoESet));
        }
    }
    
    public void unsetTargetExtraInfo() {
        final String oldTargetExtraInfo = this.targetExtraInfo;
        final boolean oldTargetExtraInfoESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.targetExtraInfo = OslcLinkDTOImpl.TARGET_EXTRA_INFO_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldTargetExtraInfo, (Object)OslcLinkDTOImpl.TARGET_EXTRA_INFO_EDEFAULT, oldTargetExtraInfoESet));
        }
    }
    
    public boolean isSetTargetExtraInfo() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getTargetContentType() {
        return this.targetContentType;
    }
    
    public void setTargetContentType(final String newTargetContentType) {
        final String oldTargetContentType = this.targetContentType;
        this.targetContentType = newTargetContentType;
        final boolean oldTargetContentTypeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldTargetContentType, (Object)this.targetContentType, !oldTargetContentTypeESet));
        }
    }
    
    public void unsetTargetContentType() {
        final String oldTargetContentType = this.targetContentType;
        final boolean oldTargetContentTypeESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.targetContentType = OslcLinkDTOImpl.TARGET_CONTENT_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldTargetContentType, (Object)OslcLinkDTOImpl.TARGET_CONTENT_TYPE_EDEFAULT, oldTargetContentTypeESet));
        }
    }
    
    public boolean isSetTargetContentType() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public String getTargetRepositoryId() {
        return this.targetRepositoryId;
    }
    
    public void setTargetRepositoryId(final String newTargetRepositoryId) {
        final String oldTargetRepositoryId = this.targetRepositoryId;
        this.targetRepositoryId = newTargetRepositoryId;
        final boolean oldTargetRepositoryIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldTargetRepositoryId, (Object)this.targetRepositoryId, !oldTargetRepositoryIdESet));
        }
    }
    
    public void unsetTargetRepositoryId() {
        final String oldTargetRepositoryId = this.targetRepositoryId;
        final boolean oldTargetRepositoryIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.targetRepositoryId = OslcLinkDTOImpl.TARGET_REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldTargetRepositoryId, (Object)OslcLinkDTOImpl.TARGET_REPOSITORY_ID_EDEFAULT, oldTargetRepositoryIdESet));
        }
    }
    
    public boolean isSetTargetRepositoryId() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public String getLocalDescription() {
        return this.localDescription;
    }
    
    public void setLocalDescription(final String newLocalDescription) {
        final String oldLocalDescription = this.localDescription;
        this.localDescription = newLocalDescription;
        final boolean oldLocalDescriptionESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldLocalDescription, (Object)this.localDescription, !oldLocalDescriptionESet));
        }
    }
    
    public void unsetLocalDescription() {
        final String oldLocalDescription = this.localDescription;
        final boolean oldLocalDescriptionESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.localDescription = OslcLinkDTOImpl.LOCAL_DESCRIPTION_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldLocalDescription, (Object)OslcLinkDTOImpl.LOCAL_DESCRIPTION_EDEFAULT, oldLocalDescriptionESet));
        }
    }
    
    public boolean isSetLocalDescription() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.repositoryId = OslcLinkDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldRepositoryId, (Object)OslcLinkDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getResolvedDescription() {
        return this.resolvedDescription;
    }
    
    public void setResolvedDescription(final String newResolvedDescription) {
        final String oldResolvedDescription = this.resolvedDescription;
        this.resolvedDescription = newResolvedDescription;
        final boolean oldResolvedDescriptionESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldResolvedDescription, (Object)this.resolvedDescription, !oldResolvedDescriptionESet));
        }
    }
    
    public void unsetResolvedDescription() {
        final String oldResolvedDescription = this.resolvedDescription;
        final boolean oldResolvedDescriptionESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.resolvedDescription = OslcLinkDTOImpl.RESOLVED_DESCRIPTION_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldResolvedDescription, (Object)OslcLinkDTOImpl.RESOLVED_DESCRIPTION_EDEFAULT, oldResolvedDescriptionESet));
        }
    }
    
    public boolean isSetResolvedDescription() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getResolvedIconUri() {
        return this.resolvedIconUri;
    }
    
    public void setResolvedIconUri(final String newResolvedIconUri) {
        final String oldResolvedIconUri = this.resolvedIconUri;
        this.resolvedIconUri = newResolvedIconUri;
        final boolean oldResolvedIconUriESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldResolvedIconUri, (Object)this.resolvedIconUri, !oldResolvedIconUriESet));
        }
    }
    
    public void unsetResolvedIconUri() {
        final String oldResolvedIconUri = this.resolvedIconUri;
        final boolean oldResolvedIconUriESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.resolvedIconUri = OslcLinkDTOImpl.RESOLVED_ICON_URI_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldResolvedIconUri, (Object)OslcLinkDTOImpl.RESOLVED_ICON_URI_EDEFAULT, oldResolvedIconUriESet));
        }
    }
    
    public boolean isSetResolvedIconUri() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    
    public void setRepositoryUrl(final String newRepositoryUrl) {
        final String oldRepositoryUrl = this.repositoryUrl;
        this.repositoryUrl = newRepositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldRepositoryUrl, (Object)this.repositoryUrl, !oldRepositoryUrlESet));
        }
    }
    
    public void unsetRepositoryUrl() {
        final String oldRepositoryUrl = this.repositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.repositoryUrl = OslcLinkDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldRepositoryUrl, (Object)OslcLinkDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryUrlESet));
        }
    }
    
    public boolean isSetRepositoryUrl() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getTargetRepositoryUrl() {
        return this.targetRepositoryUrl;
    }
    
    public void setTargetRepositoryUrl(final String newTargetRepositoryUrl) {
        final String oldTargetRepositoryUrl = this.targetRepositoryUrl;
        this.targetRepositoryUrl = newTargetRepositoryUrl;
        final boolean oldTargetRepositoryUrlESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldTargetRepositoryUrl, (Object)this.targetRepositoryUrl, !oldTargetRepositoryUrlESet));
        }
    }
    
    public void unsetTargetRepositoryUrl() {
        final String oldTargetRepositoryUrl = this.targetRepositoryUrl;
        final boolean oldTargetRepositoryUrlESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.targetRepositoryUrl = OslcLinkDTOImpl.TARGET_REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldTargetRepositoryUrl, (Object)OslcLinkDTOImpl.TARGET_REPOSITORY_URL_EDEFAULT, oldTargetRepositoryUrlESet));
        }
    }
    
    public boolean isSetTargetRepositoryUrl() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getLinkTypeId();
            }
            case 1: {
                return this.getLocalDescription();
            }
            case 2: {
                return this.getRepositoryId();
            }
            case 3: {
                return this.getRepositoryUrl();
            }
            case 4: {
                return this.getResolvedDescription();
            }
            case 5: {
                return this.getResolvedIconUri();
            }
            case 6: {
                return this.getTargetExtraInfo();
            }
            case 7: {
                return this.getTargetContentType();
            }
            case 8: {
                return this.getTargetRepositoryId();
            }
            case 9: {
                return this.getTargetRepositoryUrl();
            }
            case 10: {
                return this.getTargetUri();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setLinkTypeId((String)newValue);
            }
            case 1: {
                this.setLocalDescription((String)newValue);
            }
            case 2: {
                this.setRepositoryId((String)newValue);
            }
            case 3: {
                this.setRepositoryUrl((String)newValue);
            }
            case 4: {
                this.setResolvedDescription((String)newValue);
            }
            case 5: {
                this.setResolvedIconUri((String)newValue);
            }
            case 6: {
                this.setTargetExtraInfo((String)newValue);
            }
            case 7: {
                this.setTargetContentType((String)newValue);
            }
            case 8: {
                this.setTargetRepositoryId((String)newValue);
            }
            case 9: {
                this.setTargetRepositoryUrl((String)newValue);
            }
            case 10: {
                this.setTargetUri((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetLinkTypeId();
            }
            case 1: {
                this.unsetLocalDescription();
            }
            case 2: {
                this.unsetRepositoryId();
            }
            case 3: {
                this.unsetRepositoryUrl();
            }
            case 4: {
                this.unsetResolvedDescription();
            }
            case 5: {
                this.unsetResolvedIconUri();
            }
            case 6: {
                this.unsetTargetExtraInfo();
            }
            case 7: {
                this.unsetTargetContentType();
            }
            case 8: {
                this.unsetTargetRepositoryId();
            }
            case 9: {
                this.unsetTargetRepositoryUrl();
            }
            case 10: {
                this.unsetTargetUri();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetLinkTypeId();
            }
            case 1: {
                return this.isSetLocalDescription();
            }
            case 2: {
                return this.isSetRepositoryId();
            }
            case 3: {
                return this.isSetRepositoryUrl();
            }
            case 4: {
                return this.isSetResolvedDescription();
            }
            case 5: {
                return this.isSetResolvedIconUri();
            }
            case 6: {
                return this.isSetTargetExtraInfo();
            }
            case 7: {
                return this.isSetTargetContentType();
            }
            case 8: {
                return this.isSetTargetRepositoryId();
            }
            case 9: {
                return this.isSetTargetRepositoryUrl();
            }
            case 10: {
                return this.isSetTargetUri();
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
        result.append(" (linkTypeId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.linkTypeId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", localDescription: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.localDescription);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryUrl: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.repositoryUrl);
        }
        else {
            result.append("<unset>");
        }
        result.append(", resolvedDescription: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.resolvedDescription);
        }
        else {
            result.append("<unset>");
        }
        result.append(", resolvedIconUri: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.resolvedIconUri);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetExtraInfo: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.targetExtraInfo);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetContentType: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append(this.targetContentType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetRepositoryId: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.targetRepositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetRepositoryUrl: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.targetRepositoryUrl);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetUri: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append(this.targetUri);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
