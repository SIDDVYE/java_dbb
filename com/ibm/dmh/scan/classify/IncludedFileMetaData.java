// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dmh.scan.classify;

public class IncludedFileMetaData
{
    private static final String copyright = "Licensed Material - Property of IBM\n5724-V27\nCopyright IBM Corp. 2013\nThe source code for this program is not published or otherwise\ndivested of its trade secrets, irrespective of what has been\ndeposited with the U.S. Copyright Office.";
    private String ddName;
    private String fileTypeCd;
    private String inclName;
    private String type;
    
    public IncludedFileMetaData(final String iType, final String iInclName, final String iDdName, final String iFileTypeCd) {
        this.ddName = iDdName;
        this.fileTypeCd = iFileTypeCd;
        this.inclName = iInclName;
        this.type = iType;
    }
    
    public String getDdName() {
        return this.ddName;
    }
    
    public String getFileTypeCd() {
        return this.fileTypeCd;
    }
    
    public String getInclName() {
        return this.inclName;
    }
    
    public String getType() {
        return this.type;
    }
}
