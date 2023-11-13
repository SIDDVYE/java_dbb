// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.ExceptionDTO;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.StatusDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class StatusDTOImpl extends EObjectImpl implements StatusDTO
{
    protected int ALL_FLAGS;
    protected EList children;
    protected static final int CODE_EDEFAULT = 0;
    protected int code;
    protected static final int CODE_ESETFLAG = 1;
    protected ExceptionDTO exception;
    protected static final int EXCEPTION_ESETFLAG = 2;
    protected static final String MESSAGE_EDEFAULT;
    protected String message;
    protected static final int MESSAGE_ESETFLAG = 4;
    protected static final String PLUGIN_ID_EDEFAULT;
    protected String pluginId;
    protected static final int PLUGIN_ID_ESETFLAG = 8;
    protected static final int SEVERITY_EDEFAULT = 0;
    protected int severity;
    protected static final int SEVERITY_ESETFLAG = 16;
    
    static {
        MESSAGE_EDEFAULT = null;
        PLUGIN_ID_EDEFAULT = null;
    }
    
    protected StatusDTOImpl() {
        this.ALL_FLAGS = 0;
        this.code = 0;
        this.message = StatusDTOImpl.MESSAGE_EDEFAULT;
        this.pluginId = StatusDTOImpl.PLUGIN_ID_EDEFAULT;
        this.severity = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.STATUS_DTO;
    }
    
    public int getSeverity() {
        return this.severity;
    }
    
    public void setSeverity(final int newSeverity) {
        final int oldSeverity = this.severity;
        this.severity = newSeverity;
        final boolean oldSeverityESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.ALL_FLAGS |= 0x10;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 5, oldSeverity, this.severity, !oldSeverityESet));
        }
    }
    
    public void unsetSeverity() {
        final int oldSeverity = this.severity;
        final boolean oldSeverityESet = (this.ALL_FLAGS & 0x10) != 0x0;
        this.severity = 0;
        this.ALL_FLAGS &= 0xFFFFFFEF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 5, oldSeverity, 0, oldSeverityESet));
        }
    }
    
    public boolean isSetSeverity() {
        return (this.ALL_FLAGS & 0x10) != 0x0;
    }
    
    public String getPluginId() {
        return this.pluginId;
    }
    
    public void setPluginId(final String newPluginId) {
        final String oldPluginId = this.pluginId;
        this.pluginId = newPluginId;
        final boolean oldPluginIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 4, (Object)oldPluginId, (Object)this.pluginId, !oldPluginIdESet));
        }
    }
    
    public void unsetPluginId() {
        final String oldPluginId = this.pluginId;
        final boolean oldPluginIdESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.pluginId = StatusDTOImpl.PLUGIN_ID_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 4, (Object)oldPluginId, (Object)StatusDTOImpl.PLUGIN_ID_EDEFAULT, oldPluginIdESet));
        }
    }
    
    public boolean isSetPluginId() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public int getCode() {
        return this.code;
    }
    
    public void setCode(final int newCode) {
        final int oldCode = this.code;
        this.code = newCode;
        final boolean oldCodeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, oldCode, this.code, !oldCodeESet));
        }
    }
    
    public void unsetCode() {
        final int oldCode = this.code;
        final boolean oldCodeESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.code = 0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, oldCode, 0, oldCodeESet));
        }
    }
    
    public boolean isSetCode() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(final String newMessage) {
        final String oldMessage = this.message;
        this.message = newMessage;
        final boolean oldMessageESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldMessage, (Object)this.message, !oldMessageESet));
        }
    }
    
    public void unsetMessage() {
        final String oldMessage = this.message;
        final boolean oldMessageESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.message = StatusDTOImpl.MESSAGE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldMessage, (Object)StatusDTOImpl.MESSAGE_EDEFAULT, oldMessageESet));
        }
    }
    
    public boolean isSetMessage() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public ExceptionDTO getException() {
        return this.exception;
    }
    
    public NotificationChain basicSetException(final ExceptionDTO newException, NotificationChain msgs) {
        final ExceptionDTO oldException = this.exception;
        this.exception = newException;
        final boolean oldExceptionESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 2, (Object)oldException, (Object)newException, !oldExceptionESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setException(final ExceptionDTO newException) {
        if (newException != this.exception) {
            NotificationChain msgs = null;
            if (this.exception != null) {
                msgs = ((InternalEObject)this.exception).eInverseRemove((InternalEObject)this, -3, (Class)null, msgs);
            }
            if (newException != null) {
                msgs = ((InternalEObject)newException).eInverseAdd((InternalEObject)this, -3, (Class)null, msgs);
            }
            msgs = this.basicSetException(newException, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldExceptionESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS |= 0x2;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, (Object)newException, (Object)newException, !oldExceptionESet));
            }
        }
    }
    
    public NotificationChain basicUnsetException(NotificationChain msgs) {
        final ExceptionDTO oldException = this.exception;
        this.exception = null;
        final boolean oldExceptionESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 2, (Object)oldException, (Object)null, oldExceptionESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetException() {
        if (this.exception != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.exception).eInverseRemove((InternalEObject)this, -3, (Class)null, msgs);
            msgs = this.basicUnsetException(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldExceptionESet = (this.ALL_FLAGS & 0x2) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFD;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, (Object)null, (Object)null, oldExceptionESet));
            }
        }
    }
    
    public boolean isSetException() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getChildren() {
        if (this.children == null) {
            this.children = (EList)new EObjectResolvingEList.Unsettable((Class)StatusDTO.class, (InternalEObject)this, 0);
        }
        return (List)this.children;
    }
    
    public void unsetChildren() {
        if (this.children != null) {
            ((InternalEList.Unsettable)this.children).unset();
        }
    }
    
    public boolean isSetChildren() {
        return this.children != null && ((InternalEList.Unsettable)this.children).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 2: {
                return this.basicUnsetException(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getChildren();
            }
            case 1: {
                return new Integer(this.getCode());
            }
            case 2: {
                return this.getException();
            }
            case 3: {
                return this.getMessage();
            }
            case 4: {
                return this.getPluginId();
            }
            case 5: {
                return new Integer(this.getSeverity());
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getChildren().clear();
                this.getChildren().addAll((Collection)newValue);
            }
            case 1: {
                this.setCode((int)newValue);
            }
            case 2: {
                this.setException((ExceptionDTO)newValue);
            }
            case 3: {
                this.setMessage((String)newValue);
            }
            case 4: {
                this.setPluginId((String)newValue);
            }
            case 5: {
                this.setSeverity((int)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetChildren();
            }
            case 1: {
                this.unsetCode();
            }
            case 2: {
                this.unsetException();
            }
            case 3: {
                this.unsetMessage();
            }
            case 4: {
                this.unsetPluginId();
            }
            case 5: {
                this.unsetSeverity();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetChildren();
            }
            case 1: {
                return this.isSetCode();
            }
            case 2: {
                return this.isSetException();
            }
            case 3: {
                return this.isSetMessage();
            }
            case 4: {
                return this.isSetPluginId();
            }
            case 5: {
                return this.isSetSeverity();
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
        result.append(" (code: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.code);
        }
        else {
            result.append("<unset>");
        }
        result.append(", message: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.message);
        }
        else {
            result.append("<unset>");
        }
        result.append(", pluginId: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.pluginId);
        }
        else {
            result.append("<unset>");
        }
        result.append(", severity: ");
        if ((this.ALL_FLAGS & 0x10) != 0x0) {
            result.append(this.severity);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
