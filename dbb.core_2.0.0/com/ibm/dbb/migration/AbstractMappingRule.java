// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.migration;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.Map;
import java.io.File;

public abstract class AbstractMappingRule implements IMappingRule
{
    protected File repository;
    protected Map<String, String> attributes;
    private Pattern datasetMemberPattern;
    
    public AbstractMappingRule(final File repository, final Map<String, String> attributes) {
        this.datasetMemberPattern = null;
        this.repository = repository;
        this.attributes = new HashMap<String, String>();
        if (attributes != null) {
            this.attributes.putAll(attributes);
        }
    }
    
    protected boolean isIncludedMember(final String dataset) {
        if (this.datasetMemberPattern == null) {
            this.datasetMemberPattern = Pattern.compile(".*\\((.*[a-zA-Z].*)\\)");
        }
        final Matcher matcher = this.datasetMemberPattern.matcher(dataset);
        return matcher.matches();
    }
    
    protected String[] parseDatasetMember(final String dataset) {
        final int memberStartIndex = dataset.indexOf("(");
        final int memberEndIndex = dataset.lastIndexOf(")");
        final String pds = dataset.substring(0, memberStartIndex);
        final String member = dataset.substring(memberStartIndex + 1, memberEndIndex);
        return new String[] { pds, member };
    }
    
    protected boolean isSimpleStringPattern(final String member) {
        return member.contains("*") || member.contains("?");
    }
    
    protected boolean isRegexPattern(final String member) {
        return member.toLowerCase().startsWith("regex:");
    }
    
    protected MappingInfo generateMapping(final String dataset, final String member, final String hfsPath) throws IOException {
        return this.generateMapping(dataset, member, hfsPath, null);
    }
    
    protected MappingInfo generateMapping(final String dataset, final String member, final String hfsPath, final String pdsEncoding) throws IOException {
        final MappingInfo mappingInfo = new MappingInfo();
        mappingInfo.setDataset(dataset);
        mappingInfo.setMember(member);
        mappingInfo.setHfsPath(hfsPath);
        if (pdsEncoding != null) {
            mappingInfo.setPdsEncoding(pdsEncoding);
        }
        return mappingInfo;
    }
    
    public String getAttr(final String name) {
        return this.attributes.get(name);
    }
    
    public String getAttr(final String name, final String defaultValue) {
        return this.attributes.containsKey(name) ? this.attributes.get(name) : defaultValue;
    }
    
    public boolean getBooleanAttr(final String name) {
        return Boolean.parseBoolean(this.getAttr(name));
    }
    
    public boolean getBooleanAttr(final String name, final boolean defaultValue) {
        return Boolean.parseBoolean(this.getAttr(name, String.valueOf(defaultValue)));
    }
    
    public File getFileAttr(final String name) {
        final String filePath = this.getAttr(name);
        return (filePath == null) ? null : new File(filePath);
    }
    
    static class CopyInfo
    {
        public String datasetMember;
        public String hfsPath;
        public String pdsEncoding;
    }
}
