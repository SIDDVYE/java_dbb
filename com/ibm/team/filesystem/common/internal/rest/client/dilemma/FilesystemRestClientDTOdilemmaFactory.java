// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma;

import com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl.FilesystemRestClientDTOdilemmaFactoryImpl;
import org.eclipse.emf.ecore.EFactory;

public interface FilesystemRestClientDTOdilemmaFactory extends EFactory
{
    public static final FilesystemRestClientDTOdilemmaFactory eINSTANCE = FilesystemRestClientDTOdilemmaFactoryImpl.init();
    
    SandboxUpdateDilemmaDTO createSandboxUpdateDilemmaDTO();
    
    CommitDilemmaDTO createCommitDilemmaDTO();
    
    UpdateDilemmaDTO createUpdateDilemmaDTO();
    
    FilesystemRestClientDTOdilemmaPackage getFilesystemRestClientDTOdilemmaPackage();
}
