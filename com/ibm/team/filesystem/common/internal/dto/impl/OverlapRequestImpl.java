// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import com.ibm.team.scm.common.IContextHandle;
import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.scm.common.IVersionableHandle;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.IBaselineHandle;
import com.ibm.team.scm.common.IWorkspaceHandle;
import com.ibm.team.filesystem.common.internal.dto.OverlapRequest;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class OverlapRequestImpl extends EObjectImpl implements OverlapRequest
{
    protected int ALL_FLAGS;
    protected IWorkspaceHandle workspace;
    protected static final int WORKSPACE_ESETFLAG = 1;
    protected IBaselineHandle baseline;
    protected static final int BASELINE_ESETFLAG = 2;
    protected IComponentHandle component;
    protected static final int COMPONENT_ESETFLAG = 4;
    protected EList group;
    
    protected OverlapRequestImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.OVERLAP_REQUEST;
    }
    
    public IWorkspaceHandle getWorkspace() {
        if (this.workspace != null && ((EObject)this.workspace).eIsProxy()) {
            final InternalEObject oldWorkspace = (InternalEObject)this.workspace;
            this.workspace = (IWorkspaceHandle)this.eResolveProxy(oldWorkspace);
            if (this.workspace != oldWorkspace && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 0, (Object)oldWorkspace, (Object)this.workspace));
            }
        }
        return this.workspace;
    }
    
    public IWorkspaceHandle basicGetWorkspace() {
        return this.workspace;
    }
    
    public void setWorkspace(final IWorkspaceHandle newWorkspace) {
        final IWorkspaceHandle oldWorkspace = this.workspace;
        this.workspace = newWorkspace;
        final boolean oldWorkspaceESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldWorkspace, (Object)this.workspace, !oldWorkspaceESet));
        }
    }
    
    public void unsetWorkspace() {
        final IWorkspaceHandle oldWorkspace = this.workspace;
        final boolean oldWorkspaceESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.workspace = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldWorkspace, (Object)null, oldWorkspaceESet));
        }
    }
    
    public boolean isSetWorkspace() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public IComponentHandle getComponent() {
        if (this.component != null && ((EObject)this.component).eIsProxy()) {
            final InternalEObject oldComponent = (InternalEObject)this.component;
            this.component = (IComponentHandle)this.eResolveProxy(oldComponent);
            if (this.component != oldComponent && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 2, (Object)oldComponent, (Object)this.component));
            }
        }
        return this.component;
    }
    
    public IComponentHandle basicGetComponent() {
        return this.component;
    }
    
    public void setComponent(final IComponentHandle newComponent) {
        final IComponentHandle oldComponent = this.component;
        this.component = newComponent;
        final boolean oldComponentESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldComponent, (Object)this.component, !oldComponentESet));
        }
    }
    
    public void unsetComponent() {
        final IComponentHandle oldComponent = this.component;
        final boolean oldComponentESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.component = null;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldComponent, (Object)null, oldComponentESet));
        }
    }
    
    public boolean isSetComponent() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public IBaselineHandle getBaseline() {
        if (this.baseline != null && ((EObject)this.baseline).eIsProxy()) {
            final InternalEObject oldBaseline = (InternalEObject)this.baseline;
            this.baseline = (IBaselineHandle)this.eResolveProxy(oldBaseline);
            if (this.baseline != oldBaseline && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 1, (Object)oldBaseline, (Object)this.baseline));
            }
        }
        return this.baseline;
    }
    
    public IBaselineHandle basicGetBaseline() {
        return this.baseline;
    }
    
    public void setBaseline(final IBaselineHandle newBaseline) {
        final IBaselineHandle oldBaseline = this.baseline;
        this.baseline = newBaseline;
        final boolean oldBaselineESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldBaseline, (Object)this.baseline, !oldBaselineESet));
        }
    }
    
    public void unsetBaseline() {
        final IBaselineHandle oldBaseline = this.baseline;
        final boolean oldBaselineESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.baseline = null;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldBaseline, (Object)null, oldBaselineESet));
        }
    }
    
    public boolean isSetBaseline() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getGroup() {
        if (this.group == null) {
            this.group = (EList)new EObjectResolvingEList.Unsettable((Class)IVersionableHandle.class, (InternalEObject)this, 3);
        }
        return (List)this.group;
    }
    
    public void unsetGroup() {
        if (this.group != null) {
            ((InternalEList.Unsettable)this.group).unset();
        }
    }
    
    public boolean isSetGroup() {
        return this.group != null && ((InternalEList.Unsettable)this.group).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                if (resolve) {
                    return this.getWorkspace();
                }
                return this.basicGetWorkspace();
            }
            case 1: {
                if (resolve) {
                    return this.getBaseline();
                }
                return this.basicGetBaseline();
            }
            case 2: {
                if (resolve) {
                    return this.getComponent();
                }
                return this.basicGetComponent();
            }
            case 3: {
                return this.getGroup();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setWorkspace((IWorkspaceHandle)newValue);
            }
            case 1: {
                this.setBaseline((IBaselineHandle)newValue);
            }
            case 2: {
                this.setComponent((IComponentHandle)newValue);
            }
            case 3: {
                this.getGroup().clear();
                this.getGroup().addAll((Collection)newValue);
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
                this.unsetBaseline();
            }
            case 2: {
                this.unsetComponent();
            }
            case 3: {
                this.unsetGroup();
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
                return this.isSetBaseline();
            }
            case 2: {
                return this.isSetComponent();
            }
            case 3: {
                return this.isSetGroup();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public void setContext(final IContextHandle contextHandle) {
        if (contextHandle instanceof IWorkspaceHandle) {
            this.setWorkspace((IWorkspaceHandle)contextHandle);
            this.setBaseline(null);
        }
        else {
            if (!(contextHandle instanceof IBaselineHandle)) {
                throw new IllegalArgumentException();
            }
            this.setWorkspace(null);
            this.setBaseline((IBaselineHandle)contextHandle);
        }
    }
    
    public IContextHandle getContext() {
        final IWorkspaceHandle workspaceHandle = this.getWorkspace();
        if (workspaceHandle != null) {
            return (IContextHandle)workspaceHandle;
        }
        return (IContextHandle)this.getBaseline();
    }
}
