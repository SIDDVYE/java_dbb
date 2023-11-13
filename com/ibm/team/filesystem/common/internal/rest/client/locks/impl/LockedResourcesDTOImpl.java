// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ContributorNameDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.StreamLockReportDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedShareableDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedResourcesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LockedResourcesDTOImpl extends EObjectImpl implements LockedResourcesDTO
{
    protected int ALL_FLAGS;
    protected EList lockedShareables;
    protected EList owners;
    protected EList teamLocks;
    protected EList userLocks;
    
    protected LockedResourcesDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOlocksPackage.Literals.LOCKED_RESOURCES_DTO;
    }
    
    public List getLockedShareables() {
        if (this.lockedShareables == null) {
            this.lockedShareables = (EList)new EObjectContainmentEList.Unsettable((Class)LockedShareableDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.lockedShareables;
    }
    
    public void unsetLockedShareables() {
        if (this.lockedShareables != null) {
            ((InternalEList.Unsettable)this.lockedShareables).unset();
        }
    }
    
    public boolean isSetLockedShareables() {
        return this.lockedShareables != null && ((InternalEList.Unsettable)this.lockedShareables).isSet();
    }
    
    public List getUserLocks() {
        if (this.userLocks == null) {
            this.userLocks = (EList)new EObjectContainmentEList.Unsettable((Class)StreamLockReportDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.userLocks;
    }
    
    public void unsetUserLocks() {
        if (this.userLocks != null) {
            ((InternalEList.Unsettable)this.userLocks).unset();
        }
    }
    
    public boolean isSetUserLocks() {
        return this.userLocks != null && ((InternalEList.Unsettable)this.userLocks).isSet();
    }
    
    public List getTeamLocks() {
        if (this.teamLocks == null) {
            this.teamLocks = (EList)new EObjectContainmentEList.Unsettable((Class)StreamLockReportDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.teamLocks;
    }
    
    public void unsetTeamLocks() {
        if (this.teamLocks != null) {
            ((InternalEList.Unsettable)this.teamLocks).unset();
        }
    }
    
    public boolean isSetTeamLocks() {
        return this.teamLocks != null && ((InternalEList.Unsettable)this.teamLocks).isSet();
    }
    
    public List getOwners() {
        if (this.owners == null) {
            this.owners = (EList)new EObjectResolvingEList.Unsettable((Class)ContributorNameDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.owners;
    }
    
    public void unsetOwners() {
        if (this.owners != null) {
            ((InternalEList.Unsettable)this.owners).unset();
        }
    }
    
    public boolean isSetOwners() {
        return this.owners != null && ((InternalEList.Unsettable)this.owners).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getLockedShareables()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return ((InternalEList)this.getTeamLocks()).basicRemove((Object)otherEnd, msgs);
            }
            case 3: {
                return ((InternalEList)this.getUserLocks()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getLockedShareables();
            }
            case 1: {
                return this.getOwners();
            }
            case 2: {
                return this.getTeamLocks();
            }
            case 3: {
                return this.getUserLocks();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getLockedShareables().clear();
                this.getLockedShareables().addAll((Collection)newValue);
            }
            case 1: {
                this.getOwners().clear();
                this.getOwners().addAll((Collection)newValue);
            }
            case 2: {
                this.getTeamLocks().clear();
                this.getTeamLocks().addAll((Collection)newValue);
            }
            case 3: {
                this.getUserLocks().clear();
                this.getUserLocks().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetLockedShareables();
            }
            case 1: {
                this.unsetOwners();
            }
            case 2: {
                this.unsetTeamLocks();
            }
            case 3: {
                this.unsetUserLocks();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetLockedShareables();
            }
            case 1: {
                return this.isSetOwners();
            }
            case 2: {
                return this.isSetTeamLocks();
            }
            case 3: {
                return this.isSetUserLocks();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
