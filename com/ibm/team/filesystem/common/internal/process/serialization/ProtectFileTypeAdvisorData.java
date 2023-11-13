// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.process.serialization;

import com.ibm.team.scm.common.IVersionableHandle;
import java.util.LinkedList;
import com.ibm.team.scm.common.IContextHandle;
import com.ibm.team.scm.common.IComponentHandle;
import java.util.List;
import com.ibm.team.scm.common.internal.process.AdvisorDataMarshaller;

public class ProtectFileTypeAdvisorData implements AdvisorDataMarshaller.IScmAdvisorMarshallable
{
    public List<String> badPatterns;
    public List<ModifiedVersionable> files;
    public IComponentHandle componentHandle;
    public IContextHandle context;
    
    public ProtectFileTypeAdvisorData() {
        this.badPatterns = new LinkedList<String>();
        this.files = new LinkedList<ModifiedVersionable>();
    }
    
    public static class ModifiedVersionable implements AdvisorDataMarshaller.IScmAdvisorMarshallable
    {
        public String pattern;
        public String name;
        public IVersionableHandle handle;
    }
}
