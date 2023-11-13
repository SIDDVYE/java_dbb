// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.internal;

import java.util.List;
import java.io.InputStream;
import com.ibm.jzos.ZFileException;
import java.io.FileNotFoundException;
import java.io.File;
import com.ibm.dbb.build.internal.jni.Executable;
import java.io.IOException;
import com.ibm.dbb.build.BuildException;
import com.ibm.jzos.ZFile;
import com.ibm.dbb.build.DDStatement;

public class JzosDDProcess extends AbstractDDProcess implements DDProcess
{
    private static final String IN_STREAM_DD_WRITE_OPTIONS = "wb,type=record,recfm=fb,lrecl=80,noseek";
    
    @Override
    public int allocateDDForInstreamData(final DDStatement dd) throws BuildException {
        final String inStreamData = dd.getInstreamData();
        if (inStreamData == null) {
            return -1;
        }
        try {
            final ZFile zFileOut = new ZFile("//DD:" + dd.getName(), "wb,type=record,recfm=fb,lrecl=80,noseek");
            return this.saveInstreamDataToOutputStream(inStreamData, zFileOut.getOutputStream(), zFileOut.getLrecl());
        }
        catch (IOException e) {
            throw new BuildException(e);
        }
    }
    
    @Override
    public int executeMvsPgm(final String pgm, final String parm, final String ddNames, final boolean attachx) throws BuildException {
        return new Executable().compile(pgm, parm, ddNames, attachx);
    }
    
    @Override
    protected int bpxwdyn(final String command) throws BuildException {
        Utils.bpxwdyn(command);
        return 0;
    }
    
    @Override
    public final boolean supportMultiThread() {
        return false;
    }
    
    @Override
    public int copydd(final String ddName, final String ddEncoding, final String readOptions, final File destinationFile, final String fileEncoding, final boolean append, final boolean convertControlCharacters) throws BuildException {
        final String source = Utils.formatDDNameForZFileOperation(ddName);
        final String inEncoding = (ddEncoding == null || ddEncoding.isEmpty()) ? Utils.retrieveEncoding() : ddEncoding;
        final String outEncoding = (fileEncoding == null || fileEncoding.isEmpty()) ? inEncoding : fileEncoding;
        try {
            ZFile zFile = null;
            try {
                zFile = new ZFile(source, readOptions);
            }
            catch (ZFileException e2) {
                throw new FileNotFoundException(source);
            }
            final InputStream ins = convertControlCharacters ? new EBCDICFilterInputStream(zFile.getInputStream()) : zFile.getInputStream();
            Utils.saveContentToFile(ins, destinationFile, inEncoding, outEncoding, append);
        }
        catch (IOException e) {
            throw new BuildException(e);
        }
        return 0;
    }
    
    @Override
    public List<String> getDDNames() throws BuildException {
        return new Executable().getDDNameList();
    }
}
