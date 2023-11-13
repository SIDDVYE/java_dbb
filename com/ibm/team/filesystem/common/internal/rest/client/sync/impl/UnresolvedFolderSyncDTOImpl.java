// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.LocalChangeSyncDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ConflictSyncDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.UnresolvedFolderSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class UnresolvedFolderSyncDTOImpl extends EObjectImpl implements UnresolvedFolderSyncDTO
{
    protected int ALL_FLAGS;
    protected EList conflicts;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 1;
    protected EList localChanges;
    protected static final String PATH_EDEFAULT;
    protected String path;
    protected static final int PATH_ESETFLAG = 2;
    
    static {
        PATH_EDEFAULT = null;
    }
    
    protected UnresolvedFolderSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.id = 0;
        this.path = UnresolvedFolderSyncDTOImpl.PATH_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.UNRESOLVED_FOLDER_SYNC_DTO;
    }
    
    public List getConflicts() {
        if (this.conflicts == null) {
            this.conflicts = (EList)new EObjectContainmentEList.Unsettable((Class)ConflictSyncDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.conflicts;
    }
    
    public void unsetConflicts() {
        if (this.conflicts != null) {
            ((InternalEList.Unsettable)this.conflicts).unset();
        }
    }
    
    public boolean isSetConflicts() {
        return this.conflicts != null && ((InternalEList.Unsettable)this.conflicts).isSet();
    }
    
    public List getLocalChanges() {
        if (this.localChanges == null) {
            this.localChanges = (EList)new EObjectContainmentEList.Unsettable((Class)LocalChangeSyncDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.localChanges;
    }
    
    public void unsetLocalChanges() {
        if (this.localChanges != null) {
            ((InternalEList.Unsettable)this.localChanges).unset();
        }
    }
    
    public boolean isSetLocalChanges() {
        return this.localChanges != null && ((InternalEList.Unsettable)this.localChanges).isSet();
    }
    
    public String getPath() {
        return this.path;
    }
    
    public void setPath(final String newPath) {
        final String oldPath = this.path;
        this.path = newPath;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldPath, (Object)this.path, !oldPathESet));
        }
    }
    
    public void unsetPath() {
        final String oldPath = this.path;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.path = UnresolvedFolderSyncDTOImpl.PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldPath, (Object)UnresolvedFolderSyncDTOImpl.PATH_EDEFAULT, oldPathESet));
        }
    }
    
    public boolean isSetPath() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldId, this.id, !oldIdESet));
        }
    }
    
    public void unsetId() {
        final int oldId = this.id;
        final boolean oldIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.id = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldId, 0, oldIdESet));
        }
    }
    
    public boolean isSetId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getConflicts()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return ((InternalEList)this.getLocalChanges()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getConflicts();
            }
            case 1: {
                return new Integer(this.getId());
            }
            case 2: {
                return this.getLocalChanges();
            }
            case 3: {
                return this.getPath();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getConflicts().clear();
                this.getConflicts().addAll((Collection)newValue);
            }
            case 1: {
                this.setId((int)newValue);
            }
            case 2: {
                this.getLocalChanges().clear();
                this.getLocalChanges().addAll((Collection)newValue);
            }
            case 3: {
                this.setPath((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetConflicts();
            }
            case 1: {
                this.unsetId();
            }
            case 2: {
                this.unsetLocalChanges();
            }
            case 3: {
                this.unsetPath();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetConflicts();
            }
            case 1: {
                return this.isSetId();
            }
            case 2: {
                return this.isSetLocalChanges();
            }
            case 3: {
                return this.isSetPath();
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
        result.append(", path: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.path);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
