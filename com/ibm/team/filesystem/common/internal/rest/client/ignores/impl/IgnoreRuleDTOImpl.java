// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRuleDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class IgnoreRuleDTOImpl extends EObjectImpl implements IgnoreRuleDTO
{
    protected int ALL_FLAGS;
    protected static final String RULE_TYPE_EDEFAULT;
    protected String ruleType;
    protected static final int RULE_TYPE_ESETFLAG = 1;
    
    static {
        RULE_TYPE_EDEFAULT = null;
    }
    
    protected IgnoreRuleDTOImpl() {
        this.ALL_FLAGS = 0;
        this.ruleType = IgnoreRuleDTOImpl.RULE_TYPE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOignoresPackage.Literals.IGNORE_RULE_DTO;
    }
    
    public String getRuleType() {
        return this.ruleType;
    }
    
    public void setRuleType(final String newRuleType) {
        final String oldRuleType = this.ruleType;
        this.ruleType = newRuleType;
        final boolean oldRuleTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldRuleType, (Object)this.ruleType, !oldRuleTypeESet));
        }
    }
    
    public void unsetRuleType() {
        final String oldRuleType = this.ruleType;
        final boolean oldRuleTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ruleType = IgnoreRuleDTOImpl.RULE_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldRuleType, (Object)IgnoreRuleDTOImpl.RULE_TYPE_EDEFAULT, oldRuleTypeESet));
        }
    }
    
    public boolean isSetRuleType() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRuleType();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setRuleType((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetRuleType();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetRuleType();
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
        result.append(" (ruleType: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.ruleType);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
