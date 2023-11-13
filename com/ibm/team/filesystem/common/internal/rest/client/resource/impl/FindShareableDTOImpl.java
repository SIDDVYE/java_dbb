// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FindShareableDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class FindShareableDTOImpl extends EObjectImpl implements FindShareableDTO
{
    protected int ALL_FLAGS;
    protected EList shareables;
    
    protected FindShareableDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.FIND_SHAREABLE_DTO;
    }
    
    public List getShareables() {
        if (this.shareables == null) {
            this.shareables = (EList)new EObjectContainmentEList.Unsettable((Class)ShareableDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.shareables;
    }
    
    public void unsetShareables() {
        if (this.shareables != null) {
            ((InternalEList.Unsettable)this.shareables).unset();
        }
    }
    
    public boolean isSetShareables() {
        return this.shareables != null && ((InternalEList.Unsettable)this.shareables).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getShareables()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getShareables();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getShareables().clear();
                this.getShareables().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetShareables();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetShareables();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
