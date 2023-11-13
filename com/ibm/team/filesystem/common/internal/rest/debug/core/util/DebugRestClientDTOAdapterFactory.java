// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeMethodDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeServiceDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRepoDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRootDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeBaseDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeStatisticsDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.PlatformInformationDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticsDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class DebugRestClientDTOAdapterFactory extends AdapterFactoryImpl
{
    protected static DebugRestClientDTOPackage modelPackage;
    protected DebugRestClientDTOSwitch modelSwitch;
    
    public DebugRestClientDTOAdapterFactory() {
        this.modelSwitch = new DebugRestClientDTOSwitch() {
            @Override
            public Object caseStatisticsDTO(final StatisticsDTO object) {
                return DebugRestClientDTOAdapterFactory.this.createStatisticsDTOAdapter();
            }
            
            @Override
            public Object caseStatisticDTO(final StatisticDTO object) {
                return DebugRestClientDTOAdapterFactory.this.createStatisticDTOAdapter();
            }
            
            @Override
            public Object casePlatformInformationDTO(final PlatformInformationDTO object) {
                return DebugRestClientDTOAdapterFactory.this.createPlatformInformationDTOAdapter();
            }
            
            @Override
            public Object caseMetronomeStatisticsDTO(final MetronomeStatisticsDTO object) {
                return DebugRestClientDTOAdapterFactory.this.createMetronomeStatisticsDTOAdapter();
            }
            
            @Override
            public Object caseMetronomeBaseDTO(final MetronomeBaseDTO object) {
                return DebugRestClientDTOAdapterFactory.this.createMetronomeBaseDTOAdapter();
            }
            
            @Override
            public Object caseMetronomeRootDTO(final MetronomeRootDTO object) {
                return DebugRestClientDTOAdapterFactory.this.createMetronomeRootDTOAdapter();
            }
            
            @Override
            public Object caseMetronomeRepoDTO(final MetronomeRepoDTO object) {
                return DebugRestClientDTOAdapterFactory.this.createMetronomeRepoDTOAdapter();
            }
            
            @Override
            public Object caseMetronomeServiceDTO(final MetronomeServiceDTO object) {
                return DebugRestClientDTOAdapterFactory.this.createMetronomeServiceDTOAdapter();
            }
            
            @Override
            public Object caseMetronomeMethodDTO(final MetronomeMethodDTO object) {
                return DebugRestClientDTOAdapterFactory.this.createMetronomeMethodDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return DebugRestClientDTOAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (DebugRestClientDTOAdapterFactory.modelPackage == null) {
            DebugRestClientDTOAdapterFactory.modelPackage = DebugRestClientDTOPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == DebugRestClientDTOAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == DebugRestClientDTOAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createStatisticsDTOAdapter() {
        return null;
    }
    
    public Adapter createStatisticDTOAdapter() {
        return null;
    }
    
    public Adapter createPlatformInformationDTOAdapter() {
        return null;
    }
    
    public Adapter createMetronomeStatisticsDTOAdapter() {
        return null;
    }
    
    public Adapter createMetronomeBaseDTOAdapter() {
        return null;
    }
    
    public Adapter createMetronomeRootDTOAdapter() {
        return null;
    }
    
    public Adapter createMetronomeRepoDTOAdapter() {
        return null;
    }
    
    public Adapter createMetronomeServiceDTOAdapter() {
        return null;
    }
    
    public Adapter createMetronomeMethodDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
