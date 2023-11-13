// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collections;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.IChangeSummary;
import java.util.List;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.IChangeSetHandle;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.dto.ChangeSetSynopsis;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ChangeSetSynopsisImpl extends EObjectImpl implements ChangeSetSynopsis
{
    protected int ALL_FLAGS;
    protected EList changes;
    protected IChangeSetHandle underlyingChangeSet;
    protected static final int UNDERLYING_CHANGE_SET_ESETFLAG = 1;
    protected IComponentHandle component;
    protected static final int COMPONENT_ESETFLAG = 2;
    
    protected ChangeSetSynopsisImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.CHANGE_SET_SYNOPSIS;
    }
    
    public List getChanges() {
        if (this.changes == null) {
            this.changes = (EList)new EObjectContainmentEList.Unsettable(IChangeSummary.class, this, 0) {
                protected boolean isUnique() {
                    return false;
                }
            };
        }
        return (List)this.changes;
    }
    
    public void unsetChanges() {
        if (this.changes != null) {
            ((InternalEList.Unsettable)this.changes).unset();
        }
    }
    
    public boolean isSetChanges() {
        return this.changes != null && ((InternalEList.Unsettable)this.changes).isSet();
    }
    
    public IChangeSetHandle getUnderlyingChangeSet() {
        if (this.underlyingChangeSet != null && ((EObject)this.underlyingChangeSet).eIsProxy()) {
            final InternalEObject oldUnderlyingChangeSet = (InternalEObject)this.underlyingChangeSet;
            this.underlyingChangeSet = (IChangeSetHandle)this.eResolveProxy(oldUnderlyingChangeSet);
            if (this.underlyingChangeSet != oldUnderlyingChangeSet && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 1, (Object)oldUnderlyingChangeSet, (Object)this.underlyingChangeSet));
            }
        }
        return this.underlyingChangeSet;
    }
    
    public IChangeSetHandle basicGetUnderlyingChangeSet() {
        return this.underlyingChangeSet;
    }
    
    public void setUnderlyingChangeSet(final IChangeSetHandle newUnderlyingChangeSet) {
        final IChangeSetHandle oldUnderlyingChangeSet = this.underlyingChangeSet;
        this.underlyingChangeSet = newUnderlyingChangeSet;
        final boolean oldUnderlyingChangeSetESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldUnderlyingChangeSet, (Object)this.underlyingChangeSet, !oldUnderlyingChangeSetESet));
        }
    }
    
    public void unsetUnderlyingChangeSet() {
        final IChangeSetHandle oldUnderlyingChangeSet = this.underlyingChangeSet;
        final boolean oldUnderlyingChangeSetESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.underlyingChangeSet = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldUnderlyingChangeSet, (Object)null, oldUnderlyingChangeSetESet));
        }
    }
    
    public boolean isSetUnderlyingChangeSet() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public IComponentHandle getComponent() {
        if (this.component != null && ((EObject)this.component).eIsProxy()) {
            final InternalEObject oldComponent = (InternalEObject)this.component;
            this.component = (IComponentHandle)this.eResolveProxy(oldComponent);
            if (this.component != oldComponent && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 2, (Object)oldComponent, (Object)this.component));
            }
        }
        return this.component;
    }
    
    public IComponentHandle basicGetComponent() {
        return this.component;
    }
    
    public void setComponent(final IComponentHandle newComponent) {
        final IComponentHandle oldComponent = this.component;
        this.component = newComponent;
        final boolean oldComponentESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldComponent, (Object)this.component, !oldComponentESet));
        }
    }
    
    public void unsetComponent() {
        final IComponentHandle oldComponent = this.component;
        final boolean oldComponentESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.component = null;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldComponent, (Object)null, oldComponentESet));
        }
    }
    
    public boolean isSetComponent() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getChanges()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getChanges();
            }
            case 1: {
                if (resolve) {
                    return this.getUnderlyingChangeSet();
                }
                return this.basicGetUnderlyingChangeSet();
            }
            case 2: {
                if (resolve) {
                    return this.getComponent();
                }
                return this.basicGetComponent();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getChanges().clear();
                this.getChanges().addAll((Collection)newValue);
            }
            case 1: {
                this.setUnderlyingChangeSet((IChangeSetHandle)newValue);
            }
            case 2: {
                this.setComponent((IComponentHandle)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetChanges();
            }
            case 1: {
                this.unsetUnderlyingChangeSet();
            }
            case 2: {
                this.unsetComponent();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetChanges();
            }
            case 1: {
                return this.isSetUnderlyingChangeSet();
            }
            case 2: {
                return this.isSetComponent();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public List changes() {
        return Collections.unmodifiableList((List<?>)this.getChanges());
    }
    
    public IComponentHandle component() {
        return this.getComponent();
    }
    
    public IChangeSetHandle underlyingChange() {
        return this.getUnderlyingChangeSet();
    }
}
