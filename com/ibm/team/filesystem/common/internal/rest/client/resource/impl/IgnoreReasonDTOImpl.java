// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRuleDTO;
import java.util.List;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.resource.IgnoreReasonDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class IgnoreReasonDTOImpl extends EObjectImpl implements IgnoreReasonDTO
{
    protected int ALL_FLAGS;
    protected EList rules;
    protected PathDTO inheritsFrom;
    protected static final int INHERITS_FROM_ESETFLAG = 1;
    
    protected IgnoreReasonDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.IGNORE_REASON_DTO;
    }
    
    public PathDTO getInheritsFrom() {
        return this.inheritsFrom;
    }
    
    public NotificationChain basicSetInheritsFrom(final PathDTO newInheritsFrom, NotificationChain msgs) {
        final PathDTO oldInheritsFrom = this.inheritsFrom;
        this.inheritsFrom = newInheritsFrom;
        final boolean oldInheritsFromESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldInheritsFrom, (Object)newInheritsFrom, !oldInheritsFromESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setInheritsFrom(final PathDTO newInheritsFrom) {
        if (newInheritsFrom != this.inheritsFrom) {
            NotificationChain msgs = null;
            if (this.inheritsFrom != null) {
                msgs = ((InternalEObject)this.inheritsFrom).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            }
            if (newInheritsFrom != null) {
                msgs = ((InternalEObject)newInheritsFrom).eInverseAdd((InternalEObject)this, -2, (Class)null, msgs);
            }
            msgs = this.basicSetInheritsFrom(newInheritsFrom, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldInheritsFromESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)newInheritsFrom, (Object)newInheritsFrom, !oldInheritsFromESet));
            }
        }
    }
    
    public NotificationChain basicUnsetInheritsFrom(NotificationChain msgs) {
        final PathDTO oldInheritsFrom = this.inheritsFrom;
        this.inheritsFrom = null;
        final boolean oldInheritsFromESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldInheritsFrom, (Object)null, oldInheritsFromESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetInheritsFrom() {
        if (this.inheritsFrom != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.inheritsFrom).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            msgs = this.basicUnsetInheritsFrom(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldInheritsFromESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)null, (Object)null, oldInheritsFromESet));
            }
        }
    }
    
    public boolean isSetInheritsFrom() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getRules()).basicRemove((Object)otherEnd, msgs);
            }
            case 1: {
                return this.basicUnsetInheritsFrom(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public List getRules() {
        if (this.rules == null) {
            this.rules = (EList)new EObjectContainmentEList.Unsettable((Class)IgnoreRuleDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.rules;
    }
    
    public void unsetRules() {
        if (this.rules != null) {
            ((InternalEList.Unsettable)this.rules).unset();
        }
    }
    
    public boolean isSetRules() {
        return this.rules != null && ((InternalEList.Unsettable)this.rules).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRules();
            }
            case 1: {
                return this.getInheritsFrom();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getRules().clear();
                this.getRules().addAll((Collection)newValue);
            }
            case 1: {
                this.setInheritsFrom((PathDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetRules();
            }
            case 1: {
                this.unsetInheritsFrom();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetRules();
            }
            case 1: {
                return this.isSetInheritsFrom();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
