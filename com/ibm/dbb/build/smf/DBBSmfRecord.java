// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.smf;

import org.slf4j.LoggerFactory;
import com.ibm.dbb.build.VersionInfo;
import com.ibm.dbb.build.internal.ProductRegistrationChecker;
import java.io.UnsupportedEncodingException;
import com.ibm.dbb.build.BuildException;
import com.ibm.dbb.build.internal.Messages;
import org.slf4j.Logger;
import java.util.Date;

public class DBBSmfRecord extends SmfRecord
{
    private static final byte dbbSMFType = 122;
    private static final short dbbSMFSubType = 2;
    private static final short DBB_SMF_SELF_DEFINING_SECTION_OFFSET = 24;
    private static final short DBB_SMF_SELF_DEFINING_SECTION_NUM_TRIPLETS_OFFSET = 24;
    private static final short DBB_SMF_SELF_DEFINING_SECTION_NUM_TRIPLETS = 1;
    private static final short DBB_SMF_SELF_DEFINING_SECTION_DBB_INFO_TRIPLET_INDEX = 0;
    private static final short DBB_SMF_SELF_DEFINING_SECTION_TRIPLET_OFFSET = 28;
    private static final short DBB_SMF_SELF_DEFINING_SECTION_TRIPLET_OFFSET_OFFSET = 0;
    private static final short DBB_SMF_SELF_DEFINING_SECTION_TRIPLET_LENGTH_OFFSET = 4;
    private static final short DBB_SMF_SELF_DEFINING_SECTION_TRIPLET_COUNT_OFFSET = 6;
    private static final short DBB_SMF_SELF_DEFINING_SECTION_END = 8;
    private static final short DBB_SMF_SELF_DEFINING_SECTION_TRIPLET_LENGTH = 8;
    private static final short DBB_SMF_DBB_INFO_SECTION_OFFSET = 36;
    private static final short DBB_SMF_NAME_LENGTH_OFFSET = 0;
    private static final short DBB_SMF_NAME_OFFSET_OFFSET = 2;
    private static final short DBB_SMF_FEATURE_LENGTH_OFFSET = 4;
    private static final short DBB_SMF_FEATURE_OFFSET_OFFSET = 6;
    private static final short DBB_SMF_PRODID_LENGTH_OFFSET = 8;
    private static final short DBB_SMF_PRODID_OFFSET_OFFSET = 10;
    private static final short DBB_SMF_USERID_LENGTH_OFFSET = 12;
    private static final short DBB_SMF_USERID_OFFSET_OFFSET = 14;
    private static final short DBB_SMF_VERSION_OFFSET = 16;
    private static final short DBB_SMF_RELEASE_OFFSET = 17;
    private static final short DBB_SMF_MOD_OFFSET = 18;
    private static final short DBB_SMF_BUILD_OFFSET = 19;
    private static final short DBB_SMF_TIMESTAMP_OFFSET = 21;
    private static final short DBB_SMF_VARIABLE_INFO_OFFSET = 29;
    private static final short DBB_SMF_DBB_INFO_SECTION_LENGTH = 29;
    private String _productName;
    private String _productFeature;
    private String _productId;
    private String _userid;
    private byte _version;
    private byte _release;
    private byte _mod;
    private short _build;
    private Date _timestamp;
    private static Logger logger;
    
    public DBBSmfRecord() {
        super((byte)122, (short)2);
        this._productName = null;
        this._productFeature = null;
        this._productId = null;
        this._userid = null;
        this._version = -1;
        this._release = -1;
        this._mod = -1;
        this._build = -1;
        this._timestamp = null;
    }
    
    public DBBSmfRecord(final byte[] data) {
        super(data, true);
        this._productName = null;
        this._productFeature = null;
        this._productId = null;
        this._userid = null;
        this._version = -1;
        this._release = -1;
        this._mod = -1;
        this._build = -1;
        this._timestamp = null;
        if (this.getType() != 122) {
            throw new IllegalArgumentException(Messages.getMessage("SMF_TYPE_NOT_CONSISTENT", "type", this.getType(), 122));
        }
        if (this.getSubType() != 2) {
            throw new IllegalArgumentException(Messages.getMessage("SMF_TYPE_NOT_CONSISTENT", "subtype", this.getSubType(), 2));
        }
        this.moveFromRecord();
    }
    
