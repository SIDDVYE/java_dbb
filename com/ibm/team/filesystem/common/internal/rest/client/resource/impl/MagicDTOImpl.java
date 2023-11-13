// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.MagicDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class MagicDTOImpl extends EObjectImpl implements MagicDTO
{
    protected int ALL_FLAGS;
    protected static final String PATTERN_EDEFAULT;
    protected String pattern;
    protected static final int PATTERN_ESETFLAG = 1;
    protected static final String ENCODING_EDEFAULT;
    protected String encoding;
    protected static final int ENCODING_ESETFLAG = 2;
    protected static final String MIME_TYPE_EDEFAULT;
    protected String mimeType;
    protected static final int MIME_TYPE_ESETFLAG = 4;
    protected static final String LINE_DELIMITER_EDEFAULT;
    protected String lineDelimiter;
    protected static final int LINE_DELIMITER_ESETFLAG = 8;
    protected static final boolean BUILT_IN_EDEFAULT = false;
    protected static final int BUILT_IN_EFLAG = 16;
    protected static final int BUILT_IN_ESETFLAG = 32;
    protected static final boolean IGNORE_CASE_EDEFAULT = false;
    protected static final int IGNORE_CASE_EFLAG = 64;
    protected static final int IGNORE_CASE_ESETFLAG = 128;
    
    static {
        PATTERN_EDEFAULT = null;
        ENCODING_EDEFAULT = null;
        MIME_TYPE_EDEFAULT = null;
        LINE_DELIMITER_EDEFAULT = null;
    }
    
    protected MagicDTOImpl() {
        this.ALL_FLAGS = 0;
        this.pattern = MagicDTOImpl.PATTERN_EDEFAULT;
        this.encoding = MagicDTOImpl.ENCODING_EDEFAULT;
        this.mimeType = MagicDTOImpl.MIME_TYPE_EDEFAULT;
        this.lineDelimiter = MagicDTOImpl.LINE_DELIMITER_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.MAGIC_DTO;
    }
    
    public String getPattern() {
        return this.pattern;
    }
    
    public void setPattern(final String newPattern) {
        final String oldPattern = this.pattern;
        this.pattern = newPattern;
        final boolean oldPatternESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldPattern, (Object)this.pattern, !oldPatternESet));
        }
    }
    
    public void unsetPattern() {
        final String oldPattern = this.pattern;
        final boolean oldPatternESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.pattern = MagicDTOImpl.PATTERN_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldPattern, (Object)MagicDTOImpl.PATTERN_EDEFAULT, oldPatternESet));
        }
    }
    
    public boolean isSetPattern() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getEncoding() {
        return this.encoding;
    }
    
    public void setEncoding(final String newEncoding) {
        final String oldEncoding = this.encoding;
        this.encoding = newEncoding;
        final boolean oldEncodingESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldEncoding, (Object)this.encoding, !oldEncodingESet));
        }
    }
    
    public void unsetEncoding() {
        final String oldEncoding = this.encoding;
        final boolean oldEncodingESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.encoding = MagicDTOImpl.ENCODING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldEncoding, (Object)MagicDTOImpl.ENCODING_EDEFAULT, oldEncodingESet));
        }
    }
    
    public boolean isSetEncoding() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getMimeType() {
        return this.mimeType;
    }
    
    public void setMimeType(final String newMimeType) {
        final String oldMimeType = this.mimeType;
        this.mimeType = newMimeType;
        final boolean oldMimeTypeESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldMimeType, (Object)this.mimeType, !oldMimeTypeESet));
        }
    }
    
    public void unsetMimeType() {
        final String oldMimeType = this.mimeType;
        final boolean oldMimeTypeESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.mimeType = MagicDTOImpl.MIME_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldMimeType, (Object)MagicDTOImpl.MIME_TYPE_EDEFAULT, oldMimeTypeESet));
        }
    }
    
    public boolean isSetMimeType() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public String getLineDelimiter() {
        return this.lineDelimiter;
    }
    
    public void setLineDelimiter(final String newLineDelimiter) {
        final String oldLineDelimiter = this.lineDelimiter;
        this.lineDelimiter = newLineDelimiter;
        final boolean oldLineDelimiterESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldLineDelimiter, (Object)this.lineDelimiter, !oldLineDelimiterESet));
        }
    }
    
    public void unsetLineDelimiter() {
        final String oldLineDelimiter = this.lineDelimiter;
        final boolean oldLineDelimiterESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.lineDelimiter = MagicDTOImpl.LINE_DELIMITER_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldLineDelimiter, (Object)MagicDTOImpl.LINE_DELIMITER_EDEFAULT, oldLineDelimiterESet));
        }
    }
    
    public boolean isSetLineDelimiter() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public boolean isBuiltIn() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public void setBuiltIn(final boolean newBuiltIn) {
        final boolean oldBuiltIn = (this.ALL_FLAGS & 0x10) != 0x0;
        if (newBuiltIn) {
            this.ALL_FLAGS |= 0x10;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFEF;
        }
        final boolean oldBuiltInESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, oldBuiltIn, newBuiltIn, !oldBuiltInESet));
        }
    }
    
    public void unsetBuiltIn() {
        final boolean oldBuiltIn = (this.ALL_FLAGS & 0x10) != 0x0;
        final boolean oldBuiltInESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, oldBuiltIn, false, oldBuiltInESet));
        }
    }
    
    public boolean isSetBuiltIn() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public boolean isIgnoreCase() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public void setIgnoreCase(final boolean newIgnoreCase) {
        final boolean oldIgnoreCase = (this.ALL_FLAGS & 0x40) != 0x0;
        if (newIgnoreCase) {
            this.ALL_FLAGS |= 0x40;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFBF;
        }
        final boolean oldIgnoreCaseESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS |= 0x80;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldIgnoreCase, newIgnoreCase, !oldIgnoreCaseESet));
        }
    }
    
    public void unsetIgnoreCase() {
        final boolean oldIgnoreCase = (this.ALL_FLAGS & 0x40) != 0x0;
        final boolean oldIgnoreCaseESet = (this.ALL_FLAGS & 0x80) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldIgnoreCase, false, oldIgnoreCaseESet));
        }
    }
    
    public boolean isSetIgnoreCase() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getPattern();
            }
            case 1: {
                return this.getEncoding();
            }
            case 2: {
                return this.getMimeType();
            }
            case 3: {
                return this.getLineDelimiter();
            }
            case 4: {
                return this.isBuiltIn() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 5: {
                return this.isIgnoreCase() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setPattern((String)newValue);
            }
            case 1: {
                this.setEncoding((String)newValue);
            }
            case 2: {
                this.setMimeType((String)newValue);
            }
            case 3: {
                this.setLineDelimiter((String)newValue);
            }
            case 4: {
                this.setBuiltIn((boolean)newValue);
            }
            case 5: {
                this.setIgnoreCase((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetPattern();
            }
            case 1: {
                this.unsetEncoding();
            }
            case 2: {
                this.unsetMimeType();
            }
            case 3: {
                this.unsetLineDelimiter();
            }
            case 4: {
                this.unsetBuiltIn();
            }
            case 5: {
                this.unsetIgnoreCase();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetPattern();
            }
            case 1: {
                return this.isSetEncoding();
            }
            case 2: {
                return this.isSetMimeType();
            }
            case 3: {
                return this.isSetLineDelimiter();
            }
            case 4: {
                return this.isSetBuiltIn();
            }
            case 5: {
                return this.isSetIgnoreCase();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (pattern: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.pattern);
        }
        else {
            result.append("<unset>");
        }
        result.append(", encoding: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.encoding);
        }
        else {
            result.append("<unset>");
        }
        result.append(", mimeType: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.mimeType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", lineDelimiter: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.lineDelimiter);
        }
        else {
            result.append("<unset>");
        }
        result.append(", builtIn: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append((this.ALL_FLAGS & 0x10) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", ignoreCase: ");
        if ((this.ALL_FLAGS & 0x80) != 0x0) {
            result.append((this.ALL_FLAGS & 0x40) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
