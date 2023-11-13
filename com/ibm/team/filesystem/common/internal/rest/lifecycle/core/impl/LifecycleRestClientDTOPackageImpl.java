// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.ServiceReport;
import java.util.Map;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.CompatabilityDTO;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.LifecycleRestClientDTOFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.LifecycleRestClientDTOPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class LifecycleRestClientDTOPackageImpl extends EPackageImpl implements LifecycleRestClientDTOPackage
{
    private EClass compatabilityDTOEClass;
    private EClass serviceEntryEClass;
    private EClass serviceReportEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        LifecycleRestClientDTOPackageImpl.isInited = false;
    }
    
    private LifecycleRestClientDTOPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.lifecycle.core", (EFactory)LifecycleRestClientDTOFactory.eINSTANCE);
        this.compatabilityDTOEClass = null;
        this.serviceEntryEClass = null;
        this.serviceReportEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static LifecycleRestClientDTOPackage init() {
        if (LifecycleRestClientDTOPackageImpl.isInited) {
            return (LifecycleRestClientDTOPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.lifecycle.core");
        }
        final LifecycleRestClientDTOPackageImpl theLifecycleRestClientDTOPackage = (EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.lifecycle.core") instanceof LifecycleRestClientDTOPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.lifecycle.core") : new LifecycleRestClientDTOPackageImpl();
        LifecycleRestClientDTOPackageImpl.isInited = true;
        theLifecycleRestClientDTOPackage.createPackageContents();
        theLifecycleRestClientDTOPackage.initializePackageContents();
        theLifecycleRestClientDTOPackage.freeze();
        return theLifecycleRestClientDTOPackage;
    }
    
    public EClass getCompatabilityDTO() {
        return this.compatabilityDTOEClass;
    }
    
    public EReference getCompatabilityDTO_Services() {
        return (EReference)this.compatabilityDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getServiceEntry() {
        return this.serviceEntryEClass;
    }
    
    public EAttribute getServiceEntry_Key() {
        return (EAttribute)this.serviceEntryEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getServiceEntry_Value() {
        return (EReference)this.serviceEntryEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getServiceReport() {
        return this.serviceReportEClass;
    }
    
    public EAttribute getServiceReport_Compatible() {
        return (EAttribute)this.serviceReportEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getServiceReport_InstalledVersion() {
        return (EAttribute)this.serviceReportEClass.getEStructuralFeatures().get(1);
    }
    
    public LifecycleRestClientDTOFactory getLifecycleRestClientDTOFactory() {
        return (LifecycleRestClientDTOFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEReference(this.compatabilityDTOEClass = this.createEClass(0), 0);
        this.createEAttribute(this.serviceEntryEClass = this.createEClass(1), 0);
        this.createEReference(this.serviceEntryEClass, 1);
        this.createEAttribute(this.serviceReportEClass = this.createEClass(2), 0);
        this.createEAttribute(this.serviceReportEClass, 1);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("core");
        this.setNsPrefix("filesystemRestClientDTOlifecycle");
        this.setNsURI("com.ibm.team.filesystem.rest.client.lifecycle.core");
        this.initEClass(this.compatabilityDTOEClass, (Class)CompatabilityDTO.class, "CompatabilityDTO", false, false, true);
        this.initEReference(this.getCompatabilityDTO_Services(), (EClassifier)this.getServiceEntry(), (EReference)null, "services", (String)null, 0, -1, (Class)CompatabilityDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.serviceEntryEClass, (Class)Map.Entry.class, "ServiceEntry", false, false, false);
        this.initEAttribute(this.getServiceEntry_Key(), (EClassifier)this.ecorePackage.getEString(), "key", (String)null, 1, 1, (Class)Map.Entry.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getServiceEntry_Value(), (EClassifier)this.getServiceReport(), (EReference)null, "value", (String)null, 1, 1, (Class)Map.Entry.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.serviceReportEClass, (Class)ServiceReport.class, "ServiceReport", false, false, true);
        this.initEAttribute(this.getServiceReport_Compatible(), (EClassifier)this.ecorePackage.getEBoolean(), "compatible", (String)null, 0, 1, (Class)ServiceReport.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getServiceReport_InstalledVersion(), (EClassifier)this.ecorePackage.getEString(), "installedVersion", (String)null, 0, 1, (Class)ServiceReport.class, false, false, true, true, false, true, false, true);
        this.createResource("com.ibm.team.filesystem.rest.client.lifecycle.core");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamReferenceAnnotations();
        this.createTeamAttributeAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.lifecycle", "clientPackagePrefix", "LifecycleRestClientDTO", "clientPackageSuffix", "", "dbMapQueryablePropertiesOnly", "false", "queryFacadePackage", "" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.compatabilityDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.serviceEntryEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.serviceReportEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getCompatabilityDTO_Services(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getServiceEntry_Value(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getServiceEntry_Key(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getServiceReport_Compatible(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getServiceReport_InstalledVersion(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
}
