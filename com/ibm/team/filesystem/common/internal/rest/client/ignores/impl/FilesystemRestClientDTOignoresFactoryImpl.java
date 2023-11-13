// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores.impl;

import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresPackage;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoredResourcesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.UnknownIgnoreRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRulesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.JazzIgnoreRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRuleDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOignoresFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOignoresFactory
{
    public static FilesystemRestClientDTOignoresFactory init() {
        try {
            final FilesystemRestClientDTOignoresFactory theFilesystemRestClientDTOignoresFactory = (FilesystemRestClientDTOignoresFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.ignores");
            if (theFilesystemRestClientDTOignoresFactory != null) {
                return theFilesystemRestClientDTOignoresFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOignoresFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createIgnoreRuleDTO();
            }
            case 1: {
                return (EObject)this.createJazzIgnoreRuleDTO();
            }
            case 2: {
                return (EObject)this.createIgnoreRulesDTO();
            }
            case 3: {
                return (EObject)this.createUnknownIgnoreRuleDTO();
            }
            case 4: {
                return (EObject)this.createIgnoredResourcesDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public IgnoreRuleDTO createIgnoreRuleDTO() {
        final IgnoreRuleDTOImpl ignoreRuleDTO = new IgnoreRuleDTOImpl();
        return ignoreRuleDTO;
    }
    
    public JazzIgnoreRuleDTO createJazzIgnoreRuleDTO() {
        final JazzIgnoreRuleDTOImpl jazzIgnoreRuleDTO = new JazzIgnoreRuleDTOImpl();
        return jazzIgnoreRuleDTO;
    }
    
    public IgnoreRulesDTO createIgnoreRulesDTO() {
        final IgnoreRulesDTOImpl ignoreRulesDTO = new IgnoreRulesDTOImpl();
        return ignoreRulesDTO;
    }
    
    public UnknownIgnoreRuleDTO createUnknownIgnoreRuleDTO() {
        final UnknownIgnoreRuleDTOImpl unknownIgnoreRuleDTO = new UnknownIgnoreRuleDTOImpl();
        return unknownIgnoreRuleDTO;
    }
    
    public IgnoredResourcesDTO createIgnoredResourcesDTO() {
        final IgnoredResourcesDTOImpl ignoredResourcesDTO = new IgnoredResourcesDTOImpl();
        return ignoredResourcesDTO;
    }
    
    public FilesystemRestClientDTOignoresPackage getFilesystemRestClientDTOignoresPackage() {
        return (FilesystemRestClientDTOignoresPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOignoresPackage getPackage() {
        return FilesystemRestClientDTOignoresPackage.eINSTANCE;
    }
}
