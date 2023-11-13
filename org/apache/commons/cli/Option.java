// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.Objects;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Option implements Cloneable, Serializable
{
    public static final int UNINITIALIZED = -1;
    public static final int UNLIMITED_VALUES = -2;
    private static final long serialVersionUID = 1L;
    private final String option;
    private String longOption;
    private String argName;
    private String description;
    private boolean required;
    private boolean optionalArg;
    private int argCount;
    private Class<?> type;
    private List<String> values;
    private char valuesep;
    
    public static Builder builder() {
        return builder(null);
    }
    
    public static Builder builder(final String option) {
        return new Builder(option);
    }
    
    private Option(final Builder builder) {
        this.argCount = -1;
        this.type = String.class;
        this.values = new ArrayList<String>();
        this.argName = builder.argName;
        this.description = builder.description;
        this.longOption = builder.longOption;
        this.argCount = builder.argCount;
        this.option = builder.option;
        this.optionalArg = builder.optionalArg;
        this.required = builder.required;
        this.type = builder.type;
        this.valuesep = builder.valueSeparator;
    }
    
    public Option(final String option, final boolean hasArg, final String description) throws IllegalArgumentException {
        this(option, null, hasArg, description);
    }
    
    public Option(final String option, final String description) throws IllegalArgumentException {
        this(option, null, false, description);
    }
    
    public Option(final String option, final String longOption, final boolean hasArg, final String description) throws IllegalArgumentException {
        this.argCount = -1;
        this.type = String.class;
        this.values = new ArrayList<String>();
        this.option = OptionValidator.validate(option);
        this.longOption = longOption;
        if (hasArg) {
            this.argCount = 1;
        }
        this.description = description;
    }
    
    boolean acceptsArg() {
        return (this.hasArg() || this.hasArgs() || this.hasOptionalArg()) && (this.argCount <= 0 || this.values.size() < this.argCount);
    }
    
    private void add(final String value) {
        if (!this.acceptsArg()) {
            throw new RuntimeException("Cannot add value, list full.");
        }
        this.values.add(value);
    }
    
    @Deprecated
    public boolean addValue(final String value) {
        throw new UnsupportedOperationException("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
    }
    
    void addValueForProcessing(final String value) {
        if (this.argCount == -1) {
            throw new RuntimeException("NO_ARGS_ALLOWED");
        }
        this.processValue(value);
    }
    
    void clearValues() {
        this.values.clear();
    }
    
    public Object clone() {
        try {
            final Option option = (Option)super.clone();
            option.values = new ArrayList<String>(this.values);
            return option;
        }
        catch (CloneNotSupportedException cnse) {
            throw new RuntimeException("A CloneNotSupportedException was thrown: " + cnse.getMessage());
        }
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return false;
        }
        final Option other = (Option)obj;
        return Objects.equals(this.longOption, other.longOption) && Objects.equals(this.option, other.option);
    }
    
    public String getArgName() {
        return this.argName;
    }
    
    public int getArgs() {
        return this.argCount;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public int getId() {
        return this.getKey().charAt(0);
    }
    
    String getKey() {
        return (this.option == null) ? this.longOption : this.option;
    }
    
    public String getLongOpt() {
        return this.longOption;
    }
    
    public String getOpt() {
        return this.option;
    }
    
    public Object getType() {
        return this.type;
    }
    
    public String getValue() {
        return this.hasNoValues() ? null : this.values.get(0);
    }
    
    public String getValue(final int index) throws IndexOutOfBoundsException {
        return this.hasNoValues() ? null : this.values.get(index);
    }
    
    public String getValue(final String defaultValue) {
        final String value = this.getValue();
        return (value != null) ? value : defaultValue;
    }
    
    public String[] getValues() {
        return (String[])(this.hasNoValues() ? null : ((String[])this.values.toArray(new String[this.values.size()])));
    }
    
    public char getValueSeparator() {
        return this.valuesep;
    }
    
    public List<String> getValuesList() {
        return this.values;
    }
    
    public boolean hasArg() {
        return this.argCount > 0 || this.argCount == -2;
    }
    
    public boolean hasArgName() {
        return this.argName != null && !this.argName.isEmpty();
    }
    
    public boolean hasArgs() {
        return this.argCount > 1 || this.argCount == -2;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.longOption, this.option);
    }
    
    public boolean hasLongOpt() {
        return this.longOption != null;
    }
    
    private boolean hasNoValues() {
        return this.values.isEmpty();
    }
    
    public boolean hasOptionalArg() {
        return this.optionalArg;
    }
    
    public boolean hasValueSeparator() {
        return this.valuesep > '\0';
    }
    
    public boolean isRequired() {
        return this.required;
    }
    
    private void processValue(String value) {
        if (this.hasValueSeparator()) {
            final char sep = this.getValueSeparator();
            for (int index = value.indexOf(sep); index != -1; index = value.indexOf(sep)) {
                if (this.values.size() == this.argCount - 1) {
                    break;
                }
                this.add(value.substring(0, index));
                value = value.substring(index + 1);
            }
        }
        this.add(value);
    }
    
    boolean requiresArg() {
        if (this.optionalArg) {
            return false;
        }
        if (this.argCount == -2) {
            return this.values.isEmpty();
        }
        return this.acceptsArg();
    }
    
    public void setArgName(final String argName) {
        this.argName = argName;
    }
    
    public void setArgs(final int num) {
        this.argCount = num;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setLongOpt(final String longOpt) {
        this.longOption = longOpt;
    }
    
    public void setOptionalArg(final boolean optionalArg) {
        this.optionalArg = optionalArg;
    }
    
    public void setRequired(final boolean required) {
        this.required = required;
    }
    
    public void setType(final Class<?> type) {
        this.type = type;
    }
    
    @Deprecated
    public void setType(final Object type) {
        this.setType((Class<?>)type);
    }
    
    public void setValueSeparator(final char sep) {
        this.valuesep = sep;
    }
    
    @Override
    public String toString() {
        final StringBuilder buf = new StringBuilder().append("[ option: ");
        buf.append(this.option);
        if (this.longOption != null) {
            buf.append(" ").append(this.longOption);
        }
        buf.append(" ");
        if (this.hasArgs()) {
            buf.append("[ARG...]");
        }
        else if (this.hasArg()) {
            buf.append(" [ARG]");
        }
        buf.append(" :: ").append(this.description);
        if (this.type != null) {
            buf.append(" :: ").append(this.type);
        }
        buf.append(" ]");
        return buf.toString();
    }
    
    public static final class Builder
    {
        private String option;
        private String description;
        private String longOption;
        private String argName;
        private boolean required;
        private boolean optionalArg;
        private int argCount;
        private Class<?> type;
        private char valueSeparator;
        
        private Builder(final String option) throws IllegalArgumentException {
            this.argCount = -1;
            this.type = String.class;
            this.option(option);
        }
        
        public Builder argName(final String argName) {
            this.argName = argName;
            return this;
        }
        
        public Option build() {
            if (this.option == null && this.longOption == null) {
                throw new IllegalArgumentException("Either opt or longOpt must be specified");
            }
            return new Option(this, null);
        }
        
        public Builder desc(final String description) {
            this.description = description;
            return this;
        }
        
        public Builder hasArg() {
            return this.hasArg(true);
        }
        
        public Builder hasArg(final boolean hasArg) {
            this.argCount = (hasArg ? 1 : -1);
            return this;
        }
        
        public Builder hasArgs() {
            this.argCount = -2;
            return this;
        }
        
        public Builder longOpt(final String longOpt) {
            this.longOption = longOpt;
            return this;
        }
        
        public Builder numberOfArgs(final int numberOfArgs) {
            this.argCount = numberOfArgs;
            return this;
        }
        
        public Builder option(final String option) throws IllegalArgumentException {
            this.option = OptionValidator.validate(option);
            return this;
        }
        
        public Builder optionalArg(final boolean isOptional) {
            this.optionalArg = isOptional;
            return this;
        }
        
        public Builder required() {
            return this.required(true);
        }
        
        public Builder required(final boolean required) {
            this.required = required;
            return this;
        }
        
        public Builder type(final Class<?> type) {
            this.type = type;
            return this;
        }
        
        public Builder valueSeparator() {
            return this.valueSeparator('=');
        }
        
        public Builder valueSeparator(final char sep) {
            this.valueSeparator = sep;
            return this;
        }
    }
}
