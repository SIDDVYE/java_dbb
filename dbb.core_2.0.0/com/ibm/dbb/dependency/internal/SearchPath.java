// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency.internal;

import org.slf4j.LoggerFactory;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import java.util.stream.Stream;
import com.ibm.dbb.build.internal.TarArchiveHandler;
import java.util.Iterator;
import com.ibm.dbb.build.CopyToPDS;
import com.ibm.dbb.build.internal.Messages;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import com.ibm.dbb.utils.FilePatternMatcher;
import com.ibm.dbb.build.BuildException;
import java.io.IOException;
import com.ibm.dbb.dependency.PhysicalDependency;
import com.ibm.dbb.dependency.LogicalDependency;
import java.util.ArrayList;
import java.nio.file.Path;
import java.util.Map;
import org.slf4j.Logger;
import java.util.List;

public class SearchPath
{
    private String searchRoot;
    private List<String> pathList;
    private List<String> libraryIncludeList;
    private List<String> libraryExcludeList;
    private List<String> categoryIncludeList;
    private List<String> categoryExcludeList;
    private List<String> lnameIncludeList;
    private List<String> lnameExcludeList;
    private static Logger logger;
    private static Map<String, List<Path>> fileListCache;
    
    public SearchPath(final String searchRoot) {
        this.searchRoot = searchRoot;
        if (!this.searchRoot.endsWith("/") && !this.searchRoot.endsWith("tar.gz") && !this.searchRoot.endsWith("tar")) {
            this.searchRoot += "/";
        }
        this.pathList = new ArrayList<String>();
        this.libraryIncludeList = new ArrayList<String>();
        this.libraryExcludeList = new ArrayList<String>();
        this.categoryIncludeList = new ArrayList<String>();
        this.categoryExcludeList = new ArrayList<String>();
        this.lnameIncludeList = new ArrayList<String>();
        this.lnameExcludeList = new ArrayList<String>();
    }
    
    public PhysicalDependency find(final LogicalDependency logicalDependency) throws IOException, BuildException {
        return this.find(logicalDependency, false);
    }
    
    public PhysicalDependency find(final LogicalDependency logicalDependency, final boolean skipMatchRules) throws IOException, BuildException {
        if (!skipMatchRules && !this.verifyMatchRules(logicalDependency)) {
            final PhysicalDependency physicalDependency = new PhysicalDependency(logicalDependency);
            physicalDependency.setResolved(false);
            physicalDependency.setExcluded(true);
            return physicalDependency;
        }
        if (this.searchRoot.endsWith(".tar.gz") || this.searchRoot.endsWith("tar")) {
            return this.findInArchive(logicalDependency);
        }
        return this.findInDirectory(logicalDependency);
    }
    
    private PhysicalDependency findInDirectory(final LogicalDependency logicalDependency) throws IOException {
        SearchPath.logger.debug("Detected DIRECTORY search, searching for PhysicalDependency" + logicalDependency + "in search root " + this.searchRoot);
        final List<Path> matchedFiles = new ArrayList<Path>();
        final PhysicalDependency physicalDependency = new PhysicalDependency(logicalDependency);
        if (this.pathList.size() > 0) {
            SearchPath.logger.debug("Narrowing search based on supplied paths");
            SearchPath.logger.debug("Path list: {}", (Object)this.pathList);
            for (final String path : this.pathList) {
                final String absPath = this.searchRoot + path;
                List<Path> potentialMatches;
                if ((potentialMatches = SearchPath.fileListCache.get(absPath)) == null) {
                    final FilePatternMatcher filePatternMatcher = new FilePatternMatcher(absPath);
                    final String root = this.concatenateRoot(path);
                    final Path rootPath = Paths.get(root, new String[0]);
                    if (Files.exists(rootPath, new LinkOption[0])) {
                        SearchPath.logger.debug("Searching root {} for files matching {}", (Object)root, (Object)filePatternMatcher.toString());
                        final FilePatternMatcher filePatternMatcher2;
                        potentialMatches = Files.find(rootPath, Integer.MAX_VALUE, (f, attr) -> attr.isRegularFile() && filePatternMatcher2.matches(f), new FileVisitOption[0]).collect((Collector<? super Path, ?, List<Path>>)Collectors.toList());
                    }
                    else {
                        SearchPath.logger.warn(Messages.getMessage("SEARCH_PATH_DIRECTORY_DNE", root));
                        potentialMatches = new ArrayList<Path>();
                    }
                    SearchPath.fileListCache.put(absPath, potentialMatches);
                    SearchPath.logger.debug("Searched file tree and stored file list in cache: {}", (Object)potentialMatches.toString());
                }
                for (final Path f2 : potentialMatches) {
                    if (CopyToPDS.createMemberName(f2.toString()).equals(logicalDependency.getLname())) {
                        matchedFiles.add(f2);
                    }
                }
                if (matchedFiles.size() > 0) {
                    break;
                }
            }
        }
        else {
            SearchPath.logger.debug("Searching entire search root " + this.searchRoot);
            Files.find(Paths.get(this.searchRoot, new String[0]), Integer.MAX_VALUE, (f, attr) -> attr.isRegularFile() && CopyToPDS.createMemberName(f.toString()).equals(logicalDependency.getLname()), new FileVisitOption[0]).forEach(f -> matchedFiles.add(f));
        }
        if (matchedFiles == null || matchedFiles.size() == 0) {
            SearchPath.logger.debug("No matches found for " + logicalDependency);
            return physicalDependency;
        }
        if (matchedFiles.size() > 1) {
            SearchPath.logger.warn(Messages.getMessage("SEARCH_PATH_MULTIPLE_RESOLVED_FILES"));
            SearchPath.logger.debug("Files located:");
            if (SearchPath.logger.isDebugEnabled()) {
                for (final Path path2 : matchedFiles) {
                    SearchPath.logger.debug("File: " + path2.toString());
                }
            }
        }
        physicalDependency.setSourceDir(this.searchRoot);
        physicalDependency.setFile(matchedFiles.get(0).toString().replace(this.searchRoot, ""));
        physicalDependency.setResolved(true);
        return physicalDependency;
    }
    
