// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rich.rest.dto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.impl.RichRestDTOPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface RichRestDTOPackage extends EPackage
{
    public static final String eNAME = "rich";
    public static final String eNS_URI = "com.ibm.team.filesystem.rich.rest.dto";
    public static final String eNS_PREFIX = "filesystem.rich.rest";
    public static final RichRestDTOPackage eINSTANCE = RichRestDTOPackageImpl.init();
    public static final int CONTENT_STATUS_DTO = 0;
    public static final int CONTENT_STATUS_DTO__STATUS = 0;
    public static final int CONTENT_STATUS_DTO__DELETED_BY_CONTRIBUTOR_ID = 1;
    public static final int CONTENT_STATUS_DTO__DELETED_ON = 2;
    public static final int CONTENT_STATUS_DTO_FEATURE_COUNT = 3;
    
    EClass getContentStatusDTO();
    
    EAttribute getContentStatusDTO_Status();
    
    EAttribute getContentStatusDTO_DeletedByContributorId();
    
    EAttribute getContentStatusDTO_DeletedOn();
    
    RichRestDTOFactory getRichRestDTOFactory();
    
    public interface Literals
    {
        public static final EClass CONTENT_STATUS_DTO = RichRestDTOPackage.eINSTANCE.getContentStatusDTO();
        public static final EAttribute CONTENT_STATUS_DTO__STATUS = RichRestDTOPackage.eINSTANCE.getContentStatusDTO_Status();
        public static final EAttribute CONTENT_STATUS_DTO__DELETED_BY_CONTRIBUTOR_ID = RichRestDTOPackage.eINSTANCE.getContentStatusDTO_DeletedByContributorId();
        public static final EAttribute CONTENT_STATUS_DTO__DELETED_ON = RichRestDTOPackage.eINSTANCE.getContentStatusDTO_DeletedOn();
    }
}
