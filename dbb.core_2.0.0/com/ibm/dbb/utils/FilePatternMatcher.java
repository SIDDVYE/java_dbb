// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.utils;

import org.slf4j.LoggerFactory;
import java.nio.file.Path;
import java.util.Iterator;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Arrays;
import org.slf4j.Logger;
import java.nio.file.PathMatcher;
import java.util.List;

public class FilePatternMatcher
{
    private List<PathMatcher> pathMatchers;
    private String searchPaths;
    private static final String GLOB_PREFIX = "glob:";
    private static final String REGEX_PREFIX = "regex:";
    private static Logger logger;
    
    public FilePatternMatcher(final String filePattern) {
        this(Arrays.asList(filePattern));
    }
    
    public FilePatternMatcher(final List<String> filePatterns) {
        this.pathMatchers = new ArrayList<PathMatcher>();
        final StringBuffer buffer = new StringBuffer();
        for (String filePattern : filePatterns) {
            if (!filePattern.startsWith("glob:") && !filePattern.startsWith("regex:")) {
                filePattern = "glob:" + filePattern;
            }
            final PathMatcher matcher = FileSystems.getDefault().getPathMatcher(filePattern);
            this.pathMatchers.add(matcher);
            buffer.append(filePattern + ";");
        }
        this.searchPaths = buffer.toString();
    }
    
    public boolean matches(final String file) {
        final Path path = FileSystems.getDefault().getPath(file, new String[0]);
        return this.matches(path);
    }
    
    public boolean matches(final Path path) {
        for (final PathMatcher matcher : this.pathMatchers) {
            if (matcher.matches(path)) {
                FilePatternMatcher.logger.debug("Found file {} in {}", (Object)path.toString(), (Object)this.searchPaths);
                return true;
            }
            FilePatternMatcher.logger.debug("Did not find file {} in {}", (Object)path.toString(), (Object)this.searchPaths);
        }
        return false;
    }
    
    public String getSearchPaths() {
        return this.searchPaths;
    }
    
    @Override
    public String toString() {
        return this.getSearchPaths();
    }
    
    static {
        FilePatternMatcher.logger = LoggerFactory.getLogger((Class)FilePatternMatcher.class);
    }
}
