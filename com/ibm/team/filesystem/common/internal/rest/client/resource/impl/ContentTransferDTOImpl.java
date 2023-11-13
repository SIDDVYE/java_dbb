// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ContentTransferDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ContentTransferDTOImpl extends EObjectImpl implements ContentTransferDTO
{
    protected int ALL_FLAGS;
    protected static final int MAX_THREADS_EDEFAULT = 0;
    protected int maxThreads;
    protected static final int MAX_THREADS_ESETFLAG = 1;
    protected static final int MAX_THREADS_DEFAULT_EDEFAULT = 0;
    protected int maxThreadsDefault;
    protected static final int MAX_THREADS_DEFAULT_ESETFLAG = 2;
    protected static final int MAX_THREADS_LIMIT_EDEFAULT = 0;
    protected int maxThreadsLimit;
    protected static final int MAX_THREADS_LIMIT_ESETFLAG = 4;
    
    protected ContentTransferDTOImpl() {
        this.ALL_FLAGS = 0;
        this.maxThreads = 0;
        this.maxThreadsDefault = 0;
        this.maxThreadsLimit = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.CONTENT_TRANSFER_DTO;
    }
    
    public int getMaxThreads() {
        return this.maxThreads;
    }
    
    public void setMaxThreads(final int newMaxThreads) {
        final int oldMaxThreads = this.maxThreads;
        this.maxThreads = newMaxThreads;
        final boolean oldMaxThreadsESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldMaxThreads, this.maxThreads, !oldMaxThreadsESet));
        }
    }
    
    public void unsetMaxThreads() {
        final int oldMaxThreads = this.maxThreads;
        final boolean oldMaxThreadsESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.maxThreads = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldMaxThreads, 0, oldMaxThreadsESet));
        }
    }
    
    public boolean isSetMaxThreads() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public int getMaxThreadsDefault() {
        return this.maxThreadsDefault;
    }
    
    public void setMaxThreadsDefault(final int newMaxThreadsDefault) {
        final int oldMaxThreadsDefault = this.maxThreadsDefault;
        this.maxThreadsDefault = newMaxThreadsDefault;
        final boolean oldMaxThreadsDefaultESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldMaxThreadsDefault, this.maxThreadsDefault, !oldMaxThreadsDefaultESet));
        }
    }
    
    public void unsetMaxThreadsDefault() {
        final int oldMaxThreadsDefault = this.maxThreadsDefault;
        final boolean oldMaxThreadsDefaultESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.maxThreadsDefault = 0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldMaxThreadsDefault, 0, oldMaxThreadsDefaultESet));
        }
    }
    
    public boolean isSetMaxThreadsDefault() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public int getMaxThreadsLimit() {
        return this.maxThreadsLimit;
    }
    
    public void setMaxThreadsLimit(final int newMaxThreadsLimit) {
        final int oldMaxThreadsLimit = this.maxThreadsLimit;
        this.maxThreadsLimit = newMaxThreadsLimit;
        final boolean oldMaxThreadsLimitESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldMaxThreadsLimit, this.maxThreadsLimit, !oldMaxThreadsLimitESet));
        }
    }
    
    public void unsetMaxThreadsLimit() {
        final int oldMaxThreadsLimit = this.maxThreadsLimit;
        final boolean oldMaxThreadsLimitESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.maxThreadsLimit = 0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldMaxThreadsLimit, 0, oldMaxThreadsLimitESet));
        }
    }
    
    public boolean isSetMaxThreadsLimit() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return new Integer(this.getMaxThreads());
            }
            case 1: {
                return new Integer(this.getMaxThreadsDefault());
            }
            case 2: {
                return new Integer(this.getMaxThreadsLimit());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setMaxThreads((int)newValue);
            }
            case 1: {
                this.setMaxThreadsDefault((int)newValue);
            }
            case 2: {
                this.setMaxThreadsLimit((int)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetMaxThreads();
            }
            case 1: {
                this.unsetMaxThreadsDefault();
            }
            case 2: {
                this.unsetMaxThreadsLimit();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetMaxThreads();
            }
            case 1: {
                return this.isSetMaxThreadsDefault();
            }
            case 2: {
                return this.isSetMaxThreadsLimit();
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
        result.append(" (maxThreads: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.maxThreads);
        }
        else {
            result.append("<unset>");
        }
        result.append(", maxThreadsDefault: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.maxThreadsDefault);
        }
        else {
            result.append("<unset>");
        }
        result.append(", maxThreadsLimit: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.maxThreadsLimit);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
