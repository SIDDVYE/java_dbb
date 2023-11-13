// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoredResourcesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.UnknownIgnoreRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRulesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.JazzIgnoreRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemRestClientDTOignoresAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemRestClientDTOignoresPackage modelPackage;
    protected FilesystemRestClientDTOignoresSwitch modelSwitch;
    
    public FilesystemRestClientDTOignoresAdapterFactory() {
        this.modelSwitch = new FilesystemRestClientDTOignoresSwitch() {
            @Override
            public Object caseIgnoreRuleDTO(final IgnoreRuleDTO object) {
                return FilesystemRestClientDTOignoresAdapterFactory.this.createIgnoreRuleDTOAdapter();
            }
            
            @Override
            public Object caseJazzIgnoreRuleDTO(final JazzIgnoreRuleDTO object) {
                return FilesystemRestClientDTOignoresAdapterFactory.this.createJazzIgnoreRuleDTOAdapter();
            }
            
            @Override
            public Object caseIgnoreRulesDTO(final IgnoreRulesDTO object) {
                return FilesystemRestClientDTOignoresAdapterFactory.this.createIgnoreRulesDTOAdapter();
            }
            
            @Override
            public Object caseUnknownIgnoreRuleDTO(final UnknownIgnoreRuleDTO object) {
                return FilesystemRestClientDTOignoresAdapterFactory.this.createUnknownIgnoreRuleDTOAdapter();
            }
            
            @Override
            public Object caseIgnoredResourcesDTO(final IgnoredResourcesDTO object) {
                return FilesystemRestClientDTOignoresAdapterFactory.this.createIgnoredResourcesDTOAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemRestClientDTOignoresAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemRestClientDTOignoresAdapterFactory.modelPackage == null) {
            FilesystemRestClientDTOignoresAdapterFactory.modelPackage = FilesystemRestClientDTOignoresPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemRestClientDTOignoresAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemRestClientDTOignoresAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createIgnoreRuleDTOAdapter() {
        return null;
    }
    
    public Adapter createJazzIgnoreRuleDTOAdapter() {
        return null;
    }
    
    public Adapter createIgnoreRulesDTOAdapter() {
        return null;
    }
    
    public Adapter createUnknownIgnoreRuleDTOAdapter() {
        return null;
    }
    
    public Adapter createIgnoredResourcesDTOAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
