// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.resource.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilePropertiesDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class FilePropertiesDTOImpl extends EObjectImpl implements FilePropertiesDTO
{
    protected int ALL_FLAGS;
    protected static final String CONTENT_TYPE_EDEFAULT;
    protected String contentType;
    protected static final int CONTENT_TYPE_ESETFLAG = 1;
    protected static final String LINE_DELIMITER_EDEFAULT;
    protected String lineDelimiter;
    protected static final int LINE_DELIMITER_ESETFLAG = 2;
    protected static final boolean EXECUTABLE_EDEFAULT = false;
    protected static final int EXECUTABLE_EFLAG = 4;
    protected static final int EXECUTABLE_ESETFLAG = 8;
    protected static final String ENCODING_EDEFAULT;
    protected String encoding;
    protected static final int ENCODING_ESETFLAG = 16;
    protected static final String ORIGINAL_CONTENT_TYPE_EDEFAULT;
    protected String originalContentType;
    protected static final int ORIGINAL_CONTENT_TYPE_ESETFLAG = 32;
    protected static final String ORIGINAL_LINE_DELIMITER_EDEFAULT;
    protected String originalLineDelimiter;
    protected static final int ORIGINAL_LINE_DELIMITER_ESETFLAG = 64;
    protected static final boolean ORIGINAL_EXECUTABLE_EDEFAULT = false;
    protected static final int ORIGINAL_EXECUTABLE_EFLAG = 128;
    protected static final int ORIGINAL_EXECUTABLE_ESETFLAG = 256;
    protected static final String ORIGINAL_ENCODING_EDEFAULT;
    protected String originalEncoding;
    protected static final int ORIGINAL_ENCODING_ESETFLAG = 512;
    
    static {
        CONTENT_TYPE_EDEFAULT = null;
        LINE_DELIMITER_EDEFAULT = null;
        ENCODING_EDEFAULT = null;
        ORIGINAL_CONTENT_TYPE_EDEFAULT = null;
        ORIGINAL_LINE_DELIMITER_EDEFAULT = null;
        ORIGINAL_ENCODING_EDEFAULT = null;
    }
    
    protected FilePropertiesDTOImpl() {
        this.ALL_FLAGS = 0;
        this.contentType = FilePropertiesDTOImpl.CONTENT_TYPE_EDEFAULT;
        this.lineDelimiter = FilePropertiesDTOImpl.LINE_DELIMITER_EDEFAULT;
        this.encoding = FilePropertiesDTOImpl.ENCODING_EDEFAULT;
        this.originalContentType = FilePropertiesDTOImpl.ORIGINAL_CONTENT_TYPE_EDEFAULT;
        this.originalLineDelimiter = FilePropertiesDTOImpl.ORIGINAL_LINE_DELIMITER_EDEFAULT;
        this.originalEncoding = FilePropertiesDTOImpl.ORIGINAL_ENCODING_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOresourcePackage.Literals.FILE_PROPERTIES_DTO;
    }
    
    public String getOriginalLineDelimiter() {
        return this.originalLineDelimiter;
    }
    
    public void setOriginalLineDelimiter(final String newOriginalLineDelimiter) {
        final String oldOriginalLineDelimiter = this.originalLineDelimiter;
        this.originalLineDelimiter = newOriginalLineDelimiter;
        final boolean oldOriginalLineDelimiterESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.ALL_FLAGS |= 0x40;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, (Object)oldOriginalLineDelimiter, (Object)this.originalLineDelimiter, !oldOriginalLineDelimiterESet));
        }
    }
    
    public void unsetOriginalLineDelimiter() {
        final String oldOriginalLineDelimiter = this.originalLineDelimiter;
        final boolean oldOriginalLineDelimiterESet = (this.ALL_FLAGS & 0x40) != 0x0;
        this.originalLineDelimiter = FilePropertiesDTOImpl.ORIGINAL_LINE_DELIMITER_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFBF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, (Object)oldOriginalLineDelimiter, (Object)FilePropertiesDTOImpl.ORIGINAL_LINE_DELIMITER_EDEFAULT, oldOriginalLineDelimiterESet));
        }
    }
    
    public boolean isSetOriginalLineDelimiter() {
        return (this.ALL_FLAGS & 0x40) != 0x0;
    }
    
    public String getOriginalContentType() {
        return this.originalContentType;
    }
    
    public void setOriginalContentType(final String newOriginalContentType) {
        final String oldOriginalContentType = this.originalContentType;
        this.originalContentType = newOriginalContentType;
        final boolean oldOriginalContentTypeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.ALL_FLAGS |= 0x20;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldOriginalContentType, (Object)this.originalContentType, !oldOriginalContentTypeESet));
        }
    }
    
    public void unsetOriginalContentType() {
        final String oldOriginalContentType = this.originalContentType;
        final boolean oldOriginalContentTypeESet = (this.ALL_FLAGS & 0x20) != 0x0;
        this.originalContentType = FilePropertiesDTOImpl.ORIGINAL_CONTENT_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFDF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldOriginalContentType, (Object)FilePropertiesDTOImpl.ORIGINAL_CONTENT_TYPE_EDEFAULT, oldOriginalContentTypeESet));
        }
    }
    
    public boolean isSetOriginalContentType() {
        return (this.ALL_FLAGS & 0x20) != 0x0;
    }
    
    public String getLineDelimiter() {
        return this.lineDelimiter;
    }
    
    public void setLineDelimiter(final String newLineDelimiter) {
        final String oldLineDelimiter = this.lineDelimiter;
        this.lineDelimiter = newLineDelimiter;
        final boolean oldLineDelimiterESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldLineDelimiter, (Object)this.lineDelimiter, !oldLineDelimiterESet));
        }
    }
    
    public void unsetLineDelimiter() {
        final String oldLineDelimiter = this.lineDelimiter;
        final boolean oldLineDelimiterESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.lineDelimiter = FilePropertiesDTOImpl.LINE_DELIMITER_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldLineDelimiter, (Object)FilePropertiesDTOImpl.LINE_DELIMITER_EDEFAULT, oldLineDelimiterESet));
        }
    }
    
    public boolean isSetLineDelimiter() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public String getContentType() {
        return this.contentType;
    }
    
    public void setContentType(final String newContentType) {
        final String oldContentType = this.contentType;
        this.contentType = newContentType;
        final boolean oldContentTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldContentType, (Object)this.contentType, !oldContentTypeESet));
        }
    }
    
    public void unsetContentType() {
        final String oldContentType = this.contentType;
        final boolean oldContentTypeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.contentType = FilePropertiesDTOImpl.CONTENT_TYPE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldContentType, (Object)FilePropertiesDTOImpl.CONTENT_TYPE_EDEFAULT, oldContentTypeESet));
        }
    }
    
    public boolean isSetContentType() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public boolean isExecutable() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public void setExecutable(final boolean newExecutable) {
        final boolean oldExecutable = (this.ALL_FLAGS & 0x4) != 0x0;
        if (newExecutable) {
            this.ALL_FLAGS |= 0x4;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFFFB;
        }
        final boolean oldExecutableESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldExecutable, newExecutable, !oldExecutableESet));
        }
    }
    
    public void unsetExecutable() {
        final boolean oldExecutable = (this.ALL_FLAGS & 0x4) != 0x0;
        final boolean oldExecutableESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldExecutable, false, oldExecutableESet));
        }
    }
    
    public boolean isSetExecutable() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getEncoding() {
        return this.encoding;
    }
    
    public void setEncoding(final String newEncoding) {
        final String oldEncoding = this.encoding;
        this.encoding = newEncoding;
        final boolean oldEncodingESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldEncoding, (Object)this.encoding, !oldEncodingESet));
        }
    }
    
    public void unsetEncoding() {
        final String oldEncoding = this.encoding;
        final boolean oldEncodingESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.encoding = FilePropertiesDTOImpl.ENCODING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldEncoding, (Object)FilePropertiesDTOImpl.ENCODING_EDEFAULT, oldEncodingESet));
        }
    }
    
    public boolean isSetEncoding() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public boolean isOriginalExecutable() {
        return (this.ALL_FLAGS & 0x80) != 0x0;
    }
    
    public void setOriginalExecutable(final boolean newOriginalExecutable) {
        final boolean oldOriginalExecutable = (this.ALL_FLAGS & 0x80) != 0x0;
        if (newOriginalExecutable) {
            this.ALL_FLAGS |= 0x80;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFFF7F;
        }
        final boolean oldOriginalExecutableESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS |= 0x100;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 6, oldOriginalExecutable, newOriginalExecutable, !oldOriginalExecutableESet));
        }
    }
    
    public void unsetOriginalExecutable() {
        final boolean oldOriginalExecutable = (this.ALL_FLAGS & 0x80) != 0x0;
        final boolean oldOriginalExecutableESet = (this.ALL_FLAGS & 0x100) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFF7F;
        this.ALL_FLAGS &= 0xFFFFFEFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 6, oldOriginalExecutable, false, oldOriginalExecutableESet));
        }
    }
    
    public boolean isSetOriginalExecutable() {
        return (this.ALL_FLAGS & 0x100) != 0x0;
    }
    
    public String getOriginalEncoding() {
        return this.originalEncoding;
    }
    
    public void setOriginalEncoding(final String newOriginalEncoding) {
        final String oldOriginalEncoding = this.originalEncoding;
        this.originalEncoding = newOriginalEncoding;
        final boolean oldOriginalEncodingESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.ALL_FLAGS |= 0x200;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 7, (Object)oldOriginalEncoding, (Object)this.originalEncoding, !oldOriginalEncodingESet));
        }
    }
    
    public void unsetOriginalEncoding() {
        final String oldOriginalEncoding = this.originalEncoding;
        final boolean oldOriginalEncodingESet = (this.ALL_FLAGS & 0x200) != 0x0;
        this.originalEncoding = FilePropertiesDTOImpl.ORIGINAL_ENCODING_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFDFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 7, (Object)oldOriginalEncoding, (Object)FilePropertiesDTOImpl.ORIGINAL_ENCODING_EDEFAULT, oldOriginalEncodingESet));
        }
    }
    
    public boolean isSetOriginalEncoding() {
        return (this.ALL_FLAGS & 0x200) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getContentType();
            }
            case 1: {
                return this.getLineDelimiter();
            }
            case 2: {
                return this.isExecutable() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 3: {
                return this.getEncoding();
            }
            case 4: {
                return this.getOriginalContentType();
            }
            case 5: {
                return this.getOriginalLineDelimiter();
            }
            case 6: {
                return this.isOriginalExecutable() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 7: {
                return this.getOriginalEncoding();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setContentType((String)newValue);
            }
            case 1: {
                this.setLineDelimiter((String)newValue);
            }
            case 2: {
                this.setExecutable((boolean)newValue);
            }
            case 3: {
                this.setEncoding((String)newValue);
            }
            case 4: {
                this.setOriginalContentType((String)newValue);
            }
            case 5: {
                this.setOriginalLineDelimiter((String)newValue);
            }
            case 6: {
                this.setOriginalExecutable((boolean)newValue);
            }
            case 7: {
                this.setOriginalEncoding((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetContentType();
            }
            case 1: {
                this.unsetLineDelimiter();
            }
            case 2: {
                this.unsetExecutable();
            }
            case 3: {
                this.unsetEncoding();
            }
            case 4: {
                this.unsetOriginalContentType();
            }
            case 5: {
                this.unsetOriginalLineDelimiter();
            }
            case 6: {
                this.unsetOriginalExecutable();
            }
            case 7: {
                this.unsetOriginalEncoding();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetContentType();
            }
            case 1: {
                return this.isSetLineDelimiter();
            }
            case 2: {
                return this.isSetExecutable();
            }
            case 3: {
                return this.isSetEncoding();
            }
            case 4: {
                return this.isSetOriginalContentType();
            }
            case 5: {
                return this.isSetOriginalLineDelimiter();
            }
            case 6: {
                return this.isSetOriginalExecutable();
            }
            case 7: {
                return this.isSetOriginalEncoding();
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
        result.append(" (contentType: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.contentType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", lineDelimiter: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.lineDelimiter);
        }
        else {
            result.append("<unset>");
        }
        result.append(", executable: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append((this.ALL_FLAGS & 0x4) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", encoding: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.encoding);
        }
        else {
            result.append("<unset>");
        }
        result.append(", originalContentType: ");
        if ((this.ALL_FLAGS & 0x20) != 0x0) {
            result.append(this.originalContentType);
        }
        else {
            result.append("<unset>");
        }
        result.append(", originalLineDelimiter: ");
        if ((this.ALL_FLAGS & 0x40) != 0x0) {
            result.append(this.originalLineDelimiter);
        }
        else {
            result.append("<unset>");
        }
        result.append(", originalExecutable: ");
        if ((this.ALL_FLAGS & 0x100) != 0x0) {
            result.append((this.ALL_FLAGS & 0x80) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(", originalEncoding: ");
        if ((this.ALL_FLAGS & 0x200) != 0x0) {
            result.append(this.originalEncoding);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
