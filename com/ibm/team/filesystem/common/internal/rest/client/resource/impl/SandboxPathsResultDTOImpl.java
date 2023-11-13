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
import com.ibm.team.filesystem.common.internal.rest.client.resource.SandboxPathsResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SandboxPathsResultDTOImpl extends EObjectImpl implements SandboxPathsResultDTO
{
    protected int ALL_FLAGS;
    protected EList paths;
    
    protected SandboxPathsResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.SANDBOX_PATHS_RESULT_DTO;
    }
    
    public List getPaths() {
        if (this.paths == null) {
            this.paths = (EList)new EObjectContainmentEList.Unsettable((Class)ShareableDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.paths;
    }
    
    public void unsetPaths() {
        if (this.paths != null) {
            ((InternalEList.Unsettable)this.paths).unset();
        }
    }
    
    public boolean isSetPaths() {
        return this.paths != null && ((InternalEList.Unsettable)this.paths).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getPaths()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getPaths();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getPaths().clear();
                this.getPaths().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetPaths();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetPaths();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
