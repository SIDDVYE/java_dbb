// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import java.util.Collection;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ComponentSyncDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.StreamLockReportDTO;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaFactory;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StructuredUpdateReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.GapChangeSetsDTO;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.ProblemChangeSetsDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StaleDataDTO;
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
import com.ibm.team.filesystem.common.internal.rest.client.changeset.WorkspaceUpdateResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class WorkspaceUpdateResultDTOImpl extends EObjectImpl implements WorkspaceUpdateResultDTO
{
    protected int ALL_FLAGS;
    protected static final boolean ACCEPTED_SUSPENDED_CHANGES_EDEFAULT = false;
    protected static final int ACCEPTED_SUSPENDED_CHANGES_EFLAG = 1;
    protected static final int ACCEPTED_SUSPENDED_CHANGES_ESETFLAG = 2;
    protected EList activeChangeSets;
    protected EList activeChangeSetsOverlap;
    protected EList activeChangeSetsInComponent;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 4;
    protected static final int CANCELLED_ESETFLAG = 8;
    protected static final boolean CHANGE_SETS_ALREADY_IN_HISTORY_EDEFAULT = false;
    protected static final int CHANGE_SETS_ALREADY_IN_HISTORY_EFLAG = 16;
    protected static final int CHANGE_SETS_ALREADY_IN_HISTORY_ESETFLAG = 32;
    protected EList changeSetsBlockedByPortInProgress;
    protected CommitDilemmaDTO commitDilemma;
    protected static final int COMMIT_DILEMMA_ESETFLAG = 64;
    protected EList componentFlowAdditions;
    protected EList componentFlowDeletions;
    protected EList componentReplacementCandidates;
    protected EList componentsAdded;
    protected EList configurationsWithUncheckedInChanges;
    protected EList disconnectedComponents;
    protected EList gap;
    protected EList outOfSyncShares;
    protected SandboxUpdateDilemmaDTO sandboxUpdateDilemma;
    protected static final int SANDBOX_UPDATE_DILEMMA_ESETFLAG = 128;
    protected EList staleData;
    protected EList structuredResult;
    protected UpdateDilemmaDTO updateDilemma;
    protected static final int UPDATE_DILEMMA_ESETFLAG = 256;
    protected EList eclipseReadFailureMessage;
    protected EList locksWereHeld;
    protected EList locksToAcquire;
    protected EList componentsWithNWayConflicts;
    protected EList componentsWithConflictingTargets;
    protected EList componentsWithMultipleParticipants;
    protected EList noBackupBaselinesComponents;
    protected EList selectedComponentsInMultipleHierarchies;
    protected EList subcomponentsInMultipleHierarchies;
    
    protected WorkspaceUpdateResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.WORKSPACE_UPDATE_RESULT_DTO;
    }
    
    public boolean isCancelled() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setCancelled(final boolean newCancelled) {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newCancelled) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldCancelled, newCancelled, !oldCancelledESet));
        }
    }
    
    public void unsetCancelled() {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldCancelled, false, oldCancelledESet));
        }
    }
    
    public boolean isSetCancelled() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public List getOutOfSyncShares() {
        if (this.outOfSyncShares == null) {
            this.outOfSyncShares = (EList)new EObjectContainmentEList.Unsettable((Class)ShareDTO.class, (InternalEObject)this, 15);
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
            this.configurationsWithUncheckedInChanges = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationWithUncheckedInChangesDTO.class, (InternalEObject)this, 12);
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
    
    public List getStaleData() {
        if (this.staleData == null) {
            this.staleData = (EList)new EObjectContainmentEList.Unsettable((Class)StaleDataDTO.class, (InternalEObject)this, 17);
        }
        return (List)this.staleData;
    }
    
    public void unsetStaleData() {
        if (this.staleData != null) {
            ((InternalEList.Unsettable)this.staleData).unset();
        }
    }
    
    public boolean isSetStaleData() {
        return this.staleData != null && ((InternalEList.Unsettable)this.staleData).isSet();
    }
    
    public List getDisconnectedComponents() {
        if (this.disconnectedComponents == null) {
            this.disconnectedComponents = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationDescriptorDTO.class, (InternalEObject)this, 13);
        }
        return (List)this.disconnectedComponents;
    }
    
    public void unsetDisconnectedComponents() {
        if (this.disconnectedComponents != null) {
            ((InternalEList.Unsettable)this.disconnectedComponents).unset();
        }
    }
    
    public boolean isSetDisconnectedComponents() {
        return this.disconnectedComponents != null && ((InternalEList.Unsettable)this.disconnectedComponents).isSet();
    }
    
    public List getComponentFlowAdditions() {
        if (this.componentFlowAdditions == null) {
            this.componentFlowAdditions = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationDescriptorDTO.class, (InternalEObject)this, 8);
        }
        return (List)this.componentFlowAdditions;
    }
    
    public void unsetComponentFlowAdditions() {
        if (this.componentFlowAdditions != null) {
            ((InternalEList.Unsettable)this.componentFlowAdditions).unset();
        }
    }
    
    public boolean isSetComponentFlowAdditions() {
        return this.componentFlowAdditions != null && ((InternalEList.Unsettable)this.componentFlowAdditions).isSet();
    }
    
    public List getComponentFlowDeletions() {
        if (this.componentFlowDeletions == null) {
            this.componentFlowDeletions = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationDescriptorDTO.class, (InternalEObject)this, 9);
        }
        return (List)this.componentFlowDeletions;
    }
    
    public void unsetComponentFlowDeletions() {
        if (this.componentFlowDeletions != null) {
            ((InternalEList.Unsettable)this.componentFlowDeletions).unset();
        }
    }
    
    public boolean isSetComponentFlowDeletions() {
        return this.componentFlowDeletions != null && ((InternalEList.Unsettable)this.componentFlowDeletions).isSet();
    }
    
    public List getComponentReplacementCandidates() {
        if (this.componentReplacementCandidates == null) {
            this.componentReplacementCandidates = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationDescriptorDTO.class, (InternalEObject)this, 10);
        }
        return (List)this.componentReplacementCandidates;
    }
    
    public void unsetComponentReplacementCandidates() {
        if (this.componentReplacementCandidates != null) {
            ((InternalEList.Unsettable)this.componentReplacementCandidates).unset();
        }
    }
    
    public boolean isSetComponentReplacementCandidates() {
        return this.componentReplacementCandidates != null && ((InternalEList.Unsettable)this.componentReplacementCandidates).isSet();
    }
    
    public List getComponentsAdded() {
        if (this.componentsAdded == null) {
            this.componentsAdded = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationDescriptorDTO.class, (InternalEObject)this, 11);
        }
        return (List)this.componentsAdded;
    }
    
    public void unsetComponentsAdded() {
        if (this.componentsAdded != null) {
            ((InternalEList.Unsettable)this.componentsAdded).unset();
        }
    }
    
    public boolean isSetComponentsAdded() {
        return this.componentsAdded != null && ((InternalEList.Unsettable)this.componentsAdded).isSet();
    }
    
    public boolean isChangeSetsAlreadyInHistory() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public void setChangeSetsAlreadyInHistory(final boolean newChangeSetsAlreadyInHistory) {
        final boolean oldChangeSetsAlreadyInHistory = (this.ALL_FLAGS & 0x10) != 0x0;
        if (newChangeSetsAlreadyInHistory) {
            this.ALL_FLAGS |= 0x10;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFEF;
        }
        final boolean oldChangeSetsAlreadyInHistoryESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldChangeSetsAlreadyInHistory, newChangeSetsAlreadyInHistory, !oldChangeSetsAlreadyInHistoryESet));
        }
    }
    
    public void unsetChangeSetsAlreadyInHistory() {
        final boolean oldChangeSetsAlreadyInHistory = (this.ALL_FLAGS & 0x10) != 0x0;
        final boolean oldChangeSetsAlreadyInHistoryESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldChangeSetsAlreadyInHistory, false, oldChangeSetsAlreadyInHistoryESet));
        }
    }
    
    public boolean isSetChangeSetsAlreadyInHistory() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public List getChangeSetsBlockedByPortInProgress() {
        if (this.changeSetsBlockedByPortInProgress == null) {
            this.changeSetsBlockedByPortInProgress = (EList)new EObjectResolvingEList.Unsettable((Class)ProblemChangeSetsDTO.class, (InternalEObject)this, 6);
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
    
    public boolean isAcceptedSuspendedChanges() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setAcceptedSuspendedChanges(final boolean newAcceptedSuspendedChanges) {
        final boolean oldAcceptedSuspendedChanges = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newAcceptedSuspendedChanges) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldAcceptedSuspendedChangesESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldAcceptedSuspendedChanges, newAcceptedSuspendedChanges, !oldAcceptedSuspendedChangesESet));
        }
    }
    
    public void unsetAcceptedSuspendedChanges() {
        final boolean oldAcceptedSuspendedChanges = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldAcceptedSuspendedChangesESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldAcceptedSuspendedChanges, false, oldAcceptedSuspendedChangesESet));
        }
    }
    
    public boolean isSetAcceptedSuspendedChanges() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getActiveChangeSets() {
        if (this.activeChangeSets == null) {
            this.activeChangeSets = (EList)new EObjectContainmentEList.Unsettable((Class)ProblemChangeSetsDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.activeChangeSets;
    }
    
    public void unsetActiveChangeSets() {
        if (this.activeChangeSets != null) {
            ((InternalEList.Unsettable)this.activeChangeSets).unset();
        }
    }
    
    public boolean isSetActiveChangeSets() {
        return this.activeChangeSets != null && ((InternalEList.Unsettable)this.activeChangeSets).isSet();
    }
    
    public List getActiveChangeSetsOverlap() {
        if (this.activeChangeSetsOverlap == null) {
            this.activeChangeSetsOverlap = (EList)new EObjectContainmentEList.Unsettable((Class)ProblemChangeSetsDTO.class, (InternalEObject)this, 2);
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
    
    public List getActiveChangeSetsInComponent() {
        if (this.activeChangeSetsInComponent == null) {
            this.activeChangeSetsInComponent = (EList)new EObjectContainmentEList.Unsettable((Class)ProblemChangeSetsDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.activeChangeSetsInComponent;
    }
    
    public void unsetActiveChangeSetsInComponent() {
        if (this.activeChangeSetsInComponent != null) {
            ((InternalEList.Unsettable)this.activeChangeSetsInComponent).unset();
        }
    }
    
    public boolean isSetActiveChangeSetsInComponent() {
        return this.activeChangeSetsInComponent != null && ((InternalEList.Unsettable)this.activeChangeSetsInComponent).isSet();
    }
    
    public List getGap() {
        if (this.gap == null) {
            this.gap = (EList)new EObjectContainmentEList.Unsettable((Class)GapChangeSetsDTO.class, (InternalEObject)this, 14);
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
    
    public List getStructuredResult() {
        if (this.structuredResult == null) {
            this.structuredResult = (EList)new EObjectResolvingEList.Unsettable((Class)StructuredUpdateReportDTO.class, (InternalEObject)this, 18);
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
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 16, (Object)oldSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet);
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
                msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -17, (Class)null, msgs);
            }
            if (newSandboxUpdateDilemma != null) {
                msgs = ((InternalEObject)newSandboxUpdateDilemma).eInverseAdd((InternalEObject)this, -17, (Class)null, msgs);
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
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 16, (Object)newSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetSandboxUpdateDilemma(NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = null;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 16, (Object)oldSandboxUpdateDilemma, (Object)null, oldSandboxUpdateDilemmaESet);
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
            msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -17, (Class)null, msgs);
            msgs = this.basicUnsetSandboxUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x80) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFF7F;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 16, (Object)null, (Object)null, oldSandboxUpdateDilemmaESet));
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
        final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldCommitDilemma, (Object)newCommitDilemma, !oldCommitDilemmaESet);
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
                msgs = ((InternalEObject)this.commitDilemma).eInverseRemove((InternalEObject)this, -8, (Class)null, msgs);
            }
            if (newCommitDilemma != null) {
                msgs = ((InternalEObject)newCommitDilemma).eInverseAdd((InternalEObject)this, -8, (Class)null, msgs);
            }
            msgs = this.basicSetCommitDilemma(newCommitDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x40) != 0x0;
            this.ALL_FLAGS |= 0x40;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)newCommitDilemma, (Object)newCommitDilemma, !oldCommitDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetCommitDilemma(NotificationChain msgs) {
        final CommitDilemmaDTO oldCommitDilemma = this.commitDilemma;
        this.commitDilemma = null;
        final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldCommitDilemma, (Object)null, oldCommitDilemmaESet);
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
            msgs = ((InternalEObject)this.commitDilemma).eInverseRemove((InternalEObject)this, -8, (Class)null, msgs);
            msgs = this.basicUnsetCommitDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x40) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFBF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)null, (Object)null, oldCommitDilemmaESet));
            }
        }
    }
    
    public boolean isSetCommitDilemma() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
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
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 19, (Object)oldUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet);
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
                msgs = ((InternalEObject)this.updateDilemma).eInverseRemove((InternalEObject)this, -20, (Class)null, msgs);
            }
            if (newUpdateDilemma != null) {
                msgs = ((InternalEObject)newUpdateDilemma).eInverseAdd((InternalEObject)this, -20, (Class)null, msgs);
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
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 19, (Object)newUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetUpdateDilemma(NotificationChain msgs) {
        final UpdateDilemmaDTO oldUpdateDilemma = this.updateDilemma;
        this.updateDilemma = null;
        final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 19, (Object)oldUpdateDilemma, (Object)null, oldUpdateDilemmaESet);
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
            msgs = ((InternalEObject)this.updateDilemma).eInverseRemove((InternalEObject)this, -20, (Class)null, msgs);
            msgs = this.basicUnsetUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x100) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFEFF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 19, (Object)null, (Object)null, oldUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetUpdateDilemma() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public List getEclipseReadFailureMessage() {
        if (this.eclipseReadFailureMessage == null) {
            this.eclipseReadFailureMessage = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 20);
        }
        return (List)this.eclipseReadFailureMessage;
    }
    
    public void unsetEclipseReadFailureMessage() {
        if (this.eclipseReadFailureMessage != null) {
            ((InternalEList.Unsettable)this.eclipseReadFailureMessage).unset();
        }
    }
    
    public boolean isSetEclipseReadFailureMessage() {
        return this.eclipseReadFailureMessage != null && ((InternalEList.Unsettable)this.eclipseReadFailureMessage).isSet();
    }
    
    public List getLocksWereHeld() {
        if (this.locksWereHeld == null) {
            this.locksWereHeld = (EList)new EObjectContainmentEList.Unsettable((Class)StreamLockReportDTO.class, (InternalEObject)this, 21);
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
            this.locksToAcquire = (EList)new EObjectContainmentEList.Unsettable((Class)StreamLockReportDTO.class, (InternalEObject)this, 22);
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
    
    public List getComponentsWithNWayConflicts() {
        if (this.componentsWithNWayConflicts == null) {
            this.componentsWithNWayConflicts = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentDTO.class, (InternalEObject)this, 23);
        }
        return (List)this.componentsWithNWayConflicts;
    }
    
    public void unsetComponentsWithNWayConflicts() {
        if (this.componentsWithNWayConflicts != null) {
            ((InternalEList.Unsettable)this.componentsWithNWayConflicts).unset();
        }
    }
    
    public boolean isSetComponentsWithNWayConflicts() {
        return this.componentsWithNWayConflicts != null && ((InternalEList.Unsettable)this.componentsWithNWayConflicts).isSet();
    }
    
    public List getComponentsWithConflictingTargets() {
        if (this.componentsWithConflictingTargets == null) {
            this.componentsWithConflictingTargets = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentSyncDTO.class, (InternalEObject)this, 24);
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
            this.componentsWithMultipleParticipants = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentSyncDTO.class, (InternalEObject)this, 25);
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
    
    public List getNoBackupBaselinesComponents() {
        if (this.noBackupBaselinesComponents == null) {
            this.noBackupBaselinesComponents = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentDTO.class, (InternalEObject)this, 26);
        }
        return (List)this.noBackupBaselinesComponents;
    }
    
    public void unsetNoBackupBaselinesComponents() {
        if (this.noBackupBaselinesComponents != null) {
            ((InternalEList.Unsettable)this.noBackupBaselinesComponents).unset();
        }
    }
    
    public boolean isSetNoBackupBaselinesComponents() {
        return this.noBackupBaselinesComponents != null && ((InternalEList.Unsettable)this.noBackupBaselinesComponents).isSet();
    }
    
    public List getSelectedComponentsInMultipleHierarchies() {
        if (this.selectedComponentsInMultipleHierarchies == null) {
            this.selectedComponentsInMultipleHierarchies = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentDTO.class, (InternalEObject)this, 27);
        }
        return (List)this.selectedComponentsInMultipleHierarchies;
    }
    
    public void unsetSelectedComponentsInMultipleHierarchies() {
        if (this.selectedComponentsInMultipleHierarchies != null) {
            ((InternalEList.Unsettable)this.selectedComponentsInMultipleHierarchies).unset();
        }
    }
    
    public boolean isSetSelectedComponentsInMultipleHierarchies() {
        return this.selectedComponentsInMultipleHierarchies != null && ((InternalEList.Unsettable)this.selectedComponentsInMultipleHierarchies).isSet();
    }
    
    public List getSubcomponentsInMultipleHierarchies() {
        if (this.subcomponentsInMultipleHierarchies == null) {
            this.subcomponentsInMultipleHierarchies = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentDTO.class, (InternalEObject)this, 28);
        }
        return (List)this.subcomponentsInMultipleHierarchies;
    }
    
    public void unsetSubcomponentsInMultipleHierarchies() {
        if (this.subcomponentsInMultipleHierarchies != null) {
            ((InternalEList.Unsettable)this.subcomponentsInMultipleHierarchies).unset();
        }
    }
    
    public boolean isSetSubcomponentsInMultipleHierarchies() {
        return this.subcomponentsInMultipleHierarchies != null && ((InternalEList.Unsettable)this.subcomponentsInMultipleHierarchies).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return ((InternalEList)this.getActiveChangeSets()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return ((InternalEList)this.getActiveChangeSetsOverlap()).basicRemove((Object)otherEnd, msgs);
            }
            case 3: {
                return ((InternalEList)this.getActiveChangeSetsInComponent()).basicRemove((Object)otherEnd, msgs);
            }
            case 7: {
                return this.basicUnsetCommitDilemma(msgs);
            }
            case 8: {
                return ((InternalEList)this.getComponentFlowAdditions()).basicRemove((Object)otherEnd, msgs);
            }
            case 9: {
                return ((InternalEList)this.getComponentFlowDeletions()).basicRemove((Object)otherEnd, msgs);
            }
            case 10: {
                return ((InternalEList)this.getComponentReplacementCandidates()).basicRemove((Object)otherEnd, msgs);
            }
            case 11: {
                return ((InternalEList)this.getComponentsAdded()).basicRemove((Object)otherEnd, msgs);
            }
            case 12: {
                return ((InternalEList)this.getConfigurationsWithUncheckedInChanges()).basicRemove((Object)otherEnd, msgs);
            }
            case 13: {
                return ((InternalEList)this.getDisconnectedComponents()).basicRemove((Object)otherEnd, msgs);
            }
            case 14: {
                return ((InternalEList)this.getGap()).basicRemove((Object)otherEnd, msgs);
            }
            case 15: {
                return ((InternalEList)this.getOutOfSyncShares()).basicRemove((Object)otherEnd, msgs);
            }
            case 16: {
                return this.basicUnsetSandboxUpdateDilemma(msgs);
            }
            case 17: {
                return ((InternalEList)this.getStaleData()).basicRemove((Object)otherEnd, msgs);
            }
            case 19: {
                return this.basicUnsetUpdateDilemma(msgs);
            }
            case 21: {
                return ((InternalEList)this.getLocksWereHeld()).basicRemove((Object)otherEnd, msgs);
            }
            case 22: {
                return ((InternalEList)this.getLocksToAcquire()).basicRemove((Object)otherEnd, msgs);
            }
            case 23: {
                return ((InternalEList)this.getComponentsWithNWayConflicts()).basicRemove((Object)otherEnd, msgs);
            }
            case 24: {
                return ((InternalEList)this.getComponentsWithConflictingTargets()).basicRemove((Object)otherEnd, msgs);
            }
            case 25: {
                return ((InternalEList)this.getComponentsWithMultipleParticipants()).basicRemove((Object)otherEnd, msgs);
            }
            case 26: {
                return ((InternalEList)this.getNoBackupBaselinesComponents()).basicRemove((Object)otherEnd, msgs);
            }
            case 27: {
                return ((InternalEList)this.getSelectedComponentsInMultipleHierarchies()).basicRemove((Object)otherEnd, msgs);
            }
            case 28: {
                return ((InternalEList)this.getSubcomponentsInMultipleHierarchies()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isAcceptedSuspendedChanges() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.getActiveChangeSets();
            }
            case 2: {
                return this.getActiveChangeSetsOverlap();
            }
            case 3: {
                return this.getActiveChangeSetsInComponent();
            }
            case 4: {
                return this.isCancelled() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 5: {
                return this.isChangeSetsAlreadyInHistory() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 6: {
                return this.getChangeSetsBlockedByPortInProgress();
            }
            case 7: {
                return this.getCommitDilemma();
            }
            case 8: {
                return this.getComponentFlowAdditions();
            }
            case 9: {
                return this.getComponentFlowDeletions();
            }
            case 10: {
                return this.getComponentReplacementCandidates();
            }
            case 11: {
                return this.getComponentsAdded();
            }
            case 12: {
                return this.getConfigurationsWithUncheckedInChanges();
            }
            case 13: {
                return this.getDisconnectedComponents();
            }
            case 14: {
                return this.getGap();
            }
            case 15: {
                return this.getOutOfSyncShares();
            }
            case 16: {
                return this.getSandboxUpdateDilemma();
            }
            case 17: {
                return this.getStaleData();
            }
            case 18: {
                return this.getStructuredResult();
            }
            case 19: {
                return this.getUpdateDilemma();
            }
            case 20: {
                return this.getEclipseReadFailureMessage();
            }
            case 21: {
                return this.getLocksWereHeld();
            }
            case 22: {
                return this.getLocksToAcquire();
            }
            case 23: {
                return this.getComponentsWithNWayConflicts();
            }
            case 24: {
                return this.getComponentsWithConflictingTargets();
            }
            case 25: {
                return this.getComponentsWithMultipleParticipants();
            }
            case 26: {
                return this.getNoBackupBaselinesComponents();
            }
            case 27: {
                return this.getSelectedComponentsInMultipleHierarchies();
            }
            case 28: {
                return this.getSubcomponentsInMultipleHierarchies();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setAcceptedSuspendedChanges((boolean)newValue);
            }
            case 1: {
                this.getActiveChangeSets().clear();
                this.getActiveChangeSets().addAll((Collection)newValue);
            }
            case 2: {
                this.getActiveChangeSetsOverlap().clear();
                this.getActiveChangeSetsOverlap().addAll((Collection)newValue);
            }
            case 3: {
                this.getActiveChangeSetsInComponent().clear();
                this.getActiveChangeSetsInComponent().addAll((Collection)newValue);
            }
            case 4: {
                this.setCancelled((boolean)newValue);
            }
            case 5: {
                this.setChangeSetsAlreadyInHistory((boolean)newValue);
            }
            case 6: {
                this.getChangeSetsBlockedByPortInProgress().clear();
                this.getChangeSetsBlockedByPortInProgress().addAll((Collection)newValue);
            }
            case 7: {
                this.setCommitDilemma((CommitDilemmaDTO)newValue);
            }
            case 8: {
                this.getComponentFlowAdditions().clear();
                this.getComponentFlowAdditions().addAll((Collection)newValue);
            }
            case 9: {
                this.getComponentFlowDeletions().clear();
                this.getComponentFlowDeletions().addAll((Collection)newValue);
            }
            case 10: {
                this.getComponentReplacementCandidates().clear();
                this.getComponentReplacementCandidates().addAll((Collection)newValue);
            }
            case 11: {
                this.getComponentsAdded().clear();
                this.getComponentsAdded().addAll((Collection)newValue);
            }
            case 12: {
                this.getConfigurationsWithUncheckedInChanges().clear();
                this.getConfigurationsWithUncheckedInChanges().addAll((Collection)newValue);
            }
            case 13: {
                this.getDisconnectedComponents().clear();
                this.getDisconnectedComponents().addAll((Collection)newValue);
            }
            case 14: {
                this.getGap().clear();
                this.getGap().addAll((Collection)newValue);
            }
            case 15: {
                this.getOutOfSyncShares().clear();
                this.getOutOfSyncShares().addAll((Collection)newValue);
            }
            case 16: {
                this.setSandboxUpdateDilemma((SandboxUpdateDilemmaDTO)newValue);
            }
            case 17: {
                this.getStaleData().clear();
                this.getStaleData().addAll((Collection)newValue);
            }
            case 18: {
                this.getStructuredResult().clear();
                this.getStructuredResult().addAll((Collection)newValue);
            }
            case 19: {
                this.setUpdateDilemma((UpdateDilemmaDTO)newValue);
            }
            case 20: {
                this.getEclipseReadFailureMessage().clear();
                this.getEclipseReadFailureMessage().addAll((Collection)newValue);
            }
            case 21: {
                this.getLocksWereHeld().clear();
                this.getLocksWereHeld().addAll((Collection)newValue);
            }
            case 22: {
                this.getLocksToAcquire().clear();
                this.getLocksToAcquire().addAll((Collection)newValue);
            }
            case 23: {
                this.getComponentsWithNWayConflicts().clear();
                this.getComponentsWithNWayConflicts().addAll((Collection)newValue);
            }
            case 24: {
                this.getComponentsWithConflictingTargets().clear();
                this.getComponentsWithConflictingTargets().addAll((Collection)newValue);
            }
            case 25: {
                this.getComponentsWithMultipleParticipants().clear();
                this.getComponentsWithMultipleParticipants().addAll((Collection)newValue);
            }
            case 26: {
                this.getNoBackupBaselinesComponents().clear();
                this.getNoBackupBaselinesComponents().addAll((Collection)newValue);
            }
            case 27: {
                this.getSelectedComponentsInMultipleHierarchies().clear();
                this.getSelectedComponentsInMultipleHierarchies().addAll((Collection)newValue);
            }
            case 28: {
                this.getSubcomponentsInMultipleHierarchies().clear();
                this.getSubcomponentsInMultipleHierarchies().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetAcceptedSuspendedChanges();
            }
            case 1: {
                this.unsetActiveChangeSets();
            }
            case 2: {
                this.unsetActiveChangeSetsOverlap();
            }
            case 3: {
                this.unsetActiveChangeSetsInComponent();
            }
            case 4: {
                this.unsetCancelled();
            }
            case 5: {
                this.unsetChangeSetsAlreadyInHistory();
            }
            case 6: {
                this.unsetChangeSetsBlockedByPortInProgress();
            }
            case 7: {
                this.unsetCommitDilemma();
            }
            case 8: {
                this.unsetComponentFlowAdditions();
            }
            case 9: {
                this.unsetComponentFlowDeletions();
            }
            case 10: {
                this.unsetComponentReplacementCandidates();
            }
            case 11: {
                this.unsetComponentsAdded();
            }
            case 12: {
                this.unsetConfigurationsWithUncheckedInChanges();
            }
            case 13: {
                this.unsetDisconnectedComponents();
            }
            case 14: {
                this.unsetGap();
            }
            case 15: {
                this.unsetOutOfSyncShares();
            }
            case 16: {
                this.unsetSandboxUpdateDilemma();
            }
            case 17: {
                this.unsetStaleData();
            }
            case 18: {
                this.unsetStructuredResult();
            }
            case 19: {
                this.unsetUpdateDilemma();
            }
            case 20: {
                this.unsetEclipseReadFailureMessage();
            }
            case 21: {
                this.unsetLocksWereHeld();
            }
            case 22: {
                this.unsetLocksToAcquire();
            }
            case 23: {
                this.unsetComponentsWithNWayConflicts();
            }
            case 24: {
                this.unsetComponentsWithConflictingTargets();
            }
            case 25: {
                this.unsetComponentsWithMultipleParticipants();
            }
            case 26: {
                this.unsetNoBackupBaselinesComponents();
            }
            case 27: {
                this.unsetSelectedComponentsInMultipleHierarchies();
            }
            case 28: {
                this.unsetSubcomponentsInMultipleHierarchies();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetAcceptedSuspendedChanges();
            }
            case 1: {
                return this.isSetActiveChangeSets();
            }
            case 2: {
                return this.isSetActiveChangeSetsOverlap();
            }
            case 3: {
                return this.isSetActiveChangeSetsInComponent();
            }
            case 4: {
                return this.isSetCancelled();
            }
            case 5: {
                return this.isSetChangeSetsAlreadyInHistory();
            }
            case 6: {
                return this.isSetChangeSetsBlockedByPortInProgress();
            }
            case 7: {
                return this.isSetCommitDilemma();
            }
            case 8: {
                return this.isSetComponentFlowAdditions();
            }
            case 9: {
                return this.isSetComponentFlowDeletions();
            }
            case 10: {
                return this.isSetComponentReplacementCandidates();
            }
            case 11: {
                return this.isSetComponentsAdded();
            }
            case 12: {
                return this.isSetConfigurationsWithUncheckedInChanges();
            }
            case 13: {
                return this.isSetDisconnectedComponents();
            }
            case 14: {
                return this.isSetGap();
            }
            case 15: {
                return this.isSetOutOfSyncShares();
            }
            case 16: {
                return this.isSetSandboxUpdateDilemma();
            }
            case 17: {
                return this.isSetStaleData();
            }
            case 18: {
                return this.isSetStructuredResult();
            }
            case 19: {
                return this.isSetUpdateDilemma();
            }
            case 20: {
                return this.isSetEclipseReadFailureMessage();
            }
            case 21: {
                return this.isSetLocksWereHeld();
            }
            case 22: {
                return this.isSetLocksToAcquire();
            }
            case 23: {
                return this.isSetComponentsWithNWayConflicts();
            }
            case 24: {
                return this.isSetComponentsWithConflictingTargets();
            }
            case 25: {
                return this.isSetComponentsWithMultipleParticipants();
            }
            case 26: {
                return this.isSetNoBackupBaselinesComponents();
            }
            case 27: {
                return this.isSetSelectedComponentsInMultipleHierarchies();
            }
            case 28: {
                return this.isSetSubcomponentsInMultipleHierarchies();
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
        result.append(" (acceptedSuspendedChanges: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", cancelled: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", changeSetsAlreadyInHistory: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append((this.ALL_FLAGS & 0x10) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", eclipseReadFailureMessage: ");
        result.append(this.eclipseReadFailureMessage);
        result.append(')');
        return result.toString();
    }
}
