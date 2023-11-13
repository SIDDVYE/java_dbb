// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.sync.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeSyncDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.sync.ChangeFolderSyncDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ChangeFolderSyncDTOImpl extends EObjectImpl implements ChangeFolderSyncDTO
{
    protected int ALL_FLAGS;
    protected static final int ID_EDEFAULT = 0;
    protected int id;
    protected static final int ID_ESETFLAG = 1;
    protected EList changes;
    protected ChangeSyncDTO folderChange;
    protected static final int FOLDER_CHANGE_ESETFLAG = 2;
    protected static final String PATH_EDEFAULT;
    protected String path;
    protected static final int PATH_ESETFLAG = 4;
    
    static {
        PATH_EDEFAULT = null;
    }
    
    protected ChangeFolderSyncDTOImpl() {
        this.ALL_FLAGS = 0;
        this.id = 0;
        this.path = ChangeFolderSyncDTOImpl.PATH_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsyncPackage.Literals.CHANGE_FOLDER_SYNC_DTO;
    }
    
    public String getPath() {
        return this.path;
    }
    
    public void setPath(final String newPath) {
        final String oldPath = this.path;
        this.path = newPath;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldPath, (Object)this.path, !oldPathESet));
        }
    }
    
    public void unsetPath() {
        final String oldPath = this.path;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.path = ChangeFolderSyncDTOImpl.PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldPath, (Object)ChangeFolderSyncDTOImpl.PATH_EDEFAULT, oldPathESet));
        }
    }
    
    public boolean isSetPath() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public List getChanges() {
        if (this.changes == null) {
            this.changes = (EList)new EObjectContainmentEList.Unsettable((Class)ChangeSyncDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.changes;
    }
    
    public void unsetChanges() {
        if (this.changes != null) {
            ((InternalEList.Unsettable)this.changes).unset();
        }
    }
    
    public boolean isSetChanges() {
        return this.changes != null && ((InternalEList.Unsettable)this.changes).isSet();
    }
    
    public ChangeSyncDTO getFolderChange() {
        return this.folderChange;
    }
    
    public NotificationChain basicSetFolderChange(final ChangeSyncDTO newFolderChange, NotificationChain msgs) {
        final ChangeSyncDTO oldFolderChange = this.folderChange;
        this.folderChange = newFolderChange;
        final boolean oldFolderChangeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldFolderChange, (Object)newFolderChange, !oldFolderChangeESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setFolderChange(final ChangeSyncDTO newFolderChange) {
        if (newFolderChange != this.folderChange) {
            NotificationChain msgs = null;
            if (this.folderChange != null) {
                msgs = ((InternalEObject)this.folderChange).eInverseRemove((InternalEObject)this, -3, (Class)null, msgs);
            }
            if (newFolderChange != null) {
                msgs = ((InternalEObject)newFolderChange).eInverseAdd((InternalEObject)this, -3, (Class)null, msgs);
            }
            msgs = this.basicSetFolderChange(newFolderChange, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldFolderChangeESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS |= 0x2;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)newFolderChange, (Object)newFolderChange, !oldFolderChangeESet));
            }
        }
    }
    
    public NotificationChain basicUnsetFolderChange(NotificationChain msgs) {
        final ChangeSyncDTO oldFolderChange = this.folderChange;
        this.folderChange = null;
        final boolean oldFolderChangeESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldFolderChange, (Object)null, oldFolderChangeESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetFolderChange() {
        if (this.folderChange != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.folderChange).eInverseRemove((InternalEObject)this, -3, (Class)null, msgs);
            msgs = this.basicUnsetFolderChange(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldFolderChangeESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFD;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)null, (Object)null, oldFolderChangeESet));
            }
        }
    }
    
    public boolean isSetFolderChange() {
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
                return ((InternalEList)this.getChanges()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return this.basicUnsetFolderChange(msgs);
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
                return this.getChanges();
            }
            case 2: {
                return this.getFolderChange();
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
                this.setId((int)newValue);
            }
            case 1: {
                this.getChanges().clear();
                this.getChanges().addAll((Collection)newValue);
            }
            case 2: {
                this.setFolderChange((ChangeSyncDTO)newValue);
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
                this.unsetId();
            }
            case 1: {
                this.unsetChanges();
            }
            case 2: {
                this.unsetFolderChange();
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
                return this.isSetId();
            }
            case 1: {
                return this.isSetChanges();
            }
            case 2: {
                return this.isSetFolderChange();
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
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.path);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
