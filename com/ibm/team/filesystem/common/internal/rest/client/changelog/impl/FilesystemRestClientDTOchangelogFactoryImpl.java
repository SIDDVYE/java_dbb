// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.impl;

import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogOslcLinkEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogRootEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogDirectionEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogBaselineEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogWorkItemEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogVersionableEntry2DTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogVersionableEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogChangeSetEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogComponentEntryDTO;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.ChangeLogEntryDTO;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemRestClientDTOchangelogFactoryImpl extends EFactoryImpl implements FilesystemRestClientDTOchangelogFactory
{
    public static FilesystemRestClientDTOchangelogFactory init() {
        try {
            final FilesystemRestClientDTOchangelogFactory theFilesystemRestClientDTOchangelogFactory = (FilesystemRestClientDTOchangelogFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.rest.client.changelog");
            if (theFilesystemRestClientDTOchangelogFactory != null) {
                return theFilesystemRestClientDTOchangelogFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemRestClientDTOchangelogFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createChangeLogEntryDTO();
            }
            case 1: {
                return (EObject)this.createChangeLogComponentEntryDTO();
            }
            case 2: {
                return (EObject)this.createChangeLogChangeSetEntryDTO();
            }
            case 3: {
                return (EObject)this.createChangeLogVersionableEntryDTO();
            }
            case 4: {
                return (EObject)this.createChangeLogVersionableEntry2DTO();
            }
            case 5: {
                return (EObject)this.createChangeLogWorkItemEntryDTO();
            }
            case 6: {
                return (EObject)this.createChangeLogBaselineEntryDTO();
            }
            case 7: {
                return (EObject)this.createChangeLogDirectionEntryDTO();
            }
            case 8: {
                return (EObject)this.createChangeLogRootEntryDTO();
            }
            case 9: {
                return (EObject)this.createChangeLogOslcLinkEntryDTO();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public ChangeLogEntryDTO createChangeLogEntryDTO() {
        final ChangeLogEntryDTOImpl changeLogEntryDTO = new ChangeLogEntryDTOImpl();
        return changeLogEntryDTO;
    }
    
    public ChangeLogComponentEntryDTO createChangeLogComponentEntryDTO() {
        final ChangeLogComponentEntryDTOImpl changeLogComponentEntryDTO = new ChangeLogComponentEntryDTOImpl();
        return changeLogComponentEntryDTO;
    }
    
    public ChangeLogChangeSetEntryDTO createChangeLogChangeSetEntryDTO() {
        final ChangeLogChangeSetEntryDTOImpl changeLogChangeSetEntryDTO = new ChangeLogChangeSetEntryDTOImpl();
        return changeLogChangeSetEntryDTO;
    }
    
    public ChangeLogVersionableEntryDTO createChangeLogVersionableEntryDTO() {
        final ChangeLogVersionableEntryDTOImpl changeLogVersionableEntryDTO = new ChangeLogVersionableEntryDTOImpl();
        return changeLogVersionableEntryDTO;
    }
    
    public ChangeLogVersionableEntry2DTO createChangeLogVersionableEntry2DTO() {
        final ChangeLogVersionableEntry2DTOImpl changeLogVersionableEntry2DTO = new ChangeLogVersionableEntry2DTOImpl();
        return changeLogVersionableEntry2DTO;
    }
    
    public ChangeLogWorkItemEntryDTO createChangeLogWorkItemEntryDTO() {
        final ChangeLogWorkItemEntryDTOImpl changeLogWorkItemEntryDTO = new ChangeLogWorkItemEntryDTOImpl();
        return changeLogWorkItemEntryDTO;
    }
    
    public ChangeLogBaselineEntryDTO createChangeLogBaselineEntryDTO() {
        final ChangeLogBaselineEntryDTOImpl changeLogBaselineEntryDTO = new ChangeLogBaselineEntryDTOImpl();
        return changeLogBaselineEntryDTO;
    }
    
    public ChangeLogDirectionEntryDTO createChangeLogDirectionEntryDTO() {
        final ChangeLogDirectionEntryDTOImpl changeLogDirectionEntryDTO = new ChangeLogDirectionEntryDTOImpl();
        return changeLogDirectionEntryDTO;
    }
    
    public ChangeLogRootEntryDTO createChangeLogRootEntryDTO() {
        final ChangeLogRootEntryDTOImpl changeLogRootEntryDTO = new ChangeLogRootEntryDTOImpl();
        return changeLogRootEntryDTO;
    }
    
    public ChangeLogOslcLinkEntryDTO createChangeLogOslcLinkEntryDTO() {
        final ChangeLogOslcLinkEntryDTOImpl changeLogOslcLinkEntryDTO = new ChangeLogOslcLinkEntryDTOImpl();
        return changeLogOslcLinkEntryDTO;
    }
    
    public FilesystemRestClientDTOchangelogPackage getFilesystemRestClientDTOchangelogPackage() {
        return (FilesystemRestClientDTOchangelogPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemRestClientDTOchangelogPackage getPackage() {
        return FilesystemRestClientDTOchangelogPackage.eINSTANCE;
    }
}
