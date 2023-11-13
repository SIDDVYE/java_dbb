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
import com.ibm.team.filesystem.common.internal.rest.client.locks.ComponentLockReportDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.locks.StreamLockReportDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class StreamLockReportDTOImpl extends EObjectImpl implements StreamLockReportDTO
{
    protected int ALL_FLAGS;
    protected EList componentLockReports;
    protected static final String STREAM_ITEM_ID_EDEFAULT;
    protected String streamItemId;
    protected static final int STREAM_ITEM_ID_ESETFLAG = 1;
    protected static final String STREAM_NAME_EDEFAULT;
    protected String streamName;
    protected static final int STREAM_NAME_ESETFLAG = 2;
    
    static {
        STREAM_ITEM_ID_EDEFAULT = null;
        STREAM_NAME_EDEFAULT = null;
    }
    
    protected StreamLockReportDTOImpl() {
        this.ALL_FLAGS = 0;
        this.streamItemId = StreamLockReportDTOImpl.STREAM_ITEM_ID_EDEFAULT;
        this.streamName = StreamLockReportDTOImpl.STREAM_NAME_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOlocksPackage.Literals.STREAM_LOCK_REPORT_DTO;
    }
    
    public List getComponentLockReports() {
        if (this.componentLockReports == null) {
            this.componentLockReports = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentLockReportDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.componentLockReports;
    }
    
    public void unsetComponentLockReports() {
        if (this.componentLockReports != null) {
            ((InternalEList.Unsettable)this.componentLockReports).unset();
        }
    }
    
    public boolean isSetComponentLockReports() {
        return this.componentLockReports != null && ((InternalEList.Unsettable)this.componentLockReports).isSet();
    }
    
    public String getStreamItemId() {
        return this.streamItemId;
    }
    
    public void setStreamItemId(final String newStreamItemId) {
        final String oldStreamItemId = this.streamItemId;
        this.streamItemId = newStreamItemId;
        final boolean oldStreamItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldStreamItemId, (Object)this.streamItemId, !oldStreamItemIdESet));
        }
    }
    
    public void unsetStreamItemId() {
        final String oldStreamItemId = this.streamItemId;
        final boolean oldStreamItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.streamItemId = StreamLockReportDTOImpl.STREAM_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldStreamItemId, (Object)StreamLockReportDTOImpl.STREAM_ITEM_ID_EDEFAULT, oldStreamItemIdESet));
        }
    }
    
    public boolean isSetStreamItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getStreamName() {
        return this.streamName;
    }
    
    public void setStreamName(final String newStreamName) {
        final String oldStreamName = this.streamName;
        this.streamName = newStreamName;
        final boolean oldStreamNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldStreamName, (Object)this.streamName, !oldStreamNameESet));
        }
    }
    
    public void unsetStreamName() {
        final String oldStreamName = this.streamName;
        final boolean oldStreamNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.streamName = StreamLockReportDTOImpl.STREAM_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldStreamName, (Object)StreamLockReportDTOImpl.STREAM_NAME_EDEFAULT, oldStreamNameESet));
        }
    }
    
    public boolean isSetStreamName() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getComponentLockReports()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getComponentLockReports();
            }
            case 1: {
                return this.getStreamItemId();
            }
            case 2: {
                return this.getStreamName();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getComponentLockReports().clear();
                this.getComponentLockReports().addAll((Collection)newValue);
            }
            case 1: {
                this.setStreamItemId((String)newValue);
            }
            case 2: {
                this.setStreamName((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetComponentLockReports();
            }
            case 1: {
                this.unsetStreamItemId();
            }
            case 2: {
                this.unsetStreamName();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetComponentLockReports();
            }
            case 1: {
                return this.isSetStreamItemId();
            }
            case 2: {
                return this.isSetStreamName();
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
        result.append(" (streamItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.streamItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", streamName: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.streamName);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
