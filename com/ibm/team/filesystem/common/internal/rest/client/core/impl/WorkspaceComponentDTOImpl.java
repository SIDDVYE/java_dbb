// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.repository.common.IAuditableHandle;
import com.ibm.team.filesystem.common.internal.rest.client.core.ReadScopeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.core.BaselineDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceComponentDTO;

public class WorkspaceComponentDTOImpl extends ComponentDTOImpl implements WorkspaceComponentDTO
{
    protected EList activeChangeSetIds;
    protected BaselineDTO baseline;
    protected static final int BASELINE_ESETFLAG = 4;
    protected ReadScopeDTO readScope;
    protected static final int READ_SCOPE_ESETFLAG = 8;
    protected static final String ROOT_FOLDER_EDEFAULT;
    protected String rootFolder;
    protected static final int ROOT_FOLDER_ESETFLAG = 16;
    protected IAuditableHandle owner;
    protected static final int OWNER_ESETFLAG = 32;
    protected static final String CURRENT_CHANGE_SET_ID_EDEFAULT;
    protected String currentChangeSetId;
    protected static final int CURRENT_CHANGE_SET_ID_ESETFLAG = 64;
    
    static {
        ROOT_FOLDER_EDEFAULT = null;
        CURRENT_CHANGE_SET_ID_EDEFAULT = null;
    }
    
    protected WorkspaceComponentDTOImpl() {
        this.rootFolder = WorkspaceComponentDTOImpl.ROOT_FOLDER_EDEFAULT;
        this.currentChangeSetId = WorkspaceComponentDTOImpl.CURRENT_CHANGE_SET_ID_EDEFAULT;
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.WORKSPACE_COMPONENT_DTO;
    }
    
    @Override
    public BaselineDTO getBaseline() {
        return this.baseline;
    }
    
