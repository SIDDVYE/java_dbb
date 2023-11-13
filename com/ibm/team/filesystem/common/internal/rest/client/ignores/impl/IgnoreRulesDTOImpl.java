// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRuleDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRulesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class IgnoreRulesDTOImpl extends EObjectImpl implements IgnoreRulesDTO
{
    protected int ALL_FLAGS;
    protected EList rules;
    
    protected IgnoreRulesDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOignoresPackage.Literals.IGNORE_RULES_DTO;
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
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getRules()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRules();
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
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
