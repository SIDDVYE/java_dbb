// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.locks.VersionableLockDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ComponentLockReportDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ComponentLockReportDTOImpl extends EObjectImpl implements ComponentLockReportDTO
{
    protected int ALL_FLAGS;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 1;
    protected EList versionableLocks;
    
    static {
        COMPONENT_ITEM_ID_EDEFAULT = null;
    }
    
    protected ComponentLockReportDTOImpl() {
        this.ALL_FLAGS = 0;
        this.componentItemId = ComponentLockReportDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOlocksPackage.Literals.COMPONENT_LOCK_REPORT_DTO;
    }
    
    public List getVersionableLocks() {
        if (this.versionableLocks == null) {
            this.versionableLocks = (EList)new EObjectContainmentEList.Unsettable((Class)VersionableLockDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.versionableLocks;
    }
    
    public void unsetVersionableLocks() {
        if (this.versionableLocks != null) {
            ((InternalEList.Unsettable)this.versionableLocks).unset();
        }
    }
    
    public boolean isSetVersionableLocks() {
        return this.versionableLocks != null && ((InternalEList.Unsettable)this.versionableLocks).isSet();
    }
    
    public String getComponentItemId() {
        return this.componentItemId;
    }
    
    public void setComponentItemId(final String newComponentItemId) {
        final String oldComponentItemId = this.componentItemId;
        this.componentItemId = newComponentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.componentItemId = ComponentLockReportDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldComponentItemId, (Object)ComponentLockReportDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return ((InternalEList)this.getVersionableLocks()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getComponentItemId();
            }
            case 1: {
                return this.getVersionableLocks();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setComponentItemId((String)newValue);
            }
            case 1: {
                this.getVersionableLocks().clear();
                this.getVersionableLocks().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetComponentItemId();
            }
            case 1: {
                this.unsetVersionableLocks();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetComponentItemId();
            }
            case 1: {
                return this.isSetVersionableLocks();
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
        result.append(" (componentItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.componentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
