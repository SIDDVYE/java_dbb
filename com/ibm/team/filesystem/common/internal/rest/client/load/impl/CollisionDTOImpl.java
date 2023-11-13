// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadLocationDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.CollisionDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CollisionDTOImpl extends EObjectImpl implements CollisionDTO
{
    protected int ALL_FLAGS;
    protected PathDTO path;
    protected static final int PATH_ESETFLAG = 1;
    protected static final String DETAIL_EDEFAULT;
    protected String detail;
    protected static final int DETAIL_ESETFLAG = 2;
    protected EList loadLocations;
    protected static final boolean COLLIDED_WITH_EXISTING_CONTENT_EDEFAULT = false;
    protected static final int COLLIDED_WITH_EXISTING_CONTENT_EFLAG = 4;
    protected static final int COLLIDED_WITH_EXISTING_CONTENT_ESETFLAG = 8;
    protected static final boolean COLLIDED_WITH_EXISTING_SHARE_EDEFAULT = false;
    protected static final int COLLIDED_WITH_EXISTING_SHARE_EFLAG = 16;
    protected static final int COLLIDED_WITH_EXISTING_SHARE_ESETFLAG = 32;
    
    static {
        DETAIL_EDEFAULT = null;
    }
    
    protected CollisionDTOImpl() {
        this.ALL_FLAGS = 0;
        this.detail = CollisionDTOImpl.DETAIL_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOloadPackage.Literals.COLLISION_DTO;
    }
    
    public PathDTO getPath() {
        return this.path;
    }
    
    public NotificationChain basicSetPath(final PathDTO newPath, NotificationChain msgs) {
        final PathDTO oldPath = this.path;
        this.path = newPath;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldPath, (Object)newPath, !oldPathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setPath(final PathDTO newPath) {
        if (newPath != this.path) {
            NotificationChain msgs = null;
            if (this.path != null) {
                msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newPath != null) {
                msgs = ((InternalEObject)newPath).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetPath(newPath, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newPath, (Object)newPath, !oldPathESet));
            }
        }
    }
    
    public NotificationChain basicUnsetPath(NotificationChain msgs) {
        final PathDTO oldPath = this.path;
        this.path = null;
        final boolean oldPathESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldPath, (Object)null, oldPathESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetPath() {
        if (this.path != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.path).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetPath(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldPathESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldPathESet));
            }
        }
    }
    
    public boolean isSetPath() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getDetail() {
        return this.detail;
    }
    
    public void setDetail(final String newDetail) {
        final String oldDetail = this.detail;
        this.detail = newDetail;
        final boolean oldDetailESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldDetail, (Object)this.detail, !oldDetailESet));
        }
    }
    
    public void unsetDetail() {
        final String oldDetail = this.detail;
        final boolean oldDetailESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.detail = CollisionDTOImpl.DETAIL_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldDetail, (Object)CollisionDTOImpl.DETAIL_EDEFAULT, oldDetailESet));
        }
    }
    
    public boolean isSetDetail() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getLoadLocations() {
        if (this.loadLocations == null) {
            this.loadLocations = (EList)new EObjectContainmentEList.Unsettable((Class)LoadLocationDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.loadLocations;
    }
    
    public void unsetLoadLocations() {
        if (this.loadLocations != null) {
            ((InternalEList.Unsettable)this.loadLocations).unset();
        }
    }
    
    public boolean isSetLoadLocations() {
        return this.loadLocations != null && ((InternalEList.Unsettable)this.loadLocations).isSet();
    }
    
    public boolean isCollidedWithExistingContent() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setCollidedWithExistingContent(final boolean newCollidedWithExistingContent) {
        final boolean oldCollidedWithExistingContent = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newCollidedWithExistingContent) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldCollidedWithExistingContentESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, oldCollidedWithExistingContent, newCollidedWithExistingContent, !oldCollidedWithExistingContentESet));
        }
    }
    
    public void unsetCollidedWithExistingContent() {
        final boolean oldCollidedWithExistingContent = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldCollidedWithExistingContentESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, oldCollidedWithExistingContent, false, oldCollidedWithExistingContentESet));
        }
    }
    
    public boolean isSetCollidedWithExistingContent() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public boolean isCollidedWithExistingShare() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public void setCollidedWithExistingShare(final boolean newCollidedWithExistingShare) {
        final boolean oldCollidedWithExistingShare = (this.ALL_FLAGS & 0x10) != 0x0;
        if (newCollidedWithExistingShare) {
            this.ALL_FLAGS |= 0x10;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFEF;
        }
        final boolean oldCollidedWithExistingShareESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldCollidedWithExistingShare, newCollidedWithExistingShare, !oldCollidedWithExistingShareESet));
        }
    }
    
    public void unsetCollidedWithExistingShare() {
        final boolean oldCollidedWithExistingShare = (this.ALL_FLAGS & 0x10) != 0x0;
        final boolean oldCollidedWithExistingShareESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldCollidedWithExistingShare, false, oldCollidedWithExistingShareESet));
        }
    }
    
    public boolean isSetCollidedWithExistingShare() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetPath(msgs);
            }
            case 2: {
                return ((InternalEList)this.getLoadLocations()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getPath();
            }
            case 1: {
                return this.getDetail();
            }
            case 2: {
                return this.getLoadLocations();
            }
            case 3: {
                return this.isCollidedWithExistingContent() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 4: {
                return this.isCollidedWithExistingShare() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setPath((PathDTO)newValue);
            }
            case 1: {
                this.setDetail((String)newValue);
            }
            case 2: {
                this.getLoadLocations().clear();
                this.getLoadLocations().addAll((Collection)newValue);
            }
            case 3: {
                this.setCollidedWithExistingContent((boolean)newValue);
            }
            case 4: {
                this.setCollidedWithExistingShare((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetPath();
            }
            case 1: {
                this.unsetDetail();
            }
            case 2: {
                this.unsetLoadLocations();
            }
            case 3: {
                this.unsetCollidedWithExistingContent();
            }
            case 4: {
                this.unsetCollidedWithExistingShare();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetPath();
            }
            case 1: {
                return this.isSetDetail();
            }
            case 2: {
                return this.isSetLoadLocations();
            }
            case 3: {
                return this.isSetCollidedWithExistingContent();
            }
            case 4: {
                return this.isSetCollidedWithExistingShare();
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
        result.append(" (detail: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.detail);
        }
        else {
            result.append("<unset>");
        }
        result.append(", collidedWithExistingContent: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", collidedWithExistingShare: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append((this.ALL_FLAGS & 0x10) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
