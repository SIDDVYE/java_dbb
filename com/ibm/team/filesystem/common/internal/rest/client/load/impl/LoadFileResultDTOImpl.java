// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.StatusDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadFileResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LoadFileResultDTOImpl extends EObjectImpl implements LoadFileResultDTO
{
    protected int ALL_FLAGS;
    protected static final String FILE_ITEM_ID_EDEFAULT;
    protected String fileItemId;
    protected static final int FILE_ITEM_ID_ESETFLAG = 1;
    protected static final String FILE_ITEM_STATE_ID_EDEFAULT;
    protected String fileItemStateId;
    protected static final int FILE_ITEM_STATE_ID_ESETFLAG = 2;
    protected StatusDTO failureStatus;
    protected static final int FAILURE_STATUS_ESETFLAG = 4;
    
    static {
        FILE_ITEM_ID_EDEFAULT = null;
        FILE_ITEM_STATE_ID_EDEFAULT = null;
    }
    
    protected LoadFileResultDTOImpl() {
        this.ALL_FLAGS = 0;
        this.fileItemId = LoadFileResultDTOImpl.FILE_ITEM_ID_EDEFAULT;
        this.fileItemStateId = LoadFileResultDTOImpl.FILE_ITEM_STATE_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOloadPackage.Literals.LOAD_FILE_RESULT_DTO;
    }
    
    public String getFileItemId() {
        return this.fileItemId;
    }
    
    public void setFileItemId(final String newFileItemId) {
        final String oldFileItemId = this.fileItemId;
        this.fileItemId = newFileItemId;
        final boolean oldFileItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldFileItemId, (Object)this.fileItemId, !oldFileItemIdESet));
        }
    }
    
    public void unsetFileItemId() {
        final String oldFileItemId = this.fileItemId;
        final boolean oldFileItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.fileItemId = LoadFileResultDTOImpl.FILE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldFileItemId, (Object)LoadFileResultDTOImpl.FILE_ITEM_ID_EDEFAULT, oldFileItemIdESet));
        }
    }
    
    public boolean isSetFileItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getFileItemStateId() {
        return this.fileItemStateId;
    }
    
    public void setFileItemStateId(final String newFileItemStateId) {
        final String oldFileItemStateId = this.fileItemStateId;
        this.fileItemStateId = newFileItemStateId;
        final boolean oldFileItemStateIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldFileItemStateId, (Object)this.fileItemStateId, !oldFileItemStateIdESet));
        }
    }
    
    public void unsetFileItemStateId() {
        final String oldFileItemStateId = this.fileItemStateId;
        final boolean oldFileItemStateIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.fileItemStateId = LoadFileResultDTOImpl.FILE_ITEM_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldFileItemStateId, (Object)LoadFileResultDTOImpl.FILE_ITEM_STATE_ID_EDEFAULT, oldFileItemStateIdESet));
        }
    }
    
    public boolean isSetFileItemStateId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public StatusDTO getFailureStatus() {
        return this.failureStatus;
    }
    
    public NotificationChain basicSetFailureStatus(final StatusDTO newFailureStatus, NotificationChain msgs) {
        final StatusDTO oldFailureStatus = this.failureStatus;
        this.failureStatus = newFailureStatus;
        final boolean oldFailureStatusESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldFailureStatus, (Object)newFailureStatus, !oldFailureStatusESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setFailureStatus(final StatusDTO newFailureStatus) {
        if (newFailureStatus != this.failureStatus) {
            NotificationChain msgs = null;
            if (this.failureStatus != null) {
                msgs = ((InternalEObject)this.failureStatus).eInverseRemove((InternalEObject)this, -3, (Class)null, msgs);
            }
            if (newFailureStatus != null) {
                msgs = ((InternalEObject)newFailureStatus).eInverseAdd((InternalEObject)this, -3, (Class)null, msgs);
            }
            msgs = this.basicSetFailureStatus(newFailureStatus, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldFailureStatusESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS |= 0x4;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)newFailureStatus, (Object)newFailureStatus, !oldFailureStatusESet));
            }
        }
    }
    
    public NotificationChain basicUnsetFailureStatus(NotificationChain msgs) {
        final StatusDTO oldFailureStatus = this.failureStatus;
        this.failureStatus = null;
        final boolean oldFailureStatusESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldFailureStatus, (Object)null, oldFailureStatusESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetFailureStatus() {
        if (this.failureStatus != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.failureStatus).eInverseRemove((InternalEObject)this, -3, (Class)null, msgs);
            msgs = this.basicUnsetFailureStatus(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldFailureStatusESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFB;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)null, (Object)null, oldFailureStatusESet));
            }
        }
    }
    
    public boolean isSetFailureStatus() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 2: {
                return this.basicUnsetFailureStatus(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getFileItemId();
            }
            case 1: {
                return this.getFileItemStateId();
            }
            case 2: {
                return this.getFailureStatus();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setFileItemId((String)newValue);
            }
            case 1: {
                this.setFileItemStateId((String)newValue);
            }
            case 2: {
                this.setFailureStatus((StatusDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetFileItemId();
            }
            case 1: {
                this.unsetFileItemStateId();
            }
            case 2: {
                this.unsetFailureStatus();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetFileItemId();
            }
            case 1: {
                return this.isSetFileItemStateId();
            }
            case 2: {
                return this.isSetFailureStatus();
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
        result.append(" (fileItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.fileItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", fileItemStateId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.fileItemStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
