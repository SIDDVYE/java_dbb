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
import com.ibm.team.filesystem.common.internal.rest.client.core.ConnectionDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.SandboxLoadRuleDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SandboxLoadRuleDTOImpl extends EObjectImpl implements SandboxLoadRuleDTO
{
    protected int ALL_FLAGS;
    protected static final String RULE_EDEFAULT;
    protected String rule;
    protected static final int RULE_ESETFLAG = 1;
    protected ConnectionDescriptorDTO connection;
    protected static final int CONNECTION_ESETFLAG = 2;
    
    static {
        RULE_EDEFAULT = null;
    }
    
    protected SandboxLoadRuleDTOImpl() {
        this.ALL_FLAGS = 0;
        this.rule = SandboxLoadRuleDTOImpl.RULE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOloadPackage.Literals.SANDBOX_LOAD_RULE_DTO;
    }
    
    public String getRule() {
        return this.rule;
    }
    
    public void setRule(final String newRule) {
        final String oldRule = this.rule;
        this.rule = newRule;
        final boolean oldRuleESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldRule, (Object)this.rule, !oldRuleESet));
        }
    }
    
    public void unsetRule() {
        final String oldRule = this.rule;
        final boolean oldRuleESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.rule = SandboxLoadRuleDTOImpl.RULE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldRule, (Object)SandboxLoadRuleDTOImpl.RULE_EDEFAULT, oldRuleESet));
        }
    }
    
    public boolean isSetRule() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public ConnectionDescriptorDTO getConnection() {
        return this.connection;
    }
    
    public NotificationChain basicSetConnection(final ConnectionDescriptorDTO newConnection, NotificationChain msgs) {
        final ConnectionDescriptorDTO oldConnection = this.connection;
        this.connection = newConnection;
        final boolean oldConnectionESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldConnection, (Object)newConnection, !oldConnectionESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setConnection(final ConnectionDescriptorDTO newConnection) {
        if (newConnection != this.connection) {
            NotificationChain msgs = null;
            if (this.connection != null) {
                msgs = ((InternalEObject)this.connection).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            }
            if (newConnection != null) {
                msgs = ((InternalEObject)newConnection).eInverseAdd((InternalEObject)this, -2, (Class)null, msgs);
            }
            msgs = this.basicSetConnection(newConnection, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldConnectionESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS |= 0x2;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)newConnection, (Object)newConnection, !oldConnectionESet));
            }
        }
    }
    
    public NotificationChain basicUnsetConnection(NotificationChain msgs) {
        final ConnectionDescriptorDTO oldConnection = this.connection;
        this.connection = null;
        final boolean oldConnectionESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldConnection, (Object)null, oldConnectionESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetConnection() {
        if (this.connection != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.connection).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            msgs = this.basicUnsetConnection(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldConnectionESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFD;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)null, (Object)null, oldConnectionESet));
            }
        }
    }
    
    public boolean isSetConnection() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return this.basicUnsetConnection(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRule();
            }
            case 1: {
                return this.getConnection();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setRule((String)newValue);
            }
            case 1: {
                this.setConnection((ConnectionDescriptorDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetRule();
            }
            case 1: {
                this.unsetConnection();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetRule();
            }
            case 1: {
                return this.isSetConnection();
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
        result.append(" (rule: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.rule);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