    public void write() throws BuildException {
        this.moveToRecord();
        super.write();
    }
    
    private void moveFromRecord() {
        final Triplet[] triplets = this.getTriplets();
        if (triplets.length != 1) {
            DBBSmfRecord.logger.debug("Triplet count is not expected, " + triplets.length);
        }
        this.moveDBBInfoFromRecord(triplets[0].offset);
    }
    
    private void moveDBBInfoFromRecord(final int dbbInfoOffset) {
        int length = this.getShort(0 + dbbInfoOffset);
        int offset = this.getShort(2 + dbbInfoOffset);
        byte[] data = this.getData(offset, length);
        try {
            this._productName = new String(data, "UTF-8");
        }
        catch (UnsupportedEncodingException ex) {}
        length = this.getShort(4 + dbbInfoOffset);
        offset = this.getShort(6 + dbbInfoOffset);
        data = this.getData(offset, length);
        try {
            this._productFeature = new String(data, "UTF-8");
        }
        catch (UnsupportedEncodingException ex2) {}
        offset += length;
        length = this.getShort(8 + dbbInfoOffset);
        offset = this.getShort(10 + dbbInfoOffset);
        data = this.getData(offset, length);
        try {
            this._productId = new String(data, "UTF-8");
            this._productId = this._productId.trim();
        }
        catch (UnsupportedEncodingException ex3) {}
        length = this.getShort(12 + dbbInfoOffset);
        offset = this.getShort(14 + dbbInfoOffset);
        data = this.getData(offset, length);
        try {
            this._userid = new String(data, "UTF-8");
        }
        catch (UnsupportedEncodingException ex4) {}
        this._version = this.getByte(16 + dbbInfoOffset);
        this._release = this.getByte(17 + dbbInfoOffset);
        this._mod = this.getByte(18 + dbbInfoOffset);
        this._build = this.getShort(19 + dbbInfoOffset);
        this._timestamp = new Date(this.getLong(21 + dbbInfoOffset));
    }
    
    private Triplet[] getTriplets() {
        final short tripletCount = this.getShort(24);
        final Triplet[] triplets = new Triplet[tripletCount];
        int offset = 28;
        for (int i = 0; i < tripletCount; ++i) {
            triplets[i] = new Triplet();
            triplets[i].offset = this.getInt(0 + offset);
            triplets[i].length = this.getShort(4 + offset);
            triplets[i].count = this.getShort(6 + offset);
            offset += 8;
        }
        return triplets;
    }
    
    private void moveToRecord() {
        this.putShort((short)1, 24);
        final int offset = 28;
        this.putInt(36, 0 + offset);
        this.putShort((short)29, 4 + offset);
        this.putShort((short)1, 6 + offset);
        this.moveDBBInfoToRecord((short)36);
    }
    
    private void moveDBBInfoToRecord(final short dbbInfoOffset) {
        short nameLength = 0;
        final short nameOffset = (short)(29 + dbbInfoOffset);
        try {
            final byte[] aProdName = this.getProductName().getBytes("UTF-8");
            nameLength = (short)aProdName.length;
            this.putShort(nameLength, 0 + dbbInfoOffset);
            this.putShort(nameOffset, 2 + dbbInfoOffset);
            this.putData(aProdName, nameOffset);
        }
        catch (UnsupportedEncodingException ex) {}
        short featureLength = 0;
        final short featureOffset = (short)(nameOffset + nameLength);
        try {
            final byte[] aProdFeature = this.getProductFeature().getBytes("UTF-8");
            featureLength = (short)aProdFeature.length;
            this.putShort(featureLength, 4 + dbbInfoOffset);
            this.putShort(featureOffset, 6 + dbbInfoOffset);
            this.putData(aProdFeature, featureOffset);
        }
        catch (UnsupportedEncodingException ex2) {}
        short prodidLength = 0;
        final short prodidOffset = (short)(featureOffset + featureLength);
        try {
            final String id = this.getProductId();
            final byte[] aProdId = id.getBytes("UTF-8");
            prodidLength = (short)aProdId.length;
            this.putShort(prodidLength, 8 + dbbInfoOffset);
            this.putShort(prodidOffset, 10 + dbbInfoOffset);
            this.putData(aProdId, prodidOffset);
        }
        catch (UnsupportedEncodingException ex3) {}
        short useridLength = 0;
        final short useridOffset = (short)(prodidOffset + prodidLength);
        try {
            final byte[] aName = this.getUserid().getBytes("UTF-8");
            useridLength = (short)aName.length;
            this.putShort(useridLength, 12 + dbbInfoOffset);
            this.putShort(useridOffset, 14 + dbbInfoOffset);
            this.putData(aName, useridOffset);
        }
        catch (UnsupportedEncodingException ex4) {}
        this.putByte(this.getVersion(), 16 + dbbInfoOffset);
        this.putByte(this.getRelease(), 17 + dbbInfoOffset);
        this.putByte(this.getMod(), 18 + dbbInfoOffset);
        this.putShort(this.getBuild(), 19 + dbbInfoOffset);
        this.putLong(this.getTimestamp().getTime(), 21 + dbbInfoOffset);
    }
    
