// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class UpdateDilemmaDTOImpl extends EObjectImpl implements UpdateDilemmaDTO
{
    protected int ALL_FLAGS;
    protected EList inaccessibleForUpdate;
    protected EList siblingSharesToAdd;
    
    protected UpdateDilemmaDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOdilemmaPackage.Literals.UPDATE_DILEMMA_DTO;
    }
    
    public List getInaccessibleForUpdate() {
        if (this.inaccessibleForUpdate == null) {
            this.inaccessibleForUpdate = (EList)new EObjectContainmentEList.Unsettable((Class)ShareableDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.inaccessibleForUpdate;
    }
    
    public void unsetInaccessibleForUpdate() {
        if (this.inaccessibleForUpdate != null) {
            ((InternalEList.Unsettable)this.inaccessibleForUpdate).unset();
        }
    }
    
    public boolean isSetInaccessibleForUpdate() {
        return this.inaccessibleForUpdate != null && ((InternalEList.Unsettable)this.inaccessibleForUpdate).isSet();
    }
    
    public List getSiblingSharesToAdd() {
        if (this.siblingSharesToAdd == null) {
            this.siblingSharesToAdd = (EList)new EObjectContainmentEList.Unsettable((Class)ShareableDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.siblingSharesToAdd;
    }
    
    public void unsetSiblingSharesToAdd() {
        if (this.siblingSharesToAdd != null) {
            ((InternalEList.Unsettable)this.siblingSharesToAdd).unset();
        }
    }
    
    public boolean isSetSiblingSharesToAdd() {
        return this.siblingSharesToAdd != null && ((InternalEList.Unsettable)this.siblingSharesToAdd).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getInaccessibleForUpdate()).basicRemove((Object)otherEnd, msgs);
            }
            case 1: {
                return ((InternalEList)this.getSiblingSharesToAdd()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getInaccessibleForUpdate();
            }
            case 1: {
                return this.getSiblingSharesToAdd();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getInaccessibleForUpdate().clear();
                this.getInaccessibleForUpdate().addAll((Collection)newValue);
            }
            case 1: {
                this.getSiblingSharesToAdd().clear();
                this.getSiblingSharesToAdd().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetInaccessibleForUpdate();
            }
            case 1: {
                this.unsetSiblingSharesToAdd();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetInaccessibleForUpdate();
            }
            case 1: {
                return this.isSetSiblingSharesToAdd();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
