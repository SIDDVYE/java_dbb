// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.metadata;

import java.util.List;
import java.io.InputStream;
import com.ibm.dbb.build.BuildException;

public interface BuildResult extends ManagedObject
{
    public static final int NEW = 0;
    public static final int PROCESSING = 1;
    public static final int COMPLETE = 2;
    public static final int ABANDONED = 3;
    public static final int CLEAN = 0;
    public static final int ERROR = 1;
    public static final int WARNING = 2;
    
    String getGroup();
    
    void setGroup(final String p0) throws BuildException;
    
    String getLabel();
    
    void setLabel(final String p0) throws BuildException;
    
    int getState() throws BuildException;
    
    void setState(final int p0) throws BuildException;
    
    int getStatus() throws BuildException;
    
    void setStatus(final int p0) throws BuildException;
    
    Attachment getBuildReport() throws BuildException;
    
    void setBuildReport(final InputStream p0) throws BuildException;
    
    Attachment getBuildReportData() throws BuildException;
    
    void setBuildReportData(final InputStream p0) throws BuildException;
    
    String getProperty(final String p0) throws BuildException;
    
    List<String> getProperties(final String p0) throws BuildException;
    
    List<String> getPropertyNames() throws BuildException;
    
    void setProperty(final String p0, final String p1) throws BuildException;
    
    void setProperty(final String p0, final List<String> p1) throws BuildException;
    
    void addProperty(final String p0, final String p1) throws BuildException;
    
    void addProperty(final String p0, final List<String> p1) throws BuildException;
    
    void deleteProperty(final String p0) throws BuildException;
    
    void deleteProperty(final String p0, final String p1) throws BuildException;
    
    void addAttachment(final String p0, final InputStream p1) throws BuildException;
    
    void addAttachment(final String p0, final String p1, final InputStream p2) throws BuildException;
    
    Attachment getAttachment(final String p0) throws BuildException;
    
    void deleteAttachment(final String p0) throws BuildException;
    
    List<Attachment> getAttachments() throws BuildException;
    
    public enum QueryParms
    {
        GROUP, 
        LABEL, 
        PROPERTY, 
        VALUE, 
        STATE, 
        STATUS, 
        ORDER_BY, 
        ORDER;
    }
}
