// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core;

import com.ibm.team.filesystem.common.internal.rest.debug.core.impl.DebugRestClientDTOFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface DebugRestClientDTOFactory extends EFactory
{
    public static final DebugRestClientDTOFactory eINSTANCE = DebugRestClientDTOFactoryImpl.init();
    
    StatisticsDTO createStatisticsDTO();
    
    StatisticDTO createStatisticDTO();
    
    PlatformInformationDTO createPlatformInformationDTO();
    
    MetronomeStatisticsDTO createMetronomeStatisticsDTO();
    
    MetronomeBaseDTO createMetronomeBaseDTO();
    
    MetronomeRootDTO createMetronomeRootDTO();
    
    MetronomeRepoDTO createMetronomeRepoDTO();
    
    MetronomeServiceDTO createMetronomeServiceDTO();
    
    MetronomeMethodDTO createMetronomeMethodDTO();
    
    DebugRestClientDTOPackage getDebugRestClientDTOPackage();
}
