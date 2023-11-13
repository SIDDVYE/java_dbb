// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.repository.common.IAuditableHandle;
import com.ibm.team.filesystem.common.internal.rest.client.resource.PermissionsContextDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class PermissionsContextDTOImpl extends EObjectImpl implements PermissionsContextDTO
{
    protected int ALL_FLAGS;
    protected static final boolean ACCESSIBLE_EDEFAULT = false;
    protected static final int ACCESSIBLE_EFLAG = 1;
    protected static final int ACCESSIBLE_ESETFLAG = 2;
    protected IAuditableHandle readContext;
    protected static final int READ_CONTEXT_ESETFLAG = 4;
    
    protected PermissionsContextDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.PERMISSIONS_CONTEXT_DTO;
    }
    
    public boolean isAccessible() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setAccessible(final boolean newAccessible) {
        final boolean oldAccessible = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newAccessible) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldAccessibleESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldAccessible, newAccessible, !oldAccessibleESet));
        }
    }
    
    public void unsetAccessible() {
        final boolean oldAccessible = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldAccessibleESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldAccessible, false, oldAccessibleESet));
        }
    }
    
    public boolean isSetAccessible() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public IAuditableHandle getReadContext() {
        if (this.readContext != null && ((EObject)this.readContext).eIsProxy()) {
            final InternalEObject oldReadContext = (InternalEObject)this.readContext;
            this.readContext = (IAuditableHandle)this.eResolveProxy(oldReadContext);
            if (this.readContext != oldReadContext && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 1, (Object)oldReadContext, (Object)this.readContext));
            }
        }
        return this.readContext;
    }
    
    public IAuditableHandle basicGetReadContext() {
        return this.readContext;
    }
    
    public void setReadContext(final IAuditableHandle newReadContext) {
        final IAuditableHandle oldReadContext = this.readContext;
        this.readContext = newReadContext;
        final boolean oldReadContextESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldReadContext, (Object)this.readContext, !oldReadContextESet));
        }
    }
    
    public void unsetReadContext() {
        final IAuditableHandle oldReadContext = this.readContext;
        final boolean oldReadContextESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.readContext = null;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldReadContext, (Object)null, oldReadContextESet));
        }
    }
    
    public boolean isSetReadContext() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isAccessible() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                if (resolve) {
                    return this.getReadContext();
                }
                return this.basicGetReadContext();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setAccessible((boolean)newValue);
            }
            case 1: {
                this.setReadContext((IAuditableHandle)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetAccessible();
            }
            case 1: {
                this.unsetReadContext();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetAccessible();
            }
            case 1: {
                return this.isSetReadContext();
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
        result.append(" (accessible: ");
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
