// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.filesystem.common.internal.rest.client.core.StackTraceElementDTO;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.rest.client.core.ExceptionDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ExceptionDTOImpl extends EObjectImpl implements ExceptionDTO
{
    protected int ALL_FLAGS;
    protected ExceptionDTO cause;
    protected static final int CAUSE_ESETFLAG = 1;
    protected static final String MESSAGE_EDEFAULT;
    protected String message;
    protected static final int MESSAGE_ESETFLAG = 2;
    protected EList stackTrace;
    
    static {
        MESSAGE_EDEFAULT = null;
    }
    
    protected ExceptionDTOImpl() {
        this.ALL_FLAGS = 0;
        this.message = ExceptionDTOImpl.MESSAGE_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.EXCEPTION_DTO;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(final String newMessage) {
        final String oldMessage = this.message;
        this.message = newMessage;
        final boolean oldMessageESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldMessage, (Object)this.message, !oldMessageESet));
        }
    }
    
    public void unsetMessage() {
        final String oldMessage = this.message;
        final boolean oldMessageESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.message = ExceptionDTOImpl.MESSAGE_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldMessage, (Object)ExceptionDTOImpl.MESSAGE_EDEFAULT, oldMessageESet));
        }
    }
    
    public boolean isSetMessage() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getStackTrace() {
        if (this.stackTrace == null) {
            this.stackTrace = (EList)new EObjectResolvingEList.Unsettable((Class)StackTraceElementDTO.class, (InternalEObject)this, 2);
        }
        return (List)this.stackTrace;
    }
    
    public void unsetStackTrace() {
        if (this.stackTrace != null) {
            ((InternalEList.Unsettable)this.stackTrace).unset();
        }
    }
    
    public boolean isSetStackTrace() {
        return this.stackTrace != null && ((InternalEList.Unsettable)this.stackTrace).isSet();
    }
    
    public ExceptionDTO getCause() {
        return this.cause;
    }
    
    public NotificationChain basicSetCause(final ExceptionDTO newCause, NotificationChain msgs) {
        final ExceptionDTO oldCause = this.cause;
        this.cause = newCause;
        final boolean oldCauseESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldCause, (Object)newCause, !oldCauseESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setCause(final ExceptionDTO newCause) {
        if (newCause != this.cause) {
            NotificationChain msgs = null;
            if (this.cause != null) {
                msgs = ((InternalEObject)this.cause).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newCause != null) {
                msgs = ((InternalEObject)newCause).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetCause(newCause, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCauseESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newCause, (Object)newCause, !oldCauseESet));
            }
        }
    }
    
    public NotificationChain basicUnsetCause(NotificationChain msgs) {
        final ExceptionDTO oldCause = this.cause;
        this.cause = null;
        final boolean oldCauseESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldCause, (Object)null, oldCauseESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetCause() {
        if (this.cause != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.cause).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetCause(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldCauseESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldCauseESet));
            }
        }
    }
    
    public boolean isSetCause() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetCause(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getCause();
            }
            case 1: {
                return this.getMessage();
            }
            case 2: {
                return this.getStackTrace();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setCause((ExceptionDTO)newValue);
            }
            case 1: {
                this.setMessage((String)newValue);
            }
            case 2: {
                this.getStackTrace().clear();
                this.getStackTrace().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetCause();
            }
            case 1: {
                this.unsetMessage();
            }
            case 2: {
                this.unsetStackTrace();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetCause();
            }
            case 1: {
                return this.isSetMessage();
            }
            case 2: {
                return this.isSetStackTrace();
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
        result.append(" (message: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.message);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
