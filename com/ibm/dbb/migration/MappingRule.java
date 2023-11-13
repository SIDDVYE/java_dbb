// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.migration;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import com.ibm.jzos.PdsDirectory;
import com.ibm.dbb.build.internal.Utils;
import java.io.IOException;
import java.util.Iterator;
import com.ibm.dbb.build.internal.StringMatcher;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.io.File;

public class MappingRule extends AbstractMappingRule implements IMappingRule
{
    public static final String ATTR_HLQ = "hlq";
    public static final String ATTR_TARGET_DIR = "targetDir";
    public static final String ATTR_TO_LOWER = "toLower";
    public static final String ATTR_EXTENSION = "extension";
    public static final String ATTR_PDS_ENCODING = "pdsEncoding";
    public static final String ATTR_PDS_MAPPING = "pdsMapping";
    public static final String ATTR_TAG_MAPPING = "tagMapping";
    public static final String ATTR_TAG_FILE = "tagFile";
    protected String hlq;
    protected String targetDir;
    protected boolean toLower;
    protected String extension;
    protected String pdsEncoding;
    protected boolean pdsMapping;
    protected boolean tagMapping;
    protected File tagFile;
    private static final Pattern NO_PATTERN;
    
    public MappingRule(final File repository, final Map<String, String> attributes) {
        super(repository, attributes);
        this.hlq = null;
        this.targetDir = null;
        this.toLower = false;
        this.extension = null;
        this.pdsEncoding = null;
        this.pdsMapping = true;
        this.tagMapping = true;
        this.tagFile = null;
        this.hlq = this.getAttr("hlq");
        this.targetDir = this.getAttr("targetDir");
        this.toLower = this.getBooleanAttr("toLower");
        this.extension = this.getAttr("extension");
        this.pdsEncoding = this.getAttr("pdsEncoding");
        this.pdsMapping = this.getBooleanAttr("pdsMapping", true);
        this.tagMapping = this.getBooleanAttr("tagMapping", true);
        this.tagFile = this.getFileAttr("tagFile");
    }
    
    @Override
    public List<MappingInfo> generateMapping(final String selector) throws IOException {
        final List<MappingInfo> mappingInfos = new ArrayList<MappingInfo>();
        final Map<String, List<String>> tagToMembersMap = this.parseTagFile();
        if (tagToMembersMap == null) {
            final String dataset = selector.trim();
            final String fullyQualifiedDataset = (this.hlq == null) ? dataset : (this.hlq + '.' + dataset);
            final boolean isIncludedMember = this.isIncludedMember(fullyQualifiedDataset);
            if (isIncludedMember) {
                final String[] temp = this.parseDatasetMember(fullyQualifiedDataset);
                final String pds = temp[0];
                final String member = temp[1];
                if (this.isRegexPattern(member)) {
                    final String memberRegex = member.substring(6);
                    final Pattern pattern = Pattern.compile(memberRegex, 2);
                    mappingInfos.addAll(this.generateMappings(pds, pattern));
                }
                else if (this.isSimpleStringPattern(member)) {
                    final StringMatcher pattern2 = new StringMatcher(member, true, false);
                    mappingInfos.addAll(this.generateMappings(pds, pattern2));
                }
                else {
                    final String hfsPath = this.convertToHfsFile(pds, member, null);
                    mappingInfos.add(this.generateMapping(pds, member, hfsPath, this.pdsEncoding));
                }
            }
            else {
                mappingInfos.addAll(this.generateMappings(fullyQualifiedDataset, MappingRule.NO_PATTERN));
            }
        }
        else {
            final String tag = selector.trim();
            final List<String> fullyQualifiedMembers = tagToMembersMap.get(tag);
            if (fullyQualifiedMembers != null) {
                for (final String fullyQualifiedMember : fullyQualifiedMembers) {
                    if (fullyQualifiedMember.startsWith(this.hlq)) {
                        final String[] temp2 = this.parseDatasetMember(fullyQualifiedMember);
                        final String pds2 = temp2[0];
                        final String member2 = temp2[1];
                        final String hfsPath2 = this.convertToHfsFile(pds2, member2, tag);
                        mappingInfos.add(this.generateMapping(pds2, member2, hfsPath2, this.pdsEncoding));
                    }
                }
            }
        }
        return mappingInfos;
    }
    
