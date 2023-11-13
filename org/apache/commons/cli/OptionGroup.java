// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.Serializable;

public class OptionGroup implements Serializable
{
    private static final long serialVersionUID = 1L;
    private final Map<String, Option> optionMap;
    private String selected;
    private boolean required;
    
    public OptionGroup() {
        this.optionMap = new LinkedHashMap<String, Option>();
    }
    
    public OptionGroup addOption(final Option option) {
        this.optionMap.put(option.getKey(), option);
        return this;
    }
    
    public Collection<String> getNames() {
        return this.optionMap.keySet();
    }
    
    public Collection<Option> getOptions() {
        return this.optionMap.values();
    }
    
    public String getSelected() {
        return this.selected;
    }
    
    public boolean isRequired() {
        return this.required;
    }
    
    public void setRequired(final boolean required) {
        this.required = required;
    }
    
    public void setSelected(final Option option) throws AlreadySelectedException {
        if (option == null) {
            this.selected = null;
            return;
        }
        if (this.selected != null && !this.selected.equals(option.getKey())) {
            throw new AlreadySelectedException(this, option);
        }
        this.selected = option.getKey();
    }
    
    @Override
    public String toString() {
        final StringBuilder buff = new StringBuilder();
        final Iterator<Option> iter = this.getOptions().iterator();
        buff.append("[");
        while (iter.hasNext()) {
            final Option option = iter.next();
            if (option.getOpt() != null) {
                buff.append("-");
                buff.append(option.getOpt());
            }
            else {
                buff.append("--");
                buff.append(option.getLongOpt());
            }
            if (option.getDescription() != null) {
                buff.append(" ");
                buff.append(option.getDescription());
            }
            if (iter.hasNext()) {
                buff.append(", ");
            }
        }
        buff.append("]");
        return buff.toString();
    }
}
