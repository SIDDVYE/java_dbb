// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.locks.util;

import com.ibm.team.filesystem.common.internal.rest.client.locks.LockEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.UnlockResourcesResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ContributorNameDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.VersionableLockDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.ComponentLockReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.StreamLockReportDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedResourcesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.locks.LockedShareableDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;

public class FilesystemRestClientDTOlocksSwitch
{
    protected static FilesystemRestClientDTOlocksPackage modelPackage;
    
    public FilesystemRestClientDTOlocksSwitch() {
        if (FilesystemRestClientDTOlocksSwitch.modelPackage == null) {
            FilesystemRestClientDTOlocksSwitch.modelPackage = FilesystemRestClientDTOlocksPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOlocksSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final LockedShareableDTO lockedShareableDTO = (LockedShareableDTO)theEObject;
                Object result = this.caseLockedShareableDTO(lockedShareableDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final LockedResourcesDTO lockedResourcesDTO = (LockedResourcesDTO)theEObject;
                Object result = this.caseLockedResourcesDTO(lockedResourcesDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 2: {
                final StreamLockReportDTO streamLockReportDTO = (StreamLockReportDTO)theEObject;
                Object result = this.caseStreamLockReportDTO(streamLockReportDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final ComponentLockReportDTO componentLockReportDTO = (ComponentLockReportDTO)theEObject;
                Object result = this.caseComponentLockReportDTO(componentLockReportDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 4: {
                final VersionableLockDTO versionableLockDTO = (VersionableLockDTO)theEObject;
                Object result = this.caseVersionableLockDTO(versionableLockDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final ContributorNameDTO contributorNameDTO = (ContributorNameDTO)theEObject;
                Object result = this.caseContributorNameDTO(contributorNameDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 6: {
                final UnlockResourcesResultDTO unlockResourcesResultDTO = (UnlockResourcesResultDTO)theEObject;
                Object result = this.caseUnlockResourcesResultDTO(unlockResourcesResultDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final LockEntryDTO lockEntryDTO = (LockEntryDTO)theEObject;
                Object result = this.caseLockEntryDTO(lockEntryDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            default: {
                return this.defaultCase(theEObject);
            }
        }
    }
    
    public Object caseLockedShareableDTO(final LockedShareableDTO object) {
        return null;
    }
    
    public Object caseLockedResourcesDTO(final LockedResourcesDTO object) {
        return null;
    }
    
    public Object caseStreamLockReportDTO(final StreamLockReportDTO object) {
        return null;
    }
    
    public Object caseComponentLockReportDTO(final ComponentLockReportDTO object) {
        return null;
    }
    
    public Object caseVersionableLockDTO(final VersionableLockDTO object) {
        return null;
    }
    
    public Object caseContributorNameDTO(final ContributorNameDTO object) {
        return null;
    }
    
    public Object caseUnlockResourcesResultDTO(final UnlockResourcesResultDTO object) {
        return null;
    }
    
    public Object caseLockEntryDTO(final LockEntryDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
