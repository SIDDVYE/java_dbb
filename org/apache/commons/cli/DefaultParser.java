// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.Iterator;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class DefaultParser implements CommandLineParser
{
    protected CommandLine cmd;
    protected Options options;
    protected boolean stopAtNonOption;
    protected String currentToken;
    protected Option currentOption;
    protected boolean skipParsing;
    protected List expectedOpts;
    private final boolean allowPartialMatching;
    private final Boolean stripLeadingAndTrailingQuotes;
    
    public static Builder builder() {
        return new Builder();
    }
    
    public DefaultParser() {
        this.allowPartialMatching = true;
        this.stripLeadingAndTrailingQuotes = null;
    }
    
    public DefaultParser(final boolean allowPartialMatching) {
        this.allowPartialMatching = allowPartialMatching;
        this.stripLeadingAndTrailingQuotes = null;
    }
    
    private DefaultParser(final boolean allowPartialMatching, final Boolean stripLeadingAndTrailingQuotes) {
        this.allowPartialMatching = allowPartialMatching;
        this.stripLeadingAndTrailingQuotes = stripLeadingAndTrailingQuotes;
    }
    
    private void checkRequiredArgs() throws ParseException {
        if (this.currentOption != null && this.currentOption.requiresArg()) {
            throw new MissingArgumentException(this.currentOption);
        }
    }
    
    protected void checkRequiredOptions() throws MissingOptionException {
        if (!this.expectedOpts.isEmpty()) {
            throw new MissingOptionException(this.expectedOpts);
        }
    }
    
    private String getLongPrefix(final String token) {
        final String t = Util.stripLeadingHyphens(token);
        String opt = null;
        for (int i = t.length() - 2; i > 1; --i) {
            final String prefix = t.substring(0, i);
            if (this.options.hasLongOption(prefix)) {
                opt = prefix;
                break;
            }
        }
        return opt;
    }
    
    private List<String> getMatchingLongOptions(final String token) {
        if (this.allowPartialMatching) {
            return this.options.getMatchingOptions(token);
        }
        final List<String> matches = new ArrayList<String>(1);
        if (this.options.hasLongOption(token)) {
            final Option option = this.options.getOption(token);
            matches.add(option.getLongOpt());
        }
        return matches;
    }
    
    protected void handleConcatenatedOptions(final String token) throws ParseException {
        for (int i = 1; i < token.length(); ++i) {
            final String ch = String.valueOf(token.charAt(i));
            if (!this.options.hasOption(ch)) {
                this.handleUnknownToken((this.stopAtNonOption && i > 1) ? token.substring(i) : token);
                break;
            }
            this.handleOption(this.options.getOption(ch));
            if (this.currentOption != null && token.length() != i + 1) {
                this.currentOption.addValueForProcessing(this.stripLeadingAndTrailingQuotesDefaultOff(token.substring(i + 1)));
                break;
            }
        }
    }
    
    private void handleLongOption(final String token) throws ParseException {
        if (token.indexOf(61) == -1) {
            this.handleLongOptionWithoutEqual(token);
        }
        else {
            this.handleLongOptionWithEqual(token);
        }
    }
    
    private void handleLongOptionWithEqual(final String token) throws ParseException {
        final int pos = token.indexOf(61);
        final String value = token.substring(pos + 1);
        final String opt = token.substring(0, pos);
        final List<String> matchingOpts = this.getMatchingLongOptions(opt);
        if (matchingOpts.isEmpty()) {
            this.handleUnknownToken(this.currentToken);
        }
        else {
            if (matchingOpts.size() > 1 && !this.options.hasLongOption(opt)) {
                throw new AmbiguousOptionException(opt, matchingOpts);
            }
            final String key = this.options.hasLongOption(opt) ? opt : matchingOpts.get(0);
            final Option option = this.options.getOption(key);
            if (option.acceptsArg()) {
                this.handleOption(option);
                this.currentOption.addValueForProcessing(this.stripLeadingAndTrailingQuotesDefaultOff(value));
                this.currentOption = null;
            }
            else {
                this.handleUnknownToken(this.currentToken);
            }
        }
    }
    
    private void handleLongOptionWithoutEqual(final String token) throws ParseException {
        final List<String> matchingOpts = this.getMatchingLongOptions(token);
        if (matchingOpts.isEmpty()) {
            this.handleUnknownToken(this.currentToken);
        }
        else {
            if (matchingOpts.size() > 1 && !this.options.hasLongOption(token)) {
                throw new AmbiguousOptionException(token, matchingOpts);
            }
            final String key = this.options.hasLongOption(token) ? token : matchingOpts.get(0);
            this.handleOption(this.options.getOption(key));
        }
    }
    
    private void handleOption(Option option) throws ParseException {
        this.checkRequiredArgs();
        option = (Option)option.clone();
        this.updateRequiredOptions(option);
        this.cmd.addOption(option);
        if (option.hasArg()) {
            this.currentOption = option;
        }
        else {
            this.currentOption = null;
        }
    }
    
    private void handleProperties(final Properties properties) throws ParseException {
        if (properties == null) {
            return;
        }
        final Enumeration<?> e = properties.propertyNames();
        while (e.hasMoreElements()) {
            final String option = e.nextElement().toString();
            final Option opt = this.options.getOption(option);
            if (opt == null) {
                throw new UnrecognizedOptionException("Default option wasn't defined", option);
            }
            final OptionGroup group = this.options.getOptionGroup(opt);
            final boolean selected = group != null && group.getSelected() != null;
            if (this.cmd.hasOption(option) || selected) {
                continue;
            }
            final String value = properties.getProperty(option);
            if (opt.hasArg()) {
                if (opt.getValues() == null || opt.getValues().length == 0) {
                    opt.addValueForProcessing(this.stripLeadingAndTrailingQuotesDefaultOff(value));
                }
            }
            else if (!"yes".equalsIgnoreCase(value) && !"true".equalsIgnoreCase(value) && !"1".equalsIgnoreCase(value)) {
                continue;
            }
            this.handleOption(opt);
            this.currentOption = null;
        }
    }
    
    private void handleShortAndLongOption(final String token) throws ParseException {
        final String t = Util.stripLeadingHyphens(token);
        final int pos = t.indexOf(61);
        if (t.length() == 1) {
            if (this.options.hasShortOption(t)) {
                this.handleOption(this.options.getOption(t));
            }
            else {
                this.handleUnknownToken(token);
            }
        }
        else if (pos == -1) {
            if (this.options.hasShortOption(t)) {
                this.handleOption(this.options.getOption(t));
            }
            else if (!this.getMatchingLongOptions(t).isEmpty()) {
                this.handleLongOptionWithoutEqual(token);
            }
            else {
                final String opt = this.getLongPrefix(t);
                if (opt != null && this.options.getOption(opt).acceptsArg()) {
                    this.handleOption(this.options.getOption(opt));
                    this.currentOption.addValueForProcessing(this.stripLeadingAndTrailingQuotesDefaultOff(t.substring(opt.length())));
                    this.currentOption = null;
                }
                else if (this.isJavaProperty(t)) {
                    this.handleOption(this.options.getOption(t.substring(0, 1)));
                    this.currentOption.addValueForProcessing(this.stripLeadingAndTrailingQuotesDefaultOff(t.substring(1)));
                    this.currentOption = null;
                }
                else {
                    this.handleConcatenatedOptions(token);
                }
            }
        }
        else {
            final String opt = t.substring(0, pos);
            final String value = t.substring(pos + 1);
            if (opt.length() == 1) {
                final Option option = this.options.getOption(opt);
                if (option != null && option.acceptsArg()) {
                    this.handleOption(option);
                    this.currentOption.addValueForProcessing(value);
                    this.currentOption = null;
                }
                else {
                    this.handleUnknownToken(token);
                }
            }
            else if (this.isJavaProperty(opt)) {
                this.handleOption(this.options.getOption(opt.substring(0, 1)));
                this.currentOption.addValueForProcessing(opt.substring(1));
                this.currentOption.addValueForProcessing(value);
                this.currentOption = null;
            }
            else {
                this.handleLongOptionWithEqual(token);
            }
        }
    }
    
    private void handleToken(final String token) throws ParseException {
        this.currentToken = token;
        if (this.skipParsing) {
            this.cmd.addArg(token);
        }
        else if ("--".equals(token)) {
            this.skipParsing = true;
        }
        else if (this.currentOption != null && this.currentOption.acceptsArg() && this.isArgument(token)) {
            this.currentOption.addValueForProcessing(this.stripLeadingAndTrailingQuotesDefaultOn(token));
        }
        else if (token.startsWith("--")) {
            this.handleLongOption(token);
        }
        else if (token.startsWith("-") && !"-".equals(token)) {
            this.handleShortAndLongOption(token);
        }
        else {
            this.handleUnknownToken(token);
        }
        if (this.currentOption != null && !this.currentOption.acceptsArg()) {
            this.currentOption = null;
        }
    }
    
    private void handleUnknownToken(final String token) throws ParseException {
        if (token.startsWith("-") && token.length() > 1 && !this.stopAtNonOption) {
            throw new UnrecognizedOptionException("Unrecognized option: " + token, token);
        }
        this.cmd.addArg(token);
        if (this.stopAtNonOption) {
            this.skipParsing = true;
        }
    }
    
    private boolean isArgument(final String token) {
        return !this.isOption(token) || this.isNegativeNumber(token);
    }
    
    private boolean isJavaProperty(final String token) {
        final String opt = token.substring(0, 1);
        final Option option = this.options.getOption(opt);
        return option != null && (option.getArgs() >= 2 || option.getArgs() == -2);
    }
    
    private boolean isLongOption(final String token) {
        if (token == null || !token.startsWith("-") || token.length() == 1) {
            return false;
        }
        final int pos = token.indexOf("=");
        final String t = (pos == -1) ? token : token.substring(0, pos);
        return !this.getMatchingLongOptions(t).isEmpty() || (this.getLongPrefix(token) != null && !token.startsWith("--"));
    }
    
    private boolean isNegativeNumber(final String token) {
        try {
            Double.parseDouble(token);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    
    private boolean isOption(final String token) {
        return this.isLongOption(token) || this.isShortOption(token);
    }
    
    private boolean isShortOption(final String token) {
        if (token == null || !token.startsWith("-") || token.length() == 1) {
            return false;
        }
        final int pos = token.indexOf("=");
        final String optName = (pos == -1) ? token.substring(1) : token.substring(1, pos);
        return this.options.hasShortOption(optName) || (!optName.isEmpty() && this.options.hasShortOption(String.valueOf(optName.charAt(0))));
    }
    
    @Override
    public CommandLine parse(final Options options, final String[] arguments) throws ParseException {
        return this.parse(options, arguments, null);
    }
    
    @Override
    public CommandLine parse(final Options options, final String[] arguments, final boolean stopAtNonOption) throws ParseException {
        return this.parse(options, arguments, null, stopAtNonOption);
    }
    
    public CommandLine parse(final Options options, final String[] arguments, final Properties properties) throws ParseException {
        return this.parse(options, arguments, properties, false);
    }
    
    public CommandLine parse(final Options options, final String[] arguments, final Properties properties, final boolean stopAtNonOption) throws ParseException {
        this.options = options;
        this.stopAtNonOption = stopAtNonOption;
        this.skipParsing = false;
        this.currentOption = null;
        this.expectedOpts = new ArrayList(options.getRequiredOptions());
        for (final OptionGroup group : options.getOptionGroups()) {
            group.setSelected(null);
        }
        this.cmd = new CommandLine();
        if (arguments != null) {
            for (final String argument : arguments) {
                this.handleToken(argument);
            }
        }
        this.checkRequiredArgs();
        this.handleProperties(properties);
        this.checkRequiredOptions();
        return this.cmd;
    }
    
    private String stripLeadingAndTrailingQuotesDefaultOff(final String token) {
        if (this.stripLeadingAndTrailingQuotes != null && this.stripLeadingAndTrailingQuotes) {
            return Util.stripLeadingAndTrailingQuotes(token);
        }
        return token;
    }
    
    private String stripLeadingAndTrailingQuotesDefaultOn(final String token) {
        if (this.stripLeadingAndTrailingQuotes == null || this.stripLeadingAndTrailingQuotes) {
            return Util.stripLeadingAndTrailingQuotes(token);
        }
        return token;
    }
    
    private void updateRequiredOptions(final Option option) throws AlreadySelectedException {
        if (option.isRequired()) {
            this.expectedOpts.remove(option.getKey());
        }
        if (this.options.getOptionGroup(option) != null) {
            final OptionGroup group = this.options.getOptionGroup(option);
            if (group.isRequired()) {
                this.expectedOpts.remove(group);
            }
            group.setSelected(option);
        }
    }
    
    public static final class Builder
    {
        private boolean allowPartialMatching;
        private Boolean stripLeadingAndTrailingQuotes;
        
        private Builder() {
            this.allowPartialMatching = true;
        }
        
        public DefaultParser build() {
            return new DefaultParser(this.allowPartialMatching, this.stripLeadingAndTrailingQuotes, null);
        }
        
        public Builder setAllowPartialMatching(final boolean allowPartialMatching) {
            this.allowPartialMatching = allowPartialMatching;
            return this;
        }
        
        public Builder setStripLeadingAndTrailingQuotes(final Boolean stripLeadingAndTrailingQuotes) {
            this.stripLeadingAndTrailingQuotes = stripLeadingAndTrailingQuotes;
            return this;
        }
    }
}
