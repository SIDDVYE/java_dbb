// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogRootEntryDTO;

public class ChangeLogRootEntryDTOImpl extends ChangeLogEntryDTOImpl implements ChangeLogRootEntryDTO
{
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 8;
    protected static final String REPOSITORY_URI_EDEFAULT;
    protected String repositoryUri;
    protected static final int REPOSITORY_URI_ESETFLAG = 16;
    
    static {
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URI_EDEFAULT = null;
    }
    
    protected ChangeLogRootEntryDTOImpl() {
        this.repositoryId = ChangeLogRootEntryDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryUri = ChangeLogRootEntryDTOImpl.REPOSITORY_URI_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangelogPackage.Literals.CHANGE_LOG_ROOT_ENTRY_DTO;
    }
    
    @Override
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    @Override
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    @Override
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.repositoryId = ChangeLogRootEntryDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldRepositoryId, (Object)ChangeLogRootEntryDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    @Override
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    @Override
    public String getRepositoryUri() {
        return this.repositoryUri;
    }
    
    @Override
    public void setRepositoryUri(final String newRepositoryUri) {
        final String oldRepositoryUri = this.repositoryUri;
        this.repositoryUri = newRepositoryUri;
        final boolean oldRepositoryUriESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldRepositoryUri, (Object)this.repositoryUri, !oldRepositoryUriESet));
        }
    }
    
    @Override
    public void unsetRepositoryUri() {
        final String oldRepositoryUri = this.repositoryUri;
        final boolean oldRepositoryUriESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.repositoryUri = ChangeLogRootEntryDTOImpl.REPOSITORY_URI_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldRepositoryUri, (Object)ChangeLogRootEntryDTOImpl.REPOSITORY_URI_EDEFAULT, oldRepositoryUriESet));
        }
    }
    
    @Override
    public boolean isSetRepositoryUri() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getRepositoryId();
            }
            case 5: {
                return this.getRepositoryUri();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 4: {
                this.setRepositoryId((String)newValue);
            }
            case 5: {
                this.setRepositoryUri((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 4: {
                this.unsetRepositoryId();
            }
            case 5: {
                this.unsetRepositoryUri();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 4: {
                return this.isSetRepositoryId();
            }
            case 5: {
                return this.isSetRepositoryUri();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (repositoryId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryUri: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.repositoryUri);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
