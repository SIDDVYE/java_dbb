// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogBaselineEntryDTO;

public class ChangeLogBaselineEntryDTOImpl extends ChangeLogEntryDTOImpl implements ChangeLogBaselineEntryDTO
{
    protected static final int BASELINE_ID_EDEFAULT = 0;
    protected int baselineId;
    protected static final int BASELINE_ID_ESETFLAG = 8;
    protected static final long CREATION_DATE_EDEFAULT = 0L;
    protected long creationDate;
    protected static final int CREATION_DATE_ESETFLAG = 16;
    protected ContributorDTO creator;
    protected static final int CREATOR_ESETFLAG = 32;
    
    protected ChangeLogBaselineEntryDTOImpl() {
        this.baselineId = 0;
        this.creationDate = 0L;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangelogPackage.Literals.CHANGE_LOG_BASELINE_ENTRY_DTO;
    }
    
    @Override
    public int getBaselineId() {
        return this.baselineId;
    }
    
    @Override
    public void setBaselineId(final int newBaselineId) {
        final int oldBaselineId = this.baselineId;
        this.baselineId = newBaselineId;
        final boolean oldBaselineIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldBaselineId, this.baselineId, !oldBaselineIdESet));
        }
    }
    
    @Override
    public void unsetBaselineId() {
        final int oldBaselineId = this.baselineId;
        final boolean oldBaselineIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.baselineId = 0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldBaselineId, 0, oldBaselineIdESet));
        }
    }
    
    @Override
    public boolean isSetBaselineId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    @Override
    public long getCreationDate() {
        return this.creationDate;
    }
    
    @Override
    public void setCreationDate(final long newCreationDate) {
        final long oldCreationDate = this.creationDate;
        this.creationDate = newCreationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldCreationDate, this.creationDate, !oldCreationDateESet));
        }
    }
    
    @Override
    public void unsetCreationDate() {
        final long oldCreationDate = this.creationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.creationDate = 0L;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldCreationDate, 0L, oldCreationDateESet));
        }
    }
    
    @Override
    public boolean isSetCreationDate() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    @Override
    public ContributorDTO getCreator() {
        return this.creator;
    }
    
    public NotificationChain basicSetCreator(final ContributorDTO newCreator, NotificationChain msgs) {
        final ContributorDTO oldCreator = this.creator;
        this.creator = newCreator;
        final boolean oldCreatorESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldCreator, (Object)newCreator, !oldCreatorESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    @Override
    public void setCreator(final ContributorDTO newCreator) {
        if (newCreator != this.creator) {
            NotificationChain msgs = null;
            if (this.creator != null) {
                msgs = ((InternalEObject)this.creator).eInverseRemove((InternalEObject)this, -7, (Class)null, msgs);
            }
            if (newCreator != null) {
                msgs = ((InternalEObject)newCreator).eInverseAdd((InternalEObject)this, -7, (Class)null, msgs);
            }
            msgs = this.basicSetCreator(newCreator, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCreatorESet = (this.ALL_FLAGS & 0x20) != 0x0;
            this.ALL_FLAGS |= 0x20;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)newCreator, (Object)newCreator, !oldCreatorESet));
            }
        }
    }
    
    public NotificationChain basicUnsetCreator(NotificationChain msgs) {
        final ContributorDTO oldCreator = this.creator;
        this.creator = null;
        final boolean oldCreatorESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldCreator, (Object)null, oldCreatorESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    @Override
    public void unsetCreator() {
        if (this.creator != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.creator).eInverseRemove((InternalEObject)this, -7, (Class)null, msgs);
            msgs = this.basicUnsetCreator(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCreatorESet = (this.ALL_FLAGS & 0x20) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFDF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)null, (Object)null, oldCreatorESet));
            }
        }
    }
    
    @Override
    public boolean isSetCreator() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 6: {
                return this.basicUnsetCreator(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 4: {
                return new Integer(this.getBaselineId());
            }
            case 5: {
                return new Long(this.getCreationDate());
            }
            case 6: {
                return this.getCreator();
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
                this.setBaselineId((int)newValue);
            }
            case 5: {
                this.setCreationDate((long)newValue);
            }
            case 6: {
                this.setCreator((ContributorDTO)newValue);
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
                this.unsetBaselineId();
            }
            case 5: {
                this.unsetCreationDate();
            }
            case 6: {
                this.unsetCreator();
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
                return this.isSetBaselineId();
            }
            case 5: {
                return this.isSetCreationDate();
            }
            case 6: {
                return this.isSetCreator();
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
        result.append(" (baselineId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.baselineId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", creationDate: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.creationDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