    protected List<MappingInfo> generateMappings(final String dataset, final Pattern memberPatterns) throws IOException {
        final List<MappingInfo> mappingInfos = new ArrayList<MappingInfo>();
        final PdsDirectory pdsDir = new PdsDirectory(Utils.formatDatasetNameForZFileOperation(dataset));
        for (final PdsDirectory.MemberInfo memberInfo : pdsDir) {
            final String member = memberInfo.getName();
            if (memberPatterns == null || memberPatterns.matcher(member).find()) {
                final String hfsPath = this.convertToHfsFile(dataset, member, null);
                mappingInfos.add(this.generateMapping(dataset, member, hfsPath, this.pdsEncoding));
            }
        }
        return mappingInfos;
    }
    
    protected List<MappingInfo> generateMappings(final String dataset, final StringMatcher memberPatterns) throws IOException {
        final List<MappingInfo> mappingInfos = new ArrayList<MappingInfo>();
        final PdsDirectory pdsDir = new PdsDirectory(Utils.formatDatasetNameForZFileOperation(dataset));
        for (final PdsDirectory.MemberInfo memberInfo : pdsDir) {
            final String member = memberInfo.getName();
            if (memberPatterns == null || memberPatterns.match(member)) {
                final String hfsPath = this.convertToHfsFile(dataset, member, null);
                mappingInfos.add(this.generateMapping(dataset, member, hfsPath, this.pdsEncoding));
            }
        }
        return mappingInfos;
    }
    
    protected String convertDatasetToHfsPath(final String dataset, final String tag) {
        String fragment = dataset;
        if (this.hlq != null && dataset.startsWith(this.hlq + '.')) {
            fragment = dataset.replace(this.hlq + '.', "");
        }
        String subDirPath = this.pdsMapping ? fragment.replaceAll("\\.", File.separator) : "";
        subDirPath += ((tag != null && this.tagMapping) ? (File.separator + tag) : "");
        if (this.toLower) {
            subDirPath = subDirPath.toLowerCase();
        }
        if (this.targetDir != null) {
            if (!this.targetDir.endsWith(File.separator)) {
                this.targetDir += File.separator;
            }
            subDirPath = this.targetDir + subDirPath;
        }
        return subDirPath;
    }
    
    protected String getRepositoryPath() {
        String repositoryPath = (this.repository == null) ? "" : this.repository.getAbsolutePath();
        if (!repositoryPath.isEmpty() && !repositoryPath.endsWith(File.separator)) {
            repositoryPath += File.separator;
        }
        return repositoryPath;
    }
    
    protected String getFilename(final String dataset, final String member) {
        String filename = member;
        if (this.extension != null) {
            filename = filename + '.' + this.extension;
        }
        if (this.toLower) {
            filename = filename.toLowerCase();
        }
        return filename;
    }
    
    protected String convertToHfsFile(final String dataset, final String member, final String tag) {
        final StringBuilder absPath = new StringBuilder(this.getRepositoryPath());
        String subDirPath = this.convertDatasetToHfsPath(dataset, tag);
        if (!subDirPath.isEmpty() && !subDirPath.endsWith(File.separator)) {
            subDirPath += File.separator;
        }
        absPath.append(subDirPath).append(this.getFilename(dataset, member));
        return absPath.toString();
    }
    
    private Map<String, List<String>> parseTagFile() {
        if (this.tagFile == null || !this.tagFile.exists()) {
            return null;
        }
        final Map<String, List<String>> tagToMembersMap = new HashMap<String, List<String>>();
        try {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(this.tagFile));
                String line;
                while ((line = br.readLine()) != null) {
                    final String[] segments = line.split(" ");
                    if (segments.length == 2) {
                        final String member = segments[0].trim();
                        final String tag = segments[1].trim();
                        List<String> members = tagToMembersMap.get(tag);
                        if (members == null) {
                            members = new ArrayList<String>();
                            tagToMembersMap.put(tag, members);
                        }
                        members.add(member);
                    }
                }
            }
            finally {
                if (br != null) {
                    br.close();
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return tagToMembersMap;
    }
    
    static {
        NO_PATTERN = null;
    }
}
