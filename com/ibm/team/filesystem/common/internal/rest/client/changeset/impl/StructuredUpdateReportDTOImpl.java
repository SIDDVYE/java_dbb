// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changeset.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StructuredComponentUpdateReportDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.StructuredUpdateReportDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class StructuredUpdateReportDTOImpl extends EObjectImpl implements StructuredUpdateReportDTO
{
    protected int ALL_FLAGS;
    protected EList components;
    protected static final boolean HAS_CONFLICTS_EDEFAULT = false;
    protected static final int HAS_CONFLICTS_EFLAG = 1;
    protected static final int HAS_CONFLICTS_ESETFLAG = 2;
    protected static final String REPOSITORY_ID_EDEFAULT;
    protected String repositoryId;
    protected static final int REPOSITORY_ID_ESETFLAG = 4;
    protected static final String REPOSITORY_URL_EDEFAULT;
    protected String repositoryUrl;
    protected static final int REPOSITORY_URL_ESETFLAG = 8;
    protected static final String WORKSPACE_ITEM_ID_EDEFAULT;
    protected String workspaceItemId;
    protected static final int WORKSPACE_ITEM_ID_ESETFLAG = 16;
    protected static final String WORKSPACE_NAME_EDEFAULT;
    protected String workspaceName;
    protected static final int WORKSPACE_NAME_ESETFLAG = 32;
    
    static {
        REPOSITORY_ID_EDEFAULT = null;
        REPOSITORY_URL_EDEFAULT = null;
        WORKSPACE_ITEM_ID_EDEFAULT = null;
        WORKSPACE_NAME_EDEFAULT = null;
    }
    
    protected StructuredUpdateReportDTOImpl() {
        this.ALL_FLAGS = 0;
        this.repositoryId = StructuredUpdateReportDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.repositoryUrl = StructuredUpdateReportDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.workspaceItemId = StructuredUpdateReportDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.workspaceName = StructuredUpdateReportDTOImpl.WORKSPACE_NAME_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOchangesetPackage.Literals.STRUCTURED_UPDATE_REPORT_DTO;
    }
    
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    
    public void setRepositoryUrl(final String newRepositoryUrl) {
        final String oldRepositoryUrl = this.repositoryUrl;
        this.repositoryUrl = newRepositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldRepositoryUrl, (Object)this.repositoryUrl, !oldRepositoryUrlESet));
        }
    }
    
    public void unsetRepositoryUrl() {
        final String oldRepositoryUrl = this.repositoryUrl;
        final boolean oldRepositoryUrlESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.repositoryUrl = StructuredUpdateReportDTOImpl.REPOSITORY_URL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldRepositoryUrl, (Object)StructuredUpdateReportDTOImpl.REPOSITORY_URL_EDEFAULT, oldRepositoryUrlESet));
        }
    }
    
    public boolean isSetRepositoryUrl() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getWorkspaceName() {
        return this.workspaceName;
    }
    
    public void setWorkspaceName(final String newWorkspaceName) {
        final String oldWorkspaceName = this.workspaceName;
        this.workspaceName = newWorkspaceName;
        final boolean oldWorkspaceNameESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldWorkspaceName, (Object)this.workspaceName, !oldWorkspaceNameESet));
        }
    }
    
    public void unsetWorkspaceName() {
        final String oldWorkspaceName = this.workspaceName;
        final boolean oldWorkspaceNameESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.workspaceName = StructuredUpdateReportDTOImpl.WORKSPACE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldWorkspaceName, (Object)StructuredUpdateReportDTOImpl.WORKSPACE_NAME_EDEFAULT, oldWorkspaceNameESet));
        }
    }
    
    public boolean isSetWorkspaceName() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
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
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldWorkspaceItemId, (Object)this.workspaceItemId, !oldWorkspaceItemIdESet));
        }
    }
    
    public void unsetWorkspaceItemId() {
        final String oldWorkspaceItemId = this.workspaceItemId;
        final boolean oldWorkspaceItemIdESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.workspaceItemId = StructuredUpdateReportDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldWorkspaceItemId, (Object)StructuredUpdateReportDTOImpl.WORKSPACE_ITEM_ID_EDEFAULT, oldWorkspaceItemIdESet));
        }
    }
    
    public boolean isSetWorkspaceItemId() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public boolean isHasConflicts() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setHasConflicts(final boolean newHasConflicts) {
        final boolean oldHasConflicts = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newHasConflicts) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldHasConflictsESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldHasConflicts, newHasConflicts, !oldHasConflictsESet));
        }
    }
    
    public void unsetHasConflicts() {
        final boolean oldHasConflicts = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldHasConflictsESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldHasConflicts, false, oldHasConflictsESet));
        }
    }
    
    public boolean isSetHasConflicts() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getRepositoryId() {
        return this.repositoryId;
    }
    
    public void setRepositoryId(final String newRepositoryId) {
        final String oldRepositoryId = this.repositoryId;
        this.repositoryId = newRepositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldRepositoryId, (Object)this.repositoryId, !oldRepositoryIdESet));
        }
    }
    
    public void unsetRepositoryId() {
        final String oldRepositoryId = this.repositoryId;
        final boolean oldRepositoryIdESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.repositoryId = StructuredUpdateReportDTOImpl.REPOSITORY_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldRepositoryId, (Object)StructuredUpdateReportDTOImpl.REPOSITORY_ID_EDEFAULT, oldRepositoryIdESet));
        }
    }
    
    public boolean isSetRepositoryId() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public List getComponents() {
        if (this.components == null) {
            this.components = (EList)new EObjectContainmentEList.Unsettable((Class)StructuredComponentUpdateReportDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.components;
    }
    
    public void unsetComponents() {
        if (this.components != null) {
            ((InternalEList.Unsettable)this.components).unset();
        }
    }
    
    public boolean isSetComponents() {
        return this.components != null && ((InternalEList.Unsettable)this.components).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getComponents()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getComponents();
            }
            case 1: {
                return this.isHasConflicts() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 2: {
                return this.getRepositoryId();
            }
            case 3: {
                return this.getRepositoryUrl();
            }
            case 4: {
                return this.getWorkspaceItemId();
            }
            case 5: {
                return this.getWorkspaceName();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getComponents().clear();
                this.getComponents().addAll((Collection)newValue);
            }
            case 1: {
                this.setHasConflicts((boolean)newValue);
            }
            case 2: {
                this.setRepositoryId((String)newValue);
            }
            case 3: {
                this.setRepositoryUrl((String)newValue);
            }
            case 4: {
                this.setWorkspaceItemId((String)newValue);
            }
            case 5: {
                this.setWorkspaceName((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetComponents();
            }
            case 1: {
                this.unsetHasConflicts();
            }
            case 2: {
                this.unsetRepositoryId();
            }
            case 3: {
                this.unsetRepositoryUrl();
            }
            case 4: {
                this.unsetWorkspaceItemId();
            }
            case 5: {
                this.unsetWorkspaceName();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetComponents();
            }
            case 1: {
                return this.isSetHasConflicts();
            }
            case 2: {
                return this.isSetRepositoryId();
            }
            case 3: {
                return this.isSetRepositoryUrl();
            }
            case 4: {
                return this.isSetWorkspaceItemId();
            }
            case 5: {
                return this.isSetWorkspaceName();
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
        result.append(" (hasConflicts: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryId: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.repositoryId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repositoryUrl: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.repositoryUrl);
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
        result.append(", workspaceName: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.workspaceName);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
