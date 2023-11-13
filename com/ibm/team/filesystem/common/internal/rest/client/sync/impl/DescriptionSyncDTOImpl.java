// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.DescriptionItemSyncDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.DescriptionSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class DescriptionSyncDTOImpl extends EObjectImpl implements DescriptionSyncDTO
{
    protected int ALL_FLAGS;
    protected EList items;
    
    protected DescriptionSyncDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.DESCRIPTION_SYNC_DTO;
    }
    
    public List getItems() {
        if (this.items == null) {
            this.items = (EList)new EObjectContainmentEList.Unsettable((Class)DescriptionItemSyncDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.items;
    }
    
    public void unsetItems() {
        if (this.items != null) {
            ((InternalEList.Unsettable)this.items).unset();
        }
    }
    
    public boolean isSetItems() {
        return this.items != null && ((InternalEList.Unsettable)this.items).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getItems()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getItems();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getItems().clear();
                this.getItems().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetItems();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetItems();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
