// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.OutOfSyncComponentDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class OutOfSyncComponentDTOImpl extends EObjectImpl implements OutOfSyncComponentDTO
{
    protected int ALL_FLAGS;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 1;
    protected static final int OUT_OF_SYNC_SHARES_COUNT_EDEFAULT = 0;
    protected int outOfSyncSharesCount;
    protected static final int OUT_OF_SYNC_SHARES_COUNT_ESETFLAG = 2;
    protected EList outOfSyncShares;
    
    static {
        COMPONENT_ITEM_ID_EDEFAULT = null;
    }
    
    protected OutOfSyncComponentDTOImpl() {
        this.ALL_FLAGS = 0;
        this.componentItemId = OutOfSyncComponentDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.outOfSyncSharesCount = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.OUT_OF_SYNC_COMPONENT_DTO;
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
        this.componentItemId = OutOfSyncComponentDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldComponentItemId, (Object)OutOfSyncComponentDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public int getOutOfSyncSharesCount() {
        return this.outOfSyncSharesCount;
    }
    
    public void setOutOfSyncSharesCount(final int newOutOfSyncSharesCount) {
        final int oldOutOfSyncSharesCount = this.outOfSyncSharesCount;
        this.outOfSyncSharesCount = newOutOfSyncSharesCount;
        final boolean oldOutOfSyncSharesCountESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldOutOfSyncSharesCount, this.outOfSyncSharesCount, !oldOutOfSyncSharesCountESet));
        }
    }
    
    public void unsetOutOfSyncSharesCount() {
        final int oldOutOfSyncSharesCount = this.outOfSyncSharesCount;
        final boolean oldOutOfSyncSharesCountESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.outOfSyncSharesCount = 0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldOutOfSyncSharesCount, 0, oldOutOfSyncSharesCountESet));
        }
    }
    
    public boolean isSetOutOfSyncSharesCount() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getOutOfSyncShares() {
        if (this.outOfSyncShares == null) {
            this.outOfSyncShares = (EList)new EObjectContainmentEList.Unsettable((Class)ShareDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.outOfSyncShares;
    }
    
    public void unsetOutOfSyncShares() {
        if (this.outOfSyncShares != null) {
            ((InternalEList.Unsettable)this.outOfSyncShares).unset();
        }
    }
    
    public boolean isSetOutOfSyncShares() {
        return this.outOfSyncShares != null && ((InternalEList.Unsettable)this.outOfSyncShares).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 2: {
                return ((InternalEList)this.getOutOfSyncShares()).basicRemove((Object)otherEnd, msgs);
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
                return new Integer(this.getOutOfSyncSharesCount());
            }
            case 2: {
                return this.getOutOfSyncShares();
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
                this.setOutOfSyncSharesCount((int)newValue);
            }
            case 2: {
                this.getOutOfSyncShares().clear();
                this.getOutOfSyncShares().addAll((Collection)newValue);
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
                this.unsetOutOfSyncSharesCount();
            }
            case 2: {
                this.unsetOutOfSyncShares();
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
                return this.isSetOutOfSyncSharesCount();
            }
            case 2: {
                return this.isSetOutOfSyncShares();
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
        result.append(", outOfSyncSharesCount: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.outOfSyncSharesCount);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
