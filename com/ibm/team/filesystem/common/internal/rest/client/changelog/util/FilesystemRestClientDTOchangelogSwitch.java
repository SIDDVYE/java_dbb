// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.util;

import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogOslcLinkEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogRootEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogDirectionEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogBaselineEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogWorkItemEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogVersionableEntry2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogVersionableEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogChangeSetEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogComponentEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogEntryDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;

public class FilesystemRestClientDTOchangelogSwitch
{
    protected static FilesystemRestClientDTOchangelogPackage modelPackage;
    
    public FilesystemRestClientDTOchangelogSwitch() {
        if (FilesystemRestClientDTOchangelogSwitch.modelPackage == null) {
            FilesystemRestClientDTOchangelogSwitch.modelPackage = FilesystemRestClientDTOchangelogPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOchangelogSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final ChangeLogEntryDTO changeLogEntryDTO = (ChangeLogEntryDTO)theEObject;
                Object result = this.caseChangeLogEntryDTO(changeLogEntryDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final ChangeLogComponentEntryDTO changeLogComponentEntryDTO = (ChangeLogComponentEntryDTO)theEObject;
                Object result = this.caseChangeLogComponentEntryDTO(changeLogComponentEntryDTO);
                if (result == null) {
                    result = this.caseChangeLogEntryDTO(changeLogComponentEntryDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final ChangeLogChangeSetEntryDTO changeLogChangeSetEntryDTO = (ChangeLogChangeSetEntryDTO)theEObject;
                Object result = this.caseChangeLogChangeSetEntryDTO(changeLogChangeSetEntryDTO);
                if (result == null) {
                    result = this.caseChangeLogEntryDTO(changeLogChangeSetEntryDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final ChangeLogVersionableEntryDTO changeLogVersionableEntryDTO = (ChangeLogVersionableEntryDTO)theEObject;
                Object result = this.caseChangeLogVersionableEntryDTO(changeLogVersionableEntryDTO);
                if (result == null) {
                    result = this.caseChangeLogEntryDTO(changeLogVersionableEntryDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final ChangeLogVersionableEntry2DTO changeLogVersionableEntry2DTO = (ChangeLogVersionableEntry2DTO)theEObject;
                Object result = this.caseChangeLogVersionableEntry2DTO(changeLogVersionableEntry2DTO);
                if (result == null) {
                    result = this.caseChangeLogVersionableEntryDTO(changeLogVersionableEntry2DTO);
                }
                if (result == null) {
                    result = this.caseChangeLogEntryDTO(changeLogVersionableEntry2DTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final ChangeLogWorkItemEntryDTO changeLogWorkItemEntryDTO = (ChangeLogWorkItemEntryDTO)theEObject;
                Object result = this.caseChangeLogWorkItemEntryDTO(changeLogWorkItemEntryDTO);
                if (result == null) {
                    result = this.caseChangeLogEntryDTO(changeLogWorkItemEntryDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final ChangeLogBaselineEntryDTO changeLogBaselineEntryDTO = (ChangeLogBaselineEntryDTO)theEObject;
                Object result = this.caseChangeLogBaselineEntryDTO(changeLogBaselineEntryDTO);
                if (result == null) {
                    result = this.caseChangeLogEntryDTO(changeLogBaselineEntryDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final ChangeLogDirectionEntryDTO changeLogDirectionEntryDTO = (ChangeLogDirectionEntryDTO)theEObject;
                Object result = this.caseChangeLogDirectionEntryDTO(changeLogDirectionEntryDTO);
                if (result == null) {
                    result = this.caseChangeLogEntryDTO(changeLogDirectionEntryDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 8: {
                final ChangeLogRootEntryDTO changeLogRootEntryDTO = (ChangeLogRootEntryDTO)theEObject;
                Object result = this.caseChangeLogRootEntryDTO(changeLogRootEntryDTO);
                if (result == null) {
                    result = this.caseChangeLogEntryDTO(changeLogRootEntryDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 9: {
                final ChangeLogOslcLinkEntryDTO changeLogOslcLinkEntryDTO = (ChangeLogOslcLinkEntryDTO)theEObject;
                Object result = this.caseChangeLogOslcLinkEntryDTO(changeLogOslcLinkEntryDTO);
                if (result == null) {
                    result = this.caseChangeLogEntryDTO(changeLogOslcLinkEntryDTO);
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
    
    public Object caseChangeLogEntryDTO(final ChangeLogEntryDTO object) {
        return null;
    }
    
    public Object caseChangeLogComponentEntryDTO(final ChangeLogComponentEntryDTO object) {
        return null;
    }
    
    public Object caseChangeLogChangeSetEntryDTO(final ChangeLogChangeSetEntryDTO object) {
        return null;
    }
    
    public Object caseChangeLogVersionableEntryDTO(final ChangeLogVersionableEntryDTO object) {
        return null;
    }
    
    public Object caseChangeLogVersionableEntry2DTO(final ChangeLogVersionableEntry2DTO object) {
        return null;
    }
    
    public Object caseChangeLogWorkItemEntryDTO(final ChangeLogWorkItemEntryDTO object) {
        return null;
    }
    
    public Object caseChangeLogBaselineEntryDTO(final ChangeLogBaselineEntryDTO object) {
        return null;
    }
    
    public Object caseChangeLogDirectionEntryDTO(final ChangeLogDirectionEntryDTO object) {
        return null;
    }
    
    public Object caseChangeLogRootEntryDTO(final ChangeLogRootEntryDTO object) {
        return null;
    }
    
    public Object caseChangeLogOslcLinkEntryDTO(final ChangeLogOslcLinkEntryDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
