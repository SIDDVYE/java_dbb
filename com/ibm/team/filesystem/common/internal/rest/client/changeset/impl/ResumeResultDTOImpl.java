// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import java.util.Collection;
import com.ibm.team.filesystem.common.internal.rest.client.locks.StreamLockReportDTO;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.GapChangeSetsDTO;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaFactory;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.ProblemChangeSetsDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChangesDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.ResumeResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ResumeResultDTOImpl extends EObjectImpl implements ResumeResultDTO
{
    protected int ALL_FLAGS;
    protected EList activeChangeSetsOverlap;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 1;
    protected static final int CANCELLED_ESETFLAG = 2;
    protected CommitDilemmaDTO commitDilemma;
    protected static final int COMMIT_DILEMMA_ESETFLAG = 4;
    protected EList configurationsWithUncheckedInChanges;
    protected EList outOfSyncShares;
    protected SandboxUpdateDilemmaDTO sandboxUpdateDilemma;
    protected static final int SANDBOX_UPDATE_DILEMMA_ESETFLAG = 8;
    protected UpdateDilemmaDTO updateDilemma;
    protected static final int UPDATE_DILEMMA_ESETFLAG = 16;
    protected EList gap;
    protected EList changeSetsBlockedByPortInProgress;
    protected EList locksWereHeld;
    protected EList locksToAcquire;
    
    protected ResumeResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.RESUME_RESULT_DTO;
    }
    
    public boolean isCancelled() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setCancelled(final boolean newCancelled) {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newCancelled) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldCancelled, newCancelled, !oldCancelledESet));
        }
    }
    
    public void unsetCancelled() {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldCancelled, false, oldCancelledESet));
        }
    }
    
    public boolean isSetCancelled() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getOutOfSyncShares() {
        if (this.outOfSyncShares == null) {
            this.outOfSyncShares = (EList)new EObjectContainmentEList.Unsettable((Class)ShareDTO.class, (InternalEObject)this, 4);
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
    
    public List getActiveChangeSetsOverlap() {
        if (this.activeChangeSetsOverlap == null) {
            this.activeChangeSetsOverlap = (EList)new EObjectContainmentEList.Unsettable((Class)ProblemChangeSetsDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.activeChangeSetsOverlap;
    }
    
    public void unsetActiveChangeSetsOverlap() {
        if (this.activeChangeSetsOverlap != null) {
            ((InternalEList.Unsettable)this.activeChangeSetsOverlap).unset();
        }
    }
    
    public boolean isSetActiveChangeSetsOverlap() {
        return this.activeChangeSetsOverlap != null && ((InternalEList.Unsettable)this.activeChangeSetsOverlap).isSet();
    }
    
    public SandboxUpdateDilemmaDTO getSandboxUpdateDilemma() {
        if (this.sandboxUpdateDilemma == null) {
            this.setSandboxUpdateDilemma(FilesystemRestClientDTOdilemmaFactory.eINSTANCE.createSandboxUpdateDilemmaDTO());
        }
        return this.sandboxUpdateDilemma;
    }
    
    public NotificationChain basicSetSandboxUpdateDilemma(final SandboxUpdateDilemmaDTO newSandboxUpdateDilemma, NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = newSandboxUpdateDilemma;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet);
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
                msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -6, (Class)null, msgs);
            }
            if (newSandboxUpdateDilemma != null) {
                msgs = ((InternalEObject)newSandboxUpdateDilemma).eInverseAdd((InternalEObject)this, -6, (Class)null, msgs);
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
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)newSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetSandboxUpdateDilemma(NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = null;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldSandboxUpdateDilemma, (Object)null, oldSandboxUpdateDilemmaESet);
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
            msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -6, (Class)null, msgs);
            msgs = this.basicUnsetSandboxUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x8) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFF7;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)null, (Object)null, oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetSandboxUpdateDilemma() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public CommitDilemmaDTO getCommitDilemma() {
        if (this.commitDilemma == null) {
            this.setCommitDilemma(FilesystemRestClientDTOdilemmaFactory.eINSTANCE.createCommitDilemmaDTO());
        }
        return this.commitDilemma;
    }
    
    public NotificationChain basicSetCommitDilemma(final CommitDilemmaDTO newCommitDilemma, NotificationChain msgs) {
        final CommitDilemmaDTO oldCommitDilemma = this.commitDilemma;
        this.commitDilemma = newCommitDilemma;
        final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldCommitDilemma, (Object)newCommitDilemma, !oldCommitDilemmaESet);
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
                msgs = ((InternalEObject)this.commitDilemma).eInverseRemove((InternalEObject)this, -3, (Class)null, msgs);
            }
            if (newCommitDilemma != null) {
                msgs = ((InternalEObject)newCommitDilemma).eInverseAdd((InternalEObject)this, -3, (Class)null, msgs);
            }
            msgs = this.basicSetCommitDilemma(newCommitDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS |= 0x4;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)newCommitDilemma, (Object)newCommitDilemma, !oldCommitDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetCommitDilemma(NotificationChain msgs) {
        final CommitDilemmaDTO oldCommitDilemma = this.commitDilemma;
        this.commitDilemma = null;
        final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldCommitDilemma, (Object)null, oldCommitDilemmaESet);
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
            msgs = ((InternalEObject)this.commitDilemma).eInverseRemove((InternalEObject)this, -3, (Class)null, msgs);
            msgs = this.basicUnsetCommitDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFB;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)null, (Object)null, oldCommitDilemmaESet));
            }
        }
    }
    
    public boolean isSetCommitDilemma() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public UpdateDilemmaDTO getUpdateDilemma() {
        if (this.updateDilemma == null) {
            this.setUpdateDilemma(FilesystemRestClientDTOdilemmaFactory.eINSTANCE.createUpdateDilemmaDTO());
        }
        return this.updateDilemma;
    }
    
    public NotificationChain basicSetUpdateDilemma(final UpdateDilemmaDTO newUpdateDilemma, NotificationChain msgs) {
        final UpdateDilemmaDTO oldUpdateDilemma = this.updateDilemma;
        this.updateDilemma = newUpdateDilemma;
        final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
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
            final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
            this.ALL_FLAGS |= 0x10;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)newUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetUpdateDilemma(NotificationChain msgs) {
        final UpdateDilemmaDTO oldUpdateDilemma = this.updateDilemma;
        this.updateDilemma = null;
        final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
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
            final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFEF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)null, (Object)null, oldUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetUpdateDilemma() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public List getGap() {
        if (this.gap == null) {
            this.gap = (EList)new EObjectContainmentEList.Unsettable((Class)GapChangeSetsDTO.class, (InternalEObject)this, 7);
        }
        return (List)this.gap;
    }
    
    public void unsetGap() {
        if (this.gap != null) {
            ((InternalEList.Unsettable)this.gap).unset();
        }
    }
    
    public boolean isSetGap() {
        return this.gap != null && ((InternalEList.Unsettable)this.gap).isSet();
    }
    
    public List getChangeSetsBlockedByPortInProgress() {
        if (this.changeSetsBlockedByPortInProgress == null) {
            this.changeSetsBlockedByPortInProgress = (EList)new EObjectResolvingEList.Unsettable((Class)ProblemChangeSetsDTO.class, (InternalEObject)this, 8);
        }
        return (List)this.changeSetsBlockedByPortInProgress;
    }
    
    public void unsetChangeSetsBlockedByPortInProgress() {
        if (this.changeSetsBlockedByPortInProgress != null) {
            ((InternalEList.Unsettable)this.changeSetsBlockedByPortInProgress).unset();
        }
    }
    
    public boolean isSetChangeSetsBlockedByPortInProgress() {
        return this.changeSetsBlockedByPortInProgress != null && ((InternalEList.Unsettable)this.changeSetsBlockedByPortInProgress).isSet();
    }
    
    public List getLocksWereHeld() {
        if (this.locksWereHeld == null) {
            this.locksWereHeld = (EList)new EObjectContainmentEList.Unsettable((Class)StreamLockReportDTO.class, (InternalEObject)this, 9);
        }
        return (List)this.locksWereHeld;
    }
    
    public void unsetLocksWereHeld() {
        if (this.locksWereHeld != null) {
            ((InternalEList.Unsettable)this.locksWereHeld).unset();
        }
    }
    
    public boolean isSetLocksWereHeld() {
        return this.locksWereHeld != null && ((InternalEList.Unsettable)this.locksWereHeld).isSet();
    }
    
    public List getLocksToAcquire() {
        if (this.locksToAcquire == null) {
            this.locksToAcquire = (EList)new EObjectContainmentEList.Unsettable((Class)StreamLockReportDTO.class, (InternalEObject)this, 10);
        }
        return (List)this.locksToAcquire;
    }
    
    public void unsetLocksToAcquire() {
        if (this.locksToAcquire != null) {
            ((InternalEList.Unsettable)this.locksToAcquire).unset();
        }
    }
    
    public boolean isSetLocksToAcquire() {
        return this.locksToAcquire != null && ((InternalEList.Unsettable)this.locksToAcquire).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getActiveChangeSetsOverlap()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return this.basicUnsetCommitDilemma(msgs);
            }
            case 3: {
                return ((InternalEList)this.getConfigurationsWithUncheckedInChanges()).basicRemove((Object)otherEnd, msgs);
            }
            case 4: {
                return ((InternalEList)this.getOutOfSyncShares()).basicRemove((Object)otherEnd, msgs);
            }
            case 5: {
                return this.basicUnsetSandboxUpdateDilemma(msgs);
            }
            case 6: {
                return this.basicUnsetUpdateDilemma(msgs);
            }
            case 7: {
                return ((InternalEList)this.getGap()).basicRemove((Object)otherEnd, msgs);
            }
            case 9: {
                return ((InternalEList)this.getLocksWereHeld()).basicRemove((Object)otherEnd, msgs);
            }
            case 10: {
                return ((InternalEList)this.getLocksToAcquire()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getActiveChangeSetsOverlap();
            }
            case 1: {
                return this.isCancelled() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return this.getCommitDilemma();
            }
            case 3: {
                return this.getConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                return this.getOutOfSyncShares();
            }
            case 5: {
                return this.getSandboxUpdateDilemma();
            }
            case 6: {
                return this.getUpdateDilemma();
            }
            case 7: {
                return this.getGap();
            }
            case 8: {
                return this.getChangeSetsBlockedByPortInProgress();
            }
            case 9: {
                return this.getLocksWereHeld();
            }
            case 10: {
                return this.getLocksToAcquire();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getActiveChangeSetsOverlap().clear();
                this.getActiveChangeSetsOverlap().addAll((Collection)newValue);
            }
            case 1: {
                this.setCancelled((boolean)newValue);
            }
            case 2: {
                this.setCommitDilemma((CommitDilemmaDTO)newValue);
            }
            case 3: {
                this.getConfigurationsWithUncheckedInChanges().clear();
                this.getConfigurationsWithUncheckedInChanges().addAll((Collection)newValue);
            }
            case 4: {
                this.getOutOfSyncShares().clear();
                this.getOutOfSyncShares().addAll((Collection)newValue);
            }
            case 5: {
                this.setSandboxUpdateDilemma((SandboxUpdateDilemmaDTO)newValue);
            }
            case 6: {
                this.setUpdateDilemma((UpdateDilemmaDTO)newValue);
            }
            case 7: {
                this.getGap().clear();
                this.getGap().addAll((Collection)newValue);
            }
            case 8: {
                this.getChangeSetsBlockedByPortInProgress().clear();
                this.getChangeSetsBlockedByPortInProgress().addAll((Collection)newValue);
            }
            case 9: {
                this.getLocksWereHeld().clear();
                this.getLocksWereHeld().addAll((Collection)newValue);
            }
            case 10: {
                this.getLocksToAcquire().clear();
                this.getLocksToAcquire().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetActiveChangeSetsOverlap();
            }
            case 1: {
                this.unsetCancelled();
            }
            case 2: {
                this.unsetCommitDilemma();
            }
            case 3: {
                this.unsetConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                this.unsetOutOfSyncShares();
            }
            case 5: {
                this.unsetSandboxUpdateDilemma();
            }
            case 6: {
                this.unsetUpdateDilemma();
            }
            case 7: {
                this.unsetGap();
            }
            case 8: {
                this.unsetChangeSetsBlockedByPortInProgress();
            }
            case 9: {
                this.unsetLocksWereHeld();
            }
            case 10: {
                this.unsetLocksToAcquire();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetActiveChangeSetsOverlap();
            }
            case 1: {
                return this.isSetCancelled();
            }
            case 2: {
                return this.isSetCommitDilemma();
            }
            case 3: {
                return this.isSetConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                return this.isSetOutOfSyncShares();
            }
            case 5: {
                return this.isSetSandboxUpdateDilemma();
            }
            case 6: {
                return this.isSetUpdateDilemma();
            }
            case 7: {
                return this.isSetGap();
            }
            case 8: {
                return this.isSetChangeSetsBlockedByPortInProgress();
            }
            case 9: {
                return this.isSetLocksWereHeld();
            }
            case 10: {
                return this.isSetLocksToAcquire();
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