    public NotificationChain basicSetBaseline(final BaselineDTO newBaseline, NotificationChain msgs) {
        final BaselineDTO oldBaseline = this.baseline;
        this.baseline = newBaseline;
        final boolean oldBaselineESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldBaseline, (Object)newBaseline, !oldBaselineESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    @Override
    public void setBaseline(final BaselineDTO newBaseline) {
        if (newBaseline != this.baseline) {
            NotificationChain msgs = null;
            if (this.baseline != null) {
                msgs = ((InternalEObject)this.baseline).eInverseRemove((InternalEObject)this, -4, (Class)null, msgs);
            }
            if (newBaseline != null) {
                msgs = ((InternalEObject)newBaseline).eInverseAdd((InternalEObject)this, -4, (Class)null, msgs);
            }
            msgs = this.basicSetBaseline(newBaseline, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldBaselineESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS |= 0x4;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)newBaseline, (Object)newBaseline, !oldBaselineESet));
            }
        }
    }
    
    public NotificationChain basicUnsetBaseline(NotificationChain msgs) {
        final BaselineDTO oldBaseline = this.baseline;
        this.baseline = null;
        final boolean oldBaselineESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldBaseline, (Object)null, oldBaselineESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    @Override
    public void unsetBaseline() {
        if (this.baseline != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.baseline).eInverseRemove((InternalEObject)this, -4, (Class)null, msgs);
            msgs = this.basicUnsetBaseline(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldBaselineESet = (this.ALL_FLAGS & 0x4) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFB;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)null, (Object)null, oldBaselineESet));
            }
        }
    }
    
    @Override
    public boolean isSetBaseline() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    @Override
    public String getRootFolder() {
        return this.rootFolder;
    }
    
    @Override
    public void setRootFolder(final String newRootFolder) {
        final String oldRootFolder = this.rootFolder;
        this.rootFolder = newRootFolder;
        final boolean oldRootFolderESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldRootFolder, (Object)this.rootFolder, !oldRootFolderESet));
        }
    }
    
    @Override
    public void unsetRootFolder() {
        final String oldRootFolder = this.rootFolder;
        final boolean oldRootFolderESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.rootFolder = WorkspaceComponentDTOImpl.ROOT_FOLDER_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldRootFolder, (Object)WorkspaceComponentDTOImpl.ROOT_FOLDER_EDEFAULT, oldRootFolderESet));
        }
    }
    
    @Override
    public boolean isSetRootFolder() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    @Override
    public IAuditableHandle getOwner() {
        return this.owner;
    }
    
    public NotificationChain basicSetOwner(final IAuditableHandle newOwner, NotificationChain msgs) {
        final IAuditableHandle oldOwner = this.owner;
        this.owner = newOwner;
        final boolean oldOwnerESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 6, (Object)oldOwner, (Object)newOwner, !oldOwnerESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    @Override
    public void setOwner(final IAuditableHandle newOwner) {
        if (newOwner != this.owner) {
            NotificationChain msgs = null;
            if (this.owner != null) {
                msgs = ((InternalEObject)this.owner).eInverseRemove((InternalEObject)this, -7, (Class)null, msgs);
            }
            if (newOwner != null) {
                msgs = ((InternalEObject)newOwner).eInverseAdd((InternalEObject)this, -7, (Class)null, msgs);
            }
            msgs = this.basicSetOwner(newOwner, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldOwnerESet = (this.ALL_FLAGS & 0x20) != 0x0;
            this.ALL_FLAGS |= 0x20;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, (Object)newOwner, (Object)newOwner, !oldOwnerESet));
            }
        }
    }
    
    public NotificationChain basicUnsetOwner(NotificationChain msgs) {
        final IAuditableHandle oldOwner = this.owner;
        this.owner = null;
        final boolean oldOwnerESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 6, (Object)oldOwner, (Object)null, oldOwnerESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    @Override
    public void unsetOwner() {
        if (this.owner != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.owner).eInverseRemove((InternalEObject)this, -7, (Class)null, msgs);
            msgs = this.basicUnsetOwner(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldOwnerESet = (this.ALL_FLAGS & 0x20) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFDF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, (Object)null, (Object)null, oldOwnerESet));
            }
        }
    }
    
    @Override
    public boolean isSetOwner() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    @Override
    public String getCurrentChangeSetId() {
        return this.currentChangeSetId;
    }
    
    @Override
    public void setCurrentChangeSetId(final String newCurrentChangeSetId) {
        final String oldCurrentChangeSetId = this.currentChangeSetId;
        this.currentChangeSetId = newCurrentChangeSetId;
        final boolean oldCurrentChangeSetIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldCurrentChangeSetId, (Object)this.currentChangeSetId, !oldCurrentChangeSetIdESet));
        }
    }
    
    @Override
    public void unsetCurrentChangeSetId() {
        final String oldCurrentChangeSetId = this.currentChangeSetId;
        final boolean oldCurrentChangeSetIdESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.currentChangeSetId = WorkspaceComponentDTOImpl.CURRENT_CHANGE_SET_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldCurrentChangeSetId, (Object)WorkspaceComponentDTOImpl.CURRENT_CHANGE_SET_ID_EDEFAULT, oldCurrentChangeSetIdESet));
        }
    }
    
    @Override
    public boolean isSetCurrentChangeSetId() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    @Override
    public ReadScopeDTO getReadScope() {
        if (this.readScope != null && ((EObject)this.readScope).eIsProxy()) {
            final InternalEObject oldReadScope = (InternalEObject)this.readScope;
            this.readScope = (ReadScopeDTO)this.eResolveProxy(oldReadScope);
            if (this.readScope != oldReadScope && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 4, (Object)oldReadScope, (Object)this.readScope));
            }
        }
        return this.readScope;
    }
    
    public ReadScopeDTO basicGetReadScope() {
        return this.readScope;
    }
    
    @Override
    public void setReadScope(final ReadScopeDTO newReadScope) {
        final ReadScopeDTO oldReadScope = this.readScope;
        this.readScope = newReadScope;
        final boolean oldReadScopeESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldReadScope, (Object)this.readScope, !oldReadScopeESet));
        }
    }
    
    @Override
    public void unsetReadScope() {
        final ReadScopeDTO oldReadScope = this.readScope;
        final boolean oldReadScopeESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.readScope = null;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldReadScope, (Object)null, oldReadScopeESet));
        }
    }
    
    @Override
    public boolean isSetReadScope() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    @Override
    public List getActiveChangeSetIds() {
        if (this.activeChangeSetIds == null) {
            this.activeChangeSetIds = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 2);
        }
        return (List)this.activeChangeSetIds;
    }
    
    @Override
    public void unsetActiveChangeSetIds() {
        if (this.activeChangeSetIds != null) {
            ((InternalEList.Unsettable)this.activeChangeSetIds).unset();
        }
    }
    
    @Override
    public boolean isSetActiveChangeSetIds() {
        return this.activeChangeSetIds != null && ((InternalEList.Unsettable)this.activeChangeSetIds).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 3: {
                return this.basicUnsetBaseline(msgs);
            }
            case 6: {
                return this.basicUnsetOwner(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 2: {
                return this.getActiveChangeSetIds();
            }
            case 3: {
                return this.getBaseline();
            }
            case 4: {
                if (resolve) {
                    return this.getReadScope();
                }
                return this.basicGetReadScope();
            }
            case 5: {
                return this.getRootFolder();
            }
            case 6: {
                return this.getOwner();
            }
            case 7: {
                return this.getCurrentChangeSetId();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 2: {
                this.getActiveChangeSetIds().clear();
                this.getActiveChangeSetIds().addAll((Collection)newValue);
            }
            case 3: {
                this.setBaseline((BaselineDTO)newValue);
            }
            case 4: {
                this.setReadScope((ReadScopeDTO)newValue);
            }
            case 5: {
                this.setRootFolder((String)newValue);
            }
            case 6: {
                this.setOwner((IAuditableHandle)newValue);
            }
            case 7: {
                this.setCurrentChangeSetId((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 2: {
                this.unsetActiveChangeSetIds();
            }
            case 3: {
                this.unsetBaseline();
            }
            case 4: {
                this.unsetReadScope();
            }
            case 5: {
                this.unsetRootFolder();
            }
            case 6: {
                this.unsetOwner();
            }
            case 7: {
                this.unsetCurrentChangeSetId();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 2: {
                return this.isSetActiveChangeSetIds();
            }
            case 3: {
                return this.isSetBaseline();
            }
            case 4: {
                return this.isSetReadScope();
            }
            case 5: {
                return this.isSetRootFolder();
            }
            case 6: {
                return this.isSetOwner();
            }
            case 7: {
                return this.isSetCurrentChangeSetId();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (activeChangeSetIds: ");
        result.append(this.activeChangeSetIds);
        result.append(", rootFolder: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.rootFolder);
        }
        else {
            result.append("<unset>");
        }
        result.append(", currentChangeSetId: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.currentChangeSetId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
