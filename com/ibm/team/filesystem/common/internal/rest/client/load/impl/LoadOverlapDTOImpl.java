// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import java.util.Collection;
import com.ibm.team.filesystem.common.internal.rest.client.load.OverlappedItemDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadLocationDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadOverlapDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LoadOverlapDTOImpl extends EObjectImpl implements LoadOverlapDTO
{
    protected int ALL_FLAGS;
    protected LoadLocationDTO loadLocation;
    protected static final int LOAD_LOCATION_ESETFLAG = 1;
    protected PathDTO path;
    protected static final int PATH_ESETFLAG = 2;
    protected EList overlappingShares;
    protected EList overlappingItems;
    
    protected LoadOverlapDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOloadPackage.Literals.LOAD_OVERLAP_DTO;
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
    
    public PathDTO getPath() {
        return this.path;
    }
    
    public NotificationChain basicSetPath(final PathDTO newPath, NotificationChain msgs) {
        final PathDTO oldPath = this.path;
        this.path = newPath;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldPath, (Object)newPath, !oldPathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setPath(final PathDTO newPath) {
        if (newPath != this.path) {
            NotificationChain msgs = null;
            if (this.path != null) {
                msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            }
            if (newPath != null) {
                msgs = ((InternalEObject)newPath).eInverseAdd((InternalEObject)this, -2, (Class)null, msgs);
            }
            msgs = this.basicSetPath(newPath, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS |= 0x2;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)newPath, (Object)newPath, !oldPathESet));
            }
        }
    }
    
    public NotificationChain basicUnsetPath(NotificationChain msgs) {
        final PathDTO oldPath = this.path;
        this.path = null;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldPath, (Object)null, oldPathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetPath() {
        if (this.path != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            msgs = this.basicUnsetPath(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFD;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)null, (Object)null, oldPathESet));
            }
        }
    }
    
    public boolean isSetPath() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getOverlappingShares() {
        if (this.overlappingShares == null) {
            this.overlappingShares = (EList)new EObjectContainmentEList.Unsettable((Class)ShareDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.overlappingShares;
    }
    
    public void unsetOverlappingShares() {
        if (this.overlappingShares != null) {
            ((InternalEList.Unsettable)this.overlappingShares).unset();
        }
    }
    
    public boolean isSetOverlappingShares() {
        return this.overlappingShares != null && ((InternalEList.Unsettable)this.overlappingShares).isSet();
    }
    
    public List getOverlappingItems() {
        if (this.overlappingItems == null) {
            this.overlappingItems = (EList)new EObjectContainmentEList.Unsettable((Class)OverlappedItemDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.overlappingItems;
    }
    
    public void unsetOverlappingItems() {
        if (this.overlappingItems != null) {
            ((InternalEList.Unsettable)this.overlappingItems).unset();
        }
    }
    
    public boolean isSetOverlappingItems() {
        return this.overlappingItems != null && ((InternalEList.Unsettable)this.overlappingItems).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetLoadLocation(msgs);
            }
            case 1: {
                return this.basicUnsetPath(msgs);
            }
            case 2: {
                return ((InternalEList)this.getOverlappingShares()).basicRemove((Object)otherEnd, msgs);
            }
            case 3: {
                return ((InternalEList)this.getOverlappingItems()).basicRemove((Object)otherEnd, msgs);
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
                return this.getPath();
            }
            case 2: {
                return this.getOverlappingShares();
            }
            case 3: {
                return this.getOverlappingItems();
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
                this.setPath((PathDTO)newValue);
            }
            case 2: {
                this.getOverlappingShares().clear();
                this.getOverlappingShares().addAll((Collection)newValue);
            }
            case 3: {
                this.getOverlappingItems().clear();
                this.getOverlappingItems().addAll((Collection)newValue);
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
                this.unsetPath();
            }
            case 2: {
                this.unsetOverlappingShares();
            }
            case 3: {
                this.unsetOverlappingItems();
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
                return this.isSetPath();
            }
            case 2: {
                return this.isSetOverlappingShares();
            }
            case 3: {
                return this.isSetOverlappingItems();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
