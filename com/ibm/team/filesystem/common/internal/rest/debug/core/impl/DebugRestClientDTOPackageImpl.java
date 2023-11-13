// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeMethodDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeServiceDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRepoDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeRootDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeBaseDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeStatisticsDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.PlatformInformationDTO;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.debug.core.StatisticsDTO;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class DebugRestClientDTOPackageImpl extends EPackageImpl implements DebugRestClientDTOPackage
{
    private EClass statisticsDTOEClass;
    private EClass statisticDTOEClass;
    private EClass platformInformationDTOEClass;
    private EClass metronomeStatisticsDTOEClass;
    private EClass metronomeBaseDTOEClass;
    private EClass metronomeRootDTOEClass;
    private EClass metronomeRepoDTOEClass;
    private EClass metronomeServiceDTOEClass;
    private EClass metronomeMethodDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        DebugRestClientDTOPackageImpl.isInited = false;
    }
    
    private DebugRestClientDTOPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.debug.core", (EFactory)DebugRestClientDTOFactory.eINSTANCE);
        this.statisticsDTOEClass = null;
        this.statisticDTOEClass = null;
        this.platformInformationDTOEClass = null;
        this.metronomeStatisticsDTOEClass = null;
        this.metronomeBaseDTOEClass = null;
        this.metronomeRootDTOEClass = null;
        this.metronomeRepoDTOEClass = null;
        this.metronomeServiceDTOEClass = null;
        this.metronomeMethodDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static DebugRestClientDTOPackage init() {
        if (DebugRestClientDTOPackageImpl.isInited) {
            return (DebugRestClientDTOPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.debug.core");
        }
        final DebugRestClientDTOPackageImpl theDebugRestClientDTOPackage = (DebugRestClientDTOPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.debug.core") instanceof DebugRestClientDTOPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.debug.core") : new DebugRestClientDTOPackageImpl());
        DebugRestClientDTOPackageImpl.isInited = true;
        theDebugRestClientDTOPackage.createPackageContents();
        theDebugRestClientDTOPackage.initializePackageContents();
        theDebugRestClientDTOPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.debug.core", (Object)theDebugRestClientDTOPackage);
        return theDebugRestClientDTOPackage;
    }
    
    public EClass getStatisticsDTO() {
        return this.statisticsDTOEClass;
    }
    
    public EReference getStatisticsDTO_Statistics() {
        return (EReference)this.statisticsDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getStatisticDTO() {
        return this.statisticDTOEClass;
    }
    
    public EAttribute getStatisticDTO_ContextType() {
        return (EAttribute)this.statisticDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getStatisticDTO_Context() {
        return (EAttribute)this.statisticDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getStatisticDTO_StatisticName() {
        return (EAttribute)this.statisticDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getStatisticDTO_Value() {
        return (EAttribute)this.statisticDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getPlatformInformationDTO() {
        return this.platformInformationDTOEClass;
    }
    
    public EAttribute getPlatformInformationDTO_EclipseWorkspacePath() {
        return (EAttribute)this.platformInformationDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getPlatformInformationDTO_UserConfigurationPath() {
        return (EAttribute)this.platformInformationDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getMetronomeStatisticsDTO() {
        return this.metronomeStatisticsDTOEClass;
    }
    
    public EReference getMetronomeStatisticsDTO_MethodStats() {
        return (EReference)this.metronomeStatisticsDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getMetronomeStatisticsDTO_ServiceStats() {
        return (EReference)this.metronomeStatisticsDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getMetronomeBaseDTO() {
        return this.metronomeBaseDTOEClass;
    }
    
    public EAttribute getMetronomeBaseDTO_Name() {
        return (EAttribute)this.metronomeBaseDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getMetronomeBaseDTO_ElapsedTime() {
        return (EAttribute)this.metronomeBaseDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getMetronomeBaseDTO_CallCount() {
        return (EAttribute)this.metronomeBaseDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getMetronomeRootDTO() {
        return this.metronomeRootDTOEClass;
    }
    
    public EReference getMetronomeRootDTO_Repos() {
        return (EReference)this.metronomeRootDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getMetronomeRepoDTO() {
        return this.metronomeRepoDTOEClass;
    }
    
    public EAttribute getMetronomeRepoDTO_Uri() {
        return (EAttribute)this.metronomeRepoDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getMetronomeRepoDTO_RepoId() {
        return (EAttribute)this.metronomeRepoDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getMetronomeRepoDTO_Services() {
        return (EReference)this.metronomeRepoDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getMetronomeServiceDTO() {
        return this.metronomeServiceDTOEClass;
    }
    
    public EReference getMetronomeServiceDTO_Methods() {
        return (EReference)this.metronomeServiceDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getMetronomeMethodDTO() {
        return this.metronomeMethodDTOEClass;
    }
    
    public DebugRestClientDTOFactory getDebugRestClientDTOFactory() {
        return (DebugRestClientDTOFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEReference(this.statisticsDTOEClass = this.createEClass(0), 0);
        this.createEAttribute(this.statisticDTOEClass = this.createEClass(1), 0);
        this.createEAttribute(this.statisticDTOEClass, 1);
        this.createEAttribute(this.statisticDTOEClass, 2);
        this.createEAttribute(this.statisticDTOEClass, 3);
        this.createEAttribute(this.platformInformationDTOEClass = this.createEClass(2), 0);
        this.createEAttribute(this.platformInformationDTOEClass, 1);
        this.createEReference(this.metronomeStatisticsDTOEClass = this.createEClass(3), 0);
        this.createEReference(this.metronomeStatisticsDTOEClass, 1);
        this.createEAttribute(this.metronomeBaseDTOEClass = this.createEClass(4), 0);
        this.createEAttribute(this.metronomeBaseDTOEClass, 1);
        this.createEAttribute(this.metronomeBaseDTOEClass, 2);
        this.createEReference(this.metronomeRootDTOEClass = this.createEClass(5), 0);
        this.createEAttribute(this.metronomeRepoDTOEClass = this.createEClass(6), 0);
        this.createEAttribute(this.metronomeRepoDTOEClass, 1);
        this.createEReference(this.metronomeRepoDTOEClass, 2);
        this.createEReference(this.metronomeServiceDTOEClass = this.createEClass(7), 3);
        this.metronomeMethodDTOEClass = this.createEClass(8);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("core");
        this.setNsPrefix("filesystemRestClientDTOdebug");
        this.setNsURI("com.ibm.team.filesystem.rest.client.debug.core");
        this.metronomeServiceDTOEClass.getESuperTypes().add((Object)this.getMetronomeBaseDTO());
        this.metronomeMethodDTOEClass.getESuperTypes().add((Object)this.getMetronomeBaseDTO());
        this.initEClass(this.statisticsDTOEClass, (Class)StatisticsDTO.class, "StatisticsDTO", false, false, true);
        this.initEReference(this.getStatisticsDTO_Statistics(), (EClassifier)this.getStatisticDTO(), (EReference)null, "statistics", (String)null, 0, -1, (Class)StatisticsDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.statisticDTOEClass, (Class)StatisticDTO.class, "StatisticDTO", false, false, true);
        this.initEAttribute(this.getStatisticDTO_ContextType(), (EClassifier)this.ecorePackage.getEString(), "contextType", (String)null, 0, 1, (Class)StatisticDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStatisticDTO_Context(), (EClassifier)this.ecorePackage.getEString(), "context", (String)null, 0, 1, (Class)StatisticDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStatisticDTO_StatisticName(), (EClassifier)this.ecorePackage.getEString(), "statisticName", (String)null, 0, 1, (Class)StatisticDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getStatisticDTO_Value(), (EClassifier)this.ecorePackage.getELong(), "value", (String)null, 0, 1, (Class)StatisticDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.platformInformationDTOEClass, (Class)PlatformInformationDTO.class, "PlatformInformationDTO", false, false, true);
        this.initEAttribute(this.getPlatformInformationDTO_EclipseWorkspacePath(), (EClassifier)this.ecorePackage.getEString(), "eclipseWorkspacePath", (String)null, 0, 1, (Class)PlatformInformationDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getPlatformInformationDTO_UserConfigurationPath(), (EClassifier)this.ecorePackage.getEString(), "userConfigurationPath", (String)null, 0, 1, (Class)PlatformInformationDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.metronomeStatisticsDTOEClass, (Class)MetronomeStatisticsDTO.class, "MetronomeStatisticsDTO", false, false, true);
        this.initEReference(this.getMetronomeStatisticsDTO_MethodStats(), (EClassifier)this.getMetronomeMethodDTO(), (EReference)null, "methodStats", (String)null, 0, -1, (Class)MetronomeStatisticsDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getMetronomeStatisticsDTO_ServiceStats(), (EClassifier)this.getMetronomeServiceDTO(), (EReference)null, "serviceStats", (String)null, 0, -1, (Class)MetronomeStatisticsDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.metronomeBaseDTOEClass, (Class)MetronomeBaseDTO.class, "MetronomeBaseDTO", false, false, true);
        this.initEAttribute(this.getMetronomeBaseDTO_Name(), (EClassifier)this.ecorePackage.getEString(), "name", (String)null, 0, 1, (Class)MetronomeBaseDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMetronomeBaseDTO_ElapsedTime(), (EClassifier)this.ecorePackage.getELong(), "elapsedTime", (String)null, 0, 1, (Class)MetronomeBaseDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMetronomeBaseDTO_CallCount(), (EClassifier)this.ecorePackage.getELong(), "callCount", (String)null, 0, 1, (Class)MetronomeBaseDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.metronomeRootDTOEClass, (Class)MetronomeRootDTO.class, "MetronomeRootDTO", false, false, true);
        this.initEReference(this.getMetronomeRootDTO_Repos(), (EClassifier)this.getMetronomeRepoDTO(), (EReference)null, "repos", (String)null, 0, -1, (Class)MetronomeRootDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.metronomeRepoDTOEClass, (Class)MetronomeRepoDTO.class, "MetronomeRepoDTO", false, false, true);
        this.initEAttribute(this.getMetronomeRepoDTO_Uri(), (EClassifier)this.ecorePackage.getEString(), "uri", (String)null, 0, 1, (Class)MetronomeRepoDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getMetronomeRepoDTO_RepoId(), (EClassifier)this.ecorePackage.getEString(), "repoId", (String)null, 0, 1, (Class)MetronomeRepoDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getMetronomeRepoDTO_Services(), (EClassifier)this.getMetronomeServiceDTO(), (EReference)null, "services", (String)null, 0, -1, (Class)MetronomeRepoDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.metronomeServiceDTOEClass, (Class)MetronomeServiceDTO.class, "MetronomeServiceDTO", false, false, true);
        this.initEReference(this.getMetronomeServiceDTO_Methods(), (EClassifier)this.getMetronomeMethodDTO(), (EReference)null, "methods", (String)null, 0, -1, (Class)MetronomeServiceDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.metronomeMethodDTOEClass, (Class)MetronomeMethodDTO.class, "MetronomeMethodDTO", false, false, true);
        this.createResource("com.ibm.team.filesystem.rest.client.debug.core");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamReferenceAnnotations();
        this.createTeamAttributeAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.debug", "clientPackagePrefix", "DebugRestClientDTO", "clientPackageSuffix", "", "dbMapQueryablePropertiesOnly", "false", "queryFacadePackage", "" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.statisticsDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.statisticDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.platformInformationDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.metronomeStatisticsDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.metronomeBaseDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.metronomeRootDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.metronomeRepoDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.metronomeServiceDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.metronomeMethodDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getStatisticsDTO_Statistics(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMetronomeStatisticsDTO_MethodStats(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMetronomeStatisticsDTO_ServiceStats(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMetronomeRootDTO_Repos(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMetronomeRepoDTO_Services(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMetronomeServiceDTO_Methods(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getStatisticDTO_ContextType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStatisticDTO_Context(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStatisticDTO_StatisticName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getStatisticDTO_Value(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPlatformInformationDTO_EclipseWorkspacePath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getPlatformInformationDTO_UserConfigurationPath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMetronomeBaseDTO_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMetronomeBaseDTO_ElapsedTime(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMetronomeBaseDTO_CallCount(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMetronomeRepoDTO_Uri(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getMetronomeRepoDTO_RepoId(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
}
