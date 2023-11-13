// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest2.dto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest2.dto.impl.Rest2DTOPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface Rest2DTOPackage extends EPackage
{
    public static final String eNAME = "rest2";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest2.dto";
    public static final String eNS_PREFIX = "filesystem.rest2";
    public static final Rest2DTOPackage eINSTANCE = Rest2DTOPackageImpl.init();
    public static final int CHECK_IN_STATE_PLUS_DTO = 0;
    public static final int CHECK_IN_STATE_PLUS_DTO__INTERNAL_ID = 0;
    public static final int CHECK_IN_STATE_PLUS_DTO__DELETED_BY = 1;
    public static final int CHECK_IN_STATE_PLUS_DTO__DELETED_ON = 2;
    public static final int CHECK_IN_STATE_PLUS_DTO__CHECK_IN_STATE = 3;
    public static final int CHECK_IN_STATE_PLUS_DTO_FEATURE_COUNT = 4;
    
    EClass getCheckInStatePlusDTO();
    
    EReference getCheckInStatePlusDTO_DeletedBy();
    
    EAttribute getCheckInStatePlusDTO_DeletedOn();
    
    EReference getCheckInStatePlusDTO_CheckInState();
    
    Rest2DTOFactory getRest2DTOFactory();
    
    public interface Literals
    {
        public static final EClass CHECK_IN_STATE_PLUS_DTO = Rest2DTOPackage.eINSTANCE.getCheckInStatePlusDTO();
        public static final EReference CHECK_IN_STATE_PLUS_DTO__DELETED_BY = Rest2DTOPackage.eINSTANCE.getCheckInStatePlusDTO_DeletedBy();
        public static final EAttribute CHECK_IN_STATE_PLUS_DTO__DELETED_ON = Rest2DTOPackage.eINSTANCE.getCheckInStatePlusDTO_DeletedOn();
        public static final EReference CHECK_IN_STATE_PLUS_DTO__CHECK_IN_STATE = Rest2DTOPackage.eINSTANCE.getCheckInStatePlusDTO_CheckInState();
    }
}
