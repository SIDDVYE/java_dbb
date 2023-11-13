// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class PathDTOImpl extends EObjectImpl implements PathDTO
{
    protected int ALL_FLAGS;
    protected EList segments;
    
    protected PathDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.PATH_DTO;
    }
    
    public List getSegments() {
        if (this.segments == null) {
            this.segments = (EList)new EDataTypeEList.Unsettable((Class)String.class, (InternalEObject)this, 0);
        }
        return (List)this.segments;
    }
    
    public void unsetSegments() {
        if (this.segments != null) {
            ((InternalEList.Unsettable)this.segments).unset();
        }
    }
    
    public boolean isSetSegments() {
        return this.segments != null && ((InternalEList.Unsettable)this.segments).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getSegments();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getSegments().clear();
                this.getSegments().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetSegments();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetSegments();
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
        result.append(" (segments: ");
        result.append(this.segments);
        result.append(')');
        return result.toString();
    }
}
