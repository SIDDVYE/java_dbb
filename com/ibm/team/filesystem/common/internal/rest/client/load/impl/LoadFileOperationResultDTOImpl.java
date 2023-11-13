// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.BackupInShedDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadFileResultDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadFileOperationResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LoadFileOperationResultDTOImpl extends EObjectImpl implements LoadFileOperationResultDTO
{
    protected int ALL_FLAGS;
    protected EList fileResults;
    protected EList backedUpToShed;
    protected EList deletedContentLocations;
    protected EList localChangeLocations;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 1;
    protected static final int CANCELLED_ESETFLAG = 2;
    
    protected LoadFileOperationResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOloadPackage.Literals.LOAD_FILE_OPERATION_RESULT_DTO;
    }
    
    public List getFileResults() {
        if (this.fileResults == null) {
            this.fileResults = (EList)new EObjectContainmentEList.Unsettable((Class)LoadFileResultDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.fileResults;
    }
    
    public void unsetFileResults() {
        if (this.fileResults != null) {
            ((InternalEList.Unsettable)this.fileResults).unset();
        }
    }
    
    public boolean isSetFileResults() {
        return this.fileResults != null && ((InternalEList.Unsettable)this.fileResults).isSet();
    }
    
    public List getBackedUpToShed() {
        if (this.backedUpToShed == null) {
            this.backedUpToShed = (EList)new EObjectContainmentEList.Unsettable((Class)BackupInShedDTO.class, (InternalEObject)this, 1);
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
    
    public List getDeletedContentLocations() {
        if (this.deletedContentLocations == null) {
            this.deletedContentLocations = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 2);
        }
        return (List)this.deletedContentLocations;
    }
    
    public void unsetDeletedContentLocations() {
        if (this.deletedContentLocations != null) {
            ((InternalEList.Unsettable)this.deletedContentLocations).unset();
        }
    }
    
    public boolean isSetDeletedContentLocations() {
        return this.deletedContentLocations != null && ((InternalEList.Unsettable)this.deletedContentLocations).isSet();
    }
    
    public List getLocalChangeLocations() {
        if (this.localChangeLocations == null) {
            this.localChangeLocations = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 3);
        }
        return (List)this.localChangeLocations;
    }
    
    public void unsetLocalChangeLocations() {
        if (this.localChangeLocations != null) {
            ((InternalEList.Unsettable)this.localChangeLocations).unset();
        }
    }
    
    public boolean isSetLocalChangeLocations() {
        return this.localChangeLocations != null && ((InternalEList.Unsettable)this.localChangeLocations).isSet();
    }
    
    public boolean isCancelled() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setCancelled(final boolean newCancelled) {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newCancelled) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldCancelled, newCancelled, !oldCancelledESet));
        }
    }
    
    public void unsetCancelled() {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldCancelled, false, oldCancelledESet));
        }
    }
    
    public boolean isSetCancelled() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getFileResults()).basicRemove((Object)otherEnd, msgs);
            }
            case 1: {
                return ((InternalEList)this.getBackedUpToShed()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getFileResults();
            }
            case 1: {
                return this.getBackedUpToShed();
            }
            case 2: {
                return this.getDeletedContentLocations();
            }
            case 3: {
                return this.getLocalChangeLocations();
            }
            case 4: {
                return this.isCancelled() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getFileResults().clear();
                this.getFileResults().addAll((Collection)newValue);
            }
            case 1: {
                this.getBackedUpToShed().clear();
                this.getBackedUpToShed().addAll((Collection)newValue);
            }
            case 2: {
                this.getDeletedContentLocations().clear();
                this.getDeletedContentLocations().addAll((Collection)newValue);
            }
            case 3: {
                this.getLocalChangeLocations().clear();
                this.getLocalChangeLocations().addAll((Collection)newValue);
            }
            case 4: {
                this.setCancelled((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetFileResults();
            }
            case 1: {
                this.unsetBackedUpToShed();
            }
            case 2: {
                this.unsetDeletedContentLocations();
            }
            case 3: {
                this.unsetLocalChangeLocations();
            }
            case 4: {
                this.unsetCancelled();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetFileResults();
            }
            case 1: {
                return this.isSetBackedUpToShed();
            }
            case 2: {
                return this.isSetDeletedContentLocations();
            }
            case 3: {
                return this.isSetLocalChangeLocations();
            }
            case 4: {
                return this.isSetCancelled();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (deletedContentLocations: ");
        result.append(this.deletedContentLocations);
        result.append(", localChangeLocations: ");
        result.append(this.localChangeLocations);
        result.append(", cancelled: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
