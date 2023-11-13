// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeBaseDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class MetronomeBaseDTOImpl extends EObjectImpl implements MetronomeBaseDTO
{
    protected int ALL_FLAGS;
    protected static final String NAME_EDEFAULT;
    protected String name;
    protected static final int NAME_ESETFLAG = 1;
    protected static final long ELAPSED_TIME_EDEFAULT = 0L;
    protected long elapsedTime;
    protected static final int ELAPSED_TIME_ESETFLAG = 2;
    protected static final long CALL_COUNT_EDEFAULT = 0L;
    protected long callCount;
    protected static final int CALL_COUNT_ESETFLAG = 4;
    
    static {
        NAME_EDEFAULT = null;
    }
    
    protected MetronomeBaseDTOImpl() {
        this.ALL_FLAGS = 0;
        this.name = MetronomeBaseDTOImpl.NAME_EDEFAULT;
        this.elapsedTime = 0L;
        this.callCount = 0L;
    }
    
    protected EClass eStaticClass() {
        return DebugRestClientDTOPackage.Literals.METRONOME_BASE_DTO;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.name = MetronomeBaseDTOImpl.NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldName, (Object)MetronomeBaseDTOImpl.NAME_EDEFAULT, oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public long getElapsedTime() {
        return this.elapsedTime;
    }
    
    public void setElapsedTime(final long newElapsedTime) {
        final long oldElapsedTime = this.elapsedTime;
        this.elapsedTime = newElapsedTime;
        final boolean oldElapsedTimeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldElapsedTime, this.elapsedTime, !oldElapsedTimeESet));
        }
    }
    
    public void unsetElapsedTime() {
        final long oldElapsedTime = this.elapsedTime;
        final boolean oldElapsedTimeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.elapsedTime = 0L;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldElapsedTime, 0L, oldElapsedTimeESet));
        }
    }
    
    public boolean isSetElapsedTime() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public long getCallCount() {
        return this.callCount;
    }
    
    public void setCallCount(final long newCallCount) {
        final long oldCallCount = this.callCount;
        this.callCount = newCallCount;
        final boolean oldCallCountESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldCallCount, this.callCount, !oldCallCountESet));
        }
    }
    
    public void unsetCallCount() {
        final long oldCallCount = this.callCount;
        final boolean oldCallCountESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.callCount = 0L;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldCallCount, 0L, oldCallCountESet));
        }
    }
    
    public boolean isSetCallCount() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getName();
            }
            case 1: {
                return new Long(this.getElapsedTime());
            }
            case 2: {
                return new Long(this.getCallCount());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setName((String)newValue);
            }
            case 1: {
                this.setElapsedTime((long)newValue);
            }
            case 2: {
                this.setCallCount((long)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetName();
            }
            case 1: {
                this.unsetElapsedTime();
            }
            case 2: {
                this.unsetCallCount();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetName();
            }
            case 1: {
                return this.isSetElapsedTime();
            }
            case 2: {
                return this.isSetCallCount();
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
        result.append(" (name: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", elapsedTime: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.elapsedTime);
        }
        else {
            result.append("<unset>");
        }
        result.append(", callCount: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.callCount);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
