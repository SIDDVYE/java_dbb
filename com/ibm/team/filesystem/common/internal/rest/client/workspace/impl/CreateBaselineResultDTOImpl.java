// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.impl;

import java.util.Collection;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.ProblemChangeSetsDTO;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaFactory;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChangesDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.CreateBaselineResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CreateBaselineResultDTOImpl extends EObjectImpl implements CreateBaselineResultDTO
{
    protected int ALL_FLAGS;
    protected EList baselines;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 1;
    protected static final int CANCELLED_ESETFLAG = 2;
    protected CommitDilemmaDTO commitDilemma;
    protected static final int COMMIT_DILEMMA_ESETFLAG = 4;
    protected EList configurationsWithConflicts;
    protected EList configurationsWithUncheckedInChanges;
    protected EList outOfSyncShares;
    protected SandboxUpdateDilemmaDTO sandboxUpdateDilemma;
    protected static final int SANDBOX_UPDATE_DILEMMA_ESETFLAG = 8;
    protected UpdateDilemmaDTO updateDilemma;
    protected static final int UPDATE_DILEMMA_ESETFLAG = 16;
    protected EList activeChangeSetsInSubcomponents;
    protected EList inaccessibleConfigurationsInSubcomponents;
    protected EList notFoundConfigurationsInSubcomponents;
    protected EList configurationsWithUncheckedInChangesInSubcomponents;
    protected EList configurationsWithConflictsInSubcomponents;
    
    protected CreateBaselineResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOworkspacePackage.Literals.CREATE_BASELINE_RESULT_DTO;
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
            this.outOfSyncShares = (EList)new EObjectContainmentEList.Unsettable((Class)ShareDTO.class, (InternalEObject)this, 5);
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
            this.configurationsWithUncheckedInChanges = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationWithUncheckedInChangesDTO.class, (InternalEObject)this, 4);
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
    
    public List getConfigurationsWithUncheckedInChangesInSubcomponents() {
        if (this.configurationsWithUncheckedInChangesInSubcomponents == null) {
            this.configurationsWithUncheckedInChangesInSubcomponents = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationWithUncheckedInChangesDTO.class, (InternalEObject)this, 11);
        }
        return (List)this.configurationsWithUncheckedInChangesInSubcomponents;
    }
    
    public void unsetConfigurationsWithUncheckedInChangesInSubcomponents() {
        if (this.configurationsWithUncheckedInChangesInSubcomponents != null) {
            ((InternalEList.Unsettable)this.configurationsWithUncheckedInChangesInSubcomponents).unset();
        }
    }
    
    public boolean isSetConfigurationsWithUncheckedInChangesInSubcomponents() {
        return this.configurationsWithUncheckedInChangesInSubcomponents != null && ((InternalEList.Unsettable)this.configurationsWithUncheckedInChangesInSubcomponents).isSet();
    }
    
    public List getConfigurationsWithConflicts() {
        if (this.configurationsWithConflicts == null) {
            this.configurationsWithConflicts = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationDescriptorDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.configurationsWithConflicts;
    }
    
    public void unsetConfigurationsWithConflicts() {
        if (this.configurationsWithConflicts != null) {
            ((InternalEList.Unsettable)this.configurationsWithConflicts).unset();
        }
    }
    
    public boolean isSetConfigurationsWithConflicts() {
        return this.configurationsWithConflicts != null && ((InternalEList.Unsettable)this.configurationsWithConflicts).isSet();
    }
    
    public List getConfigurationsWithConflictsInSubcomponents() {
        if (this.configurationsWithConflictsInSubcomponents == null) {
            this.configurationsWithConflictsInSubcomponents = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationDescriptorDTO.class, (InternalEObject)this, 12);
        }
        return (List)this.configurationsWithConflictsInSubcomponents;
    }
    
    public void unsetConfigurationsWithConflictsInSubcomponents() {
        if (this.configurationsWithConflictsInSubcomponents != null) {
            ((InternalEList.Unsettable)this.configurationsWithConflictsInSubcomponents).unset();
        }
    }
    
    public boolean isSetConfigurationsWithConflictsInSubcomponents() {
        return this.configurationsWithConflictsInSubcomponents != null && ((InternalEList.Unsettable)this.configurationsWithConflictsInSubcomponents).isSet();
    }
    
    public List getBaselines() {
        if (this.baselines == null) {
            this.baselines = (EList)new EObjectContainmentEList.Unsettable((Class)BaselineDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.baselines;
    }
    
    public void unsetBaselines() {
        if (this.baselines != null) {
            ((InternalEList.Unsettable)this.baselines).unset();
        }
    }
    
    public boolean isSetBaselines() {
        return this.baselines != null && ((InternalEList.Unsettable)this.baselines).isSet();
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
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet);
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
                msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -7, (Class)null, msgs);
            }
            if (newSandboxUpdateDilemma != null) {
                msgs = ((InternalEObject)newSandboxUpdateDilemma).eInverseAdd((InternalEObject)this, -7, (Class)null, msgs);
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
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)newSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetSandboxUpdateDilemma(NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = null;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldSandboxUpdateDilemma, (Object)null, oldSandboxUpdateDilemmaESet);
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
            msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -7, (Class)null, msgs);
            msgs = this.basicUnsetSandboxUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x8) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFF7;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)null, (Object)null, oldSandboxUpdateDilemmaESet));
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
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet);
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
                msgs = ((InternalEObject)this.updateDilemma).eInverseRemove((InternalEObject)this, -8, (Class)null, msgs);
            }
            if (newUpdateDilemma != null) {
                msgs = ((InternalEObject)newUpdateDilemma).eInverseAdd((InternalEObject)this, -8, (Class)null, msgs);
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
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)newUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetUpdateDilemma(NotificationChain msgs) {
        final UpdateDilemmaDTO oldUpdateDilemma = this.updateDilemma;
        this.updateDilemma = null;
        final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldUpdateDilemma, (Object)null, oldUpdateDilemmaESet);
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
            msgs = ((InternalEObject)this.updateDilemma).eInverseRemove((InternalEObject)this, -8, (Class)null, msgs);
            msgs = this.basicUnsetUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFEF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)null, (Object)null, oldUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetUpdateDilemma() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public List getActiveChangeSetsInSubcomponents() {
        if (this.activeChangeSetsInSubcomponents == null) {
            this.activeChangeSetsInSubcomponents = (EList)new EObjectContainmentEList.Unsettable((Class)ProblemChangeSetsDTO.class, (InternalEObject)this, 8);
        }
        return (List)this.activeChangeSetsInSubcomponents;
    }
    
    public void unsetActiveChangeSetsInSubcomponents() {
        if (this.activeChangeSetsInSubcomponents != null) {
            ((InternalEList.Unsettable)this.activeChangeSetsInSubcomponents).unset();
        }
    }
    
    public boolean isSetActiveChangeSetsInSubcomponents() {
        return this.activeChangeSetsInSubcomponents != null && ((InternalEList.Unsettable)this.activeChangeSetsInSubcomponents).isSet();
    }
    
    public List getInaccessibleConfigurationsInSubcomponents() {
        if (this.inaccessibleConfigurationsInSubcomponents == null) {
            this.inaccessibleConfigurationsInSubcomponents = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationDescriptorDTO.class, (InternalEObject)this, 9);
        }
        return (List)this.inaccessibleConfigurationsInSubcomponents;
    }
    
    public void unsetInaccessibleConfigurationsInSubcomponents() {
        if (this.inaccessibleConfigurationsInSubcomponents != null) {
            ((InternalEList.Unsettable)this.inaccessibleConfigurationsInSubcomponents).unset();
        }
    }
    
    public boolean isSetInaccessibleConfigurationsInSubcomponents() {
        return this.inaccessibleConfigurationsInSubcomponents != null && ((InternalEList.Unsettable)this.inaccessibleConfigurationsInSubcomponents).isSet();
    }
    
    public List getNotFoundConfigurationsInSubcomponents() {
        if (this.notFoundConfigurationsInSubcomponents == null) {
            this.notFoundConfigurationsInSubcomponents = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationDescriptorDTO.class, (InternalEObject)this, 10);
        }
        return (List)this.notFoundConfigurationsInSubcomponents;
    }
    
    public void unsetNotFoundConfigurationsInSubcomponents() {
        if (this.notFoundConfigurationsInSubcomponents != null) {
            ((InternalEList.Unsettable)this.notFoundConfigurationsInSubcomponents).unset();
        }
    }
    
    public boolean isSetNotFoundConfigurationsInSubcomponents() {
        return this.notFoundConfigurationsInSubcomponents != null && ((InternalEList.Unsettable)this.notFoundConfigurationsInSubcomponents).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getBaselines()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return this.basicUnsetCommitDilemma(msgs);
            }
            case 3: {
                return ((InternalEList)this.getConfigurationsWithConflicts()).basicRemove((Object)otherEnd, msgs);
            }
            case 4: {
                return ((InternalEList)this.getConfigurationsWithUncheckedInChanges()).basicRemove((Object)otherEnd, msgs);
            }
            case 5: {
                return ((InternalEList)this.getOutOfSyncShares()).basicRemove((Object)otherEnd, msgs);
            }
            case 6: {
                return this.basicUnsetSandboxUpdateDilemma(msgs);
            }
            case 7: {
                return this.basicUnsetUpdateDilemma(msgs);
            }
            case 8: {
                return ((InternalEList)this.getActiveChangeSetsInSubcomponents()).basicRemove((Object)otherEnd, msgs);
            }
            case 9: {
                return ((InternalEList)this.getInaccessibleConfigurationsInSubcomponents()).basicRemove((Object)otherEnd, msgs);
            }
            case 10: {
                return ((InternalEList)this.getNotFoundConfigurationsInSubcomponents()).basicRemove((Object)otherEnd, msgs);
            }
            case 11: {
                return ((InternalEList)this.getConfigurationsWithUncheckedInChangesInSubcomponents()).basicRemove((Object)otherEnd, msgs);
            }
            case 12: {
                return ((InternalEList)this.getConfigurationsWithConflictsInSubcomponents()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getBaselines();
            }
            case 1: {
                return this.isCancelled() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return this.getCommitDilemma();
            }
            case 3: {
                return this.getConfigurationsWithConflicts();
            }
            case 4: {
                return this.getConfigurationsWithUncheckedInChanges();
            }
            case 5: {
                return this.getOutOfSyncShares();
            }
            case 6: {
                return this.getSandboxUpdateDilemma();
            }
            case 7: {
                return this.getUpdateDilemma();
            }
            case 8: {
                return this.getActiveChangeSetsInSubcomponents();
            }
            case 9: {
                return this.getInaccessibleConfigurationsInSubcomponents();
            }
            case 10: {
                return this.getNotFoundConfigurationsInSubcomponents();
            }
            case 11: {
                return this.getConfigurationsWithUncheckedInChangesInSubcomponents();
            }
            case 12: {
                return this.getConfigurationsWithConflictsInSubcomponents();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getBaselines().clear();
                this.getBaselines().addAll((Collection)newValue);
            }
            case 1: {
                this.setCancelled((boolean)newValue);
            }
            case 2: {
                this.setCommitDilemma((CommitDilemmaDTO)newValue);
            }
            case 3: {
                this.getConfigurationsWithConflicts().clear();
                this.getConfigurationsWithConflicts().addAll((Collection)newValue);
            }
            case 4: {
                this.getConfigurationsWithUncheckedInChanges().clear();
                this.getConfigurationsWithUncheckedInChanges().addAll((Collection)newValue);
            }
            case 5: {
                this.getOutOfSyncShares().clear();
                this.getOutOfSyncShares().addAll((Collection)newValue);
            }
            case 6: {
                this.setSandboxUpdateDilemma((SandboxUpdateDilemmaDTO)newValue);
            }
            case 7: {
                this.setUpdateDilemma((UpdateDilemmaDTO)newValue);
            }
            case 8: {
                this.getActiveChangeSetsInSubcomponents().clear();
                this.getActiveChangeSetsInSubcomponents().addAll((Collection)newValue);
            }
            case 9: {
                this.getInaccessibleConfigurationsInSubcomponents().clear();
                this.getInaccessibleConfigurationsInSubcomponents().addAll((Collection)newValue);
            }
            case 10: {
                this.getNotFoundConfigurationsInSubcomponents().clear();
                this.getNotFoundConfigurationsInSubcomponents().addAll((Collection)newValue);
            }
            case 11: {
                this.getConfigurationsWithUncheckedInChangesInSubcomponents().clear();
                this.getConfigurationsWithUncheckedInChangesInSubcomponents().addAll((Collection)newValue);
            }
            case 12: {
                this.getConfigurationsWithConflictsInSubcomponents().clear();
                this.getConfigurationsWithConflictsInSubcomponents().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBaselines();
            }
            case 1: {
                this.unsetCancelled();
            }
            case 2: {
                this.unsetCommitDilemma();
            }
            case 3: {
                this.unsetConfigurationsWithConflicts();
            }
            case 4: {
                this.unsetConfigurationsWithUncheckedInChanges();
            }
            case 5: {
                this.unsetOutOfSyncShares();
            }
            case 6: {
                this.unsetSandboxUpdateDilemma();
            }
            case 7: {
                this.unsetUpdateDilemma();
            }
            case 8: {
                this.unsetActiveChangeSetsInSubcomponents();
            }
            case 9: {
                this.unsetInaccessibleConfigurationsInSubcomponents();
            }
            case 10: {
                this.unsetNotFoundConfigurationsInSubcomponents();
            }
            case 11: {
                this.unsetConfigurationsWithUncheckedInChangesInSubcomponents();
            }
            case 12: {
                this.unsetConfigurationsWithConflictsInSubcomponents();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBaselines();
            }
            case 1: {
                return this.isSetCancelled();
            }
            case 2: {
                return this.isSetCommitDilemma();
            }
            case 3: {
                return this.isSetConfigurationsWithConflicts();
            }
            case 4: {
                return this.isSetConfigurationsWithUncheckedInChanges();
            }
            case 5: {
                return this.isSetOutOfSyncShares();
            }
            case 6: {
                return this.isSetSandboxUpdateDilemma();
            }
            case 7: {
                return this.isSetUpdateDilemma();
            }
            case 8: {
                return this.isSetActiveChangeSetsInSubcomponents();
            }
            case 9: {
                return this.isSetInaccessibleConfigurationsInSubcomponents();
            }
            case 10: {
                return this.isSetNotFoundConfigurationsInSubcomponents();
            }
            case 11: {
                return this.isSetConfigurationsWithUncheckedInChangesInSubcomponents();
            }
            case 12: {
                return this.isSetConfigurationsWithConflictsInSubcomponents();
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
