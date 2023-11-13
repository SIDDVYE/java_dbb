// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import java.util.Collection;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeServiceDTO;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeMethodDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeStatisticsDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class MetronomeStatisticsDTOImpl extends EObjectImpl implements MetronomeStatisticsDTO
{
    protected int ALL_FLAGS;
    protected EList methodStats;
    protected EList serviceStats;
    
    protected MetronomeStatisticsDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return DebugRestClientDTOPackage.Literals.METRONOME_STATISTICS_DTO;
    }
    
    public List getMethodStats() {
        if (this.methodStats == null) {
            this.methodStats = (EList)new EObjectResolvingEList.Unsettable((Class)MetronomeMethodDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.methodStats;
    }
    
    public void unsetMethodStats() {
        if (this.methodStats != null) {
            ((InternalEList.Unsettable)this.methodStats).unset();
        }
    }
    
    public boolean isSetMethodStats() {
        return this.methodStats != null && ((InternalEList.Unsettable)this.methodStats).isSet();
    }
    
    public List getServiceStats() {
        if (this.serviceStats == null) {
            this.serviceStats = (EList)new EObjectResolvingEList.Unsettable((Class)MetronomeServiceDTO.class, (InternalEObject)this, 1);
        }
        return (List)this.serviceStats;
    }
    
    public void unsetServiceStats() {
        if (this.serviceStats != null) {
            ((InternalEList.Unsettable)this.serviceStats).unset();
        }
    }
    
    public boolean isSetServiceStats() {
        return this.serviceStats != null && ((InternalEList.Unsettable)this.serviceStats).isSet();
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getMethodStats();
            }
            case 1: {
                return this.getServiceStats();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getMethodStats().clear();
                this.getMethodStats().addAll((Collection)newValue);
            }
            case 1: {
                this.getServiceStats().clear();
                this.getServiceStats().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetMethodStats();
            }
            case 1: {
                this.unsetServiceStats();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetMethodStats();
            }
            case 1: {
                return this.isSetServiceStats();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
