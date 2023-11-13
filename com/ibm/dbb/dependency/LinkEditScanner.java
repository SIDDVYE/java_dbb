// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.dependency;

import org.slf4j.LoggerFactory;
import java.util.Iterator;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.BuildReportFactory;
import com.ibm.dbb.build.report.records.DependencySetRecord;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.StringReader;
import com.ibm.dbb.build.internal.Utils;
import com.ibm.dbb.build.internal.ValidationHelper;
import com.ibm.dbb.EnvVars;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.build.CopyToPDS;
import java.io.IOException;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.BuildProperties;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;

public class LinkEditScanner implements ILinkEditScanner
{
    private static final String BGZLKEPS = "bgzlkeps";
    private static final String LIB_DIR = "lib/";
    private static final String SPACE = " ";
    private static final String KEY_MEMBER = "MEMBER=";
    private static final String KEY_DSNAME = "DSNAME=";
    private static final String KEY_TYPE = "TYPE=";
    private static final String ZBND = "ZBND";
    private static final String LINK = "LINK";
    private static final String LINK_EDIT_EXCLUDE_FILTER = "dbb.LinkEditScanner.excludeFilter";
    private static final String COMMA = ",";
    private static final String LIBPATH = "LIBPATH";
    private static final String DEFAULT_LIBPATH = "$LIBPATH:/usr/lib";
    private static Logger logger;
    private StringBuffer scannerOutput;
    private String excludeFilters;
    private Map<String, String> envVars;
    
    public LinkEditScanner() {
        this.scannerOutput = new StringBuffer();
        this.excludeFilters = null;
        (this.envVars = new HashMap<String, String>()).put("LIBPATH", "$LIBPATH:/usr/lib");
    }
    
    @Override
    public LogicalFile scan(final String file) throws BuildException, IOException {
        return this.scan(file, BuildProperties.getProperty("hlq") + ".LOAD");
    }
    
    @Override
    public LogicalFile scan(final String file, final String loadPDS) throws BuildException, IOException {
        return this.scan(file, loadPDS, CopyToPDS.createMemberName(file));
    }
    
    @Override
    public LogicalFile scan(String file, String loadPDS, String member) throws BuildException, IOException {
        LinkEditScanner.logger.debug("LinkEditScanner.scan file = " + file + " loadPDS = " + loadPDS + "(" + member + ")");
        if (file == null) {
            throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", "file"));
        }
        if (loadPDS == null) {
            throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", "loadPDS"));
        }
        if (member == null) {
            throw new IllegalArgumentException(Messages.getMessage("INVALID_NULL_PARAMETER", "member"));
        }
        String dbbHome = EnvVars.getHome();
        if (dbbHome == null) {
            throw new BuildException(Messages.getMessage("INVALID_NULL_PARAMETER", "DBB_HOME"));
        }
        file = file.trim();
        loadPDS = loadPDS.trim();
        member = member.trim();
        dbbHome = dbbHome.trim();
        if (!dbbHome.endsWith("/")) {
            dbbHome += "/";
        }
        LinkEditScanner.logger.debug("DBB_HOME=" + dbbHome);
        final String lmName = "//'" + loadPDS + "(" + member + ")'";
        ValidationHelper.datasetExists(lmName, Messages.getMessage("LinkEditScanner_DATASET_NOT_FOUND", lmName));
        final StringBuilder results = new StringBuilder();
        final String command = dbbHome + "lib/" + "bgzlkeps" + " " + loadPDS + " " + member;
        LinkEditScanner.logger.debug("Running..." + command);
        final Process process = Utils.runInProcess(command, results, this.envVars);
        if (process.exitValue() != 0) {
            throw new BuildException("LinkEditParser failed: \n" + results.toString());
        }
        LinkEditScanner.logger.debug("Successfully ran LinkEditParser against " + loadPDS + "(" + member + ")");
        LinkEditScanner.logger.debug(results.toString());
        final LogicalFile logicalFile = new LogicalFile(member, file, "ZBND", false, false, false);
        final BufferedReader br = new BufferedReader(new StringReader(results.toString()));
        try {
            this.scannerOutput.delete(0, this.scannerOutput.length());
            String dsname = null;
            String modMember = null;
            String type = null;
            String s;
            while ((s = br.readLine()) != null) {
                this.scannerOutput.append(s + "\n");
                s = s.trim();
                if (s.startsWith("TYPE=")) {
                    type = s.substring("TYPE=".length()).trim();
                }
                else if (s.startsWith("DSNAME=")) {
                    dsname = s.substring("DSNAME=".length()).trim();
                }
                else {
                    if (!s.startsWith("MEMBER=")) {
                        continue;
                    }
                    modMember = s.substring("MEMBER=".length()).trim();
                    this.addParserOutput(logicalFile, dsname, modMember, type);
                    dsname = (type = (modMember = null));
                }
            }
        }
        finally {
            br.close();
        }
        this.addBuildReportData(logicalFile, file);
        return logicalFile;
    }
    
