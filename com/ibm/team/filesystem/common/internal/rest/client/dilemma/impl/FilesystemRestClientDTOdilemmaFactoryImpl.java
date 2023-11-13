// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOdilemmaFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOdilemmaFactory
{
    public static FilesystemRestClientDTOdilemmaFactory init() {
        try {
            final FilesystemRestClientDTOdilemmaFactory theFilesystemRestClientDTOdilemmaFactory = (FilesystemRestClientDTOdilemmaFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.dilemma");
            if (theFilesystemRestClientDTOdilemmaFactory != null) {
                return theFilesystemRestClientDTOdilemmaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOdilemmaFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createSandboxUpdateDilemmaDTO();
            }
            case 1: {
                return (EObject)this.createCommitDilemmaDTO();
            }
            case 2: {
                return (EObject)this.createUpdateDilemmaDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public SandboxUpdateDilemmaDTO createSandboxUpdateDilemmaDTO() {
        final SandboxUpdateDilemmaDTOImpl sandboxUpdateDilemmaDTO = new SandboxUpdateDilemmaDTOImpl();
        return sandboxUpdateDilemmaDTO;
    }
    
    public CommitDilemmaDTO createCommitDilemmaDTO() {
        final CommitDilemmaDTOImpl commitDilemmaDTO = new CommitDilemmaDTOImpl();
        return commitDilemmaDTO;
    }
    
    public UpdateDilemmaDTO createUpdateDilemmaDTO() {
        final UpdateDilemmaDTOImpl updateDilemmaDTO = new UpdateDilemmaDTOImpl();
        return updateDilemmaDTO;
    }
    
    public FilesystemRestClientDTOdilemmaPackage getFilesystemRestClientDTOdilemmaPackage() {
        return (FilesystemRestClientDTOdilemmaPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOdilemmaPackage getPackage() {
        return FilesystemRestClientDTOdilemmaPackage.eINSTANCE;
    }
}
