// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.dilemma.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.UpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.CommitDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.SandboxUpdateDilemmaDTO;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOdilemmaAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOdilemmaPackage modelPackage;
    protected FilesystemRestClientDTOdilemmaSwitch modelSwitch;
    
    public FilesystemRestClientDTOdilemmaAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOdilemmaSwitch() {
            @Override
            public Object caseSandboxUpdateDilemmaDTO(final SandboxUpdateDilemmaDTO object) {
                return FilesystemRestClientDTOdilemmaAdapterFactory.this.createSandboxUpdateDilemmaDTOAdapter();
            }
            
            @Override
            public Object caseCommitDilemmaDTO(final CommitDilemmaDTO object) {
                return FilesystemRestClientDTOdilemmaAdapterFactory.this.createCommitDilemmaDTOAdapter();
            }
            
            @Override
            public Object caseUpdateDilemmaDTO(final UpdateDilemmaDTO object) {
                return FilesystemRestClientDTOdilemmaAdapterFactory.this.createUpdateDilemmaDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOdilemmaAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOdilemmaAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOdilemmaAdapterFactory.modelPackage = FilesystemRestClientDTOdilemmaPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOdilemmaAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOdilemmaAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createSandboxUpdateDilemmaDTOAdapter() {
        return null;
    }
    
    public Adapter createCommitDilemmaDTOAdapter() {
        return null;
    }
    
    public Adapter createUpdateDilemmaDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
