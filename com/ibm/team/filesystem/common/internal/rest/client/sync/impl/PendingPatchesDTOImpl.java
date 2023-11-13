// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeSetSyncDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.PendingPatchesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class PendingPatchesDTOImpl extends EObjectImpl implements PendingPatchesDTO
{
    protected int ALL_FLAGS;
    protected EList patches;
    
    protected PendingPatchesDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.PENDING_PATCHES_DTO;
    }
    
    public List getPatches() {
        if (this.patches == null) {
            this.patches = (EList)new EObjectResolvingEList.Unsettable((Class)ChangeSetSyncDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.patches;
    }
    
    public void unsetPatches() {
        if (this.patches != null) {
            ((InternalEList.Unsettable)this.patches).unset();
        }
    }
    
    public boolean isSetPatches() {
        return this.patches != null && ((InternalEList.Unsettable)this.patches).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getPatches();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getPatches().clear();
                this.getPatches().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetPatches();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetPatches();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
