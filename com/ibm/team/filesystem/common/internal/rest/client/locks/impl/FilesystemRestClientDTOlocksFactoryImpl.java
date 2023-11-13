// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks.impl;

import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.UnlockResourcesResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ContributorNameDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.VersionableLockDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ComponentLockReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.StreamLockReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedResourcesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedShareableDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOlocksFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOlocksFactory
{
    public static FilesystemRestClientDTOlocksFactory init() {
        try {
            final FilesystemRestClientDTOlocksFactory theFilesystemRestClientDTOlocksFactory = (FilesystemRestClientDTOlocksFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.locks");
            if (theFilesystemRestClientDTOlocksFactory != null) {
                return theFilesystemRestClientDTOlocksFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOlocksFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createLockedShareableDTO();
            }
            case 1: {
                return (EObject)this.createLockedResourcesDTO();
            }
            case 2: {
                return (EObject)this.createStreamLockReportDTO();
            }
            case 3: {
                return (EObject)this.createComponentLockReportDTO();
            }
            case 4: {
                return (EObject)this.createVersionableLockDTO();
            }
            case 5: {
                return (EObject)this.createContributorNameDTO();
            }
            case 6: {
                return (EObject)this.createUnlockResourcesResultDTO();
            }
            case 7: {
                return (EObject)this.createLockEntryDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public LockedShareableDTO createLockedShareableDTO() {
        final LockedShareableDTOImpl lockedShareableDTO = new LockedShareableDTOImpl();
        return lockedShareableDTO;
    }
    
    public LockedResourcesDTO createLockedResourcesDTO() {
        final LockedResourcesDTOImpl lockedResourcesDTO = new LockedResourcesDTOImpl();
        return lockedResourcesDTO;
    }
    
    public StreamLockReportDTO createStreamLockReportDTO() {
        final StreamLockReportDTOImpl streamLockReportDTO = new StreamLockReportDTOImpl();
        return streamLockReportDTO;
    }
    
    public ComponentLockReportDTO createComponentLockReportDTO() {
        final ComponentLockReportDTOImpl componentLockReportDTO = new ComponentLockReportDTOImpl();
        return componentLockReportDTO;
    }
    
    public VersionableLockDTO createVersionableLockDTO() {
        final VersionableLockDTOImpl versionableLockDTO = new VersionableLockDTOImpl();
        return versionableLockDTO;
    }
    
    public ContributorNameDTO createContributorNameDTO() {
        final ContributorNameDTOImpl contributorNameDTO = new ContributorNameDTOImpl();
        return contributorNameDTO;
    }
    
    public UnlockResourcesResultDTO createUnlockResourcesResultDTO() {
        final UnlockResourcesResultDTOImpl unlockResourcesResultDTO = new UnlockResourcesResultDTOImpl();
        return unlockResourcesResultDTO;
    }
    
    public LockEntryDTO createLockEntryDTO() {
        final LockEntryDTOImpl lockEntryDTO = new LockEntryDTOImpl();
        return lockEntryDTO;
    }
    
    public FilesystemRestClientDTOlocksPackage getFilesystemRestClientDTOlocksPackage() {
        return (FilesystemRestClientDTOlocksPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOlocksPackage getPackage() {
        return FilesystemRestClientDTOlocksPackage.eINSTANCE;
    }
}
