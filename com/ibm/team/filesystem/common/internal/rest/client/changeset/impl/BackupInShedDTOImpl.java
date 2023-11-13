// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.BackupInShedDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class BackupInShedDTOImpl extends EObjectImpl implements BackupInShedDTO
{
    protected int ALL_FLAGS;
    protected ShareableDTO shareable;
    protected static final int SHAREABLE_ESETFLAG = 1;
    protected static final String SHED_LOCATION_EDEFAULT;
    protected String shedLocation;
    protected static final int SHED_LOCATION_ESETFLAG = 2;
    
    static {
        SHED_LOCATION_EDEFAULT = null;
    }
    
    protected BackupInShedDTOImpl() {
        this.ALL_FLAGS = 0;
        this.shedLocation = BackupInShedDTOImpl.SHED_LOCATION_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.BACKUP_IN_SHED_DTO;
    }
    
    public ShareableDTO getShareable() {
        return this.shareable;
    }
    
    public NotificationChain basicSetShareable(final ShareableDTO newShareable, NotificationChain msgs) {
        final ShareableDTO oldShareable = this.shareable;
        this.shareable = newShareable;
        final boolean oldShareableESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldShareable, (Object)newShareable, !oldShareableESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setShareable(final ShareableDTO newShareable) {
        if (newShareable != this.shareable) {
            NotificationChain msgs = null;
            if (this.shareable != null) {
                msgs = ((InternalEObject)this.shareable).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newShareable != null) {
                msgs = ((InternalEObject)newShareable).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetShareable(newShareable, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldShareableESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newShareable, (Object)newShareable, !oldShareableESet));
            }
        }
    }
    
    public NotificationChain basicUnsetShareable(NotificationChain msgs) {
        final ShareableDTO oldShareable = this.shareable;
        this.shareable = null;
        final boolean oldShareableESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldShareable, (Object)null, oldShareableESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetShareable() {
        if (this.shareable != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.shareable).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetShareable(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldShareableESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldShareableESet));
            }
        }
    }
    
    public boolean isSetShareable() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getShedLocation() {
        return this.shedLocation;
    }
    
    public void setShedLocation(final String newShedLocation) {
        final String oldShedLocation = this.shedLocation;
        this.shedLocation = newShedLocation;
        final boolean oldShedLocationESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldShedLocation, (Object)this.shedLocation, !oldShedLocationESet));
        }
    }
    
    public void unsetShedLocation() {
        final String oldShedLocation = this.shedLocation;
        final boolean oldShedLocationESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.shedLocation = BackupInShedDTOImpl.SHED_LOCATION_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldShedLocation, (Object)BackupInShedDTOImpl.SHED_LOCATION_EDEFAULT, oldShedLocationESet));
        }
    }
    
    public boolean isSetShedLocation() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetShareable(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getShareable();
            }
            case 1: {
                return this.getShedLocation();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setShareable((ShareableDTO)newValue);
            }
            case 1: {
                this.setShedLocation((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetShareable();
            }
            case 1: {
                this.unsetShedLocation();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetShareable();
            }
            case 1: {
                return this.isSetShedLocation();
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
        result.append(" (shedLocation: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.shedLocation);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
