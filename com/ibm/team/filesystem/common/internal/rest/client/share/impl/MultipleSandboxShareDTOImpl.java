// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.share.MultipleSandboxShareDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class MultipleSandboxShareDTOImpl extends EObjectImpl implements MultipleSandboxShareDTO
{
    protected int ALL_FLAGS;
    protected ConfigurationDescriptorDTO configuration;
    protected static final int CONFIGURATION_ESETFLAG = 1;
    protected EList sandboxes;
    protected EList roots;
    
    protected MultipleSandboxShareDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsharePackage.Literals.MULTIPLE_SANDBOX_SHARE_DTO;
    }
    
    public ConfigurationDescriptorDTO getConfiguration() {
        return this.configuration;
    }
    
    public NotificationChain basicSetConfiguration(final ConfigurationDescriptorDTO newConfiguration, NotificationChain msgs) {
        final ConfigurationDescriptorDTO oldConfiguration = this.configuration;
        this.configuration = newConfiguration;
        final boolean oldConfigurationESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldConfiguration, (Object)newConfiguration, !oldConfigurationESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setConfiguration(final ConfigurationDescriptorDTO newConfiguration) {
        if (newConfiguration != this.configuration) {
            NotificationChain msgs = null;
            if (this.configuration != null) {
                msgs = ((InternalEObject)this.configuration).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newConfiguration != null) {
                msgs = ((InternalEObject)newConfiguration).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetConfiguration(newConfiguration, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldConfigurationESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newConfiguration, (Object)newConfiguration, !oldConfigurationESet));
            }
        }
    }
    
    public NotificationChain basicUnsetConfiguration(NotificationChain msgs) {
        final ConfigurationDescriptorDTO oldConfiguration = this.configuration;
        this.configuration = null;
        final boolean oldConfigurationESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldConfiguration, (Object)null, oldConfigurationESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetConfiguration() {
        if (this.configuration != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.configuration).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetConfiguration(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldConfigurationESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldConfigurationESet));
            }
        }
    }
    
    public boolean isSetConfiguration() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public List getSandboxes() {
        if (this.sandboxes == null) {
            this.sandboxes = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 1);
        }
        return (List)this.sandboxes;
    }
    
    public void unsetSandboxes() {
        if (this.sandboxes != null) {
            ((InternalEList.Unsettable)this.sandboxes).unset();
        }
    }
    
    public boolean isSetSandboxes() {
        return this.sandboxes != null && ((InternalEList.Unsettable)this.sandboxes).isSet();
    }
    
    public List getRoots() {
        if (this.roots == null) {
            this.roots = (EList)new EObjectContainmentEList.Unsettable((Class)ShareableDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.roots;
    }
    
    public void unsetRoots() {
        if (this.roots != null) {
            ((InternalEList.Unsettable)this.roots).unset();
        }
    }
    
    public boolean isSetRoots() {
        return this.roots != null && ((InternalEList.Unsettable)this.roots).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetConfiguration(msgs);
            }
            case 2: {
                return ((InternalEList)this.getRoots()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getConfiguration();
            }
            case 1: {
                return this.getSandboxes();
            }
            case 2: {
                return this.getRoots();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setConfiguration((ConfigurationDescriptorDTO)newValue);
            }
            case 1: {
                this.getSandboxes().clear();
                this.getSandboxes().addAll((Collection)newValue);
            }
            case 2: {
                this.getRoots().clear();
                this.getRoots().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetConfiguration();
            }
            case 1: {
                this.unsetSandboxes();
            }
            case 2: {
                this.unsetRoots();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetConfiguration();
            }
            case 1: {
                return this.isSetSandboxes();
            }
            case 2: {
                return this.isSetRoots();
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
        result.append(" (sandboxes: ");
        result.append(this.sandboxes);
        result.append(')');
        return result.toString();
    }
}
