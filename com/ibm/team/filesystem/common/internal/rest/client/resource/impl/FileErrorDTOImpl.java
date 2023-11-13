// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FileErrorDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public abstract class FileErrorDTOImpl extends EObjectImpl implements FileErrorDTO
{
    protected int ALL_FLAGS;
    protected PathDTO fileName;
    protected static final int FILE_NAME_ESETFLAG = 1;
    protected ShareDTO share;
    protected static final int SHARE_ESETFLAG = 2;
    
    protected FileErrorDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.FILE_ERROR_DTO;
    }
    
    public PathDTO getFileName() {
        return this.fileName;
    }
    
    public NotificationChain basicSetFileName(final PathDTO newFileName, NotificationChain msgs) {
        final PathDTO oldFileName = this.fileName;
        this.fileName = newFileName;
        final boolean oldFileNameESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldFileName, (Object)newFileName, !oldFileNameESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setFileName(final PathDTO newFileName) {
        if (newFileName != this.fileName) {
            NotificationChain msgs = null;
            if (this.fileName != null) {
                msgs = ((InternalEObject)this.fileName).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newFileName != null) {
                msgs = ((InternalEObject)newFileName).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetFileName(newFileName, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldFileNameESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newFileName, (Object)newFileName, !oldFileNameESet));
            }
        }
    }
    
    public NotificationChain basicUnsetFileName(NotificationChain msgs) {
        final PathDTO oldFileName = this.fileName;
        this.fileName = null;
        final boolean oldFileNameESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldFileName, (Object)null, oldFileNameESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetFileName() {
        if (this.fileName != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.fileName).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetFileName(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldFileNameESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldFileNameESet));
            }
        }
    }
    
    public boolean isSetFileName() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public ShareDTO getShare() {
        return this.share;
    }
    
    public NotificationChain basicSetShare(final ShareDTO newShare, NotificationChain msgs) {
        final ShareDTO oldShare = this.share;
        this.share = newShare;
        final boolean oldShareESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldShare, (Object)newShare, !oldShareESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setShare(final ShareDTO newShare) {
        if (newShare != this.share) {
            NotificationChain msgs = null;
            if (this.share != null) {
                msgs = ((InternalEObject)this.share).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            }
            if (newShare != null) {
                msgs = ((InternalEObject)newShare).eInverseAdd((InternalEObject)this, -2, (Class)null, msgs);
            }
            msgs = this.basicSetShare(newShare, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldShareESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS |= 0x2;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)newShare, (Object)newShare, !oldShareESet));
            }
        }
    }
    
    public NotificationChain basicUnsetShare(NotificationChain msgs) {
        final ShareDTO oldShare = this.share;
        this.share = null;
        final boolean oldShareESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldShare, (Object)null, oldShareESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetShare() {
        if (this.share != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.share).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            msgs = this.basicUnsetShare(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldShareESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFD;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)null, (Object)null, oldShareESet));
            }
        }
    }
    
    public boolean isSetShare() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetFileName(msgs);
            }
            case 1: {
                return this.basicUnsetShare(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getFileName();
            }
            case 1: {
                return this.getShare();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setFileName((PathDTO)newValue);
            }
            case 1: {
                this.setShare((ShareDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetFileName();
            }
            case 1: {
                this.unsetShare();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetFileName();
            }
            case 1: {
                return this.isSetShare();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
