// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.util;

import com.ibm.team.filesystem.common.internal.rest.client.load.UnLoadResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.SandboxLoadRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.SandboxLoadRulesResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.MultipleSandboxLoadDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.OverlappedItemDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadFileResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadFileOperationResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.InvalidLoadRequestDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.ShareToLoadDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadLocationDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.CollisionDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.RemovedShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadOverlapDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadEvaluationDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;

public class FilesystemRestClientDTOloadSwitch
{
    protected static FilesystemRestClientDTOloadPackage modelPackage;
    
    public FilesystemRestClientDTOloadSwitch() {
        if (FilesystemRestClientDTOloadSwitch.modelPackage == null) {
            FilesystemRestClientDTOloadSwitch.modelPackage = FilesystemRestClientDTOloadPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOloadSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final LoadEvaluationDTO loadEvaluationDTO = (LoadEvaluationDTO)theEObject;
                Object result = this.caseLoadEvaluationDTO(loadEvaluationDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final LoadOverlapDTO loadOverlapDTO = (LoadOverlapDTO)theEObject;
                Object result = this.caseLoadOverlapDTO(loadOverlapDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final RemovedShareDTO removedShareDTO = (RemovedShareDTO)theEObject;
                Object result = this.caseRemovedShareDTO(removedShareDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final CollisionDTO collisionDTO = (CollisionDTO)theEObject;
                Object result = this.caseCollisionDTO(collisionDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final LoadLocationDTO loadLocationDTO = (LoadLocationDTO)theEObject;
                Object result = this.caseLoadLocationDTO(loadLocationDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final ShareToLoadDTO shareToLoadDTO = (ShareToLoadDTO)theEObject;
                Object result = this.caseShareToLoadDTO(shareToLoadDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final InvalidLoadRequestDTO invalidLoadRequestDTO = (InvalidLoadRequestDTO)theEObject;
                Object result = this.caseInvalidLoadRequestDTO(invalidLoadRequestDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final LoadFileOperationResultDTO loadFileOperationResultDTO = (LoadFileOperationResultDTO)theEObject;
                Object result = this.caseLoadFileOperationResultDTO(loadFileOperationResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 8: {
                final LoadFileResultDTO loadFileResultDTO = (LoadFileResultDTO)theEObject;
                Object result = this.caseLoadFileResultDTO(loadFileResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 9: {
                final OverlappedItemDTO overlappedItemDTO = (OverlappedItemDTO)theEObject;
                Object result = this.caseOverlappedItemDTO(overlappedItemDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 10: {
                final MultipleSandboxLoadDTO multipleSandboxLoadDTO = (MultipleSandboxLoadDTO)theEObject;
                Object result = this.caseMultipleSandboxLoadDTO(multipleSandboxLoadDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 11: {
                final LoadResultDTO loadResultDTO = (LoadResultDTO)theEObject;
                Object result = this.caseLoadResultDTO(loadResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 12: {
                final SandboxLoadRulesResultDTO sandboxLoadRulesResultDTO = (SandboxLoadRulesResultDTO)theEObject;
                Object result = this.caseSandboxLoadRulesResultDTO(sandboxLoadRulesResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 13: {
                final SandboxLoadRuleDTO sandboxLoadRuleDTO = (SandboxLoadRuleDTO)theEObject;
                Object result = this.caseSandboxLoadRuleDTO(sandboxLoadRuleDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 14: {
                final UnLoadResultDTO unLoadResultDTO = (UnLoadResultDTO)theEObject;
                Object result = this.caseUnLoadResultDTO(unLoadResultDTO);
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
    
    public Object caseLoadEvaluationDTO(final LoadEvaluationDTO object) {
        return null;
    }
    
    public Object caseLoadOverlapDTO(final LoadOverlapDTO object) {
        return null;
    }
    
    public Object caseRemovedShareDTO(final RemovedShareDTO object) {
        return null;
    }
    
    public Object caseCollisionDTO(final CollisionDTO object) {
        return null;
    }
    
    public Object caseLoadLocationDTO(final LoadLocationDTO object) {
        return null;
    }
    
    public Object caseShareToLoadDTO(final ShareToLoadDTO object) {
        return null;
    }
    
    public Object caseInvalidLoadRequestDTO(final InvalidLoadRequestDTO object) {
        return null;
    }
    
    public Object caseLoadFileOperationResultDTO(final LoadFileOperationResultDTO object) {
        return null;
    }
    
    public Object caseLoadFileResultDTO(final LoadFileResultDTO object) {
        return null;
    }
    
    public Object caseOverlappedItemDTO(final OverlappedItemDTO object) {
        return null;
    }
    
    public Object caseMultipleSandboxLoadDTO(final MultipleSandboxLoadDTO object) {
        return null;
    }
    
    public Object caseLoadResultDTO(final LoadResultDTO object) {
        return null;
    }
    
    public Object caseSandboxLoadRulesResultDTO(final SandboxLoadRulesResultDTO object) {
        return null;
    }
    
    public Object caseSandboxLoadRuleDTO(final SandboxLoadRuleDTO object) {
        return null;
    }
    
    public Object caseUnLoadResultDTO(final UnLoadResultDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
