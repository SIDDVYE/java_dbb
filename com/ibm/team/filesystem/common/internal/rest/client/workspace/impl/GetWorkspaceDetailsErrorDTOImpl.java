// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.GetWorkspaceDetailsErrorDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class GetWorkspaceDetailsErrorDTOImpl extends EObjectImpl implements GetWorkspaceDetailsErrorDTO
{
    protected int ALL_FLAGS;
    protected static final String MESSAGE_EDEFAULT;
    protected String message;
    protected static final int MESSAGE_ESETFLAG = 1;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 2;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryUrl;
    protected static final int REPOSITORY_URL_ESETFLAG = 4;
    protected static final String WORKSPACE_ID_EDEFAULT;
    protected String workspaceId;
    protected static final int WORKSPACE_ID_ESETFLAG = 8;
    
    static {
        MESSAGE_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        WORKSPACE_ID_EDEFAULT = null;
    }
    
    protected GetWorkspaceDetailsErrorDTOImpl() {
        this.ALL_FLAGS = 0;
        this.message = GetWorkspaceDetailsErrorDTOImpl.MESSAGE_EDEFAULT;
        this.repositoryId = GetWorkspaceDetailsErrorDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryUrl = GetWorkspaceDetailsErrorDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.workspaceId = GetWorkspaceDetailsErrorDTOImpl.WORKSPACE_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOworkspacePackage.Literals.GET_WORKSPACE_DETAILS_ERROR_DTO;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(final String newMessage) {
        final String oldMessage = this.message;
        this.message = newMessage;
        final boolean oldMessageESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldMessage, (Object)this.message, !oldMessageESet));
        }
    }
    
    public void unsetMessage() {
        final String oldMessage = this.message;
        final boolean oldMessageESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.message = GetWorkspaceDetailsErrorDTOImpl.MESSAGE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldMessage, (Object)GetWorkspaceDetailsErrorDTOImpl.MESSAGE_EDEFAULT, oldMessageESet));
        }
    }
    
    public boolean isSetMessage() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.repositoryId = GetWorkspaceDetailsErrorDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldRepositoryId, (Object)GetWorkspaceDetailsErrorDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    
    public void setRepositoryUrl(final String newRepositoryUrl) {
        final String oldRepositoryUrl = this.repositoryUrl;
        this.repositoryUrl = newRepositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldRepositoryUrl, (Object)this.repositoryUrl, !oldRepositoryUrlESet));
        }
    }
    
    public void unsetRepositoryUrl() {
        final String oldRepositoryUrl = this.repositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.repositoryUrl = GetWorkspaceDetailsErrorDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldRepositoryUrl, (Object)GetWorkspaceDetailsErrorDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryUrlESet));
        }
    }
    
    public boolean isSetRepositoryUrl() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getWorkspaceId() {
        return this.workspaceId;
    }
    
    public void setWorkspaceId(final String newWorkspaceId) {
        final String oldWorkspaceId = this.workspaceId;
        this.workspaceId = newWorkspaceId;
        final boolean oldWorkspaceIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldWorkspaceId, (Object)this.workspaceId, !oldWorkspaceIdESet));
        }
    }
    
    public void unsetWorkspaceId() {
        final String oldWorkspaceId = this.workspaceId;
        final boolean oldWorkspaceIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.workspaceId = GetWorkspaceDetailsErrorDTOImpl.WORKSPACE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldWorkspaceId, (Object)GetWorkspaceDetailsErrorDTOImpl.WORKSPACE_ID_EDEFAULT, oldWorkspaceIdESet));
        }
    }
    
    public boolean isSetWorkspaceId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getMessage();
            }
            case 1: {
                return this.getRepositoryId();
            }
            case 2: {
                return this.getRepositoryUrl();
            }
            case 3: {
                return this.getWorkspaceId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setMessage((String)newValue);
            }
            case 1: {
                this.setRepositoryId((String)newValue);
            }
            case 2: {
                this.setRepositoryUrl((String)newValue);
            }
            case 3: {
                this.setWorkspaceId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetMessage();
            }
            case 1: {
                this.unsetRepositoryId();
            }
            case 2: {
                this.unsetRepositoryUrl();
            }
            case 3: {
                this.unsetWorkspaceId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetMessage();
            }
            case 1: {
                return this.isSetRepositoryId();
            }
            case 2: {
                return this.isSetRepositoryUrl();
            }
            case 3: {
                return this.isSetWorkspaceId();
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
        result.append(" (message: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.message);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryUrl: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.repositoryUrl);
        }
        else {
            result.append("<unset>");
        }
        result.append(", workspaceId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.workspaceId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
