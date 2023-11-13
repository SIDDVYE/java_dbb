// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConnectionDescriptor2DTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ConnectionDescriptor2DTOImpl extends EObjectImpl implements ConnectionDescriptor2DTO
{
    protected int ALL_FLAGS;
    protected static final String CONTEXT_ITEM_ID_EDEFAULT;
    protected String contextItemId;
    protected static final int CONTEXT_ITEM_ID_ESETFLAG = 1;
    protected static final boolean IS_WORKSPACE_CONTEXT_EDEFAULT = false;
    protected static final int IS_WORKSPACE_CONTEXT_EFLAG = 2;
    protected static final int IS_WORKSPACE_CONTEXT_ESETFLAG = 4;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 8;
    
    static {
        CONTEXT_ITEM_ID_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
    }
    
    protected ConnectionDescriptor2DTOImpl() {
        this.ALL_FLAGS = 0;
        this.contextItemId = ConnectionDescriptor2DTOImpl.CONTEXT_ITEM_ID_EDEFAULT;
        this.repositoryId = ConnectionDescriptor2DTOImpl.REPOSITORY_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.CONNECTION_DESCRIPTOR2_DTO;
    }
    
    public String getContextItemId() {
        return this.contextItemId;
    }
    
    public void setContextItemId(final String newContextItemId) {
        final String oldContextItemId = this.contextItemId;
        this.contextItemId = newContextItemId;
        final boolean oldContextItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldContextItemId, (Object)this.contextItemId, !oldContextItemIdESet));
        }
    }
    
    public void unsetContextItemId() {
        final String oldContextItemId = this.contextItemId;
        final boolean oldContextItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.contextItemId = ConnectionDescriptor2DTOImpl.CONTEXT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldContextItemId, (Object)ConnectionDescriptor2DTOImpl.CONTEXT_ITEM_ID_EDEFAULT, oldContextItemIdESet));
        }
    }
    
    public boolean isSetContextItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public boolean isIsWorkspaceContext() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public void setIsWorkspaceContext(final boolean newIsWorkspaceContext) {
        final boolean oldIsWorkspaceContext = (this.ALL_FLAGS & 0x2) != 0x0;
        if (newIsWorkspaceContext) {
            this.ALL_FLAGS |= 0x2;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFD;
        }
        final boolean oldIsWorkspaceContextESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldIsWorkspaceContext, newIsWorkspaceContext, !oldIsWorkspaceContextESet));
        }
    }
    
    public void unsetIsWorkspaceContext() {
        final boolean oldIsWorkspaceContext = (this.ALL_FLAGS & 0x2) != 0x0;
        final boolean oldIsWorkspaceContextESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldIsWorkspaceContext, false, oldIsWorkspaceContextESet));
        }
    }
    
    public boolean isSetIsWorkspaceContext() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.repositoryId = ConnectionDescriptor2DTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldRepositoryId, (Object)ConnectionDescriptor2DTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getContextItemId();
            }
            case 1: {
                return this.isIsWorkspaceContext() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return this.getRepositoryId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setContextItemId((String)newValue);
            }
            case 1: {
                this.setIsWorkspaceContext((boolean)newValue);
            }
            case 2: {
                this.setRepositoryId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetContextItemId();
            }
            case 1: {
                this.unsetIsWorkspaceContext();
            }
            case 2: {
                this.unsetRepositoryId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetContextItemId();
            }
            case 1: {
                return this.isSetIsWorkspaceContext();
            }
            case 2: {
                return this.isSetRepositoryId();
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
        result.append(" (contextItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.contextItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", isWorkspaceContext: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append((this.ALL_FLAGS & 0x2) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
