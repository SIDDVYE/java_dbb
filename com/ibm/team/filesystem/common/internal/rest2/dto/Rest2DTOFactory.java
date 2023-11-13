// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest2.dto;

import com.ibm.team.filesystem.common.internal.rest2.dto.impl.Rest2DTOFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface Rest2DTOFactory extends EFactory
{
    public static final Rest2DTOFactory eINSTANCE = Rest2DTOFactoryImpl.init();
    
    CheckInStatePlusDTO createCheckInStatePlusDTO();
    
    Rest2DTOPackage getRest2DTOPackage();
}
