// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.dbb.build.smf;

import com.ibm.jzos.ErrnoException;
import com.ibm.dbb.build.BuildException;
import com.ibm.jzos.ZUtil;
import java.nio.ByteBuffer;
import java.io.UnsupportedEncodingException;
import com.ibm.dbb.build.internal.Utils;
import java.security.InvalidParameterException;
import com.ibm.dbb.build.internal.Messages;
import java.util.Arrays;

public class SmfRecord
{
    private static final int STD_SMFHDR_LEN = 18;
    protected static final int STD_SMFHDR_SUBTYPES_LEN = 24;
    private static final int DEFAULT_INITIAL_LENGTH = 256;
    private static final int SMFHDR_LEN_OFFSET = 0;
    private static final int SMFHDR_SEG_OFFSET = 2;
    private static final int SMFHDR_FLAG_OFFSET = 4;
    private static final int SMFHDR_TYPE_OFFSET = 5;
    private static final int SMFHDR_TIME_OFFSET = 6;
    private static final int SMFHDR_DATE_OFFSET = 10;
    private static final int SMFHDR_SID_OFFSET = 14;
    private static final int SMFHDR_WID_OFFSET = 18;
    private static final int SMFHDR_SUBTYPE_OFFSET = 22;
    private static final String SMFHDR_WID_PADDING = "    ";
    private byte[] _data;
    private int _length;
    private boolean _bReadData;
    
    public SmfRecord(final byte type) {
        this(type, (short)0);
    }
    
    public SmfRecord(final byte type, final short subtype) {
        this._data = null;
        this._length = 0;
        Arrays.fill(this._data = new byte[256], (byte)0);
        this._bReadData = false;
        this._length = ((subtype == 0) ? 18 : 24);
        this.putByte(type, 5);
        if (subtype != 0) {
            this.putShort(subtype, 22);
            this.putByte((byte)(this.getFlag() | 0x40), 4);
        }
    }
    
    public SmfRecord(byte[] data, final boolean bReadData) {
        this._data = null;
        this._length = 0;
        if (data == null) {
            throw new InvalidParameterException(Messages.getMessage("SMF_DATA_REQUIRED"));
        }
        if (bReadData) {
            final byte[] newData = new byte[data.length + 4];
            Arrays.fill(newData, (byte)0);
            System.arraycopy(data, 0, newData, 4, data.length);
            data = newData;
        }
        this._data = data;
        this._length = data.length;
        this._bReadData = bReadData;
        if (this._length < this.getHeaderLength()) {
            throw new InvalidParameterException(Messages.getMessage("SMF_DATA_TOO_SHORT", this.getHeaderLength()));
        }
    }
    
    public byte[] getRecord() {
        return Arrays.copyOf(this._data, this.getLength());
    }
    
    public int getLength() {
        return this._length;
    }
    
    public byte[] getHeader() {
        return this.getData(0, this.getHeaderLength());
    }
    
    public int getHeaderLength() {
        return ((this.getFlag() & 0x40) == 0x0) ? 18 : 24;
    }
    
    public byte getType() {
        return this.getByte(5);
    }
    
    public byte getFlag() {
        return this.getByte(4);
    }
    
    public byte[] getTime() {
        return this.getData(6, 4);
    }
    
    public byte[] getDate() {
        return this.getData(10, 4);
    }
    
