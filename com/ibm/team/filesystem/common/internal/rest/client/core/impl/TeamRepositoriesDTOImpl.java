// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.TeamRepositoryDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.TeamRepositoriesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class TeamRepositoriesDTOImpl extends EObjectImpl implements TeamRepositoriesDTO
{
    protected int ALL_FLAGS;
    protected EList repositories;
    
    protected TeamRepositoriesDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.TEAM_REPOSITORIES_DTO;
    }
    
    public List getRepositories() {
        if (this.repositories == null) {
            this.repositories = (EList)new EObjectContainmentEList.Unsettable((Class)TeamRepositoryDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.repositories;
    }
    
    public void unsetRepositories() {
        if (this.repositories != null) {
            ((InternalEList.Unsettable)this.repositories).unset();
        }
    }
    
    public boolean isSetRepositories() {
        return this.repositories != null && ((InternalEList.Unsettable)this.repositories).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getRepositories()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRepositories();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getRepositories().clear();
                this.getRepositories().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetRepositories();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetRepositories();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
