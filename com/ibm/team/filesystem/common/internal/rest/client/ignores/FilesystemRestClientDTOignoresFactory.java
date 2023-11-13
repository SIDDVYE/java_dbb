// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores;

import com.ibm.team.filesystem.common.internal.rest.client.ignores.impl.FilesystemRestClientDTOignoresFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOignoresFactory extends EFactory
{
    public static final FilesystemRestClientDTOignoresFactory eINSTANCE = FilesystemRestClientDTOignoresFactoryImpl.init();
    
    IgnoreRuleDTO createIgnoreRuleDTO();
    
    JazzIgnoreRuleDTO createJazzIgnoreRuleDTO();
    
    IgnoreRulesDTO createIgnoreRulesDTO();
    
    UnknownIgnoreRuleDTO createUnknownIgnoreRuleDTO();
    
    IgnoredResourcesDTO createIgnoredResourcesDTO();
    
    FilesystemRestClientDTOignoresPackage getFilesystemRestClientDTOignoresPackage();
}
