// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.corruption.util;

import com.ibm.team.filesystem.common.internal.rest.client.corruption.MetadataValidationResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.RebuildCopyFileAreaDTO;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.FilesystemRestClientDTOcorruptionPackage;

public class FilesystemRestClientDTOcorruptionSwitch
{
    protected static FilesystemRestClientDTOcorruptionPackage modelPackage;
    
    public FilesystemRestClientDTOcorruptionSwitch() {
        if (FilesystemRestClientDTOcorruptionSwitch.modelPackage == null) {
            FilesystemRestClientDTOcorruptionSwitch.modelPackage = FilesystemRestClientDTOcorruptionPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemRestClientDTOcorruptionSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final RebuildCopyFileAreaDTO rebuildCopyFileAreaDTO = (RebuildCopyFileAreaDTO)theEObject;
                Object result = this.caseRebuildCopyFileAreaDTO(rebuildCopyFileAreaDTO);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final MetadataValidationResultDTO metadataValidationResultDTO = (MetadataValidationResultDTO)theEObject;
                Object result = this.caseMetadataValidationResultDTO(metadataValidationResultDTO);
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
    
    public Object caseRebuildCopyFileAreaDTO(final RebuildCopyFileAreaDTO object) {
        return null;
    }
    
    public Object caseMetadataValidationResultDTO(final MetadataValidationResultDTO object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
