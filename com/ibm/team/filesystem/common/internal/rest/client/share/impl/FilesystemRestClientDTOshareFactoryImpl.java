// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.share.impl;

import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;
import com.ibm.team.filesystem.common.internal.rest.client.share.MultipleSandboxShareDTO;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareOverlapDTO;
import com.ibm.team.filesystem.common.internal.rest.client.share.ShareResultDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOshareFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOshareFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOshareFactory
{
    public static FilesystemRestClientDTOshareFactory init() {
        try {
            final FilesystemRestClientDTOshareFactory theFilesystemRestClientDTOshareFactory = (FilesystemRestClientDTOshareFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.share");
            if (theFilesystemRestClientDTOshareFactory != null) {
                return theFilesystemRestClientDTOshareFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOshareFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createShareResultDTO();
            }
            case 1: {
                return (EObject)this.createShareOverlapDTO();
            }
            case 2: {
                return (EObject)this.createMultipleSandboxShareDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public ShareResultDTO createShareResultDTO() {
        final ShareResultDTOImpl shareResultDTO = new ShareResultDTOImpl();
        return shareResultDTO;
    }
    
    public ShareOverlapDTO createShareOverlapDTO() {
        final ShareOverlapDTOImpl shareOverlapDTO = new ShareOverlapDTOImpl();
        return shareOverlapDTO;
    }
    
    public MultipleSandboxShareDTO createMultipleSandboxShareDTO() {
        final MultipleSandboxShareDTOImpl multipleSandboxShareDTO = new MultipleSandboxShareDTOImpl();
        return multipleSandboxShareDTO;
    }
    
    public FilesystemRestClientDTOsharePackage getFilesystemRestClientDTOsharePackage() {
        return (FilesystemRestClientDTOsharePackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOsharePackage getPackage() {
        return FilesystemRestClientDTOsharePackage.eINSTANCE;
    }
}
