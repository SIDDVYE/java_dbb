// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogVersionableEntryDTO;

public class ChangeLogVersionableEntryDTOImpl extends ChangeLogEntryDTOImpl implements ChangeLogVersionableEntryDTO
{
    protected EList segments;
    protected static final boolean RESOLVED_EDEFAULT = false;
    protected static final int RESOLVED_EFLAG = 8;
    protected static final int RESOLVED_ESETFLAG = 16;
    
    protected ChangeLogVersionableEntryDTOImpl() {
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangelogPackage.Literals.CHANGE_LOG_VERSIONABLE_ENTRY_DTO;
    }
    
    @Override
    public List getSegments() {
        if (this.segments == null) {
            this.segments = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 4);
        }
        return (List)this.segments;
    }
    
    @Override
    public void unsetSegments() {
        if (this.segments != null) {
            ((InternalEList.Unsettable)this.segments).unset();
        }
    }
    
    @Override
    public boolean isSetSegments() {
        return this.segments != null && ((InternalEList.Unsettable)this.segments).isSet();
    }
    
    @Override
    public boolean isResolved() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    @Override
    public void setResolved(final boolean newResolved) {
        final boolean oldResolved = (this.ALL_FLAGS & 0x8) != 0x0;
        if (newResolved) {
            this.ALL_FLAGS |= 0x8;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFF7;
        }
        final boolean oldResolvedESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldResolved, newResolved, !oldResolvedESet));
        }
    }
    
    @Override
    public void unsetResolved() {
        final boolean oldResolved = (this.ALL_FLAGS & 0x8) != 0x0;
        final boolean oldResolvedESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldResolved, false, oldResolvedESet));
        }
    }
    
    @Override
    public boolean isSetResolved() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return this.getSegments();
            }
            case 5: {
                return this.isResolved() ? Boolean.TRUE : Boolean.FALSE;
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
                this.getSegments().clear();
                this.getSegments().addAll((Collection)newValue);
            }
            case 5: {
                this.setResolved((boolean)newValue);
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
                this.unsetSegments();
            }
            case 5: {
                this.unsetResolved();
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
                return this.isSetSegments();
            }
            case 5: {
                return this.isSetResolved();
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
        result.append(" (segments: ");
        result.append(this.segments);
        result.append(", resolved: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append((this.ALL_FLAGS & 0x8) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
