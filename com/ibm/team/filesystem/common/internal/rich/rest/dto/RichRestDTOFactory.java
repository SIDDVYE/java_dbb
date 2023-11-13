// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rich.rest.dto;

import com.ibm.team.filesystem.common.internal.rich.rest.dto.impl.RichRestDTOFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface RichRestDTOFactory extends EFactory
{
    public static final RichRestDTOFactory eINSTANCE = RichRestDTOFactoryImpl.init();
    
    ContentStatusDTO createContentStatusDTO();
    
    RichRestDTOPackage getRichRestDTOPackage();
}
