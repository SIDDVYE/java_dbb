// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.corruption.impl;

import com.ibm.team.filesystem.common.internal.rest.client.corruption.FilesystemRestClientDTOcorruptionPackage;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.MetadataValidationResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.RebuildCopyFileAreaDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.FilesystemRestClientDTOcorruptionFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOcorruptionFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOcorruptionFactory
{
    public static FilesystemRestClientDTOcorruptionFactory init() {
        try {
            final FilesystemRestClientDTOcorruptionFactory theFilesystemRestClientDTOcorruptionFactory = (FilesystemRestClientDTOcorruptionFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.corruption");
            if (theFilesystemRestClientDTOcorruptionFactory != null) {
                return theFilesystemRestClientDTOcorruptionFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOcorruptionFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createRebuildCopyFileAreaDTO();
            }
            case 1: {
                return (EObject)this.createMetadataValidationResultDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public RebuildCopyFileAreaDTO createRebuildCopyFileAreaDTO() {
        final RebuildCopyFileAreaDTOImpl rebuildCopyFileAreaDTO = new RebuildCopyFileAreaDTOImpl();
        return rebuildCopyFileAreaDTO;
    }
    
    public MetadataValidationResultDTO createMetadataValidationResultDTO() {
        final MetadataValidationResultDTOImpl metadataValidationResultDTO = new MetadataValidationResultDTOImpl();
        return metadataValidationResultDTO;
    }
    
    public FilesystemRestClientDTOcorruptionPackage getFilesystemRestClientDTOcorruptionPackage() {
        return (FilesystemRestClientDTOcorruptionPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOcorruptionPackage getPackage() {
        return FilesystemRestClientDTOcorruptionPackage.eINSTANCE;
    }
}
