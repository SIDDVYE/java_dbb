// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ConflictedChangeDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FilesystemRestClientDTOconflictPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveWithProposedEvaluationDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ResolveWithProposedEvaluationDTOImpl extends EObjectImpl implements ResolveWithProposedEvaluationDTO
{
    protected int ALL_FLAGS;
    protected EList needContentToRemoved;
    protected EList needParentForResolution;
    
    protected ResolveWithProposedEvaluationDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOconflictPackage.Literals.RESOLVE_WITH_PROPOSED_EVALUATION_DTO;
    }
    
    public List getNeedContentToRemoved() {
        if (this.needContentToRemoved == null) {
            this.needContentToRemoved = (EList)new EObjectContainmentEList.Unsettable((Class)ConflictedChangeDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.needContentToRemoved;
    }
    
    public void unsetNeedContentToRemoved() {
        if (this.needContentToRemoved != null) {
            ((InternalEList.Unsettable)this.needContentToRemoved).unset();
        }
    }
    
    public boolean isSetNeedContentToRemoved() {
        return this.needContentToRemoved != null && ((InternalEList.Unsettable)this.needContentToRemoved).isSet();
    }
    
    public List getNeedParentForResolution() {
        if (this.needParentForResolution == null) {
            this.needParentForResolution = (EList)new EObjectContainmentEList.Unsettable((Class)ConflictedChangeDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.needParentForResolution;
    }
    
    public void unsetNeedParentForResolution() {
        if (this.needParentForResolution != null) {
            ((InternalEList.Unsettable)this.needParentForResolution).unset();
        }
    }
    
    public boolean isSetNeedParentForResolution() {
        return this.needParentForResolution != null && ((InternalEList.Unsettable)this.needParentForResolution).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getNeedContentToRemoved()).basicRemove((Object)otherEnd, msgs);
            }
            case 1: {
                return ((InternalEList)this.getNeedParentForResolution()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getNeedContentToRemoved();
            }
            case 1: {
                return this.getNeedParentForResolution();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getNeedContentToRemoved().clear();
                this.getNeedContentToRemoved().addAll((Collection)newValue);
            }
            case 1: {
                this.getNeedParentForResolution().clear();
                this.getNeedParentForResolution().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetNeedContentToRemoved();
            }
            case 1: {
                this.unsetNeedParentForResolution();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetNeedContentToRemoved();
            }
            case 1: {
                return this.isSetNeedParentForResolution();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
