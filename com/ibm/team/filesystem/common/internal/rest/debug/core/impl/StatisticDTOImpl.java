// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class StatisticDTOImpl extends EObjectImpl implements StatisticDTO
{
    protected int ALL_FLAGS;
    protected static final String CONTEXT_TYPE_EDEFAULT;
    protected String contextType;
    protected static final int CONTEXT_TYPE_ESETFLAG = 1;
    protected static final String CONTEXT_EDEFAULT;
    protected String context;
    protected static final int CONTEXT_ESETFLAG = 2;
    protected static final String STATISTIC_NAME_EDEFAULT;
    protected String statisticName;
    protected static final int STATISTIC_NAME_ESETFLAG = 4;
    protected static final long VALUE_EDEFAULT = 0L;
    protected long value;
    protected static final int VALUE_ESETFLAG = 8;
    
    static {
        CONTEXT_TYPE_EDEFAULT = null;
        CONTEXT_EDEFAULT = null;
        STATISTIC_NAME_EDEFAULT = null;
    }
    
    protected StatisticDTOImpl() {
        this.ALL_FLAGS = 0;
        this.contextType = StatisticDTOImpl.CONTEXT_TYPE_EDEFAULT;
        this.context = StatisticDTOImpl.CONTEXT_EDEFAULT;
        this.statisticName = StatisticDTOImpl.STATISTIC_NAME_EDEFAULT;
        this.value = 0L;
    }
    
    protected EClass eStaticClass() {
        return DebugRestClientDTOPackage.Literals.STATISTIC_DTO;
    }
    
    public String getContextType() {
        return this.contextType;
    }
    
    public void setContextType(final String newContextType) {
        final String oldContextType = this.contextType;
        this.contextType = newContextType;
        final boolean oldContextTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldContextType, (Object)this.contextType, !oldContextTypeESet));
        }
    }
    
    public void unsetContextType() {
        final String oldContextType = this.contextType;
        final boolean oldContextTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.contextType = StatisticDTOImpl.CONTEXT_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldContextType, (Object)StatisticDTOImpl.CONTEXT_TYPE_EDEFAULT, oldContextTypeESet));
        }
    }
    
    public boolean isSetContextType() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getContext() {
        return this.context;
    }
    
    public void setContext(final String newContext) {
        final String oldContext = this.context;
        this.context = newContext;
        final boolean oldContextESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldContext, (Object)this.context, !oldContextESet));
        }
    }
    
    public void unsetContext() {
        final String oldContext = this.context;
        final boolean oldContextESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.context = StatisticDTOImpl.CONTEXT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldContext, (Object)StatisticDTOImpl.CONTEXT_EDEFAULT, oldContextESet));
        }
    }
    
    public boolean isSetContext() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getStatisticName() {
        return this.statisticName;
    }
    
    public void setStatisticName(final String newStatisticName) {
        final String oldStatisticName = this.statisticName;
        this.statisticName = newStatisticName;
        final boolean oldStatisticNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldStatisticName, (Object)this.statisticName, !oldStatisticNameESet));
        }
    }
    
    public void unsetStatisticName() {
        final String oldStatisticName = this.statisticName;
        final boolean oldStatisticNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.statisticName = StatisticDTOImpl.STATISTIC_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldStatisticName, (Object)StatisticDTOImpl.STATISTIC_NAME_EDEFAULT, oldStatisticNameESet));
        }
    }
    
    public boolean isSetStatisticName() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public long getValue() {
        return this.value;
    }
    
    public void setValue(final long newValue) {
        final long oldValue = this.value;
        this.value = newValue;
        final boolean oldValueESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldValue, this.value, !oldValueESet));
        }
    }
    
    public void unsetValue() {
        final long oldValue = this.value;
        final boolean oldValueESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.value = 0L;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldValue, 0L, oldValueESet));
        }
    }
    
    public boolean isSetValue() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getContextType();
            }
            case 1: {
                return this.getContext();
            }
            case 2: {
                return this.getStatisticName();
            }
            case 3: {
                return new Long(this.getValue());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setContextType((String)newValue);
            }
            case 1: {
                this.setContext((String)newValue);
            }
            case 2: {
                this.setStatisticName((String)newValue);
            }
            case 3: {
                this.setValue((long)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetContextType();
            }
            case 1: {
                this.unsetContext();
            }
            case 2: {
                this.unsetStatisticName();
            }
            case 3: {
                this.unsetValue();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetContextType();
            }
            case 1: {
                return this.isSetContext();
            }
            case 2: {
                return this.isSetStatisticName();
            }
            case 3: {
                return this.isSetValue();
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
        result.append(" (contextType: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.contextType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", context: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.context);
        }
        else {
            result.append("<unset>");
        }
        result.append(", statisticName: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.statisticName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", value: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.value);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
