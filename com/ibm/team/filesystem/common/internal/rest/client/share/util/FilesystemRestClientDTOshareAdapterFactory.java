// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.share.MultipleSandboxShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareOverlapDTO;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOshareAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOsharePackage modelPackage;
    protected FilesystemRestClientDTOshareSwitch modelSwitch;
    
    public FilesystemRestClientDTOshareAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOshareSwitch() {
            @Override
            public Object caseShareResultDTO(final ShareResultDTO object) {
                return FilesystemRestClientDTOshareAdapterFactory.this.createShareResultDTOAdapter();
            }
            
            @Override
            public Object caseShareOverlapDTO(final ShareOverlapDTO object) {
                return FilesystemRestClientDTOshareAdapterFactory.this.createShareOverlapDTOAdapter();
            }
            
            @Override
            public Object caseMultipleSandboxShareDTO(final MultipleSandboxShareDTO object) {
                return FilesystemRestClientDTOshareAdapterFactory.this.createMultipleSandboxShareDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOshareAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOshareAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOshareAdapterFactory.modelPackage = FilesystemRestClientDTOsharePackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOshareAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOshareAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createShareResultDTOAdapter() {
        return null;
    }
    
    public Adapter createShareOverlapDTOAdapter() {
        return null;
    }
    
    public Adapter createMultipleSandboxShareDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
