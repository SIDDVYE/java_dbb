// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.impl;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import com.ibm.team.scm.common.internal.impl.PropertyImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EMap;
import com.ibm.team.filesystem.common.internal.rest.client.core.WorkspaceDetailsDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.WorkspaceCustomAttributesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class WorkspaceCustomAttributesDTOImpl extends EObjectImpl implements WorkspaceCustomAttributesDTO
{
    protected int ALL_FLAGS;
    protected WorkspaceDetailsDTO workspace;
    protected static final int WORKSPACE_ESETFLAG = 1;
    protected EMap customAttributes;
    
    protected WorkspaceCustomAttributesDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOworkspacePackage.Literals.WORKSPACE_CUSTOM_ATTRIBUTES_DTO;
    }
    
    public WorkspaceDetailsDTO getWorkspace() {
        return this.workspace;
    }
    
    public NotificationChain basicSetWorkspace(final WorkspaceDetailsDTO newWorkspace, NotificationChain msgs) {
        final WorkspaceDetailsDTO oldWorkspace = this.workspace;
        this.workspace = newWorkspace;
        final boolean oldWorkspaceESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldWorkspace, (Object)newWorkspace, !oldWorkspaceESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setWorkspace(final WorkspaceDetailsDTO newWorkspace) {
        if (newWorkspace != this.workspace) {
            NotificationChain msgs = null;
            if (this.workspace != null) {
                msgs = ((InternalEObject)this.workspace).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newWorkspace != null) {
                msgs = ((InternalEObject)newWorkspace).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetWorkspace(newWorkspace, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldWorkspaceESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newWorkspace, (Object)newWorkspace, !oldWorkspaceESet));
            }
        }
    }
    
    public NotificationChain basicUnsetWorkspace(NotificationChain msgs) {
        final WorkspaceDetailsDTO oldWorkspace = this.workspace;
        this.workspace = null;
        final boolean oldWorkspaceESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldWorkspace, (Object)null, oldWorkspaceESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetWorkspace() {
        if (this.workspace != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.workspace).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetWorkspace(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldWorkspaceESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldWorkspaceESet));
            }
        }
    }
    
    public boolean isSetWorkspace() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public Map getCustomAttributes() {
        if (this.customAttributes == null) {
            this.customAttributes = (EMap)new EcoreEMap.Unsettable(ScmPackage.Literals.PROPERTY, (Class)PropertyImpl.class, (InternalEObject)this, 1);
        }
        return this.customAttributes.map();
    }
    
    public void unsetCustomAttributes() {
        if (this.customAttributes != null) {
            ((InternalEList.Unsettable)this.customAttributes).unset();
        }
    }
    
    public boolean isSetCustomAttributes() {
        return this.customAttributes != null && ((InternalEList.Unsettable)this.customAttributes).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetWorkspace(msgs);
            }
            case 1: {
                return ((InternalEList)((EMap.InternalMapView)this.getCustomAttributes()).eMap()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getWorkspace();
            }
            case 1: {
                if (coreType) {
                    return ((EMap.InternalMapView)this.getCustomAttributes()).eMap();
                }
                return this.getCustomAttributes();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setWorkspace((WorkspaceDetailsDTO)newValue);
            }
            case 1: {
                ((EStructuralFeature.Setting)((EMap.InternalMapView)this.getCustomAttributes()).eMap()).set(newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetWorkspace();
            }
            case 1: {
                this.unsetCustomAttributes();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetWorkspace();
            }
            case 1: {
                return this.isSetCustomAttributes();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
