// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import com.ibm.dbb.build.report.records.ExecuteRecord;
import com.ibm.dbb.build.internal.TempDDAssignment;
import java.util.Iterator;
import com.ibm.dbb.build.internal.Messages;
import com.ibm.dbb.build.internal.DBBSMFWriter;
import com.ibm.dbb.build.internal.ProductRegistrationChecker;
import java.util.ArrayList;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.slf4j.Logger;

public abstract class AbstractExec implements IExecute
{
    protected static Logger logger;
    protected String file;
    protected List<DDStatement> ddStatements;
    protected DDStatement lastNamedDD;
    
    public AbstractExec() {
        AbstractExec.logger = LoggerFactory.getLogger(this.getClass().getName());
        this.ddStatements = new ArrayList<DDStatement>();
    }
    
    @Override
    public final int execute() throws BuildException {
        ProductRegistrationChecker.check();
        DBBSMFWriter.writeDBBSMFRecord();
        this.validateInputs();
        return this.doExecute();
    }
    
    protected void validateInputs() {
    }
    
    protected abstract int doExecute() throws BuildException;
    
    public void addDDStatement(final DDStatement dd) throws BuildException {
        if (dd.getName() == null) {
            if (this.lastNamedDD == null) {
                throw new BuildException(Messages.getMessage("AbstractExec_CONCAT_FAILED"));
            }
            this.setTempDDNameIfNeeded(dd);
            this.lastNamedDD.concatenate(dd);
        }
        else {
            for (final DDStatement concatDD : dd.getConcatenations()) {
                this.setTempDDNameIfNeeded(concatDD);
            }
            this.lastNamedDD = dd;
            this.ddStatements.add(dd);
        }
    }
    
    @Deprecated
    public void addDDStatment(final String ddName, final String dsn, final String options, final boolean pass) throws BuildException {
        this.addDDStatement(new DDStatement().name(ddName).dsn(dsn).options(options).pass(pass));
    }
    
    public void addDDStatement(final String ddName, final String dsn, final String options, final boolean pass) throws BuildException {
        this.addDDStatement(new DDStatement().name(ddName).dsn(dsn).options(options).pass(pass));
    }
    
    public void addAllDDStatements(final List<DDStatement> dds) throws BuildException {
        for (final DDStatement dd : dds) {
            this.addDDStatement(dd);
        }
    }
    
    public List<DDStatement> getDDStatements() {
        return this.ddStatements;
    }
    
    private void setTempDDNameIfNeeded(final DDStatement dd) {
        if (dd.getName() == null) {
            dd.setName(TempDDAssignment.getNextTempDDName());
        }
    }
    
    public void setFile(final String file) {
        this.file = file;
    }
    
    public String getFile() {
        return this.file;
    }
    
    public AbstractExec dd(final DDStatement dd) throws BuildException {
        this.addDDStatement(dd);
        return this;
    }
    
    protected ExecuteRecord createReportRecord() {
        final ExecuteRecord execRecord = new ExecuteRecord();
        execRecord.setFile(this.file);
        for (final DDStatement dd : this.ddStatements) {
            if (dd.isOutput()) {
                if (dd.getDsn() != null && !dd.getDsn().isEmpty()) {
                    final String outputDsn = dd.getDsn();
                    final String outputDeployType = dd.getDeployType();
                    execRecord.addOutput(outputDsn, outputDeployType);
                }
                else {
                    if (dd.getPath() == null || dd.getPath().isEmpty()) {
                        continue;
                    }
                    final String outputDsn = dd.getPath();
                    final String outputDeployType = dd.getDeployType();
                    execRecord.addOutput(outputDsn, outputDeployType);
                }
            }
            else {
                if (!dd.isReport()) {
                    continue;
                }
                if (dd.getDsn() != null && !dd.getDsn().isEmpty()) {
                    execRecord.addDataset(dd.getDsn());
                }
                else {
                    if (dd.getPath() == null || dd.getPath().isEmpty()) {
                        continue;
                    }
                    execRecord.addDataset(dd.getPath());
                }
            }
        }
        return execRecord;
    }
    
    protected void debug(final String message) {
        AbstractExec.logger.debug(message);
    }
    
    protected void debug(final String message, final Throwable t) {
        AbstractExec.logger.debug(message, t);
    }
}
