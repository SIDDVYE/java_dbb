// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogOslcLinkEntryDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogWorkItemEntryDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ContributorDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogChangeSetEntryDTO;

public class ChangeLogChangeSetEntryDTOImpl extends ChangeLogEntryDTOImpl implements ChangeLogChangeSetEntryDTO
{
    protected EList workItems;
    protected EList oslcLinks;
    protected static final long CREATION_DATE_EDEFAULT = 0L;
    protected long creationDate;
    protected static final int CREATION_DATE_ESETFLAG = 8;
    protected ContributorDTO creator;
    protected static final int CREATOR_ESETFLAG = 16;
    
    protected ChangeLogChangeSetEntryDTOImpl() {
        this.creationDate = 0L;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangelogPackage.Literals.CHANGE_LOG_CHANGE_SET_ENTRY_DTO;
    }
    
    @Override
    public List getWorkItems() {
        if (this.workItems == null) {
            this.workItems = (EList)new EObjectResolvingEList.Unsettable((Class)ChangeLogWorkItemEntryDTO.class, (InternalEObject)this, 4);
        }
        return (List)this.workItems;
    }
    
    @Override
    public void unsetWorkItems() {
        if (this.workItems != null) {
            ((InternalEList.Unsettable)this.workItems).unset();
        }
    }
    
    @Override
    public boolean isSetWorkItems() {
        return this.workItems != null && ((InternalEList.Unsettable)this.workItems).isSet();
    }
    
    @Override
    public List getOslcLinks() {
        if (this.oslcLinks == null) {
            this.oslcLinks = (EList)new EObjectResolvingEList.Unsettable((Class)ChangeLogOslcLinkEntryDTO.class, (InternalEObject)this, 5);
        }
        return (List)this.oslcLinks;
    }
    
    @Override
    public void unsetOslcLinks() {
        if (this.oslcLinks != null) {
            ((InternalEList.Unsettable)this.oslcLinks).unset();
        }
    }
    
    @Override
    public boolean isSetOslcLinks() {
        return this.oslcLinks != null && ((InternalEList.Unsettable)this.oslcLinks).isSet();
    }
    
    @Override
    public long getCreationDate() {
        return this.creationDate;
    }
    
    @Override
    public void setCreationDate(final long newCreationDate) {
        final long oldCreationDate = this.creationDate;
        this.creationDate = newCreationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, oldCreationDate, this.creationDate, !oldCreationDateESet));
        }
    }
    
    @Override
    public void unsetCreationDate() {
        final long oldCreationDate = this.creationDate;
        final boolean oldCreationDateESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.creationDate = 0L;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, oldCreationDate, 0L, oldCreationDateESet));
        }
    }
    
    @Override
    public boolean isSetCreationDate() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    @Override
    public ContributorDTO getCreator() {
        return this.creator;
    }
    
    public NotificationChain basicSetCreator(final ContributorDTO newCreator, NotificationChain msgs) {
        final ContributorDTO oldCreator = this.creator;
        this.creator = newCreator;
        final boolean oldCreatorESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldCreator, (Object)newCreator, !oldCreatorESet);
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
                msgs = ((InternalEObject)this.creator).eInverseRemove((InternalEObject)this, -8, (Class)null, msgs);
            }
            if (newCreator != null) {
                msgs = ((InternalEObject)newCreator).eInverseAdd((InternalEObject)this, -8, (Class)null, msgs);
            }
            msgs = this.basicSetCreator(newCreator, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCreatorESet = (this.ALL_FLAGS & 0x10) != 0x0;
            this.ALL_FLAGS |= 0x10;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)newCreator, (Object)newCreator, !oldCreatorESet));
            }
        }
    }
    
    public NotificationChain basicUnsetCreator(NotificationChain msgs) {
        final ContributorDTO oldCreator = this.creator;
        this.creator = null;
        final boolean oldCreatorESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldCreator, (Object)null, oldCreatorESet);
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
            msgs = ((InternalEObject)this.creator).eInverseRemove((InternalEObject)this, -8, (Class)null, msgs);
            msgs = this.basicUnsetCreator(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCreatorESet = (this.ALL_FLAGS & 0x10) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFEF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)null, (Object)null, oldCreatorESet));
            }
        }
    }
    
    @Override
    public boolean isSetCreator() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 7: {
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
                return this.getWorkItems();
            }
            case 5: {
                return this.getOslcLinks();
            }
            case 6: {
                return new Long(this.getCreationDate());
            }
            case 7: {
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
                this.getWorkItems().clear();
                this.getWorkItems().addAll((Collection)newValue);
            }
            case 5: {
                this.getOslcLinks().clear();
                this.getOslcLinks().addAll((Collection)newValue);
            }
            case 6: {
                this.setCreationDate((long)newValue);
            }
            case 7: {
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
                this.unsetWorkItems();
            }
            case 5: {
                this.unsetOslcLinks();
            }
            case 6: {
                this.unsetCreationDate();
            }
            case 7: {
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
                return this.isSetWorkItems();
            }
            case 5: {
                return this.isSetOslcLinks();
            }
            case 6: {
                return this.isSetCreationDate();
            }
            case 7: {
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
        result.append(" (creationDate: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.creationDate);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
