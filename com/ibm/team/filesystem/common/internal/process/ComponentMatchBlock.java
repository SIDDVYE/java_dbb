// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.process;

import com.ibm.team.repository.common.UUID;
import java.util.Iterator;
import java.util.Collection;
import com.ibm.team.scm.common.internal.ComponentEntry;
import com.ibm.team.scm.common.IComponentHandle;
import com.ibm.team.scm.common.internal.process.IFauxXmlNode;
import com.ibm.team.scm.common.internal.process.ProcessConfigurationElementFauxXmlNode;
import com.ibm.team.scm.common.internal.process.ProcessConfigDeserializer;
import com.ibm.team.repository.common.TeamRepositoryException;
import com.ibm.team.process.common.IProcessConfigurationElement;
import java.util.ArrayList;
import com.ibm.team.scm.common.internal.process.PCD_mayBeNull;
import com.ibm.team.scm.common.internal.process.PCD_defaultValue;
import com.ibm.team.scm.common.internal.process.PCD_serializationName;
import java.util.List;

public class ComponentMatchBlock
{
    @PCD_serializationName("component")
    public List<ComponentMatchRule> components;
    @PCD_serializationName("match-all")
    @PCD_defaultValue("true")
    @PCD_mayBeNull
    public boolean matchAll;
    public static final String TAG_COMPONENT = "component";
    public static final String TAG_COMPONENTS = "components";
    public static final String ATTR_UUID = "uuid";
    public static final String ATTR_MATCH_ALL = "match-all";
    
    public ComponentMatchBlock() {
        this.components = new ArrayList<ComponentMatchRule>();
        this.matchAll = true;
    }
    
    public static ComponentMatchBlock extractFromChild(final IProcessConfigurationElement base) throws TeamRepositoryException {
        IProcessConfigurationElement[] children;
        for (int length = (children = base.getChildren()).length, i = 0; i < length; ++i) {
            final IProcessConfigurationElement child = children[i];
            if ("component".equals(child.getName())) {
                return read(child);
            }
        }
        return matchAll();
    }
    
    public static ComponentMatchBlock read(final IProcessConfigurationElement base) throws TeamRepositoryException {
        if (!"components".equals(base.getName())) {
            throw new TeamRepositoryException("Must start in a \"components\" tag");
        }
        final ProcessConfigDeserializer des = new ProcessConfigDeserializer();
        try {
            return (ComponentMatchBlock)des.deserialize((IFauxXmlNode)new ProcessConfigurationElementFauxXmlNode(base), (Class)ComponentMatchBlock.class);
        }
        catch (ProcessConfigDeserializer.DeserializationException e) {
            throw new TeamRepositoryException((Throwable)e);
        }
    }
    
    public static ComponentMatchBlock matchAll() {
        return new ComponentMatchBlock() {
            @Override
            public boolean matches(final IComponentHandle comp) {
                return true;
            }
        };
    }
    
    public List<IComponentHandle> filter(final ComponentEntry[] entries) {
        final ArrayList<IComponentHandle> toReturn = new ArrayList<IComponentHandle>(entries.length);
        for (final ComponentEntry entry : entries) {
            final IComponentHandle comp = entry.getComponent();
            if (this.matches(comp)) {
                toReturn.add(comp);
            }
        }
        return toReturn;
    }
    
    public List<IComponentHandle> filter(final Collection<? extends IComponentHandle> comps) {
        final ArrayList<IComponentHandle> toReturn = new ArrayList<IComponentHandle>(comps.size());
        for (final IComponentHandle comp : comps) {
            if (this.matches(comp)) {
                toReturn.add(comp);
            }
        }
        return toReturn;
    }
    
    public boolean matches(final IComponentHandle comp) {
        if (this.matchAll) {
            return true;
        }
        for (final ComponentMatchRule rule : this.components) {
            if (rule.uuid.equals((Object)comp.getItemId())) {
                return true;
            }
        }
        return false;
    }
    
    public static class ComponentMatchRule
    {
        public UUID uuid;
        
        public ComponentMatchRule() {
        }
        
        public ComponentMatchRule(final UUID itemId) {
            this.uuid = itemId;
        }
    }
}
