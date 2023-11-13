// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.changelog.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
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
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOchangelogAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOchangelogPackage modelPackage;
    protected FilesystemRestClientDTOchangelogSwitch modelSwitch;
    
    public FilesystemRestClientDTOchangelogAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOchangelogSwitch() {
            @Override
            public Object caseChangeLogEntryDTO(final ChangeLogEntryDTO object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createChangeLogEntryDTOAdapter();
            }
            
            @Override
            public Object caseChangeLogComponentEntryDTO(final ChangeLogComponentEntryDTO object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createChangeLogComponentEntryDTOAdapter();
            }
            
            @Override
            public Object caseChangeLogChangeSetEntryDTO(final ChangeLogChangeSetEntryDTO object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createChangeLogChangeSetEntryDTOAdapter();
            }
            
            @Override
            public Object caseChangeLogVersionableEntryDTO(final ChangeLogVersionableEntryDTO object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createChangeLogVersionableEntryDTOAdapter();
            }
            
            @Override
            public Object caseChangeLogVersionableEntry2DTO(final ChangeLogVersionableEntry2DTO object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createChangeLogVersionableEntry2DTOAdapter();
            }
            
            @Override
            public Object caseChangeLogWorkItemEntryDTO(final ChangeLogWorkItemEntryDTO object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createChangeLogWorkItemEntryDTOAdapter();
            }
            
            @Override
            public Object caseChangeLogBaselineEntryDTO(final ChangeLogBaselineEntryDTO object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createChangeLogBaselineEntryDTOAdapter();
            }
            
            @Override
            public Object caseChangeLogDirectionEntryDTO(final ChangeLogDirectionEntryDTO object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createChangeLogDirectionEntryDTOAdapter();
            }
            
            @Override
            public Object caseChangeLogRootEntryDTO(final ChangeLogRootEntryDTO object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createChangeLogRootEntryDTOAdapter();
            }
            
            @Override
            public Object caseChangeLogOslcLinkEntryDTO(final ChangeLogOslcLinkEntryDTO object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createChangeLogOslcLinkEntryDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOchangelogAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOchangelogAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOchangelogAdapterFactory.modelPackage = FilesystemRestClientDTOchangelogPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOchangelogAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOchangelogAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createChangeLogEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeLogComponentEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeLogChangeSetEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeLogVersionableEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeLogVersionableEntry2DTOAdapter() {
        return null;
    }
    
    public Adapter createChangeLogWorkItemEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeLogBaselineEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeLogDirectionEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeLogRootEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createChangeLogOslcLinkEntryDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
