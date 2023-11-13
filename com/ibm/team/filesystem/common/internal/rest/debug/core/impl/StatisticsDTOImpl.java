// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticDTO;
import java.util.List;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticsDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class StatisticsDTOImpl extends EObjectImpl implements StatisticsDTO
{
    protected int ALL_FLAGS;
    protected EList statistics;
    
    protected StatisticsDTOImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return DebugRestClientDTOPackage.Literals.STATISTICS_DTO;
    }
    
    public List getStatistics() {
        if (this.statistics == null) {
            this.statistics = (EList)new EObjectContainmentEList.Unsettable((Class)StatisticDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.statistics;
    }
    
    public void unsetStatistics() {
        if (this.statistics != null) {
            ((InternalEList.Unsettable)this.statistics).unset();
        }
    }
    
    public boolean isSetStatistics() {
        return this.statistics != null && ((InternalEList.Unsettable)this.statistics).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getStatistics()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getStatistics();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getStatistics().clear();
                this.getStatistics().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetStatistics();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetStatistics();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
