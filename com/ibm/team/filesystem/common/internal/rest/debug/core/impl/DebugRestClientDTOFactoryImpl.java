// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeMethodDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeServiceDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRepoDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRootDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeBaseDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeStatisticsDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.PlatformInformationDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticsDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class DebugRestClientDTOFactoryImpl extends EFactoryImpl implements DebugRestClientDTOFactory
{
    public static DebugRestClientDTOFactory init() {
        try {
            final DebugRestClientDTOFactory theDebugRestClientDTOFactory = (DebugRestClientDTOFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.debug.core");
            if (theDebugRestClientDTOFactory != null) {
                return theDebugRestClientDTOFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new DebugRestClientDTOFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createStatisticsDTO();
            }
            case 1: {
                return (EObject)this.createStatisticDTO();
            }
            case 2: {
                return (EObject)this.createPlatformInformationDTO();
            }
            case 3: {
                return (EObject)this.createMetronomeStatisticsDTO();
            }
            case 4: {
                return (EObject)this.createMetronomeBaseDTO();
            }
            case 5: {
                return (EObject)this.createMetronomeRootDTO();
            }
            case 6: {
                return (EObject)this.createMetronomeRepoDTO();
            }
            case 7: {
                return (EObject)this.createMetronomeServiceDTO();
            }
            case 8: {
                return (EObject)this.createMetronomeMethodDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public StatisticsDTO createStatisticsDTO() {
        final StatisticsDTOImpl statisticsDTO = new StatisticsDTOImpl();
        return statisticsDTO;
    }
    
    public StatisticDTO createStatisticDTO() {
        final StatisticDTOImpl statisticDTO = new StatisticDTOImpl();
        return statisticDTO;
    }
    
    public PlatformInformationDTO createPlatformInformationDTO() {
        final PlatformInformationDTOImpl platformInformationDTO = new PlatformInformationDTOImpl();
        return platformInformationDTO;
    }
    
    public MetronomeStatisticsDTO createMetronomeStatisticsDTO() {
        final MetronomeStatisticsDTOImpl metronomeStatisticsDTO = new MetronomeStatisticsDTOImpl();
        return metronomeStatisticsDTO;
    }
    
    public MetronomeBaseDTO createMetronomeBaseDTO() {
        final MetronomeBaseDTOImpl metronomeBaseDTO = new MetronomeBaseDTOImpl();
        return metronomeBaseDTO;
    }
    
    public MetronomeRootDTO createMetronomeRootDTO() {
        final MetronomeRootDTOImpl metronomeRootDTO = new MetronomeRootDTOImpl();
        return metronomeRootDTO;
    }
    
    public MetronomeRepoDTO createMetronomeRepoDTO() {
        final MetronomeRepoDTOImpl metronomeRepoDTO = new MetronomeRepoDTOImpl();
        return metronomeRepoDTO;
    }
    
    public MetronomeServiceDTO createMetronomeServiceDTO() {
        final MetronomeServiceDTOImpl metronomeServiceDTO = new MetronomeServiceDTOImpl();
        return metronomeServiceDTO;
    }
    
    public MetronomeMethodDTO createMetronomeMethodDTO() {
        final MetronomeMethodDTOImpl metronomeMethodDTO = new MetronomeMethodDTOImpl();
        return metronomeMethodDTO;
    }
    
    public DebugRestClientDTOPackage getDebugRestClientDTOPackage() {
        return (DebugRestClientDTOPackage)this.getEPackage();
    }
    
    @Deprecated
    public static DebugRestClientDTOPackage getPackage() {
        return DebugRestClientDTOPackage.eINSTANCE;
    }
}
