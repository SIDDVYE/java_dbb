// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.scm.common.dto.IItemNWayConflictReport;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.ILogicalConflictReport;
import com.ibm.team.scm.common.dto.IChangeHistorySyncReport;
import com.ibm.team.filesystem.common.internal.dto.CompareResult;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class CompareResultImpl extends EObjectImpl implements CompareResult
{
    protected int ALL_FLAGS;
    protected IChangeHistorySyncReport syncReport;
    protected static final int SYNC_REPORT_ESETFLAG = 1;
    protected ILogicalConflictReport logicalConflictReport;
    protected static final int LOGICAL_CONFLICT_REPORT_ESETFLAG = 2;
    protected EList itemNWayConflictReports;
    
    protected CompareResultImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.COMPARE_RESULT;
    }
    
    public IChangeHistorySyncReport getSyncReport() {
        if (this.syncReport != null && ((EObject)this.syncReport).eIsProxy()) {
            final InternalEObject oldSyncReport = (InternalEObject)this.syncReport;
            this.syncReport = (IChangeHistorySyncReport)this.eResolveProxy(oldSyncReport);
            if (this.syncReport != oldSyncReport && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 0, (Object)oldSyncReport, (Object)this.syncReport));
            }
        }
        return this.syncReport;
    }
    
    public IChangeHistorySyncReport basicGetSyncReport() {
        return this.syncReport;
    }
    
    public void setSyncReport(final IChangeHistorySyncReport newSyncReport) {
        final IChangeHistorySyncReport oldSyncReport = this.syncReport;
        this.syncReport = newSyncReport;
        final boolean oldSyncReportESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 0, (Object)oldSyncReport, (Object)this.syncReport, !oldSyncReportESet));
        }
    }
    
    public void unsetSyncReport() {
        final IChangeHistorySyncReport oldSyncReport = this.syncReport;
        final boolean oldSyncReportESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.syncReport = null;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 0, (Object)oldSyncReport, (Object)null, oldSyncReportESet));
        }
    }
    
    public boolean isSetSyncReport() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public ILogicalConflictReport getLogicalConflictReport() {
        if (this.logicalConflictReport != null && ((EObject)this.logicalConflictReport).eIsProxy()) {
            final InternalEObject oldLogicalConflictReport = (InternalEObject)this.logicalConflictReport;
            this.logicalConflictReport = (ILogicalConflictReport)this.eResolveProxy(oldLogicalConflictReport);
            if (this.logicalConflictReport != oldLogicalConflictReport && this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 9, 1, (Object)oldLogicalConflictReport, (Object)this.logicalConflictReport));
            }
        }
        return this.logicalConflictReport;
    }
    
    public ILogicalConflictReport basicGetLogicalConflictReport() {
        return this.logicalConflictReport;
    }
    
    public void setLogicalConflictReport(final ILogicalConflictReport newLogicalConflictReport) {
        final ILogicalConflictReport oldLogicalConflictReport = this.logicalConflictReport;
        this.logicalConflictReport = newLogicalConflictReport;
        final boolean oldLogicalConflictReportESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.ALL_FLAGS |= 0x2;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 1, (Object)oldLogicalConflictReport, (Object)this.logicalConflictReport, !oldLogicalConflictReportESet));
        }
    }
    
    public void unsetLogicalConflictReport() {
        final ILogicalConflictReport oldLogicalConflictReport = this.logicalConflictReport;
        final boolean oldLogicalConflictReportESet = (this.ALL_FLAGS & 0x2) != 0x0;
        this.logicalConflictReport = null;
        this.ALL_FLAGS &= 0xFFFFFFFD;
        if (this.eNotificationRequired()) {
            this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 1, (Object)oldLogicalConflictReport, (Object)null, oldLogicalConflictReportESet));
        }
    }
    
    public boolean isSetLogicalConflictReport() {
        return (this.ALL_FLAGS & 0x2) != 0x0;
    }
    
    public List getItemNWayConflictReports() {
        if (this.itemNWayConflictReports == null) {
            this.itemNWayConflictReports = (EList)new EObjectContainmentEList.Unsettable((Class)IItemNWayConflictReport.class, (InternalEObject)this, 2);
        }
        return (List)this.itemNWayConflictReports;
    }
    
    public void unsetItemNWayConflictReports() {
        if (this.itemNWayConflictReports != null) {
            ((InternalEList.Unsettable)this.itemNWayConflictReports).unset();
        }
    }
    
    public boolean isSetItemNWayConflictReports() {
        return this.itemNWayConflictReports != null && ((InternalEList.Unsettable)this.itemNWayConflictReports).isSet();
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 2: {
                return ((InternalEList)this.getItemNWayConflictReports()).basicRemove((Object)otherEnd, msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                if (resolve) {
                    return this.getSyncReport();
                }
                return this.basicGetSyncReport();
            }
            case 1: {
                if (resolve) {
                    return this.getLogicalConflictReport();
                }
                return this.basicGetLogicalConflictReport();
            }
            case 2: {
                return this.getItemNWayConflictReports();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.setSyncReport((IChangeHistorySyncReport)newValue);
            }
            case 1: {
                this.setLogicalConflictReport((ILogicalConflictReport)newValue);
            }
            case 2: {
                this.getItemNWayConflictReports().clear();
                this.getItemNWayConflictReports().addAll((Collection)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetSyncReport();
            }
            case 1: {
                this.unsetLogicalConflictReport();
            }
            case 2: {
                this.unsetItemNWayConflictReports();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetSyncReport();
            }
            case 1: {
                return this.isSetLogicalConflictReport();
            }
            case 2: {
                return this.isSetItemNWayConflictReports();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public ILogicalConflictReport logicalConflictReport() {
        return this.getLogicalConflictReport();
    }
    
    public IChangeHistorySyncReport syncReport() {
        return this.getSyncReport();
    }
    
    public List<IItemNWayConflictReport> getNWayConflictReports() {
        return (List<IItemNWayConflictReport>)this.getItemNWayConflictReports();
    }
}
