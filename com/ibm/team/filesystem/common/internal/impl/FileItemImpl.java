// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import com.ibm.team.repository.common.util.NLS;
import com.ibm.team.filesystem.common.internal.IFileItemProperties;
import java.util.ArrayList;
import org.eclipse.core.runtime.IStatus;
import com.ibm.team.filesystem.common.internal.Messages;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.internal.VersionedContent;
import com.ibm.team.repository.common.model.Item;
import java.util.Date;
import com.ibm.team.filesystem.common.IFileItem;
import com.ibm.team.filesystem.common.internal.FileItemHandle;
import com.ibm.team.filesystem.common.IFileItemHandle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import com.ibm.team.filesystem.common.IFileContent;
import com.ibm.team.filesystem.common.internal.FileItem;
import com.ibm.team.scm.common.internal.impl.VersionableImpl;

public class FileItemImpl extends VersionableImpl implements FileItem
{
    protected int ALL_FLAGS;
    protected IFileContent content;
    protected static final int CONTENT_ESETFLAG = 4096;
    protected static final boolean EXECUTABLE_EDEFAULT = false;
    protected static final int EXECUTABLE_EFLAG = 8192;
    protected static final int EXECUTABLE_ESETFLAG = 16384;
    private static final String id = "com.ibm.team.filesystem.common";
    private static final int EOFFSET_CORRECTION;
    
    static {
        EOFFSET_CORRECTION = FilesystemPackage.Literals.FILE_ITEM.getFeatureID((EStructuralFeature)FilesystemPackage.Literals.FILE_ITEM__CONTENT) - 19;
    }
    
