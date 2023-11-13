// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.WorkspaceSyncDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.SyncViewDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class SyncViewDTOImpl extends EObjectImpl implements SyncViewDTO
{
    protected int ALL_FLAGS;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 1;
    protected EList workspaces;
    
    protected SyncViewDTOImpl() {
        this.ALL_FLAGS = 0;
        this.id = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.SYNC_VIEW_DTO;
    }
    
    public List getWorkspaces() {
        if (this.workspaces == null) {
            this.workspaces = (EList)new EObjectContainmentEList.Unsettable((Class)WorkspaceSyncDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.workspaces;
    }
    
    public void unsetWorkspaces() {
        if (this.workspaces != null) {
            ((InternalEList.Unsettable)this.workspaces).unset();
        }
    }
    
    public boolean isSetWorkspaces() {
        return this.workspaces != null && ((InternalEList.Unsettable)this.workspaces).isSet();
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(final int newId) {
        final int oldId = this.id;
        this.id = newId;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return ((InternalEList)this.getWorkspaces()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return new Integer(this.getId());
            }
            case 1: {
                return this.getWorkspaces();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setId((int)newValue);
            }
            case 1: {
                this.getWorkspaces().clear();
                this.getWorkspaces().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetId();
            }
            case 1: {
                this.unsetWorkspaces();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetId();
            }
            case 1: {
                return this.isSetWorkspaces();
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
        result.append(" (id: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.id);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
