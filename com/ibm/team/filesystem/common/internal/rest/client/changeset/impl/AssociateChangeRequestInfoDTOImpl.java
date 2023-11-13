// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.AssociateChangeRequestInfoDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class AssociateChangeRequestInfoDTOImpl extends EObjectImpl implements AssociateChangeRequestInfoDTO
{
    protected int ALL_FLAGS;
    protected static final String PROJECT_LINK_TYPE_EDEFAULT;
    protected String projectLinkType;
    protected static final int PROJECT_LINK_TYPE_ESETFLAG = 1;
    protected static final String PROJECT_LINK_LABEL_EDEFAULT;
    protected String projectLinkLabel;
    protected static final int PROJECT_LINK_LABEL_ESETFLAG = 2;
    protected static final String PROJECT_LINK_TARGET_SERVICE_URL_EDEFAULT;
    protected String projectLinkTargetServiceUrl;
    protected static final int PROJECT_LINK_TARGET_SERVICE_URL_ESETFLAG = 4;
    
    static {
        PROJECT_LINK_TYPE_EDEFAULT = null;
        PROJECT_LINK_LABEL_EDEFAULT = null;
        PROJECT_LINK_TARGET_SERVICE_URL_EDEFAULT = null;
    }
    
    protected AssociateChangeRequestInfoDTOImpl() {
        this.ALL_FLAGS = 0;
        this.projectLinkType = AssociateChangeRequestInfoDTOImpl.PROJECT_LINK_TYPE_EDEFAULT;
        this.projectLinkLabel = AssociateChangeRequestInfoDTOImpl.PROJECT_LINK_LABEL_EDEFAULT;
        this.projectLinkTargetServiceUrl = AssociateChangeRequestInfoDTOImpl.PROJECT_LINK_TARGET_SERVICE_URL_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.ASSOCIATE_CHANGE_REQUEST_INFO_DTO;
    }
    
    public String getProjectLinkType() {
        return this.projectLinkType;
    }
    
    public void setProjectLinkType(final String newProjectLinkType) {
        final String oldProjectLinkType = this.projectLinkType;
        this.projectLinkType = newProjectLinkType;
        final boolean oldProjectLinkTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldProjectLinkType, (Object)this.projectLinkType, !oldProjectLinkTypeESet));
        }
    }
    
    public void unsetProjectLinkType() {
        final String oldProjectLinkType = this.projectLinkType;
        final boolean oldProjectLinkTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.projectLinkType = AssociateChangeRequestInfoDTOImpl.PROJECT_LINK_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldProjectLinkType, (Object)AssociateChangeRequestInfoDTOImpl.PROJECT_LINK_TYPE_EDEFAULT, oldProjectLinkTypeESet));
        }
    }
    
    public boolean isSetProjectLinkType() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getProjectLinkLabel() {
        return this.projectLinkLabel;
    }
    
    public void setProjectLinkLabel(final String newProjectLinkLabel) {
        final String oldProjectLinkLabel = this.projectLinkLabel;
        this.projectLinkLabel = newProjectLinkLabel;
        final boolean oldProjectLinkLabelESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldProjectLinkLabel, (Object)this.projectLinkLabel, !oldProjectLinkLabelESet));
        }
    }
    
    public void unsetProjectLinkLabel() {
        final String oldProjectLinkLabel = this.projectLinkLabel;
        final boolean oldProjectLinkLabelESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.projectLinkLabel = AssociateChangeRequestInfoDTOImpl.PROJECT_LINK_LABEL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldProjectLinkLabel, (Object)AssociateChangeRequestInfoDTOImpl.PROJECT_LINK_LABEL_EDEFAULT, oldProjectLinkLabelESet));
        }
    }
    
    public boolean isSetProjectLinkLabel() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getProjectLinkTargetServiceUrl() {
        return this.projectLinkTargetServiceUrl;
    }
    
    public void setProjectLinkTargetServiceUrl(final String newProjectLinkTargetServiceUrl) {
        final String oldProjectLinkTargetServiceUrl = this.projectLinkTargetServiceUrl;
        this.projectLinkTargetServiceUrl = newProjectLinkTargetServiceUrl;
        final boolean oldProjectLinkTargetServiceUrlESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldProjectLinkTargetServiceUrl, (Object)this.projectLinkTargetServiceUrl, !oldProjectLinkTargetServiceUrlESet));
        }
    }
    
    public void unsetProjectLinkTargetServiceUrl() {
        final String oldProjectLinkTargetServiceUrl = this.projectLinkTargetServiceUrl;
        final boolean oldProjectLinkTargetServiceUrlESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.projectLinkTargetServiceUrl = AssociateChangeRequestInfoDTOImpl.PROJECT_LINK_TARGET_SERVICE_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldProjectLinkTargetServiceUrl, (Object)AssociateChangeRequestInfoDTOImpl.PROJECT_LINK_TARGET_SERVICE_URL_EDEFAULT, oldProjectLinkTargetServiceUrlESet));
        }
    }
    
    public boolean isSetProjectLinkTargetServiceUrl() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getProjectLinkType();
            }
            case 1: {
                return this.getProjectLinkLabel();
            }
            case 2: {
                return this.getProjectLinkTargetServiceUrl();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setProjectLinkType((String)newValue);
            }
            case 1: {
                this.setProjectLinkLabel((String)newValue);
            }
            case 2: {
                this.setProjectLinkTargetServiceUrl((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetProjectLinkType();
            }
            case 1: {
                this.unsetProjectLinkLabel();
            }
            case 2: {
                this.unsetProjectLinkTargetServiceUrl();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetProjectLinkType();
            }
            case 1: {
                return this.isSetProjectLinkLabel();
            }
            case 2: {
                return this.isSetProjectLinkTargetServiceUrl();
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
        result.append(" (projectLinkType: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.projectLinkType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", projectLinkLabel: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.projectLinkLabel);
        }
        else {
            result.append("<unset>");
        }
        result.append(", projectLinkTargetServiceUrl: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.projectLinkTargetServiceUrl);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
