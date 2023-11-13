// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import com.ibm.team.filesystem.common.IChangeSummary;
import com.ibm.team.filesystem.common.internal.dto.LogicalConflict;
import com.ibm.team.filesystem.common.internal.dto.LogicalChange;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;
import com.ibm.team.repository.common.IItemHandle;
import java.util.ArrayList;
import com.ibm.team.scm.common.IVersionableHandle;
import com.ibm.team.scm.common.IComponentHandle;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import com.ibm.team.filesystem.common.ILogicalChange;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import com.ibm.team.filesystem.common.ILogicalConflict;
import java.util.List;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.scm.common.dto.IUpdateReport;
import org.eclipse.emf.common.util.EList;
import com.ibm.team.filesystem.common.internal.dto.LogicalConflictReport;
import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LogicalConflictReportImpl extends EObjectImpl implements LogicalConflictReport
{
    protected int ALL_FLAGS;
    protected EList conflicts;
    protected EList pendingChanges;
    protected EList deferredChanges;
    protected IUpdateReport conflictReport;
    protected static final int CONFLICT_REPORT_ESETFLAG = 1;
    
    protected LogicalConflictReportImpl() {
        this.ALL_FLAGS = 0;
    }
    
    protected EClass eStaticClass() {
        return FilesystemDTOPackage.Literals.LOGICAL_CONFLICT_REPORT;
    }
    
    public List getConflicts() {
        if (this.conflicts == null) {
            this.conflicts = (EList)new EObjectContainmentEList.Unsettable(ILogicalConflict.class, this, 0) {
                protected boolean isUnique() {
                    return false;
                }
            };
        }
        return (List)this.conflicts;
    }
    
    public void unsetConflicts() {
        if (this.conflicts != null) {
            ((InternalEList.Unsettable)this.conflicts).unset();
        }
    }
    
    public boolean isSetConflicts() {
        return this.conflicts != null && ((InternalEList.Unsettable)this.conflicts).isSet();
    }
    
    public List getPendingChanges() {
        if (this.pendingChanges == null) {
            this.pendingChanges = (EList)new EObjectContainmentEList.Unsettable(ILogicalChange.class, this, 1) {
                protected boolean isUnique() {
                    return false;
                }
            };
        }
        return (List)this.pendingChanges;
    }
    
    public void unsetPendingChanges() {
        if (this.pendingChanges != null) {
            ((InternalEList.Unsettable)this.pendingChanges).unset();
        }
    }
    
    public boolean isSetPendingChanges() {
        return this.pendingChanges != null && ((InternalEList.Unsettable)this.pendingChanges).isSet();
    }
    
    public List getDeferredChanges() {
        if (this.deferredChanges == null) {
            this.deferredChanges = (EList)new EObjectContainmentEList.Unsettable(ILogicalChange.class, this, 2) {
                protected boolean isUnique() {
                    return false;
                }
            };
        }
        return (List)this.deferredChanges;
    }
    
    public void unsetDeferredChanges() {
        if (this.deferredChanges != null) {
            ((InternalEList.Unsettable)this.deferredChanges).unset();
        }
    }
    
    public boolean isSetDeferredChanges() {
        return this.deferredChanges != null && ((InternalEList.Unsettable)this.deferredChanges).isSet();
    }
    
    public IUpdateReport getConflictReport() {
        return this.conflictReport;
    }
    
    public NotificationChain basicSetConflictReport(final IUpdateReport newConflictReport, NotificationChain msgs) {
        final IUpdateReport oldConflictReport = this.conflictReport;
        this.conflictReport = newConflictReport;
        final boolean oldConflictReportESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS |= 0x1;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 1, 3, (Object)oldConflictReport, (Object)newConflictReport, !oldConflictReportESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void setConflictReport(final IUpdateReport newConflictReport) {
        if (newConflictReport != this.conflictReport) {
            NotificationChain msgs = null;
            if (this.conflictReport != null) {
                msgs = ((InternalEObject)this.conflictReport).eInverseRemove((InternalEObject)this, -4, (Class)null, msgs);
            }
            if (newConflictReport != null) {
                msgs = ((InternalEObject)newConflictReport).eInverseAdd((InternalEObject)this, -4, (Class)null, msgs);
            }
            msgs = this.basicSetConflictReport(newConflictReport, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldConflictReportESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS |= 0x1;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 1, 3, (Object)newConflictReport, (Object)newConflictReport, !oldConflictReportESet));
            }
        }
    }
    
    public NotificationChain basicUnsetConflictReport(NotificationChain msgs) {
        final IUpdateReport oldConflictReport = this.conflictReport;
        this.conflictReport = null;
        final boolean oldConflictReportESet = (this.ALL_FLAGS & 0x1) != 0x0;
        this.ALL_FLAGS &= 0xFFFFFFFE;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl((InternalEObject)this, 2, 3, (Object)oldConflictReport, (Object)null, oldConflictReportESet);
            if (msgs == null) {
                msgs = (NotificationChain)notification;
            }
            else {
                msgs.add((Notification)notification);
            }
        }
        return msgs;
    }
    
    public void unsetConflictReport() {
        if (this.conflictReport != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)this.conflictReport).eInverseRemove((InternalEObject)this, -4, (Class)null, msgs);
            msgs = this.basicUnsetConflictReport(msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else {
            final boolean oldConflictReportESet = (this.ALL_FLAGS & 0x1) != 0x0;
            this.ALL_FLAGS &= 0xFFFFFFFE;
            if (this.eNotificationRequired()) {
                this.eNotify((Notification)new ENotificationImpl((InternalEObject)this, 2, 3, (Object)null, (Object)null, oldConflictReportESet));
            }
        }
    }
    
    public boolean isSetConflictReport() {
        return (this.ALL_FLAGS & 0x1) != 0x0;
    }
    
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
        switch (featureID) {
            case 0: {
                return ((InternalEList)this.getConflicts()).basicRemove((Object)otherEnd, msgs);
            }
            case 1: {
                return ((InternalEList)this.getPendingChanges()).basicRemove((Object)otherEnd, msgs);
            }
            case 2: {
                return ((InternalEList)this.getDeferredChanges()).basicRemove((Object)otherEnd, msgs);
            }
            case 3: {
                return this.basicUnsetConflictReport(msgs);
            }
            default: {
                return super.eInverseRemove(otherEnd, featureID, msgs);
            }
        }
    }
    
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
            case 0: {
                return this.getConflicts();
            }
            case 1: {
                return this.getPendingChanges();
            }
            case 2: {
                return this.getDeferredChanges();
            }
            case 3: {
                return this.getConflictReport();
            }
            default: {
                return super.eGet(featureID, resolve, coreType);
            }
        }
    }
    
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
            case 0: {
                this.getConflicts().clear();
                this.getConflicts().addAll((Collection)newValue);
            }
            case 1: {
                this.getPendingChanges().clear();
                this.getPendingChanges().addAll((Collection)newValue);
            }
            case 2: {
                this.getDeferredChanges().clear();
                this.getDeferredChanges().addAll((Collection)newValue);
            }
            case 3: {
                this.setConflictReport((IUpdateReport)newValue);
            }
            default: {
                super.eSet(featureID, newValue);
            }
        }
    }
    
    public void eUnset(final int featureID) {
        switch (featureID) {
            case 0: {
                this.unsetConflicts();
            }
            case 1: {
                this.unsetPendingChanges();
            }
            case 2: {
                this.unsetDeferredChanges();
            }
            case 3: {
                this.unsetConflictReport();
            }
            default: {
                super.eUnset(featureID);
            }
        }
    }
    
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
            case 0: {
                return this.isSetConflicts();
            }
            case 1: {
                return this.isSetPendingChanges();
            }
            case 2: {
                return this.isSetDeferredChanges();
            }
            case 3: {
                return this.isSetConflictReport();
            }
            default: {
                return super.eIsSet(featureID);
            }
        }
    }
    
    public Collection getConflict(final IComponentHandle component, final IVersionableHandle proposedVersionable) {
        final Collection result = new ArrayList();
        for (final ILogicalConflict conflict : this.getConflicts()) {
            if (conflict.item().sameItemId((IItemHandle)proposedVersionable) && conflict.component().sameItemId((IItemHandle)component)) {
                result.add(conflict);
            }
        }
        return result;
    }
    
    public Collection getPendingConflict(final IComponentHandle component, final IVersionableHandle selectedVersionable) {
        final Collection result = new ArrayList();
        for (final ILogicalConflict conflict : this.getByComponent(component, this.getConflicts())) {
            for (final IVersionableHandle conflicted : conflict.conflictingItems()) {
                if (conflicted.sameItemId((IItemHandle)selectedVersionable)) {
                    result.add(conflict);
                }
            }
        }
        return result;
    }
    
    public Collection getAffectedComponents() {
        final List conflictList = this.getConflicts();
        final List pendingList = this.getPendingChanges();
        if (conflictList.isEmpty() && pendingList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        final Map idComponentMap = new HashMap();
        for (int i = 0; i < conflictList.size(); ++i) {
            final ILogicalConflict conflict = conflictList.get(i);
            final IComponentHandle component = conflict.component();
            idComponentMap.put(component.getItemId(), component);
        }
        for (int i = 0; i < pendingList.size(); ++i) {
            final ILogicalChange conflict2 = pendingList.get(i);
            final IComponentHandle component = conflict2.component();
            idComponentMap.put(component.getItemId(), component);
        }
        return Collections.unmodifiableCollection(idComponentMap.values());
    }
    
    public Collection getConflictsForComponent(final IComponentHandle component) {
        return Collections.unmodifiableCollection((Collection<?>)this.getByComponent(component, this.getConflicts()));
    }
    
    public Collection getAutoMergeChangesForComponent(final IComponentHandle component) {
        return Collections.unmodifiableCollection((Collection<?>)this.getByComponent(component, this.getPendingChanges()));
    }
    
    public Collection getIncidentalChangesForComponent(final IComponentHandle component) {
        return Collections.unmodifiableCollection((Collection<?>)this.getByComponent(component, this.getDeferredChanges()));
    }
    
    private List getByComponent(final IComponentHandle component, final List reports) {
        if (component == null) {
            throw new IllegalArgumentException();
        }
        if (reports.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        final List result = new ArrayList();
        for (final ILogicalChange change : reports) {
            if (change.component().sameItemId((IItemHandle)component)) {
                result.add(change);
            }
        }
        return result;
    }
    
    public List getDependentChanges(final ILogicalChange change) {
        if (change == null) {
            throw new IllegalArgumentException();
        }
        final HashMap map = new HashMap();
        this.buildChangeMap(map, this.getAutoMergeChangesForComponent(change.component()));
        this.buildChangeMap(map, this.getIncidentalChangesForComponent(change.component()));
        this.buildChangeMap(map, this.getConflictsForComponent(change.component()));
        final ArrayList result = new ArrayList(((LogicalChange)change).getDependentChanges().size());
        this.addRelatedConflicts(change, result);
        for (final Object id : ((LogicalChange)change).getDependentChanges()) {
            result.add(map.get(id));
        }
        return Collections.unmodifiableList((List<?>)result);
    }
    
    public List getRequiredChanges(final ILogicalChange change) {
        if (change == null) {
            throw new IllegalArgumentException();
        }
        final HashMap map = new HashMap();
        this.buildChangeMap(map, this.getAutoMergeChangesForComponent(change.component()));
        this.buildChangeMap(map, this.getIncidentalChangesForComponent(change.component()));
        this.buildChangeMap(map, this.getConflictsForComponent(change.component()));
        final ArrayList result = new ArrayList(((LogicalChange)change).getRelatedChanges().size());
        this.addRelatedConflicts(change, result);
        for (final Object id : ((LogicalChange)change).getRelatedChanges()) {
            result.add(map.get(id));
        }
        return Collections.unmodifiableList((List<?>)result);
    }
    
    private void addRelatedConflicts(final ILogicalChange change, final ArrayList result) {
        if (change.kind() == 1) {
            for (final LogicalConflict conflict : this.getConflictsForComponent(change.component())) {
                if (((LogicalChange)change).getId().equals((Object)conflict.getId()) && conflict.getConflictType() != ((LogicalConflict)change).getConflictType()) {
                    if (change.isChangeType(8)) {
                        if (conflict.getConflictType() != 7 && conflict.getConflictType() != 8 && conflict.getConflictType() != 10 && conflict.getConflictType() != 6) {
                            continue;
                        }
                        result.add(conflict);
                    }
                    else if (change.isChangeType(4)) {
                        if (conflict.getConflictType() != 10 && conflict.getConflictType() != 8 && conflict.getConflictType() != 9) {
                            continue;
                        }
                        result.add(conflict);
                    }
                    else {
                        result.add(conflict);
                    }
                }
            }
        }
    }
    
    private void buildChangeMap(final HashMap map, final Collection changes) {
        for (final LogicalChange change : changes) {
            map.put(change.getId(), change);
        }
    }
    
    public Collection conflicts() {
        return Collections.unmodifiableCollection((Collection<?>)this.getConflicts());
    }
    
    public Collection incidentalChanges() {
        return Collections.unmodifiableCollection((Collection<?>)this.getDeferredChanges());
    }
    
    public Collection autoMergeChanges() {
        return Collections.unmodifiableCollection((Collection<?>)this.getPendingChanges());
    }
    
    public Collection getChange(final IComponentHandle component, final IVersionableHandle proposedVersionable) {
        final Collection result = new ArrayList();
        this.getChange(component, proposedVersionable, this.getConflicts(), result);
        this.getChange(component, proposedVersionable, this.getDeferredChanges(), result);
        this.getChange(component, proposedVersionable, this.getPendingChanges(), result);
        return result;
    }
    
    private void getChange(final IComponentHandle component, final IVersionableHandle proposedVersionable, final List changes, final Collection result) {
        for (final ILogicalChange change : changes) {
            if (proposedVersionable.sameItemId((IItemHandle)change.item()) && change.component().sameItemId((IItemHandle)component)) {
                result.add(change);
            }
        }
    }
    
    public Collection getPendingChanges(final IComponentHandle component, final IChangeSummary appliedChange) {
        final Collection result = new ArrayList();
        for (final ILogicalConflict conflict : this.getByComponent(component, this.getConflicts())) {
            if (conflict.conflictType() == 6) {
                if (!conflict.item().sameItemId((IItemHandle)appliedChange.item())) {
                    continue;
                }
                result.add(conflict);
            }
            else {
                for (final IVersionableHandle conflicted : conflict.conflictingItems()) {
                    if (conflicted.sameItemId((IItemHandle)appliedChange.item())) {
                        result.add(conflict);
                        break;
                    }
                }
            }
        }
        for (final ILogicalChange change : this.getByComponent(component, this.getPendingChanges())) {
            if (this.isConflictCause(change, appliedChange.item())) {
                result.add(change);
            }
        }
        return Collections.unmodifiableCollection((Collection<?>)result);
    }
    
    private boolean isConflictCause(final ILogicalChange change, final IVersionableHandle affectedVersionable) {
        return change.item().sameItemId((IItemHandle)affectedVersionable);
    }
    
    public IUpdateReport conflictReport() {
        return this.getConflictReport();
    }
}
