// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.GetWorkspaceDetailsErrorDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceDetailsDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.GetWorkspaceDetailsResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class GetWorkspaceDetailsResultDTOImpl extends EObjectImpl implements GetWorkspaceDetailsResultDTO
{
    protected int ALL_FLAGS;
    protected EList workspaceDetails;
    protected EList errors;
    
    protected GetWorkspaceDetailsResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOworkspacePackage.Literals.GET_WORKSPACE_DETAILS_RESULT_DTO;
    }
    
    public List getWorkspaceDetails() {
        if (this.workspaceDetails == null) {
            this.workspaceDetails = (EList)new EObjectContainmentEList.Unsettable((Class)WorkspaceDetailsDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.workspaceDetails;
    }
    
    public void unsetWorkspaceDetails() {
        if (this.workspaceDetails != null) {
            ((InternalEList.Unsettable)this.workspaceDetails).unset();
        }
    }
    
    public boolean isSetWorkspaceDetails() {
        return this.workspaceDetails != null && ((InternalEList.Unsettable)this.workspaceDetails).isSet();
    }
    
    public List getErrors() {
        if (this.errors == null) {
            this.errors = (EList)new EObjectContainmentEList.Unsettable((Class)GetWorkspaceDetailsErrorDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.errors;
    }
    
    public void unsetErrors() {
        if (this.errors != null) {
            ((InternalEList.Unsettable)this.errors).unset();
        }
    }
    
    public boolean isSetErrors() {
        return this.errors != null && ((InternalEList.Unsettable)this.errors).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getWorkspaceDetails()).basicRemove((Object)otherEnd, msgs);
            }
            case 1: {
                return ((InternalEList)this.getErrors()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getWorkspaceDetails();
            }
            case 1: {
                return this.getErrors();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getWorkspaceDetails().clear();
                this.getWorkspaceDetails().addAll((Collection)newValue);
            }
            case 1: {
                this.getErrors().clear();
                this.getErrors().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetWorkspaceDetails();
            }
            case 1: {
                this.unsetErrors();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetWorkspaceDetails();
            }
            case 1: {
                return this.isSetErrors();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
