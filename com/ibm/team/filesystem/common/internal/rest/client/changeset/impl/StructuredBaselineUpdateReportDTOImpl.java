// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StructuredBaselineUpdateReportDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class StructuredBaselineUpdateReportDTOImpl extends EObjectImpl implements StructuredBaselineUpdateReportDTO
{
    protected int ALL_FLAGS;
    protected static final long BASELINE_ID_EDEFAULT = 0L;
    protected long baselineId;
    protected static final int BASELINE_ID_ESETFLAG = 1;
    protected static final String BASELINE_ITEM_ID_EDEFAULT;
    protected String baselineItemId;
    protected static final int BASELINE_ITEM_ID_ESETFLAG = 2;
    protected static final String BASELINE_NAME_EDEFAULT;
    protected String baselineName;
    protected static final int BASELINE_NAME_ESETFLAG = 4;
    
    static {
        BASELINE_ITEM_ID_EDEFAULT = null;
        BASELINE_NAME_EDEFAULT = null;
    }
    
    protected StructuredBaselineUpdateReportDTOImpl() {
        this.ALL_FLAGS = 0;
        this.baselineId = 0L;
        this.baselineItemId = StructuredBaselineUpdateReportDTOImpl.BASELINE_ITEM_ID_EDEFAULT;
        this.baselineName = StructuredBaselineUpdateReportDTOImpl.BASELINE_NAME_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.STRUCTURED_BASELINE_UPDATE_REPORT_DTO;
    }
    
    public String getBaselineName() {
        return this.baselineName;
    }
    
    public void setBaselineName(final String newBaselineName) {
        final String oldBaselineName = this.baselineName;
        this.baselineName = newBaselineName;
        final boolean oldBaselineNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldBaselineName, (Object)this.baselineName, !oldBaselineNameESet));
        }
    }
    
    public void unsetBaselineName() {
        final String oldBaselineName = this.baselineName;
        final boolean oldBaselineNameESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.baselineName = StructuredBaselineUpdateReportDTOImpl.BASELINE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldBaselineName, (Object)StructuredBaselineUpdateReportDTOImpl.BASELINE_NAME_EDEFAULT, oldBaselineNameESet));
        }
    }
    
    public boolean isSetBaselineName() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getBaselineItemId() {
        return this.baselineItemId;
    }
    
    public void setBaselineItemId(final String newBaselineItemId) {
        final String oldBaselineItemId = this.baselineItemId;
        this.baselineItemId = newBaselineItemId;
        final boolean oldBaselineItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldBaselineItemId, (Object)this.baselineItemId, !oldBaselineItemIdESet));
        }
    }
    
    public void unsetBaselineItemId() {
        final String oldBaselineItemId = this.baselineItemId;
        final boolean oldBaselineItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.baselineItemId = StructuredBaselineUpdateReportDTOImpl.BASELINE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldBaselineItemId, (Object)StructuredBaselineUpdateReportDTOImpl.BASELINE_ITEM_ID_EDEFAULT, oldBaselineItemIdESet));
        }
    }
    
    public boolean isSetBaselineItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public long getBaselineId() {
        return this.baselineId;
    }
    
    public void setBaselineId(final long newBaselineId) {
        final long oldBaselineId = this.baselineId;
        this.baselineId = newBaselineId;
        final boolean oldBaselineIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldBaselineId, this.baselineId, !oldBaselineIdESet));
        }
    }
    
    public void unsetBaselineId() {
        final long oldBaselineId = this.baselineId;
        final boolean oldBaselineIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.baselineId = 0L;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldBaselineId, 0L, oldBaselineIdESet));
        }
    }
    
    public boolean isSetBaselineId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return new Long(this.getBaselineId());
            }
            case 1: {
                return this.getBaselineItemId();
            }
            case 2: {
                return this.getBaselineName();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setBaselineId((long)newValue);
            }
            case 1: {
                this.setBaselineItemId((String)newValue);
            }
            case 2: {
                this.setBaselineName((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBaselineId();
            }
            case 1: {
                this.unsetBaselineItemId();
            }
            case 2: {
                this.unsetBaselineName();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBaselineId();
            }
            case 1: {
                return this.isSetBaselineItemId();
            }
            case 2: {
                return this.isSetBaselineName();
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
        result.append(" (baselineId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.baselineId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", baselineItemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.baselineItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", baselineName: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.baselineName);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
