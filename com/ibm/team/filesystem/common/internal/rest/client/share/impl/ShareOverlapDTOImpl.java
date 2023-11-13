// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareDTO;
import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareOverlapDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ShareOverlapDTOImpl extends EObjectImpl implements ShareOverlapDTO
{
    protected int ALL_FLAGS;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 1;
    protected EList overlappingRoots;
    protected EList overlappingShares;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 2;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryURL;
    protected static final int REPOSITORY_URL_ESETFLAG = 4;
    protected ShareableDTO root;
    protected static final int ROOT_ESETFLAG = 8;
    protected static final String WORKSPACE_ITEM_ID_EDEFAULT;
    protected String workspaceItemId;
    protected static final int WORKSPACE_ITEM_ID_ESETFLAG = 16;
    
    static {
        COMPONENT_ITEM_ID_EDEFAULT = null;
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        WORKSPACE_ITEM_ID_EDEFAULT = null;
    }
    
    protected ShareOverlapDTOImpl() {
        this.ALL_FLAGS = 0;
        this.componentItemId = ShareOverlapDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.repositoryId = ShareOverlapDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryURL = ShareOverlapDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.workspaceItemId = ShareOverlapDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOsharePackage.Literals.SHARE_OVERLAP_DTO;
    }
    
    public String getRepositoryURL() {
        return this.repositoryURL;
    }
    
    public void setRepositoryURL(final String newRepositoryURL) {
        final String oldRepositoryURL = this.repositoryURL;
        this.repositoryURL = newRepositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldRepositoryURL, (Object)this.repositoryURL, !oldRepositoryURLESet));
        }
    }
    
    public void unsetRepositoryURL() {
        final String oldRepositoryURL = this.repositoryURL;
        final boolean oldRepositoryURLESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.repositoryURL = ShareOverlapDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldRepositoryURL, (Object)ShareOverlapDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryURLESet));
        }
    }
    
    public boolean isSetRepositoryURL() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getWorkspaceItemId() {
        return this.workspaceItemId;
    }
    
    public void setWorkspaceItemId(final String newWorkspaceItemId) {
        final String oldWorkspaceItemId = this.workspaceItemId;
        this.workspaceItemId = newWorkspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldWorkspaceItemId, (Object)this.workspaceItemId, !oldWorkspaceItemIdESet));
        }
    }
    
    public void unsetWorkspaceItemId() {
        final String oldWorkspaceItemId = this.workspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.workspaceItemId = ShareOverlapDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldWorkspaceItemId, (Object)ShareOverlapDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT, oldWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getComponentItemId() {
        return this.componentItemId;
    }
    
    public void setComponentItemId(final String newComponentItemId) {
        final String oldComponentItemId = this.componentItemId;
        this.componentItemId = newComponentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.componentItemId = ShareOverlapDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldComponentItemId, (Object)ShareOverlapDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public ShareableDTO getRoot() {
        return this.root;
    }
    
    public NotificationChain basicSetRoot(final ShareableDTO newRoot, NotificationChain msgs) {
        final ShareableDTO oldRoot = this.root;
        this.root = newRoot;
        final boolean oldRootESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldRoot, (Object)newRoot, !oldRootESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setRoot(final ShareableDTO newRoot) {
        if (newRoot != this.root) {
            NotificationChain msgs = null;
            if (this.root != null) {
                msgs = ((InternalEObject)this.root).eInverseRemove((InternalEObject)this, -6, (Class)null, msgs);
            }
            if (newRoot != null) {
                msgs = ((InternalEObject)newRoot).eInverseAdd((InternalEObject)this, -6, (Class)null, msgs);
            }
            msgs = this.basicSetRoot(newRoot, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldRootESet = (this.ALL_FLAGS & 0x8) != 0x0;
            this.ALL_FLAGS |= 0x8;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)newRoot, (Object)newRoot, !oldRootESet));
            }
        }
    }
    
    public NotificationChain basicUnsetRoot(NotificationChain msgs) {
        final ShareableDTO oldRoot = this.root;
        this.root = null;
        final boolean oldRootESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldRoot, (Object)null, oldRootESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetRoot() {
        if (this.root != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.root).eInverseRemove((InternalEObject)this, -6, (Class)null, msgs);
            msgs = this.basicUnsetRoot(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldRootESet = (this.ALL_FLAGS & 0x8) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFF7;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)null, (Object)null, oldRootESet));
            }
        }
    }
    
    public boolean isSetRoot() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public List getOverlappingShares() {
        if (this.overlappingShares == null) {
            this.overlappingShares = (EList)new EObjectContainmentEList.Unsettable((Class)ShareDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.overlappingShares;
    }
    
    public void unsetOverlappingShares() {
        if (this.overlappingShares != null) {
            ((InternalEList.Unsettable)this.overlappingShares).unset();
        }
    }
    
    public boolean isSetOverlappingShares() {
        return this.overlappingShares != null && ((InternalEList.Unsettable)this.overlappingShares).isSet();
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.repositoryId = ShareOverlapDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldRepositoryId, (Object)ShareOverlapDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getOverlappingRoots() {
        if (this.overlappingRoots == null) {
            this.overlappingRoots = (EList)new EObjectContainmentEList.Unsettable((Class)ShareableDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.overlappingRoots;
    }
    
    public void unsetOverlappingRoots() {
        if (this.overlappingRoots != null) {
            ((InternalEList.Unsettable)this.overlappingRoots).unset();
        }
    }
    
    public boolean isSetOverlappingRoots() {
        return this.overlappingRoots != null && ((InternalEList.Unsettable)this.overlappingRoots).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return ((InternalEList)this.getOverlappingRoots()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return ((InternalEList)this.getOverlappingShares()).basicRemove((Object)otherEnd, msgs);
            }
            case 5: {
                return this.basicUnsetRoot(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getComponentItemId();
            }
            case 1: {
                return this.getOverlappingRoots();
            }
            case 2: {
                return this.getOverlappingShares();
            }
            case 3: {
                return this.getRepositoryId();
            }
            case 4: {
                return this.getRepositoryURL();
            }
            case 5: {
                return this.getRoot();
            }
            case 6: {
                return this.getWorkspaceItemId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setComponentItemId((String)newValue);
            }
            case 1: {
                this.getOverlappingRoots().clear();
                this.getOverlappingRoots().addAll((Collection)newValue);
            }
            case 2: {
                this.getOverlappingShares().clear();
                this.getOverlappingShares().addAll((Collection)newValue);
            }
            case 3: {
                this.setRepositoryId((String)newValue);
            }
            case 4: {
                this.setRepositoryURL((String)newValue);
            }
            case 5: {
                this.setRoot((ShareableDTO)newValue);
            }
            case 6: {
                this.setWorkspaceItemId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetComponentItemId();
            }
            case 1: {
                this.unsetOverlappingRoots();
            }
            case 2: {
                this.unsetOverlappingShares();
            }
            case 3: {
                this.unsetRepositoryId();
            }
            case 4: {
                this.unsetRepositoryURL();
            }
            case 5: {
                this.unsetRoot();
            }
            case 6: {
                this.unsetWorkspaceItemId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetComponentItemId();
            }
            case 1: {
                return this.isSetOverlappingRoots();
            }
            case 2: {
                return this.isSetOverlappingShares();
            }
            case 3: {
                return this.isSetRepositoryId();
            }
            case 4: {
                return this.isSetRepositoryURL();
            }
            case 5: {
                return this.isSetRoot();
            }
            case 6: {
                return this.isSetWorkspaceItemId();
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
        result.append(" (componentItemId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.componentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryURL: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.repositoryURL);
        }
        else {
            result.append("<unset>");
        }
        result.append(", workspaceItemId: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.workspaceItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
