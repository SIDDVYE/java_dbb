// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcePropertiesDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ResourcesDTOImpl extends EObjectImpl implements ResourcesDTO
{
    protected int ALL_FLAGS;
    protected EList resourceProperties;
    
    protected ResourcesDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.RESOURCES_DTO;
    }
    
    public List getResourceProperties() {
        if (this.resourceProperties == null) {
            this.resourceProperties = (EList)new EObjectContainmentEList.Unsettable((Class)ResourcePropertiesDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.resourceProperties;
    }
    
    public void unsetResourceProperties() {
        if (this.resourceProperties != null) {
            ((InternalEList.Unsettable)this.resourceProperties).unset();
        }
    }
    
    public boolean isSetResourceProperties() {
        return this.resourceProperties != null && ((InternalEList.Unsettable)this.resourceProperties).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getResourceProperties()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getResourceProperties();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getResourceProperties().clear();
                this.getResourceProperties().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetResourceProperties();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetResourceProperties();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
