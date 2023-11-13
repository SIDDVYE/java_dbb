// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeSetSourceDTO;
import com.ibm.team.repository.common.model.impl.HelperImpl;

public class ChangeSetSourceDTOImpl extends HelperImpl implements ChangeSetSourceDTO
{
    protected int ALL_FLAGS;
    protected static final String SOURCE_ID_EDEFAULT = "";
    protected String sourceId;
    protected static final int SOURCE_ID_ESETFLAG = 2;
    protected static final String SOURCE_TYPE_EDEFAULT = "";
    protected String sourceType;
    protected static final int SOURCE_TYPE_ESETFLAG = 4;
    private static final int EOFFSET_CORRECTION;
    
    static {
        EOFFSET_CORRECTION = FilesystemRestClientDTOpatchPackage.Literals.CHANGE_SET_SOURCE_DTO.getFeatureID((EStructuralFeature)FilesystemRestClientDTOpatchPackage.Literals.CHANGE_SET_SOURCE_DTO__SOURCE_ID) - 1;
    }
    
    protected ChangeSetSourceDTOImpl() {
        this.ALL_FLAGS = 0;
        this.sourceId = "";
        this.sourceType = "";
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.CHANGE_SET_SOURCE_DTO;
    }
    
    public String getSourceId() {
        return this.sourceId;
    }
    
    public void setSourceId(final String newSourceId) {
        final String oldSourceId = this.sourceId;
        this.sourceId = newSourceId;
        final boolean oldSourceIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1 + ChangeSetSourceDTOImpl.EOFFSET_CORRECTION, (Object)oldSourceId, (Object)this.sourceId, !oldSourceIdESet));
        }
    }
    
    public void unsetSourceId() {
        final String oldSourceId = this.sourceId;
        final boolean oldSourceIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.sourceId = "";
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1 + ChangeSetSourceDTOImpl.EOFFSET_CORRECTION, (Object)oldSourceId, (Object)"", oldSourceIdESet));
        }
    }
    
    public boolean isSetSourceId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getSourceType() {
        return this.sourceType;
    }
    
    public void setSourceType(final String newSourceType) {
        final String oldSourceType = this.sourceType;
        this.sourceType = newSourceType;
        final boolean oldSourceTypeESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2 + ChangeSetSourceDTOImpl.EOFFSET_CORRECTION, (Object)oldSourceType, (Object)this.sourceType, !oldSourceTypeESet));
        }
    }
    
    public void unsetSourceType() {
        final String oldSourceType = this.sourceType;
        final boolean oldSourceTypeESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.sourceType = "";
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2 + ChangeSetSourceDTOImpl.EOFFSET_CORRECTION, (Object)oldSourceType, (Object)"", oldSourceTypeESet));
        }
    }
    
    public boolean isSetSourceType() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - ChangeSetSourceDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.getSourceId();
            }
            case 2: {
                return this.getSourceType();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - ChangeSetSourceDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.setSourceId((String)newValue);
            }
            case 2: {
                this.setSourceType((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - ChangeSetSourceDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.unsetSourceId();
            }
            case 2: {
                this.unsetSourceType();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - ChangeSetSourceDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.isSetSourceId();
            }
            case 2: {
                return this.isSetSourceType();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass != ChangeSetSourceDTO.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - ChangeSetSourceDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return 1 + ChangeSetSourceDTOImpl.EOFFSET_CORRECTION;
            }
            case 2: {
                return 2 + ChangeSetSourceDTOImpl.EOFFSET_CORRECTION;
            }
            default: {
                return -1;
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (sourceId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.sourceId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", sourceType: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.sourceType);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
