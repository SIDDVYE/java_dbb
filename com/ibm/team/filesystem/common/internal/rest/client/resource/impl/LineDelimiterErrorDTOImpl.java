// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.LineDelimiterErrorDTO;

public class LineDelimiterErrorDTOImpl extends FileErrorDTOImpl implements LineDelimiterErrorDTO
{
    protected static final String LINE_DELIMITER_EDEFAULT;
    protected String lineDelimiter;
    protected static final int LINE_DELIMITER_ESETFLAG = 4;
    
    static {
        LINE_DELIMITER_EDEFAULT = null;
    }
    
    protected LineDelimiterErrorDTOImpl() {
        this.lineDelimiter = LineDelimiterErrorDTOImpl.LINE_DELIMITER_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.LINE_DELIMITER_ERROR_DTO;
    }
    
    @Override
    public String getLineDelimiter() {
        return this.lineDelimiter;
    }
    
    @Override
    public void setLineDelimiter(final String newLineDelimiter) {
        final String oldLineDelimiter = this.lineDelimiter;
        this.lineDelimiter = newLineDelimiter;
        final boolean oldLineDelimiterESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldLineDelimiter, (Object)this.lineDelimiter, !oldLineDelimiterESet));
        }
    }
    
    @Override
    public void unsetLineDelimiter() {
        final String oldLineDelimiter = this.lineDelimiter;
        final boolean oldLineDelimiterESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.lineDelimiter = LineDelimiterErrorDTOImpl.LINE_DELIMITER_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldLineDelimiter, (Object)LineDelimiterErrorDTOImpl.LINE_DELIMITER_EDEFAULT, oldLineDelimiterESet));
        }
    }
    
    @Override
    public boolean isSetLineDelimiter() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 2: {
                return this.getLineDelimiter();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 2: {
                this.setLineDelimiter((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 2: {
                this.unsetLineDelimiter();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 2: {
                return this.isSetLineDelimiter();
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
        result.append(" (lineDelimiter: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.lineDelimiter);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
