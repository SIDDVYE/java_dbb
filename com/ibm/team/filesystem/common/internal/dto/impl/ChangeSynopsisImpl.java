// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collections;
import java.util.Iterator;
import com.ibm.team.filesystem.common.ILogicalChange;
import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.scm.common.dto.INameItemPair;
import java.util.List;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.dto.ChangeSynopsis;

public class ChangeSynopsisImpl extends BasicChangeImpl implements ChangeSynopsis
{
    protected EList sourceParentPath;
    protected EList destinationParentPath;
    
    protected ChangeSynopsisImpl() {
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.CHANGE_SYNOPSIS;
    }
    
    @Override
    public List getSourceParentPath() {
        if (this.sourceParentPath == null) {
            this.sourceParentPath = (EList)new EObjectResolvingEList.Unsettable((Class)INameItemPair.class, (InternalEObject)this, 11);
        }
        return (List)this.sourceParentPath;
    }
    
    @Override
    public void unsetSourceParentPath() {
        if (this.sourceParentPath != null) {
            ((InternalEList.Unsettable)this.sourceParentPath).unset();
        }
    }
    
    @Override
    public boolean isSetSourceParentPath() {
        return this.sourceParentPath != null && ((InternalEList.Unsettable)this.sourceParentPath).isSet();
    }
    
    @Override
    public List getDestinationParentPath() {
        if (this.destinationParentPath == null) {
            this.destinationParentPath = (EList)new EObjectResolvingEList.Unsettable((Class)INameItemPair.class, (InternalEObject)this, 12);
        }
        return (List)this.destinationParentPath;
    }
    
    @Override
    public void unsetDestinationParentPath() {
        if (this.destinationParentPath != null) {
            ((InternalEList.Unsettable)this.destinationParentPath).unset();
        }
    }
    
    @Override
    public boolean isSetDestinationParentPath() {
        return this.destinationParentPath != null && ((InternalEList.Unsettable)this.destinationParentPath).isSet();
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 11: {
                return this.getSourceParentPath();
            }
            case 12: {
                return this.getDestinationParentPath();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 11: {
                this.getSourceParentPath().clear();
                this.getSourceParentPath().addAll((Collection)newValue);
            }
            case 12: {
                this.getDestinationParentPath().clear();
                this.getDestinationParentPath().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 11: {
                this.unsetSourceParentPath();
            }
            case 12: {
                this.unsetDestinationParentPath();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 11: {
                return this.isSetSourceParentPath();
            }
            case 12: {
                return this.isSetDestinationParentPath();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public String[] getNewPathHint() {
        if (!this.isChangeType(8)) {
            return null;
        }
        final List<INameItemPair> newPathHint = (List<INameItemPair>)this.getDestinationParentPath();
        if (newPathHint.size() > 0) {
            final String[] path = new String[newPathHint.size() - 1];
            int i = 0;
            final Iterator<INameItemPair> iterator = newPathHint.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                final INameItemPair pair = iterator.next();
                path[i] = pair.getName();
                ++i;
            }
            return path;
        }
        return new String[] { ILogicalChange.UNKNOWN_PATH };
    }
    
    public String[] getPathHint() {
        List<INameItemPair> pathHint;
        if (this.isChangeType(1)) {
            pathHint = (List<INameItemPair>)this.getDestinationParentPath();
        }
        else {
            pathHint = (List<INameItemPair>)this.getSourceParentPath();
        }
        if (pathHint == null || pathHint.size() < 2) {
            return new String[] { ILogicalChange.UNKNOWN_PATH };
        }
        final String[] path = new String[pathHint.size() - 1];
        int i = 0;
        final Iterator<INameItemPair> iterator = pathHint.iterator();
        iterator.next();
        while (iterator.hasNext()) {
            final INameItemPair pair = iterator.next();
            path[i] = pair.getName();
            ++i;
        }
        return path;
    }
    
    public List<INameItemPair> getAncestorPathHint() {
        List<INameItemPair> pathHint;
        if (this.isChangeType(1)) {
            pathHint = (List<INameItemPair>)this.getDestinationParentPath();
        }
        else {
            pathHint = (List<INameItemPair>)this.getSourceParentPath();
        }
        if (pathHint == null) {
            return (List<INameItemPair>)Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList((List<? extends INameItemPair>)pathHint);
    }
    
    public List<INameItemPair> getNewAncestorPathHint() {
        if (!this.isChangeType(8)) {
            return null;
        }
        final List<INameItemPair> newPathHint = (List<INameItemPair>)this.getDestinationParentPath();
        if (newPathHint == null) {
            return (List<INameItemPair>)Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList((List<? extends INameItemPair>)newPathHint);
    }
}
