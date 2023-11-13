// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeServiceDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRepoDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class MetronomeRepoDTOImpl extends EObjectImpl implements MetronomeRepoDTO
{
    protected int ALL_FLAGS;
    protected static final String URI_EDEFAULT;
    protected String uri;
    protected static final int URI_ESETFLAG = 1;
    protected static final String REPO_ID_EDEFAULT;
    protected String repoId;
    protected static final int REPO_ID_ESETFLAG = 2;
    protected EList services;
    
    static {
        URI_EDEFAULT = null;
        REPO_ID_EDEFAULT = null;
    }
    
    protected MetronomeRepoDTOImpl() {
        this.ALL_FLAGS = 0;
        this.uri = MetronomeRepoDTOImpl.URI_EDEFAULT;
        this.repoId = MetronomeRepoDTOImpl.REPO_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return DebugRestClientDTOPackage.Literals.METRONOME_REPO_DTO;
    }
    
    public String getUri() {
        return this.uri;
    }
    
    public void setUri(final String newUri) {
        final String oldUri = this.uri;
        this.uri = newUri;
        final boolean oldUriESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldUri, (Object)this.uri, !oldUriESet));
        }
    }
    
    public void unsetUri() {
        final String oldUri = this.uri;
        final boolean oldUriESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.uri = MetronomeRepoDTOImpl.URI_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldUri, (Object)MetronomeRepoDTOImpl.URI_EDEFAULT, oldUriESet));
        }
    }
    
    public boolean isSetUri() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getRepoId() {
        return this.repoId;
    }
    
    public void setRepoId(final String newRepoId) {
        final String oldRepoId = this.repoId;
        this.repoId = newRepoId;
        final boolean oldRepoIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldRepoId, (Object)this.repoId, !oldRepoIdESet));
        }
    }
    
    public void unsetRepoId() {
        final String oldRepoId = this.repoId;
        final boolean oldRepoIdESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.repoId = MetronomeRepoDTOImpl.REPO_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldRepoId, (Object)MetronomeRepoDTOImpl.REPO_ID_EDEFAULT, oldRepoIdESet));
        }
    }
    
    public boolean isSetRepoId() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getServices() {
        if (this.services == null) {
            this.services = (EList)new EObjectResolvingEList.Unsettable((Class)MetronomeServiceDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.services;
    }
    
    public void unsetServices() {
        if (this.services != null) {
            ((InternalEList.Unsettable)this.services).unset();
        }
    }
    
    public boolean isSetServices() {
        return this.services != null && ((InternalEList.Unsettable)this.services).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getUri();
            }
            case 1: {
                return this.getRepoId();
            }
            case 2: {
                return this.getServices();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setUri((String)newValue);
            }
            case 1: {
                this.setRepoId((String)newValue);
            }
            case 2: {
                this.getServices().clear();
                this.getServices().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetUri();
            }
            case 1: {
                this.unsetRepoId();
            }
            case 2: {
                this.unsetServices();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetUri();
            }
            case 1: {
                return this.isSetRepoId();
            }
            case 2: {
                return this.isSetServices();
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
        result.append(" (uri: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.uri);
        }
        else {
            result.append("<unset>");
        }
        result.append(", repoId: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.repoId);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
