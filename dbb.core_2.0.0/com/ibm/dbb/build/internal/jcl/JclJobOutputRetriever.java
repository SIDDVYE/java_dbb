// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal.jcl;

import com.ibm.jzos.ZFile;
import com.ibm.zos.sdsf.core.ISFAllocationEntry;
import com.ibm.zos.sdsf.core.ISFRequestResults;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import com.ibm.zos.sdsf.core.ISFException;
import com.ibm.dbb.build.internal.Messages;
import java.util.Collection;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import com.ibm.dbb.build.internal.Utils;
import java.io.FileOutputStream;
import com.ibm.zos.sdsf.core.ISFStatus;
import com.ibm.zos.sdsf.core.ISFJobDataSet;
import java.util.ArrayList;
import com.ibm.zos.sdsf.core.ISFScrollConstants;
import java.util.HashSet;
import com.ibm.dbb.build.BuildException;
import java.util.Set;
import java.io.File;

public class JclJobOutputRetriever extends SdsfAccess implements ISdsfConstants
{
    public JclJobOutputRetriever(final JclJob job) {
        super(job);
    }
    
    public Set<String> saveOutput(final String ddName, final File file, final String encoding) throws BuildException {
        return this.saveOutput(ddName, file, encoding, false);
    }
    
    public Set<String> saveOutput(final String ddName, final File file, final String encoding, final boolean removeASA) throws BuildException {
        return this.saveOutput(ddName, file, encoding, null, false);
    }
    
    public Set<String> saveOutput(final String ddName, final File file, final String targetEncoding, final String sourceEncoding, final boolean removeASA) throws BuildException {
        final JclDDNameParser parser = new JclDDNameParser(ddName);
        final Set<String> messages = new HashSet<String>();
        final List<ISFStatus> isfStatusList = this.status(null);
        try {
            this.statusRunner.getRequestSettings().addISFScrollType(ISFScrollConstants.Options.TOP);
            final List<ISFJobDataSet> jsdfJobDatasets = new ArrayList<ISFJobDataSet>(3);
            for (final ISFJobDataSet isfJobDataset : isfStatusList.get(0).getJobDataSets()) {
                if ((parser.isAllDDNames() || isfJobDataset.getDDName().equals(parser.getDDName())) && (parser.isAllStepNames() || isfJobDataset.getValue("STEPN").equals(parser.getStepName())) && (parser.isAllProcStepNames() || isfJobDataset.getValue("PROCS").equals(parser.getProcStepName()))) {
                    jsdfJobDatasets.add(isfJobDataset);
                }
            }
            if (jsdfJobDatasets.size() > 0) {
                final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Utils.retrieveEncoding(targetEncoding)));
                final PrintWriter pw = new PrintWriter(bw);
                for (final ISFJobDataSet jsdfJobDataset : jsdfJobDatasets) {
                    if (jsdfJobDatasets.size() > 1) {
                        final String qualifiedName = jsdfJobDataset.getDDName() + ":" + jsdfJobDataset.getValue("STEPN") + ":" + jsdfJobDataset.getValue("PROCS");
                        pw.println();
                        pw.println("***" + qualifiedName + "*****************************************************************************");
                        pw.println();
                    }
                    jsdfJobDataset.browseAllocate();
                    final ISFRequestResults results = this.statusRunner.getRequestResults();
                    messages.addAll(results.getMessageList());
                    this.printResponseList(results, pw, sourceEncoding, removeASA);
                }
                bw.close();
            }
        }
        catch (ISFException e) {
            throw new BuildException(Messages.getMessage("JobStatusRetriever_INTERNAL_ERROR", e.getMessage()), (Throwable)e);
        }
        catch (IOException e2) {
            throw new BuildException(Messages.getMessage("SdsfAccess_ERROR_WRITE_TO_FILE", file.getAbsolutePath(), e2.getMessage()), e2);
        }
        return messages;
    }
    
    private void printResponseList(final ISFRequestResults results, final PrintWriter pw, final String sourceEncoding, final boolean removeASA) throws IOException {
        final List<ISFAllocationEntry> allocList = (List<ISFAllocationEntry>)results.getAllocationList();
        if (allocList != null) {
            for (final ISFAllocationEntry allocEntry : allocList) {
                this.doRead(allocEntry.getDDName(), pw, sourceEncoding, removeASA);
            }
        }
    }
    
    private void doRead(final String ddname, final PrintWriter pw, final String sourceEncoding, final boolean removeASA) throws IOException {
        final String ddspec = "//DD:" + ddname;
        final ZFile zFile = new ZFile(ddspec, "rb,type=record,noseek");
        try {
            final byte[] recBuf = new byte[zFile.getLrecl()];
            final String encoding = Utils.retrieveEncoding(sourceEncoding);
            int nRead;
            while ((nRead = zFile.read(recBuf)) >= 0) {
                final String line = new String(recBuf, 0, nRead, encoding);
                pw.println(removeASA ? line.substring(1) : line);
                pw.flush();
            }
        }
        finally {
            zFile.close();
        }
    }
    
    public JclJobOutputRetriever traceEnabled(final boolean value) {
        this.setTraceEnabled(value);
        return this;
    }
}
