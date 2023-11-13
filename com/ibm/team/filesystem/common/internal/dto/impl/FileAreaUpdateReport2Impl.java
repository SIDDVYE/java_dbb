// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.IFileAreaUpdate;
import java.util.List;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdateReport2;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class FileAreaUpdateReport2Impl extends EObjectImpl implements FileAreaUpdateReport2
{
    protected int ALL_FLAGS;
    protected EList adds;
    protected EList moves;
    protected EList deletes;
    protected EList modifies;
    
    protected FileAreaUpdateReport2Impl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.FILE_AREA_UPDATE_REPORT2;
    }
    
    public List getAdds() {
        if (this.adds == null) {
            this.adds = (EList)new EObjectResolvingEList.Unsettable((Class)IFileAreaUpdate.class, (InternalEObject)this, 0);
        }
        return (List)this.adds;
    }
    
    public void unsetAdds() {
        if (this.adds != null) {
            ((InternalEList.Unsettable)this.adds).unset();
        }
    }
    
    public boolean isSetAdds() {
        return this.adds != null && ((InternalEList.Unsettable)this.adds).isSet();
    }
    
    public List getMoves() {
        if (this.moves == null) {
            this.moves = (EList)new EObjectResolvingEList.Unsettable((Class)IFileAreaUpdate.class, (InternalEObject)this, 1);
        }
        return (List)this.moves;
    }
    
    public void unsetMoves() {
        if (this.moves != null) {
            ((InternalEList.Unsettable)this.moves).unset();
        }
    }
    
    public boolean isSetMoves() {
        return this.moves != null && ((InternalEList.Unsettable)this.moves).isSet();
    }
    
    public List getDeletes() {
        if (this.deletes == null) {
            this.deletes = (EList)new EObjectResolvingEList.Unsettable((Class)IFileAreaUpdate.class, (InternalEObject)this, 2);
        }
        return (List)this.deletes;
    }
    
    public void unsetDeletes() {
        if (this.deletes != null) {
            ((InternalEList.Unsettable)this.deletes).unset();
        }
    }
    
    public boolean isSetDeletes() {
        return this.deletes != null && ((InternalEList.Unsettable)this.deletes).isSet();
    }
    
    public List getModifies() {
        if (this.modifies == null) {
            this.modifies = (EList)new EObjectResolvingEList.Unsettable((Class)IFileAreaUpdate.class, (InternalEObject)this, 3);
        }
        return (List)this.modifies;
    }
    
    public void unsetModifies() {
        if (this.modifies != null) {
            ((InternalEList.Unsettable)this.modifies).unset();
        }
    }
    
    public boolean isSetModifies() {
        return this.modifies != null && ((InternalEList.Unsettable)this.modifies).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getAdds();
            }
            case 1: {
                return this.getMoves();
            }
            case 2: {
                return this.getDeletes();
            }
            case 3: {
                return this.getModifies();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getAdds().clear();
                this.getAdds().addAll((Collection)newValue);
            }
            case 1: {
                this.getMoves().clear();
                this.getMoves().addAll((Collection)newValue);
            }
            case 2: {
                this.getDeletes().clear();
                this.getDeletes().addAll((Collection)newValue);
            }
            case 3: {
                this.getModifies().clear();
                this.getModifies().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetAdds();
            }
            case 1: {
                this.unsetMoves();
            }
            case 2: {
                this.unsetDeletes();
            }
            case 3: {
                this.unsetModifies();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetAdds();
            }
            case 1: {
                return this.isSetMoves();
            }
            case 2: {
                return this.isSetDeletes();
            }
            case 3: {
                return this.isSetModifies();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
