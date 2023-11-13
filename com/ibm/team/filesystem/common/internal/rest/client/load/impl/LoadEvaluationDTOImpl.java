// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.core.StatusDTO;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.load.MultipleSandboxLoadDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.InvalidLoadRequestDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.ShareToLoadDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.CollisionDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.RemovedShareDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadOverlapDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadEvaluationDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LoadEvaluationDTOImpl extends EObjectImpl implements LoadEvaluationDTO
{
    protected int ALL_FLAGS;
    protected EList overlappingLoadRequests;
    protected EList sharesToBeRemoved;
    protected EList collisions;
    protected EList sharesOutOfSync;
    protected EList newSharesToLoad;
    protected EList invalidLoadRequests;
    protected EList multipleSandboxLoads;
    protected static final boolean INVALID_FILTER_FOR_OLD_LOAD_RULE_FORMAT_EDEFAULT = false;
    protected static final int INVALID_FILTER_FOR_OLD_LOAD_RULE_FORMAT_EFLAG = 1;
    protected static final int INVALID_FILTER_FOR_OLD_LOAD_RULE_FORMAT_ESETFLAG = 2;
    protected EList invalidLoadLocations;
    protected EList loadRuleProblems;
    
    protected LoadEvaluationDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOloadPackage.Literals.LOAD_EVALUATION_DTO;
    }
    
    public List getOverlappingLoadRequests() {
        if (this.overlappingLoadRequests == null) {
            this.overlappingLoadRequests = (EList)new EObjectContainmentEList.Unsettable((Class)LoadOverlapDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.overlappingLoadRequests;
    }
    
    public void unsetOverlappingLoadRequests() {
        if (this.overlappingLoadRequests != null) {
            ((InternalEList.Unsettable)this.overlappingLoadRequests).unset();
        }
    }
    
    public boolean isSetOverlappingLoadRequests() {
        return this.overlappingLoadRequests != null && ((InternalEList.Unsettable)this.overlappingLoadRequests).isSet();
    }
    
    public List getSharesToBeRemoved() {
        if (this.sharesToBeRemoved == null) {
            this.sharesToBeRemoved = (EList)new EObjectContainmentEList.Unsettable((Class)RemovedShareDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.sharesToBeRemoved;
    }
    
    public void unsetSharesToBeRemoved() {
        if (this.sharesToBeRemoved != null) {
            ((InternalEList.Unsettable)this.sharesToBeRemoved).unset();
        }
    }
    
    public boolean isSetSharesToBeRemoved() {
        return this.sharesToBeRemoved != null && ((InternalEList.Unsettable)this.sharesToBeRemoved).isSet();
    }
    
    public List getCollisions() {
        if (this.collisions == null) {
            this.collisions = (EList)new EObjectContainmentEList.Unsettable((Class)CollisionDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.collisions;
    }
    
    public void unsetCollisions() {
        if (this.collisions != null) {
            ((InternalEList.Unsettable)this.collisions).unset();
        }
    }
    
    public boolean isSetCollisions() {
        return this.collisions != null && ((InternalEList.Unsettable)this.collisions).isSet();
    }
    
    public List getSharesOutOfSync() {
        if (this.sharesOutOfSync == null) {
            this.sharesOutOfSync = (EList)new EObjectContainmentEList.Unsettable((Class)ShareDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.sharesOutOfSync;
    }
    
    public void unsetSharesOutOfSync() {
        if (this.sharesOutOfSync != null) {
            ((InternalEList.Unsettable)this.sharesOutOfSync).unset();
        }
    }
    
    public boolean isSetSharesOutOfSync() {
        return this.sharesOutOfSync != null && ((InternalEList.Unsettable)this.sharesOutOfSync).isSet();
    }
    
    public List getNewSharesToLoad() {
        if (this.newSharesToLoad == null) {
            this.newSharesToLoad = (EList)new EObjectContainmentEList.Unsettable((Class)ShareToLoadDTO.class, (InternalEObject)this, 4);
        }
        return (List)this.newSharesToLoad;
    }
    
    public void unsetNewSharesToLoad() {
        if (this.newSharesToLoad != null) {
            ((InternalEList.Unsettable)this.newSharesToLoad).unset();
        }
    }
    
    public boolean isSetNewSharesToLoad() {
        return this.newSharesToLoad != null && ((InternalEList.Unsettable)this.newSharesToLoad).isSet();
    }
    
    public List getInvalidLoadRequests() {
        if (this.invalidLoadRequests == null) {
            this.invalidLoadRequests = (EList)new EObjectContainmentEList.Unsettable((Class)InvalidLoadRequestDTO.class, (InternalEObject)this, 5);
        }
        return (List)this.invalidLoadRequests;
    }
    
    public void unsetInvalidLoadRequests() {
        if (this.invalidLoadRequests != null) {
            ((InternalEList.Unsettable)this.invalidLoadRequests).unset();
        }
    }
    
    public boolean isSetInvalidLoadRequests() {
        return this.invalidLoadRequests != null && ((InternalEList.Unsettable)this.invalidLoadRequests).isSet();
    }
    
    public List getMultipleSandboxLoads() {
        if (this.multipleSandboxLoads == null) {
            this.multipleSandboxLoads = (EList)new EObjectContainmentEList.Unsettable((Class)MultipleSandboxLoadDTO.class, (InternalEObject)this, 6);
        }
        return (List)this.multipleSandboxLoads;
    }
    
    public void unsetMultipleSandboxLoads() {
        if (this.multipleSandboxLoads != null) {
            ((InternalEList.Unsettable)this.multipleSandboxLoads).unset();
        }
    }
    
    public boolean isSetMultipleSandboxLoads() {
        return this.multipleSandboxLoads != null && ((InternalEList.Unsettable)this.multipleSandboxLoads).isSet();
    }
    
    public boolean isInvalidFilterForOldLoadRuleFormat() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setInvalidFilterForOldLoadRuleFormat(final boolean newInvalidFilterForOldLoadRuleFormat) {
        final boolean oldInvalidFilterForOldLoadRuleFormat = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newInvalidFilterForOldLoadRuleFormat) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldInvalidFilterForOldLoadRuleFormatESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, oldInvalidFilterForOldLoadRuleFormat, newInvalidFilterForOldLoadRuleFormat, !oldInvalidFilterForOldLoadRuleFormatESet));
        }
    }
    
    public void unsetInvalidFilterForOldLoadRuleFormat() {
        final boolean oldInvalidFilterForOldLoadRuleFormat = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldInvalidFilterForOldLoadRuleFormatESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, oldInvalidFilterForOldLoadRuleFormat, false, oldInvalidFilterForOldLoadRuleFormatESet));
        }
    }
    
    public boolean isSetInvalidFilterForOldLoadRuleFormat() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getLoadRuleProblems() {
        if (this.loadRuleProblems == null) {
            this.loadRuleProblems = (EList)new EObjectContainmentEList.Unsettable((Class)StatusDTO.class, (InternalEObject)this, 9);
        }
        return (List)this.loadRuleProblems;
    }
    
    public void unsetLoadRuleProblems() {
        if (this.loadRuleProblems != null) {
            ((InternalEList.Unsettable)this.loadRuleProblems).unset();
        }
    }
    
    public boolean isSetLoadRuleProblems() {
        return this.loadRuleProblems != null && ((InternalEList.Unsettable)this.loadRuleProblems).isSet();
    }
    
    public List getInvalidLoadLocations() {
        if (this.invalidLoadLocations == null) {
            this.invalidLoadLocations = (EList)new EObjectContainmentEList.Unsettable((Class)InvalidLoadRequestDTO.class, (InternalEObject)this, 8);
        }
        return (List)this.invalidLoadLocations;
    }
    
    public void unsetInvalidLoadLocations() {
        if (this.invalidLoadLocations != null) {
            ((InternalEList.Unsettable)this.invalidLoadLocations).unset();
        }
    }
    
    public boolean isSetInvalidLoadLocations() {
        return this.invalidLoadLocations != null && ((InternalEList.Unsettable)this.invalidLoadLocations).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getOverlappingLoadRequests()).basicRemove((Object)otherEnd, msgs);
            }
            case 1: {
                return ((InternalEList)this.getSharesToBeRemoved()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return ((InternalEList)this.getCollisions()).basicRemove((Object)otherEnd, msgs);
            }
            case 3: {
                return ((InternalEList)this.getSharesOutOfSync()).basicRemove((Object)otherEnd, msgs);
            }
            case 4: {
                return ((InternalEList)this.getNewSharesToLoad()).basicRemove((Object)otherEnd, msgs);
            }
            case 5: {
                return ((InternalEList)this.getInvalidLoadRequests()).basicRemove((Object)otherEnd, msgs);
            }
            case 6: {
                return ((InternalEList)this.getMultipleSandboxLoads()).basicRemove((Object)otherEnd, msgs);
            }
            case 8: {
                return ((InternalEList)this.getInvalidLoadLocations()).basicRemove((Object)otherEnd, msgs);
            }
            case 9: {
                return ((InternalEList)this.getLoadRuleProblems()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getOverlappingLoadRequests();
            }
            case 1: {
                return this.getSharesToBeRemoved();
            }
            case 2: {
                return this.getCollisions();
            }
            case 3: {
                return this.getSharesOutOfSync();
            }
            case 4: {
                return this.getNewSharesToLoad();
            }
            case 5: {
                return this.getInvalidLoadRequests();
            }
            case 6: {
                return this.getMultipleSandboxLoads();
            }
            case 7: {
                return this.isInvalidFilterForOldLoadRuleFormat() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 8: {
                return this.getInvalidLoadLocations();
            }
            case 9: {
                return this.getLoadRuleProblems();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getOverlappingLoadRequests().clear();
                this.getOverlappingLoadRequests().addAll((Collection)newValue);
            }
            case 1: {
                this.getSharesToBeRemoved().clear();
                this.getSharesToBeRemoved().addAll((Collection)newValue);
            }
            case 2: {
                this.getCollisions().clear();
                this.getCollisions().addAll((Collection)newValue);
            }
            case 3: {
                this.getSharesOutOfSync().clear();
                this.getSharesOutOfSync().addAll((Collection)newValue);
            }
            case 4: {
                this.getNewSharesToLoad().clear();
                this.getNewSharesToLoad().addAll((Collection)newValue);
            }
            case 5: {
                this.getInvalidLoadRequests().clear();
                this.getInvalidLoadRequests().addAll((Collection)newValue);
            }
            case 6: {
                this.getMultipleSandboxLoads().clear();
                this.getMultipleSandboxLoads().addAll((Collection)newValue);
            }
            case 7: {
                this.setInvalidFilterForOldLoadRuleFormat((boolean)newValue);
            }
            case 8: {
                this.getInvalidLoadLocations().clear();
                this.getInvalidLoadLocations().addAll((Collection)newValue);
            }
            case 9: {
                this.getLoadRuleProblems().clear();
                this.getLoadRuleProblems().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetOverlappingLoadRequests();
            }
            case 1: {
                this.unsetSharesToBeRemoved();
            }
            case 2: {
                this.unsetCollisions();
            }
            case 3: {
                this.unsetSharesOutOfSync();
            }
            case 4: {
                this.unsetNewSharesToLoad();
            }
            case 5: {
                this.unsetInvalidLoadRequests();
            }
            case 6: {
                this.unsetMultipleSandboxLoads();
            }
            case 7: {
                this.unsetInvalidFilterForOldLoadRuleFormat();
            }
            case 8: {
                this.unsetInvalidLoadLocations();
            }
            case 9: {
                this.unsetLoadRuleProblems();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetOverlappingLoadRequests();
            }
            case 1: {
                return this.isSetSharesToBeRemoved();
            }
            case 2: {
                return this.isSetCollisions();
            }
            case 3: {
                return this.isSetSharesOutOfSync();
            }
            case 4: {
                return this.isSetNewSharesToLoad();
            }
            case 5: {
                return this.isSetInvalidLoadRequests();
            }
            case 6: {
                return this.isSetMultipleSandboxLoads();
            }
            case 7: {
                return this.isSetInvalidFilterForOldLoadRuleFormat();
            }
            case 8: {
                return this.isSetInvalidLoadLocations();
            }
            case 9: {
                return this.isSetLoadRuleProblems();
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
        result.append(" (invalidFilterForOldLoadRuleFormat: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
