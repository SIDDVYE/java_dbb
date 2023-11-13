// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.repository.common.IAuditableHandle;
import com.ibm.team.filesystem.common.internal.rest.client.core.ReadScopeDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ReadScopeDTOImpl extends EObjectImpl implements ReadScopeDTO
{
    protected int ALL_FLAGS;
    protected IAuditableHandle defersTo;
    protected static final int DEFERS_TO_ESETFLAG = 1;
    protected static final String READ_SCOPE_EDEFAULT;
    protected String readScope;
    protected static final int READ_SCOPE_ESETFLAG = 2;
    
    static {
        READ_SCOPE_EDEFAULT = null;
    }
    
    protected ReadScopeDTOImpl() {
        this.ALL_FLAGS = 0;
        this.readScope = ReadScopeDTOImpl.READ_SCOPE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.READ_SCOPE_DTO;
    }
    
    public String getReadScope() {
        return this.readScope;
    }
    
    public void setReadScope(final String newReadScope) {
        final String oldReadScope = this.readScope;
        this.readScope = newReadScope;
        final boolean oldReadScopeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldReadScope, (Object)this.readScope, !oldReadScopeESet));
        }
    }
    
    public void unsetReadScope() {
        final String oldReadScope = this.readScope;
        final boolean oldReadScopeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.readScope = ReadScopeDTOImpl.READ_SCOPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldReadScope, (Object)ReadScopeDTOImpl.READ_SCOPE_EDEFAULT, oldReadScopeESet));
        }
    }
    
    public boolean isSetReadScope() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public IAuditableHandle getDefersTo() {
        if (this.defersTo != null && ((EObject)this.defersTo).eIsProxy()) {
            final InternalEObject oldDefersTo = (InternalEObject)this.defersTo;
            this.defersTo = (IAuditableHandle)this.eResolveProxy(oldDefersTo);
            if (this.defersTo != oldDefersTo && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 0, (Object)oldDefersTo, (Object)this.defersTo));
            }
        }
        return this.defersTo;
    }
    
    public IAuditableHandle basicGetDefersTo() {
        return this.defersTo;
    }
    
    public void setDefersTo(final IAuditableHandle newDefersTo) {
        final IAuditableHandle oldDefersTo = this.defersTo;
        this.defersTo = newDefersTo;
        final boolean oldDefersToESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldDefersTo, (Object)this.defersTo, !oldDefersToESet));
        }
    }
    
    public void unsetDefersTo() {
        final IAuditableHandle oldDefersTo = this.defersTo;
        final boolean oldDefersToESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.defersTo = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldDefersTo, (Object)null, oldDefersToESet));
        }
    }
    
    public boolean isSetDefersTo() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                if (resolve) {
                    return this.getDefersTo();
                }
                return this.basicGetDefersTo();
            }
            case 1: {
                return this.getReadScope();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setDefersTo((IAuditableHandle)newValue);
            }
            case 1: {
                this.setReadScope((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetDefersTo();
            }
            case 1: {
                this.unsetReadScope();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetDefersTo();
            }
            case 1: {
                return this.isSetReadScope();
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
        result.append(" (readScope: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.readScope);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
