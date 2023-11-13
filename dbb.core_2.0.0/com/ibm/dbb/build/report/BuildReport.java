// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.report;

import com.ibm.dbb.dependency.PhysicalDependency;
import com.ibm.dbb.build.report.records.CopyToPDSRecord;
import com.ibm.dbb.build.report.records.ExecuteRecord;
import com.ibm.dbb.build.report.records.VersionRecord;
import java.util.Map;
import com.ibm.dbb.build.report.records.DependencySetRecord;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.ibm.dbb.build.report.records.Reference;
import java.util.Iterator;
import com.ibm.dbb.build.report.records.RecordFactoryManager;
import com.ibm.json.java.JSONArray;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;
import com.ibm.json.java.JSONObject;
import java.io.InputStream;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.internal.Utils;
import java.io.File;
import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import com.ibm.dbb.build.report.record.internal.IRecordFilter;
import com.ibm.dbb.build.report.records.Record;
import java.util.List;

public class BuildReport
{
    public static final String PROP_RECORD = "records";
    protected List<Record> records;
    protected IRecordFilter recordFilter;
    private ReadWriteLock lock;
    private Lock readLock;
    private Lock writeLock;
    
    protected BuildReport() {
        this.recordFilter = null;
        this.lock = new ReentrantReadWriteLock();
        this.readLock = this.lock.readLock();
        this.writeLock = this.lock.writeLock();
        this.records = new ArrayList<Record>();
    }
    
    public List<Record> getRecords() {
        this.readLock.lock();
        try {
            return Collections.unmodifiableList((List<? extends Record>)this.records);
        }
        finally {
            this.readLock.unlock();
        }
    }
    
    public void setRecordFilter(final IRecordFilter recordFilter) {
        this.recordFilter = recordFilter;
    }
    
    public void addRecord(final Record record) {
        this.writeLock.lock();
        try {
            if (this.recordFilter == null || this.recordFilter.shouldAddToReport(record)) {
                this.records.add(record);
            }
        }
        finally {
            this.writeLock.unlock();
        }
    }
    
    public void save(final File outputFile, final String encoding) throws BuildException {
        this.readLock.lock();
        try {
            Utils.createFile(outputFile, this.toJSON().toString(), encoding);
        }
        finally {
            this.readLock.unlock();
        }
    }
    
    public static BuildReport parse(final InputStream inputStream) throws IOException {
        final JSONObject reportObj = JSONObject.parse(inputStream);
        return parse(reportObj);
    }
    
    public static BuildReport parse(final InputStreamReader inputStreamReader) throws IOException {
        final JSONObject reportObj = JSONObject.parse((Reader)inputStreamReader);
        return parse(reportObj);
    }
    
    private static BuildReport parse(final JSONObject reportObj) {
        final BuildReport buildReport = new BuildReport();
        final JSONArray recordsObj = (JSONArray)reportObj.get((Object)"records");
        for (int i = 0; i < recordsObj.size(); ++i) {
            final JSONObject recordObj = (JSONObject)recordsObj.get(i);
            final Record record = RecordFactoryManager.getInstance().parse(recordObj);
            if (record != null) {
                buildReport.addRecord(record);
            }
        }
        return buildReport;
    }
    
    public JSONObject toJSON() {
        final JSONObject reportObj = new JSONObject();
        final JSONArray recordsObj = new JSONArray();
        for (final Record record : this.records) {
            recordsObj.add((Object)record.toJSON());
        }
        reportObj.put((Object)"records", (Object)recordsObj);
        return reportObj;
    }
    
