// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.debug.core.impl.DebugRestClientDTOPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface DebugRestClientDTOPackage extends EPackage
{
    public static final String eNAME = "core";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.debug.core";
    public static final String eNS_PREFIX = "filesystemRestClientDTOdebug";
    public static final DebugRestClientDTOPackage eINSTANCE = DebugRestClientDTOPackageImpl.init();
    public static final int STATISTICS_DTO = 0;
    public static final int STATISTICS_DTO__STATISTICS = 0;
    public static final int STATISTICS_DTO_FEATURE_COUNT = 1;
    public static final int STATISTIC_DTO = 1;
    public static final int STATISTIC_DTO__CONTEXT_TYPE = 0;
    public static final int STATISTIC_DTO__CONTEXT = 1;
    public static final int STATISTIC_DTO__STATISTIC_NAME = 2;
    public static final int STATISTIC_DTO__VALUE = 3;
    public static final int STATISTIC_DTO_FEATURE_COUNT = 4;
    public static final int PLATFORM_INFORMATION_DTO = 2;
    public static final int PLATFORM_INFORMATION_DTO__ECLIPSE_WORKSPACE_PATH = 0;
    public static final int PLATFORM_INFORMATION_DTO__USER_CONFIGURATION_PATH = 1;
    public static final int PLATFORM_INFORMATION_DTO_FEATURE_COUNT = 2;
    public static final int METRONOME_STATISTICS_DTO = 3;
    public static final int METRONOME_STATISTICS_DTO__METHOD_STATS = 0;
    public static final int METRONOME_STATISTICS_DTO__SERVICE_STATS = 1;
    public static final int METRONOME_STATISTICS_DTO_FEATURE_COUNT = 2;
    public static final int METRONOME_BASE_DTO = 4;
    public static final int METRONOME_BASE_DTO__NAME = 0;
    public static final int METRONOME_BASE_DTO__ELAPSED_TIME = 1;
    public static final int METRONOME_BASE_DTO__CALL_COUNT = 2;
    public static final int METRONOME_BASE_DTO_FEATURE_COUNT = 3;
    public static final int METRONOME_ROOT_DTO = 5;
    public static final int METRONOME_ROOT_DTO__REPOS = 0;
    public static final int METRONOME_ROOT_DTO_FEATURE_COUNT = 1;
    public static final int METRONOME_REPO_DTO = 6;
    public static final int METRONOME_REPO_DTO__URI = 0;
    public static final int METRONOME_REPO_DTO__REPO_ID = 1;
    public static final int METRONOME_REPO_DTO__SERVICES = 2;
    public static final int METRONOME_REPO_DTO_FEATURE_COUNT = 3;
    public static final int METRONOME_SERVICE_DTO = 7;
    public static final int METRONOME_SERVICE_DTO__NAME = 0;
    public static final int METRONOME_SERVICE_DTO__ELAPSED_TIME = 1;
    public static final int METRONOME_SERVICE_DTO__CALL_COUNT = 2;
    public static final int METRONOME_SERVICE_DTO__METHODS = 3;
    public static final int METRONOME_SERVICE_DTO_FEATURE_COUNT = 4;
    public static final int METRONOME_METHOD_DTO = 8;
    public static final int METRONOME_METHOD_DTO__NAME = 0;
    public static final int METRONOME_METHOD_DTO__ELAPSED_TIME = 1;
    public static final int METRONOME_METHOD_DTO__CALL_COUNT = 2;
    public static final int METRONOME_METHOD_DTO_FEATURE_COUNT = 3;
    
    EClass getStatisticsDTO();
    
    EReference getStatisticsDTO_Statistics();
    
    EClass getStatisticDTO();
    
    EAttribute getStatisticDTO_ContextType();
    
    EAttribute getStatisticDTO_Context();
    
    EAttribute getStatisticDTO_StatisticName();
    
    EAttribute getStatisticDTO_Value();
    
    EClass getPlatformInformationDTO();
    
    EAttribute getPlatformInformationDTO_EclipseWorkspacePath();
    
    EAttribute getPlatformInformationDTO_UserConfigurationPath();
    
    EClass getMetronomeStatisticsDTO();
    
    EReference getMetronomeStatisticsDTO_MethodStats();
    
    EReference getMetronomeStatisticsDTO_ServiceStats();
    
    EClass getMetronomeBaseDTO();
    
    EAttribute getMetronomeBaseDTO_Name();
    
    EAttribute getMetronomeBaseDTO_ElapsedTime();
    
    EAttribute getMetronomeBaseDTO_CallCount();
    
    EClass getMetronomeRootDTO();
    
    EReference getMetronomeRootDTO_Repos();
    
    EClass getMetronomeRepoDTO();
    
    EAttribute getMetronomeRepoDTO_Uri();
    
    EAttribute getMetronomeRepoDTO_RepoId();
    
    EReference getMetronomeRepoDTO_Services();
    
    EClass getMetronomeServiceDTO();
    
    EReference getMetronomeServiceDTO_Methods();
    
    EClass getMetronomeMethodDTO();
    
    DebugRestClientDTOFactory getDebugRestClientDTOFactory();
    
    public interface Literals
    {
        public static final EClass STATISTICS_DTO = DebugRestClientDTOPackage.eINSTANCE.getStatisticsDTO();
        public static final EReference STATISTICS_DTO__STATISTICS = DebugRestClientDTOPackage.eINSTANCE.getStatisticsDTO_Statistics();
        public static final EClass STATISTIC_DTO = DebugRestClientDTOPackage.eINSTANCE.getStatisticDTO();
        public static final EAttribute STATISTIC_DTO__CONTEXT_TYPE = DebugRestClientDTOPackage.eINSTANCE.getStatisticDTO_ContextType();
        public static final EAttribute STATISTIC_DTO__CONTEXT = DebugRestClientDTOPackage.eINSTANCE.getStatisticDTO_Context();
        public static final EAttribute STATISTIC_DTO__STATISTIC_NAME = DebugRestClientDTOPackage.eINSTANCE.getStatisticDTO_StatisticName();
        public static final EAttribute STATISTIC_DTO__VALUE = DebugRestClientDTOPackage.eINSTANCE.getStatisticDTO_Value();
        public static final EClass PLATFORM_INFORMATION_DTO = DebugRestClientDTOPackage.eINSTANCE.getPlatformInformationDTO();
        public static final EAttribute PLATFORM_INFORMATION_DTO__ECLIPSE_WORKSPACE_PATH = DebugRestClientDTOPackage.eINSTANCE.getPlatformInformationDTO_EclipseWorkspacePath();
        public static final EAttribute PLATFORM_INFORMATION_DTO__USER_CONFIGURATION_PATH = DebugRestClientDTOPackage.eINSTANCE.getPlatformInformationDTO_UserConfigurationPath();
        public static final EClass METRONOME_STATISTICS_DTO = DebugRestClientDTOPackage.eINSTANCE.getMetronomeStatisticsDTO();
        public static final EReference METRONOME_STATISTICS_DTO__METHOD_STATS = DebugRestClientDTOPackage.eINSTANCE.getMetronomeStatisticsDTO_MethodStats();
        public static final EReference METRONOME_STATISTICS_DTO__SERVICE_STATS = DebugRestClientDTOPackage.eINSTANCE.getMetronomeStatisticsDTO_ServiceStats();
        public static final EClass METRONOME_BASE_DTO = DebugRestClientDTOPackage.eINSTANCE.getMetronomeBaseDTO();
        public static final EAttribute METRONOME_BASE_DTO__NAME = DebugRestClientDTOPackage.eINSTANCE.getMetronomeBaseDTO_Name();
        public static final EAttribute METRONOME_BASE_DTO__ELAPSED_TIME = DebugRestClientDTOPackage.eINSTANCE.getMetronomeBaseDTO_ElapsedTime();
        public static final EAttribute METRONOME_BASE_DTO__CALL_COUNT = DebugRestClientDTOPackage.eINSTANCE.getMetronomeBaseDTO_CallCount();
        public static final EClass METRONOME_ROOT_DTO = DebugRestClientDTOPackage.eINSTANCE.getMetronomeRootDTO();
        public static final EReference METRONOME_ROOT_DTO__REPOS = DebugRestClientDTOPackage.eINSTANCE.getMetronomeRootDTO_Repos();
        public static final EClass METRONOME_REPO_DTO = DebugRestClientDTOPackage.eINSTANCE.getMetronomeRepoDTO();
        public static final EAttribute METRONOME_REPO_DTO__URI = DebugRestClientDTOPackage.eINSTANCE.getMetronomeRepoDTO_Uri();
        public static final EAttribute METRONOME_REPO_DTO__REPO_ID = DebugRestClientDTOPackage.eINSTANCE.getMetronomeRepoDTO_RepoId();
        public static final EReference METRONOME_REPO_DTO__SERVICES = DebugRestClientDTOPackage.eINSTANCE.getMetronomeRepoDTO_Services();
        public static final EClass METRONOME_SERVICE_DTO = DebugRestClientDTOPackage.eINSTANCE.getMetronomeServiceDTO();
        public static final EReference METRONOME_SERVICE_DTO__METHODS = DebugRestClientDTOPackage.eINSTANCE.getMetronomeServiceDTO_Methods();
        public static final EClass METRONOME_METHOD_DTO = DebugRestClientDTOPackage.eINSTANCE.getMetronomeMethodDTO();
    }
}
