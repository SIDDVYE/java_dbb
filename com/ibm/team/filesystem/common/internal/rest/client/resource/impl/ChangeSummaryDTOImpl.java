// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ChangeSummaryDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ChangeSummaryDTOImpl extends EObjectImpl implements ChangeSummaryDTO
{
    protected int ALL_FLAGS;
    protected static final String BEFORE_STATE_ID_EDEFAULT;
    protected String beforeStateId;
    protected static final int BEFORE_STATE_ID_ESETFLAG = 1;
    protected static final String AFTER_STATE_ID_EDEFAULT;
    protected String afterStateId;
    protected static final int AFTER_STATE_ID_ESETFLAG = 2;
    protected static final String LAST_MERGE_STATE_EDEFAULT;
    protected String lastMergeState;
    protected static final int LAST_MERGE_STATE_ESETFLAG = 4;
    protected static final String PATH_HINT_EDEFAULT;
    protected String pathHint;
    protected static final int PATH_HINT_ESETFLAG = 8;
    protected static final String NEW_PATH_HINT_EDEFAULT;
    protected String newPathHint;
    protected static final int NEW_PATH_HINT_ESETFLAG = 16;
    
    static {
        BEFORE_STATE_ID_EDEFAULT = null;
        AFTER_STATE_ID_EDEFAULT = null;
        LAST_MERGE_STATE_EDEFAULT = null;
        PATH_HINT_EDEFAULT = null;
        NEW_PATH_HINT_EDEFAULT = null;
    }
    
    protected ChangeSummaryDTOImpl() {
        this.ALL_FLAGS = 0;
        this.beforeStateId = ChangeSummaryDTOImpl.BEFORE_STATE_ID_EDEFAULT;
        this.afterStateId = ChangeSummaryDTOImpl.AFTER_STATE_ID_EDEFAULT;
        this.lastMergeState = ChangeSummaryDTOImpl.LAST_MERGE_STATE_EDEFAULT;
        this.pathHint = ChangeSummaryDTOImpl.PATH_HINT_EDEFAULT;
        this.newPathHint = ChangeSummaryDTOImpl.NEW_PATH_HINT_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.CHANGE_SUMMARY_DTO;
    }
    
    public String getBeforeStateId() {
        return this.beforeStateId;
    }
    
    public void setBeforeStateId(final String newBeforeStateId) {
        final String oldBeforeStateId = this.beforeStateId;
        this.beforeStateId = newBeforeStateId;
        final boolean oldBeforeStateIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldBeforeStateId, (Object)this.beforeStateId, !oldBeforeStateIdESet));
        }
    }
    
    public void unsetBeforeStateId() {
        final String oldBeforeStateId = this.beforeStateId;
        final boolean oldBeforeStateIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.beforeStateId = ChangeSummaryDTOImpl.BEFORE_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldBeforeStateId, (Object)ChangeSummaryDTOImpl.BEFORE_STATE_ID_EDEFAULT, oldBeforeStateIdESet));
        }
    }
    
    public boolean isSetBeforeStateId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getAfterStateId() {
        return this.afterStateId;
    }
    
    public void setAfterStateId(final String newAfterStateId) {
        final String oldAfterStateId = this.afterStateId;
        this.afterStateId = newAfterStateId;
        final boolean oldAfterStateIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldAfterStateId, (Object)this.afterStateId, !oldAfterStateIdESet));
        }
    }
    
    public void unsetAfterStateId() {
        final String oldAfterStateId = this.afterStateId;
        final boolean oldAfterStateIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.afterStateId = ChangeSummaryDTOImpl.AFTER_STATE_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldAfterStateId, (Object)ChangeSummaryDTOImpl.AFTER_STATE_ID_EDEFAULT, oldAfterStateIdESet));
        }
    }
    
    public boolean isSetAfterStateId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getLastMergeState() {
        return this.lastMergeState;
    }
    
    public void setLastMergeState(final String newLastMergeState) {
        final String oldLastMergeState = this.lastMergeState;
        this.lastMergeState = newLastMergeState;
        final boolean oldLastMergeStateESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldLastMergeState, (Object)this.lastMergeState, !oldLastMergeStateESet));
        }
    }
    
    public void unsetLastMergeState() {
        final String oldLastMergeState = this.lastMergeState;
        final boolean oldLastMergeStateESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.lastMergeState = ChangeSummaryDTOImpl.LAST_MERGE_STATE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldLastMergeState, (Object)ChangeSummaryDTOImpl.LAST_MERGE_STATE_EDEFAULT, oldLastMergeStateESet));
        }
    }
    
    public boolean isSetLastMergeState() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getPathHint() {
        return this.pathHint;
    }
    
    public void setPathHint(final String newPathHint) {
        final String oldPathHint = this.pathHint;
        this.pathHint = newPathHint;
        final boolean oldPathHintESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldPathHint, (Object)this.pathHint, !oldPathHintESet));
        }
    }
    
    public void unsetPathHint() {
        final String oldPathHint = this.pathHint;
        final boolean oldPathHintESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.pathHint = ChangeSummaryDTOImpl.PATH_HINT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldPathHint, (Object)ChangeSummaryDTOImpl.PATH_HINT_EDEFAULT, oldPathHintESet));
        }
    }
    
    public boolean isSetPathHint() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getNewPathHint() {
        return this.newPathHint;
    }
    
    public void setNewPathHint(final String newNewPathHint) {
        final String oldNewPathHint = this.newPathHint;
        this.newPathHint = newNewPathHint;
        final boolean oldNewPathHintESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldNewPathHint, (Object)this.newPathHint, !oldNewPathHintESet));
        }
    }
    
    public void unsetNewPathHint() {
        final String oldNewPathHint = this.newPathHint;
        final boolean oldNewPathHintESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.newPathHint = ChangeSummaryDTOImpl.NEW_PATH_HINT_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldNewPathHint, (Object)ChangeSummaryDTOImpl.NEW_PATH_HINT_EDEFAULT, oldNewPathHintESet));
        }
    }
    
    public boolean isSetNewPathHint() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getBeforeStateId();
            }
            case 1: {
                return this.getAfterStateId();
            }
            case 2: {
                return this.getLastMergeState();
            }
            case 3: {
                return this.getPathHint();
            }
            case 4: {
                return this.getNewPathHint();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setBeforeStateId((String)newValue);
            }
            case 1: {
                this.setAfterStateId((String)newValue);
            }
            case 2: {
                this.setLastMergeState((String)newValue);
            }
            case 3: {
                this.setPathHint((String)newValue);
            }
            case 4: {
                this.setNewPathHint((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBeforeStateId();
            }
            case 1: {
                this.unsetAfterStateId();
            }
            case 2: {
                this.unsetLastMergeState();
            }
            case 3: {
                this.unsetPathHint();
            }
            case 4: {
                this.unsetNewPathHint();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBeforeStateId();
            }
            case 1: {
                return this.isSetAfterStateId();
            }
            case 2: {
                return this.isSetLastMergeState();
            }
            case 3: {
                return this.isSetPathHint();
            }
            case 4: {
                return this.isSetNewPathHint();
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
        result.append(" (beforeStateId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.beforeStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", afterStateId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.afterStateId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", lastMergeState: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.lastMergeState);
        }
        else {
            result.append("<unset>");
        }
        result.append(", pathHint: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.pathHint);
        }
        else {
            result.append("<unset>");
        }
        result.append(", newPathHint: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.newPathHint);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
