// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChangesDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CurrentPatchDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ProcessAcceptQueueResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ProcessAcceptQueueResultDTOImpl extends EObjectImpl implements ProcessAcceptQueueResultDTO
{
    protected int ALL_FLAGS;
    protected CurrentPatchDTO currentPatch;
    protected static final int CURRENT_PATCH_ESETFLAG = 1;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 2;
    protected static final int CANCELLED_ESETFLAG = 4;
    protected EList outOfSyncShares;
    protected EList configurationsWithUncheckedInChanges;
    protected SandboxUpdateDilemmaDTO sandboxUpdateDilemma;
    protected static final int SANDBOX_UPDATE_DILEMMA_ESETFLAG = 8;
    protected CommitDilemmaDTO commitDilemma;
    protected static final int COMMIT_DILEMMA_ESETFLAG = 16;
    protected UpdateDilemmaDTO updateDilemma;
    protected static final int UPDATE_DILEMMA_ESETFLAG = 32;
    protected static final long ACCEPT_QUEUE_SIZE_EDEFAULT = 0L;
    protected long acceptQueueSize;
    protected static final int ACCEPT_QUEUE_SIZE_ESETFLAG = 64;
    
    protected ProcessAcceptQueueResultDTOImpl() {
        this.ALL_FLAGS = 0;
        this.acceptQueueSize = 0L;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.PROCESS_ACCEPT_QUEUE_RESULT_DTO;
    }
    
    public CurrentPatchDTO getCurrentPatch() {
        if (this.currentPatch != null && ((EObject)this.currentPatch).eIsProxy()) {
            final InternalEObject oldCurrentPatch = (InternalEObject)this.currentPatch;
            this.currentPatch = (CurrentPatchDTO)this.eResolveProxy(oldCurrentPatch);
            if (this.currentPatch != oldCurrentPatch && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 0, (Object)oldCurrentPatch, (Object)this.currentPatch));
            }
        }
        return this.currentPatch;
    }
    
    public CurrentPatchDTO basicGetCurrentPatch() {
        return this.currentPatch;
    }
    
    public void setCurrentPatch(final CurrentPatchDTO newCurrentPatch) {
        final CurrentPatchDTO oldCurrentPatch = this.currentPatch;
        this.currentPatch = newCurrentPatch;
        final boolean oldCurrentPatchESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldCurrentPatch, (Object)this.currentPatch, !oldCurrentPatchESet));
        }
    }
    
    public void unsetCurrentPatch() {
        final CurrentPatchDTO oldCurrentPatch = this.currentPatch;
        final boolean oldCurrentPatchESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.currentPatch = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldCurrentPatch, (Object)null, oldCurrentPatchESet));
        }
    }
    
    public boolean isSetCurrentPatch() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public boolean isCancelled() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public void setCancelled(final boolean newCancelled) {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x2) != 0x0;
        if (newCancelled) {
            this.ALL_FLAGS |= 0x2;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFD;
        }
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldCancelled, newCancelled, !oldCancelledESet));
        }
    }
    
    public void unsetCancelled() {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x2) != 0x0;
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldCancelled, false, oldCancelledESet));
        }
    }
    
    public boolean isSetCancelled() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
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
    
    public List getConfigurationsWithUncheckedInChanges() {
        if (this.configurationsWithUncheckedInChanges == null) {
            this.configurationsWithUncheckedInChanges = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationWithUncheckedInChangesDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.configurationsWithUncheckedInChanges;
    }
    
    public void unsetConfigurationsWithUncheckedInChanges() {
        if (this.configurationsWithUncheckedInChanges != null) {
            ((InternalEList.Unsettable)this.configurationsWithUncheckedInChanges).unset();
        }
    }
    
    public boolean isSetConfigurationsWithUncheckedInChanges() {
        return this.configurationsWithUncheckedInChanges != null && ((InternalEList.Unsettable)this.configurationsWithUncheckedInChanges).isSet();
    }
    
    public SandboxUpdateDilemmaDTO getSandboxUpdateDilemma() {
        return this.sandboxUpdateDilemma;
    }
    
    public NotificationChain basicSetSandboxUpdateDilemma(final SandboxUpdateDilemmaDTO newSandboxUpdateDilemma, NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = newSandboxUpdateDilemma;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setSandboxUpdateDilemma(final SandboxUpdateDilemmaDTO newSandboxUpdateDilemma) {
        if (newSandboxUpdateDilemma != this.sandboxUpdateDilemma) {
            NotificationChain msgs = null;
            if (this.sandboxUpdateDilemma != null) {
                msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -5, (Class)null, msgs);
            }
            if (newSandboxUpdateDilemma != null) {
                msgs = ((InternalEObject)newSandboxUpdateDilemma).eInverseAdd((InternalEObject)this, -5, (Class)null, msgs);
            }
            msgs = this.basicSetSandboxUpdateDilemma(newSandboxUpdateDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x8) != 0x0;
            this.ALL_FLAGS |= 0x8;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)newSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetSandboxUpdateDilemma(NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = null;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldSandboxUpdateDilemma, (Object)null, oldSandboxUpdateDilemmaESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetSandboxUpdateDilemma() {
        if (this.sandboxUpdateDilemma != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -5, (Class)null, msgs);
            msgs = this.basicUnsetSandboxUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x8) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFF7;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)null, (Object)null, oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetSandboxUpdateDilemma() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public CommitDilemmaDTO getCommitDilemma() {
        return this.commitDilemma;
    }
    
    public NotificationChain basicSetCommitDilemma(final CommitDilemmaDTO newCommitDilemma, NotificationChain msgs) {
        final CommitDilemmaDTO oldCommitDilemma = this.commitDilemma;
        this.commitDilemma = newCommitDilemma;
        final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldCommitDilemma, (Object)newCommitDilemma, !oldCommitDilemmaESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setCommitDilemma(final CommitDilemmaDTO newCommitDilemma) {
        if (newCommitDilemma != this.commitDilemma) {
            NotificationChain msgs = null;
            if (this.commitDilemma != null) {
                msgs = ((InternalEObject)this.commitDilemma).eInverseRemove((InternalEObject)this, -6, (Class)null, msgs);
            }
            if (newCommitDilemma != null) {
                msgs = ((InternalEObject)newCommitDilemma).eInverseAdd((InternalEObject)this, -6, (Class)null, msgs);
            }
            msgs = this.basicSetCommitDilemma(newCommitDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
            this.ALL_FLAGS |= 0x10;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)newCommitDilemma, (Object)newCommitDilemma, !oldCommitDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetCommitDilemma(NotificationChain msgs) {
        final CommitDilemmaDTO oldCommitDilemma = this.commitDilemma;
        this.commitDilemma = null;
        final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldCommitDilemma, (Object)null, oldCommitDilemmaESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetCommitDilemma() {
        if (this.commitDilemma != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.commitDilemma).eInverseRemove((InternalEObject)this, -6, (Class)null, msgs);
            msgs = this.basicUnsetCommitDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFEF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)null, (Object)null, oldCommitDilemmaESet));
            }
        }
    }
    
    public boolean isSetCommitDilemma() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public UpdateDilemmaDTO getUpdateDilemma() {
        return this.updateDilemma;
    }
    
    public NotificationChain basicSetUpdateDilemma(final UpdateDilemmaDTO newUpdateDilemma, NotificationChain msgs) {
        final UpdateDilemmaDTO oldUpdateDilemma = this.updateDilemma;
        this.updateDilemma = newUpdateDilemma;
        final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setUpdateDilemma(final UpdateDilemmaDTO newUpdateDilemma) {
        if (newUpdateDilemma != this.updateDilemma) {
            NotificationChain msgs = null;
            if (this.updateDilemma != null) {
                msgs = ((InternalEObject)this.updateDilemma).eInverseRemove((InternalEObject)this, -7, (Class)null, msgs);
            }
            if (newUpdateDilemma != null) {
                msgs = ((InternalEObject)newUpdateDilemma).eInverseAdd((InternalEObject)this, -7, (Class)null, msgs);
            }
            msgs = this.basicSetUpdateDilemma(newUpdateDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x20) != 0x0;
            this.ALL_FLAGS |= 0x20;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)newUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetUpdateDilemma(NotificationChain msgs) {
        final UpdateDilemmaDTO oldUpdateDilemma = this.updateDilemma;
        this.updateDilemma = null;
        final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldUpdateDilemma, (Object)null, oldUpdateDilemmaESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetUpdateDilemma() {
        if (this.updateDilemma != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.updateDilemma).eInverseRemove((InternalEObject)this, -7, (Class)null, msgs);
            msgs = this.basicUnsetUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x20) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFDF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)null, (Object)null, oldUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetUpdateDilemma() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public long getAcceptQueueSize() {
        return this.acceptQueueSize;
    }
    
    public void setAcceptQueueSize(final long newAcceptQueueSize) {
        final long oldAcceptQueueSize = this.acceptQueueSize;
        this.acceptQueueSize = newAcceptQueueSize;
        final boolean oldAcceptQueueSizeESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, oldAcceptQueueSize, this.acceptQueueSize, !oldAcceptQueueSizeESet));
        }
    }
    
    public void unsetAcceptQueueSize() {
        final long oldAcceptQueueSize = this.acceptQueueSize;
        final boolean oldAcceptQueueSizeESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.acceptQueueSize = 0L;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, oldAcceptQueueSize, 0L, oldAcceptQueueSizeESet));
        }
    }
    
    public boolean isSetAcceptQueueSize() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 2: {
                return ((InternalEList)this.getOutOfSyncShares()).basicRemove((Object)otherEnd, msgs);
            }
            case 3: {
                return ((InternalEList)this.getConfigurationsWithUncheckedInChanges()).basicRemove((Object)otherEnd, msgs);
            }
            case 4: {
                return this.basicUnsetSandboxUpdateDilemma(msgs);
            }
            case 5: {
                return this.basicUnsetCommitDilemma(msgs);
            }
            case 6: {
                return this.basicUnsetUpdateDilemma(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                if (resolve) {
                    return this.getCurrentPatch();
                }
                return this.basicGetCurrentPatch();
            }
            case 1: {
                return this.isCancelled() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return this.getOutOfSyncShares();
            }
            case 3: {
                return this.getConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                return this.getSandboxUpdateDilemma();
            }
            case 5: {
                return this.getCommitDilemma();
            }
            case 6: {
                return this.getUpdateDilemma();
            }
            case 7: {
                return new Long(this.getAcceptQueueSize());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setCurrentPatch((CurrentPatchDTO)newValue);
            }
            case 1: {
                this.setCancelled((boolean)newValue);
            }
            case 2: {
                this.getOutOfSyncShares().clear();
                this.getOutOfSyncShares().addAll((Collection)newValue);
            }
            case 3: {
                this.getConfigurationsWithUncheckedInChanges().clear();
                this.getConfigurationsWithUncheckedInChanges().addAll((Collection)newValue);
            }
            case 4: {
                this.setSandboxUpdateDilemma((SandboxUpdateDilemmaDTO)newValue);
            }
            case 5: {
                this.setCommitDilemma((CommitDilemmaDTO)newValue);
            }
            case 6: {
                this.setUpdateDilemma((UpdateDilemmaDTO)newValue);
            }
            case 7: {
                this.setAcceptQueueSize((long)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetCurrentPatch();
            }
            case 1: {
                this.unsetCancelled();
            }
            case 2: {
                this.unsetOutOfSyncShares();
            }
            case 3: {
                this.unsetConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                this.unsetSandboxUpdateDilemma();
            }
            case 5: {
                this.unsetCommitDilemma();
            }
            case 6: {
                this.unsetUpdateDilemma();
            }
            case 7: {
                this.unsetAcceptQueueSize();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetCurrentPatch();
            }
            case 1: {
                return this.isSetCancelled();
            }
            case 2: {
                return this.isSetOutOfSyncShares();
            }
            case 3: {
                return this.isSetConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                return this.isSetSandboxUpdateDilemma();
            }
            case 5: {
                return this.isSetCommitDilemma();
            }
            case 6: {
                return this.isSetUpdateDilemma();
            }
            case 7: {
                return this.isSetAcceptQueueSize();
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
        result.append(" (cancelled: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append((this.ALL_FLAGS & 0x2) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", acceptQueueSize: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.acceptQueueSize);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
