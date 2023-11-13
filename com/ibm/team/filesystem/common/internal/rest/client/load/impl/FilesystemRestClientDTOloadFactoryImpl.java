// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.load.impl;

import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOloadFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOloadFactory
{
    public static FilesystemRestClientDTOloadFactory init() {
        try {
            final FilesystemRestClientDTOloadFactory theFilesystemRestClientDTOloadFactory = (FilesystemRestClientDTOloadFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.load");
            if (theFilesystemRestClientDTOloadFactory != null) {
                return theFilesystemRestClientDTOloadFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOloadFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createLoadEvaluationDTO();
            }
            case 1: {
                return (EObject)this.createLoadOverlapDTO();
            }
            case 2: {
                return (EObject)this.createRemovedShareDTO();
            }
            case 3: {
                return (EObject)this.createCollisionDTO();
            }
            case 4: {
                return (EObject)this.createLoadLocationDTO();
            }
            case 5: {
                return (EObject)this.createShareToLoadDTO();
            }
            case 6: {
                return (EObject)this.createInvalidLoadRequestDTO();
            }
            case 7: {
                return (EObject)this.createLoadFileOperationResultDTO();
            }
            case 8: {
                return (EObject)this.createLoadFileResultDTO();
            }
            case 9: {
                return (EObject)this.createOverlappedItemDTO();
            }
            case 10: {
                return (EObject)this.createMultipleSandboxLoadDTO();
            }
            case 11: {
                return (EObject)this.createLoadResultDTO();
            }
            case 12: {
                return (EObject)this.createSandboxLoadRulesResultDTO();
            }
            case 13: {
                return (EObject)this.createSandboxLoadRuleDTO();
            }
            case 14: {
                return (EObject)this.createUnLoadResultDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public LoadEvaluationDTO createLoadEvaluationDTO() {
        final LoadEvaluationDTOImpl loadEvaluationDTO = new LoadEvaluationDTOImpl();
        return loadEvaluationDTO;
    }
    
    public LoadOverlapDTO createLoadOverlapDTO() {
        final LoadOverlapDTOImpl loadOverlapDTO = new LoadOverlapDTOImpl();
        return loadOverlapDTO;
    }
    
    public RemovedShareDTO createRemovedShareDTO() {
        final RemovedShareDTOImpl removedShareDTO = new RemovedShareDTOImpl();
        return removedShareDTO;
    }
    
    public CollisionDTO createCollisionDTO() {
        final CollisionDTOImpl collisionDTO = new CollisionDTOImpl();
        return collisionDTO;
    }
    
    public LoadLocationDTO createLoadLocationDTO() {
        final LoadLocationDTOImpl loadLocationDTO = new LoadLocationDTOImpl();
        return loadLocationDTO;
    }
    
    public ShareToLoadDTO createShareToLoadDTO() {
        final ShareToLoadDTOImpl shareToLoadDTO = new ShareToLoadDTOImpl();
        return shareToLoadDTO;
    }
    
    public InvalidLoadRequestDTO createInvalidLoadRequestDTO() {
        final InvalidLoadRequestDTOImpl invalidLoadRequestDTO = new InvalidLoadRequestDTOImpl();
        return invalidLoadRequestDTO;
    }
    
    public LoadFileOperationResultDTO createLoadFileOperationResultDTO() {
        final LoadFileOperationResultDTOImpl loadFileOperationResultDTO = new LoadFileOperationResultDTOImpl();
        return loadFileOperationResultDTO;
    }
    
    public LoadFileResultDTO createLoadFileResultDTO() {
        final LoadFileResultDTOImpl loadFileResultDTO = new LoadFileResultDTOImpl();
        return loadFileResultDTO;
    }
    
    public OverlappedItemDTO createOverlappedItemDTO() {
        final OverlappedItemDTOImpl overlappedItemDTO = new OverlappedItemDTOImpl();
        return overlappedItemDTO;
    }
    
    public MultipleSandboxLoadDTO createMultipleSandboxLoadDTO() {
        final MultipleSandboxLoadDTOImpl multipleSandboxLoadDTO = new MultipleSandboxLoadDTOImpl();
        return multipleSandboxLoadDTO;
    }
    
    public LoadResultDTO createLoadResultDTO() {
        final LoadResultDTOImpl loadResultDTO = new LoadResultDTOImpl();
        return loadResultDTO;
    }
    
    public SandboxLoadRulesResultDTO createSandboxLoadRulesResultDTO() {
        final SandboxLoadRulesResultDTOImpl sandboxLoadRulesResultDTO = new SandboxLoadRulesResultDTOImpl();
        return sandboxLoadRulesResultDTO;
    }
    
    public SandboxLoadRuleDTO createSandboxLoadRuleDTO() {
        final SandboxLoadRuleDTOImpl sandboxLoadRuleDTO = new SandboxLoadRuleDTOImpl();
        return sandboxLoadRuleDTO;
    }
    
    public UnLoadResultDTO createUnLoadResultDTO() {
        final UnLoadResultDTOImpl unLoadResultDTO = new UnLoadResultDTOImpl();
        return unLoadResultDTO;
    }
    
    public FilesystemRestClientDTOloadPackage getFilesystemRestClientDTOloadPackage() {
        return (FilesystemRestClientDTOloadPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOloadPackage getPackage() {
        return FilesystemRestClientDTOloadPackage.eINSTANCE;
    }
}
