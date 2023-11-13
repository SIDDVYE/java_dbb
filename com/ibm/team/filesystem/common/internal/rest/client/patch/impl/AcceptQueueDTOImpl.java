// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeSetSourceDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.patch.PageDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CurrentPatchDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.patch.AcceptQueueDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class AcceptQueueDTOImpl extends EObjectImpl implements AcceptQueueDTO
{
    protected int ALL_FLAGS;
    protected EList acceptQueue;
    protected CurrentPatchDTO currentPatch;
    protected static final int CURRENT_PATCH_ESETFLAG = 1;
    protected PageDescriptorDTO pageDescriptor;
    protected static final int PAGE_DESCRIPTOR_ESETFLAG = 2;
    
    protected AcceptQueueDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.ACCEPT_QUEUE_DTO;
    }
    
    public List getAcceptQueue() {
        if (this.acceptQueue == null) {
            this.acceptQueue = (EList)new EObjectContainmentEList.Unsettable((Class)ChangeSetSourceDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.acceptQueue;
    }
    
    public void unsetAcceptQueue() {
        if (this.acceptQueue != null) {
            ((InternalEList.Unsettable)this.acceptQueue).unset();
        }
    }
    
    public boolean isSetAcceptQueue() {
        return this.acceptQueue != null && ((InternalEList.Unsettable)this.acceptQueue).isSet();
    }
    
    public CurrentPatchDTO getCurrentPatch() {
        if (this.currentPatch != null && ((EObject)this.currentPatch).eIsProxy()) {
            final InternalEObject oldCurrentPatch = (InternalEObject)this.currentPatch;
            this.currentPatch = (CurrentPatchDTO)this.eResolveProxy(oldCurrentPatch);
            if (this.currentPatch != oldCurrentPatch && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 1, (Object)oldCurrentPatch, (Object)this.currentPatch));
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldCurrentPatch, (Object)this.currentPatch, !oldCurrentPatchESet));
        }
    }
    
    public void unsetCurrentPatch() {
        final CurrentPatchDTO oldCurrentPatch = this.currentPatch;
        final boolean oldCurrentPatchESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.currentPatch = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldCurrentPatch, (Object)null, oldCurrentPatchESet));
        }
    }
    
    public boolean isSetCurrentPatch() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public PageDescriptorDTO getPageDescriptor() {
        if (this.pageDescriptor != null && ((EObject)this.pageDescriptor).eIsProxy()) {
            final InternalEObject oldPageDescriptor = (InternalEObject)this.pageDescriptor;
            this.pageDescriptor = (PageDescriptorDTO)this.eResolveProxy(oldPageDescriptor);
            if (this.pageDescriptor != oldPageDescriptor && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 2, (Object)oldPageDescriptor, (Object)this.pageDescriptor));
            }
        }
        return this.pageDescriptor;
    }
    
    public PageDescriptorDTO basicGetPageDescriptor() {
        return this.pageDescriptor;
    }
    
    public void setPageDescriptor(final PageDescriptorDTO newPageDescriptor) {
        final PageDescriptorDTO oldPageDescriptor = this.pageDescriptor;
        this.pageDescriptor = newPageDescriptor;
        final boolean oldPageDescriptorESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldPageDescriptor, (Object)this.pageDescriptor, !oldPageDescriptorESet));
        }
    }
    
    public void unsetPageDescriptor() {
        final PageDescriptorDTO oldPageDescriptor = this.pageDescriptor;
        final boolean oldPageDescriptorESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.pageDescriptor = null;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldPageDescriptor, (Object)null, oldPageDescriptorESet));
        }
    }
    
    public boolean isSetPageDescriptor() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getAcceptQueue()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getAcceptQueue();
            }
            case 1: {
                if (resolve) {
                    return this.getCurrentPatch();
                }
                return this.basicGetCurrentPatch();
            }
            case 2: {
                if (resolve) {
                    return this.getPageDescriptor();
                }
                return this.basicGetPageDescriptor();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getAcceptQueue().clear();
                this.getAcceptQueue().addAll((Collection)newValue);
            }
            case 1: {
                this.setCurrentPatch((CurrentPatchDTO)newValue);
            }
            case 2: {
                this.setPageDescriptor((PageDescriptorDTO)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetAcceptQueue();
            }
            case 1: {
                this.unsetCurrentPatch();
            }
            case 2: {
                this.unsetPageDescriptor();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetAcceptQueue();
            }
            case 1: {
                return this.isSetCurrentPatch();
            }
            case 2: {
                return this.isSetPageDescriptor();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
