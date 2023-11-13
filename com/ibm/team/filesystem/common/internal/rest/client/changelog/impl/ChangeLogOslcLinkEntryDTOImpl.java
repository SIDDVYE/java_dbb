// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogOslcLinkEntryDTO;

public class ChangeLogOslcLinkEntryDTOImpl extends ChangeLogEntryDTOImpl implements ChangeLogOslcLinkEntryDTO
{
    protected static final String TARGET_URI_EDEFAULT;
    protected String targetUri;
    protected static final int TARGET_URI_ESETFLAG = 8;
    
    static {
        TARGET_URI_EDEFAULT = null;
    }
    
    protected ChangeLogOslcLinkEntryDTOImpl() {
        this.targetUri = ChangeLogOslcLinkEntryDTOImpl.TARGET_URI_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangelogPackage.Literals.CHANGE_LOG_OSLC_LINK_ENTRY_DTO;
    }
    
    @Override
    public String getTargetUri() {
        return this.targetUri;
    }
    
    @Override
    public void setTargetUri(final String newTargetUri) {
        final String oldTargetUri = this.targetUri;
        this.targetUri = newTargetUri;
        final boolean oldTargetUriESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldTargetUri, (Object)this.targetUri, !oldTargetUriESet));
        }
    }
    
    @Override
    public void unsetTargetUri() {
        final String oldTargetUri = this.targetUri;
        final boolean oldTargetUriESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.targetUri = ChangeLogOslcLinkEntryDTOImpl.TARGET_URI_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldTargetUri, (Object)ChangeLogOslcLinkEntryDTOImpl.TARGET_URI_EDEFAULT, oldTargetUriESet));
        }
    }
    
    @Override
    public boolean isSetTargetUri() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getTargetUri();
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
                this.setTargetUri((String)newValue);
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
                this.unsetTargetUri();
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
                return this.isSetTargetUri();
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
        result.append(" (targetUri: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.targetUri);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
