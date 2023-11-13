// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.util;

import com.ibm.team.filesystem.common.internal.rest.client.resource.CustomAttributesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.PermissionsContextDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.MimeTypeErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.SymlinkWarningDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.SymlinkPropertiesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.InvalidPropertyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.PropertyFailureDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.EncodingErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FindShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FindShareablesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.MagicDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ChangeSummaryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ContentTransferDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.CheckinPolicyDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.SandboxPathsResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FileErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.LineDelimiterErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.IgnoreReasonDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilePropertiesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcePropertiesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcePropertyChangeResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcesDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;

public class FilesystemRestClientDTOresourceSwitch
{
    protected static FilesystemRestClientDTOresourcePackage modelPackage;
    
    public FilesystemRestClientDTOresourceSwitch() {
        if (FilesystemRestClientDTOresourceSwitch.modelPackage == null) {
            FilesystemRestClientDTOresourceSwitch.modelPackage = FilesystemRestClientDTOresourcePackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOresourceSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final ResourcesDTO resourcesDTO = (ResourcesDTO)theEObject;
                Object result = this.caseResourcesDTO(resourcesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final ResourcePropertyChangeResultDTO resourcePropertyChangeResultDTO = (ResourcePropertyChangeResultDTO)theEObject;
                Object result = this.caseResourcePropertyChangeResultDTO(resourcePropertyChangeResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final ResourcePropertiesDTO resourcePropertiesDTO = (ResourcePropertiesDTO)theEObject;
                Object result = this.caseResourcePropertiesDTO(resourcePropertiesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final FilePropertiesDTO filePropertiesDTO = (FilePropertiesDTO)theEObject;
                Object result = this.caseFilePropertiesDTO(filePropertiesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final IgnoreReasonDTO ignoreReasonDTO = (IgnoreReasonDTO)theEObject;
                Object result = this.caseIgnoreReasonDTO(ignoreReasonDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final LineDelimiterErrorDTO lineDelimiterErrorDTO = (LineDelimiterErrorDTO)theEObject;
                Object result = this.caseLineDelimiterErrorDTO(lineDelimiterErrorDTO);
                if (result == null) {
                    result = this.caseFileErrorDTO(lineDelimiterErrorDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final SandboxPathsResultDTO sandboxPathsResultDTO = (SandboxPathsResultDTO)theEObject;
                Object result = this.caseSandboxPathsResultDTO(sandboxPathsResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final CheckinPolicyDTO checkinPolicyDTO = (CheckinPolicyDTO)theEObject;
                Object result = this.caseCheckinPolicyDTO(checkinPolicyDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 8: {
                final ContentTransferDTO contentTransferDTO = (ContentTransferDTO)theEObject;
                Object result = this.caseContentTransferDTO(contentTransferDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 9: {
                final ChangeSummaryDTO changeSummaryDTO = (ChangeSummaryDTO)theEObject;
                Object result = this.caseChangeSummaryDTO(changeSummaryDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 10: {
                final MagicDTO magicDTO = (MagicDTO)theEObject;
                Object result = this.caseMagicDTO(magicDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 11: {
                final FindShareablesDTO findShareablesDTO = (FindShareablesDTO)theEObject;
                Object result = this.caseFindShareablesDTO(findShareablesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 12: {
                final FindShareableDTO findShareableDTO = (FindShareableDTO)theEObject;
                Object result = this.caseFindShareableDTO(findShareableDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 13: {
                final EncodingErrorDTO encodingErrorDTO = (EncodingErrorDTO)theEObject;
                Object result = this.caseEncodingErrorDTO(encodingErrorDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 14: {
                final PropertyFailureDTO propertyFailureDTO = (PropertyFailureDTO)theEObject;
                Object result = this.casePropertyFailureDTO(propertyFailureDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 15: {
                final InvalidPropertyDTO invalidPropertyDTO = (InvalidPropertyDTO)theEObject;
                Object result = this.caseInvalidPropertyDTO(invalidPropertyDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 16: {
                final SymlinkPropertiesDTO symlinkPropertiesDTO = (SymlinkPropertiesDTO)theEObject;
                Object result = this.caseSymlinkPropertiesDTO(symlinkPropertiesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 17: {
                final SymlinkWarningDTO symlinkWarningDTO = (SymlinkWarningDTO)theEObject;
                Object result = this.caseSymlinkWarningDTO(symlinkWarningDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 18: {
                final MimeTypeErrorDTO mimeTypeErrorDTO = (MimeTypeErrorDTO)theEObject;
                Object result = this.caseMimeTypeErrorDTO(mimeTypeErrorDTO);
                if (result == null) {
                    result = this.caseFileErrorDTO(mimeTypeErrorDTO);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 19: {
                final FileErrorDTO fileErrorDTO = (FileErrorDTO)theEObject;
                Object result = this.caseFileErrorDTO(fileErrorDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 20: {
                final PermissionsContextDTO permissionsContextDTO = (PermissionsContextDTO)theEObject;
                Object result = this.casePermissionsContextDTO(permissionsContextDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 21: {
                final CustomAttributesDTO customAttributesDTO = (CustomAttributesDTO)theEObject;
                Object result = this.caseCustomAttributesDTO(customAttributesDTO);
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
    
    public Object caseResourcesDTO(final ResourcesDTO object) {
        return null;
    }
    
    public Object caseResourcePropertyChangeResultDTO(final ResourcePropertyChangeResultDTO object) {
        return null;
    }
    
    public Object caseResourcePropertiesDTO(final ResourcePropertiesDTO object) {
        return null;
    }
    
    public Object caseFilePropertiesDTO(final FilePropertiesDTO object) {
        return null;
    }
    
    public Object caseIgnoreReasonDTO(final IgnoreReasonDTO object) {
        return null;
    }
    
    public Object caseLineDelimiterErrorDTO(final LineDelimiterErrorDTO object) {
        return null;
    }
    
    public Object caseSandboxPathsResultDTO(final SandboxPathsResultDTO object) {
        return null;
    }
    
    public Object caseCheckinPolicyDTO(final CheckinPolicyDTO object) {
        return null;
    }
    
    public Object caseContentTransferDTO(final ContentTransferDTO object) {
        return null;
    }
    
    public Object caseChangeSummaryDTO(final ChangeSummaryDTO object) {
        return null;
    }
    
    public Object caseMagicDTO(final MagicDTO object) {
        return null;
    }
    
    public Object caseFindShareablesDTO(final FindShareablesDTO object) {
        return null;
    }
    
    public Object caseFindShareableDTO(final FindShareableDTO object) {
        return null;
    }
    
    public Object caseEncodingErrorDTO(final EncodingErrorDTO object) {
        return null;
    }
    
    public Object casePropertyFailureDTO(final PropertyFailureDTO object) {
        return null;
    }
    
    public Object caseInvalidPropertyDTO(final InvalidPropertyDTO object) {
        return null;
    }
    
    public Object caseSymlinkPropertiesDTO(final SymlinkPropertiesDTO object) {
        return null;
    }
    
    public Object caseSymlinkWarningDTO(final SymlinkWarningDTO object) {
        return null;
    }
    
    public Object caseMimeTypeErrorDTO(final MimeTypeErrorDTO object) {
        return null;
    }
    
    public Object caseFileErrorDTO(final FileErrorDTO object) {
        return null;
    }
    
    public Object casePermissionsContextDTO(final PermissionsContextDTO object) {
        return null;
    }
    
    public Object caseCustomAttributesDTO(final CustomAttributesDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
