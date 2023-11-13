// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.filesystem.common.internal.dto.OverlapDescription;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class OverlapDescriptionImpl extends EObjectImpl implements OverlapDescription
{
    protected int ALL_FLAGS;
    protected IVersionableHandle element;
    protected static final int ELEMENT_ESETFLAG = 1;
    protected EList overlappedChildren;
    
    protected OverlapDescriptionImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.OVERLAP_DESCRIPTION;
    }
    
    public IVersionableHandle getElement() {
        if (this.element != null && ((EObject)this.element).eIsProxy()) {
            final InternalEObject oldElement = (InternalEObject)this.element;
            this.element = (IVersionableHandle)this.eResolveProxy(oldElement);
            if (this.element != oldElement && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 0, (Object)oldElement, (Object)this.element));
            }
        }
        return this.element;
    }
    
    public IVersionableHandle basicGetElement() {
        return this.element;
    }
    
    public void setElement(final IVersionableHandle newElement) {
        final IVersionableHandle oldElement = this.element;
        this.element = newElement;
        final boolean oldElementESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldElement, (Object)this.element, !oldElementESet));
        }
    }
    
    public void unsetElement() {
        final IVersionableHandle oldElement = this.element;
        final boolean oldElementESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.element = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldElement, (Object)null, oldElementESet));
        }
    }
    
    public boolean isSetElement() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public List getOverlappedChildren() {
        if (this.overlappedChildren == null) {
            this.overlappedChildren = (EList)new EObjectResolvingEList.Unsettable((Class)IVersionableHandle.class, (InternalEObject)this, 1);
        }
        return (List)this.overlappedChildren;
    }
    
    public void unsetOverlappedChildren() {
        if (this.overlappedChildren != null) {
            ((InternalEList.Unsettable)this.overlappedChildren).unset();
        }
    }
    
    public boolean isSetOverlappedChildren() {
        return this.overlappedChildren != null && ((InternalEList.Unsettable)this.overlappedChildren).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                if (resolve) {
                    return this.getElement();
                }
                return this.basicGetElement();
            }
            case 1: {
                return this.getOverlappedChildren();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setElement((IVersionableHandle)newValue);
            }
            case 1: {
                this.getOverlappedChildren().clear();
                this.getOverlappedChildren().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetElement();
            }
            case 1: {
                this.unsetOverlappedChildren();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetElement();
            }
            case 1: {
                return this.isSetOverlappedChildren();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
