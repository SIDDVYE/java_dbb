// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChangesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ConfigurationWithUncheckedInChangesDTOImpl extends EObjectImpl implements ConfigurationWithUncheckedInChangesDTO
{
    protected int ALL_FLAGS;
    protected static final int CHANGE_COUNT_EDEFAULT = 0;
    protected int changeCount;
    protected static final int CHANGE_COUNT_ESETFLAG = 1;
    protected ConfigurationDescriptorDTO configuration;
    protected static final int CONFIGURATION_ESETFLAG = 2;
    
    protected ConfigurationWithUncheckedInChangesDTOImpl() {
        this.ALL_FLAGS = 0;
        this.changeCount = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.CONFIGURATION_WITH_UNCHECKED_IN_CHANGES_DTO;
    }
    
    public ConfigurationDescriptorDTO getConfiguration() {
        if (this.configuration != null && ((EObject)this.configuration).eIsProxy()) {
            final InternalEObject oldConfiguration = (InternalEObject)this.configuration;
            this.configuration = (ConfigurationDescriptorDTO)this.eResolveProxy(oldConfiguration);
            if (this.configuration != oldConfiguration && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 1, (Object)oldConfiguration, (Object)this.configuration));
            }
        }
        return this.configuration;
    }
    
    public ConfigurationDescriptorDTO basicGetConfiguration() {
        return this.configuration;
    }
    
    public void setConfiguration(final ConfigurationDescriptorDTO newConfiguration) {
        final ConfigurationDescriptorDTO oldConfiguration = this.configuration;
        this.configuration = newConfiguration;
        final boolean oldConfigurationESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldConfiguration, (Object)this.configuration, !oldConfigurationESet));
        }
    }
    
    public void unsetConfiguration() {
        final ConfigurationDescriptorDTO oldConfiguration = this.configuration;
        final boolean oldConfigurationESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.configuration = null;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldConfiguration, (Object)null, oldConfigurationESet));
        }
    }
    
    public boolean isSetConfiguration() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public int getChangeCount() {
        return this.changeCount;
    }
    
    public void setChangeCount(final int newChangeCount) {
        final int oldChangeCount = this.changeCount;
        this.changeCount = newChangeCount;
        final boolean oldChangeCountESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldChangeCount, this.changeCount, !oldChangeCountESet));
        }
    }
    
    public void unsetChangeCount() {
        final int oldChangeCount = this.changeCount;
        final boolean oldChangeCountESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.changeCount = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldChangeCount, 0, oldChangeCountESet));
        }
    }
    
    public boolean isSetChangeCount() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return new Integer(this.getChangeCount());
            }
            case 1: {
                if (resolve) {
                    return this.getConfiguration();
                }
                return this.basicGetConfiguration();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setChangeCount((int)newValue);
            }
            case 1: {
                this.setConfiguration((ConfigurationDescriptorDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetChangeCount();
            }
            case 1: {
                this.unsetConfiguration();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetChangeCount();
            }
            case 1: {
                return this.isSetConfiguration();
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
        result.append(" (changeCount: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.changeCount);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
