// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.util;

import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeMethodDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeServiceDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRepoDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRootDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeBaseDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeStatisticsDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.PlatformInformationDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticsDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;

public class DebugRestClientDTOSwitch
{
    protected static DebugRestClientDTOPackage modelPackage;
    
    public DebugRestClientDTOSwitch() {
        if (DebugRestClientDTOSwitch.modelPackage == null) {
            DebugRestClientDTOSwitch.modelPackage = DebugRestClientDTOPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == DebugRestClientDTOSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final StatisticsDTO statisticsDTO = (StatisticsDTO)theEObject;
                Object result = this.caseStatisticsDTO(statisticsDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final StatisticDTO statisticDTO = (StatisticDTO)theEObject;
                Object result = this.caseStatisticDTO(statisticDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final PlatformInformationDTO platformInformationDTO = (PlatformInformationDTO)theEObject;
                Object result = this.casePlatformInformationDTO(platformInformationDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final MetronomeStatisticsDTO metronomeStatisticsDTO = (MetronomeStatisticsDTO)theEObject;
                Object result = this.caseMetronomeStatisticsDTO(metronomeStatisticsDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final MetronomeBaseDTO metronomeBaseDTO = (MetronomeBaseDTO)theEObject;
                Object result = this.caseMetronomeBaseDTO(metronomeBaseDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final MetronomeRootDTO metronomeRootDTO = (MetronomeRootDTO)theEObject;
                Object result = this.caseMetronomeRootDTO(metronomeRootDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final MetronomeRepoDTO metronomeRepoDTO = (MetronomeRepoDTO)theEObject;
                Object result = this.caseMetronomeRepoDTO(metronomeRepoDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final MetronomeServiceDTO metronomeServiceDTO = (MetronomeServiceDTO)theEObject;
                Object result = this.caseMetronomeServiceDTO(metronomeServiceDTO);
                if (result == null) {
                    result = this.caseMetronomeBaseDTO(metronomeServiceDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 8: {
                final MetronomeMethodDTO metronomeMethodDTO = (MetronomeMethodDTO)theEObject;
                Object result = this.caseMetronomeMethodDTO(metronomeMethodDTO);
                if (result == null) {
                    result = this.caseMetronomeBaseDTO(metronomeMethodDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            default: {
                return this.defaultCase(theEObject);
            }
        }
    }
    
    public Object caseStatisticsDTO(final StatisticsDTO object) {
        return null;
    }
    
    public Object caseStatisticDTO(final StatisticDTO object) {
        return null;
    }
    
    public Object casePlatformInformationDTO(final PlatformInformationDTO object) {
        return null;
    }
    
    public Object caseMetronomeStatisticsDTO(final MetronomeStatisticsDTO object) {
        return null;
    }
    
    public Object caseMetronomeBaseDTO(final MetronomeBaseDTO object) {
        return null;
    }
    
    public Object caseMetronomeRootDTO(final MetronomeRootDTO object) {
        return null;
    }
    
    public Object caseMetronomeRepoDTO(final MetronomeRepoDTO object) {
        return null;
    }
    
    public Object caseMetronomeServiceDTO(final MetronomeServiceDTO object) {
        return null;
    }
    
    public Object caseMetronomeMethodDTO(final MetronomeMethodDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
