// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.impl;

import java.util.Iterator;
import org.eclipse.core.runtime.MultiStatus;
import com.ibm.team.repository.common.util.NLS;
import org.eclipse.core.runtime.Status;
import java.util.ArrayList;
import org.eclipse.core.runtime.IStatus;
import com.ibm.team.filesystem.common.internal.Messages;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.scm.common.IVersionedContent;
import java.io.UnsupportedEncodingException;
import com.ibm.team.filesystem.common.FileLineDelimiter;
import com.ibm.team.filesystem.common.IFileContent;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import org.eclipse.emf.common.util.EMap;
import com.ibm.team.filesystem.common.internal.FileContent;
import com.ibm.team.scm.common.internal.impl.VersionedContentImpl;

public class FileContentImpl extends VersionedContentImpl implements FileContent
{
    protected int ALL_FLAGS;
    protected static final String CHARACTER_ENCODING_EDEFAULT;
    protected String characterEncoding;
    protected static final int CHARACTER_ENCODING_ESETFLAG = 32;
    protected static final int LINE_DELIMITER_SETTING_EDEFAULT = 0;
    private static final String id = "com.ibm.team.filesystem.common";
    protected int lineDelimiterSetting;
    protected static final int LINE_DELIMITER_SETTING_ESETFLAG = 64;
    protected EMap properties;
    private static final int EOFFSET_CORRECTION;
    
    static {
        CHARACTER_ENCODING_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemPackage.Literals.FILE_CONTENT.getFeatureID((EStructuralFeature)FilesystemPackage.Literals.FILE_CONTENT__CHARACTER_ENCODING) - 5;
    }
    
    protected FileContentImpl() {
        this.ALL_FLAGS = 0;
        this.characterEncoding = FileContentImpl.CHARACTER_ENCODING_EDEFAULT;
        this.lineDelimiterSetting = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemPackage.Literals.FILE_CONTENT;
    }
    
    public String getCharacterEncoding() {
        return this.characterEncoding;
    }
    
    public Map getProperties() {
        if (this.properties == null) {
            this.properties = (EMap)new EcoreEMap.Unsettable(FilesystemPackage.Literals.PROPERTY, (Class)PropertyImpl.class, (InternalEObject)this, 7 + FileContentImpl.EOFFSET_CORRECTION);
        }
        return this.properties.map();
    }
    
    public void unsetProperties() {
        if (this.properties != null) {
            ((InternalEList.Unsettable)this.properties).unset();
        }
    }
    
