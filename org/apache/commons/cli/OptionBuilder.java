// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

@Deprecated
public final class OptionBuilder
{
    private static String longOption;
    private static String description;
    private static String argName;
    private static boolean required;
    private static int argCount;
    private static Class<?> type;
    private static boolean optionalArg;
    private static char valueSeparator;
    private static final OptionBuilder INSTANCE;
    
    public static Option create() throws IllegalArgumentException {
        if (OptionBuilder.longOption == null) {
            reset();
            throw new IllegalArgumentException("must specify longopt");
        }
        return create(null);
    }
    
    public static Option create(final char opt) throws IllegalArgumentException {
        return create(String.valueOf(opt));
    }
    
    public static Option create(final String opt) throws IllegalArgumentException {
        Option option = null;
        try {
            option = new Option(opt, OptionBuilder.description);
            option.setLongOpt(OptionBuilder.longOption);
            option.setRequired(OptionBuilder.required);
            option.setOptionalArg(OptionBuilder.optionalArg);
            option.setArgs(OptionBuilder.argCount);
            option.setType(OptionBuilder.type);
            option.setValueSeparator(OptionBuilder.valueSeparator);
            option.setArgName(OptionBuilder.argName);
        }
        finally {
            reset();
        }
        return option;
    }
    
    public static OptionBuilder hasArg() {
        OptionBuilder.argCount = 1;
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder hasArg(final boolean hasArg) {
        OptionBuilder.argCount = (hasArg ? 1 : -1);
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder hasArgs() {
        OptionBuilder.argCount = -2;
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder hasArgs(final int num) {
        OptionBuilder.argCount = num;
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder hasOptionalArg() {
        OptionBuilder.argCount = 1;
        OptionBuilder.optionalArg = true;
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder hasOptionalArgs() {
        OptionBuilder.argCount = -2;
        OptionBuilder.optionalArg = true;
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder hasOptionalArgs(final int numArgs) {
        OptionBuilder.argCount = numArgs;
        OptionBuilder.optionalArg = true;
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder isRequired() {
        OptionBuilder.required = true;
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder isRequired(final boolean newRequired) {
        OptionBuilder.required = newRequired;
        return OptionBuilder.INSTANCE;
    }
    
    private static void reset() {
        OptionBuilder.description = null;
        OptionBuilder.argName = null;
        OptionBuilder.longOption = null;
        OptionBuilder.type = String.class;
        OptionBuilder.required = false;
        OptionBuilder.argCount = -1;
        OptionBuilder.optionalArg = false;
        OptionBuilder.valueSeparator = '\0';
    }
    
    public static OptionBuilder withArgName(final String name) {
        OptionBuilder.argName = name;
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder withDescription(final String newDescription) {
        OptionBuilder.description = newDescription;
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder withLongOpt(final String newLongopt) {
        OptionBuilder.longOption = newLongopt;
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder withType(final Class<?> newType) {
        OptionBuilder.type = newType;
        return OptionBuilder.INSTANCE;
    }
    
    @Deprecated
    public static OptionBuilder withType(final Object newType) {
        return withType((Class<?>)newType);
    }
    
    public static OptionBuilder withValueSeparator() {
        OptionBuilder.valueSeparator = '=';
        return OptionBuilder.INSTANCE;
    }
    
    public static OptionBuilder withValueSeparator(final char sep) {
        OptionBuilder.valueSeparator = sep;
        return OptionBuilder.INSTANCE;
    }
    
    private OptionBuilder() {
    }
    
    static {
        OptionBuilder.argCount = -1;
        INSTANCE = new OptionBuilder();
        reset();
    }
}
