// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores.util;

import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoredResourcesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.UnknownIgnoreRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRulesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.JazzIgnoreRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRuleDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresPackage;

public class FilesystemRestClientDTOignoresSwitch
{
    protected static FilesystemRestClientDTOignoresPackage modelPackage;
    
    public FilesystemRestClientDTOignoresSwitch() {
        if (FilesystemRestClientDTOignoresSwitch.modelPackage == null) {
            FilesystemRestClientDTOignoresSwitch.modelPackage = FilesystemRestClientDTOignoresPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOignoresSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final IgnoreRuleDTO ignoreRuleDTO = (IgnoreRuleDTO)theEObject;
                Object result = this.caseIgnoreRuleDTO(ignoreRuleDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final JazzIgnoreRuleDTO jazzIgnoreRuleDTO = (JazzIgnoreRuleDTO)theEObject;
                Object result = this.caseJazzIgnoreRuleDTO(jazzIgnoreRuleDTO);
                if (result == null) {
                    result = this.caseIgnoreRuleDTO(jazzIgnoreRuleDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final IgnoreRulesDTO ignoreRulesDTO = (IgnoreRulesDTO)theEObject;
                Object result = this.caseIgnoreRulesDTO(ignoreRulesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final UnknownIgnoreRuleDTO unknownIgnoreRuleDTO = (UnknownIgnoreRuleDTO)theEObject;
                Object result = this.caseUnknownIgnoreRuleDTO(unknownIgnoreRuleDTO);
                if (result == null) {
                    result = this.caseIgnoreRuleDTO(unknownIgnoreRuleDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final IgnoredResourcesDTO ignoredResourcesDTO = (IgnoredResourcesDTO)theEObject;
                Object result = this.caseIgnoredResourcesDTO(ignoredResourcesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            default: {
                return this.defaultCase(theEObject);
            }
        }
    }
    
    public Object caseIgnoreRuleDTO(final IgnoreRuleDTO object) {
        return null;
    }
    
    public Object caseJazzIgnoreRuleDTO(final JazzIgnoreRuleDTO object) {
        return null;
    }
    
    public Object caseIgnoreRulesDTO(final IgnoreRulesDTO object) {
        return null;
    }
    
    public Object caseUnknownIgnoreRuleDTO(final UnknownIgnoreRuleDTO object) {
        return null;
    }
    
    public Object caseIgnoredResourcesDTO(final IgnoredResourcesDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
