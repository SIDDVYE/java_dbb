// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaFactory;
import com.ibm.team.filesystem.common.internal.rest.client.share.MultipleSandboxShareDTO;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareOverlapDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ShareResultDTOImpl extends EObjectImpl implements ShareResultDTO
{
    protected int ALL_FLAGS;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 1;
    protected static final int CANCELLED_ESETFLAG = 2;
    protected EList changeSetsCommitted;
    protected CommitDilemmaDTO commitDilemma;
    protected static final int COMMIT_DILEMMA_ESETFLAG = 4;
    protected EList multipleSandboxShares;
    protected SandboxUpdateDilemmaDTO sandboxUpdateDilemma;
    protected static final int SANDBOX_UPDATE_DILEMMA_ESETFLAG = 8;
    protected EList shareOverlaps;
    
    protected ShareResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsharePackage.Literals.SHARE_RESULT_DTO;
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
    
    public List getChangeSetsCommitted() {
        if (this.changeSetsCommitted == null) {
            this.changeSetsCommitted = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 1);
        }
        return (List)this.changeSetsCommitted;
    }
    
    public void unsetChangeSetsCommitted() {
        if (this.changeSetsCommitted != null) {
            ((InternalEList.Unsettable)this.changeSetsCommitted).unset();
        }
    }
    
    public boolean isSetChangeSetsCommitted() {
        return this.changeSetsCommitted != null && ((InternalEList.Unsettable)this.changeSetsCommitted).isSet();
    }
    
    public List getShareOverlaps() {
        if (this.shareOverlaps == null) {
            this.shareOverlaps = (EList)new EObjectContainmentEList.Unsettable((Class)ShareOverlapDTO.class, (InternalEObject)this, 5);
        }
        return (List)this.shareOverlaps;
    }
    
    public void unsetShareOverlaps() {
        if (this.shareOverlaps != null) {
            ((InternalEList.Unsettable)this.shareOverlaps).unset();
        }
    }
    
    public boolean isSetShareOverlaps() {
        return this.shareOverlaps != null && ((InternalEList.Unsettable)this.shareOverlaps).isSet();
    }
    
    public List getMultipleSandboxShares() {
        if (this.multipleSandboxShares == null) {
            this.multipleSandboxShares = (EList)new EObjectContainmentEList.Unsettable((Class)MultipleSandboxShareDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.multipleSandboxShares;
    }
    
    public void unsetMultipleSandboxShares() {
        if (this.multipleSandboxShares != null) {
            ((InternalEList.Unsettable)this.multipleSandboxShares).unset();
        }
    }
    
    public boolean isSetMultipleSandboxShares() {
        return this.multipleSandboxShares != null && ((InternalEList.Unsettable)this.multipleSandboxShares).isSet();
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
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 2: {
                return this.basicUnsetCommitDilemma(msgs);
            }
            case 3: {
                return ((InternalEList)this.getMultipleSandboxShares()).basicRemove((Object)otherEnd, msgs);
            }
            case 4: {
                return this.basicUnsetSandboxUpdateDilemma(msgs);
            }
            case 5: {
                return ((InternalEList)this.getShareOverlaps()).basicRemove((Object)otherEnd, msgs);
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
                return this.getChangeSetsCommitted();
            }
            case 2: {
                return this.getCommitDilemma();
            }
            case 3: {
                return this.getMultipleSandboxShares();
            }
            case 4: {
                return this.getSandboxUpdateDilemma();
            }
            case 5: {
                return this.getShareOverlaps();
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
                this.getChangeSetsCommitted().clear();
                this.getChangeSetsCommitted().addAll((Collection)newValue);
            }
            case 2: {
                this.setCommitDilemma((CommitDilemmaDTO)newValue);
            }
            case 3: {
                this.getMultipleSandboxShares().clear();
                this.getMultipleSandboxShares().addAll((Collection)newValue);
            }
            case 4: {
                this.setSandboxUpdateDilemma((SandboxUpdateDilemmaDTO)newValue);
            }
            case 5: {
                this.getShareOverlaps().clear();
                this.getShareOverlaps().addAll((Collection)newValue);
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
                this.unsetChangeSetsCommitted();
            }
            case 2: {
                this.unsetCommitDilemma();
            }
            case 3: {
                this.unsetMultipleSandboxShares();
            }
            case 4: {
                this.unsetSandboxUpdateDilemma();
            }
            case 5: {
                this.unsetShareOverlaps();
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
                return this.isSetChangeSetsCommitted();
            }
            case 2: {
                return this.isSetCommitDilemma();
            }
            case 3: {
                return this.isSetMultipleSandboxShares();
            }
            case 4: {
                return this.isSetSandboxUpdateDilemma();
            }
            case 5: {
                return this.isSetShareOverlaps();
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
        result.append(", changeSetsCommitted: ");
        result.append(this.changeSetsCommitted);
        result.append(')');
        return result.toString();
    }
}
