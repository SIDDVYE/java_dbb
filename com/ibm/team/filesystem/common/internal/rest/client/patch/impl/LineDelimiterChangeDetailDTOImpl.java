// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.LineDelimiterChangeDetailDTO;

public class LineDelimiterChangeDetailDTOImpl extends ChangeDetailDTOImpl implements LineDelimiterChangeDetailDTO
{
    protected static final String BEFORE_LINE_DELIMITER_EDEFAULT;
    protected String beforeLineDelimiter;
    protected static final int BEFORE_LINE_DELIMITER_ESETFLAG = 32;
    protected static final String AFTER_LINE_DELIMITER_EDEFAULT;
    protected String afterLineDelimiter;
    protected static final int AFTER_LINE_DELIMITER_ESETFLAG = 64;
    
    static {
        BEFORE_LINE_DELIMITER_EDEFAULT = null;
        AFTER_LINE_DELIMITER_EDEFAULT = null;
    }
    
    protected LineDelimiterChangeDetailDTOImpl() {
        this.beforeLineDelimiter = LineDelimiterChangeDetailDTOImpl.BEFORE_LINE_DELIMITER_EDEFAULT;
        this.afterLineDelimiter = LineDelimiterChangeDetailDTOImpl.AFTER_LINE_DELIMITER_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.LINE_DELIMITER_CHANGE_DETAIL_DTO;
    }
    
    @Override
    public String getBeforeLineDelimiter() {
        return this.beforeLineDelimiter;
    }
    
    @Override
    public void setBeforeLineDelimiter(final String newBeforeLineDelimiter) {
        final String oldBeforeLineDelimiter = this.beforeLineDelimiter;
        this.beforeLineDelimiter = newBeforeLineDelimiter;
        final boolean oldBeforeLineDelimiterESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldBeforeLineDelimiter, (Object)this.beforeLineDelimiter, !oldBeforeLineDelimiterESet));
        }
    }
    
    @Override
    public void unsetBeforeLineDelimiter() {
        final String oldBeforeLineDelimiter = this.beforeLineDelimiter;
        final boolean oldBeforeLineDelimiterESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeLineDelimiter = LineDelimiterChangeDetailDTOImpl.BEFORE_LINE_DELIMITER_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldBeforeLineDelimiter, (Object)LineDelimiterChangeDetailDTOImpl.BEFORE_LINE_DELIMITER_EDEFAULT, oldBeforeLineDelimiterESet));
        }
    }
    
    @Override
    public boolean isSetBeforeLineDelimiter() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    @Override
    public String getAfterLineDelimiter() {
        return this.afterLineDelimiter;
    }
    
    @Override
    public void setAfterLineDelimiter(final String newAfterLineDelimiter) {
        final String oldAfterLineDelimiter = this.afterLineDelimiter;
        this.afterLineDelimiter = newAfterLineDelimiter;
        final boolean oldAfterLineDelimiterESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldAfterLineDelimiter, (Object)this.afterLineDelimiter, !oldAfterLineDelimiterESet));
        }
    }
    
    @Override
    public void unsetAfterLineDelimiter() {
        final String oldAfterLineDelimiter = this.afterLineDelimiter;
        final boolean oldAfterLineDelimiterESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterLineDelimiter = LineDelimiterChangeDetailDTOImpl.AFTER_LINE_DELIMITER_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldAfterLineDelimiter, (Object)LineDelimiterChangeDetailDTOImpl.AFTER_LINE_DELIMITER_EDEFAULT, oldAfterLineDelimiterESet));
        }
    }
    
    @Override
    public boolean isSetAfterLineDelimiter() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getBeforeLineDelimiter();
            }
            case 5: {
                return this.getAfterLineDelimiter();
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
                this.setBeforeLineDelimiter((String)newValue);
            }
            case 5: {
                this.setAfterLineDelimiter((String)newValue);
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
                this.unsetBeforeLineDelimiter();
            }
            case 5: {
                this.unsetAfterLineDelimiter();
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
                return this.isSetBeforeLineDelimiter();
            }
            case 5: {
                return this.isSetAfterLineDelimiter();
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
        result.append(" (beforeLineDelimiter: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.beforeLineDelimiter);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterLineDelimiter: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.afterLineDelimiter);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
