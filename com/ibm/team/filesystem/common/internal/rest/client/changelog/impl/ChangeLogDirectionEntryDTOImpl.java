// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogDirectionEntryDTO;

public class ChangeLogDirectionEntryDTOImpl extends ChangeLogEntryDTOImpl implements ChangeLogDirectionEntryDTO
{
    protected static final String FLOW_DIRECTION_EDEFAULT;
    protected String flowDirection;
    protected static final int FLOW_DIRECTION_ESETFLAG = 8;
    
    static {
        FLOW_DIRECTION_EDEFAULT = null;
    }
    
    protected ChangeLogDirectionEntryDTOImpl() {
        this.flowDirection = ChangeLogDirectionEntryDTOImpl.FLOW_DIRECTION_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangelogPackage.Literals.CHANGE_LOG_DIRECTION_ENTRY_DTO;
    }
    
    @Override
    public String getFlowDirection() {
        return this.flowDirection;
    }
    
    @Override
    public void setFlowDirection(final String newFlowDirection) {
        final String oldFlowDirection = this.flowDirection;
        this.flowDirection = newFlowDirection;
        final boolean oldFlowDirectionESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldFlowDirection, (Object)this.flowDirection, !oldFlowDirectionESet));
        }
    }
    
    @Override
    public void unsetFlowDirection() {
        final String oldFlowDirection = this.flowDirection;
        final boolean oldFlowDirectionESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.flowDirection = ChangeLogDirectionEntryDTOImpl.FLOW_DIRECTION_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldFlowDirection, (Object)ChangeLogDirectionEntryDTOImpl.FLOW_DIRECTION_EDEFAULT, oldFlowDirectionESet));
        }
    }
    
    @Override
    public boolean isSetFlowDirection() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getFlowDirection();
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
                this.setFlowDirection((String)newValue);
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
                this.unsetFlowDirection();
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
                return this.isSetFlowDirection();
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
        result.append(" (flowDirection: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.flowDirection);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
