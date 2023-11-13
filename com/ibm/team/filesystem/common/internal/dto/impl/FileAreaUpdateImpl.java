// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.HashMap;
import java.util.Date;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreEMap;
import com.ibm.team.scm.common.internal.impl.PropertyImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import java.util.Map;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.IFileContent;
import org.eclipse.emf.common.util.EMap;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdate;

public class FileAreaUpdateImpl extends BasicChangeImpl implements FileAreaUpdate
{
    protected static final boolean EXECUTABLE_EDEFAULT = false;
    protected static final int EXECUTABLE_EFLAG = 2048;
    protected static final int EXECUTABLE_ESETFLAG = 4096;
    protected EMap properties;
    protected IFileContent optionalContent;
    protected static final int OPTIONAL_CONTENT_ESETFLAG = 8192;
    
    protected FileAreaUpdateImpl() {
    }
    
    @Override
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.FILE_AREA_UPDATE;
    }
    
    @Override
    public IFileContent getOptionalContent() {
        return this.optionalContent;
    }
    
    public NotificationChain basicSetOptionalContent(final IFileContent newOptionalContent, NotificationChain msgs) {
        final IFileContent oldOptionalContent = this.optionalContent;
        this.optionalContent = newOptionalContent;
        final boolean oldOptionalContentESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS |= 0x2000;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 13, (Object)oldOptionalContent, (Object)newOptionalContent, !oldOptionalContentESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    @Override
    public void setOptionalContent(final IFileContent newOptionalContent) {
        if (newOptionalContent != this.optionalContent) {
            NotificationChain msgs = null;
            if (this.optionalContent != null) {
                msgs = ((InternalEObject)this.optionalContent).eInverseRemove((InternalEObject)this, -14, (Class)null, msgs);
            }
            if (newOptionalContent != null) {
                msgs = ((InternalEObject)newOptionalContent).eInverseAdd((InternalEObject)this, -14, (Class)null, msgs);
            }
            msgs = this.basicSetOptionalContent(newOptionalContent, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldOptionalContentESet = (this.ALL_FLAGS & 0x2000) != 0x0;
            this.ALL_FLAGS |= 0x2000;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 13, (Object)newOptionalContent, (Object)newOptionalContent, !oldOptionalContentESet));
            }
        }
    }
    
    public NotificationChain basicUnsetOptionalContent(NotificationChain msgs) {
        final IFileContent oldOptionalContent = this.optionalContent;
        this.optionalContent = null;
        final boolean oldOptionalContentESet = (this.ALL_FLAGS & 0x2000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFDFFF;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 13, (Object)oldOptionalContent, (Object)null, oldOptionalContentESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    @Override
    public void unsetOptionalContent() {
        if (this.optionalContent != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.optionalContent).eInverseRemove((InternalEObject)this, -14, (Class)null, msgs);
            msgs = this.basicUnsetOptionalContent(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldOptionalContentESet = (this.ALL_FLAGS & 0x2000) != 0x0;
            this.ALL_FLAGS &= 0xFFFFDFFF;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 13, (Object)null, (Object)null, oldOptionalContentESet));
            }
        }
    }
    
    @Override
    public boolean isSetOptionalContent() {
        return (this.ALL_FLAGS & 0x2000) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 12: {
                return ((InternalEList)((EMap.InternalMapView)this.getProperties()).eMap()).basicRemove((Object)otherEnd, msgs);
            }
            case 13: {
                return this.basicUnsetOptionalContent(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    @Override
    public boolean isExecutable() {
        return (this.ALL_FLAGS & 0x800) != 0x0;
    }
    
    @Override
    public void setExecutable(final boolean newExecutable) {
        final boolean oldExecutable = (this.ALL_FLAGS & 0x800) != 0x0;
        if (newExecutable) {
            this.ALL_FLAGS |= 0x800;
        }
        else {
            this.ALL_FLAGS &= 0xFFFFF7FF;
        }
        final boolean oldExecutableESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 11, oldExecutable, newExecutable, !oldExecutableESet));
        }
    }
    
    @Override
    public void unsetExecutable() {
        final boolean oldExecutable = (this.ALL_FLAGS & 0x800) != 0x0;
        final boolean oldExecutableESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS &= 0xFFFFF7FF;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 11, oldExecutable, false, oldExecutableESet));
        }
    }
    
    @Override
    public boolean isSetExecutable() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    @Override
    public Map getProperties() {
        if (this.properties == null) {
            this.properties = (EMap)new EcoreEMap.Unsettable(ScmPackage.Literals.PROPERTY, (Class)PropertyImpl.class, (InternalEObject)this, 12);
        }
        return this.properties.map();
    }
    
    @Override
    public void unsetProperties() {
        if (this.properties != null) {
            ((InternalEList.Unsettable)this.properties).unset();
        }
    }
    
    @Override
    public boolean isSetProperties() {
        return this.properties != null && ((InternalEList.Unsettable)this.properties).isSet();
    }
    
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 11: {
                return this.isExecutable() ? Boolean.TRUE : Boolean.FALSE;
            }
            case 12: {
                if (coreType) {
                    return ((EMap.InternalMapView)this.getProperties()).eMap();
                }
                return this.getProperties();
            }
            case 13: {
                return this.getOptionalContent();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 11: {
                this.setExecutable((boolean)newValue);
            }
            case 12: {
                ((EStructuralFeature.Setting)((EMap.InternalMapView)this.getProperties()).eMap()).set(newValue);
            }
            case 13: {
                this.setOptionalContent((IFileContent)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 11: {
                this.unsetExecutable();
            }
            case 12: {
                this.unsetProperties();
            }
            case 13: {
                this.unsetOptionalContent();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 11: {
                return this.isSetExecutable();
            }
            case 12: {
                return this.isSetProperties();
            }
            case 13: {
                return this.isSetOptionalContent();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }
        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (executable: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append((this.ALL_FLAGS & 0x800) != 0x0);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
    
    public String getContentType() {
        return this.getProperties().get("contentType");
    }
    
    public void setContentType(final String contentType) {
        if (contentType == null || contentType.trim().length() == 0) {
            throw new IllegalArgumentException("Content type is required");
        }
        this.getProperties().put("contentType", contentType);
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
    
    public String getLinkTarget() {
        return this.getProperties().get("scm.SymbolicLinkTarget");
    }
    
    public boolean isDirectoryLink() {
        return this.getProperties().containsKey("scm.SymbolicLinkIsDirectory");
    }
    
    public Map<String, String> getMetadataProperties() {
        final Map<String, String> userProperties = new HashMap<String, String>(this.getProperties());
        if (!userProperties.isEmpty()) {
            userProperties.remove("scm.SymbolicLinkTarget");
            userProperties.remove("scm.SymbolicLinkIsDirectory");
            userProperties.remove("contentType");
            userProperties.remove("fileTimestamp");
            userProperties.remove("scm.LinkTimestamp");
        }
        return userProperties;
    }
}
