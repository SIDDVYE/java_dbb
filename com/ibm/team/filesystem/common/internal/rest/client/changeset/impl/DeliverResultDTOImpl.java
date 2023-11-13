// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import java.util.Collection;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ComponentSyncDTO;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaFactory;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.DeliveryRequiresHistoryReorderingDTO;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StructuredUpdateReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.StreamLockReportDTO;
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
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.DeliverResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class DeliverResultDTOImpl extends EObjectImpl implements DeliverResultDTO
{
    protected int ALL_FLAGS;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 1;
    protected static final int CANCELLED_ESETFLAG = 2;
    protected CommitDilemmaDTO commitDilemma;
    protected static final int COMMIT_DILEMMA_ESETFLAG = 4;
    protected static final boolean COMPONENTS_TO_FLOW_EDEFAULT = false;
    protected static final int COMPONENTS_TO_FLOW_EFLAG = 8;
    protected static final int COMPONENTS_TO_FLOW_ESETFLAG = 16;
    protected EList configurationsWithUncheckedInChanges;
    protected EList deliveryRequiresHistoryReordering;
    protected static final boolean FLOW_TO_NON_DEFAULT_TARGET_EDEFAULT = false;
    protected static final int FLOW_TO_NON_DEFAULT_TARGET_EFLAG = 32;
    protected static final int FLOW_TO_NON_DEFAULT_TARGET_ESETFLAG = 64;
    protected EList outOfSyncShares;
    protected EList locksToRelease;
    protected EList locksWereHeld;
    protected EList structuredResult;
    protected SandboxUpdateDilemmaDTO sandboxUpdateDilemma;
    protected static final int SANDBOX_UPDATE_DILEMMA_ESETFLAG = 128;
    protected UpdateDilemmaDTO updateDilemma;
    protected static final int UPDATE_DILEMMA_ESETFLAG = 256;
    protected EList componentsWithConflictingTargets;
    protected EList componentsWithMultipleParticipants;
    
    protected DeliverResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.DELIVER_RESULT_DTO;
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldCancelled, newCancelled, !oldCancelledESet));
        }
    }
    
    public void unsetCancelled() {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldCancelled, false, oldCancelledESet));
        }
    }
    
    public boolean isSetCancelled() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public boolean isComponentsToFlow() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public void setComponentsToFlow(final boolean newComponentsToFlow) {
        final boolean oldComponentsToFlow = (this.ALL_FLAGS & 0x8) != 0x0;
        if (newComponentsToFlow) {
            this.ALL_FLAGS |= 0x8;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFF7;
        }
        final boolean oldComponentsToFlowESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldComponentsToFlow, newComponentsToFlow, !oldComponentsToFlowESet));
        }
    }
    
    public void unsetComponentsToFlow() {
        final boolean oldComponentsToFlow = (this.ALL_FLAGS & 0x8) != 0x0;
        final boolean oldComponentsToFlowESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldComponentsToFlow, false, oldComponentsToFlowESet));
        }
    }
    
    public boolean isSetComponentsToFlow() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public boolean isFlowToNonDefaultTarget() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public void setFlowToNonDefaultTarget(final boolean newFlowToNonDefaultTarget) {
        final boolean oldFlowToNonDefaultTarget = (this.ALL_FLAGS & 0x20) != 0x0;
        if (newFlowToNonDefaultTarget) {
            this.ALL_FLAGS |= 0x20;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFDF;
        }
        final boolean oldFlowToNonDefaultTargetESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldFlowToNonDefaultTarget, newFlowToNonDefaultTarget, !oldFlowToNonDefaultTargetESet));
        }
    }
    
    public void unsetFlowToNonDefaultTarget() {
        final boolean oldFlowToNonDefaultTarget = (this.ALL_FLAGS & 0x20) != 0x0;
        final boolean oldFlowToNonDefaultTargetESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldFlowToNonDefaultTarget, false, oldFlowToNonDefaultTargetESet));
        }
    }
    
    public boolean isSetFlowToNonDefaultTarget() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public List getOutOfSyncShares() {
        if (this.outOfSyncShares == null) {
            this.outOfSyncShares = (EList)new EObjectContainmentEList.Unsettable((Class)ShareDTO.class, (InternalEObject)this, 6);
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
    
    public List getLocksToRelease() {
        if (this.locksToRelease == null) {
            this.locksToRelease = (EList)new EObjectContainmentEList.Unsettable((Class)StreamLockReportDTO.class, (InternalEObject)this, 7);
        }
        return (List)this.locksToRelease;
    }
    
    public void unsetLocksToRelease() {
        if (this.locksToRelease != null) {
            ((InternalEList.Unsettable)this.locksToRelease).unset();
        }
    }
    
    public boolean isSetLocksToRelease() {
        return this.locksToRelease != null && ((InternalEList.Unsettable)this.locksToRelease).isSet();
    }
    
    public List getLocksWereHeld() {
        if (this.locksWereHeld == null) {
            this.locksWereHeld = (EList)new EObjectContainmentEList.Unsettable((Class)StreamLockReportDTO.class, (InternalEObject)this, 8);
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
    
    public List getStructuredResult() {
        if (this.structuredResult == null) {
            this.structuredResult = (EList)new EObjectResolvingEList.Unsettable((Class)StructuredUpdateReportDTO.class, (InternalEObject)this, 9);
        }
        return (List)this.structuredResult;
    }
    
    public void unsetStructuredResult() {
        if (this.structuredResult != null) {
            ((InternalEList.Unsettable)this.structuredResult).unset();
        }
    }
    
    public boolean isSetStructuredResult() {
        return this.structuredResult != null && ((InternalEList.Unsettable)this.structuredResult).isSet();
    }
    
    public List getDeliveryRequiresHistoryReordering() {
        if (this.deliveryRequiresHistoryReordering == null) {
            this.deliveryRequiresHistoryReordering = (EList)new EObjectResolvingEList.Unsettable((Class)DeliveryRequiresHistoryReorderingDTO.class, (InternalEObject)this, 4);
        }
        return (List)this.deliveryRequiresHistoryReordering;
    }
    
    public void unsetDeliveryRequiresHistoryReordering() {
        if (this.deliveryRequiresHistoryReordering != null) {
            ((InternalEList.Unsettable)this.deliveryRequiresHistoryReordering).unset();
        }
    }
    
    public boolean isSetDeliveryRequiresHistoryReordering() {
        return this.deliveryRequiresHistoryReordering != null && ((InternalEList.Unsettable)this.deliveryRequiresHistoryReordering).isSet();
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
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 10, (Object)oldSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet);
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
                msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -11, (Class)null, msgs);
            }
            if (newSandboxUpdateDilemma != null) {
                msgs = ((InternalEObject)newSandboxUpdateDilemma).eInverseAdd((InternalEObject)this, -11, (Class)null, msgs);
            }
            msgs = this.basicSetSandboxUpdateDilemma(newSandboxUpdateDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x80) != 0x0;
            this.ALL_FLAGS |= 0x80;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 10, (Object)newSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetSandboxUpdateDilemma(NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = null;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 10, (Object)oldSandboxUpdateDilemma, (Object)null, oldSandboxUpdateDilemmaESet);
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
            msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -11, (Class)null, msgs);
            msgs = this.basicUnsetSandboxUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x80) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFF7F;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 10, (Object)null, (Object)null, oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetSandboxUpdateDilemma() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
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
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldCommitDilemma, (Object)newCommitDilemma, !oldCommitDilemmaESet);
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
                msgs = ((InternalEObject)this.commitDilemma).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            }
            if (newCommitDilemma != null) {
                msgs = ((InternalEObject)newCommitDilemma).eInverseAdd((InternalEObject)this, -2, (Class)null, msgs);
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
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)newCommitDilemma, (Object)newCommitDilemma, !oldCommitDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetCommitDilemma(NotificationChain msgs) {
        final CommitDilemmaDTO oldCommitDilemma = this.commitDilemma;
        this.commitDilemma = null;
        final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldCommitDilemma, (Object)null, oldCommitDilemmaESet);
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
            msgs = ((InternalEObject)this.commitDilemma).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            msgs = this.basicUnsetCommitDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFB;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)null, (Object)null, oldCommitDilemmaESet));
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
        final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 11, (Object)oldUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet);
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
                msgs = ((InternalEObject)this.updateDilemma).eInverseRemove((InternalEObject)this, -12, (Class)null, msgs);
            }
            if (newUpdateDilemma != null) {
                msgs = ((InternalEObject)newUpdateDilemma).eInverseAdd((InternalEObject)this, -12, (Class)null, msgs);
            }
            msgs = this.basicSetUpdateDilemma(newUpdateDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x100) != 0x0;
            this.ALL_FLAGS |= 0x100;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, (Object)newUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetUpdateDilemma(NotificationChain msgs) {
        final UpdateDilemmaDTO oldUpdateDilemma = this.updateDilemma;
        this.updateDilemma = null;
        final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 11, (Object)oldUpdateDilemma, (Object)null, oldUpdateDilemmaESet);
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
            msgs = ((InternalEObject)this.updateDilemma).eInverseRemove((InternalEObject)this, -12, (Class)null, msgs);
            msgs = this.basicUnsetUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x100) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFEFF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, (Object)null, (Object)null, oldUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetUpdateDilemma() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public List getComponentsWithConflictingTargets() {
        if (this.componentsWithConflictingTargets == null) {
            this.componentsWithConflictingTargets = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentSyncDTO.class, (InternalEObject)this, 12);
        }
        return (List)this.componentsWithConflictingTargets;
    }
    
    public void unsetComponentsWithConflictingTargets() {
        if (this.componentsWithConflictingTargets != null) {
            ((InternalEList.Unsettable)this.componentsWithConflictingTargets).unset();
        }
    }
    
    public boolean isSetComponentsWithConflictingTargets() {
        return this.componentsWithConflictingTargets != null && ((InternalEList.Unsettable)this.componentsWithConflictingTargets).isSet();
    }
    
    public List getComponentsWithMultipleParticipants() {
        if (this.componentsWithMultipleParticipants == null) {
            this.componentsWithMultipleParticipants = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentSyncDTO.class, (InternalEObject)this, 13);
        }
        return (List)this.componentsWithMultipleParticipants;
    }
    
    public void unsetComponentsWithMultipleParticipants() {
        if (this.componentsWithMultipleParticipants != null) {
            ((InternalEList.Unsettable)this.componentsWithMultipleParticipants).unset();
        }
    }
    
    public boolean isSetComponentsWithMultipleParticipants() {
        return this.componentsWithMultipleParticipants != null && ((InternalEList.Unsettable)this.componentsWithMultipleParticipants).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return this.basicUnsetCommitDilemma(msgs);
            }
            case 3: {
                return ((InternalEList)this.getConfigurationsWithUncheckedInChanges()).basicRemove((Object)otherEnd, msgs);
            }
            case 6: {
                return ((InternalEList)this.getOutOfSyncShares()).basicRemove((Object)otherEnd, msgs);
            }
            case 7: {
                return ((InternalEList)this.getLocksToRelease()).basicRemove((Object)otherEnd, msgs);
            }
            case 8: {
                return ((InternalEList)this.getLocksWereHeld()).basicRemove((Object)otherEnd, msgs);
            }
            case 10: {
                return this.basicUnsetSandboxUpdateDilemma(msgs);
            }
            case 11: {
                return this.basicUnsetUpdateDilemma(msgs);
            }
            case 12: {
                return ((InternalEList)this.getComponentsWithConflictingTargets()).basicRemove((Object)otherEnd, msgs);
            }
            case 13: {
                return ((InternalEList)this.getComponentsWithMultipleParticipants()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isCancelled() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.getCommitDilemma();
            }
            case 2: {
                return this.isComponentsToFlow() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 3: {
                return this.getConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                return this.getDeliveryRequiresHistoryReordering();
            }
            case 5: {
                return this.isFlowToNonDefaultTarget() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 6: {
                return this.getOutOfSyncShares();
            }
            case 7: {
                return this.getLocksToRelease();
            }
            case 8: {
                return this.getLocksWereHeld();
            }
            case 9: {
                return this.getStructuredResult();
            }
            case 10: {
                return this.getSandboxUpdateDilemma();
            }
            case 11: {
                return this.getUpdateDilemma();
            }
            case 12: {
                return this.getComponentsWithConflictingTargets();
            }
            case 13: {
                return this.getComponentsWithMultipleParticipants();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setCancelled((boolean)newValue);
            }
            case 1: {
                this.setCommitDilemma((CommitDilemmaDTO)newValue);
            }
            case 2: {
                this.setComponentsToFlow((boolean)newValue);
            }
            case 3: {
                this.getConfigurationsWithUncheckedInChanges().clear();
                this.getConfigurationsWithUncheckedInChanges().addAll((Collection)newValue);
            }
            case 4: {
                this.getDeliveryRequiresHistoryReordering().clear();
                this.getDeliveryRequiresHistoryReordering().addAll((Collection)newValue);
            }
            case 5: {
                this.setFlowToNonDefaultTarget((boolean)newValue);
            }
            case 6: {
                this.getOutOfSyncShares().clear();
                this.getOutOfSyncShares().addAll((Collection)newValue);
            }
            case 7: {
                this.getLocksToRelease().clear();
                this.getLocksToRelease().addAll((Collection)newValue);
            }
            case 8: {
                this.getLocksWereHeld().clear();
                this.getLocksWereHeld().addAll((Collection)newValue);
            }
            case 9: {
                this.getStructuredResult().clear();
                this.getStructuredResult().addAll((Collection)newValue);
            }
            case 10: {
                this.setSandboxUpdateDilemma((SandboxUpdateDilemmaDTO)newValue);
            }
            case 11: {
                this.setUpdateDilemma((UpdateDilemmaDTO)newValue);
            }
            case 12: {
                this.getComponentsWithConflictingTargets().clear();
                this.getComponentsWithConflictingTargets().addAll((Collection)newValue);
            }
            case 13: {
                this.getComponentsWithMultipleParticipants().clear();
                this.getComponentsWithMultipleParticipants().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetCancelled();
            }
            case 1: {
                this.unsetCommitDilemma();
            }
            case 2: {
                this.unsetComponentsToFlow();
            }
            case 3: {
                this.unsetConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                this.unsetDeliveryRequiresHistoryReordering();
            }
            case 5: {
                this.unsetFlowToNonDefaultTarget();
            }
            case 6: {
                this.unsetOutOfSyncShares();
            }
            case 7: {
                this.unsetLocksToRelease();
            }
            case 8: {
                this.unsetLocksWereHeld();
            }
            case 9: {
                this.unsetStructuredResult();
            }
            case 10: {
                this.unsetSandboxUpdateDilemma();
            }
            case 11: {
                this.unsetUpdateDilemma();
            }
            case 12: {
                this.unsetComponentsWithConflictingTargets();
            }
            case 13: {
                this.unsetComponentsWithMultipleParticipants();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetCancelled();
            }
            case 1: {
                return this.isSetCommitDilemma();
            }
            case 2: {
                return this.isSetComponentsToFlow();
            }
            case 3: {
                return this.isSetConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                return this.isSetDeliveryRequiresHistoryReordering();
            }
            case 5: {
                return this.isSetFlowToNonDefaultTarget();
            }
            case 6: {
                return this.isSetOutOfSyncShares();
            }
            case 7: {
                return this.isSetLocksToRelease();
            }
            case 8: {
                return this.isSetLocksWereHeld();
            }
            case 9: {
                return this.isSetStructuredResult();
            }
            case 10: {
                return this.isSetSandboxUpdateDilemma();
            }
            case 11: {
                return this.isSetUpdateDilemma();
            }
            case 12: {
                return this.isSetComponentsWithConflictingTargets();
            }
            case 13: {
                return this.isSetComponentsWithMultipleParticipants();
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
        result.append(", componentsToFlow: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append((this.ALL_FLAGS & 0x8) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", flowToNonDefaultTarget: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append((this.ALL_FLAGS & 0x20) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
