// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogComponentEntryDTO;

public class ChangeLogComponentEntryDTOImpl extends ChangeLogEntryDTOImpl implements ChangeLogComponentEntryDTO
{
    protected static final String CHANGE_TYPE_EDEFAULT;
    protected String changeType;
    protected static final int CHANGE_TYPE_ESETFLAG = 8;
    
    static {
        CHANGE_TYPE_EDEFAULT = null;
    }
    
    protected ChangeLogComponentEntryDTOImpl() {
        this.changeType = ChangeLogComponentEntryDTOImpl.CHANGE_TYPE_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangelogPackage.Literals.CHANGE_LOG_COMPONENT_ENTRY_DTO;
    }
    
    @Override
    public String getChangeType() {
        return this.changeType;
    }
    
    @Override
    public void setChangeType(final String newChangeType) {
        final String oldChangeType = this.changeType;
        this.changeType = newChangeType;
        final boolean oldChangeTypeESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldChangeType, (Object)this.changeType, !oldChangeTypeESet));
        }
    }
    
    @Override
    public void unsetChangeType() {
        final String oldChangeType = this.changeType;
        final boolean oldChangeTypeESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.changeType = ChangeLogComponentEntryDTOImpl.CHANGE_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldChangeType, (Object)ChangeLogComponentEntryDTOImpl.CHANGE_TYPE_EDEFAULT, oldChangeTypeESet));
        }
    }
    
    @Override
    public boolean isSetChangeType() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getChangeType();
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
                this.setChangeType((String)newValue);
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
                this.unsetChangeType();
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
                return this.isSetChangeType();
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
        result.append(" (changeType: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.changeType);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
