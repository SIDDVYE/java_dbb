// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.core.StackTraceElementDTO;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class StackTraceElementDTOImpl extends EObjectImpl implements StackTraceElementDTO
{
    protected int ALL_FLAGS;
    protected static final String CLASS_NAME_EDEFAULT = "";
    protected String className;
    protected static final int CLASS_NAME_ESETFLAG = 1;
    protected static final String FILE_NAME_EDEFAULT;
    protected String fileName;
    protected static final int FILE_NAME_ESETFLAG = 2;
    protected static final int LINE_NUMBER_EDEFAULT = 0;
    protected int lineNumber;
    protected static final int LINE_NUMBER_ESETFLAG = 4;
    protected static final String METHOD_NAME_EDEFAULT;
    protected String methodName;
    protected static final int METHOD_NAME_ESETFLAG = 8;
    
    static {
        FILE_NAME_EDEFAULT = null;
        METHOD_NAME_EDEFAULT = null;
    }
    
    protected StackTraceElementDTOImpl() {
        this.ALL_FLAGS = 0;
        this.className = "";
        this.fileName = StackTraceElementDTOImpl.FILE_NAME_EDEFAULT;
        this.lineNumber = 0;
        this.methodName = StackTraceElementDTOImpl.METHOD_NAME_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemRestClientDTOcorePackage.Literals.STACK_TRACE_ELEMENT_DTO;
    }
    
    public String getClassName() {
        return this.className;
    }
    
    public void setClassName(final String newClassName) {
        final String oldClassName = this.className;
        this.className = newClassName;
        final boolean oldClassNameESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldClassName, (Object)this.className, !oldClassNameESet));
        }
    }
    
    public void unsetClassName() {
        final String oldClassName = this.className;
        final boolean oldClassNameESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.className = "";
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldClassName, (Object)"", oldClassNameESet));
        }
    }
    
    public boolean isSetClassName() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public String getMethodName() {
        return this.methodName;
    }
    
    public void setMethodName(final String newMethodName) {
        final String oldMethodName = this.methodName;
        this.methodName = newMethodName;
        final boolean oldMethodNameESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.ALL_FLAGS |= 0x8;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldMethodName, (Object)this.methodName, !oldMethodNameESet));
        }
    }
    
    public void unsetMethodName() {
        final String oldMethodName = this.methodName;
        final boolean oldMethodNameESet = (this.ALL_FLAGS & 0x8) != 0x0;
        this.methodName = StackTraceElementDTOImpl.METHOD_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFF7;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldMethodName, (Object)StackTraceElementDTOImpl.METHOD_NAME_EDEFAULT, oldMethodNameESet));
        }
    }
    
    public boolean isSetMethodName() {
        return (this.ALL_FLAGS & 0x8) != 0x0;
    }
    
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(final String newFileName) {
        final String oldFileName = this.fileName;
        this.fileName = newFileName;
        final boolean oldFileNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldFileName, (Object)this.fileName, !oldFileNameESet));
        }
    }
    
    public void unsetFileName() {
        final String oldFileName = this.fileName;
        final boolean oldFileNameESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.fileName = StackTraceElementDTOImpl.FILE_NAME_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldFileName, (Object)StackTraceElementDTOImpl.FILE_NAME_EDEFAULT, oldFileNameESet));
        }
    }
    
    public boolean isSetFileName() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public int getLineNumber() {
        return this.lineNumber;
    }
    
    public void setLineNumber(final int newLineNumber) {
        final int oldLineNumber = this.lineNumber;
        this.lineNumber = newLineNumber;
        final boolean oldLineNumberESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.ALL_FLAGS |= 0x4;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 2, oldLineNumber, this.lineNumber, !oldLineNumberESet));
        }
    }
    
    public void unsetLineNumber() {
        final int oldLineNumber = this.lineNumber;
        final boolean oldLineNumberESet = (this.ALL_FLAGS & 0x4) != 0x0;
        this.lineNumber = 0;
        this.ALL_FLAGS &= 0xFFFFFFFB;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 2, oldLineNumber, 0, oldLineNumberESet));
        }
    }
    
    public boolean isSetLineNumber() {
        return (this.ALL_FLAGS & 0x4) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getClassName();
            }
            case 1: {
                return this.getFileName();
            }
            case 2: {
                return new Integer(this.getLineNumber());
            }
            case 3: {
                return this.getMethodName();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setClassName((String)newValue);
            }
            case 1: {
                this.setFileName((String)newValue);
            }
            case 2: {
                this.setLineNumber((int)newValue);
            }
            case 3: {
                this.setMethodName((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetClassName();
            }
            case 1: {
                this.unsetFileName();
            }
            case 2: {
                this.unsetLineNumber();
            }
            case 3: {
                this.unsetMethodName();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetClassName();
            }
            case 1: {
                return this.isSetFileName();
            }
            case 2: {
                return this.isSetLineNumber();
            }
            case 3: {
                return this.isSetMethodName();
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
        result.append(" (className: ");
        if ((this.ALL_FLAGS & 0x1) != 0x0) {
            result.append(this.className);
        }
        else {
            result.append("<unset>");
        }
        result.append(", fileName: ");
        if ((this.ALL_FLAGS & 0x2) != 0x0) {
            result.append(this.fileName);
        }
        else {
            result.append("<unset>");
        }
        result.append(", lineNumber: ");
        if ((this.ALL_FLAGS & 0x4) != 0x0) {
            result.append(this.lineNumber);
        }
        else {
            result.append("<unset>");
        }
        result.append(", methodName: ");
        if ((this.ALL_FLAGS & 0x8) != 0x0) {
            result.append(this.methodName);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
}
