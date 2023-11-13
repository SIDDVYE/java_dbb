// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.core.ComponentDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaFactory;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.ConfigurationWithUncheckedInChangesDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.ComponentHierarchyUpdateResultDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceDetailsDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.PutWorkspaceResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class PutWorkspaceResultDTOImpl extends EObjectImpl implements PutWorkspaceResultDTO
{
    protected int ALL_FLAGS;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 1;
    protected static final int CANCELLED_ESETFLAG = 2;
    protected WorkspaceDetailsDTO workspace;
    protected static final int WORKSPACE_ESETFLAG = 4;
    protected EList outOfSyncShares;
    protected EList configurationsWithUncheckedInChanges;
    protected EList componentsAdded;
    protected EList componentsCreated;
    protected ComponentHierarchyUpdateResultDTO componentHierarchyUpdateResult;
    protected static final int COMPONENT_HIERARCHY_UPDATE_RESULT_ESETFLAG = 8;
    protected SandboxUpdateDilemmaDTO sandboxUpdateDilemma;
    protected static final int SANDBOX_UPDATE_DILEMMA_ESETFLAG = 16;
    protected CommitDilemmaDTO commitDilemma;
    protected static final int COMMIT_DILEMMA_ESETFLAG = 32;
    protected UpdateDilemmaDTO updateDilemma;
    protected static final int UPDATE_DILEMMA_ESETFLAG = 64;
    protected EList noBackupBaselinesComponents;
    protected EList selectedComponentsWithMultipleParticipants;
    protected EList subcomponentsWithMultipleParticipants;
    protected EList componentsRemoved;
    
    protected PutWorkspaceResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOworkspacePackage.Literals.PUT_WORKSPACE_RESULT_DTO;
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
    
    public WorkspaceDetailsDTO getWorkspace() {
        return this.workspace;
    }
    
    public NotificationChain basicSetWorkspace(final WorkspaceDetailsDTO newWorkspace, NotificationChain msgs) {
        final WorkspaceDetailsDTO oldWorkspace = this.workspace;
        this.workspace = newWorkspace;
        final boolean oldWorkspaceESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldWorkspace, (Object)newWorkspace, !oldWorkspaceESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setWorkspace(final WorkspaceDetailsDTO newWorkspace) {
        if (newWorkspace != this.workspace) {
            NotificationChain msgs = null;
            if (this.workspace != null) {
                msgs = ((InternalEObject)this.workspace).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            }
            if (newWorkspace != null) {
                msgs = ((InternalEObject)newWorkspace).eInverseAdd((InternalEObject)this, -2, (Class)null, msgs);
            }
            msgs = this.basicSetWorkspace(newWorkspace, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldWorkspaceESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS |= 0x4;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)newWorkspace, (Object)newWorkspace, !oldWorkspaceESet));
            }
        }
    }
    
    public NotificationChain basicUnsetWorkspace(NotificationChain msgs) {
        final WorkspaceDetailsDTO oldWorkspace = this.workspace;
        this.workspace = null;
        final boolean oldWorkspaceESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldWorkspace, (Object)null, oldWorkspaceESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetWorkspace() {
        if (this.workspace != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.workspace).eInverseRemove((InternalEObject)this, -2, (Class)null, msgs);
            msgs = this.basicUnsetWorkspace(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldWorkspaceESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFB;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)null, (Object)null, oldWorkspaceESet));
            }
        }
    }
    
    public boolean isSetWorkspace() {
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
    
    public List getComponentsAdded() {
        if (this.componentsAdded == null) {
            this.componentsAdded = (EList)new EObjectContainmentEList.Unsettable((Class)ConfigurationDescriptorDTO.class, (InternalEObject)this, 4);
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
    
    public SandboxUpdateDilemmaDTO getSandboxUpdateDilemma() {
        if (this.sandboxUpdateDilemma == null) {
            this.setSandboxUpdateDilemma(FilesystemRestClientDTOdilemmaFactory.eINSTANCE.createSandboxUpdateDilemmaDTO());
        }
        return this.sandboxUpdateDilemma;
    }
    
    public NotificationChain basicSetSandboxUpdateDilemma(final SandboxUpdateDilemmaDTO newSandboxUpdateDilemma, NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = newSandboxUpdateDilemma;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet);
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
                msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -8, (Class)null, msgs);
            }
            if (newSandboxUpdateDilemma != null) {
                msgs = ((InternalEObject)newSandboxUpdateDilemma).eInverseAdd((InternalEObject)this, -8, (Class)null, msgs);
            }
            msgs = this.basicSetSandboxUpdateDilemma(newSandboxUpdateDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
            this.ALL_FLAGS |= 0x10;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)newSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetSandboxUpdateDilemma(NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = null;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldSandboxUpdateDilemma, (Object)null, oldSandboxUpdateDilemmaESet);
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
            msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -8, (Class)null, msgs);
            msgs = this.basicUnsetSandboxUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x10) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFEF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)null, (Object)null, oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetSandboxUpdateDilemma() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
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
        final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 8, (Object)oldCommitDilemma, (Object)newCommitDilemma, !oldCommitDilemmaESet);
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
                msgs = ((InternalEObject)this.commitDilemma).eInverseRemove((InternalEObject)this, -9, (Class)null, msgs);
            }
            if (newCommitDilemma != null) {
                msgs = ((InternalEObject)newCommitDilemma).eInverseAdd((InternalEObject)this, -9, (Class)null, msgs);
            }
            msgs = this.basicSetCommitDilemma(newCommitDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x20) != 0x0;
            this.ALL_FLAGS |= 0x20;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 8, (Object)newCommitDilemma, (Object)newCommitDilemma, !oldCommitDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetCommitDilemma(NotificationChain msgs) {
        final CommitDilemmaDTO oldCommitDilemma = this.commitDilemma;
        this.commitDilemma = null;
        final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 8, (Object)oldCommitDilemma, (Object)null, oldCommitDilemmaESet);
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
            msgs = ((InternalEObject)this.commitDilemma).eInverseRemove((InternalEObject)this, -9, (Class)null, msgs);
            msgs = this.basicUnsetCommitDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCommitDilemmaESet = (this.ALL_FLAGS & 0x20) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFDF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 8, (Object)null, (Object)null, oldCommitDilemmaESet));
            }
        }
    }
    
    public boolean isSetCommitDilemma() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
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
        final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 9, (Object)oldUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet);
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
                msgs = ((InternalEObject)this.updateDilemma).eInverseRemove((InternalEObject)this, -10, (Class)null, msgs);
            }
            if (newUpdateDilemma != null) {
                msgs = ((InternalEObject)newUpdateDilemma).eInverseAdd((InternalEObject)this, -10, (Class)null, msgs);
            }
            msgs = this.basicSetUpdateDilemma(newUpdateDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x40) != 0x0;
            this.ALL_FLAGS |= 0x40;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 9, (Object)newUpdateDilemma, (Object)newUpdateDilemma, !oldUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetUpdateDilemma(NotificationChain msgs) {
        final UpdateDilemmaDTO oldUpdateDilemma = this.updateDilemma;
        this.updateDilemma = null;
        final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 9, (Object)oldUpdateDilemma, (Object)null, oldUpdateDilemmaESet);
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
            msgs = ((InternalEObject)this.updateDilemma).eInverseRemove((InternalEObject)this, -10, (Class)null, msgs);
            msgs = this.basicUnsetUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdateDilemmaESet = (this.ALL_FLAGS & 0x40) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFBF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 9, (Object)null, (Object)null, oldUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetUpdateDilemma() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public List getNoBackupBaselinesComponents() {
        if (this.noBackupBaselinesComponents == null) {
            this.noBackupBaselinesComponents = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentDTO.class, (InternalEObject)this, 10);
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
    
    public List getSelectedComponentsWithMultipleParticipants() {
        if (this.selectedComponentsWithMultipleParticipants == null) {
            this.selectedComponentsWithMultipleParticipants = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentDTO.class, (InternalEObject)this, 11);
        }
        return (List)this.selectedComponentsWithMultipleParticipants;
    }
    
    public void unsetSelectedComponentsWithMultipleParticipants() {
        if (this.selectedComponentsWithMultipleParticipants != null) {
            ((InternalEList.Unsettable)this.selectedComponentsWithMultipleParticipants).unset();
        }
    }
    
    public boolean isSetSelectedComponentsWithMultipleParticipants() {
        return this.selectedComponentsWithMultipleParticipants != null && ((InternalEList.Unsettable)this.selectedComponentsWithMultipleParticipants).isSet();
    }
    
    public List getSubcomponentsWithMultipleParticipants() {
        if (this.subcomponentsWithMultipleParticipants == null) {
            this.subcomponentsWithMultipleParticipants = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentDTO.class, (InternalEObject)this, 12);
        }
        return (List)this.subcomponentsWithMultipleParticipants;
    }
    
    public void unsetSubcomponentsWithMultipleParticipants() {
        if (this.subcomponentsWithMultipleParticipants != null) {
            ((InternalEList.Unsettable)this.subcomponentsWithMultipleParticipants).unset();
        }
    }
    
    public boolean isSetSubcomponentsWithMultipleParticipants() {
        return this.subcomponentsWithMultipleParticipants != null && ((InternalEList.Unsettable)this.subcomponentsWithMultipleParticipants).isSet();
    }
    
    public List getComponentsRemoved() {
        if (this.componentsRemoved == null) {
            this.componentsRemoved = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentDTO.class, (InternalEObject)this, 13);
        }
        return (List)this.componentsRemoved;
    }
    
    public void unsetComponentsRemoved() {
        if (this.componentsRemoved != null) {
            ((InternalEList.Unsettable)this.componentsRemoved).unset();
        }
    }
    
    public boolean isSetComponentsRemoved() {
        return this.componentsRemoved != null && ((InternalEList.Unsettable)this.componentsRemoved).isSet();
    }
    
    public List getComponentsCreated() {
        if (this.componentsCreated == null) {
            this.componentsCreated = (EList)new EObjectContainmentEList.Unsettable((Class)ComponentDTO.class, (InternalEObject)this, 5);
        }
        return (List)this.componentsCreated;
    }
    
    public void unsetComponentsCreated() {
        if (this.componentsCreated != null) {
            ((InternalEList.Unsettable)this.componentsCreated).unset();
        }
    }
    
    public boolean isSetComponentsCreated() {
        return this.componentsCreated != null && ((InternalEList.Unsettable)this.componentsCreated).isSet();
    }
    
    public ComponentHierarchyUpdateResultDTO getComponentHierarchyUpdateResult() {
        if (this.componentHierarchyUpdateResult != null && ((EObject)this.componentHierarchyUpdateResult).eIsProxy()) {
            final InternalEObject oldComponentHierarchyUpdateResult = (InternalEObject)this.componentHierarchyUpdateResult;
            this.componentHierarchyUpdateResult = (ComponentHierarchyUpdateResultDTO)this.eResolveProxy(oldComponentHierarchyUpdateResult);
            if (this.componentHierarchyUpdateResult != oldComponentHierarchyUpdateResult && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 6, (Object)oldComponentHierarchyUpdateResult, (Object)this.componentHierarchyUpdateResult));
            }
        }
        return this.componentHierarchyUpdateResult;
    }
    
    public ComponentHierarchyUpdateResultDTO basicGetComponentHierarchyUpdateResult() {
        return this.componentHierarchyUpdateResult;
    }
    
    public void setComponentHierarchyUpdateResult(final ComponentHierarchyUpdateResultDTO newComponentHierarchyUpdateResult) {
        final ComponentHierarchyUpdateResultDTO oldComponentHierarchyUpdateResult = this.componentHierarchyUpdateResult;
        this.componentHierarchyUpdateResult = newComponentHierarchyUpdateResult;
        final boolean oldComponentHierarchyUpdateResultESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldComponentHierarchyUpdateResult, (Object)this.componentHierarchyUpdateResult, !oldComponentHierarchyUpdateResultESet));
        }
    }
    
    public void unsetComponentHierarchyUpdateResult() {
        final ComponentHierarchyUpdateResultDTO oldComponentHierarchyUpdateResult = this.componentHierarchyUpdateResult;
        final boolean oldComponentHierarchyUpdateResultESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.componentHierarchyUpdateResult = null;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldComponentHierarchyUpdateResult, (Object)null, oldComponentHierarchyUpdateResultESet));
        }
    }
    
    public boolean isSetComponentHierarchyUpdateResult() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return this.basicUnsetWorkspace(msgs);
            }
            case 2: {
                return ((InternalEList)this.getOutOfSyncShares()).basicRemove((Object)otherEnd, msgs);
            }
            case 3: {
                return ((InternalEList)this.getConfigurationsWithUncheckedInChanges()).basicRemove((Object)otherEnd, msgs);
            }
            case 4: {
                return ((InternalEList)this.getComponentsAdded()).basicRemove((Object)otherEnd, msgs);
            }
            case 5: {
                return ((InternalEList)this.getComponentsCreated()).basicRemove((Object)otherEnd, msgs);
            }
            case 7: {
                return this.basicUnsetSandboxUpdateDilemma(msgs);
            }
            case 8: {
                return this.basicUnsetCommitDilemma(msgs);
            }
            case 9: {
                return this.basicUnsetUpdateDilemma(msgs);
            }
            case 10: {
                return ((InternalEList)this.getNoBackupBaselinesComponents()).basicRemove((Object)otherEnd, msgs);
            }
            case 11: {
                return ((InternalEList)this.getSelectedComponentsWithMultipleParticipants()).basicRemove((Object)otherEnd, msgs);
            }
            case 12: {
                return ((InternalEList)this.getSubcomponentsWithMultipleParticipants()).basicRemove((Object)otherEnd, msgs);
            }
            case 13: {
                return ((InternalEList)this.getComponentsRemoved()).basicRemove((Object)otherEnd, msgs);
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
                return this.getWorkspace();
            }
            case 2: {
                return this.getOutOfSyncShares();
            }
            case 3: {
                return this.getConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                return this.getComponentsAdded();
            }
            case 5: {
                return this.getComponentsCreated();
            }
            case 6: {
                if (resolve) {
                    return this.getComponentHierarchyUpdateResult();
                }
                return this.basicGetComponentHierarchyUpdateResult();
            }
            case 7: {
                return this.getSandboxUpdateDilemma();
            }
            case 8: {
                return this.getCommitDilemma();
            }
            case 9: {
                return this.getUpdateDilemma();
            }
            case 10: {
                return this.getNoBackupBaselinesComponents();
            }
            case 11: {
                return this.getSelectedComponentsWithMultipleParticipants();
            }
            case 12: {
                return this.getSubcomponentsWithMultipleParticipants();
            }
            case 13: {
                return this.getComponentsRemoved();
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
                this.setWorkspace((WorkspaceDetailsDTO)newValue);
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
                this.getComponentsAdded().clear();
                this.getComponentsAdded().addAll((Collection)newValue);
            }
            case 5: {
                this.getComponentsCreated().clear();
                this.getComponentsCreated().addAll((Collection)newValue);
            }
            case 6: {
                this.setComponentHierarchyUpdateResult((ComponentHierarchyUpdateResultDTO)newValue);
            }
            case 7: {
                this.setSandboxUpdateDilemma((SandboxUpdateDilemmaDTO)newValue);
            }
            case 8: {
                this.setCommitDilemma((CommitDilemmaDTO)newValue);
            }
            case 9: {
                this.setUpdateDilemma((UpdateDilemmaDTO)newValue);
            }
            case 10: {
                this.getNoBackupBaselinesComponents().clear();
                this.getNoBackupBaselinesComponents().addAll((Collection)newValue);
            }
            case 11: {
                this.getSelectedComponentsWithMultipleParticipants().clear();
                this.getSelectedComponentsWithMultipleParticipants().addAll((Collection)newValue);
            }
            case 12: {
                this.getSubcomponentsWithMultipleParticipants().clear();
                this.getSubcomponentsWithMultipleParticipants().addAll((Collection)newValue);
            }
            case 13: {
                this.getComponentsRemoved().clear();
                this.getComponentsRemoved().addAll((Collection)newValue);
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
                this.unsetWorkspace();
            }
            case 2: {
                this.unsetOutOfSyncShares();
            }
            case 3: {
                this.unsetConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                this.unsetComponentsAdded();
            }
            case 5: {
                this.unsetComponentsCreated();
            }
            case 6: {
                this.unsetComponentHierarchyUpdateResult();
            }
            case 7: {
                this.unsetSandboxUpdateDilemma();
            }
            case 8: {
                this.unsetCommitDilemma();
            }
            case 9: {
                this.unsetUpdateDilemma();
            }
            case 10: {
                this.unsetNoBackupBaselinesComponents();
            }
            case 11: {
                this.unsetSelectedComponentsWithMultipleParticipants();
            }
            case 12: {
                this.unsetSubcomponentsWithMultipleParticipants();
            }
            case 13: {
                this.unsetComponentsRemoved();
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
                return this.isSetWorkspace();
            }
            case 2: {
                return this.isSetOutOfSyncShares();
            }
            case 3: {
                return this.isSetConfigurationsWithUncheckedInChanges();
            }
            case 4: {
                return this.isSetComponentsAdded();
            }
            case 5: {
                return this.isSetComponentsCreated();
            }
            case 6: {
                return this.isSetComponentHierarchyUpdateResult();
            }
            case 7: {
                return this.isSetSandboxUpdateDilemma();
            }
            case 8: {
                return this.isSetCommitDilemma();
            }
            case 9: {
                return this.isSetUpdateDilemma();
            }
            case 10: {
                return this.isSetNoBackupBaselinesComponents();
            }
            case 11: {
                return this.isSetSelectedComponentsWithMultipleParticipants();
            }
            case 12: {
                return this.isSetSubcomponentsWithMultipleParticipants();
            }
            case 13: {
                return this.isSetComponentsRemoved();
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
