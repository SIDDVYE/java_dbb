// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.UnknownIgnoreRuleDTO;

public class UnknownIgnoreRuleDTOImpl extends IgnoreRuleDTOImpl implements UnknownIgnoreRuleDTO
{
    protected static final String PROVIDER_TYPE_EDEFAULT;
    protected String providerType;
    protected static final int PROVIDER_TYPE_ESETFLAG = 2;
    protected static final String DESCRIPTION_EDEFAULT;
    protected String description;
    protected static final int DESCRIPTION_ESETFLAG = 4;
    
    static {
        PROVIDER_TYPE_EDEFAULT = null;
        DESCRIPTION_EDEFAULT = null;
    }
    
    protected UnknownIgnoreRuleDTOImpl() {
        this.providerType = UnknownIgnoreRuleDTOImpl.PROVIDER_TYPE_EDEFAULT;
        this.description = UnknownIgnoreRuleDTOImpl.DESCRIPTION_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOignoresPackage.Literals.UNKNOWN_IGNORE_RULE_DTO;
    }
    
    @Override
    public String getProviderType() {
        return this.providerType;
    }
    
    @Override
    public void setProviderType(final String newProviderType) {
        final String oldProviderType = this.providerType;
        this.providerType = newProviderType;
        final boolean oldProviderTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldProviderType, (Object)this.providerType, !oldProviderTypeESet));
        }
    }
    
    @Override
    public void unsetProviderType() {
        final String oldProviderType = this.providerType;
        final boolean oldProviderTypeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.providerType = UnknownIgnoreRuleDTOImpl.PROVIDER_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldProviderType, (Object)UnknownIgnoreRuleDTOImpl.PROVIDER_TYPE_EDEFAULT, oldProviderTypeESet));
        }
    }
    
    @Override
    public boolean isSetProviderType() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    @Override
    public String getDescription() {
        return this.description;
    }
    
    @Override
    public void setDescription(final String newDescription) {
        final String oldDescription = this.description;
        this.description = newDescription;
        final boolean oldDescriptionESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldDescription, (Object)this.description, !oldDescriptionESet));
        }
    }
    
    @Override
    public void unsetDescription() {
        final String oldDescription = this.description;
        final boolean oldDescriptionESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.description = UnknownIgnoreRuleDTOImpl.DESCRIPTION_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldDescription, (Object)UnknownIgnoreRuleDTOImpl.DESCRIPTION_EDEFAULT, oldDescriptionESet));
        }
    }
    
    @Override
    public boolean isSetDescription() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 1: {
                return this.getProviderType();
            }
            case 2: {
                return this.getDescription();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 1: {
                this.setProviderType((String)newValue);
            }
            case 2: {
                this.setDescription((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 1: {
                this.unsetProviderType();
            }
            case 2: {
                this.unsetDescription();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 1: {
                return this.isSetProviderType();
            }
            case 2: {
                return this.isSetDescription();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (providerType: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.providerType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", description: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.description);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
