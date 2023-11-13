// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadLocationDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.InvalidLoadRequestDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class InvalidLoadRequestDTOImpl extends EObjectImpl implements InvalidLoadRequestDTO
{
    protected int ALL_FLAGS;
    protected LoadLocationDTO loadLocation;
    protected static final int LOAD_LOCATION_ESETFLAG = 1;
    protected EList reason;
    
    protected InvalidLoadRequestDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOloadPackage.Literals.INVALID_LOAD_REQUEST_DTO;
    }
    
    public LoadLocationDTO getLoadLocation() {
        return this.loadLocation;
    }
    
    public NotificationChain basicSetLoadLocation(final LoadLocationDTO newLoadLocation, NotificationChain msgs) {
        final LoadLocationDTO oldLoadLocation = this.loadLocation;
        this.loadLocation = newLoadLocation;
        final boolean oldLoadLocationESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldLoadLocation, (Object)newLoadLocation, !oldLoadLocationESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setLoadLocation(final LoadLocationDTO newLoadLocation) {
        if (newLoadLocation != this.loadLocation) {
            NotificationChain msgs = null;
            if (this.loadLocation != null) {
                msgs = ((InternalEObject)this.loadLocation).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newLoadLocation != null) {
                msgs = ((InternalEObject)newLoadLocation).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetLoadLocation(newLoadLocation, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldLoadLocationESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newLoadLocation, (Object)newLoadLocation, !oldLoadLocationESet));
            }
        }
    }
    
    public NotificationChain basicUnsetLoadLocation(NotificationChain msgs) {
        final LoadLocationDTO oldLoadLocation = this.loadLocation;
        this.loadLocation = null;
        final boolean oldLoadLocationESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldLoadLocation, (Object)null, oldLoadLocationESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetLoadLocation() {
        if (this.loadLocation != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.loadLocation).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetLoadLocation(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldLoadLocationESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldLoadLocationESet));
            }
        }
    }
    
    public boolean isSetLoadLocation() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public List getReason() {
        if (this.reason == null) {
            this.reason = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 1);
        }
        return (List)this.reason;
    }
    
    public void unsetReason() {
        if (this.reason != null) {
            ((InternalEList.Unsettable)this.reason).unset();
        }
    }
    
    public boolean isSetReason() {
        return this.reason != null && ((InternalEList.Unsettable)this.reason).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetLoadLocation(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getLoadLocation();
            }
            case 1: {
                return this.getReason();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setLoadLocation((LoadLocationDTO)newValue);
            }
            case 1: {
                this.getReason().clear();
                this.getReason().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetLoadLocation();
            }
            case 1: {
                this.unsetReason();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetLoadLocation();
            }
            case 1: {
                return this.isSetReason();
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
        result.append(" (reason: ");
        result.append(this.reason);
        result.append(')');
        return result.toString();
    }
}
