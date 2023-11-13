// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.PathDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoredResourcesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class IgnoredResourcesDTOImpl extends EObjectImpl implements IgnoredResourcesDTO
{
    protected int ALL_FLAGS;
    protected EList ignoredFiles;
    protected EList ignoredFolders;
    protected EList ignoredSymbolicLinks;
    protected EList unknownPaths;
    
    protected IgnoredResourcesDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOignoresPackage.Literals.IGNORED_RESOURCES_DTO;
    }
    
    public List getIgnoredFiles() {
        if (this.ignoredFiles == null) {
            this.ignoredFiles = (EList)new EObjectResolvingEList.Unsettable((Class)PathDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.ignoredFiles;
    }
    
    public void unsetIgnoredFiles() {
        if (this.ignoredFiles != null) {
            ((InternalEList.Unsettable)this.ignoredFiles).unset();
        }
    }
    
    public boolean isSetIgnoredFiles() {
        return this.ignoredFiles != null && ((InternalEList.Unsettable)this.ignoredFiles).isSet();
    }
    
    public List getIgnoredFolders() {
        if (this.ignoredFolders == null) {
            this.ignoredFolders = (EList)new EObjectResolvingEList.Unsettable((Class)PathDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.ignoredFolders;
    }
    
    public void unsetIgnoredFolders() {
        if (this.ignoredFolders != null) {
            ((InternalEList.Unsettable)this.ignoredFolders).unset();
        }
    }
    
    public boolean isSetIgnoredFolders() {
        return this.ignoredFolders != null && ((InternalEList.Unsettable)this.ignoredFolders).isSet();
    }
    
    public List getIgnoredSymbolicLinks() {
        if (this.ignoredSymbolicLinks == null) {
            this.ignoredSymbolicLinks = (EList)new EObjectResolvingEList.Unsettable((Class)PathDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.ignoredSymbolicLinks;
    }
    
    public void unsetIgnoredSymbolicLinks() {
        if (this.ignoredSymbolicLinks != null) {
            ((InternalEList.Unsettable)this.ignoredSymbolicLinks).unset();
        }
    }
    
    public boolean isSetIgnoredSymbolicLinks() {
        return this.ignoredSymbolicLinks != null && ((InternalEList.Unsettable)this.ignoredSymbolicLinks).isSet();
    }
    
    public List getUnknownPaths() {
        if (this.unknownPaths == null) {
            this.unknownPaths = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 3);
        }
        return (List)this.unknownPaths;
    }
    
    public void unsetUnknownPaths() {
        if (this.unknownPaths != null) {
            ((InternalEList.Unsettable)this.unknownPaths).unset();
        }
    }
    
    public boolean isSetUnknownPaths() {
        return this.unknownPaths != null && ((InternalEList.Unsettable)this.unknownPaths).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getIgnoredFiles();
            }
            case 1: {
                return this.getIgnoredFolders();
            }
            case 2: {
                return this.getIgnoredSymbolicLinks();
            }
            case 3: {
                return this.getUnknownPaths();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getIgnoredFiles().clear();
                this.getIgnoredFiles().addAll((Collection)newValue);
            }
            case 1: {
                this.getIgnoredFolders().clear();
                this.getIgnoredFolders().addAll((Collection)newValue);
            }
            case 2: {
                this.getIgnoredSymbolicLinks().clear();
                this.getIgnoredSymbolicLinks().addAll((Collection)newValue);
            }
            case 3: {
                this.getUnknownPaths().clear();
                this.getUnknownPaths().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetIgnoredFiles();
            }
            case 1: {
                this.unsetIgnoredFolders();
            }
            case 2: {
                this.unsetIgnoredSymbolicLinks();
            }
            case 3: {
                this.unsetUnknownPaths();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetIgnoredFiles();
            }
            case 1: {
                return this.isSetIgnoredFolders();
            }
            case 2: {
                return this.isSetIgnoredSymbolicLinks();
            }
            case 3: {
                return this.isSetUnknownPaths();
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
        result.append(" (unknownPaths: ");
        result.append(this.unknownPaths);
        result.append(')');
        return result.toString();
    }
}
