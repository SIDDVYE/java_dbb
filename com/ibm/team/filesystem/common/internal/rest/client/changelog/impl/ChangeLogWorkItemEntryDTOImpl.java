// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogWorkItemEntryDTO;

public class ChangeLogWorkItemEntryDTOImpl extends ChangeLogEntryDTOImpl implements ChangeLogWorkItemEntryDTO
{
    protected static final long WORK_ITEM_NUMBER_EDEFAULT = 0L;
    protected long workItemNumber;
    protected static final int WORK_ITEM_NUMBER_ESETFLAG = 8;
    protected ContributorDTO resolver;
    protected static final int RESOLVER_ESETFLAG = 16;
    
    protected ChangeLogWorkItemEntryDTOImpl() {
        this.workItemNumber = 0L;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangelogPackage.Literals.CHANGE_LOG_WORK_ITEM_ENTRY_DTO;
    }
    
    @Override
    public long getWorkItemNumber() {
        return this.workItemNumber;
    }
    
    @Override
    public void setWorkItemNumber(final long newWorkItemNumber) {
        final long oldWorkItemNumber = this.workItemNumber;
        this.workItemNumber = newWorkItemNumber;
        final boolean oldWorkItemNumberESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldWorkItemNumber, this.workItemNumber, !oldWorkItemNumberESet));
        }
    }
    
    @Override
    public void unsetWorkItemNumber() {
        final long oldWorkItemNumber = this.workItemNumber;
        final boolean oldWorkItemNumberESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.workItemNumber = 0L;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldWorkItemNumber, 0L, oldWorkItemNumberESet));
        }
    }
    
    @Override
    public boolean isSetWorkItemNumber() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    @Override
    public ContributorDTO getResolver() {
        if (this.resolver != null && ((EObject)this.resolver).eIsProxy()) {
            final InternalEObject oldResolver = (InternalEObject)this.resolver;
            this.resolver = (ContributorDTO)this.eResolveProxy(oldResolver);
            if (this.resolver != oldResolver && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 5, (Object)oldResolver, (Object)this.resolver));
            }
        }
        return this.resolver;
    }
    
    public ContributorDTO basicGetResolver() {
        return this.resolver;
    }
    
    @Override
    public void setResolver(final ContributorDTO newResolver) {
        final ContributorDTO oldResolver = this.resolver;
        this.resolver = newResolver;
        final boolean oldResolverESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldResolver, (Object)this.resolver, !oldResolverESet));
        }
    }
    
    @Override
    public void unsetResolver() {
        final ContributorDTO oldResolver = this.resolver;
        final boolean oldResolverESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.resolver = null;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldResolver, (Object)null, oldResolverESet));
        }
    }
    
    @Override
    public boolean isSetResolver() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return new Long(this.getWorkItemNumber());
            }
            case 5: {
                if (resolve) {
                    return this.getResolver();
                }
                return this.basicGetResolver();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 4: {
                this.setWorkItemNumber((long)newValue);
            }
            case 5: {
                this.setResolver((ContributorDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 4: {
                this.unsetWorkItemNumber();
            }
            case 5: {
                this.unsetResolver();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 4: {
                return this.isSetWorkItemNumber();
            }
            case 5: {
                return this.isSetResolver();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (workItemNumber: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.workItemNumber);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
