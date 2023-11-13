// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.SymlinkWarningDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.EncodingErrorDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.resource.LineDelimiterErrorDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CommitDilemmaDTOImpl extends EObjectImpl implements CommitDilemmaDTO
{
    protected int ALL_FLAGS;
    protected EList brokenLinks;
    protected EList encodingFailures;
    protected EList lineDelimiterFailures;
    protected EList nonInteroperableLinks;
    protected EList predecessorDeletedShareables;
    protected EList nonPatchShareables;
    
    protected CommitDilemmaDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOdilemmaPackage.Literals.COMMIT_DILEMMA_DTO;
    }
    
    public List getLineDelimiterFailures() {
        if (this.lineDelimiterFailures == null) {
            this.lineDelimiterFailures = (EList)new EObjectContainmentEList.Unsettable((Class)LineDelimiterErrorDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.lineDelimiterFailures;
    }
    
    public void unsetLineDelimiterFailures() {
        if (this.lineDelimiterFailures != null) {
            ((InternalEList.Unsettable)this.lineDelimiterFailures).unset();
        }
    }
    
    public boolean isSetLineDelimiterFailures() {
        return this.lineDelimiterFailures != null && ((InternalEList.Unsettable)this.lineDelimiterFailures).isSet();
    }
    
    public List getEncodingFailures() {
        if (this.encodingFailures == null) {
            this.encodingFailures = (EList)new EObjectContainmentEList.Unsettable((Class)EncodingErrorDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.encodingFailures;
    }
    
    public void unsetEncodingFailures() {
        if (this.encodingFailures != null) {
            ((InternalEList.Unsettable)this.encodingFailures).unset();
        }
    }
    
    public boolean isSetEncodingFailures() {
        return this.encodingFailures != null && ((InternalEList.Unsettable)this.encodingFailures).isSet();
    }
    
    public List getBrokenLinks() {
        if (this.brokenLinks == null) {
            this.brokenLinks = (EList)new EObjectContainmentEList.Unsettable((Class)SymlinkWarningDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.brokenLinks;
    }
    
    public void unsetBrokenLinks() {
        if (this.brokenLinks != null) {
            ((InternalEList.Unsettable)this.brokenLinks).unset();
        }
    }
    
    public boolean isSetBrokenLinks() {
        return this.brokenLinks != null && ((InternalEList.Unsettable)this.brokenLinks).isSet();
    }
    
    public List getNonInteroperableLinks() {
        if (this.nonInteroperableLinks == null) {
            this.nonInteroperableLinks = (EList)new EObjectContainmentEList.Unsettable((Class)SymlinkWarningDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.nonInteroperableLinks;
    }
    
    public void unsetNonInteroperableLinks() {
        if (this.nonInteroperableLinks != null) {
            ((InternalEList.Unsettable)this.nonInteroperableLinks).unset();
        }
    }
    
    public boolean isSetNonInteroperableLinks() {
        return this.nonInteroperableLinks != null && ((InternalEList.Unsettable)this.nonInteroperableLinks).isSet();
    }
    
    public List getPredecessorDeletedShareables() {
        if (this.predecessorDeletedShareables == null) {
            this.predecessorDeletedShareables = (EList)new EObjectContainmentEList.Unsettable((Class)ShareableDTO.class, (InternalEObject)this, 4);
        }
        return (List)this.predecessorDeletedShareables;
    }
    
    public void unsetPredecessorDeletedShareables() {
        if (this.predecessorDeletedShareables != null) {
            ((InternalEList.Unsettable)this.predecessorDeletedShareables).unset();
        }
    }
    
    public boolean isSetPredecessorDeletedShareables() {
        return this.predecessorDeletedShareables != null && ((InternalEList.Unsettable)this.predecessorDeletedShareables).isSet();
    }
    
    public List getNonPatchShareables() {
        if (this.nonPatchShareables == null) {
            this.nonPatchShareables = (EList)new EObjectContainmentEList.Unsettable((Class)ShareableDTO.class, (InternalEObject)this, 5);
        }
        return (List)this.nonPatchShareables;
    }
    
    public void unsetNonPatchShareables() {
        if (this.nonPatchShareables != null) {
            ((InternalEList.Unsettable)this.nonPatchShareables).unset();
        }
    }
    
    public boolean isSetNonPatchShareables() {
        return this.nonPatchShareables != null && ((InternalEList.Unsettable)this.nonPatchShareables).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getBrokenLinks()).basicRemove((Object)otherEnd, msgs);
            }
            case 1: {
                return ((InternalEList)this.getEncodingFailures()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return ((InternalEList)this.getLineDelimiterFailures()).basicRemove((Object)otherEnd, msgs);
            }
            case 3: {
                return ((InternalEList)this.getNonInteroperableLinks()).basicRemove((Object)otherEnd, msgs);
            }
            case 4: {
                return ((InternalEList)this.getPredecessorDeletedShareables()).basicRemove((Object)otherEnd, msgs);
            }
            case 5: {
                return ((InternalEList)this.getNonPatchShareables()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getBrokenLinks();
            }
            case 1: {
                return this.getEncodingFailures();
            }
            case 2: {
                return this.getLineDelimiterFailures();
            }
            case 3: {
                return this.getNonInteroperableLinks();
            }
            case 4: {
                return this.getPredecessorDeletedShareables();
            }
            case 5: {
                return this.getNonPatchShareables();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getBrokenLinks().clear();
                this.getBrokenLinks().addAll((Collection)newValue);
            }
            case 1: {
                this.getEncodingFailures().clear();
                this.getEncodingFailures().addAll((Collection)newValue);
            }
            case 2: {
                this.getLineDelimiterFailures().clear();
                this.getLineDelimiterFailures().addAll((Collection)newValue);
            }
            case 3: {
                this.getNonInteroperableLinks().clear();
                this.getNonInteroperableLinks().addAll((Collection)newValue);
            }
            case 4: {
                this.getPredecessorDeletedShareables().clear();
                this.getPredecessorDeletedShareables().addAll((Collection)newValue);
            }
            case 5: {
                this.getNonPatchShareables().clear();
                this.getNonPatchShareables().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetBrokenLinks();
            }
            case 1: {
                this.unsetEncodingFailures();
            }
            case 2: {
                this.unsetLineDelimiterFailures();
            }
            case 3: {
                this.unsetNonInteroperableLinks();
            }
            case 4: {
                this.unsetPredecessorDeletedShareables();
            }
            case 5: {
                this.unsetNonPatchShareables();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetBrokenLinks();
            }
            case 1: {
                return this.isSetEncodingFailures();
            }
            case 2: {
                return this.isSetLineDelimiterFailures();
            }
            case 3: {
                return this.isSetNonInteroperableLinks();
            }
            case 4: {
                return this.isSetPredecessorDeletedShareables();
            }
            case 5: {
                return this.isSetNonPatchShareables();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
