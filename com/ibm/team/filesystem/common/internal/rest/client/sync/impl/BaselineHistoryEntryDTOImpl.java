// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineDTO;
import com.ibm.team.filesystem.common.internal.rest.client.sync.BaselineHistoryEntryDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class BaselineHistoryEntryDTOImpl extends EObjectImpl implements BaselineHistoryEntryDTO
{
    protected int ALL_FLAGS;
    protected BaselineDTO baseline;
    protected static final int BASELINE_ESETFLAG = 1;
    protected static final String DELIVERED_BY_ITEM_ID_EDEFAULT;
    protected String deliveredByItemId;
    protected static final int DELIVERED_BY_ITEM_ID_ESETFLAG = 2;
    protected static final long DELIVERY_DATE_EDEFAULT = 0L;
    protected long deliveryDate;
    protected static final int DELIVERY_DATE_ESETFLAG = 4;
    
    static {
        DELIVERED_BY_ITEM_ID_EDEFAULT = null;
    }
    
    protected BaselineHistoryEntryDTOImpl() {
        this.ALL_FLAGS = 0;
        this.deliveredByItemId = BaselineHistoryEntryDTOImpl.DELIVERED_BY_ITEM_ID_EDEFAULT;
        this.deliveryDate = 0L;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.BASELINE_HISTORY_ENTRY_DTO;
    }
    
    public String getDeliveredByItemId() {
        return this.deliveredByItemId;
    }
    
    public void setDeliveredByItemId(final String newDeliveredByItemId) {
        final String oldDeliveredByItemId = this.deliveredByItemId;
        this.deliveredByItemId = newDeliveredByItemId;
        final boolean oldDeliveredByItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldDeliveredByItemId, (Object)this.deliveredByItemId, !oldDeliveredByItemIdESet));
        }
    }
    
    public void unsetDeliveredByItemId() {
        final String oldDeliveredByItemId = this.deliveredByItemId;
        final boolean oldDeliveredByItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.deliveredByItemId = BaselineHistoryEntryDTOImpl.DELIVERED_BY_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldDeliveredByItemId, (Object)BaselineHistoryEntryDTOImpl.DELIVERED_BY_ITEM_ID_EDEFAULT, oldDeliveredByItemIdESet));
        }
    }
    
    public boolean isSetDeliveredByItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public long getDeliveryDate() {
        return this.deliveryDate;
    }
    
    public void setDeliveryDate(final long newDeliveryDate) {
        final long oldDeliveryDate = this.deliveryDate;
        this.deliveryDate = newDeliveryDate;
        final boolean oldDeliveryDateESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldDeliveryDate, this.deliveryDate, !oldDeliveryDateESet));
        }
    }
    
    public void unsetDeliveryDate() {
        final long oldDeliveryDate = this.deliveryDate;
        final boolean oldDeliveryDateESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.deliveryDate = 0L;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldDeliveryDate, 0L, oldDeliveryDateESet));
        }
    }
    
    public boolean isSetDeliveryDate() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public BaselineDTO getBaseline() {
        return this.baseline;
    }
    
    public NotificationChain basicSetBaseline(final BaselineDTO newBaseline, NotificationChain msgs) {
        final BaselineDTO oldBaseline = this.baseline;
        this.baseline = newBaseline;
        final boolean oldBaselineESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldBaseline, (Object)newBaseline, !oldBaselineESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setBaseline(final BaselineDTO newBaseline) {
        if (newBaseline != this.baseline) {
            NotificationChain msgs = null;
            if (this.baseline != null) {
                msgs = ((InternalEObject)this.baseline).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newBaseline != null) {
                msgs = ((InternalEObject)newBaseline).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetBaseline(newBaseline, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldBaselineESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newBaseline, (Object)newBaseline, !oldBaselineESet));
            }
        }
    }
    
    public NotificationChain basicUnsetBaseline(NotificationChain msgs) {
        final BaselineDTO oldBaseline = this.baseline;
        this.baseline = null;
        final boolean oldBaselineESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldBaseline, (Object)null, oldBaselineESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetBaseline() {
        if (this.baseline != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.baseline).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetBaseline(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldBaselineESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldBaselineESet));
            }
        }
    }
    
    public boolean isSetBaseline() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetBaseline(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getBaseline();
            }
            case 1: {
                return this.getDeliveredByItemId();
            }
            case 2: {
                return new Long(this.getDeliveryDate());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setBaseline((BaselineDTO)newValue);
            }
            case 1: {
                this.setDeliveredByItemId((String)newValue);
            }
            case 2: {
                this.setDeliveryDate((long)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBaseline();
            }
            case 1: {
                this.unsetDeliveredByItemId();
            }
            case 2: {
                this.unsetDeliveryDate();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBaseline();
            }
            case 1: {
                return this.isSetDeliveredByItemId();
            }
            case 2: {
                return this.isSetDeliveryDate();
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
        result.append(" (deliveredByItemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.deliveredByItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", deliveryDate: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.deliveryDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