    private PhysicalDependency findInArchive(final LogicalDependency logicalDependency) throws BuildException {
        SearchPath.logger.debug("Detected TAR file, searching for PhysicalDependency" + logicalDependency + "in archive " + this.searchRoot);
        final List<Path> matchedFiles = new ArrayList<Path>();
        final PhysicalDependency physicalDependency = new PhysicalDependency(logicalDependency);
        final TarArchiveHandler tarArchiveHandler = new TarArchiveHandler(this.searchRoot, null);
        SearchPath.logger.debug("Found {} files in ARCHIVE {}", (Object)tarArchiveHandler.getFileNames().size(), (Object)this.searchRoot);
        if (this.pathList.size() > 0) {
            for (final String path : this.pathList) {
                final List<String> list = new ArrayList<String>();
                list.add(path);
                final FilePatternMatcher filePatternMatcher = new FilePatternMatcher(list);
                for (final String file : tarArchiveHandler.getFileNames()) {
                    SearchPath.logger.debug("Comparing ARCHIVE file: " + file);
                    if (filePatternMatcher.matches(file) && CopyToPDS.createMemberName(file).equals(logicalDependency.getLname())) {
                        SearchPath.logger.debug("found potential match in archive: " + file);
                        matchedFiles.add(Paths.get(file, new String[0]));
                    }
                }
                if (matchedFiles.size() > 0) {
                    break;
                }
            }
        }
        else {
            for (final String file2 : tarArchiveHandler.getFileNames()) {
                SearchPath.logger.debug("Comparing ARCHIVE file: " + file2);
                if (CopyToPDS.createMemberName(file2).equals(logicalDependency.getLname())) {
                    SearchPath.logger.debug("found potential match in archive: " + file2);
                    matchedFiles.add(Paths.get(file2, new String[0]));
                }
            }
        }
        if (matchedFiles.size() == 0) {
            return physicalDependency;
        }
        if (matchedFiles.size() > 1) {
            SearchPath.logger.warn(Messages.getMessage("SEARCH_PATH_MULTIPLE_RESOLVED_FILES"));
        }
        physicalDependency.setArchive(this.searchRoot);
        physicalDependency.setFile(matchedFiles.get(0).toString());
        physicalDependency.setResolved(true);
        return physicalDependency;
    }
    
