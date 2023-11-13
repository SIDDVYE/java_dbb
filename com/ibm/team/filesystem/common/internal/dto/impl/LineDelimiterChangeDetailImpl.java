// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import com.ibm.team.filesystem.common.FileLineDelimiter;
import com.ibm.team.filesystem.common.ILineDelimiterChangeDetail;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import com.ibm.team.filesystem.common.internal.dto.LineDelimiterChangeDetail;
import com.ibm.team.scm.common.internal.dto2.impl.ChangeDetailImpl;

public class LineDelimiterChangeDetailImpl extends ChangeDetailImpl implements LineDelimiterChangeDetail
{
    protected int ALL_FLAGS;
    protected static final int BEFORE_LINE_DELIMITER_VALUE_EDEFAULT = 0;
    protected int beforeLineDelimiterValue;
    protected static final int BEFORE_LINE_DELIMITER_VALUE_ESETFLAG = 32;
    protected static final int AFTER_LINE_DELIMITER_VALUE_EDEFAULT = 0;
    protected int afterLineDelimiterValue;
    protected static final int AFTER_LINE_DELIMITER_VALUE_ESETFLAG = 64;
    private static final int EOFFSET_CORRECTION;
    
    static {
        EOFFSET_CORRECTION = FilesystemDTOPackage.Literals.LINE_DELIMITER_CHANGE_DETAIL.getFeatureID((EStructuralFeature)FilesystemDTOPackage.Literals.LINE_DELIMITER_CHANGE_DETAIL__BEFORE_LINE_DELIMITER_VALUE) - 4;
    }
    
    protected LineDelimiterChangeDetailImpl() {
        this.ALL_FLAGS = 0;
        this.beforeLineDelimiterValue = 0;
        this.afterLineDelimiterValue = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.LINE_DELIMITER_CHANGE_DETAIL;
    }
    
    public int getBeforeLineDelimiterValue() {
        return this.beforeLineDelimiterValue;
    }
    
    public void setBeforeLineDelimiterValue(final int newBeforeLineDelimiterValue) {
        final int oldBeforeLineDelimiterValue = this.beforeLineDelimiterValue;
        this.beforeLineDelimiterValue = newBeforeLineDelimiterValue;
        final boolean oldBeforeLineDelimiterValueESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4 + LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION, oldBeforeLineDelimiterValue, this.beforeLineDelimiterValue, !oldBeforeLineDelimiterValueESet));
        }
    }
    
    public void unsetBeforeLineDelimiterValue() {
        final int oldBeforeLineDelimiterValue = this.beforeLineDelimiterValue;
        final boolean oldBeforeLineDelimiterValueESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.beforeLineDelimiterValue = 0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4 + LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION, oldBeforeLineDelimiterValue, 0, oldBeforeLineDelimiterValueESet));
        }
    }
    
    public boolean isSetBeforeLineDelimiterValue() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public int getAfterLineDelimiterValue() {
        return this.afterLineDelimiterValue;
    }
    
    public void setAfterLineDelimiterValue(final int newAfterLineDelimiterValue) {
        final int oldAfterLineDelimiterValue = this.afterLineDelimiterValue;
        this.afterLineDelimiterValue = newAfterLineDelimiterValue;
        final boolean oldAfterLineDelimiterValueESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5 + LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION, oldAfterLineDelimiterValue, this.afterLineDelimiterValue, !oldAfterLineDelimiterValueESet));
        }
    }
    
    public void unsetAfterLineDelimiterValue() {
        final int oldAfterLineDelimiterValue = this.afterLineDelimiterValue;
        final boolean oldAfterLineDelimiterValueESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.afterLineDelimiterValue = 0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5 + LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION, oldAfterLineDelimiterValue, 0, oldAfterLineDelimiterValueESet));
        }
    }
    
    public boolean isSetAfterLineDelimiterValue() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return new Integer(this.getBeforeLineDelimiterValue());
            }
            case 5: {
                return new Integer(this.getAfterLineDelimiterValue());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                this.setBeforeLineDelimiterValue((int)newValue);
            }
            case 5: {
                this.setAfterLineDelimiterValue((int)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                this.unsetBeforeLineDelimiterValue();
            }
            case 5: {
                this.unsetAfterLineDelimiterValue();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return this.isSetBeforeLineDelimiterValue();
            }
            case 5: {
                return this.isSetAfterLineDelimiterValue();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass == ILineDelimiterChangeDetail.class) {
            return -1;
        }
        if (baseClass != LineDelimiterChangeDetail.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION) {
            case 4: {
                return 4 + LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION;
            }
            case 5: {
                return 5 + LineDelimiterChangeDetailImpl.EOFFSET_CORRECTION;
            }
            default: {
                return -1;
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (beforeLineDelimiterValue: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.beforeLineDelimiterValue);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterLineDelimiterValue: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.afterLineDelimiterValue);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
    
    public FileLineDelimiter getBeforeLineDelimiter() {
        return FileLineDelimiter.getLineDelimiter(this.getBeforeLineDelimiterValue());
    }
    
    public FileLineDelimiter getAfterLineDelimiter() {
        return FileLineDelimiter.getLineDelimiter(this.getAfterLineDelimiterValue());
    }
}
