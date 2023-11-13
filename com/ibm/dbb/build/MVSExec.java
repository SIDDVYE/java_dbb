// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.build.internal.ValidationHelper;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.BuildReportFactory;
import java.util.Iterator;
import com.ibm.dbb.build.report.records.ExecuteRecord;
import com.ibm.dbb.build.internal.Utils;
import com.ibm.dbb.build.internal.DDProcessFactory;
import java.util.ArrayList;
import com.ibm.dbb.build.internal.DDProcess;
import java.util.List;
import org.slf4j.Logger;

public class MVSExec extends AbstractExec
{
    private static Logger logger;
    private static final String EIGHT_SPACES = "        ";
    private String pgm;
    private String parm;
    private String ddnames;
    private boolean freePgmAllocatedDDs;
    private List<CopyToHFS> copies;
    private DDProcess ddProcess;
    
    public MVSExec() {
        this.copies = new ArrayList<CopyToHFS>();
    }
    
    @Override
    protected int doExecute() throws BuildException {
        List<String> openDDs = null;
        this.ddProcess = DDProcessFactory.getDDProcess();
        Exception exception = null;
        int rc = 0;
        if (Utils.isBuildReportOnly()) {
            final ExecuteRecord execRecord = this.createBuildRecord(rc);
            this.copyToHFS(exception, execRecord);
        }
        else {
            try {
                this.ddProcess.alloc(this.ddStatements);
                if (this.freePgmAllocatedDDs) {
                    openDDs = this.ddProcess.getDDNames();
                    if (MVSExec.logger.isDebugEnabled()) {
                        final StringBuilder buffer = new StringBuilder();
                        final Iterator<String> openDDIterator = openDDs.iterator();
                        while (openDDIterator.hasNext()) {
                            buffer.append(openDDIterator.next());
                            if (openDDIterator.hasNext()) {
                                buffer.append(',');
                            }
                        }
                        MVSExec.logger.debug("Allocated DDs Before MVSExec: " + buffer.toString());
                    }
                }
                final String pgmInEight = formatInEightChars(this.pgm);
                final boolean tasklib = this.hasTaskLib();
                String tempParm = this.parm;
                String tempDdnames = this.checkDdNames(this.ddnames);
                if (this.parm == null) {
                    tempParm = "";
                }
                if (this.ddnames == null) {
                    tempDdnames = "";
                }
                MVSExec.logger.debug("Executing '" + pgmInEight + "' with the following parameters: (" + tempParm + "), DD names: (" + tempDdnames + "), tasklib: " + tasklib);
                rc = this.ddProcess.executeMvsPgm(pgmInEight, this.parm, tempDdnames, tasklib);
                MVSExec.logger.debug("RC: " + rc);
            }
            catch (Exception e) {
                exception = e;
            }
            finally {
                if (openDDs != null) {
                    final List<String> pgmDDs = new ArrayList<String>();
                    final List<String> closedDDs = this.ddProcess.getDDNames();
                    for (final String closedDD : closedDDs) {
                        if (!openDDs.contains(closedDD)) {
                            pgmDDs.add(closedDD);
                        }
                    }
                    if (MVSExec.logger.isDebugEnabled()) {
                        final StringBuilder buffer2 = new StringBuilder();
                        final Iterator<String> closedDDIterator = closedDDs.iterator();
                        while (closedDDIterator.hasNext()) {
                            buffer2.append(closedDDIterator.next());
                            if (closedDDIterator.hasNext()) {
                                buffer2.append(',');
                            }
                        }
                        MVSExec.logger.debug("Allocated DDs After MVSExec: " + buffer2.toString());
                    }
                    MVSExec.logger.debug("Number of DDs remained to be free: " + pgmDDs.size());
                    for (final String pgmDD : pgmDDs) {
                        MVSExec.logger.debug("Free program DD: " + pgmDD);
                        this.ddProcess.free(pgmDD);
                    }
                }
                final ExecuteRecord execRecord2 = this.createBuildRecord(rc);
                this.copyToHFS(exception, execRecord2);
                if (exception != null) {
                    throw new BuildException(exception);
                }
            }
        }
        return rc;
    }
    
    private void copyToHFS(final Exception exception, final ExecuteRecord execRecord) throws BuildException {
        try {
            for (final CopyToHFS copy : this.copies) {
                try {
                    copy.execute();
                    if (copy.getFile() == null) {
                        continue;
                    }
                    execRecord.addLogFile(copy.getFile());
                }
                catch (BuildException e) {
                    MVSExec.logger.debug(e.getMessage());
                }
            }
            this.ddProcess.freeAll(false);
        }
        catch (Exception e2) {
            if (exception == null) {
                throw new BuildException(e2);
            }
        }
    }
    
    private ExecuteRecord createBuildRecord(final int rc) {
        final ExecuteRecord execRecord = this.createReportRecord();
        execRecord.setCommand(this.pgm);
        execRecord.setOptions(this.parm);
        execRecord.setRc(rc);
        BuildReportFactory.getBuildReport().addRecord(execRecord);
        return execRecord;
    }
    
    public void addCopyToHFS(final CopyToHFS copy) {
        this.copies.add(copy);
    }
    
    private static String formatInEightChars(final String s) {
        return (s + "        ").substring(0, 8);
    }
    
    private String checkDdNames(final String ddNamesList) {
        String s = "";
        final String ddnames = ddNamesList;
        if (ddnames == null) {
            return null;
        }
        if (ddnames.isEmpty()) {
            return s;
        }
        if (ddnames.contains(",")) {
            final String[] split;
            final String[] dds = split = ddnames.split(",");
            for (final String dd : split) {
                s += formatInEightChars(dd);
            }
        }
        else if (ddnames.length() < 8) {
            s += formatInEightChars(ddnames);
        }
        else {
            s = ddnames;
        }
        return s;
    }
    
    private boolean hasTaskLib() {
        for (final DDStatement ddStatement : this.ddStatements) {
            if (ddStatement.getName().equalsIgnoreCase("TASKLIB")) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    protected void validateInputs() {
        super.validateInputs();
        ValidationHelper.isNotNull(this.pgm, Messages.getMessage("INVALID_NULL_PARAMETER", "pgm"));
    }
    
    public void setPgm(final String pgm) {
        this.pgm = pgm;
    }
    
    public void setParm(final String parm) {
        this.parm = parm;
    }
    
    public void setDdnames(final String ddnames) {
        this.ddnames = ddnames;
    }
    
    public MVSExec pgm(final String pgm) {
        this.setPgm(pgm);
        return this;
    }
    
    public MVSExec parm(final String parm) {
        this.setParm(parm);
        return this;
    }
    
    public MVSExec ddnames(final String ddnames) {
        this.setDdnames(ddnames);
        return this;
    }
    
    public MVSExec copy(final CopyToHFS copy) {
        this.addCopyToHFS(copy);
        return this;
    }
    
    public MVSExec file(final String file) {
        this.setFile(file);
        return this;
    }
    
    public boolean isFreePgmAllocatedDDs() {
        return this.freePgmAllocatedDDs;
    }
    
    public void setFreePgmAllocatedDDs(final boolean freePgmAllocatedDDs) {
        this.freePgmAllocatedDDs = freePgmAllocatedDDs;
    }
    
    public MVSExec freePgmAllocatedDDs(final boolean freePgmAllocatedDDs) {
        this.setFreePgmAllocatedDDs(freePgmAllocatedDDs);
        return this;
    }
    
    static {
        MVSExec.logger = LoggerFactory.getLogger((Class)MVSExec.class);
    }
}
