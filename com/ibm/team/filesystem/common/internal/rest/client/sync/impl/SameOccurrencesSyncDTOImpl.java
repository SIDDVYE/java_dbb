// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SameOccurrenceSyncDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SameOccurrencesSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SameOccurrencesSyncDTOImpl extends EObjectImpl implements SameOccurrencesSyncDTO
{
    protected int ALL_FLAGS;
    protected EList occurrences;
    
    protected SameOccurrencesSyncDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.SAME_OCCURRENCES_SYNC_DTO;
    }
    
    public List getOccurrences() {
        if (this.occurrences == null) {
            this.occurrences = (EList)new EObjectContainmentEList.Unsettable((Class)SameOccurrenceSyncDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.occurrences;
    }
    
    public void unsetOccurrences() {
        if (this.occurrences != null) {
            ((InternalEList.Unsettable)this.occurrences).unset();
        }
    }
    
    public boolean isSetOccurrences() {
        return this.occurrences != null && ((InternalEList.Unsettable)this.occurrences).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getOccurrences()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getOccurrences();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getOccurrences().clear();
                this.getOccurrences().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetOccurrences();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetOccurrences();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
