// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency.internal;

import org.slf4j.LoggerFactory;
import java.util.regex.Matcher;
import java.util.Iterator;
import java.util.Arrays;
import java.util.regex.Pattern;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.internal.Messages;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

public class SearchPathParser
{
    private static Logger logger;
    private static String SEARCH_SCHEME;
    
    public List<SearchPath> parse(final String initialSearchPath) throws BuildException {
        final List<SearchPath> searchPathList = new ArrayList<SearchPath>();
        if (initialSearchPath == null) {
            throw new BuildException(Messages.getMessage("SEARCH_PATH_PARSER_SEARCH_PATH_NULL"));
        }
        SearchPathParser.logger.debug("Parsing initial search path " + initialSearchPath);
        final List<String> searchPathStrings = this.splitInitialSearchPath(initialSearchPath);
        for (final String searchPath : searchPathStrings) {
            SearchPathParser.logger.debug("Parsing search path segment " + searchPath);
            final String regexStringPattern = "(?<search>search:)?(?<matchRules>\\[.*])?(?<searchRoot>[\\w@\\/\\.,-]*)?[\\?]?(path=)?(?<path>.*)?";
            final Pattern basePattern = Pattern.compile(regexStringPattern);
            final Matcher baseGroups = basePattern.matcher(searchPath);
            baseGroups.matches();
            if (baseGroups.groupCount() < 1) {
                SearchPathParser.logger.warn(Messages.getMessage("SEARCH_PATH_PARSER_NOT_ENOUGH_MATCHES"));
            }
            String matchRulesString;
            try {
                matchRulesString = baseGroups.group("matchRules");
            }
            catch (IllegalStateException e) {
                matchRulesString = null;
            }
            String pathString;
            try {
                pathString = baseGroups.group("path");
            }
            catch (IllegalStateException e) {
                pathString = null;
            }
            String searchRoot;
            try {
                searchRoot = baseGroups.group("searchRoot");
                if (searchRoot == null) {
                    throw new BuildException(Messages.getMessage("SEARCH_PATH_PARSER_MISSING_GROUP", "searchRoot"));
                }
            }
            catch (IllegalStateException e) {
                throw new BuildException(Messages.getMessage("SEARCH_PATH_PARSER_MISSING_GROUP", "searchRoot"));
            }
            SearchPathParser.logger.debug("Match Rules: " + matchRulesString);
            SearchPathParser.logger.debug("Paths: " + pathString);
            SearchPathParser.logger.debug("Search Root: " + searchRoot);
            final List<String> libraryIncludeList = new ArrayList<String>();
            final List<String> libraryExcludeList = new ArrayList<String>();
            final List<String> categoryIncludeList = new ArrayList<String>();
            final List<String> categoryExcludeList = new ArrayList<String>();
            final List<String> lnameIncludeList = new ArrayList<String>();
            final List<String> lnameExcludeList = new ArrayList<String>();
            if (matchRulesString != null) {
                final String matchRuleRegexPattern = "\\[(?<library>[\\w\\d,\\*\\^]*):?(?<category>[\\w\\d,\\*\\^]*):?(?<lname>[\\w\\d,\\*\\^]*)]";
                final Pattern matchRulePattern = Pattern.compile(matchRuleRegexPattern);
                final Matcher matchRuleGroups = matchRulePattern.matcher(matchRulesString);
                matchRuleGroups.matches();
                if (matchRuleGroups.group("library") != null) {
                    for (final String libraryRule : Arrays.asList(matchRuleGroups.group("library").split(","))) {
                        if (!libraryRule.isEmpty()) {
                            if (libraryRule.startsWith("^")) {
                                libraryExcludeList.add(libraryRule.substring(1).trim());
                            }
                            else {
                                libraryIncludeList.add(libraryRule.trim());
                            }
                        }
                    }
                }
                if (matchRuleGroups.group("category") != null) {
                    for (final String categoryRule : Arrays.asList(matchRuleGroups.group("category").split(","))) {
                        if (!categoryRule.isEmpty()) {
                            if (categoryRule.startsWith("^")) {
                                categoryExcludeList.add(categoryRule.substring(1).trim());
                            }
                            else {
                                categoryIncludeList.add(categoryRule.trim());
                            }
                        }
                    }
                }
                if (matchRuleGroups.group("lname") != null) {
                    for (final String lnameRule : Arrays.asList(matchRuleGroups.group("lname").split(","))) {
                        if (!lnameRule.isEmpty()) {
                            if (lnameRule.startsWith("^")) {
                                lnameExcludeList.add(lnameRule.substring(1).trim());
                            }
                            else {
                                lnameIncludeList.add(lnameRule.trim());
                            }
                        }
                    }
                }
            }
            final List<String> pathList = new ArrayList<String>();
            if (pathString != null) {
                for (final String path : pathString.split(";")) {
                    if (path != null && !path.isEmpty()) {
                        pathList.add(path.trim());
                    }
                }
            }
            final SearchPath searchPathToAdd = new SearchPath(searchRoot);
            searchPathToAdd.setLibraryIncludeList(libraryIncludeList);
            searchPathToAdd.setLibraryExcludeList(libraryExcludeList);
            searchPathToAdd.setLnameIncludeList(lnameIncludeList);
            searchPathToAdd.setLnameExcludeList(lnameExcludeList);
            searchPathToAdd.setCategoryIncludeList(categoryIncludeList);
            searchPathToAdd.setCategoryExcludeList(categoryExcludeList);
            searchPathToAdd.setPathList(pathList);
            SearchPathParser.logger.debug("Adding searchPath to searchPath List: " + searchPathToAdd.toString());
            searchPathList.add(searchPathToAdd);
        }
        return searchPathList;
    }
    
    private List<String> splitInitialSearchPath(final String initialSearchPath) throws BuildException {
        final ArrayList<String> searchPathStrings = new ArrayList<String>();
        if (!initialSearchPath.substring(0, SearchPathParser.SEARCH_SCHEME.length()).equals(SearchPathParser.SEARCH_SCHEME)) {
            throw new BuildException(Messages.getMessage("MetadataStore_CLI_INVALID_SEARCH_PATH", initialSearchPath));
        }
        for (String searchPathString : initialSearchPath.split(SearchPathParser.SEARCH_SCHEME)) {
            if (searchPathString != null) {
                if (searchPathString.length() != 0) {
                    searchPathString = SearchPathParser.SEARCH_SCHEME + searchPathString;
                    SearchPathParser.logger.debug("SearchPathString = " + searchPathString);
                    searchPathStrings.add(searchPathString);
                }
            }
        }
        return searchPathStrings;
    }
    
    static {
        SearchPathParser.logger = LoggerFactory.getLogger((Class)SearchPathParser.class);
        SearchPathParser.SEARCH_SCHEME = "search:";
    }
}