    protected FileItemImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemPackage.Literals.FILE_ITEM;
    }
    
    public IFileContent getContent() {
        return this.content;
    }
    
    public NotificationChain basicSetContent(final IFileContent newContent, NotificationChain msgs) {
        final IFileContent oldContent = this.content;
        this.content = newContent;
        final boolean oldContentESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 19 + FileItemImpl.EOFFSET_CORRECTION, (Object)oldContent, (Object)newContent, !oldContentESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setContent(final IFileContent newContent) {
        if (newContent != this.content) {
            NotificationChain msgs = null;
            if (this.content != null) {
                msgs = ((InternalEObject)this.content).eInverseRemove((InternalEObject)this, -20 - FileItemImpl.EOFFSET_CORRECTION, (Class)null, msgs);
            }
            if (newContent != null) {
                msgs = ((InternalEObject)newContent).eInverseAdd((InternalEObject)this, -20 - FileItemImpl.EOFFSET_CORRECTION, (Class)null, msgs);
            }
            msgs = this.basicSetContent(newContent, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldContentESet = (this.ALL_FLAGS & 0x1000) != 0x0;
            this.ALL_FLAGS |= 0x1000;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 19 + FileItemImpl.EOFFSET_CORRECTION, (Object)newContent, (Object)newContent, !oldContentESet));
            }
        }
    }
    
    public NotificationChain basicUnsetContent(NotificationChain msgs) {
        final IFileContent oldContent = this.content;
        this.content = null;
        final boolean oldContentESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 19 + FileItemImpl.EOFFSET_CORRECTION, (Object)oldContent, (Object)null, oldContentESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetContent() {
        if (this.content != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.content).eInverseRemove((InternalEObject)this, -20 - FileItemImpl.EOFFSET_CORRECTION, (Class)null, msgs);
            msgs = this.basicUnsetContent(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldContentESet = (this.ALL_FLAGS & 0x1000) != 0x0;
            this.ALL_FLAGS &= 0xFFFFEFFF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 19 + FileItemImpl.EOFFSET_CORRECTION, (Object)null, (Object)null, oldContentESet));
            }
        }
    }
    
    public boolean isSetContent() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public boolean isExecutable() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public void setExecutable(final boolean newExecutable) {
        final boolean oldExecutable = (this.ALL_FLAGS & 0x2000) != 0x0;
        if (newExecutable) {
            this.ALL_FLAGS |= 0x2000;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFDFFF;
        }
        final boolean oldExecutableESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS |= 0x4000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 20 + FileItemImpl.EOFFSET_CORRECTION, oldExecutable, newExecutable, !oldExecutableESet));
        }
    }
    
    public void unsetExecutable() {
        final boolean oldExecutable = (this.ALL_FLAGS & 0x2000) != 0x0;
        final boolean oldExecutableESet = (this.ALL_FLAGS & 0x4000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        this.ALL_FLAGS &= 0xFFFFBFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 20 + FileItemImpl.EOFFSET_CORRECTION, oldExecutable, false, oldExecutableESet));
        }
    }
    
    public boolean isSetExecutable() {
        return (this.ALL_FLAGS & 0x4000) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID - FileItemImpl.EOFFSET_CORRECTION) {
            case 19: {
                return this.basicUnsetContent(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - FileItemImpl.EOFFSET_CORRECTION) {
            case 19: {
                return this.getContent();
            }
            case 20: {
                return this.isExecutable() ? Boolean.TRUE : Boolean.FALSE;
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - FileItemImpl.EOFFSET_CORRECTION) {
            case 19: {
                this.setContent((IFileContent)newValue);
            }
            case 20: {
                this.setExecutable((boolean)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - FileItemImpl.EOFFSET_CORRECTION) {
            case 19: {
                this.unsetContent();
            }
            case 20: {
                this.unsetExecutable();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - FileItemImpl.EOFFSET_CORRECTION) {
            case 19: {
                return this.isSetContent();
            }
            case 20: {
                return this.isSetExecutable();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass == IFileItemHandle.class) {
            return -1;
        }
        if (baseClass == FileItemHandle.class) {
            return -1;
        }
        if (baseClass == IFileItem.class) {
            return -1;
        }
        if (baseClass != FileItem.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - FileItemImpl.EOFFSET_CORRECTION) {
            case 19: {
                return 19 + FileItemImpl.EOFFSET_CORRECTION;
            }
            case 20: {
                return 20 + FileItemImpl.EOFFSET_CORRECTION;
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
        result.append(" (executable: ");
        if ((this.ALL_FLAGS & 0x4000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x2000) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
    
    public Date getFileTimestamp() {
        final String timeStampString = this.getProperties().get("fileTimestamp");
        long timeStamp = 0L;
        if (timeStampString != null && timeStampString.length() > 0) {
            timeStamp = Long.valueOf(timeStampString);
        }
        return new Date(timeStamp);
    }
    
    public void setFileTimestamp(final Date date) {
        this.getProperties().put("fileTimestamp", Long.toString(date.getTime()));
    }
    
    protected void initWorkingCopy(final Item workingCopy) {
        super.initWorkingCopy(workingCopy);
        final FileItem copy = (FileItem)workingCopy;
        final VersionedContent vc = (VersionedContent)copy.getContent();
        vc.setOriginalContainingState((IVersionableHandle)this.getStateHandle());
    }
    
    public String getContentType() {
        return this.getProperties().get("contentType");
    }
    
    public void setContentType(final String contentType) {
        if (contentType == null || contentType.trim().length() == 0) {
            throw new IllegalArgumentException(Messages.getString("FileItemImpl_0"));
        }
        this.getProperties().put("contentType", contentType);
    }
    
    public IStatus validate() {
        final ArrayList<IStatus> errors = new ArrayList<IStatus>();
        final IStatus status = super.validate();
        if (!status.isOK()) {
            if (status.isMultiStatus()) {
                IStatus[] children;
                for (int length = (children = status.getChildren()).length, i = 0; i < length; ++i) {
                    final IStatus child = children[i];
                    errors.add(child);
                }
            }
            else {
                errors.add(status);
            }
        }
        final Map<String, String> properties = (Map<String, String>)this.getProperties();
        int requiredCount = 0;
        for (final String property : properties.keySet()) {
            if (!IFileItemProperties.requiredProperties.contains(property)) {
                if (!property.startsWith("scm") && !property.startsWith("rtc")) {
                    continue;
                }
                errors.add((IStatus)new Status(4, "com.ibm.team.filesystem.common", NLS.bind(Messages.getString("FileItemImpl_2"), (Object)this.getName(), new Object[] { property })));
            }
            else {
                ++requiredCount;
            }
        }
        if (requiredCount != IFileItemProperties.requiredProperties.size()) {
            for (final String requiredProperty : IFileItemProperties.requiredProperties) {
                if (!properties.containsKey(requiredProperty)) {
                    errors.add((IStatus)new Status(4, "com.ibm.team.filesystem.common", NLS.bind(Messages.getString("FileItemImpl_1"), (Object)this.getName(), new Object[] { requiredProperty })));
                }
            }
        }
        final IFileContent fileContent = this.getContent();
        final IStatus contentStatus = fileContent.validate();
        if (!contentStatus.isOK()) {
            if (contentStatus.isMultiStatus()) {
                errors.add((IStatus)new MultiStatus("com.ibm.team.filesystem.common", 4, contentStatus.getChildren(), NLS.bind(Messages.getString("FileItemImpl_3"), (Object)this.getName(), new Object[0]), (Throwable)null));
            }
            else {
                errors.add((IStatus)new Status(4, "com.ibm.team.filesystem.common", NLS.bind(Messages.getString("FileItemImpl_4"), (Object)this.getName(), new Object[] { contentStatus.getMessage() })));
            }
        }
        final String mediaType = this.getContentType();
        final String characterEncoding = fileContent.getCharacterEncoding();
        if (this.isTextType(mediaType) && (characterEncoding == null || characterEncoding.trim().equals(""))) {
            errors.add((IStatus)new Status(4, "com.ibm.team.filesystem.common", NLS.bind(Messages.getString("FileItemImpl_5"), (Object)this.getName(), new Object[0])));
        }
        if (errors.isEmpty()) {
            return Status.OK_STATUS;
        }
        if (errors.size() == 1) {
            return errors.get(0);
        }
        return (IStatus)new MultiStatus("com.ibm.team.filesystem.common", 4, (IStatus[])errors.toArray(new IStatus[errors.size()]), NLS.bind(Messages.getString("FileItemImpl_6"), (Object)this.getName(), new Object[0]), (Throwable)null);
    }
    
    private boolean isTextType(final String mediaType) {
        return mediaType != null && mediaType.trim().toLowerCase(Locale.ENGLISH).startsWith("text");
    }
    
    public Map<String, String> getUserProperties() {
        final Map<String, String> filteredProperties = (Map<String, String>)super.getUserProperties();
        if (filteredProperties.isEmpty()) {
            return filteredProperties;
        }
        final Map<String, String> userProperties = new HashMap<String, String>(filteredProperties);
        userProperties.remove("contentType");
        userProperties.remove("fileTimestamp");
        return Collections.unmodifiableMap((Map<? extends String, ? extends String>)userProperties);
    }
    
    public String removeUserProperty(final String propertyName) {
        if (propertyName.equals("contentType") || propertyName.equals("fileTimestamp")) {
            throw new IllegalArgumentException();
        }
        return super.removeUserProperty(propertyName);
    }
    
    public String setUserProperty(final String propertyName, final String value) {
        if ("contentType".equals(propertyName) || "fileTimestamp".equals(propertyName)) {
            throw new IllegalArgumentException();
        }
        return super.setUserProperty(propertyName, value);
    }
}
