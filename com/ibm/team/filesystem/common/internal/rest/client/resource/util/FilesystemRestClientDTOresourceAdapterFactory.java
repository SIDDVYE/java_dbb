// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.resource.CustomAttributesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.PermissionsContextDTO;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FileErrorDTO;
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
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOresourceAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOresourcePackage modelPackage;
    protected FilesystemRestClientDTOresourceSwitch modelSwitch;
    
    public FilesystemRestClientDTOresourceAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOresourceSwitch() {
            @Override
            public Object caseResourcesDTO(final ResourcesDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createResourcesDTOAdapter();
            }
            
            @Override
            public Object caseResourcePropertyChangeResultDTO(final ResourcePropertyChangeResultDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createResourcePropertyChangeResultDTOAdapter();
            }
            
            @Override
            public Object caseResourcePropertiesDTO(final ResourcePropertiesDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createResourcePropertiesDTOAdapter();
            }
            
            @Override
            public Object caseFilePropertiesDTO(final FilePropertiesDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createFilePropertiesDTOAdapter();
            }
            
            @Override
            public Object caseIgnoreReasonDTO(final IgnoreReasonDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createIgnoreReasonDTOAdapter();
            }
            
            @Override
            public Object caseLineDelimiterErrorDTO(final LineDelimiterErrorDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createLineDelimiterErrorDTOAdapter();
            }
            
            @Override
            public Object caseSandboxPathsResultDTO(final SandboxPathsResultDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createSandboxPathsResultDTOAdapter();
            }
            
            @Override
            public Object caseCheckinPolicyDTO(final CheckinPolicyDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createCheckinPolicyDTOAdapter();
            }
            
            @Override
            public Object caseContentTransferDTO(final ContentTransferDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createContentTransferDTOAdapter();
            }
            
            @Override
            public Object caseChangeSummaryDTO(final ChangeSummaryDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createChangeSummaryDTOAdapter();
            }
            
            @Override
            public Object caseMagicDTO(final MagicDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createMagicDTOAdapter();
            }
            
            @Override
            public Object caseFindShareablesDTO(final FindShareablesDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createFindShareablesDTOAdapter();
            }
            
            @Override
            public Object caseFindShareableDTO(final FindShareableDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createFindShareableDTOAdapter();
            }
            
            @Override
            public Object caseEncodingErrorDTO(final EncodingErrorDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createEncodingErrorDTOAdapter();
            }
            
            @Override
            public Object casePropertyFailureDTO(final PropertyFailureDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createPropertyFailureDTOAdapter();
            }
            
            @Override
            public Object caseInvalidPropertyDTO(final InvalidPropertyDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createInvalidPropertyDTOAdapter();
            }
            
            @Override
            public Object caseSymlinkPropertiesDTO(final SymlinkPropertiesDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createSymlinkPropertiesDTOAdapter();
            }
            
            @Override
            public Object caseSymlinkWarningDTO(final SymlinkWarningDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createSymlinkWarningDTOAdapter();
            }
            
            @Override
            public Object caseMimeTypeErrorDTO(final MimeTypeErrorDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createMimeTypeErrorDTOAdapter();
            }
            
            @Override
            public Object caseFileErrorDTO(final FileErrorDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createFileErrorDTOAdapter();
            }
            
            @Override
            public Object casePermissionsContextDTO(final PermissionsContextDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createPermissionsContextDTOAdapter();
            }
            
            @Override
            public Object caseCustomAttributesDTO(final CustomAttributesDTO object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createCustomAttributesDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOresourceAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOresourceAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOresourceAdapterFactory.modelPackage = FilesystemRestClientDTOresourcePackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOresourceAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOresourceAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createResourcesDTOAdapter() {
        return null;
    }
    
    public Adapter createResourcePropertyChangeResultDTOAdapter() {
        return null;
    }
    
    public Adapter createResourcePropertiesDTOAdapter() {
        return null;
    }
    
    public Adapter createFilePropertiesDTOAdapter() {
        return null;
    }
    
    public Adapter createIgnoreReasonDTOAdapter() {
        return null;
    }
    
    public Adapter createLineDelimiterErrorDTOAdapter() {
        return null;
    }
    
    public Adapter createSandboxPathsResultDTOAdapter() {
        return null;
    }
    
    public Adapter createCheckinPolicyDTOAdapter() {
        return null;
    }
    
    public Adapter createContentTransferDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeSummaryDTOAdapter() {
        return null;
    }
    
    public Adapter createMagicDTOAdapter() {
        return null;
    }
    
    public Adapter createFindShareablesDTOAdapter() {
        return null;
    }
    
    public Adapter createFindShareableDTOAdapter() {
        return null;
    }
    
    public Adapter createEncodingErrorDTOAdapter() {
        return null;
    }
    
    public Adapter createPropertyFailureDTOAdapter() {
        return null;
    }
    
    public Adapter createInvalidPropertyDTOAdapter() {
        return null;
    }
    
    public Adapter createSymlinkPropertiesDTOAdapter() {
        return null;
    }
    
    public Adapter createSymlinkWarningDTOAdapter() {
        return null;
    }
    
    public Adapter createMimeTypeErrorDTOAdapter() {
        return null;
    }
    
    public Adapter createFileErrorDTOAdapter() {
        return null;
    }
    
    public Adapter createPermissionsContextDTOAdapter() {
        return null;
    }
    
    public Adapter createCustomAttributesDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
