// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.SandboxDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SandboxDTOImpl extends EObjectImpl implements SandboxDTO
{
    protected int ALL_FLAGS;
    protected EList allShares;
    protected static final Boolean CASE_SENSITIVE_EDEFAULT;
    protected Boolean caseSensitive;
    protected static final int CASE_SENSITIVE_ESETFLAG = 1;
    protected static final Boolean CORRUPTED_EDEFAULT;
    protected Boolean corrupted;
    protected static final int CORRUPTED_ESETFLAG = 2;
    protected static final Boolean SANDBOX_LISTENING_EDEFAULT;
    protected Boolean sandboxListening;
    protected static final int SANDBOX_LISTENING_ESETFLAG = 4;
    protected static final String SANDBOX_PATH_EDEFAULT;
    protected String sandboxPath;
    protected static final int SANDBOX_PATH_ESETFLAG = 8;
    
    static {
        CASE_SENSITIVE_EDEFAULT = null;
        CORRUPTED_EDEFAULT = null;
        SANDBOX_LISTENING_EDEFAULT = null;
        SANDBOX_PATH_EDEFAULT = null;
    }
    
    protected SandboxDTOImpl() {
        this.ALL_FLAGS = 0;
        this.caseSensitive = SandboxDTOImpl.CASE_SENSITIVE_EDEFAULT;
        this.corrupted = SandboxDTOImpl.CORRUPTED_EDEFAULT;
        this.sandboxListening = SandboxDTOImpl.SANDBOX_LISTENING_EDEFAULT;
        this.sandboxPath = SandboxDTOImpl.SANDBOX_PATH_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.SANDBOX_DTO;
    }
    
    public String getSandboxPath() {
        return this.sandboxPath;
    }
    
    public void setSandboxPath(final String newSandboxPath) {
        final String oldSandboxPath = this.sandboxPath;
        this.sandboxPath = newSandboxPath;
        final boolean oldSandboxPathESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldSandboxPath, (Object)this.sandboxPath, !oldSandboxPathESet));
        }
    }
    
    public void unsetSandboxPath() {
        final String oldSandboxPath = this.sandboxPath;
        final boolean oldSandboxPathESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.sandboxPath = SandboxDTOImpl.SANDBOX_PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldSandboxPath, (Object)SandboxDTOImpl.SANDBOX_PATH_EDEFAULT, oldSandboxPathESet));
        }
    }
    
    public boolean isSetSandboxPath() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public List getAllShares() {
        if (this.allShares == null) {
            this.allShares = (EList)new EObjectResolvingEList.Unsettable((Class)ShareDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.allShares;
    }
    
    public void unsetAllShares() {
        if (this.allShares != null) {
            ((InternalEList.Unsettable)this.allShares).unset();
        }
    }
    
    public boolean isSetAllShares() {
        return this.allShares != null && ((InternalEList.Unsettable)this.allShares).isSet();
    }
    
    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }
    
    public void setCaseSensitive(final Boolean newCaseSensitive) {
        final Boolean oldCaseSensitive = this.caseSensitive;
        this.caseSensitive = newCaseSensitive;
        final boolean oldCaseSensitiveESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldCaseSensitive, (Object)this.caseSensitive, !oldCaseSensitiveESet));
        }
    }
    
    public void unsetCaseSensitive() {
        final Boolean oldCaseSensitive = this.caseSensitive;
        final boolean oldCaseSensitiveESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.caseSensitive = SandboxDTOImpl.CASE_SENSITIVE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldCaseSensitive, (Object)SandboxDTOImpl.CASE_SENSITIVE_EDEFAULT, oldCaseSensitiveESet));
        }
    }
    
    public boolean isSetCaseSensitive() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Boolean getCorrupted() {
        return this.corrupted;
    }
    
    public void setCorrupted(final Boolean newCorrupted) {
        final Boolean oldCorrupted = this.corrupted;
        this.corrupted = newCorrupted;
        final boolean oldCorruptedESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldCorrupted, (Object)this.corrupted, !oldCorruptedESet));
        }
    }
    
    public void unsetCorrupted() {
        final Boolean oldCorrupted = this.corrupted;
        final boolean oldCorruptedESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.corrupted = SandboxDTOImpl.CORRUPTED_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldCorrupted, (Object)SandboxDTOImpl.CORRUPTED_EDEFAULT, oldCorruptedESet));
        }
    }
    
    public boolean isSetCorrupted() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Boolean getSandboxListening() {
        return this.sandboxListening;
    }
    
    public void setSandboxListening(final Boolean newSandboxListening) {
        final Boolean oldSandboxListening = this.sandboxListening;
        this.sandboxListening = newSandboxListening;
        final boolean oldSandboxListeningESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldSandboxListening, (Object)this.sandboxListening, !oldSandboxListeningESet));
        }
    }
    
    public void unsetSandboxListening() {
        final Boolean oldSandboxListening = this.sandboxListening;
        final boolean oldSandboxListeningESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.sandboxListening = SandboxDTOImpl.SANDBOX_LISTENING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldSandboxListening, (Object)SandboxDTOImpl.SANDBOX_LISTENING_EDEFAULT, oldSandboxListeningESet));
        }
    }
    
    public boolean isSetSandboxListening() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getAllShares();
            }
            case 1: {
                return this.getCaseSensitive();
            }
            case 2: {
                return this.getCorrupted();
            }
            case 3: {
                return this.getSandboxListening();
            }
            case 4: {
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
                this.getAllShares().clear();
                this.getAllShares().addAll((Collection)newValue);
            }
            case 1: {
                this.setCaseSensitive((Boolean)newValue);
            }
            case 2: {
                this.setCorrupted((Boolean)newValue);
            }
            case 3: {
                this.setSandboxListening((Boolean)newValue);
            }
            case 4: {
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
                this.unsetAllShares();
            }
            case 1: {
                this.unsetCaseSensitive();
            }
            case 2: {
                this.unsetCorrupted();
            }
            case 3: {
                this.unsetSandboxListening();
            }
            case 4: {
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
                return this.isSetAllShares();
            }
            case 1: {
                return this.isSetCaseSensitive();
            }
            case 2: {
                return this.isSetCorrupted();
            }
            case 3: {
                return this.isSetSandboxListening();
            }
            case 4: {
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
        result.append(" (caseSensitive: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.caseSensitive);
        }
        else {
            result.append("<unset>");
        }
        result.append(", corrupted: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.corrupted);
        }
        else {
            result.append("<unset>");
        }
        result.append(", sandboxListening: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.sandboxListening);
        }
        else {
            result.append("<unset>");
        }
        result.append(", sandboxPath: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.sandboxPath);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
