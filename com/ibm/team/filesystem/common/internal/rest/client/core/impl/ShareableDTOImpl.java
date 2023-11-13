// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ShareableDTOImpl extends EObjectImpl implements ShareableDTO
{
    protected int ALL_FLAGS;
    protected PathDTO relativePath;
    protected static final int RELATIVE_PATH_ESETFLAG = 1;
    protected static final String SANDBOX_PATH_EDEFAULT;
    protected String sandboxPath;
    protected static final int SANDBOX_PATH_ESETFLAG = 2;
    
    static {
        SANDBOX_PATH_EDEFAULT = null;
    }
    
    protected ShareableDTOImpl() {
        this.ALL_FLAGS = 0;
        this.sandboxPath = ShareableDTOImpl.SANDBOX_PATH_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.SHAREABLE_DTO;
    }
    
    public String getSandboxPath() {
        return this.sandboxPath;
    }
    
    public void setSandboxPath(final String newSandboxPath) {
        final String oldSandboxPath = this.sandboxPath;
        this.sandboxPath = newSandboxPath;
        final boolean oldSandboxPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldSandboxPath, (Object)this.sandboxPath, !oldSandboxPathESet));
        }
    }
    
    public void unsetSandboxPath() {
        final String oldSandboxPath = this.sandboxPath;
        final boolean oldSandboxPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.sandboxPath = ShareableDTOImpl.SANDBOX_PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldSandboxPath, (Object)ShareableDTOImpl.SANDBOX_PATH_EDEFAULT, oldSandboxPathESet));
        }
    }
    
    public boolean isSetSandboxPath() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public PathDTO getRelativePath() {
        return this.relativePath;
    }
    
    public NotificationChain basicSetRelativePath(final PathDTO newRelativePath, NotificationChain msgs) {
        final PathDTO oldRelativePath = this.relativePath;
        this.relativePath = newRelativePath;
        final boolean oldRelativePathESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldRelativePath, (Object)newRelativePath, !oldRelativePathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setRelativePath(final PathDTO newRelativePath) {
        if (newRelativePath != this.relativePath) {
            NotificationChain msgs = null;
            if (this.relativePath != null) {
                msgs = ((InternalEObject)this.relativePath).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newRelativePath != null) {
                msgs = ((InternalEObject)newRelativePath).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetRelativePath(newRelativePath, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldRelativePathESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newRelativePath, (Object)newRelativePath, !oldRelativePathESet));
            }
        }
    }
    
    public NotificationChain basicUnsetRelativePath(NotificationChain msgs) {
        final PathDTO oldRelativePath = this.relativePath;
        this.relativePath = null;
        final boolean oldRelativePathESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldRelativePath, (Object)null, oldRelativePathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetRelativePath() {
        if (this.relativePath != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.relativePath).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetRelativePath(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldRelativePathESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldRelativePathESet));
            }
        }
    }
    
    public boolean isSetRelativePath() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetRelativePath(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getRelativePath();
            }
            case 1: {
                return this.getSandboxPath();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setRelativePath((PathDTO)newValue);
            }
            case 1: {
                this.setSandboxPath((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetRelativePath();
            }
            case 1: {
                this.unsetSandboxPath();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetRelativePath();
            }
            case 1: {
                return this.isSetSandboxPath();
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
        result.append(" (sandboxPath: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.sandboxPath);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