    public String getSID() {
        final byte[] sidBytes = this.getData(14, 4);
        String sid = null;
        try {
            sid = new String(sidBytes, Utils.retrieveEncoding());
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return sid;
    }
    
    public String getSegment() {
        String seg = null;
        if (this._bReadData) {
            final byte[] segBytes = this.getData(2, 2);
            try {
                seg = new String(segBytes, Utils.retrieveEncoding());
            }
            catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
        }
        return seg;
    }
    
    public String getWID() {
        String wid = null;
        if ((this.getFlag() & 0x40) != 0x0) {
            final byte[] widBytes = this.getData(18, 4);
            try {
                wid = new String(widBytes, Utils.retrieveEncoding());
            }
            catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
        }
        return wid;
    }
    
    public void setWID(String wid) {
        if ((this.getFlag() & 0x40) != 0x0) {
            try {
                wid = (wid + "    ").substring(0, 4);
                final byte[] widBytes = wid.getBytes(Utils.retrieveEncoding());
                System.arraycopy(widBytes, 0, this._data, 18, 4);
            }
            catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public short getSubType() {
        return (short)(((this.getFlag() & 0x40) == 0x0) ? 0 : this.bytesToShort(this.getData(22, 2)));
    }
    
    @Override
    public String toString() {
        final StringBuffer buffer = new StringBuffer();
        buffer.append("Header:\n");
        buffer.append("\tSMFHDR_Len.....: " + this.getLength() + "\n");
        buffer.append("\tSMFHDR_Seg.....: " + this.getSegment() + "\n");
        buffer.append("\tSMFHDR_Flag....: 0x" + String.format("%02X", this.getFlag()) + "\n");
        buffer.append("\tSMFHDR_Rty.....: " + this.getType() + "\n");
        buffer.append("\tSMFHDR_Time....: " + this.bytesToInt(this.getTime()) + "\n");
        buffer.append("\tSMFHDR_Date....: 0x" + this.bytesToHexString(this.getDate()) + "\n");
        buffer.append("\tSMFHDR_SID.....: " + this.getSID() + "\n");
        if ((this.getFlag() & 0x40) != 0x0) {
            buffer.append("\tSMFHDR_WID.....: " + this.getWID() + "\n");
            buffer.append("\tSMFHDR_STP.....: " + this.getSubType() + "\n");
        }
        return buffer.toString();
    }
    
    protected String bytesToHexString(final byte[] bytes) {
        final StringBuffer buffer = new StringBuffer();
        for (final byte b : bytes) {
            buffer.append(String.format("%02X", b));
        }
        return buffer.toString();
    }
    
    protected int bytesToInt(final byte[] bytes) {
        final ByteBuffer buffer = ByteBuffer.wrap(bytes);
        return buffer.getInt();
    }
    
    protected short bytesToShort(final byte[] bytes) {
        final ByteBuffer buffer = ByteBuffer.wrap(bytes);
        return buffer.getShort();
    }
    
    protected long bytesToLong(final byte[] bytes) {
        final ByteBuffer buffer = ByteBuffer.wrap(bytes);
        return buffer.getLong();
    }
    
    protected void reallocate(final int newLength) {
        if (this._data.length < newLength) {
            this._data = Arrays.copyOf(this._data, Math.max(this._data.length * 2, newLength));
        }
    }
    
    protected void putByte(final byte b) {
        this.putByte(b, this._length);
    }
    
    protected void putByte(final byte b, final int offset) {
        this.reallocate(offset + 1);
        this._data[offset] = b;
        this._length = Math.max(this._length, offset + 1);
    }
    
    protected byte getByte(final int offset) {
        return this._data[offset];
    }
    
    protected void putData(final byte[] bytes) {
        this.putData(bytes, this._length);
    }
    
    protected void putData(final byte[] bytes, final int offset) {
        this.reallocate(offset + bytes.length);
        System.arraycopy(bytes, 0, this._data, offset, bytes.length);
        this._length = Math.max(this._length, offset + bytes.length);
    }
    
    protected void putLong(final long l, final int offset) {
        final ByteBuffer buffer = ByteBuffer.allocate(8);
        buffer.putLong(l);
        this.putData(buffer.array(), offset);
    }
    
    protected void putLong(final long l) {
        this.putLong(l, this._length);
    }
    
    protected long getLong(final int offset) {
        final ByteBuffer buffer = ByteBuffer.wrap(this._data);
        return buffer.getLong(offset);
    }
    
    protected void putInt(final int i, final int offset) {
        final ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.putInt(i);
        this.putData(buffer.array(), offset);
    }
    
    protected void putInt(final int i) {
        this.putInt(i, this._length);
    }
    
    protected int getInt(final int offset) {
        final ByteBuffer buffer = ByteBuffer.wrap(this._data);
        return buffer.getInt(offset);
    }
    
    protected void putShort(final short s, final int offset) {
        final ByteBuffer buffer = ByteBuffer.allocate(2);
        buffer.putShort(s);
        this.putData(buffer.array(), offset);
    }
    
    protected void putShort(final short s) {
        this.putShort(s, this._length);
    }
    
    protected short getShort(final int offset) {
        final ByteBuffer buffer = ByteBuffer.wrap(this._data);
        return buffer.getShort(offset);
    }
    
    protected byte[] getData(final int offset, final int length) {
        return Arrays.copyOfRange(this._data, offset, offset + length);
    }
    
    protected void write() throws BuildException, ErrnoException {
        try {
            ZUtil.smfRecord((int)this.getType(), (int)this.getSubType(), this.getRecord());
        }
        catch (ErrnoException e) {
            throw new BuildException(e.getMessage(), (Throwable)e);
        }
    }
}
