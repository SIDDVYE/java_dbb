// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.build.internal.BpxwdynCommandGenerator;
import com.ibm.jzos.ZFileException;
import com.ibm.dbb.build.report.records.Record;
import com.ibm.dbb.build.report.BuildReportFactory;
import com.ibm.jzos.ZFile;
import com.ibm.dbb.build.internal.Utils;
import com.ibm.dbb.build.report.records.CreatePDSRecord;
import com.ibm.dbb.build.internal.Messages;
import org.slf4j.Logger;
import com.ibm.dbb.build.internal.DDProcessConstants;

public class CreatePDS implements IExecute, DDProcessConstants
{
    private static Logger logger;
    private static final String DBB_TEMP = "DBBTEMP";
    private String dataset;
    private String options;
    
    public CreatePDS() {
    }
    
    public CreatePDS(final String dataset, final String options) {
        this.dataset = dataset;
        this.options = options;
    }
    
    public void create() throws BuildException {
        if (this.dataset == null || this.dataset.isEmpty()) {
            throw new BuildException(Messages.getMessage("INVALID_NULL_PARAMETER", "dsn"));
        }
        final CreatePDSRecord record = new CreatePDSRecord();
        record.setDataset(this.dataset);
        record.setOptions(this.options);
        try {
            if (ZFile.dsExists(Utils.formatDatasetNameForZFileOperation(this.dataset))) {
                CreatePDS.logger.debug("Skip creating " + this.dataset + " because it already exists");
                record.setExists(true);
                BuildReportFactory.getBuildReport().addRecord(record);
                return;
            }
        }
        catch (ZFileException zfe) {
            throw new BuildException((Throwable)zfe);
        }
        if (this.options == null || this.options.isEmpty()) {
            this.options = "cyl space(1,1) lrecl(80) dsorg(PO) recfm(F,B) dsntype(library)";
        }
        if (!this.options.contains("new")) {
            this.options = this.options + ' ' + "new";
        }
        if (!this.options.contains("catalog")) {
            this.options = this.options + ' ' + "catalog";
        }
        CreatePDS.logger.debug("Options to create data set '" + this.dataset + "' : " + this.options);
        if (!Utils.isBuildReportOnly()) {
            Utils.bpxwdyn(BpxwdynCommandGenerator.generateAllocCommand(new DDStatement().name("DBBTEMP").dsn(this.dataset).options(this.options), null));
            Utils.bpxwdyn(BpxwdynCommandGenerator.generateFreeCommand("DBBTEMP", null));
        }
        record.setOptions(this.options);
        BuildReportFactory.getBuildReport().addRecord(record);
    }
    
    @Override
    public int execute() throws BuildException {
        this.create();
        return 0;
    }
    
    public String getDataset() {
        return this.dataset;
    }
    
    public void setDataset(final String dataset) {
        this.dataset = dataset;
    }
    
    public String getOptions() {
        return this.options;
    }
    
    public void setOptions(final String options) {
        this.options = options;
    }
    
    public CreatePDS dataset(final String dataset) {
        this.setDataset(dataset);
        return this;
    }
    
    public CreatePDS options(final String options) {
        this.setOptions(options);
        return this;
    }
    
    static {
        CreatePDS.logger = LoggerFactory.getLogger((Class)CreatePDS.class);
    }
}
