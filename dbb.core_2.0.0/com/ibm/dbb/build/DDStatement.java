// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build;

import java.io.File;
import com.ibm.dbb.build.internal.Messages;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class DDStatement
{
    private String name;
    private String dsn;
    private String path;
    private String ddref;
    private String options;
    private boolean pass;
    private boolean output;
    private boolean report;
    private String instreamData;
    private String deployType;
    private List<DDStatement> concatenations;
    
    public DDStatement() {
        this.concatenations = new ArrayList<DDStatement>();
    }
    
    public DDStatement(final DDStatement dd) {
        this.name = dd.getName();
        this.dsn = dd.getDsn();
        this.path = dd.getPath();
        this.ddref = dd.getDDref();
        this.options = dd.getOptions();
        this.pass = dd.isPass();
        this.output = dd.isOutput();
        this.report = dd.isReport();
        this.instreamData = dd.getInstreamData();
        this.deployType = dd.getDeployType();
        (this.concatenations = new ArrayList<DDStatement>()).addAll(dd.getConcatenations());
    }
    
    public List<DDStatement> getConcatenations() {
        return this.concatenations;
    }
    
    public void addConcatenation(final DDStatement dd) {
        this.concatenations.add(dd);
    }
    
    public void addConcatenation(final String dsn, final String options) {
        this.concatenations.add(new DDStatement().dsn(dsn).options(options));
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public String getDsn() {
        return this.dsn;
    }
    
    public void setDsn(final String dsn) {
        if ((this.getPath() != null && !this.getPath().isEmpty()) || (this.getDDref() != null && !this.getDDref().isEmpty())) {
            throw new IllegalArgumentException(Messages.getMessage("DDStatementPathDsnDDrefMutuallyExclusive"));
        }
        this.dsn = dsn;
    }
    
    public void setPath(final String path) {
        if ((this.getDsn() != null && !this.getDsn().isEmpty()) || (this.getDDref() != null && !this.getDDref().isEmpty())) {
            throw new IllegalArgumentException(Messages.getMessage("DDStatementPathDsnDDrefMutuallyExclusive"));
        }
        if (!new File(path).exists()) {
            throw new IllegalArgumentException(Messages.getMessage("DDStatementPathFileDoesNotExist"));
        }
        this.path = path;
    }
    
    public String getPath() {
        return this.path;
    }
    
    public String getOptions() {
        return this.options;
    }
    
    public void setOptions(final String options) {
        this.options = options;
    }
    
    public boolean isPass() {
        return this.pass;
    }
    
    public void setPass(final boolean pass) {
        this.pass = pass;
    }
    
    public boolean isOutput() {
        return this.output;
    }
    
    public void setOutput(final boolean output) {
        this.output = output;
    }
    
    public boolean isReport() {
        return this.report;
    }
    
    public String getInstreamData() {
        return this.instreamData;
    }
    
    public void setInstreamData(final String instreamData) {
        this.instreamData = instreamData;
    }
    
    public String getDeployType() {
        return this.deployType;
    }
    
    public void setDeployType(final String deployType) {
        this.deployType = deployType;
    }
    
    public void setReport(final boolean report) {
        this.report = report;
    }
    
    public DDStatement name(final String name) {
        this.setName(name);
        return this;
    }
    
    public DDStatement dsn(final String dsn) {
        this.setDsn(dsn);
        return this;
    }
    
    public DDStatement path(final String path) {
        this.setPath(path);
        return this;
    }
    
    public DDStatement options(final String options) {
        this.setOptions(options);
        return this;
    }
    
    public DDStatement pass(final boolean pass) {
        this.setPass(pass);
        return this;
    }
    
    public DDStatement output(final boolean output) {
        this.setOutput(output);
        return this;
    }
    
    public DDStatement report(final boolean report) {
        this.setReport(report);
        return this;
    }
    
    public DDStatement instreamData(final String instreamData) {
        this.setInstreamData(instreamData);
        return this;
    }
    
    public DDStatement concatenate(final DDStatement statement) {
        this.addConcatenation(statement);
        return this;
    }
    
    public DDStatement deployType(final String deployType) {
        this.deployType = deployType;
        return this;
    }
    
    public String getDDref() {
        return this.ddref;
    }
    
    public void setDDref(final String ddref) {
        if ((this.getDsn() != null && !this.getDsn().isEmpty()) || (this.getPath() != null && !this.getPath().isEmpty())) {
            throw new IllegalArgumentException(Messages.getMessage("DDStatementPathDsnDDrefMutuallyExclusive"));
        }
        this.ddref = ddref;
    }
    
    public DDStatement ddref(final String ddref) {
        this.setDDref(ddref);
        return this;
    }
}
