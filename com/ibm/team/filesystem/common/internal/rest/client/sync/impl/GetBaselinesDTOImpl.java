// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.BaselineHistoryEntryDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.GetBaselinesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class GetBaselinesDTOImpl extends EObjectImpl implements GetBaselinesDTO
{
    protected int ALL_FLAGS;
    protected EList baselineHistoryEntriesInWorkspace;
    protected EList baselinesInRepository;
    protected static final long TOTAL_ENTRIES_EDEFAULT = 0L;
    protected long totalEntries;
    protected static final int TOTAL_ENTRIES_ESETFLAG = 1;
    
    protected GetBaselinesDTOImpl() {
        this.ALL_FLAGS = 0;
        this.totalEntries = 0L;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.GET_BASELINES_DTO;
    }
    
    public long getTotalEntries() {
        return this.totalEntries;
    }
    
    public void setTotalEntries(final long newTotalEntries) {
        final long oldTotalEntries = this.totalEntries;
        this.totalEntries = newTotalEntries;
        final boolean oldTotalEntriesESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldTotalEntries, this.totalEntries, !oldTotalEntriesESet));
        }
    }
    
    public void unsetTotalEntries() {
        final long oldTotalEntries = this.totalEntries;
        final boolean oldTotalEntriesESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.totalEntries = 0L;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldTotalEntries, 0L, oldTotalEntriesESet));
        }
    }
    
    public boolean isSetTotalEntries() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public List getBaselineHistoryEntriesInWorkspace() {
        if (this.baselineHistoryEntriesInWorkspace == null) {
            this.baselineHistoryEntriesInWorkspace = (EList)new EObjectContainmentEList.Unsettable((Class)BaselineHistoryEntryDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.baselineHistoryEntriesInWorkspace;
    }
    
    public void unsetBaselineHistoryEntriesInWorkspace() {
        if (this.baselineHistoryEntriesInWorkspace != null) {
            ((InternalEList.Unsettable)this.baselineHistoryEntriesInWorkspace).unset();
        }
    }
    
    public boolean isSetBaselineHistoryEntriesInWorkspace() {
        return this.baselineHistoryEntriesInWorkspace != null && ((InternalEList.Unsettable)this.baselineHistoryEntriesInWorkspace).isSet();
    }
    
    public List getBaselinesInRepository() {
        if (this.baselinesInRepository == null) {
            this.baselinesInRepository = (EList)new EObjectContainmentEList.Unsettable((Class)BaselineDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.baselinesInRepository;
    }
    
    public void unsetBaselinesInRepository() {
        if (this.baselinesInRepository != null) {
            ((InternalEList.Unsettable)this.baselinesInRepository).unset();
        }
    }
    
    public boolean isSetBaselinesInRepository() {
        return this.baselinesInRepository != null && ((InternalEList.Unsettable)this.baselinesInRepository).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getBaselineHistoryEntriesInWorkspace()).basicRemove((Object)otherEnd, msgs);
            }
            case 1: {
                return ((InternalEList)this.getBaselinesInRepository()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getBaselineHistoryEntriesInWorkspace();
            }
            case 1: {
                return this.getBaselinesInRepository();
            }
            case 2: {
                return new Long(this.getTotalEntries());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getBaselineHistoryEntriesInWorkspace().clear();
                this.getBaselineHistoryEntriesInWorkspace().addAll((Collection)newValue);
            }
            case 1: {
                this.getBaselinesInRepository().clear();
                this.getBaselinesInRepository().addAll((Collection)newValue);
            }
            case 2: {
                this.setTotalEntries((long)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBaselineHistoryEntriesInWorkspace();
            }
            case 1: {
                this.unsetBaselinesInRepository();
            }
            case 2: {
                this.unsetTotalEntries();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBaselineHistoryEntriesInWorkspace();
            }
            case 1: {
                return this.isSetBaselinesInRepository();
            }
            case 2: {
                return this.isSetTotalEntries();
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
        result.append(" (totalEntries: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.totalEntries);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
