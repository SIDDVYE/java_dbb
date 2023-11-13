// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.IFileAreaUpdate;
import java.util.List;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.dto.Inaccessible;
import com.ibm.team.scm.common.dto.ISynchronizationTime;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.dto.LoadTree;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LoadTreeImpl extends EObjectImpl implements LoadTree
{
    private static final long serialVersionUID = 1L;
    protected int ALL_FLAGS;
    protected EList fileAreaUpdates;
    protected ISynchronizationTime configurationState;
    protected static final int CONFIGURATION_STATE_ESETFLAG = 1;
    protected Inaccessible inaccessible;
    protected static final int INACCESSIBLE_ESETFLAG = 2;
    
    protected LoadTreeImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.LOAD_TREE;
    }
    
    public List getFileAreaUpdates() {
        if (this.fileAreaUpdates == null) {
            this.fileAreaUpdates = (EList)new EObjectContainmentEList.Unsettable(IFileAreaUpdate.class, this, 0) {
                protected boolean isUnique() {
                    return false;
                }
            };
        }
        return (List)this.fileAreaUpdates;
    }
    
    public void unsetFileAreaUpdates() {
        if (this.fileAreaUpdates != null) {
            ((InternalEList.Unsettable)this.fileAreaUpdates).unset();
        }
    }
    
    public boolean isSetFileAreaUpdates() {
        return this.fileAreaUpdates != null && ((InternalEList.Unsettable)this.fileAreaUpdates).isSet();
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
        final boolean oldConfigurationStateESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldConfigurationState, (Object)this.configurationState, !oldConfigurationStateESet));
        }
    }
    
    public void unsetConfigurationState() {
        final ISynchronizationTime oldConfigurationState = this.configurationState;
        final boolean oldConfigurationStateESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.configurationState = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldConfigurationState, (Object)null, oldConfigurationStateESet));
        }
    }
    
    public boolean isSetConfigurationState() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
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
        final boolean oldInaccessibleESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldInaccessible, (Object)this.inaccessible, !oldInaccessibleESet));
        }
    }
    
    public void unsetInaccessible() {
        final Inaccessible oldInaccessible = this.inaccessible;
        final boolean oldInaccessibleESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.inaccessible = null;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldInaccessible, (Object)null, oldInaccessibleESet));
        }
    }
    
    public boolean isSetInaccessible() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getFileAreaUpdates()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getFileAreaUpdates();
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
                this.getFileAreaUpdates().clear();
                this.getFileAreaUpdates().addAll((Collection)newValue);
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
                this.unsetFileAreaUpdates();
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
                return this.isSetFileAreaUpdates();
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
