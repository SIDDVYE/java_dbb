// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FindShareableDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FindShareablesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class FindShareablesDTOImpl extends EObjectImpl implements FindShareablesDTO
{
    protected int ALL_FLAGS;
    protected EList results;
    
    protected FindShareablesDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.FIND_SHAREABLES_DTO;
    }
    
    public List getResults() {
        if (this.results == null) {
            this.results = (EList)new EObjectContainmentEList.Unsettable((Class)FindShareableDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.results;
    }
    
    public void unsetResults() {
        if (this.results != null) {
            ((InternalEList.Unsettable)this.results).unset();
        }
    }
    
    public boolean isSetResults() {
        return this.results != null && ((InternalEList.Unsettable)this.results).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getResults()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getResults();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getResults().clear();
                this.getResults().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetResults();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetResults();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