    public String getProductName() {
        if (this._productName == null) {
            this._productName = ((ProductRegistrationChecker.getProductInformation() != null) ? ProductRegistrationChecker.getProductInformation().getProductName() : "DBB");
        }
        return this._productName;
    }
    
    public void setProductName(final String productName) {
        this._productName = productName;
    }
    
    public String getProductFeature() {
        if (this._productFeature == null) {
            this._productFeature = ((ProductRegistrationChecker.getProductInformation() != null) ? ProductRegistrationChecker.getProductInformation().getFeatureName() : "DBB");
        }
        return this._productFeature;
    }
    
    public void setProductFeature(final String productFeature) {
        this._productFeature = productFeature;
    }
    
    public String getProductId() {
        if (this._productId == null) {
            this._productId = ((ProductRegistrationChecker.getProductInformation() != null) ? ProductRegistrationChecker.getProductInformation().getProductId() : "5655-AC5");
        }
        return this._productId;
    }
    
    public void setProductId(final String productId) {
        this._productId = productId;
    }
    
    public byte getVersion() {
        if (this._version == -1) {
            final VersionInfo versionInfo = VersionInfo.getInstance();
            this._version = Byte.decode(versionInfo.getVersion().split("\\.")[0]);
        }
        return this._version;
    }
    
    public byte getRelease() {
        if (this._release == -1) {
            final VersionInfo versionInfo = VersionInfo.getInstance();
            this._release = Byte.decode(versionInfo.getVersion().split("\\.")[1]);
        }
        return this._release;
    }
    
    public byte getMod() {
        if (this._mod == -1) {
            final VersionInfo versionInfo = VersionInfo.getInstance();
            this._mod = Byte.decode(versionInfo.getVersion().split("\\.")[2]);
        }
        return this._mod;
    }
    
    public Date getTimestamp() {
        if (this._timestamp == null) {
            this._timestamp = new Date();
        }
        return this._timestamp;
    }
    
    public String getUserid() {
        if (this._userid == null) {
            this._userid = System.getProperty("user.name");
        }
        return this._userid;
    }
    
    public short getBuild() {
        if (this._build == -1) {
            final VersionInfo versionInfo = VersionInfo.getInstance();
            this._build = Short.decode(versionInfo.getBuild());
        }
        return this._build;
    }
    
    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer();
        buffer.append(super.toString());
        buffer.append("DBB data:\n");
        buffer.append("\tProduct Name...: " + this.getProductName() + "\n");
        buffer.append("\tProduct Name...: " + this.getProductName() + "\n");
        buffer.append("\tProduct Feature: " + this.getProductFeature() + "\n");
        buffer.append("\tProduct Id.....: " + this.getProductId() + "\n");
        buffer.append("\tUserid.........: " + this.getUserid() + "\n");
        buffer.append("\tVersion........: " + this.getVersion() + "\n");
        buffer.append("\tRelease........: " + this.getRelease() + "\n");
        buffer.append("\tModification...: " + this.getMod() + "\n");
        buffer.append("\tBuild..........: " + this.getBuild() + "\n");
        buffer.append("\tTimestamp......: " + this.getTimestamp() + "\n");
        return buffer.toString();
    }
    
    static {
        DBBSmfRecord.logger = LoggerFactory.getLogger((Class)DBBSmfRecord.class);
    }
    
    private class Triplet
    {
        int offset;
        short length;
        short count;
        
        private Triplet() {
            this.offset = 0;
            this.length = 0;
            this.count = 0;
        }
    }
}
