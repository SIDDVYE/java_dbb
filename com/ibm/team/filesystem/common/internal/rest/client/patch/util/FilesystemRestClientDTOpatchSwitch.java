// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.util;

import com.ibm.team.filesystem.common.internal.rest.client.patch.PageDescriptorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ProcessAcceptQueueResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CompleteCurrentPatchResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.UpdateCurrentPatchResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.AbortCurrentPatchResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ExecuteBitChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.EncodingChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.LineDelimiterChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ContentTypeChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ContentChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.SymbolicLinkChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.MoveChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.PropertyChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeDetailDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.VersionableChangeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CurrentPatchDTO;
import com.ibm.team.repository.common.IHelper;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeSetSourceDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.AcceptQueueDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;

public class FilesystemRestClientDTOpatchSwitch
{
    protected static FilesystemRestClientDTOpatchPackage modelPackage;
    
    public FilesystemRestClientDTOpatchSwitch() {
        if (FilesystemRestClientDTOpatchSwitch.modelPackage == null) {
            FilesystemRestClientDTOpatchSwitch.modelPackage = FilesystemRestClientDTOpatchPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOpatchSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final AcceptQueueDTO acceptQueueDTO = (AcceptQueueDTO)theEObject;
                Object result = this.caseAcceptQueueDTO(acceptQueueDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final ChangeSetSourceDTO changeSetSourceDTO = (ChangeSetSourceDTO)theEObject;
                Object result = this.caseChangeSetSourceDTO(changeSetSourceDTO);
                if (result == null) {
                    result = this.caseHelper((Helper)changeSetSourceDTO);
                }
                if (result == null) {
                    result = this.caseHelperFacade((IHelper)changeSetSourceDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final CurrentPatchDTO currentPatchDTO = (CurrentPatchDTO)theEObject;
                Object result = this.caseCurrentPatchDTO(currentPatchDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final VersionableChangeDTO versionableChangeDTO = (VersionableChangeDTO)theEObject;
                Object result = this.caseVersionableChangeDTO(versionableChangeDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final ChangeDetailDTO changeDetailDTO = (ChangeDetailDTO)theEObject;
                Object result = this.caseChangeDetailDTO(changeDetailDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final PropertyChangeDetailDTO propertyChangeDetailDTO = (PropertyChangeDetailDTO)theEObject;
                Object result = this.casePropertyChangeDetailDTO(propertyChangeDetailDTO);
                if (result == null) {
                    result = this.caseChangeDetailDTO(propertyChangeDetailDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final MoveChangeDetailDTO moveChangeDetailDTO = (MoveChangeDetailDTO)theEObject;
                Object result = this.caseMoveChangeDetailDTO(moveChangeDetailDTO);
                if (result == null) {
                    result = this.caseChangeDetailDTO(moveChangeDetailDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final SymbolicLinkChangeDetailDTO symbolicLinkChangeDetailDTO = (SymbolicLinkChangeDetailDTO)theEObject;
                Object result = this.caseSymbolicLinkChangeDetailDTO(symbolicLinkChangeDetailDTO);
                if (result == null) {
                    result = this.caseChangeDetailDTO(symbolicLinkChangeDetailDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 8: {
                final ContentChangeDetailDTO contentChangeDetailDTO = (ContentChangeDetailDTO)theEObject;
                Object result = this.caseContentChangeDetailDTO(contentChangeDetailDTO);
                if (result == null) {
                    result = this.caseChangeDetailDTO(contentChangeDetailDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 9: {
                final ContentTypeChangeDetailDTO contentTypeChangeDetailDTO = (ContentTypeChangeDetailDTO)theEObject;
                Object result = this.caseContentTypeChangeDetailDTO(contentTypeChangeDetailDTO);
                if (result == null) {
                    result = this.caseChangeDetailDTO(contentTypeChangeDetailDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 10: {
                final LineDelimiterChangeDetailDTO lineDelimiterChangeDetailDTO = (LineDelimiterChangeDetailDTO)theEObject;
                Object result = this.caseLineDelimiterChangeDetailDTO(lineDelimiterChangeDetailDTO);
                if (result == null) {
                    result = this.caseChangeDetailDTO(lineDelimiterChangeDetailDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 11: {
                final EncodingChangeDetailDTO encodingChangeDetailDTO = (EncodingChangeDetailDTO)theEObject;
                Object result = this.caseEncodingChangeDetailDTO(encodingChangeDetailDTO);
                if (result == null) {
                    result = this.caseChangeDetailDTO(encodingChangeDetailDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 12: {
                final ExecuteBitChangeDetailDTO executeBitChangeDetailDTO = (ExecuteBitChangeDetailDTO)theEObject;
                Object result = this.caseExecuteBitChangeDetailDTO(executeBitChangeDetailDTO);
                if (result == null) {
                    result = this.caseChangeDetailDTO(executeBitChangeDetailDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 13: {
                final AbortCurrentPatchResultDTO abortCurrentPatchResultDTO = (AbortCurrentPatchResultDTO)theEObject;
                Object result = this.caseAbortCurrentPatchResultDTO(abortCurrentPatchResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 14: {
                final UpdateCurrentPatchResultDTO updateCurrentPatchResultDTO = (UpdateCurrentPatchResultDTO)theEObject;
                Object result = this.caseUpdateCurrentPatchResultDTO(updateCurrentPatchResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 15: {
                final CompleteCurrentPatchResultDTO completeCurrentPatchResultDTO = (CompleteCurrentPatchResultDTO)theEObject;
                Object result = this.caseCompleteCurrentPatchResultDTO(completeCurrentPatchResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 16: {
                final ProcessAcceptQueueResultDTO processAcceptQueueResultDTO = (ProcessAcceptQueueResultDTO)theEObject;
                Object result = this.caseProcessAcceptQueueResultDTO(processAcceptQueueResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 17: {
                final PageDescriptorDTO pageDescriptorDTO = (PageDescriptorDTO)theEObject;
                Object result = this.casePageDescriptorDTO(pageDescriptorDTO);
                if (result == null) {
                    result = this.caseHelper((Helper)pageDescriptorDTO);
                }
                if (result == null) {
                    result = this.caseHelperFacade((IHelper)pageDescriptorDTO);
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
    
    public Object caseAcceptQueueDTO(final AcceptQueueDTO object) {
        return null;
    }
    
    public Object caseChangeSetSourceDTO(final ChangeSetSourceDTO object) {
        return null;
    }
    
    public Object caseCurrentPatchDTO(final CurrentPatchDTO object) {
        return null;
    }
    
    public Object caseVersionableChangeDTO(final VersionableChangeDTO object) {
        return null;
    }
    
    public Object caseChangeDetailDTO(final ChangeDetailDTO object) {
        return null;
    }
    
    public Object casePropertyChangeDetailDTO(final PropertyChangeDetailDTO object) {
        return null;
    }
    
    public Object caseMoveChangeDetailDTO(final MoveChangeDetailDTO object) {
        return null;
    }
    
    public Object caseSymbolicLinkChangeDetailDTO(final SymbolicLinkChangeDetailDTO object) {
        return null;
    }
    
    public Object caseContentChangeDetailDTO(final ContentChangeDetailDTO object) {
        return null;
    }
    
    public Object caseContentTypeChangeDetailDTO(final ContentTypeChangeDetailDTO object) {
        return null;
    }
    
    public Object caseLineDelimiterChangeDetailDTO(final LineDelimiterChangeDetailDTO object) {
        return null;
    }
    
    public Object caseEncodingChangeDetailDTO(final EncodingChangeDetailDTO object) {
        return null;
    }
    
    public Object caseExecuteBitChangeDetailDTO(final ExecuteBitChangeDetailDTO object) {
        return null;
    }
    
    public Object caseAbortCurrentPatchResultDTO(final AbortCurrentPatchResultDTO object) {
        return null;
    }
    
    public Object caseUpdateCurrentPatchResultDTO(final UpdateCurrentPatchResultDTO object) {
        return null;
    }
    
    public Object caseCompleteCurrentPatchResultDTO(final CompleteCurrentPatchResultDTO object) {
        return null;
    }
    
    public Object caseProcessAcceptQueueResultDTO(final ProcessAcceptQueueResultDTO object) {
        return null;
    }
    
    public Object casePageDescriptorDTO(final PageDescriptorDTO object) {
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