    public Record findRecordFromReference(final Reference reference) {
        for (final Record record : this.records) {
            if (!"REFERENCE".equals(record.getType()) && reference.getRefType().equals(record.getType()) && reference.getRefId().equals(record.getId())) {
                return record;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return this.toJSON().toString();
    }
    
    public void generateHTML(final File htmlFile) throws BuildException, IOException, Exception {
        final StringBuilder htmlContent = new StringBuilder();
        final Map<String, List<Record>> recordMap = new LinkedHashMap<String, List<Record>>();
        final Map<String, List<DependencySetRecord>> dependencyMap = new HashMap<String, List<DependencySetRecord>>();
        VersionRecord versionRecord = null;
        versionRecord = this.collectRecords(recordMap, dependencyMap, versionRecord);
        htmlContent.append("<!DOCTYPE html><!--Licensed Materials - Property of IBM(c) Copyright IBM Corporation 2017, 2019. All Rights Reserved.Note to U.S. Government Users Restricted Rights:Use, duplication or disclosure restricted by GSA ADP ScheduleContract with IBM Corp.--><html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en-us\" lang=\"en-us\" style=\"scroll-behavior: smooth;\"><head><title>IBM Dependency Based Build</title></head>");
        htmlContent.append("<body style=\"font: 14px Arial, sans-serif; margin-left: 20px; margin-bottom: 30px;\"><a href=\"#main-content\">skip to main content</a><main id=\"main-content\">");
        htmlContent.append("<h1 style=\"padding-top:10px;\">Build Report</h1>");
        final String versionHtml = this.generateVersionHTML(versionRecord);
        final String headerHtml = "<table style=\"border-collapse: collapse; border: 1px solid #A9A9A9;\"><tbody><tr><th id=\"sequence\" style=\"border: 1px solid #A9A9A9; padding: 10px;text-align: left; background-color: #ddd;color: black !important;\"></th><th id=\"file\" style=\"border: 1px solid #A9A9A9; padding: 10px;text-align: left; background-color: #ddd;color: black !important;\">File</th><th id=\"commands\" style=\"border: 1px solid #A9A9A9; padding: 10px;text-align: left; background-color: #ddd;color: black !important;\">Commands</th><th id=\"rc\" style=\"border: 1px solid #A9A9A9; padding: 10px;text-align: left; background-color: #ddd;color: black !important;\">RC</th><th id=\"options\" style=\"border: 1px solid #A9A9A9; padding: 10px;text-align: left; background-color: #ddd;color: black !important;\">Options</th><th id=\"dataSets\" style=\"border: 1px solid #A9A9A9; padding: 10px;text-align: left; background-color: #ddd;color: black !important;\">Data Sets</th><th id=\"outputs\" style=\"border: 1px solid #A9A9A9; padding: 10px;text-align: left; background-color: #ddd;color: black !important;\">Outputs</th><th id=\"deployType\" style=\"border: 1px solid #A9A9A9; padding: 10px;text-align: left; background-color: #ddd;color: black !important;\">Deploy Type</th><th id=\"logs\" style=\"border: 1px solid #A9A9A9; padding: 10px;text-align: left; background-color: #ddd;color: black !important;\">Logs</th></tr>";
        int fileCount = 0;
        final StringBuilder tableRowHtml = new StringBuilder();
        final Iterator<Map.Entry<String, List<Record>>> iterator = recordMap.entrySet().iterator();
        while (iterator.hasNext()) {
            ++fileCount;
            final Map.Entry<String, List<Record>> entry = iterator.next();
            final String file = entry.getKey();
            final List<Record> tableRecords = entry.getValue();
            final int numRows = tableRecords.size();
            final String style = "border: 1px solid #A9A9A9; padding: 10px; text-align: left;";
            final String firstSequenceCell = String.format("<td headers=\"sequence\" rowspan=\"" + numRows + "\" style=\"%s\">" + fileCount + "</td>", style);
            final StringBuilder firstHeaderCell = new StringBuilder();
            firstHeaderCell.append("<th id=\"" + file + "\" headers=\"file\" rowspan=\"" + numRows + "\" style=\"border: 1px solid #A9A9A9; padding: 10px;text-align: left; background-color: #ddd;color: black !important;\">" + file);
            final StringBuilder dependencyHtml = this.generateDependecyString(dependencyMap, file);
            firstHeaderCell.append((Object)dependencyHtml + "</th>");
            final String rowHtml = this.generateSubRowHTML(tableRecords, fileCount, file, style, firstSequenceCell, firstHeaderCell);
            tableRowHtml.append(rowHtml);
        }
        final String buildSummary = "<div id=\"buildSummary\"><h2>Build Summary</h2><p>Number of files being built: " + fileCount + "</p></div>";
        htmlContent.append(versionHtml);
        htmlContent.append(buildSummary);
        htmlContent.append(headerHtml);
        htmlContent.append((CharSequence)tableRowHtml);
        htmlContent.append("</tbody></table></main></body></html>");
        Utils.createFile(htmlFile, htmlContent.toString(), "UTF-8");
    }
    
    private VersionRecord collectRecords(final Map<String, List<Record>> recordMap, final Map<String, List<DependencySetRecord>> dependencyMap, VersionRecord versionRecord) {
        for (final Record record : this.records) {
            final String type = record.getType();
            if (type.equals("VERSION")) {
                versionRecord = (VersionRecord)record;
            }
            else if (type.equals("EXECUTE")) {
                final ExecuteRecord executeRecord = (ExecuteRecord)record;
                final String file = executeRecord.getFile();
                List<Record> fileRecordList = recordMap.get(file);
                if (fileRecordList == null) {
                    fileRecordList = new ArrayList<Record>();
                    recordMap.put(file, fileRecordList);
                }
                fileRecordList.add(executeRecord);
            }
            else if (type.equals("COPY_TO_PDS")) {
                final CopyToPDSRecord copyRecord = (CopyToPDSRecord)record;
                final List<CopyToPDSRecord.OutputInfo> outputs = copyRecord.getOutputs();
                if (outputs == null || outputs.size() <= 0) {
                    continue;
                }
                final String file2 = copyRecord.getFile();
                List<Record> fileRecordList2 = recordMap.get(file2);
                if (fileRecordList2 == null) {
                    fileRecordList2 = new ArrayList<Record>();
                    recordMap.put(file2, fileRecordList2);
                }
                fileRecordList2.add(copyRecord);
            }
            else {
                if (!type.equals("DEPENDENCY_SET")) {
                    continue;
                }
                final DependencySetRecord dependencySetRecord = (DependencySetRecord)record;
                final String file = dependencySetRecord.getFile();
                List<DependencySetRecord> dependencyRecordList = dependencyMap.get(file);
                if (dependencyRecordList == null) {
                    dependencyRecordList = new ArrayList<DependencySetRecord>();
                    dependencyMap.put(file, dependencyRecordList);
                }
                dependencyRecordList.add(dependencySetRecord);
            }
        }
        return versionRecord;
    }
    
    private String generateVersionHTML(final VersionRecord versionRecord) {
        final String version = versionRecord.getVersion();
        final String build = versionRecord.getBuild();
        final String date = versionRecord.getDate();
        final String versionHtml = "<div id=\"VersionInfo\"><h2>Toolkit Version:</h2><p><span style=\"float: left;font-weight: bold;width: 5em;margin-left: 20px;\">Version: </span>" + version + "</p><p><span style=\"float: left;font-weight: bold;width: 5em;margin-left: 20px;\">Build: </span>" + build + "</p><p><span style=\"float: left;font-weight: bold;width: 5em;margin-left: 20px;\">Date: </span>" + date + "</p></div>";
        return versionHtml;
    }
    
    private StringBuilder generateDependecyString(final Map<String, List<DependencySetRecord>> dependencyMap, final String file) {
        final StringBuilder dependencyHtml = new StringBuilder();
        final List<DependencySetRecord> dependencyRecords = dependencyMap.get(file);
        if (dependencyRecords != null && dependencyRecords.size() > 0) {
            for (final DependencySetRecord deprec : dependencyRecords) {
                final List<PhysicalDependency> dependencies = deprec.getAllDependencies();
                if (dependencies.size() > 0) {
                    dependencyHtml.append("<details style=\"margin-top: 2px;\"><summary>Dependencies</summary><ul>");
                    for (final PhysicalDependency dep : dependencies) {
                        String depFile;
                        if (dep.isResolved()) {
                            depFile = dep.getFile();
                        }
                        else {
                            depFile = dep.getLname();
                        }
                        final String depCategory = dep.getCategory();
                        dependencyHtml.append("<li>" + depFile + "&#160;<sub style=\"font: 9px Arial, sans-serif;background-color: #81C4E8;\">" + depCategory + "</sub></li>");
                    }
                    dependencyHtml.append("</ul></details>");
                }
            }
        }
        return dependencyHtml;
    }
    
    private String generateSubRowHTML(final List<Record> tableRecords, final int fileCount, final String file, final String style, final String firstSequenceCell, final StringBuilder firstHeaderCell) {
        final StringBuilder rowHtml = new StringBuilder();
        int recordNum = 0;
        final List<File> alreadyLogged = new ArrayList<File>();
        for (final Record record : tableRecords) {
            if (fileCount % 2 == 0) {
                rowHtml.append("<tr style=\"background-color: #f2f2f2;\">");
            }
            else {
                rowHtml.append("<tr>");
            }
            if (++recordNum == 1) {
                rowHtml.append(firstSequenceCell);
                rowHtml.append((CharSequence)firstHeaderCell);
            }
            String command = null;
            String rc = null;
            List<String> datasets = new ArrayList<String>();
            List<ExecuteRecord.OutputInfo> executeOutputs = null;
            List<CopyToPDSRecord.OutputInfo> copyOutputs = null;
            List<File> logFiles = null;
            String options = null;
            if (record.getType().equals("EXECUTE")) {
                final ExecuteRecord execute = (ExecuteRecord)record;
                command = execute.getCommand();
                rc = String.valueOf(execute.getRc());
                datasets = execute.getDatasets();
                executeOutputs = execute.getOutputs();
                logFiles = execute.getLogFiles();
                options = execute.getOptions();
            }
            else {
                final CopyToPDSRecord copy = (CopyToPDSRecord)record;
                command = copy.getCommand();
                rc = String.valueOf(copy.getRc());
                final String ds = copy.getDataset();
                datasets.add(ds);
                copyOutputs = copy.getOutputs();
                logFiles = new ArrayList<File>();
                options = copy.getMode().toString();
            }
            rowHtml.append(String.format("<td headers=\"" + file + " commands\" style=\"%s\">" + command + "</td>", style));
            rowHtml.append(String.format("<td headers=\"" + file + " rc\" style=\"%s\">" + rc + "</td>", style));
            rowHtml.append(String.format("<td headers=\"" + file + " options\" style=\"%s\">" + options + "</td>", style));
            final List<String> outputDatasets = new ArrayList<String>();
            final List<String> deployTypes = new ArrayList<String>();
            if (record.getType().equals("EXECUTE")) {
                rowHtml.append(String.format("<td headers=\"" + file + " dataSets\" style=\"%s\">", style));
                for (final String dataset : datasets) {
                    rowHtml.append(dataset + "<br/>");
                }
                rowHtml.append("</td>");
                for (final ExecuteRecord.OutputInfo output : executeOutputs) {
                    outputDatasets.add(output.dataset);
                    if (output.deployType != null) {
                        deployTypes.add(output.deployType);
                    }
                }
                rowHtml.append(String.format("<td headers=\"" + file + " outputs\" style=\"%s\">", style));
                for (final String outputDataset : outputDatasets) {
                    rowHtml.append(outputDataset + "<br/>");
                }
                rowHtml.append("</td>");
                rowHtml.append(String.format("<td headers=\"" + file + " deployType\" style=\"%s\">", style));
                for (final String deployType : deployTypes) {
                    rowHtml.append(deployType + "<br/>");
                }
                rowHtml.append("</td>");
            }
            else {
                rowHtml.append(String.format("<td headers=\"" + file + " dataSets\" style=\"%s\">" + datasets.get(0) + "</td>", style));
                for (final CopyToPDSRecord.OutputInfo output2 : copyOutputs) {
                    outputDatasets.add(output2.dataset);
                    deployTypes.add(output2.deployType);
                }
                rowHtml.append(String.format("<td headers=\"" + file + " outputs\" style=\"%s\">", style));
                for (final String outputDataset : outputDatasets) {
                    rowHtml.append(outputDataset + "<br/>");
                }
                rowHtml.append("</td>");
                rowHtml.append(String.format("<td headers=\"" + file + " deployType\" style=\"%s\">", style));
                for (final String deployType : deployTypes) {
                    rowHtml.append(deployType + "<br/>");
                }
                rowHtml.append("</td>");
            }
            rowHtml.append(String.format("<td headers=\"" + file + " logs\" style=\"%s\">", style));
            for (final File logFile : logFiles) {
                if (!alreadyLogged.contains(logFile)) {
                    alreadyLogged.add(logFile);
                    rowHtml.append(logFile.getName() + "<br/>");
                }
            }
            rowHtml.append("</td>");
            rowHtml.append("</tr>");
        }
        return rowHtml.toString();
    }
}