    private void addParserOutput(final LogicalFile logicalFile, final String dsname, final String member, final String type) {
        if (dsname == null || dsname.length() == 0 || member == null || member.length() == 0 || type == null || type.length() == 0) {
            return;
        }
        final LogicalDependency ld = new LogicalDependency(member, dsname, "LINK");
        if (logicalFile.getLogicalDependencies().contains(ld)) {
            return;
        }
        if (this.isDsNameExcludedFromParserOutput(dsname, member)) {
            return;
        }
        logicalFile.addLogicalDependency(ld);
    }
    
    private boolean isDsNameExcludedFromParserOutput(final String dsname, final String member) {
        final String excludeFilter = this.getExcludeFilter();
        if (this.isExcludedByFilter(dsname, member, excludeFilter)) {
            LinkEditScanner.logger.debug(dsname + "(" + member + ") was excluded from the parser output by user defined exclude name filter: " + excludeFilter);
            return true;
        }
        return false;
    }
    
    private boolean isExcludedByFilter(final String dsname, final String member, final String filter) {
        if (filter == null || filter.trim().length() == 0) {
            return false;
        }
        final String fullDsName = dsname + "." + member;
        final String[] split;
        final String[] filters = split = filter.trim().split(",");
        for (final String s : split) {
            final String origRule = s.trim();
            final Pattern rule = Pattern.compile("^" + origRule.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*").replaceAll("\\$", "\\\\\\$"));
            final Matcher m = rule.matcher(fullDsName);
            if (m.find()) {
                return true;
            }
        }
        return false;
    }
    
    private void addBuildReportData(final LogicalFile logicalFile, final String file) {
        if (logicalFile.getLogicalDependencies().isEmpty()) {
            return;
        }
        DependencySetRecord record = this.getDependencySetRecord(file);
        if (record == null) {
            record = new DependencySetRecord();
            record.setFile(file);
            BuildReportFactory.getBuildReport().addRecord(record);
        }
        for (final LogicalDependency ld : logicalFile.getLogicalDependencies()) {
            final PhysicalDependency pd = new PhysicalDependency(ld, null, null, this.pdsName(ld));
            pd.setResolved(true);
            record.addDependency(pd);
        }
    }
    
    private DependencySetRecord getDependencySetRecord(final String file) {
        DependencySetRecord ds_record = null;
        for (final Record record : BuildReportFactory.getBuildReport().getRecords()) {
            if (record instanceof DependencySetRecord && ((DependencySetRecord)record).getFile().equals(file)) {
                ds_record = (DependencySetRecord)record;
                break;
            }
        }
        return ds_record;
    }
    
    private String pdsName(final LogicalDependency ld) {
        return ld.library + "(" + ld.getLname() + ")";
    }
    
    @Override
    public String getScannerOutput() {
        return this.scannerOutput.toString();
    }
    
    @Override
    public void setExcludeFilter(final String filter) {
        this.excludeFilters = filter;
    }
    
    @Override
    public String getExcludeFilter() {
        if (this.excludeFilters == null) {
            this.excludeFilters = BuildProperties.getProperty("dbb.LinkEditScanner.excludeFilter");
        }
        return this.excludeFilters;
    }
    
    @Override
    public String getLibpath() {
        return this.envVars.get("LIBPATH");
    }
    
    @Override
    public void setLibpath(final String libpath) {
        this.envVars.put("LIBPATH", libpath);
    }
    
    static {
        LinkEditScanner.logger = LoggerFactory.getLogger((Class)LinkEditScanner.class);
    }
}
