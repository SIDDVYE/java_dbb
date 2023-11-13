// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import com.ibm.team.scm.common.internal.impl.PropertyImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EMap;
import com.ibm.team.filesystem.common.internal.rest.client.resource.CustomAttributesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CustomAttributesDTOImpl extends EObjectImpl implements CustomAttributesDTO
{
    protected int ALL_FLAGS;
    protected static final String FULL_PATH_EDEFAULT;
    protected String fullPath;
    protected static final int FULL_PATH_ESETFLAG = 1;
    protected static final String ITEM_ID_EDEFAULT;
    protected String itemId;
    protected static final int ITEM_ID_ESETFLAG = 2;
    protected EMap customAttributes;
    
    static {
        FULL_PATH_EDEFAULT = null;
        ITEM_ID_EDEFAULT = null;
    }
    
    protected CustomAttributesDTOImpl() {
        this.ALL_FLAGS = 0;
        this.fullPath = CustomAttributesDTOImpl.FULL_PATH_EDEFAULT;
        this.itemId = CustomAttributesDTOImpl.ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.CUSTOM_ATTRIBUTES_DTO;
    }
    
    public String getFullPath() {
        return this.fullPath;
    }
    
    public void setFullPath(final String newFullPath) {
        final String oldFullPath = this.fullPath;
        this.fullPath = newFullPath;
        final boolean oldFullPathESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldFullPath, (Object)this.fullPath, !oldFullPathESet));
        }
    }
    
    public void unsetFullPath() {
        final String oldFullPath = this.fullPath;
        final boolean oldFullPathESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.fullPath = CustomAttributesDTOImpl.FULL_PATH_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldFullPath, (Object)CustomAttributesDTOImpl.FULL_PATH_EDEFAULT, oldFullPathESet));
        }
    }
    
    public boolean isSetFullPath() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getItemId() {
        return this.itemId;
    }
    
    public void setItemId(final String newItemId) {
        final String oldItemId = this.itemId;
        this.itemId = newItemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldItemId, (Object)this.itemId, !oldItemIdESet));
        }
    }
    
    public void unsetItemId() {
        final String oldItemId = this.itemId;
        final boolean oldItemIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.itemId = CustomAttributesDTOImpl.ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldItemId, (Object)CustomAttributesDTOImpl.ITEM_ID_EDEFAULT, oldItemIdESet));
        }
    }
    
    public boolean isSetItemId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public Map getCustomAttributes() {
        if (this.customAttributes == null) {
            this.customAttributes = (EMap)new EcoreEMap.Unsettable(ScmPackage.Literals.PROPERTY, (Class)PropertyImpl.class, (InternalEObject)this, 2);
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
            case 2: {
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
                return this.getFullPath();
            }
            case 1: {
                return this.getItemId();
            }
            case 2: {
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
                this.setFullPath((String)newValue);
            }
            case 1: {
                this.setItemId((String)newValue);
            }
            case 2: {
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
                this.unsetFullPath();
            }
            case 1: {
                this.unsetItemId();
            }
            case 2: {
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
                return this.isSetFullPath();
            }
            case 1: {
                return this.isSetItemId();
            }
            case 2: {
                return this.isSetCustomAttributes();
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
        result.append(" (fullPath: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.fullPath);
        }
        else {
            result.append("<unset>");
        }
        result.append(", itemId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.itemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
