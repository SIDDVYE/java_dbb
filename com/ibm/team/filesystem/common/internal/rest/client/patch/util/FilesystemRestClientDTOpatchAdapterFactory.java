// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.repository.common.model.Helper;
import com.ibm.team.repository.common.IHelper;
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
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeSetSourceDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.AcceptQueueDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOpatchAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOpatchPackage modelPackage;
    protected FilesystemRestClientDTOpatchSwitch modelSwitch;
    
    public FilesystemRestClientDTOpatchAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOpatchSwitch() {
            @Override
            public Object caseAcceptQueueDTO(final AcceptQueueDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createAcceptQueueDTOAdapter();
            }
            
            @Override
            public Object caseChangeSetSourceDTO(final ChangeSetSourceDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createChangeSetSourceDTOAdapter();
            }
            
            @Override
            public Object caseCurrentPatchDTO(final CurrentPatchDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createCurrentPatchDTOAdapter();
            }
            
            @Override
            public Object caseVersionableChangeDTO(final VersionableChangeDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createVersionableChangeDTOAdapter();
            }
            
            @Override
            public Object caseChangeDetailDTO(final ChangeDetailDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createChangeDetailDTOAdapter();
            }
            
            @Override
            public Object casePropertyChangeDetailDTO(final PropertyChangeDetailDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createPropertyChangeDetailDTOAdapter();
            }
            
            @Override
            public Object caseMoveChangeDetailDTO(final MoveChangeDetailDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createMoveChangeDetailDTOAdapter();
            }
            
            @Override
            public Object caseSymbolicLinkChangeDetailDTO(final SymbolicLinkChangeDetailDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createSymbolicLinkChangeDetailDTOAdapter();
            }
            
            @Override
            public Object caseContentChangeDetailDTO(final ContentChangeDetailDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createContentChangeDetailDTOAdapter();
            }
            
            @Override
            public Object caseContentTypeChangeDetailDTO(final ContentTypeChangeDetailDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createContentTypeChangeDetailDTOAdapter();
            }
            
            @Override
            public Object caseLineDelimiterChangeDetailDTO(final LineDelimiterChangeDetailDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createLineDelimiterChangeDetailDTOAdapter();
            }
            
            @Override
            public Object caseEncodingChangeDetailDTO(final EncodingChangeDetailDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createEncodingChangeDetailDTOAdapter();
            }
            
            @Override
            public Object caseExecuteBitChangeDetailDTO(final ExecuteBitChangeDetailDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createExecuteBitChangeDetailDTOAdapter();
            }
            
            @Override
            public Object caseAbortCurrentPatchResultDTO(final AbortCurrentPatchResultDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createAbortCurrentPatchResultDTOAdapter();
            }
            
            @Override
            public Object caseUpdateCurrentPatchResultDTO(final UpdateCurrentPatchResultDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createUpdateCurrentPatchResultDTOAdapter();
            }
            
            @Override
            public Object caseCompleteCurrentPatchResultDTO(final CompleteCurrentPatchResultDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createCompleteCurrentPatchResultDTOAdapter();
            }
            
            @Override
            public Object caseProcessAcceptQueueResultDTO(final ProcessAcceptQueueResultDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createProcessAcceptQueueResultDTOAdapter();
            }
            
            @Override
            public Object casePageDescriptorDTO(final PageDescriptorDTO object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createPageDescriptorDTOAdapter();
            }
            
            @Override
            public Object caseHelperFacade(final IHelper object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createHelperFacadeAdapter();
            }
            
            @Override
            public Object caseHelper(final Helper object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createHelperAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOpatchAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOpatchAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOpatchAdapterFactory.modelPackage = FilesystemRestClientDTOpatchPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOpatchAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOpatchAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createAcceptQueueDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeSetSourceDTOAdapter() {
        return null;
    }
    
    public Adapter createCurrentPatchDTOAdapter() {
        return null;
    }
    
    public Adapter createVersionableChangeDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeDetailDTOAdapter() {
        return null;
    }
    
    public Adapter createPropertyChangeDetailDTOAdapter() {
        return null;
    }
    
    public Adapter createMoveChangeDetailDTOAdapter() {
        return null;
    }
    
    public Adapter createSymbolicLinkChangeDetailDTOAdapter() {
        return null;
    }
    
    public Adapter createContentChangeDetailDTOAdapter() {
        return null;
    }
    
    public Adapter createContentTypeChangeDetailDTOAdapter() {
        return null;
    }
    
    public Adapter createLineDelimiterChangeDetailDTOAdapter() {
        return null;
    }
    
    public Adapter createEncodingChangeDetailDTOAdapter() {
        return null;
    }
    
    public Adapter createExecuteBitChangeDetailDTOAdapter() {
        return null;
    }
    
    public Adapter createAbortCurrentPatchResultDTOAdapter() {
        return null;
    }
    
    public Adapter createUpdateCurrentPatchResultDTOAdapter() {
        return null;
    }
    
    public Adapter createCompleteCurrentPatchResultDTOAdapter() {
        return null;
    }
    
    public Adapter createProcessAcceptQueueResultDTOAdapter() {
        return null;
    }
    
    public Adapter createPageDescriptorDTOAdapter() {
        return null;
    }
    
    public Adapter createHelperFacadeAdapter() {
        return null;
    }
    
    public Adapter createHelperAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
