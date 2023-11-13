// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.rest.client.core.ShareableDTO;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.resource.MimeTypeErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.PropertyFailureDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.BackupInShedDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.client.resource.LineDelimiterErrorDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcePropertyChangeResultDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ResourcePropertyChangeResultDTOImpl extends EObjectImpl implements ResourcePropertyChangeResultDTO
{
    protected int ALL_FLAGS;
    protected static final boolean CANCELLED_EDEFAULT = false;
    protected static final int CANCELLED_EFLAG = 1;
    protected static final int CANCELLED_ESETFLAG = 2;
    protected EList lineDelimiterFailures;
    protected EList backedUpToShed;
    protected EList propertyFailures;
    protected EList mimeTypeFailures;
    protected EList executableFailures;
    
    protected ResourcePropertyChangeResultDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.RESOURCE_PROPERTY_CHANGE_RESULT_DTO;
    }
    
    public boolean isCancelled() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public void setCancelled(final boolean newCancelled) {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x1) != 0x0;
        if (newCancelled) {
            this.ALL_FLAGS |= 0x1;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFE;
        }
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, oldCancelled, newCancelled, !oldCancelledESet));
        }
    }
    
    public void unsetCancelled() {
        final boolean oldCancelled = (this.ALL_FLAGS & 0x1) != 0x0;
        final boolean oldCancelledESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, oldCancelled, false, oldCancelledESet));
        }
    }
    
    public boolean isSetCancelled() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getLineDelimiterFailures() {
        if (this.lineDelimiterFailures == null) {
            this.lineDelimiterFailures = (EList)new EObjectContainmentEList.Unsettable((Class)LineDelimiterErrorDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.lineDelimiterFailures;
    }
    
    public void unsetLineDelimiterFailures() {
        if (this.lineDelimiterFailures != null) {
            ((InternalEList.Unsettable)this.lineDelimiterFailures).unset();
        }
    }
    
    public boolean isSetLineDelimiterFailures() {
        return this.lineDelimiterFailures != null && ((InternalEList.Unsettable)this.lineDelimiterFailures).isSet();
    }
    
    public List getBackedUpToShed() {
        if (this.backedUpToShed == null) {
            this.backedUpToShed = (EList)new EObjectContainmentEList.Unsettable((Class)BackupInShedDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.backedUpToShed;
    }
    
    public void unsetBackedUpToShed() {
        if (this.backedUpToShed != null) {
            ((InternalEList.Unsettable)this.backedUpToShed).unset();
        }
    }
    
    public boolean isSetBackedUpToShed() {
        return this.backedUpToShed != null && ((InternalEList.Unsettable)this.backedUpToShed).isSet();
    }
    
    public List getPropertyFailures() {
        if (this.propertyFailures == null) {
            this.propertyFailures = (EList)new EObjectContainmentEList.Unsettable((Class)PropertyFailureDTO.class, (InternalEObject)this, 3);
        }
        return (List)this.propertyFailures;
    }
    
    public void unsetPropertyFailures() {
        if (this.propertyFailures != null) {
            ((InternalEList.Unsettable)this.propertyFailures).unset();
        }
    }
    
    public boolean isSetPropertyFailures() {
        return this.propertyFailures != null && ((InternalEList.Unsettable)this.propertyFailures).isSet();
    }
    
    public List getMimeTypeFailures() {
        if (this.mimeTypeFailures == null) {
            this.mimeTypeFailures = (EList)new EObjectResolvingEList.Unsettable((Class)MimeTypeErrorDTO.class, (InternalEObject)this, 4);
        }
        return (List)this.mimeTypeFailures;
    }
    
    public void unsetMimeTypeFailures() {
        if (this.mimeTypeFailures != null) {
            ((InternalEList.Unsettable)this.mimeTypeFailures).unset();
        }
    }
    
    public boolean isSetMimeTypeFailures() {
        return this.mimeTypeFailures != null && ((InternalEList.Unsettable)this.mimeTypeFailures).isSet();
    }
    
    public List getExecutableFailures() {
        if (this.executableFailures == null) {
            this.executableFailures = (EList)new EObjectResolvingEList.Unsettable((Class)ShareableDTO.class, (InternalEObject)this, 5);
        }
        return (List)this.executableFailures;
    }
    
    public void unsetExecutableFailures() {
        if (this.executableFailures != null) {
            ((InternalEList.Unsettable)this.executableFailures).unset();
        }
    }
    
    public boolean isSetExecutableFailures() {
        return this.executableFailures != null && ((InternalEList.Unsettable)this.executableFailures).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 1: {
                return ((InternalEList)this.getLineDelimiterFailures()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return ((InternalEList)this.getBackedUpToShed()).basicRemove((Object)otherEnd, msgs);
            }
            case 3: {
                return ((InternalEList)this.getPropertyFailures()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.isCancelled() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 1: {
                return this.getLineDelimiterFailures();
            }
            case 2: {
                return this.getBackedUpToShed();
            }
            case 3: {
                return this.getPropertyFailures();
            }
            case 4: {
                return this.getMimeTypeFailures();
            }
            case 5: {
                return this.getExecutableFailures();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setCancelled((boolean)newValue);
            }
            case 1: {
                this.getLineDelimiterFailures().clear();
                this.getLineDelimiterFailures().addAll((Collection)newValue);
            }
            case 2: {
                this.getBackedUpToShed().clear();
                this.getBackedUpToShed().addAll((Collection)newValue);
            }
            case 3: {
                this.getPropertyFailures().clear();
                this.getPropertyFailures().addAll((Collection)newValue);
            }
            case 4: {
                this.getMimeTypeFailures().clear();
                this.getMimeTypeFailures().addAll((Collection)newValue);
            }
            case 5: {
                this.getExecutableFailures().clear();
                this.getExecutableFailures().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetCancelled();
            }
            case 1: {
                this.unsetLineDelimiterFailures();
            }
            case 2: {
                this.unsetBackedUpToShed();
            }
            case 3: {
                this.unsetPropertyFailures();
            }
            case 4: {
                this.unsetMimeTypeFailures();
            }
            case 5: {
                this.unsetExecutableFailures();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetCancelled();
            }
            case 1: {
                return this.isSetLineDelimiterFailures();
            }
            case 2: {
                return this.isSetBackedUpToShed();
            }
            case 3: {
                return this.isSetPropertyFailures();
            }
            case 4: {
                return this.isSetMimeTypeFailures();
            }
            case 5: {
                return this.isSetExecutableFailures();
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
        result.append(" (cancelled: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append((this.ALL_FLAGS & 0x1) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
