// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.UnlockResourcesResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ContributorNameDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.VersionableLockDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ComponentLockReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.StreamLockReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedResourcesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedShareableDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOlocksAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOlocksPackage modelPackage;
    protected FilesystemRestClientDTOlocksSwitch modelSwitch;
    
    public FilesystemRestClientDTOlocksAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOlocksSwitch() {
            @Override
            public Object caseLockedShareableDTO(final LockedShareableDTO object) {
                return FilesystemRestClientDTOlocksAdapterFactory.this.createLockedShareableDTOAdapter();
            }
            
            @Override
            public Object caseLockedResourcesDTO(final LockedResourcesDTO object) {
                return FilesystemRestClientDTOlocksAdapterFactory.this.createLockedResourcesDTOAdapter();
            }
            
            @Override
            public Object caseStreamLockReportDTO(final StreamLockReportDTO object) {
                return FilesystemRestClientDTOlocksAdapterFactory.this.createStreamLockReportDTOAdapter();
            }
            
            @Override
            public Object caseComponentLockReportDTO(final ComponentLockReportDTO object) {
                return FilesystemRestClientDTOlocksAdapterFactory.this.createComponentLockReportDTOAdapter();
            }
            
            @Override
            public Object caseVersionableLockDTO(final VersionableLockDTO object) {
                return FilesystemRestClientDTOlocksAdapterFactory.this.createVersionableLockDTOAdapter();
            }
            
            @Override
            public Object caseContributorNameDTO(final ContributorNameDTO object) {
                return FilesystemRestClientDTOlocksAdapterFactory.this.createContributorNameDTOAdapter();
            }
            
            @Override
            public Object caseUnlockResourcesResultDTO(final UnlockResourcesResultDTO object) {
                return FilesystemRestClientDTOlocksAdapterFactory.this.createUnlockResourcesResultDTOAdapter();
            }
            
            @Override
            public Object caseLockEntryDTO(final LockEntryDTO object) {
                return FilesystemRestClientDTOlocksAdapterFactory.this.createLockEntryDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOlocksAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOlocksAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOlocksAdapterFactory.modelPackage = FilesystemRestClientDTOlocksPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOlocksAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOlocksAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createLockedShareableDTOAdapter() {
        return null;
    }
    
    public Adapter createLockedResourcesDTOAdapter() {
        return null;
    }
    
    public Adapter createStreamLockReportDTOAdapter() {
        return null;
    }
    
    public Adapter createComponentLockReportDTOAdapter() {
        return null;
    }
    
    public Adapter createVersionableLockDTOAdapter() {
        return null;
    }
    
    public Adapter createContributorNameDTOAdapter() {
        return null;
    }
    
    public Adapter createUnlockResourcesResultDTOAdapter() {
        return null;
    }
    
    public Adapter createLockEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
