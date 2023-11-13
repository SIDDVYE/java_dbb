// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.HierarchyDTO;
import com.ibm.team.repository.common.model.impl.HelperImpl;

public class HierarchyDTOImpl extends HelperImpl implements HierarchyDTO
{
    protected int ALL_FLAGS;
    protected static final String NAME_EDEFAULT;
    protected String name;
    protected static final int NAME_ESETFLAG = 2;
    protected EList ancestorPath;
    protected static final boolean ROOT_EDEFAULT = false;
    protected static final int ROOT_EFLAG = 4;
    protected static final int ROOT_ESETFLAG = 8;
    protected static final boolean BRANCH_CONTAINS_CYCLES_EDEFAULT = false;
    protected static final int BRANCH_CONTAINS_CYCLES_EFLAG = 16;
    protected static final int BRANCH_CONTAINS_CYCLES_ESETFLAG = 32;
    protected static final boolean IN_CYCLE_EDEFAULT = false;
    protected static final int IN_CYCLE_EFLAG = 64;
    protected static final int IN_CYCLE_ESETFLAG = 128;
    protected static final String COMPONENT_ITEM_ID_EDEFAULT;
    protected String componentItemId;
    protected static final int COMPONENT_ITEM_ID_ESETFLAG = 256;
    protected static final boolean ACCESSIBLE_EDEFAULT = false;
    protected static final int ACCESSIBLE_EFLAG = 512;
    protected static final int ACCESSIBLE_ESETFLAG = 1024;
    private static final int EOFFSET_CORRECTION;
    
    static {
        NAME_EDEFAULT = null;
        COMPONENT_ITEM_ID_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemRestClientDTOcorePackage.Literals.HIERARCHY_DTO.getFeatureID((EStructuralFeature)FilesystemRestClientDTOcorePackage.Literals.HIERARCHY_DTO__NAME) - 1;
    }
    
