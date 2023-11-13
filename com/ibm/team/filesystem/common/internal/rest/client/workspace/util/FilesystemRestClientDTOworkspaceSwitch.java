// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.workspace.util;

import com.ibm.team.repository.common.IHelper;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.ComponentHierarchyUpdateResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.BaselineCustomAttributesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.WorkspaceCustomAttributesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.GetWorkspaceDetailsErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.GetWorkspaceDetailsResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.PutWorkspaceResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.MoveFoldersInWorkspaceResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.DeleteFoldersInWorkspaceResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.CreateBaselineResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.CreateBaselineSetResultDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;

public class FilesystemRestClientDTOworkspaceSwitch
{
    protected static FilesystemRestClientDTOworkspacePackage modelPackage;
    
    public FilesystemRestClientDTOworkspaceSwitch() {
        if (FilesystemRestClientDTOworkspaceSwitch.modelPackage == null) {
            FilesystemRestClientDTOworkspaceSwitch.modelPackage = FilesystemRestClientDTOworkspacePackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOworkspaceSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final CreateBaselineSetResultDTO createBaselineSetResultDTO = (CreateBaselineSetResultDTO)theEObject;
                Object result = this.caseCreateBaselineSetResultDTO(createBaselineSetResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final CreateBaselineResultDTO createBaselineResultDTO = (CreateBaselineResultDTO)theEObject;
                Object result = this.caseCreateBaselineResultDTO(createBaselineResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final DeleteFoldersInWorkspaceResultDTO deleteFoldersInWorkspaceResultDTO = (DeleteFoldersInWorkspaceResultDTO)theEObject;
                Object result = this.caseDeleteFoldersInWorkspaceResultDTO(deleteFoldersInWorkspaceResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final MoveFoldersInWorkspaceResultDTO moveFoldersInWorkspaceResultDTO = (MoveFoldersInWorkspaceResultDTO)theEObject;
                Object result = this.caseMoveFoldersInWorkspaceResultDTO(moveFoldersInWorkspaceResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final PutWorkspaceResultDTO putWorkspaceResultDTO = (PutWorkspaceResultDTO)theEObject;
                Object result = this.casePutWorkspaceResultDTO(putWorkspaceResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final GetWorkspaceDetailsResultDTO getWorkspaceDetailsResultDTO = (GetWorkspaceDetailsResultDTO)theEObject;
                Object result = this.caseGetWorkspaceDetailsResultDTO(getWorkspaceDetailsResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final GetWorkspaceDetailsErrorDTO getWorkspaceDetailsErrorDTO = (GetWorkspaceDetailsErrorDTO)theEObject;
                Object result = this.caseGetWorkspaceDetailsErrorDTO(getWorkspaceDetailsErrorDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final WorkspaceCustomAttributesDTO workspaceCustomAttributesDTO = (WorkspaceCustomAttributesDTO)theEObject;
                Object result = this.caseWorkspaceCustomAttributesDTO(workspaceCustomAttributesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 8: {
                final BaselineCustomAttributesDTO baselineCustomAttributesDTO = (BaselineCustomAttributesDTO)theEObject;
                Object result = this.caseBaselineCustomAttributesDTO(baselineCustomAttributesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 9: {
                final ComponentHierarchyUpdateResultDTO componentHierarchyUpdateResultDTO = (ComponentHierarchyUpdateResultDTO)theEObject;
                Object result = this.caseComponentHierarchyUpdateResultDTO(componentHierarchyUpdateResultDTO);
                if (result == null) {
                    result = this.caseHelper((Helper)componentHierarchyUpdateResultDTO);
                }
                if (result == null) {
                    result = this.caseHelperFacade((IHelper)componentHierarchyUpdateResultDTO);
                }
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
    
    public Object caseCreateBaselineSetResultDTO(final CreateBaselineSetResultDTO object) {
        return null;
    }
    
    public Object caseCreateBaselineResultDTO(final CreateBaselineResultDTO object) {
        return null;
    }
    
    public Object caseDeleteFoldersInWorkspaceResultDTO(final DeleteFoldersInWorkspaceResultDTO object) {
        return null;
    }
    
    public Object caseMoveFoldersInWorkspaceResultDTO(final MoveFoldersInWorkspaceResultDTO object) {
        return null;
    }
    
    public Object casePutWorkspaceResultDTO(final PutWorkspaceResultDTO object) {
        return null;
    }
    
    public Object caseGetWorkspaceDetailsResultDTO(final GetWorkspaceDetailsResultDTO object) {
        return null;
    }
    
    public Object caseGetWorkspaceDetailsErrorDTO(final GetWorkspaceDetailsErrorDTO object) {
        return null;
    }
    
    public Object caseWorkspaceCustomAttributesDTO(final WorkspaceCustomAttributesDTO object) {
        return null;
    }
    
    public Object caseBaselineCustomAttributesDTO(final BaselineCustomAttributesDTO object) {
        return null;
    }
    
    public Object caseComponentHierarchyUpdateResultDTO(final ComponentHierarchyUpdateResultDTO object) {
        return null;
    }
    
    public Object caseHelperFacade(final IHelper object) {
        return null;
    }
    
    public Object caseHelper(final Helper object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
