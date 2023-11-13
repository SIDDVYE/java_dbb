// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.debug.core.impl;

import com.ibm.team.filesystem.common.internal.rest.debug.core.DebugRestClientDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.debug.core.MetronomeMethodDTO;

public class MetronomeMethodDTOImpl extends MetronomeBaseDTOImpl implements MetronomeMethodDTO
{
    protected MetronomeMethodDTOImpl() {
    }
    
    @Override
    protected EClass eStaticClass() {
        return DebugRestClientDTOPackage.Literals.METRONOME_METHOD_DTO;
    }
}