    public boolean isSetProperties() {
        return this.properties != null && ((InternalEList.Unsettable)this.properties).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID - FileContentImpl.EOFFSET_CORRECTION) {
            case 7: {
                return ((InternalEList)((EMap.InternalMapView)this.getProperties()).eMap()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - FileContentImpl.EOFFSET_CORRECTION) {
            case 5: {
                return this.getCharacterEncoding();
            }
            case 6: {
                return new Integer(this.getLineDelimiterSetting());
            }
            case 7: {
                if (coreType) {
                    return ((EMap.InternalMapView)this.getProperties()).eMap();
                }
                return this.getProperties();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - FileContentImpl.EOFFSET_CORRECTION) {
            case 5: {
                this.setCharacterEncoding((String)newValue);
            }
            case 6: {
                this.setLineDelimiterSetting((int)newValue);
            }
            case 7: {
                ((EStructuralFeature.Setting)((EMap.InternalMapView)this.getProperties()).eMap()).set(newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - FileContentImpl.EOFFSET_CORRECTION) {
            case 5: {
                this.unsetCharacterEncoding();
            }
            case 6: {
                this.unsetLineDelimiterSetting();
            }
            case 7: {
                this.unsetProperties();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - FileContentImpl.EOFFSET_CORRECTION) {
            case 5: {
                return this.isSetCharacterEncoding();
            }
            case 6: {
                return this.isSetLineDelimiterSetting();
            }
            case 7: {
                return this.isSetProperties();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass == IFileContent.class) {
            return -1;
        }
        if (baseClass != FileContent.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - FileContentImpl.EOFFSET_CORRECTION) {
            case 5: {
                return 5 + FileContentImpl.EOFFSET_CORRECTION;
            }
            case 6: {
                return 6 + FileContentImpl.EOFFSET_CORRECTION;
            }
            case 7: {
                return 7 + FileContentImpl.EOFFSET_CORRECTION;
            }
            default: {
                return -1;
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (characterEncoding: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.characterEncoding);
        }
        else {
            result.append("<unset>");
        }
        result.append(", lineDelimiterSetting: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.lineDelimiterSetting);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
    
    public FileLineDelimiter getLineDelimiter() {
        return FileLineDelimiter.getLineDelimiter(this.getLineDelimiterSetting());
    }
    
    public long getRawLength() {
        return this.getSize();
    }
    
    public long getEstimatedConvertedLength() {
        return this.getEstimatedConvertedLength(FileLineDelimiter.getPlatformDelimiter());
    }
    
    public long getEstimatedConvertedLength(final FileLineDelimiter requestedDelimiter) {
        if (this.getLineDelimiter() == FileLineDelimiter.LINE_DELIMITER_PLATFORM && requestedDelimiter != FileLineDelimiter.LINE_DELIMITER_LF) {
            int lineFeedLength = 1;
            final String encoding = this.getCharacterEncoding();
            try {
                if (encoding != null) {
                    lineFeedLength = "\n".getBytes(encoding).length;
                }
            }
            catch (UnsupportedEncodingException ex) {}
            int adjustment = 0;
            switch (requestedDelimiter) {
                case LINE_DELIMITER_CR: {
                    int carriageReturnLength = 1;
                    try {
                        if (encoding != null) {
                            carriageReturnLength = "\r".getBytes(encoding).length;
                        }
                    }
                    catch (UnsupportedEncodingException ex2) {}
                    adjustment = carriageReturnLength - lineFeedLength;
                    break;
                }
                case LINE_DELIMITER_CRLF: {
                    int carriageReturnLineFeedLength = 2;
                    try {
                        if (encoding != null) {
                            carriageReturnLineFeedLength = "\r\n".getBytes(encoding).length;
                        }
                    }
                    catch (UnsupportedEncodingException ex3) {}
                    adjustment = carriageReturnLineFeedLength - lineFeedLength;
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
            return this.getRawLength() + adjustment * this.getLineDelimiterCount();
        }
        return this.getRawLength();
    }
    
    public boolean sameContent(final IFileContent other) {
        if (other == null) {
            return false;
        }
        if (!super.sameContent((IVersionedContent)other)) {
            return false;
        }
        if (this.getCharacterEncoding() == null) {
            if (other.getCharacterEncoding() != null) {
                return false;
            }
        }
        else if (!this.getCharacterEncoding().equals(other.getCharacterEncoding())) {
            return false;
        }
        return this.getLineDelimiter() == other.getLineDelimiter();
    }
    
    public void setCharacterEncoding(final String newCharacterEncoding) {
        final String oldCharacterEncoding = this.characterEncoding;
        this.characterEncoding = newCharacterEncoding;
        final boolean oldCharacterEncodingESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5 + FileContentImpl.EOFFSET_CORRECTION, (Object)oldCharacterEncoding, (Object)this.characterEncoding, !oldCharacterEncodingESet));
        }
    }
    
    public void unsetCharacterEncoding() {
        final String oldCharacterEncoding = this.characterEncoding;
        final boolean oldCharacterEncodingESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.characterEncoding = FileContentImpl.CHARACTER_ENCODING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5 + FileContentImpl.EOFFSET_CORRECTION, (Object)oldCharacterEncoding, (Object)FileContentImpl.CHARACTER_ENCODING_EDEFAULT, oldCharacterEncodingESet));
        }
    }
    
    public boolean isSetCharacterEncoding() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public int getLineDelimiterSetting() {
        return this.lineDelimiterSetting;
    }
    
    public void setLineDelimiterSetting(final int newLineDelimiterSetting) {
        final int oldLineDelimiterSetting = this.lineDelimiterSetting;
        this.lineDelimiterSetting = newLineDelimiterSetting;
        final boolean oldLineDelimiterSettingESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6 + FileContentImpl.EOFFSET_CORRECTION, oldLineDelimiterSetting, this.lineDelimiterSetting, !oldLineDelimiterSettingESet));
        }
    }
    
    public void unsetLineDelimiterSetting() {
        final int oldLineDelimiterSetting = this.lineDelimiterSetting;
        final boolean oldLineDelimiterSettingESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.lineDelimiterSetting = 0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6 + FileContentImpl.EOFFSET_CORRECTION, oldLineDelimiterSetting, 0, oldLineDelimiterSettingESet));
        }
    }
    
    public boolean isSetLineDelimiterSetting() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public void setLineDelimiter(final FileLineDelimiter value) {
        if (value != FileLineDelimiter.LINE_DELIMITER_NONE && value != FileLineDelimiter.LINE_DELIMITER_CR && value != FileLineDelimiter.LINE_DELIMITER_LF && value != FileLineDelimiter.LINE_DELIMITER_CRLF && value != FileLineDelimiter.LINE_DELIMITER_PLATFORM) {
            throw new IllegalArgumentException();
        }
        this.setLineDelimiterSetting(value.dbValue());
    }
    
    public long getLineDelimiterCount() {
        final String lineDelimiterCountValue = this.getProperties().get("numLineDelim");
        long lineDelimiterCount = 0L;
        if (lineDelimiterCountValue != null && lineDelimiterCountValue.trim().length() > 0) {
            lineDelimiterCount = Long.valueOf(lineDelimiterCountValue);
        }
        return lineDelimiterCount;
    }
    
    public void setLineDelimiterCount(final long value) {
        if (value < 0L) {
            throw new IllegalArgumentException(Messages.getString("FileContentImpl_0"));
        }
        this.getProperties().put("numLineDelim", Long.toString(value));
    }
    
    public IStatus validate() {
        final ArrayList<IStatus> errors = new ArrayList<IStatus>();
        final FileLineDelimiter lineDelimiter = this.getLineDelimiter();
        final String encoding = this.getCharacterEncoding();
        final long numLineDelimiters = this.getLineDelimiterCount();
        if (lineDelimiter != FileLineDelimiter.LINE_DELIMITER_NONE && (encoding == null || encoding.trim().length() == 0)) {
            errors.add((IStatus)new Status(4, "com.ibm.team.filesystem.common", Messages.getString("FileContentImpl_1")));
        }
        if (lineDelimiter == FileLineDelimiter.LINE_DELIMITER_NONE && numLineDelimiters != 0L) {
            errors.add((IStatus)new Status(4, "com.ibm.team.filesystem.common", Messages.getString("FileContentImpl_2")));
        }
        for (final String property : this.getProperties().keySet()) {
            if (!property.equals("numLineDelim")) {
                errors.add((IStatus)new Status(4, "com.ibm.team.filesystem.common", NLS.bind(Messages.getString("FileContentImpl_3"), (Object)property, new Object[0])));
            }
        }
        if (errors.isEmpty()) {
            return Status.OK_STATUS;
        }
        if (errors.size() == 1) {
            return errors.get(0);
        }
        return (IStatus)new MultiStatus("com.ibm.team.filesystem.common", 4, (IStatus[])errors.toArray(new IStatus[errors.size()]), Messages.getString("FileContentImpl_4"), (Throwable)null);
    }
}
