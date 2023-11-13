// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks;

import com.ibm.team.filesystem.common.internal.rest.client.locks.impl.FilesystemRestClientDTOlocksFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOlocksFactory extends EFactory
{
    public static final FilesystemRestClientDTOlocksFactory eINSTANCE = FilesystemRestClientDTOlocksFactoryImpl.init();
    
    LockedShareableDTO createLockedShareableDTO();
    
    LockedResourcesDTO createLockedResourcesDTO();
    
    StreamLockReportDTO createStreamLockReportDTO();
    
    ComponentLockReportDTO createComponentLockReportDTO();
    
    VersionableLockDTO createVersionableLockDTO();
    
    ContributorNameDTO createContributorNameDTO();
    
    UnlockResourcesResultDTO createUnlockResourcesResultDTO();
    
    LockEntryDTO createLockEntryDTO();
    
    FilesystemRestClientDTOlocksPackage getFilesystemRestClientDTOlocksPackage();
}
