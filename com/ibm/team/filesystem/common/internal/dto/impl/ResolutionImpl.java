// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collection;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import com.ibm.team.scm.common.IChangeSetHandle;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.scm.common.dto.IUpdateReport;
import com.ibm.team.filesystem.common.internal.dto.Resolution;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class ResolutionImpl extends EObjectImpl implements Resolution
{
    protected int ALL_FLAGS;
    protected IUpdateReport updateReport;
    protected static final int UPDATE_REPORT_ESETFLAG = 1;
    protected EList changeSet;
    
    protected ResolutionImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.RESOLUTION;
    }
    
    public IUpdateReport getUpdateReport() {
        return this.updateReport;
    }
    
    public NotificationChain basicSetUpdateReport(final IUpdateReport newUpdateReport, NotificationChain msgs) {
        final IUpdateReport oldUpdateReport = this.updateReport;
        this.updateReport = newUpdateReport;
        final boolean oldUpdateReportESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldUpdateReport, (Object)newUpdateReport, !oldUpdateReportESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setUpdateReport(final IUpdateReport newUpdateReport) {
        if (newUpdateReport != this.updateReport) {
            NotificationChain msgs = null;
            if (this.updateReport != null) {
                msgs = ((InternalEObject)this.updateReport).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            }
            if (newUpdateReport != null) {
                msgs = ((InternalEObject)newUpdateReport).eInverseAdd((InternalEObject)this, -1, (Class)null, msgs);
            }
            msgs = this.basicSetUpdateReport(newUpdateReport, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdateReportESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)newUpdateReport, (Object)newUpdateReport, !oldUpdateReportESet));
            }
        }
    }
    
    public NotificationChain basicUnsetUpdateReport(NotificationChain msgs) {
        final IUpdateReport oldUpdateReport = this.updateReport;
        this.updateReport = null;
        final boolean oldUpdateReportESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldUpdateReport, (Object)null, oldUpdateReportESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetUpdateReport() {
        if (this.updateReport != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.updateReport).eInverseRemove((InternalEObject)this, -1, (Class)null, msgs);
            msgs = this.basicUnsetUpdateReport(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldUpdateReportESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)null, (Object)null, oldUpdateReportESet));
            }
        }
    }
    
    public boolean isSetUpdateReport() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public List getChangeSet() {
        if (this.changeSet == null) {
            this.changeSet = (EList)new EObjectResolvingEList.Unsettable((Class)IChangeSetHandle.class, (InternalEObject)this, 1);
        }
        return (List)this.changeSet;
    }
    
    public void unsetChangeSet() {
        if (this.changeSet != null) {
            ((InternalEList.Unsettable)this.changeSet).unset();
        }
    }
    
    public boolean isSetChangeSet() {
        return this.changeSet != null && ((InternalEList.Unsettable)this.changeSet).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return this.basicUnsetUpdateReport(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getUpdateReport();
            }
            case 1: {
                return this.getChangeSet();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setUpdateReport((IUpdateReport)newValue);
            }
            case 1: {
                this.getChangeSet().clear();
                this.getChangeSet().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetUpdateReport();
            }
            case 1: {
                this.unsetChangeSet();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetUpdateReport();
            }
            case 1: {
                return this.isSetChangeSet();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
}
