// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OutOfSyncWorkspaceDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OutOfSyncWorkspacesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class OutOfSyncWorkspacesDTOImpl extends EObjectImpl implements OutOfSyncWorkspacesDTO
{
    protected int ALL_FLAGS;
    protected EList workspaces;
    
    protected OutOfSyncWorkspacesDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.OUT_OF_SYNC_WORKSPACES_DTO;
    }
    
    public List getWorkspaces() {
        if (this.workspaces == null) {
            this.workspaces = (EList)new EObjectContainmentEList.Unsettable((Class)OutOfSyncWorkspaceDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.workspaces;
    }
    
    public void unsetWorkspaces() {
        if (this.workspaces != null) {
            ((InternalEList.Unsettable)this.workspaces).unset();
        }
    }
    
    public boolean isSetWorkspaces() {
        return this.workspaces != null && ((InternalEList.Unsettable)this.workspaces).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getWorkspaces()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getWorkspaces();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getWorkspaces().clear();
                this.getWorkspaces().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetWorkspaces();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetWorkspaces();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
