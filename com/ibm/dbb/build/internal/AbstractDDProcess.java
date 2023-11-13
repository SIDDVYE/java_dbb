// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import org.slf4j.LoggerFactory;
import java.io.IOException;
import com.ibm.jzos.ZUtil;
import java.util.StringTokenizer;
import java.io.OutputStream;
import java.util.Iterator;
import com.ibm.dbb.build.BuildException;
import java.util.ArrayList;
import com.ibm.dbb.build.DDStatement;
import java.util.List;
import org.slf4j.Logger;

public abstract class AbstractDDProcess implements DDProcess, DDProcessConstants
{
    private static Logger logger;
    private List<DDStatement> dds;
    private List<DDStatement> allDDStatements;
    private String globalOptions;
    private static final byte EBCDIC_SPACE = 64;
    
    public AbstractDDProcess() {
        this.dds = new ArrayList<DDStatement>();
    }
    
    protected abstract int bpxwdyn(final String p0) throws BuildException;
    
    @Override
    public List<DDStatement> getDDs() {
        return this.dds;
    }
    
    @Override
    public final int alloc(final List<DDStatement> ddStatements) throws BuildException {
        final int rc = 0;
        this.allDDStatements = ddStatements;
        for (final DDStatement dd : ddStatements) {
            this.alloc(dd);
        }
        return rc;
    }
    
    @Override
    public final int alloc(DDStatement dd) throws BuildException {
        if (this.isReferencedDD(dd)) {
            AbstractDDProcess.logger.debug("DD, " + dd.getName() + ", is not allocated because it is referenced by another DD statement");
            return 0;
        }
        dd = this.handleReferencedDD(dd);
        final int rc = this.bpxwdyn(this.generateAllocCommand(dd));
        if (rc == 0) {
            this.dds.add(dd);
            if (dd.getConcatenations().size() > 0) {
                final List<String> ddNames = new ArrayList<String>(dd.getConcatenations().size() + 1);
                ddNames.add(dd.getName());
                for (DDStatement concatDD : dd.getConcatenations()) {
                    concatDD = this.handleReferencedDD(concatDD);
                    this.bpxwdyn(this.generateAllocCommand(concatDD));
                    if (concatDD.getInstreamData() != null) {
                        this.allocateDDForInstreamData(concatDD);
                    }
                    ddNames.add(concatDD.getName());
                }
                this.bpxwdyn(this.generateConcatCommand(ddNames));
            }
            if (dd.getInstreamData() != null) {
                this.allocateDDForInstreamData(dd);
            }
        }
        return rc;
    }
    
    @Override
    public void free(final String ddName) {
        this.internalFree(ddName);
    }
    
    @Override
    public void free(final DDStatement dd, final boolean force) {
        if ((!dd.isPass() || force) && this.internalFree(dd.getName())) {
            this.removeDD(dd.getName());
        }
        this.freeAllConcatenations(dd, force);
    }
    
    private void freeAllConcatenations(final DDStatement dd, final boolean force) {
        for (final DDStatement concatDD : dd.getConcatenations()) {
            if (!concatDD.isPass()) {
                this.free(concatDD, force);
            }
        }
    }
    
    private boolean removeDD(final String ddName) {
        final int index = this.indexOfDD(ddName);
        if (index == -1) {
            return false;
        }
        this.dds.remove(index);
        return true;
    }
    
    private int indexOfDD(final String ddName) {
        if (ddName != null) {
            for (int i = 0; i < this.dds.size(); ++i) {
                if (ddName.equals(this.dds.get(i).getName())) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    private boolean internalFree(final String ddName) {
        boolean success = false;
        if (ddName != null) {
            try {
                this.bpxwdyn(BpxwdynCommandGenerator.generateFreeCommand(ddName, this.globalOptions));
                success = true;
            }
            catch (BuildException e) {
                AbstractDDProcess.logger.debug("{}", (Throwable)e);
            }
        }
        return success;
    }
    
    @Override
    public void freeAll(final boolean force) {
        final List<DDStatement> freedDDs = new ArrayList<DDStatement>(this.dds.size());
        try {
            for (final DDStatement dd : this.dds) {
                if ((force || !dd.isPass()) && this.internalFree(dd.getName())) {
                    freedDDs.add(dd);
                }
            }
        }
        finally {
            for (final DDStatement freedDD : freedDDs) {
                this.removeDD(freedDD.getName());
                this.freeAllConcatenations(freedDD, false);
            }
        }
    }
    
    protected String generateAllocCommand(final DDStatement dd) {
        return BpxwdynCommandGenerator.generateAllocCommand(dd, this.globalOptions);
    }
    
    protected DDStatement handleReferencedDD(final DDStatement dd) throws BuildException {
        if (this.allDDStatements == null) {
            return dd;
        }
        if (dd.getDDref() == null || dd.getDDref().isEmpty()) {
            return dd;
        }
        DDStatement referenced = null;
        for (final DDStatement ref : this.allDDStatements) {
            if (dd.getDDref().equals(ref.getName())) {
                referenced = ref;
                break;
            }
        }
        if (referenced == null) {
            throw new BuildException(Messages.getMessage("DDStatementReferenceNotFound"));
        }
        return new DDStatement(referenced).name(dd.getName());
    }
    
    protected boolean isReferencedDD(final DDStatement dd) {
        return this.isReferencedDD(dd, this.allDDStatements);
    }
    
    protected boolean isReferencedDD(final DDStatement dd, final List<DDStatement> dds) {
        boolean isReferenced = false;
        if (dds != null) {
            for (final DDStatement ref : dds) {
                if (dd.getName().equals(ref.getDDref()) || this.isReferencedDD(dd, ref.getConcatenations())) {
                    isReferenced = true;
                    break;
                }
            }
        }
        return isReferenced;
    }
    
    protected String generateFreeCommand(final DDStatement dd) {
        return BpxwdynCommandGenerator.generateFreeCommand(dd.getName().trim(), this.globalOptions);
    }
    
    protected String generateConcatCommand(final List<String> ddNames) {
        return BpxwdynCommandGenerator.generateConcatCommand(ddNames, this.globalOptions);
    }
    
    @Override
    public void dispose() {
    }
    
    protected int saveInstreamDataToOutputStream(String inStreamData, final OutputStream os, final int lrecl) throws IOException {
        int totalBytes = 0;
        try {
            AbstractDDProcess.logger.debug("Instream Data: \n" + inStreamData);
            inStreamData = inStreamData.replace("\r", "");
            final StringTokenizer st = new StringTokenizer(inStreamData, "\n");
            final byte[] recBuf = new byte[lrecl];
            while (st.hasMoreTokens()) {
                final String line = st.nextToken();
                final byte[] b = line.getBytes(ZUtil.getDefaultPlatformEncoding());
                final int len = b.length;
                totalBytes += len;
                System.arraycopy(b, 0, recBuf, 0, len);
                for (int i = len; i < lrecl; ++i) {
                    recBuf[i] = 64;
                }
                os.write(recBuf, 0, lrecl);
                os.flush();
            }
        }
        finally {
            os.close();
        }
        return totalBytes;
    }
    
    static {
        AbstractDDProcess.logger = LoggerFactory.getLogger((Class)AbstractDDProcess.class);
    }
}
