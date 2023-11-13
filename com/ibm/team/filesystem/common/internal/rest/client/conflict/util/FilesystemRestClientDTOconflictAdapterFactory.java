// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.conflict.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveWithProposedEvaluationDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FailedMergeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ConflictedChangeDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveAutoMergeResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveAsMergedResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.ResolveWithProposedResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FilesystemRestClientDTOconflictPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOconflictAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOconflictPackage modelPackage;
    protected FilesystemRestClientDTOconflictSwitch modelSwitch;
    
    public FilesystemRestClientDTOconflictAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOconflictSwitch() {
            @Override
            public Object caseResolveWithProposedResultDTO(final ResolveWithProposedResultDTO object) {
                return FilesystemRestClientDTOconflictAdapterFactory.this.createResolveWithProposedResultDTOAdapter();
            }
            
            @Override
            public Object caseResolveAsMergedResultDTO(final ResolveAsMergedResultDTO object) {
                return FilesystemRestClientDTOconflictAdapterFactory.this.createResolveAsMergedResultDTOAdapter();
            }
            
            @Override
            public Object caseResolveAutoMergeResultDTO(final ResolveAutoMergeResultDTO object) {
                return FilesystemRestClientDTOconflictAdapterFactory.this.createResolveAutoMergeResultDTOAdapter();
            }
            
            @Override
            public Object caseConflictedChangeDTO(final ConflictedChangeDTO object) {
                return FilesystemRestClientDTOconflictAdapterFactory.this.createConflictedChangeDTOAdapter();
            }
            
            @Override
            public Object caseFailedMergeDTO(final FailedMergeDTO object) {
                return FilesystemRestClientDTOconflictAdapterFactory.this.createFailedMergeDTOAdapter();
            }
            
            @Override
            public Object caseResolveWithProposedEvaluationDTO(final ResolveWithProposedEvaluationDTO object) {
                return FilesystemRestClientDTOconflictAdapterFactory.this.createResolveWithProposedEvaluationDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOconflictAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOconflictAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOconflictAdapterFactory.modelPackage = FilesystemRestClientDTOconflictPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOconflictAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOconflictAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createResolveWithProposedResultDTOAdapter() {
        return null;
    }
    
    public Adapter createResolveAsMergedResultDTOAdapter() {
        return null;
    }
    
    public Adapter createResolveAutoMergeResultDTOAdapter() {
        return null;
    }
    
    public Adapter createConflictedChangeDTOAdapter() {
        return null;
    }
    
    public Adapter createFailedMergeDTOAdapter() {
        return null;
    }
    
    public Adapter createResolveWithProposedEvaluationDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
