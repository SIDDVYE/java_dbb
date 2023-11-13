// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.corruption.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.MetadataValidationResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.RebuildCopyFileAreaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.FilesystemRestClientDTOcorruptionPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOcorruptionAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOcorruptionPackage modelPackage;
    protected FilesystemRestClientDTOcorruptionSwitch modelSwitch;
    
    public FilesystemRestClientDTOcorruptionAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOcorruptionSwitch() {
            @Override
            public Object caseRebuildCopyFileAreaDTO(final RebuildCopyFileAreaDTO object) {
                return FilesystemRestClientDTOcorruptionAdapterFactory.this.createRebuildCopyFileAreaDTOAdapter();
            }
            
            @Override
            public Object caseMetadataValidationResultDTO(final MetadataValidationResultDTO object) {
                return FilesystemRestClientDTOcorruptionAdapterFactory.this.createMetadataValidationResultDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOcorruptionAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOcorruptionAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOcorruptionAdapterFactory.modelPackage = FilesystemRestClientDTOcorruptionPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOcorruptionAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOcorruptionAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createRebuildCopyFileAreaDTOAdapter() {
        return null;
    }
    
    public Adapter createMetadataValidationResultDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
