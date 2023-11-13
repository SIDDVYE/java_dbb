// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collection;
import com.ibm.team.filesystem.common.internal.dto.OverlapResponse;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import com.ibm.team.filesystem.common.internal.dto.SharePoint;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.IFileAreaUpdate;
import java.util.List;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdateReport;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class FileAreaUpdateReportImpl extends EObjectImpl implements FileAreaUpdateReport
{
    protected int ALL_FLAGS;
    protected EList adds;
    protected EList moves;
    protected EList deletes;
    protected EList modifies;
    protected EList shareParents;
    protected EList copyFileAreasWithOverlaps;
    protected EList overlaps;
    
    protected FileAreaUpdateReportImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.FILE_AREA_UPDATE_REPORT;
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
    
    public List getShareParents() {
        if (this.shareParents == null) {
            this.shareParents = (EList)new EObjectResolvingEList.Unsettable((Class)SharePoint.class, (InternalEObject)this, 4);
        }
        return (List)this.shareParents;
    }
    
    public void unsetShareParents() {
        if (this.shareParents != null) {
            ((InternalEList.Unsettable)this.shareParents).unset();
        }
    }
    
    public boolean isSetShareParents() {
        return this.shareParents != null && ((InternalEList.Unsettable)this.shareParents).isSet();
    }
    
    public List getCopyFileAreasWithOverlaps() {
        if (this.copyFileAreasWithOverlaps == null) {
            this.copyFileAreasWithOverlaps = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 5);
        }
        return (List)this.copyFileAreasWithOverlaps;
    }
    
    public void unsetCopyFileAreasWithOverlaps() {
        if (this.copyFileAreasWithOverlaps != null) {
            ((InternalEList.Unsettable)this.copyFileAreasWithOverlaps).unset();
        }
    }
    
    public boolean isSetCopyFileAreasWithOverlaps() {
        return this.copyFileAreasWithOverlaps != null && ((InternalEList.Unsettable)this.copyFileAreasWithOverlaps).isSet();
    }
    
    public List getOverlaps() {
        if (this.overlaps == null) {
            this.overlaps = (EList)new EObjectResolvingEList.Unsettable((Class)OverlapResponse.class, (InternalEObject)this, 6);
        }
        return (List)this.overlaps;
    }
    
    public void unsetOverlaps() {
        if (this.overlaps != null) {
            ((InternalEList.Unsettable)this.overlaps).unset();
        }
    }
    
    public boolean isSetOverlaps() {
        return this.overlaps != null && ((InternalEList.Unsettable)this.overlaps).isSet();
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
            case 4: {
                return this.getShareParents();
            }
            case 5: {
                return this.getCopyFileAreasWithOverlaps();
            }
            case 6: {
                return this.getOverlaps();
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
            case 4: {
                this.getShareParents().clear();
                this.getShareParents().addAll((Collection)newValue);
            }
            case 5: {
                this.getCopyFileAreasWithOverlaps().clear();
                this.getCopyFileAreasWithOverlaps().addAll((Collection)newValue);
            }
            case 6: {
                this.getOverlaps().clear();
                this.getOverlaps().addAll((Collection)newValue);
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
            case 4: {
                this.unsetShareParents();
            }
            case 5: {
                this.unsetCopyFileAreasWithOverlaps();
            }
            case 6: {
                this.unsetOverlaps();
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
            case 4: {
                return this.isSetShareParents();
            }
            case 5: {
                return this.isSetCopyFileAreasWithOverlaps();
            }
            case 6: {
                return this.isSetOverlaps();
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
        result.append(" (copyFileAreasWithOverlaps: ");
        result.append(this.copyFileAreasWithOverlaps);
        result.append(')');
        return result.toString();
    }
}
