// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.BackupInShedDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SandboxUpdateDilemmaDTOImpl extends EObjectImpl implements SandboxUpdateDilemmaDTO
{
    protected int ALL_FLAGS;
    protected EList backedUpToShed;
    protected EList deletedContentShareables;
    
    protected SandboxUpdateDilemmaDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOdilemmaPackage.Literals.SANDBOX_UPDATE_DILEMMA_DTO;
    }
    
    public List getDeletedContentShareables() {
        if (this.deletedContentShareables == null) {
            this.deletedContentShareables = (EList)new EObjectContainmentEList.Unsettable((Class)ShareableDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.deletedContentShareables;
    }
    
    public void unsetDeletedContentShareables() {
        if (this.deletedContentShareables != null) {
            ((InternalEList.Unsettable)this.deletedContentShareables).unset();
        }
    }
    
    public boolean isSetDeletedContentShareables() {
        return this.deletedContentShareables != null && ((InternalEList.Unsettable)this.deletedContentShareables).isSet();
    }
    
    public List getBackedUpToShed() {
        if (this.backedUpToShed == null) {
            this.backedUpToShed = (EList)new EObjectContainmentEList.Unsettable((Class)BackupInShedDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.backedUpToShed;
    }
    
    public void unsetBackedUpToShed() {
        if (this.backedUpToShed != null) {
            ((InternalEList.Unsettable)this.backedUpToShed).unset();
        }
    }
    
    public boolean isSetBackedUpToShed() {
        return this.backedUpToShed != null && ((InternalEList.Unsettable)this.backedUpToShed).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getBackedUpToShed()).basicRemove((Object)otherEnd, msgs);
            }
            case 1: {
                return ((InternalEList)this.getDeletedContentShareables()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getBackedUpToShed();
            }
            case 1: {
                return this.getDeletedContentShareables();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getBackedUpToShed().clear();
                this.getBackedUpToShed().addAll((Collection)newValue);
            }
            case 1: {
                this.getDeletedContentShareables().clear();
                this.getDeletedContentShareables().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBackedUpToShed();
            }
            case 1: {
                this.unsetDeletedContentShareables();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBackedUpToShed();
            }
            case 1: {
                return this.isSetDeletedContentShareables();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
