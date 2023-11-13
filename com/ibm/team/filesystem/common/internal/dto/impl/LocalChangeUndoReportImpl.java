// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.dto.Inaccessible;
import com.ibm.team.scm.common.dto.ISynchronizationTime;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdateReport2;
import com.ibm.team.filesystem.common.internal.dto.LocalChangeUndoReport;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LocalChangeUndoReportImpl extends EObjectImpl implements LocalChangeUndoReport
{
    protected int ALL_FLAGS;
    protected FileAreaUpdateReport2 updates;
    protected static final int UPDATES_ESETFLAG = 1;
    protected ISynchronizationTime configurationState;
    protected static final int CONFIGURATION_STATE_ESETFLAG = 2;
    protected Inaccessible inaccessible;
    protected static final int INACCESSIBLE_ESETFLAG = 4;
    
    protected LocalChangeUndoReportImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.LOCAL_CHANGE_UNDO_REPORT;
    }
    
    public FileAreaUpdateReport2 getUpdates() {
        return this.updates;
    }
    
    public NotificationChain basicSetUpdates(final FileAreaUpdateReport2 newUpdates, NotificationChain msgs) {
        final FileAreaUpdateReport2 oldUpdates = this.updates;
        this.updates = newUpdates;
        final boolean oldUpdatesESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldUpdates, (Object)newUpdates, !oldUpdatesESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setUpdates(final FileAreaUpdateReport2 newUpdates) {
        if (newUpdates != this.updates) {
            NotificationChain msgs = null;
            if (this.updates != null) {
                msgs = ((InternalEObject)this.updates).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newUpdates != null) {
                msgs = ((InternalEObject)newUpdates).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetUpdates(newUpdates, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdatesESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newUpdates, (Object)newUpdates, !oldUpdatesESet));
            }
        }
    }
    
    public NotificationChain basicUnsetUpdates(NotificationChain msgs) {
        final FileAreaUpdateReport2 oldUpdates = this.updates;
        this.updates = null;
        final boolean oldUpdatesESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldUpdates, (Object)null, oldUpdatesESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetUpdates() {
        if (this.updates != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.updates).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetUpdates(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdatesESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldUpdatesESet));
            }
        }
    }
    
    public boolean isSetUpdates() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public ISynchronizationTime getConfigurationState() {
        if (this.configurationState != null && ((EObject)this.configurationState).eIsProxy()) {
            final InternalEObject oldConfigurationState = (InternalEObject)this.configurationState;
            this.configurationState = (ISynchronizationTime)this.eResolveProxy(oldConfigurationState);
            if (this.configurationState != oldConfigurationState && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 1, (Object)oldConfigurationState, (Object)this.configurationState));
            }
        }
        return this.configurationState;
    }
    
    public ISynchronizationTime basicGetConfigurationState() {
        return this.configurationState;
    }
    
    public void setConfigurationState(final ISynchronizationTime newConfigurationState) {
        final ISynchronizationTime oldConfigurationState = this.configurationState;
        this.configurationState = newConfigurationState;
        final boolean oldConfigurationStateESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldConfigurationState, (Object)this.configurationState, !oldConfigurationStateESet));
        }
    }
    
    public void unsetConfigurationState() {
        final ISynchronizationTime oldConfigurationState = this.configurationState;
        final boolean oldConfigurationStateESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.configurationState = null;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldConfigurationState, (Object)null, oldConfigurationStateESet));
        }
    }
    
    public boolean isSetConfigurationState() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Inaccessible getInaccessible() {
        if (this.inaccessible != null && ((EObject)this.inaccessible).eIsProxy()) {
            final InternalEObject oldInaccessible = (InternalEObject)this.inaccessible;
            this.inaccessible = (Inaccessible)this.eResolveProxy(oldInaccessible);
            if (this.inaccessible != oldInaccessible && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 2, (Object)oldInaccessible, (Object)this.inaccessible));
            }
        }
        return this.inaccessible;
    }
    
    public Inaccessible basicGetInaccessible() {
        return this.inaccessible;
    }
    
    public void setInaccessible(final Inaccessible newInaccessible) {
        final Inaccessible oldInaccessible = this.inaccessible;
        this.inaccessible = newInaccessible;
        final boolean oldInaccessibleESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldInaccessible, (Object)this.inaccessible, !oldInaccessibleESet));
        }
    }
    
    public void unsetInaccessible() {
        final Inaccessible oldInaccessible = this.inaccessible;
        final boolean oldInaccessibleESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.inaccessible = null;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldInaccessible, (Object)null, oldInaccessibleESet));
        }
    }
    
    public boolean isSetInaccessible() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetUpdates(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getUpdates();
            }
            case 1: {
                if (resolve) {
                    return this.getConfigurationState();
                }
                return this.basicGetConfigurationState();
            }
            case 2: {
                if (resolve) {
                    return this.getInaccessible();
                }
                return this.basicGetInaccessible();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setUpdates((FileAreaUpdateReport2)newValue);
            }
            case 1: {
                this.setConfigurationState((ISynchronizationTime)newValue);
            }
            case 2: {
                this.setInaccessible((Inaccessible)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetUpdates();
            }
            case 1: {
                this.unsetConfigurationState();
            }
            case 2: {
                this.unsetInaccessible();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetUpdates();
            }
            case 1: {
                return this.isSetConfigurationState();
            }
            case 2: {
                return this.isSetInaccessible();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
