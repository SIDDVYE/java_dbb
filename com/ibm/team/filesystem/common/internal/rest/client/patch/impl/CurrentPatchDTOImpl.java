// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.patch.VersionableChangeDTO;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeSetSourceDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CurrentPatchDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CurrentPatchDTOImpl extends EObjectImpl implements CurrentPatchDTO
{
    protected int ALL_FLAGS;
    protected static final String WORKSPACE_ID_EDEFAULT = "";
    protected String workspaceId;
    protected static final int WORKSPACE_ID_ESETFLAG = 1;
    protected static final String COMPONENT_ID_EDEFAULT = "";
    protected String componentId;
    protected static final int COMPONENT_ID_ESETFLAG = 2;
    protected ChangeSetSourceDTO source;
    protected static final int SOURCE_ESETFLAG = 4;
    protected static final String TARGET_CHANGE_SET_ID_EDEFAULT = "";
    protected String targetChangeSetId;
    protected static final int TARGET_CHANGE_SET_ID_ESETFLAG = 8;
    protected EList changes;
    
    protected CurrentPatchDTOImpl() {
        this.ALL_FLAGS = 0;
        this.workspaceId = "";
        this.componentId = "";
        this.targetChangeSetId = "";
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOpatchPackage.Literals.CURRENT_PATCH_DTO;
    }
    
    public String getWorkspaceId() {
        return this.workspaceId;
    }
    
    public void setWorkspaceId(final String newWorkspaceId) {
        final String oldWorkspaceId = this.workspaceId;
        this.workspaceId = newWorkspaceId;
        final boolean oldWorkspaceIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldWorkspaceId, (Object)this.workspaceId, !oldWorkspaceIdESet));
        }
    }
    
    public void unsetWorkspaceId() {
        final String oldWorkspaceId = this.workspaceId;
        final boolean oldWorkspaceIdESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.workspaceId = "";
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldWorkspaceId, (Object)"", oldWorkspaceIdESet));
        }
    }
    
    public boolean isSetWorkspaceId() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getComponentId() {
        return this.componentId;
    }
    
    public void setComponentId(final String newComponentId) {
        final String oldComponentId = this.componentId;
        this.componentId = newComponentId;
        final boolean oldComponentIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldComponentId, (Object)this.componentId, !oldComponentIdESet));
        }
    }
    
    public void unsetComponentId() {
        final String oldComponentId = this.componentId;
        final boolean oldComponentIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.componentId = "";
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldComponentId, (Object)"", oldComponentIdESet));
        }
    }
    
    public boolean isSetComponentId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public ChangeSetSourceDTO getSource() {
        if (this.source != null && ((EObject)this.source).eIsProxy()) {
            final InternalEObject oldSource = (InternalEObject)this.source;
            this.source = (ChangeSetSourceDTO)this.eResolveProxy(oldSource);
            if (this.source != oldSource && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 2, (Object)oldSource, (Object)this.source));
            }
        }
        return this.source;
    }
    
    public ChangeSetSourceDTO basicGetSource() {
        return this.source;
    }
    
    public void setSource(final ChangeSetSourceDTO newSource) {
        final ChangeSetSourceDTO oldSource = this.source;
        this.source = newSource;
        final boolean oldSourceESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldSource, (Object)this.source, !oldSourceESet));
        }
    }
    
    public void unsetSource() {
        final ChangeSetSourceDTO oldSource = this.source;
        final boolean oldSourceESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.source = null;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldSource, (Object)null, oldSourceESet));
        }
    }
    
    public boolean isSetSource() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getTargetChangeSetId() {
        return this.targetChangeSetId;
    }
    
    public void setTargetChangeSetId(final String newTargetChangeSetId) {
        final String oldTargetChangeSetId = this.targetChangeSetId;
        this.targetChangeSetId = newTargetChangeSetId;
        final boolean oldTargetChangeSetIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldTargetChangeSetId, (Object)this.targetChangeSetId, !oldTargetChangeSetIdESet));
        }
    }
    
    public void unsetTargetChangeSetId() {
        final String oldTargetChangeSetId = this.targetChangeSetId;
        final boolean oldTargetChangeSetIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.targetChangeSetId = "";
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldTargetChangeSetId, (Object)"", oldTargetChangeSetIdESet));
        }
    }
    
    public boolean isSetTargetChangeSetId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public List getChanges() {
        if (this.changes == null) {
            this.changes = (EList)new EObjectContainmentEList.Unsettable((Class)VersionableChangeDTO.class, (InternalEObject)this, 4);
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
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 4: {
                return ((InternalEList)this.getChanges()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getWorkspaceId();
            }
            case 1: {
                return this.getComponentId();
            }
            case 2: {
                if (resolve) {
                    return this.getSource();
                }
                return this.basicGetSource();
            }
            case 3: {
                return this.getTargetChangeSetId();
            }
            case 4: {
                return this.getChanges();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setWorkspaceId((String)newValue);
            }
            case 1: {
                this.setComponentId((String)newValue);
            }
            case 2: {
                this.setSource((ChangeSetSourceDTO)newValue);
            }
            case 3: {
                this.setTargetChangeSetId((String)newValue);
            }
            case 4: {
                this.getChanges().clear();
                this.getChanges().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetWorkspaceId();
            }
            case 1: {
                this.unsetComponentId();
            }
            case 2: {
                this.unsetSource();
            }
            case 3: {
                this.unsetTargetChangeSetId();
            }
            case 4: {
                this.unsetChanges();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetWorkspaceId();
            }
            case 1: {
                return this.isSetComponentId();
            }
            case 2: {
                return this.isSetSource();
            }
            case 3: {
                return this.isSetTargetChangeSetId();
            }
            case 4: {
                return this.isSetChanges();
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
        result.append(" (workspaceId: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.workspaceId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.componentId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", targetChangeSetId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.targetChangeSetId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
