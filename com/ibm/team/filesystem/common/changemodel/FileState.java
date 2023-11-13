// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.changemodel;

import java.util.Collections;
import com.ibm.team.filesystem.common.ISymbolicLink;
import com.ibm.team.scm.common.IFolder;
import java.util.Locale;
import com.ibm.team.internal.repository.rcp.streams.ByteArrayInputStreamProvider;
import com.ibm.team.scm.common.internal.util.ItemId;
import java.util.HashMap;
import com.ibm.team.internal.repository.rcp.streams.EmptyInputStreamProvider;
import com.ibm.team.repository.common.IItemType;
import java.util.Map;
import com.ibm.team.scm.common.internal.util.StateId;
import com.ibm.team.filesystem.common.FileLineDelimiter;
import com.ibm.team.repository.common.utils.IInputStreamProvider;
import java.util.Date;

public final class FileState
{
    public static final String CHARACTER_ENCODING_UNKNOWN = "";
    public static final String FOLDER_TYPE = "inode/directory";
    public static final String SYMBOLICLINK_TYPE = "inode/symboliclink";
    public static final String LINE_DELIMITER_PROPERTY_KEY = " line_delimiter";
    public static final String CONTENT_TYPE_PROPERTY_KEY = " content_type";
    public static final String EXECUTABLE_PROPERTY_KEY = " executable_bit";
    private final Date timestamp;
    private final IInputStreamProvider contents;
    private final VersionablePathSegment path;
    private final String characterEncoding;
    private final boolean isExecutable;
    private final String mimeType;
    private final boolean isTextType;
    private final FileLineDelimiter lineDelimiter;
    private final boolean isDeleted;
    private final StateId theState;
    private final String target;
    private final boolean directoryLink;
    private final Map<String, String> properties;
    
    public static FileState getDeletedState(final IItemType type, VersionablePathSegment path) {
        if (path == null) {
            path = VersionablePathSegment.emptyPath();
        }
        final String contentType = getContentType(type);
        return new FileState(path, new Date(0L), (IInputStreamProvider)EmptyInputStreamProvider.getDefault(), false, contentType, FileLineDelimiter.LINE_DELIMITER_NONE, false, "", true, new HashMap<String, String>(), StateId.getDeletedState(ItemId.getNullItem(type)), null, false);
    }
    
    public static FileState create(final VersionablePathSegment path, final Date timestamp, final IInputStreamProvider contents, final boolean isExecutable, final String mimeType, final FileLineDelimiter delimiter, final boolean isTextType, final String characterEncoding, final boolean isDeleted, final Map<String, String> properties, final StateId stateId) {
        return new FileState(path, timestamp, contents, isExecutable, mimeType, delimiter, isTextType, characterEncoding, isDeleted, properties, stateId, null, false);
    }
    
    public static FileState create(final VersionablePathSegment path, final Date timestamp, final boolean isDeleted, final Map<String, String> properties, final StateId stateId, final String target, final boolean directoryLink) {
        IInputStreamProvider streamProvider;
        if (target == null) {
            streamProvider = (IInputStreamProvider)new ByteArrayInputStreamProvider(new byte[0]);
        }
        else {
            streamProvider = (IInputStreamProvider)new ByteArrayInputStreamProvider(target.getBytes());
        }
        return create(path, timestamp, streamProvider, isDeleted, properties, stateId, target, directoryLink);
    }
    
    public static FileState create(final VersionablePathSegment path, final Date timestamp, final IInputStreamProvider streamProvider, final boolean isDeleted, final Map<String, String> properties, final StateId stateId, final String target, final boolean directoryLink) {
        final String contentType = getContentType(stateId.getItemType());
        String encoding = System.getProperty("file.encoding");
        if (encoding == null) {
            encoding = "";
        }
        return new FileState(path, timestamp, streamProvider, false, contentType, FileLineDelimiter.LINE_DELIMITER_NONE, false, encoding, isDeleted, properties, stateId, target, directoryLink);
    }
    
    public static FileState create(final VersionablePathSegment path, final Date timestamp, final boolean isDeleted, final Map<String, String> properties, final StateId stateId) {
        final String contentType = getContentType(stateId.getItemType());
        return new FileState(path, timestamp, (IInputStreamProvider)EmptyInputStreamProvider.getDefault(), false, contentType, FileLineDelimiter.LINE_DELIMITER_NONE, false, "", isDeleted, properties, stateId, null, false);
    }
    
    private FileState(final VersionablePathSegment path, final Date timestamp, final IInputStreamProvider contents, final boolean isExecutable, final String mimeType, final FileLineDelimiter delimiter, final boolean isTextType, final String characterEncoding, final boolean isDeleted, final Map<String, String> properties, final StateId stateId, final String target, final boolean directoryLink) {
        if (path == null) {
            throw new IllegalArgumentException("path must not be null");
        }
        this.theState = stateId;
        this.timestamp = timestamp;
        this.contents = contents;
        this.path = path;
        this.isExecutable = isExecutable;
        this.mimeType = mimeType;
        this.lineDelimiter = delimiter;
        this.isTextType = (isTextType || isTextType(mimeType));
        this.characterEncoding = ((characterEncoding == null) ? "" : characterEncoding);
        this.isDeleted = isDeleted;
        this.target = target;
        this.directoryLink = directoryLink;
        if (properties != null) {
            (this.properties = new HashMap<String, String>()).putAll(properties);
        }
        else {
            this.properties = null;
        }
    }
    
