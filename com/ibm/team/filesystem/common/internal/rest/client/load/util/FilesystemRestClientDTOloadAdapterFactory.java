// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.load.UnLoadResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.SandboxLoadRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.SandboxLoadRulesResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.MultipleSandboxLoadDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.OverlappedItemDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadFileResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadFileOperationResultDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.InvalidLoadRequestDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.ShareToLoadDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadLocationDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.CollisionDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.RemovedShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadOverlapDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.LoadEvaluationDTO;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOloadAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOloadPackage modelPackage;
    protected FilesystemRestClientDTOloadSwitch modelSwitch;
    
    public FilesystemRestClientDTOloadAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOloadSwitch() {
            @Override
            public Object caseLoadEvaluationDTO(final LoadEvaluationDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createLoadEvaluationDTOAdapter();
            }
            
            @Override
            public Object caseLoadOverlapDTO(final LoadOverlapDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createLoadOverlapDTOAdapter();
            }
            
            @Override
            public Object caseRemovedShareDTO(final RemovedShareDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createRemovedShareDTOAdapter();
            }
            
            @Override
            public Object caseCollisionDTO(final CollisionDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createCollisionDTOAdapter();
            }
            
            @Override
            public Object caseLoadLocationDTO(final LoadLocationDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createLoadLocationDTOAdapter();
            }
            
            @Override
            public Object caseShareToLoadDTO(final ShareToLoadDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createShareToLoadDTOAdapter();
            }
            
            @Override
            public Object caseInvalidLoadRequestDTO(final InvalidLoadRequestDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createInvalidLoadRequestDTOAdapter();
            }
            
            @Override
            public Object caseLoadFileOperationResultDTO(final LoadFileOperationResultDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createLoadFileOperationResultDTOAdapter();
            }
            
            @Override
            public Object caseLoadFileResultDTO(final LoadFileResultDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createLoadFileResultDTOAdapter();
            }
            
            @Override
            public Object caseOverlappedItemDTO(final OverlappedItemDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createOverlappedItemDTOAdapter();
            }
            
            @Override
            public Object caseMultipleSandboxLoadDTO(final MultipleSandboxLoadDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createMultipleSandboxLoadDTOAdapter();
            }
            
            @Override
            public Object caseLoadResultDTO(final LoadResultDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createLoadResultDTOAdapter();
            }
            
            @Override
            public Object caseSandboxLoadRulesResultDTO(final SandboxLoadRulesResultDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createSandboxLoadRulesResultDTOAdapter();
            }
            
            @Override
            public Object caseSandboxLoadRuleDTO(final SandboxLoadRuleDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createSandboxLoadRuleDTOAdapter();
            }
            
            @Override
            public Object caseUnLoadResultDTO(final UnLoadResultDTO object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createUnLoadResultDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOloadAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOloadAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOloadAdapterFactory.modelPackage = FilesystemRestClientDTOloadPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOloadAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOloadAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createLoadEvaluationDTOAdapter() {
        return null;
    }
    
    public Adapter createLoadOverlapDTOAdapter() {
        return null;
    }
    
    public Adapter createRemovedShareDTOAdapter() {
        return null;
    }
    
    public Adapter createCollisionDTOAdapter() {
        return null;
    }
    
    public Adapter createLoadLocationDTOAdapter() {
        return null;
    }
    
    public Adapter createShareToLoadDTOAdapter() {
        return null;
    }
    
    public Adapter createInvalidLoadRequestDTOAdapter() {
        return null;
    }
    
    public Adapter createLoadFileOperationResultDTOAdapter() {
        return null;
    }
    
    public Adapter createLoadFileResultDTOAdapter() {
        return null;
    }
    
    public Adapter createOverlappedItemDTOAdapter() {
        return null;
    }
    
    public Adapter createMultipleSandboxLoadDTOAdapter() {
        return null;
    }
    
    public Adapter createLoadResultDTOAdapter() {
        return null;
    }
    
    public Adapter createSandboxLoadRulesResultDTOAdapter() {
        return null;
    }
    
    public Adapter createSandboxLoadRuleDTOAdapter() {
        return null;
    }
    
    public Adapter createUnLoadResultDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
