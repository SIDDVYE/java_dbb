// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaFactory;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.StatusDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LoadResultDTOImpl extends EObjectImpl implements LoadResultDTO
{
    protected int ALL_FLAGS;
    protected SandboxUpdateDilemmaDTO sandboxUpdateDilemma;
    protected static final int SANDBOX_UPDATE_DILEMMA_ESETFLAG = 1;
    protected EList loadRuleProblems;
    protected EList eclipseReadFailureMessage;
    
    protected LoadResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOloadPackage.Literals.LOAD_RESULT_DTO;
    }
    
    public List getLoadRuleProblems() {
        if (this.loadRuleProblems == null) {
            this.loadRuleProblems = (EList)new EObjectContainmentEList.Unsettable((Class)StatusDTO.class, (InternalEObject)this, 1);
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
    
    public List getEclipseReadFailureMessage() {
        if (this.eclipseReadFailureMessage == null) {
            this.eclipseReadFailureMessage = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 2);
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
    
    public SandboxUpdateDilemmaDTO getSandboxUpdateDilemma() {
        if (this.sandboxUpdateDilemma == null) {
            this.setSandboxUpdateDilemma(FilesystemRestClientDTOdilemmaFactory.eINSTANCE.createSandboxUpdateDilemmaDTO());
        }
        return this.sandboxUpdateDilemma;
    }
    
    public NotificationChain basicSetSandboxUpdateDilemma(final SandboxUpdateDilemmaDTO newSandboxUpdateDilemma, NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = newSandboxUpdateDilemma;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet);
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
                msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newSandboxUpdateDilemma != null) {
                msgs = ((InternalEObject)newSandboxUpdateDilemma).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetSandboxUpdateDilemma(newSandboxUpdateDilemma, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newSandboxUpdateDilemma, (Object)newSandboxUpdateDilemma, !oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public NotificationChain basicUnsetSandboxUpdateDilemma(NotificationChain msgs) {
        final SandboxUpdateDilemmaDTO oldSandboxUpdateDilemma = this.sandboxUpdateDilemma;
        this.sandboxUpdateDilemma = null;
        final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldSandboxUpdateDilemma, (Object)null, oldSandboxUpdateDilemmaESet);
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
            msgs = ((InternalEObject)this.sandboxUpdateDilemma).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetSandboxUpdateDilemma(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldSandboxUpdateDilemmaESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldSandboxUpdateDilemmaESet));
            }
        }
    }
    
    public boolean isSetSandboxUpdateDilemma() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetSandboxUpdateDilemma(msgs);
            }
            case 1: {
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
                return this.getSandboxUpdateDilemma();
            }
            case 1: {
                return this.getLoadRuleProblems();
            }
            case 2: {
                return this.getEclipseReadFailureMessage();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setSandboxUpdateDilemma((SandboxUpdateDilemmaDTO)newValue);
            }
            case 1: {
                this.getLoadRuleProblems().clear();
                this.getLoadRuleProblems().addAll((Collection)newValue);
            }
            case 2: {
                this.getEclipseReadFailureMessage().clear();
                this.getEclipseReadFailureMessage().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetSandboxUpdateDilemma();
            }
            case 1: {
                this.unsetLoadRuleProblems();
            }
            case 2: {
                this.unsetEclipseReadFailureMessage();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetSandboxUpdateDilemma();
            }
            case 1: {
                return this.isSetLoadRuleProblems();
            }
            case 2: {
                return this.isSetEclipseReadFailureMessage();
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
        result.append(" (eclipseReadFailureMessage: ");
        result.append(this.eclipseReadFailureMessage);
        result.append(')');
        return result.toString();
    }
}
