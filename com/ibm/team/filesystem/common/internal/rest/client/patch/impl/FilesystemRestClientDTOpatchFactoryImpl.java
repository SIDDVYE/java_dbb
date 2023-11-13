// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.patch.impl;

import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
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
import com.ibm.team.filesystem.common.internal.rest.client.patch.VersionableChangeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.CurrentPatchDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.ChangeSetSourceDTO;
import com.ibm.team.filesystem.common.internal.rest.client.patch.AcceptQueueDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOpatchFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOpatchFactory
{
    public static FilesystemRestClientDTOpatchFactory init() {
        try {
            final FilesystemRestClientDTOpatchFactory theFilesystemRestClientDTOpatchFactory = (FilesystemRestClientDTOpatchFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.patch");
            if (theFilesystemRestClientDTOpatchFactory != null) {
                return theFilesystemRestClientDTOpatchFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOpatchFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createAcceptQueueDTO();
            }
            case 1: {
                return (EObject)this.createChangeSetSourceDTO();
            }
            case 2: {
                return (EObject)this.createCurrentPatchDTO();
            }
            case 3: {
                return (EObject)this.createVersionableChangeDTO();
            }
            case 5: {
                return (EObject)this.createPropertyChangeDetailDTO();
            }
            case 6: {
                return (EObject)this.createMoveChangeDetailDTO();
            }
            case 7: {
                return (EObject)this.createSymbolicLinkChangeDetailDTO();
            }
            case 8: {
                return (EObject)this.createContentChangeDetailDTO();
            }
            case 9: {
                return (EObject)this.createContentTypeChangeDetailDTO();
            }
            case 10: {
                return (EObject)this.createLineDelimiterChangeDetailDTO();
            }
            case 11: {
                return (EObject)this.createEncodingChangeDetailDTO();
            }
            case 12: {
                return (EObject)this.createExecuteBitChangeDetailDTO();
            }
            case 13: {
                return (EObject)this.createAbortCurrentPatchResultDTO();
            }
            case 14: {
                return (EObject)this.createUpdateCurrentPatchResultDTO();
            }
            case 15: {
                return (EObject)this.createCompleteCurrentPatchResultDTO();
            }
            case 16: {
                return (EObject)this.createProcessAcceptQueueResultDTO();
            }
            case 17: {
                return (EObject)this.createPageDescriptorDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public AcceptQueueDTO createAcceptQueueDTO() {
        final AcceptQueueDTOImpl acceptQueueDTO = new AcceptQueueDTOImpl();
        return acceptQueueDTO;
    }
    
    public ChangeSetSourceDTO createChangeSetSourceDTO() {
        final ChangeSetSourceDTOImpl changeSetSourceDTO = new ChangeSetSourceDTOImpl();
        return changeSetSourceDTO;
    }
    
    public CurrentPatchDTO createCurrentPatchDTO() {
        final CurrentPatchDTOImpl currentPatchDTO = new CurrentPatchDTOImpl();
        return currentPatchDTO;
    }
    
    public VersionableChangeDTO createVersionableChangeDTO() {
        final VersionableChangeDTOImpl versionableChangeDTO = new VersionableChangeDTOImpl();
        return versionableChangeDTO;
    }
    
    public PropertyChangeDetailDTO createPropertyChangeDetailDTO() {
        final PropertyChangeDetailDTOImpl propertyChangeDetailDTO = new PropertyChangeDetailDTOImpl();
        return propertyChangeDetailDTO;
    }
    
    public MoveChangeDetailDTO createMoveChangeDetailDTO() {
        final MoveChangeDetailDTOImpl moveChangeDetailDTO = new MoveChangeDetailDTOImpl();
        return moveChangeDetailDTO;
    }
    
    public SymbolicLinkChangeDetailDTO createSymbolicLinkChangeDetailDTO() {
        final SymbolicLinkChangeDetailDTOImpl symbolicLinkChangeDetailDTO = new SymbolicLinkChangeDetailDTOImpl();
        return symbolicLinkChangeDetailDTO;
    }
    
    public ContentChangeDetailDTO createContentChangeDetailDTO() {
        final ContentChangeDetailDTOImpl contentChangeDetailDTO = new ContentChangeDetailDTOImpl();
        return contentChangeDetailDTO;
    }
    
    public ContentTypeChangeDetailDTO createContentTypeChangeDetailDTO() {
        final ContentTypeChangeDetailDTOImpl contentTypeChangeDetailDTO = new ContentTypeChangeDetailDTOImpl();
        return contentTypeChangeDetailDTO;
    }
    
    public LineDelimiterChangeDetailDTO createLineDelimiterChangeDetailDTO() {
        final LineDelimiterChangeDetailDTOImpl lineDelimiterChangeDetailDTO = new LineDelimiterChangeDetailDTOImpl();
        return lineDelimiterChangeDetailDTO;
    }
    
    public EncodingChangeDetailDTO createEncodingChangeDetailDTO() {
        final EncodingChangeDetailDTOImpl encodingChangeDetailDTO = new EncodingChangeDetailDTOImpl();
        return encodingChangeDetailDTO;
    }
    
    public ExecuteBitChangeDetailDTO createExecuteBitChangeDetailDTO() {
        final ExecuteBitChangeDetailDTOImpl executeBitChangeDetailDTO = new ExecuteBitChangeDetailDTOImpl();
        return executeBitChangeDetailDTO;
    }
    
    public AbortCurrentPatchResultDTO createAbortCurrentPatchResultDTO() {
        final AbortCurrentPatchResultDTOImpl abortCurrentPatchResultDTO = new AbortCurrentPatchResultDTOImpl();
        return abortCurrentPatchResultDTO;
    }
    
    public UpdateCurrentPatchResultDTO createUpdateCurrentPatchResultDTO() {
        final UpdateCurrentPatchResultDTOImpl updateCurrentPatchResultDTO = new UpdateCurrentPatchResultDTOImpl();
        return updateCurrentPatchResultDTO;
    }
    
    public CompleteCurrentPatchResultDTO createCompleteCurrentPatchResultDTO() {
        final CompleteCurrentPatchResultDTOImpl completeCurrentPatchResultDTO = new CompleteCurrentPatchResultDTOImpl();
        return completeCurrentPatchResultDTO;
    }
    
    public ProcessAcceptQueueResultDTO createProcessAcceptQueueResultDTO() {
        final ProcessAcceptQueueResultDTOImpl processAcceptQueueResultDTO = new ProcessAcceptQueueResultDTOImpl();
        return processAcceptQueueResultDTO;
    }
    
    public PageDescriptorDTO createPageDescriptorDTO() {
        final PageDescriptorDTOImpl pageDescriptorDTO = new PageDescriptorDTOImpl();
        return pageDescriptorDTO;
    }
    
    public FilesystemRestClientDTOpatchPackage getFilesystemRestClientDTOpatchPackage() {
        return (FilesystemRestClientDTOpatchPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOpatchPackage getPackage() {
        return FilesystemRestClientDTOpatchPackage.eINSTANCE;
    }
}
