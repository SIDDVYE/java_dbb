// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
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
import com.ibm.team.filesystem.common.internal.rest.client.resource.LineDelimiterErrorDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.IgnoreReasonDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilePropertiesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcePropertiesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcePropertyChangeResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.ResourcesDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourceFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOresourceFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOresourceFactory
{
    public static FilesystemRestClientDTOresourceFactory init() {
        try {
            final FilesystemRestClientDTOresourceFactory theFilesystemRestClientDTOresourceFactory = (FilesystemRestClientDTOresourceFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.resource");
            if (theFilesystemRestClientDTOresourceFactory != null) {
                return theFilesystemRestClientDTOresourceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOresourceFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createResourcesDTO();
            }
            case 1: {
                return (EObject)this.createResourcePropertyChangeResultDTO();
            }
            case 2: {
                return (EObject)this.createResourcePropertiesDTO();
            }
            case 3: {
                return (EObject)this.createFilePropertiesDTO();
            }
            case 4: {
                return (EObject)this.createIgnoreReasonDTO();
            }
            case 5: {
                return (EObject)this.createLineDelimiterErrorDTO();
            }
            case 6: {
                return (EObject)this.createSandboxPathsResultDTO();
            }
            case 7: {
                return (EObject)this.createCheckinPolicyDTO();
            }
            case 8: {
                return (EObject)this.createContentTransferDTO();
            }
            case 9: {
                return (EObject)this.createChangeSummaryDTO();
            }
            case 10: {
                return (EObject)this.createMagicDTO();
            }
            case 11: {
                return (EObject)this.createFindShareablesDTO();
            }
            case 12: {
                return (EObject)this.createFindShareableDTO();
            }
            case 13: {
                return (EObject)this.createEncodingErrorDTO();
            }
            case 14: {
                return (EObject)this.createPropertyFailureDTO();
            }
            case 15: {
                return (EObject)this.createInvalidPropertyDTO();
            }
            case 16: {
                return (EObject)this.createSymlinkPropertiesDTO();
            }
            case 17: {
                return (EObject)this.createSymlinkWarningDTO();
            }
            case 18: {
                return (EObject)this.createMimeTypeErrorDTO();
            }
            case 20: {
                return (EObject)this.createPermissionsContextDTO();
            }
            case 21: {
                return (EObject)this.createCustomAttributesDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public ResourcesDTO createResourcesDTO() {
        final ResourcesDTOImpl resourcesDTO = new ResourcesDTOImpl();
        return resourcesDTO;
    }
    
    public ResourcePropertyChangeResultDTO createResourcePropertyChangeResultDTO() {
        final ResourcePropertyChangeResultDTOImpl resourcePropertyChangeResultDTO = new ResourcePropertyChangeResultDTOImpl();
        return resourcePropertyChangeResultDTO;
    }
    
    public ResourcePropertiesDTO createResourcePropertiesDTO() {
        final ResourcePropertiesDTOImpl resourcePropertiesDTO = new ResourcePropertiesDTOImpl();
        return resourcePropertiesDTO;
    }
    
    public FilePropertiesDTO createFilePropertiesDTO() {
        final FilePropertiesDTOImpl filePropertiesDTO = new FilePropertiesDTOImpl();
        return filePropertiesDTO;
    }
    
    public IgnoreReasonDTO createIgnoreReasonDTO() {
        final IgnoreReasonDTOImpl ignoreReasonDTO = new IgnoreReasonDTOImpl();
        return ignoreReasonDTO;
    }
    
    public LineDelimiterErrorDTO createLineDelimiterErrorDTO() {
        final LineDelimiterErrorDTOImpl lineDelimiterErrorDTO = new LineDelimiterErrorDTOImpl();
        return lineDelimiterErrorDTO;
    }
    
    public SandboxPathsResultDTO createSandboxPathsResultDTO() {
        final SandboxPathsResultDTOImpl sandboxPathsResultDTO = new SandboxPathsResultDTOImpl();
        return sandboxPathsResultDTO;
    }
    
    public CheckinPolicyDTO createCheckinPolicyDTO() {
        final CheckinPolicyDTOImpl checkinPolicyDTO = new CheckinPolicyDTOImpl();
        return checkinPolicyDTO;
    }
    
    public ContentTransferDTO createContentTransferDTO() {
        final ContentTransferDTOImpl contentTransferDTO = new ContentTransferDTOImpl();
        return contentTransferDTO;
    }
    
    public ChangeSummaryDTO createChangeSummaryDTO() {
        final ChangeSummaryDTOImpl changeSummaryDTO = new ChangeSummaryDTOImpl();
        return changeSummaryDTO;
    }
    
    public MagicDTO createMagicDTO() {
        final MagicDTOImpl magicDTO = new MagicDTOImpl();
        return magicDTO;
    }
    
    public FindShareablesDTO createFindShareablesDTO() {
        final FindShareablesDTOImpl findShareablesDTO = new FindShareablesDTOImpl();
        return findShareablesDTO;
    }
    
    public FindShareableDTO createFindShareableDTO() {
        final FindShareableDTOImpl findShareableDTO = new FindShareableDTOImpl();
        return findShareableDTO;
    }
    
    public EncodingErrorDTO createEncodingErrorDTO() {
        final EncodingErrorDTOImpl encodingErrorDTO = new EncodingErrorDTOImpl();
        return encodingErrorDTO;
    }
    
    public PropertyFailureDTO createPropertyFailureDTO() {
        final PropertyFailureDTOImpl propertyFailureDTO = new PropertyFailureDTOImpl();
        return propertyFailureDTO;
    }
    
    public InvalidPropertyDTO createInvalidPropertyDTO() {
        final InvalidPropertyDTOImpl invalidPropertyDTO = new InvalidPropertyDTOImpl();
        return invalidPropertyDTO;
    }
    
    public SymlinkPropertiesDTO createSymlinkPropertiesDTO() {
        final SymlinkPropertiesDTOImpl symlinkPropertiesDTO = new SymlinkPropertiesDTOImpl();
        return symlinkPropertiesDTO;
    }
    
    public SymlinkWarningDTO createSymlinkWarningDTO() {
        final SymlinkWarningDTOImpl symlinkWarningDTO = new SymlinkWarningDTOImpl();
        return symlinkWarningDTO;
    }
    
    public MimeTypeErrorDTO createMimeTypeErrorDTO() {
        final MimeTypeErrorDTOImpl mimeTypeErrorDTO = new MimeTypeErrorDTOImpl();
        return mimeTypeErrorDTO;
    }
    
    public PermissionsContextDTO createPermissionsContextDTO() {
        final PermissionsContextDTOImpl permissionsContextDTO = new PermissionsContextDTOImpl();
        return permissionsContextDTO;
    }
    
    public CustomAttributesDTO createCustomAttributesDTO() {
        final CustomAttributesDTOImpl customAttributesDTO = new CustomAttributesDTOImpl();
        return customAttributesDTO;
    }
    
    public FilesystemRestClientDTOresourcePackage getFilesystemRestClientDTOresourcePackage() {
        return (FilesystemRestClientDTOresourcePackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOresourcePackage getPackage() {
        return FilesystemRestClientDTOresourcePackage.eINSTANCE;
    }
}