    protected HierarchyDTOImpl() {
        this.ALL_FLAGS = 0;
        this.name = HierarchyDTOImpl.NAME_EDEFAULT;
        this.componentItemId = HierarchyDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.HIERARCHY_DTO;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1 + HierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldName, (Object)this.name, !oldNameESet));
        }
    }
    
    public void unsetName() {
        final String oldName = this.name;
        final boolean oldNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.name = HierarchyDTOImpl.NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1 + HierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldName, (Object)HierarchyDTOImpl.NAME_EDEFAULT, oldNameESet));
        }
    }
    
    public boolean isSetName() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getAncestorPath() {
        if (this.ancestorPath == null) {
            this.ancestorPath = (EList)new EDataTypeUniqueEList.Unsettable((Class)String.class, (InternalEObject)this, 2 + HierarchyDTOImpl.EOFFSET_CORRECTION);
        }
        return (List)this.ancestorPath;
    }
    
    public void unsetAncestorPath() {
        if (this.ancestorPath != null) {
            ((InternalEList.Unsettable)this.ancestorPath).unset();
        }
    }
    
    public boolean isSetAncestorPath() {
        return this.ancestorPath != null && ((InternalEList.Unsettable)this.ancestorPath).isSet();
    }
    
    public boolean isRoot() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setRoot(final boolean newRoot) {
        final boolean oldRoot = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newRoot) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldRootESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3 + HierarchyDTOImpl.EOFFSET_CORRECTION, oldRoot, newRoot, !oldRootESet));
        }
    }
    
    public void unsetRoot() {
        final boolean oldRoot = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldRootESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3 + HierarchyDTOImpl.EOFFSET_CORRECTION, oldRoot, false, oldRootESet));
        }
    }
    
    public boolean isSetRoot() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public boolean isBranchContainsCycles() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public void setBranchContainsCycles(final boolean newBranchContainsCycles) {
        final boolean oldBranchContainsCycles = (this.ALL_FLAGS & 0x10) != 0x0;
        if (newBranchContainsCycles) {
            this.ALL_FLAGS |= 0x10;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFEF;
        }
        final boolean oldBranchContainsCyclesESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4 + HierarchyDTOImpl.EOFFSET_CORRECTION, oldBranchContainsCycles, newBranchContainsCycles, !oldBranchContainsCyclesESet));
        }
    }
    
    public void unsetBranchContainsCycles() {
        final boolean oldBranchContainsCycles = (this.ALL_FLAGS & 0x10) != 0x0;
        final boolean oldBranchContainsCyclesESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4 + HierarchyDTOImpl.EOFFSET_CORRECTION, oldBranchContainsCycles, false, oldBranchContainsCyclesESet));
        }
    }
    
    public boolean isSetBranchContainsCycles() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public boolean isInCycle() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public void setInCycle(final boolean newInCycle) {
        final boolean oldInCycle = (this.ALL_FLAGS & 0x40) != 0x0;
        if (newInCycle) {
            this.ALL_FLAGS |= 0x40;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFBF;
        }
        final boolean oldInCycleESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5 + HierarchyDTOImpl.EOFFSET_CORRECTION, oldInCycle, newInCycle, !oldInCycleESet));
        }
    }
    
    public void unsetInCycle() {
        final boolean oldInCycle = (this.ALL_FLAGS & 0x40) != 0x0;
        final boolean oldInCycleESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5 + HierarchyDTOImpl.EOFFSET_CORRECTION, oldInCycle, false, oldInCycleESet));
        }
    }
    
    public boolean isSetInCycle() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public String getComponentItemId() {
        return this.componentItemId;
    }
    
    public void setComponentItemId(final String newComponentItemId) {
        final String oldComponentItemId = this.componentItemId;
        this.componentItemId = newComponentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6 + HierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldComponentItemId, (Object)this.componentItemId, !oldComponentItemIdESet));
        }
    }
    
    public void unsetComponentItemId() {
        final String oldComponentItemId = this.componentItemId;
        final boolean oldComponentItemIdESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.componentItemId = HierarchyDTOImpl.COMPONENT_ITEM_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6 + HierarchyDTOImpl.EOFFSET_CORRECTION, (Object)oldComponentItemId, (Object)HierarchyDTOImpl.COMPONENT_ITEM_ID_EDEFAULT, oldComponentItemIdESet));
        }
    }
    
    public boolean isSetComponentItemId() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public boolean isAccessible() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public void setAccessible(final boolean newAccessible) {
        final boolean oldAccessible = (this.ALL_FLAGS & 0x200) != 0x0;
        if (newAccessible) {
            this.ALL_FLAGS |= 0x200;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFDFF;
        }
        final boolean oldAccessibleESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS |= 0x400;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7 + HierarchyDTOImpl.EOFFSET_CORRECTION, oldAccessible, newAccessible, !oldAccessibleESet));
        }
    }
    
    public void unsetAccessible() {
        final boolean oldAccessible = (this.ALL_FLAGS & 0x200) != 0x0;
        final boolean oldAccessibleESet = (this.ALL_FLAGS & 0x400) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        this.ALL_FLAGS &= 0xFFFFFBFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7 + HierarchyDTOImpl.EOFFSET_CORRECTION, oldAccessible, false, oldAccessibleESet));
        }
    }
    
    public boolean isSetAccessible() {
        return (this.ALL_FLAGS & 0x400) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - HierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.getName();
            }
            case 2: {
                return this.getAncestorPath();
            }
            case 3: {
                return this.isRoot() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 4: {
                return this.isBranchContainsCycles() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 5: {
                return this.isInCycle() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 6: {
                return this.getComponentItemId();
            }
            case 7: {
                return this.isAccessible() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - HierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.setName((String)newValue);
            }
            case 2: {
                this.getAncestorPath().clear();
                this.getAncestorPath().addAll((Collection)newValue);
            }
            case 3: {
                this.setRoot((boolean)newValue);
            }
            case 4: {
                this.setBranchContainsCycles((boolean)newValue);
            }
            case 5: {
                this.setInCycle((boolean)newValue);
            }
            case 6: {
                this.setComponentItemId((String)newValue);
            }
            case 7: {
                this.setAccessible((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - HierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                this.unsetName();
            }
            case 2: {
                this.unsetAncestorPath();
            }
            case 3: {
                this.unsetRoot();
            }
            case 4: {
                this.unsetBranchContainsCycles();
            }
            case 5: {
                this.unsetInCycle();
            }
            case 6: {
                this.unsetComponentItemId();
            }
            case 7: {
                this.unsetAccessible();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - HierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return this.isSetName();
            }
            case 2: {
                return this.isSetAncestorPath();
            }
            case 3: {
                return this.isSetRoot();
            }
            case 4: {
                return this.isSetBranchContainsCycles();
            }
            case 5: {
                return this.isSetInCycle();
            }
            case 6: {
                return this.isSetComponentItemId();
            }
            case 7: {
                return this.isSetAccessible();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass != HierarchyDTO.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - HierarchyDTOImpl.EOFFSET_CORRECTION) {
            case 1: {
                return 1 + HierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 2: {
                return 2 + HierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 3: {
                return 3 + HierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 4: {
                return 4 + HierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 5: {
                return 5 + HierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 6: {
                return 6 + HierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            case 7: {
                return 7 + HierarchyDTOImpl.EOFFSET_CORRECTION;
            }
            default: {
                return -1;
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.name);
        }
        else {
            result.append("<unset>");
        }
        result.append(", ancestorPath: ");
        result.append(this.ancestorPath);
        result.append(", root: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", branchContainsCycles: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append((this.ALL_FLAGS & 0x10) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", inCycle: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append((this.ALL_FLAGS & 0x40) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", componentItemId: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append(this.componentItemId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", accessible: ");
        if ((this.ALL_FLAGS & 0x400) != 0x0) {
            result.append((this.ALL_FLAGS & 0x200) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
