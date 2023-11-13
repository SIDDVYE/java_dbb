// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.dto.Resolution;
import java.util.List;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolutionReport;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ConflictResolutionReportImpl extends EObjectImpl implements ConflictResolutionReport
{
    protected int ALL_FLAGS;
    protected EList resolutions;
    
    protected ConflictResolutionReportImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.CONFLICT_RESOLUTION_REPORT;
    }
    
    public List getResolutions() {
        if (this.resolutions == null) {
            this.resolutions = (EList)new EObjectContainmentEList.Unsettable(Resolution.class, this, 0) {
                protected boolean isUnique() {
                    return false;
                }
            };
        }
        return (List)this.resolutions;
    }
    
    public void unsetResolutions() {
        if (this.resolutions != null) {
            ((InternalEList.Unsettable)this.resolutions).unset();
        }
    }
    
    public boolean isSetResolutions() {
        return this.resolutions != null && ((InternalEList.Unsettable)this.resolutions).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getResolutions()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getResolutions();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getResolutions().clear();
                this.getResolutions().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetResolutions();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetResolutions();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
