// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockEntryDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.locks.UnlockResourcesResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class UnlockResourcesResultDTOImpl extends EObjectImpl implements UnlockResourcesResultDTO
{
    protected int ALL_FLAGS;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 1;
    protected static final int CANCELLED_ESETFLAG = 2;
    protected EList currentUserDoesntOwnLocks;
    
    protected UnlockResourcesResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOlocksPackage.Literals.UNLOCK_RESOURCES_RESULT_DTO;
    }
    
    public boolean isCancelled() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setCancelled(final boolean newCancelled) {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newCancelled) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldCancelled, newCancelled, !oldCancelledESet));
        }
    }
    
    public void unsetCancelled() {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldCancelled, false, oldCancelledESet));
        }
    }
    
    public boolean isSetCancelled() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getCurrentUserDoesntOwnLocks() {
        if (this.currentUserDoesntOwnLocks == null) {
            this.currentUserDoesntOwnLocks = (EList)new EObjectContainmentEList.Unsettable((Class)LockEntryDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.currentUserDoesntOwnLocks;
    }
    
    public void unsetCurrentUserDoesntOwnLocks() {
        if (this.currentUserDoesntOwnLocks != null) {
            ((InternalEList.Unsettable)this.currentUserDoesntOwnLocks).unset();
        }
    }
    
    public boolean isSetCurrentUserDoesntOwnLocks() {
        return this.currentUserDoesntOwnLocks != null && ((InternalEList.Unsettable)this.currentUserDoesntOwnLocks).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return ((InternalEList)this.getCurrentUserDoesntOwnLocks()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isCancelled() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.getCurrentUserDoesntOwnLocks();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setCancelled((boolean)newValue);
            }
            case 1: {
                this.getCurrentUserDoesntOwnLocks().clear();
                this.getCurrentUserDoesntOwnLocks().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetCancelled();
            }
            case 1: {
                this.unsetCurrentUserDoesntOwnLocks();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetCancelled();
            }
            case 1: {
                return this.isSetCurrentUserDoesntOwnLocks();
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
        result.append(" (cancelled: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
