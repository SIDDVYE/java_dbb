// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.lifecycle.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.lifecycle.core.impl.LifecycleRestClientDTOPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface LifecycleRestClientDTOPackage extends EPackage
{
    public static final String eNAME = "core";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.lifecycle.core";
    public static final String eNS_PREFIX = "filesystemRestClientDTOlifecycle";
    public static final LifecycleRestClientDTOPackage eINSTANCE = LifecycleRestClientDTOPackageImpl.init();
    public static final int COMPATABILITY_DTO = 0;
    public static final int COMPATABILITY_DTO__SERVICES = 0;
    public static final int COMPATABILITY_DTO_FEATURE_COUNT = 1;
    public static final int SERVICE_ENTRY = 1;
    public static final int SERVICE_ENTRY__KEY = 0;
    public static final int SERVICE_ENTRY__VALUE = 1;
    public static final int SERVICE_ENTRY_FEATURE_COUNT = 2;
    public static final int SERVICE_REPORT = 2;
    public static final int SERVICE_REPORT__COMPATIBLE = 0;
    public static final int SERVICE_REPORT__INSTALLED_VERSION = 1;
    public static final int SERVICE_REPORT_FEATURE_COUNT = 2;
    
    EClass getCompatabilityDTO();
    
    EReference getCompatabilityDTO_Services();
    
    EClass getServiceEntry();
    
    EAttribute getServiceEntry_Key();
    
    EReference getServiceEntry_Value();
    
    EClass getServiceReport();
    
    EAttribute getServiceReport_Compatible();
    
    EAttribute getServiceReport_InstalledVersion();
    
    LifecycleRestClientDTOFactory getLifecycleRestClientDTOFactory();
    
    public interface Literals
    {
        public static final EClass COMPATABILITY_DTO = LifecycleRestClientDTOPackage.eINSTANCE.getCompatabilityDTO();
        public static final EReference COMPATABILITY_DTO__SERVICES = LifecycleRestClientDTOPackage.eINSTANCE.getCompatabilityDTO_Services();
        public static final EClass SERVICE_ENTRY = LifecycleRestClientDTOPackage.eINSTANCE.getServiceEntry();
        public static final EAttribute SERVICE_ENTRY__KEY = LifecycleRestClientDTOPackage.eINSTANCE.getServiceEntry_Key();
        public static final EReference SERVICE_ENTRY__VALUE = LifecycleRestClientDTOPackage.eINSTANCE.getServiceEntry_Value();
        public static final EClass SERVICE_REPORT = LifecycleRestClientDTOPackage.eINSTANCE.getServiceReport();
        public static final EAttribute SERVICE_REPORT__COMPATIBLE = LifecycleRestClientDTOPackage.eINSTANCE.getServiceReport_Compatible();
        public static final EAttribute SERVICE_REPORT__INSTALLED_VERSION = LifecycleRestClientDTOPackage.eINSTANCE.getServiceReport_InstalledVersion();
    }
}
