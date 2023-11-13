package com.ibm.dbb.dependency;

import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.dependency.internal.SearchPath;
import com.ibm.dbb.dependency.internal.SearchPathParser;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogicalFile {
    private String lname;
    private String file;
    private String language;
    private boolean dev;
    private boolean prod;
    private boolean main;
    private boolean fsub;
    private boolean sub;
    private boolean ims;
    private boolean db2;
    private boolean mq;
    private LinkedHashSet<LogicalDependency> logicalDependencyHashSet;
    private static Logger logger = LoggerFactory.getLogger(LogicalFile.class);

    public LogicalFile(String lname, String file) {
        this(lname, file, "UNKN", false, false, false, false, false, false, false);
    }

    public LogicalFile(String lname, String file, String language, boolean dev, boolean prod, boolean main, boolean fsub, boolean sub, boolean ims, boolean db2) {
        this(lname, file, language, dev, prod, main, fsub, sub, ims, db2, false);
    }

    public LogicalFile(String lname, String file, String language, boolean dev, boolean prod, boolean main, boolean fsub, boolean sub, boolean ims, boolean db2, boolean mq) {
        this.setLname(lname);
        this.setFile(file);
        this.setLanguage(language);
        this.setDev(dev);
        this.setProd(prod);
        this.setMain(main);
        this.setFSUB(fsub);
        this.setSUB(sub);
        this.setIMS(ims);
        this.setDB2(db2);
        this.setMQ(mq);
        this.logicalDependencyHashSet = new LinkedHashSet();
    }

    public List<PhysicalDependency> resolveDependencies(String searchPathString) throws DependencyException, BuildException, IOException {
        return this.resolveDependencies(searchPathString, (List)null);
    }

    public List<PhysicalDependency> resolveDependencies(List<SearchPath> searchPathList) throws DependencyException, BuildException, IOException {
        return this.resolveDependencies(searchPathList, (List)null);
    }

    public List<PhysicalDependency> resolveDependencies(String searchPathString, String lname) throws DependencyException, BuildException, IOException {
        List<String> lnames = new ArrayList();
        lnames.add(lname);
        return this.resolveDependencies((String)searchPathString, (List)lnames);
    }

    public List<PhysicalDependency> resolveDependencies(String searchPathString, List<String> lnames) throws DependencyException, BuildException, IOException {
        SearchPathParser searchPathParser = new SearchPathParser();
        List<SearchPath> searchPathList = searchPathParser.parse(searchPathString);
        return this.resolveDependencies(searchPathList, lnames);
    }

    public List<PhysicalDependency> resolveDependencies(List<SearchPath> searchPathList, List<String> lnames) throws DependencyException, BuildException, IOException {
        logger.debug("Entering LogicalFile.resolveDependencies");
        List<PhysicalDependency> physicalDependencyList = new ArrayList();
        if (this.logicalDependencyHashSet == null) {
            logger.debug("Logical file contains no logical dependencies. Returning empty list.");
            return physicalDependencyList;
        } else {
            Iterator var4 = this.logicalDependencyHashSet.iterator();

            while(true) {
                while(var4.hasNext()) {
                    LogicalDependency logicalDependency = (LogicalDependency)var4.next();
                    PhysicalDependency physicalDependency = null;
                    if (lnames != null && !lnames.isEmpty() && !lnames.contains(logicalDependency.getLname())) {
                        logger.debug("Logical dependency for {} does not match requested lnames {}", logicalDependency.getLname(), lnames);
                    } else {
                        logger.debug("Processing logical dependency {}", logicalDependency);
                        Iterator var7 = searchPathList.iterator();

                        while(var7.hasNext()) {
                            SearchPath searchPath = (SearchPath)var7.next();
                            logger.debug("Searching searchPath: {}", searchPath);
                            physicalDependency = searchPath.find(logicalDependency);
                            if (physicalDependency.isResolved()) {
                                logger.debug("Logical dependency resolved in searchpath");
                                break;
                            }

                            logger.debug("Logical dependency not resolved in seachpath");
                        }

                        if (physicalDependency != null) {
                            physicalDependencyList.add(physicalDependency);
                        }
                    }
                }

                logger.debug("Leaving LogicalFile.resolveDependencies");
                return physicalDependencyList;
            }
        }
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname != null ? lname.trim() : lname;
    }

    public String getFile() {
        return this.file;
    }

    public void setFile(String file) {
        this.file = file != null ? file.trim() : file;
    }

    public List<LogicalDependency> getLogicalDependencies() {
        List<LogicalDependency> logicalDependencies = new ArrayList();
        logicalDependencies.addAll(this.logicalDependencyHashSet);
        return logicalDependencies;
    }

    public void setLogicalDependencies(List<LogicalDependency> logicalDependencies) {
        this.logicalDependencyHashSet.clear();
        this.logicalDependencyHashSet.addAll(logicalDependencies);
    }

    public void addLogicalDependency(LogicalDependency logicalDependency) {
        this.logicalDependencyHashSet.add(logicalDependency);
    }

    public String getLanguage() {
        return this.language;
    }

    public boolean isDev() {
        return this.dev;
    }

    public void setDev(boolean value) {
        this.dev = value;
    }

    public boolean isProd() {
        return this.prod;
    }

    public void setProd(boolean value) {
        this.prod = value;
    }

    public boolean isMain() {
        return this.main;
    }

    public void setMain(boolean value) {
        this.main = value;
    }

    public boolean isFSUB() {
        return this.fsub;
    }

    public void setFSUB(boolean value) {
        this.fsub = value;
    }

    public boolean isSUB() {
        return this.sub;
    }

    public void setSUB(boolean value) {
        this.sub = value;
    }

    public boolean isDB2() {
        return this.db2;
    }

    public void setDB2(boolean value) {
        this.db2 = value;
    }

    public boolean isIMS() {
        return this.ims;
    }

    public void setIMS(boolean value) {
        this.ims = value;
    }

    public void setLanguage(String language) {
        this.language = language != null ? language.trim() : language;
    }

    public boolean isMQ() {
        return this.mq;
    }

    public void setMQ(boolean value) {
        this.mq = value;
    }

    public JSONObject toJSON() {
        JSONObject jObj = new JSONObject();
        if (this.lname != null && this.lname.length() > 0) {
            jObj.put("lname", this.lname);
        }

        if (this.file != null && this.file.length() > 0) {
            jObj.put("file", this.file);
        }

        if (this.language != null && this.language.length() > 0) {
            jObj.put("language", this.language);
        }

        jObj.put("dev", this.dev);
        jObj.put("prod", this.prod);
        jObj.put("main", this.main);
        jObj.put("fsub", this.fsub);
        jObj.put("sub", this.sub);
        jObj.put("ims", this.ims);
        jObj.put("db2", this.db2);
        jObj.put("mq", this.mq);
        if (this.logicalDependencyHashSet != null && this.logicalDependencyHashSet.size() > 0) {
            JSONArray jArray = new JSONArray();
            Iterator var3 = this.logicalDependencyHashSet.iterator();

            while(var3.hasNext()) {
                LogicalDependency ldep = (LogicalDependency)var3.next();
                jArray.add(ldep.toJSON());
            }

            jObj.put("logicalDependencies", jArray);
        }

        return jObj;
    }

    public String toString() {
        String s = null;

        try {
            s = this.toJSON().serialize(true);
        } catch (IOException var3) {
            s = var3.getMessage();
        }

        return s;
    }

    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.dev ? 1231 : 1237);
        result = 31 * result + (this.prod ? 1231 : 1237);
        result = 31 * result + (this.main ? 1231 : 1237);
        result = 31 * result + (this.fsub ? 1231 : 1237);
        result = 31 * result + (this.sub ? 1231 : 1237);
        result = 31 * result + (this.ims ? 1231 : 1237);
        result = 31 * result + (this.file == null ? 0 : this.file.hashCode());
        result = 31 * result + (this.language == null ? 0 : this.language.hashCode());
        result = 31 * result + (this.lname == null ? 0 : this.lname.hashCode());
        result = 31 * result + (this.logicalDependencyHashSet == null ? 0 : this.logicalDependencyHashSet.hashCode());
        result = 31 * result + (this.db2 ? 1231 : 1237);
        result = 31 * result + (this.mq ? 1231 : 1237);
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (!(obj instanceof LogicalFile)) {
            return false;
        } else {
            LogicalFile other = (LogicalFile)obj;
            if (this.ims != other.ims) {
                return false;
            } else {
                if (this.file == null) {
                    if (other.file != null) {
                        return false;
                    }
                } else if (!this.file.equals(other.file)) {
                    return false;
                }

                if (this.dev != other.dev) {
                    return false;
                } else if (this.prod != other.prod) {
                    return false;
                }

                if (this.main != other.main) {
                    return false;
                } else if (this.fsub != other.fsub) {
                    return false;
                } else if (this.sub != other.sub) {
                    return false;
                }

                if (this.language == null) {
                    if (other.language != null) {
                        return false;
                    }
                } else if (!this.language.equals(other.language)) {
                    return false;
                }

                if (this.lname == null) {
                    if (other.lname != null) {
                        return false;
                    }
                } else if (!this.lname.equals(other.lname)) {
                    return false;
                }

                if (this.logicalDependencyHashSet == null) {
                    if (other.logicalDependencyHashSet != null) {
                        return false;
                    }
                } else if (!this.logicalDependencyHashSet.equals(other.logicalDependencyHashSet)) {
                    return false;
                }

                if (this.db2 != other.db2) {
                    return false;
                } else {
                    return this.mq == other.mq;
                }
            }
        }
    }
}
