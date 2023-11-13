// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.impl;

import java.util.Iterator;
import java.util.Map;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import com.ibm.team.repository.common.util.NLS;
import com.ibm.team.filesystem.common.internal.Messages;
import com.ibm.team.filesystem.common.internal.ISymbolicLinkProperties;
import java.util.ArrayList;
import org.eclipse.core.runtime.IStatus;
import java.util.Date;
import com.ibm.team.filesystem.common.ISymbolicLink;
import com.ibm.team.filesystem.common.internal.SymbolicLinkHandle;
import com.ibm.team.filesystem.common.ISymbolicLinkHandle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import com.ibm.team.filesystem.common.internal.SymbolicLink;
import com.ibm.team.scm.common.internal.impl.VersionableImpl;

public class SymbolicLinkImpl extends VersionableImpl implements SymbolicLink
{
    private static final String id = "com.ibm.team.filesystem.common";
    protected int ALL_FLAGS;
    protected static final String TARGET_EDEFAULT;
    protected String target;
    protected static final int TARGET_ESETFLAG = 4096;
    private static final int EOFFSET_CORRECTION;
    
    static {
        TARGET_EDEFAULT = null;
        EOFFSET_CORRECTION = FilesystemPackage.Literals.SYMBOLIC_LINK.getFeatureID((EStructuralFeature)FilesystemPackage.Literals.SYMBOLIC_LINK__TARGET) - 19;
    }
    
    protected SymbolicLinkImpl() {
        this.ALL_FLAGS = 0;
        this.target = SymbolicLinkImpl.TARGET_EDEFAULT;
    }
    
    protected EClass eStaticClass() {
        return FilesystemPackage.Literals.SYMBOLIC_LINK;
    }
    
    public String getTarget() {
        return this.target;
    }
    
    public void setTarget(final String newTarget) {
        final String oldTarget = this.target;
        this.target = newTarget;
        final boolean oldTargetESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.ALL_FLAGS |= 0x1000;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 19 + SymbolicLinkImpl.EOFFSET_CORRECTION, (Object)oldTarget, (Object)this.target, !oldTargetESet));
        }
    }
    
    public void unsetTarget() {
        final String oldTarget = this.target;
        final boolean oldTargetESet = (this.ALL_FLAGS & 0x1000) != 0x0;
        this.target = SymbolicLinkImpl.TARGET_EDEFAULT;
        this.ALL_FLAGS &= 0xFFFFEFFF;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 19 + SymbolicLinkImpl.EOFFSET_CORRECTION, (Object)oldTarget, (Object)SymbolicLinkImpl.TARGET_EDEFAULT, oldTargetESet));
        }
    }
    
    public boolean isSetTarget() {
        return (this.ALL_FLAGS & 0x1000) != 0x0;
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID - SymbolicLinkImpl.EOFFSET_CORRECTION) {
            case 19: {
                return this.getTarget();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID - SymbolicLinkImpl.EOFFSET_CORRECTION) {
            case 19: {
                this.setTarget((String)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID - SymbolicLinkImpl.EOFFSET_CORRECTION) {
            case 19: {
                this.unsetTarget();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID - SymbolicLinkImpl.EOFFSET_CORRECTION) {
            case 19: {
                return this.isSetTarget();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class baseClass) {
        if (baseClass == ISymbolicLinkHandle.class) {
            return -1;
        }
        if (baseClass == SymbolicLinkHandle.class) {
            return -1;
        }
        if (baseClass == ISymbolicLink.class) {
            return -1;
        }
        if (baseClass != SymbolicLink.class) {
            return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
        }
        switch (baseFeatureID - SymbolicLinkImpl.EOFFSET_CORRECTION) {
            case 19: {
                return 19 + SymbolicLinkImpl.EOFFSET_CORRECTION;
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
        result.append(" (target: ");
        if ((this.ALL_FLAGS & 0x1000) != 0x0) {
            result.append(this.target);
        }
        else {
            result.append("<unset>");
        }
        result.append(')');
        return result.toString();
    }
    
    public Date getLinkTimestamp() {
        final String timeStampString = this.getProperties().get("scm.LinkTimestamp");
        long timeStamp = 0L;
        if (timeStampString != null && timeStampString.length() > 0) {
            timeStamp = Long.valueOf(timeStampString);
        }
        return new Date(timeStamp);
    }
    
    public void setLinkTimestamp(final Date date) {
        this.getProperties().put("scm.LinkTimestamp", Long.toString(date.getTime()));
    }
    
    public void setIsDirectoryLink(final boolean isDirectory) {
        if (isDirectory) {
            this.getProperties().put("scm.LinkIsDirectoryType", "true");
        }
        else {
            this.getProperties().remove("scm.LinkIsDirectoryType");
        }
    }
    
    public boolean isDirectoryLink() {
        return this.getProperties().containsKey("scm.LinkIsDirectoryType");
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
            if (!ISymbolicLinkProperties.requiredProperties.contains(property)) {
                if (property.equals("scm.LinkIsDirectoryType") && "true".equals(properties.get("scm.LinkIsDirectoryType"))) {
                    continue;
                }
                if (!property.startsWith("scm") && !property.startsWith("rtc")) {
                    continue;
                }
                errors.add((IStatus)new Status(4, "com.ibm.team.filesystem.common", NLS.bind(Messages.getString("SymbolicLinkImpl_2"), (Object)this.getName(), new Object[] { property })));
            }
            else {
                ++requiredCount;
            }
        }
        if (requiredCount != ISymbolicLinkProperties.requiredProperties.size()) {
            for (final String requiredProperty : ISymbolicLinkProperties.requiredProperties) {
                if (!properties.containsKey(requiredProperty)) {
                    errors.add((IStatus)new Status(4, "com.ibm.team.filesystem.common", NLS.bind(Messages.getString("SymbolicLinkImpl_1"), (Object)this.getName(), new Object[] { requiredProperty })));
                }
            }
        }
        if (errors.isEmpty()) {
            return Status.OK_STATUS;
        }
        if (errors.size() == 1) {
            return errors.get(0);
        }
        return (IStatus)new MultiStatus("com.ibm.team.filesystem.common", 4, (IStatus[])errors.toArray(new IStatus[errors.size()]), NLS.bind(Messages.getString("SymbolicLinkImpl_3"), (Object)this.getName(), new Object[0]), (Throwable)null);
    }
}
