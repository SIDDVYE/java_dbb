// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.RemovedShareDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class RemovedShareDTOImpl extends EObjectImpl implements RemovedShareDTO
{
    protected int ALL_FLAGS;
    protected static final int UNCOMMITTED_CHANGE_COUNT_EDEFAULT = 0;
    protected int uncommittedChangeCount;
    protected static final int UNCOMMITTED_CHANGE_COUNT_ESETFLAG = 1;
    protected ShareDTO share;
    protected static final int SHARE_ESETFLAG = 2;
    
    protected RemovedShareDTOImpl() {
        this.ALL_FLAGS = 0;
        this.uncommittedChangeCount = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOloadPackage.Literals.REMOVED_SHARE_DTO;
    }
    
    public int getUncommittedChangeCount() {
        return this.uncommittedChangeCount;
    }
    
    public void setUncommittedChangeCount(final int newUncommittedChangeCount) {
        final int oldUncommittedChangeCount = this.uncommittedChangeCount;
        this.uncommittedChangeCount = newUncommittedChangeCount;
        final boolean oldUncommittedChangeCountESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldUncommittedChangeCount, this.uncommittedChangeCount, !oldUncommittedChangeCountESet));
        }
    }
    
    public void unsetUncommittedChangeCount() {
        final int oldUncommittedChangeCount = this.uncommittedChangeCount;
        final boolean oldUncommittedChangeCountESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.uncommittedChangeCount = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldUncommittedChangeCount, 0, oldUncommittedChangeCountESet));
        }
    }
    
    public boolean isSetUncommittedChangeCount() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public ShareDTO getShare() {
        return this.share;
    }
    
    public NotificationChain basicSetShare(final ShareDTO newShare, NotificationChain msgs) {
        final ShareDTO oldShare = this.share;
        this.share = newShare;
        final boolean oldShareESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldShare, (Object)newShare, !oldShareESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setShare(final ShareDTO newShare) {
        if (newShare != this.share) {
            NotificationChain msgs = null;
            if (this.share != null) {
                msgs = ((InternalEObject)this.share).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            }
            if (newShare != null) {
                msgs = ((InternalEObject)newShare).eInverseAdd((InternalEObject)this, -2, (Class)null, msgs);
            }
            msgs = this.basicSetShare(newShare, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldShareESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS |= 0x2;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)newShare, (Object)newShare, !oldShareESet));
            }
        }
    }
    
    public NotificationChain basicUnsetShare(NotificationChain msgs) {
        final ShareDTO oldShare = this.share;
        this.share = null;
        final boolean oldShareESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldShare, (Object)null, oldShareESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetShare() {
        if (this.share != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.share).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            msgs = this.basicUnsetShare(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldShareESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFD;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)null, (Object)null, oldShareESet));
            }
        }
    }
    
    public boolean isSetShare() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return this.basicUnsetShare(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return new Integer(this.getUncommittedChangeCount());
            }
            case 1: {
                return this.getShare();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setUncommittedChangeCount((int)newValue);
            }
            case 1: {
                this.setShare((ShareDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetUncommittedChangeCount();
            }
            case 1: {
                this.unsetShare();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetUncommittedChangeCount();
            }
            case 1: {
                return this.isSetShare();
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
        result.append(" (uncommittedChangeCount: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.uncommittedChangeCount);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
