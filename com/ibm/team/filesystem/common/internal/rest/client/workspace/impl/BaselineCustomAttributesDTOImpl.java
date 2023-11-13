// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.impl;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;
import com.ibm.team.scm.common.internal.impl.PropertyImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import java.util.Map;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EMap;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.BaselineCustomAttributesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class BaselineCustomAttributesDTOImpl extends EObjectImpl implements BaselineCustomAttributesDTO
{
    protected int ALL_FLAGS;
    protected EMap customAttributes;
    
    protected BaselineCustomAttributesDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOworkspacePackage.Literals.BASELINE_CUSTOM_ATTRIBUTES_DTO;
    }
    
    public Map getCustomAttributes() {
        if (this.customAttributes == null) {
            this.customAttributes = (EMap)new EcoreEMap.Unsettable(ScmPackage.Literals.PROPERTY, (Class)PropertyImpl.class, (InternalEObject)this, 0);
        }
        return this.customAttributes.map();
    }
    
    public void unsetCustomAttributes() {
        if (this.customAttributes != null) {
            ((InternalEList.Unsettable)this.customAttributes).unset();
        }
    }
    
    public boolean isSetCustomAttributes() {
        return this.customAttributes != null && ((InternalEList.Unsettable)this.customAttributes).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)((EMap.InternalMapView)this.getCustomAttributes()).eMap()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                if (coreType) {
                    return ((EMap.InternalMapView)this.getCustomAttributes()).eMap();
                }
                return this.getCustomAttributes();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                ((EStructuralFeature.Setting)((EMap.InternalMapView)this.getCustomAttributes()).eMap()).set(newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetCustomAttributes();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetCustomAttributes();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