    private boolean verifyMatchRules(final LogicalDependency logicalDependency) {
        if (this.libraryIncludeList.size() > 0 && logicalDependency.getLibrary() != null) {
            SearchPath.logger.debug("Checking dependency against library include rules");
            boolean passesLibraryCheck = false;
            for (final String libraryRule : this.libraryIncludeList) {
                if (logicalDependency.getLibrary().matches(libraryRule.replace("*", ".*"))) {
                    SearchPath.logger.debug("Passes library include rule: " + libraryRule);
                    passesLibraryCheck = true;
                }
            }
            if (!passesLibraryCheck) {
                return false;
            }
        }
        if (this.libraryExcludeList.size() > 0 && logicalDependency.getLibrary() != null) {
            SearchPath.logger.debug("Checking dependency against library exclude rules");
            for (final String libraryRule2 : this.libraryExcludeList) {
                if (logicalDependency.getLibrary().matches(libraryRule2.replace("*", ".*"))) {
                    SearchPath.logger.debug("Fails library exclude rule: " + libraryRule2);
                    return false;
                }
            }
        }
        if (this.categoryIncludeList.size() > 0 && logicalDependency.getCategory() != null) {
            SearchPath.logger.debug("Checking dependency against category include rules");
            boolean passesCategoryCheck = false;
            for (final String categoryRule : this.categoryIncludeList) {
                if (logicalDependency.getCategory().matches(categoryRule.replace("*", ".*"))) {
                    SearchPath.logger.debug("Passes library include rule: " + categoryRule);
                    passesCategoryCheck = true;
                }
            }
            if (!passesCategoryCheck) {
                return false;
            }
        }
        if (this.categoryExcludeList.size() > 0 && logicalDependency.getCategory() != null) {
            SearchPath.logger.debug("Checking dependency against category exclude rules");
            for (final String categoryRule2 : this.categoryExcludeList) {
                if (logicalDependency.getCategory().matches(categoryRule2.replace("*", ".*"))) {
                    return false;
                }
            }
        }
        if (this.lnameIncludeList.size() > 0 && logicalDependency.getLname() != null) {
            SearchPath.logger.debug("Checking dependency against lname include rules");
            boolean passesLnameCheck = false;
            for (final String lnameRule : this.lnameIncludeList) {
                if (logicalDependency.getLname().matches(lnameRule.replace("*", ".*"))) {
                    SearchPath.logger.debug("Passes library include rule: " + lnameRule);
                    passesLnameCheck = true;
                }
            }
            if (!passesLnameCheck) {
                return false;
            }
        }
        if (this.lnameExcludeList.size() > 0 && logicalDependency.getLname() != null) {
            SearchPath.logger.debug("Checking dependency against lname exclude rules");
            for (final String lnameRule2 : this.lnameExcludeList) {
                if (logicalDependency.getLname().matches(lnameRule2.replace("*", ".*"))) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public List<Path> listFiles(final Path path) throws IOException {
        List<Path> result;
        try (final Stream<Path> walk = Files.walk(path, new FileVisitOption[0])) {
            result = walk.filter(x$0 -> Files.isRegularFile(x$0, new LinkOption[0])).collect((Collector<? super Path, ?, List<Path>>)Collectors.toList());
        }
        return result;
    }
    
    public JSONObject toJSON() {
        final JSONObject jObj = new JSONObject();
        if (this.searchRoot != null && this.searchRoot.length() > 0) {
            jObj.put((Object)"searchRoot", (Object)this.searchRoot);
        }
        if (this.pathList.size() > 0) {
            final JSONArray jArray = new JSONArray();
            for (final String path : this.pathList) {
                jArray.add((Object)path);
            }
            jObj.put((Object)"paths", (Object)jArray);
        }
        if (this.libraryIncludeList.size() > 0) {
            final JSONArray jArray = new JSONArray();
            for (final String libraryInclude : this.libraryIncludeList) {
                jArray.add((Object)libraryInclude);
            }
            jObj.put((Object)"libraryIncludes", (Object)jArray);
        }
        if (this.libraryExcludeList.size() > 0) {
            final JSONArray jArray = new JSONArray();
            for (final String libraryExclude : this.libraryExcludeList) {
                jArray.add((Object)libraryExclude);
            }
            jObj.put((Object)"libraryExcludes", (Object)jArray);
        }
        if (this.categoryIncludeList.size() > 0) {
            final JSONArray jArray = new JSONArray();
            for (final String categoryInclude : this.categoryIncludeList) {
                jArray.add((Object)categoryInclude);
            }
            jObj.put((Object)"categoryIncludes", (Object)jArray);
        }
        if (this.categoryExcludeList.size() > 0) {
            final JSONArray jArray = new JSONArray();
            for (final String categoryExclude : this.categoryExcludeList) {
                jArray.add((Object)categoryExclude);
            }
            jObj.put((Object)"categoryExcludes", (Object)jArray);
        }
        if (this.lnameIncludeList.size() > 0) {
            final JSONArray jArray = new JSONArray();
            for (final String lnameInclude : this.lnameIncludeList) {
                jArray.add((Object)lnameInclude);
            }
            jObj.put((Object)"lnameIncludes", (Object)jArray);
        }
        if (this.lnameExcludeList.size() > 0) {
            final JSONArray jArray = new JSONArray();
            for (final String lnameExclude : this.lnameExcludeList) {
                jArray.add((Object)lnameExclude);
            }
            jObj.put((Object)"lnameExcludes", (Object)jArray);
        }
        return jObj;
    }
    
    @Override
    public String toString() {
        String s = null;
        try {
            s = this.toJSON().serialize();
        }
        catch (IOException ioe) {
            s = ioe.getMessage();
        }
        return s;
    }
    
    @Deprecated
    public String getWorkspace() {
        return this.searchRoot;
    }
    
    public String getSearchRoot() {
        return this.searchRoot;
    }
    
    @Deprecated
    public void setWorkspace(String workspace) {
        if (!workspace.endsWith("/") && !workspace.endsWith("tar.gz") && !workspace.endsWith("tar")) {
            workspace += "/";
        }
        this.searchRoot = workspace;
    }
    
    public void setSearchRoot(String searchRoot) {
        if (!searchRoot.endsWith("/") && !searchRoot.endsWith("tar.gz") && !searchRoot.endsWith("tar")) {
            searchRoot += "/";
        }
        this.searchRoot = searchRoot;
    }
    
    public List<String> getPathList() {
        return this.pathList;
    }
    
    public void setPathList(final List<String> pathList) {
        this.pathList = pathList;
    }
    
    public void addPath(final String path) {
        this.pathList.add(path);
    }
    
    public List<String> getLibraryIncludeList() {
        return this.libraryIncludeList;
    }
    
    public void addIncludeLibary(final String library) {
        this.libraryIncludeList.add(library);
    }
    
    public void setLibraryIncludeList(final List<String> libraryIncludeList) {
        this.libraryIncludeList = libraryIncludeList;
    }
    
    public List<String> getLibraryExcludeList() {
        return this.libraryExcludeList;
    }
    
    public void addExcludeLibrary(final String library) {
        this.libraryExcludeList.add(library);
    }
    
    public void setLibraryExcludeList(final List<String> libraryExcludelist) {
        this.libraryExcludeList = libraryExcludelist;
    }
    
    public List<String> getCategoryIncludeList() {
        return this.categoryIncludeList;
    }
    
    public void addIncludeCategory(final String category) {
        this.categoryIncludeList.add(category);
    }
    
    public void setCategoryIncludeList(final List<String> categoryIncludeList) {
        this.categoryIncludeList = categoryIncludeList;
    }
    
    public List<String> getCategoryExcludeList() {
        return this.categoryExcludeList;
    }
    
    public void addExcludeCategory(final String category) {
        this.categoryExcludeList.add(category);
    }
    
    public void setCategoryExcludeList(final List<String> categoryExcludeList) {
        this.categoryExcludeList = categoryExcludeList;
    }
    
    public List<String> getLnameIncludeList() {
        return this.lnameIncludeList;
    }
    
    public void addIncludeLname(final String lname) {
        this.lnameIncludeList.add(lname);
    }
    
    public void setLnameIncludeList(final List<String> lnameIncludeList) {
        this.lnameIncludeList = lnameIncludeList;
    }
    
    public List<String> getLnameExcludeList() {
        return this.lnameExcludeList;
    }
    
    public void addExcludeLname(final String lname) {
        this.lnameExcludeList.add(lname);
    }
    
    public void setLnameExcludeList(final List<String> lnameExcludeList) {
        this.lnameExcludeList = lnameExcludeList;
    }
    
    private String concatenateRoot(final String path) {
        SearchPath.logger.debug("Concatenating search root {} with path up to wildcard {} to narrow search root used for traversal", (Object)this.searchRoot, (Object)path);
        final int wildcardIndex = path.indexOf(42);
        final String addToRoot = path.substring(0, wildcardIndex);
        final String root = this.searchRoot + addToRoot;
        SearchPath.logger.debug("Calculated most narrow root: {}", (Object)root);
        return root;
    }
    
    public static void staticReset() {
        SearchPath.fileListCache = new HashMap<String, List<Path>>();
    }
    
    static {
        SearchPath.logger = LoggerFactory.getLogger((Class)SearchPath.class);
        SearchPath.fileListCache = new HashMap<String, List<Path>>();
    }
}