    public static boolean isTextType(final String mimeType) {
        return mimeType != null && mimeType.toLowerCase(Locale.ENGLISH).startsWith("text");
    }
    
    private static String getContentType(final IItemType type) {
        String contentType = null;
        if (type == IFolder.ITEM_TYPE) {
            contentType = "inode/directory";
        }
        else if (type == ISymbolicLink.ITEM_TYPE) {
            contentType = "inode/symboliclink";
        }
        else {
            contentType = "application/unknown";
        }
        return contentType;
    }
    
    public boolean isFolder() {
        return this.theState.getItemType() == IFolder.ITEM_TYPE;
    }
    
    public boolean isExectuable() {
        return this.isExecutable;
    }
    
    public String getContentType() {
        return this.mimeType;
    }
    
    public FileLineDelimiter getLineDelimiter() {
        return this.lineDelimiter;
    }
    
    public boolean isTextType() {
        return this.isTextType;
    }
    
    public String getCharacterEncoding() {
        return this.characterEncoding;
    }
    
    public VersionablePathSegment getPath() {
        return this.path;
    }
    
    public Date getTimestamp() {
        return this.timestamp;
    }
    
    public IInputStreamProvider getContents() {
        return this.contents;
    }
    
    public boolean isDeleted() {
        return this.isDeleted;
    }
    
    @Override
    public String toString() {
        final String result = "FileState(";
        if (this.isDeleted) {
            return String.valueOf(result) + "deleted)";
        }
        return String.valueOf(result) + "FileState(contents " + this.contents.toString() + ", path= " + this.path + ")";
    }
    
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((this.characterEncoding == null) ? 0 : this.characterEncoding.hashCode());
        result = 31 * result + ((this.contents == null) ? 0 : this.contents.hashCode());
        result = 31 * result + (this.isDeleted ? 1231 : 1237);
        result = 31 * result + (this.isExecutable ? 1231 : 1237);
        result = 31 * result + (this.isTextType ? 1231 : 1237);
        result = 31 * result + ((this.lineDelimiter == null) ? 0 : this.lineDelimiter.hashCode());
        result = 31 * result + ((this.mimeType == null) ? 0 : this.mimeType.hashCode());
        result = 31 * result + ((this.path == null) ? 0 : this.path.hashCode());
        result = 31 * result + ((this.theState == null) ? 0 : this.theState.hashCode());
        result = 31 * result + ((this.timestamp == null) ? 0 : this.timestamp.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final FileState other = (FileState)obj;
        if (this.characterEncoding == null) {
            if (other.characterEncoding != null) {
                return false;
            }
        }
        else if (!this.characterEncoding.equals(other.characterEncoding)) {
            return false;
        }
        if (this.contents == null) {
            if (other.contents != null) {
                return false;
            }
        }
        else if (!this.contents.equals(other.contents)) {
            return false;
        }
        if (this.isDeleted != other.isDeleted) {
            return false;
        }
        if (this.isExecutable != other.isExecutable) {
            return false;
        }
        if (this.isTextType != other.isTextType) {
            return false;
        }
        if (this.lineDelimiter == null) {
            if (other.lineDelimiter != null) {
                return false;
            }
        }
        else if (!this.lineDelimiter.equals(other.lineDelimiter)) {
            return false;
        }
        if (this.mimeType == null) {
            if (other.mimeType != null) {
                return false;
            }
        }
        else if (!this.mimeType.equals(other.mimeType)) {
            return false;
        }
        if (this.path == null) {
            if (other.path != null) {
                return false;
            }
        }
        else if (!this.path.equals(other.path)) {
            return false;
        }
        if (this.theState == null) {
            if (other.theState != null) {
                return false;
            }
        }
        else if (!this.theState.equals((Object)other.theState)) {
            return false;
        }
        if (this.timestamp == null) {
            if (other.timestamp != null) {
                return false;
            }
        }
        else if (!this.timestamp.equals(other.timestamp)) {
            return false;
        }
        return true;
    }
    
    public StateId getStateId() {
        return this.theState;
    }
    
    public String getTarget() {
        return (this.target != null) ? this.target : "";
    }
    
    public boolean isDirectoryLink() {
        return this.directoryLink;
    }
    
    public Map<String, String> getProperties() {
        if (this.properties == null) {
            return null;
        }
        return Collections.unmodifiableMap((Map<? extends String, ? extends String>)this.properties);
    }
    
    public boolean isValidStateId() {
        return !this.getStateId().getItemId().isNull() && (this.isDeleted || !this.getStateId().isDeleted());
    }
}
