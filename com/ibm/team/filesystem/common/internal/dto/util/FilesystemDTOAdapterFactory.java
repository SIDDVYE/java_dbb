// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.scm.common.internal.dto2.ChangeDetail;
import com.ibm.team.scm.common.IChangeDetail;
import com.ibm.team.filesystem.common.IEncodingChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.EncodingChangeDetail;
import com.ibm.team.filesystem.common.ILineDelimiterChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.LineDelimiterChangeDetail;
import com.ibm.team.filesystem.common.IContentTypeChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.ContentTypeChangeDetail;
import com.ibm.team.filesystem.common.IExecutableBitChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.ExecutableBitChangeDetail;
import com.ibm.team.filesystem.common.IContentChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.ContentChangeDetail;
import com.ibm.team.filesystem.common.ISymbolicLinkChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.SymbolicLinkChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.LocalChangeUndoReport;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdateReport2;
import com.ibm.team.filesystem.common.internal.dto.Inaccessible;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolution2;
import com.ibm.team.filesystem.common.internal.dto.SharePoint;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdateReport;
import com.ibm.team.filesystem.common.IWorkspaceCompareReport;
import com.ibm.team.filesystem.common.internal.dto.CompareResult;
import com.ibm.team.filesystem.common.internal.dto.OverlapDescription;
import com.ibm.team.filesystem.common.internal.dto.OverlapResponse;
import com.ibm.team.filesystem.common.internal.dto.OverlapRequest;
import com.ibm.team.filesystem.common.internal.dto.LoadTree;
import com.ibm.team.filesystem.common.IChangeSetSummary;
import com.ibm.team.filesystem.common.internal.dto.ChangeSetSynopsis;
import com.ibm.team.filesystem.common.IChangeSummary;
import com.ibm.team.filesystem.common.internal.dto.ChangeSynopsis;
import com.ibm.team.filesystem.common.IBasicChange;
import com.ibm.team.filesystem.common.internal.dto.BasicChange;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolution;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolutionReport;
import com.ibm.team.filesystem.common.internal.IFileAreaUpdate;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdate;
import com.ibm.team.filesystem.common.ILogicalChange;
import com.ibm.team.filesystem.common.internal.dto.LogicalChange;
import com.ibm.team.filesystem.common.ILogicalConflict;
import com.ibm.team.filesystem.common.internal.dto.LogicalConflict;
import com.ibm.team.filesystem.common.ILogicalConflictReport;
import com.ibm.team.filesystem.common.internal.dto.LogicalConflictReport;
import com.ibm.team.filesystem.common.internal.dto.Resolution;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class FilesystemDTOAdapterFactory extends AdapterFactoryImpl
{
    protected static FilesystemDTOPackage modelPackage;
    protected FilesystemDTOSwitch modelSwitch;
    
    public FilesystemDTOAdapterFactory() {
        this.modelSwitch = new FilesystemDTOSwitch() {
            @Override
            public Object caseResolution(final Resolution object) {
                return FilesystemDTOAdapterFactory.this.createResolutionAdapter();
            }
            
            @Override
            public Object caseLogicalConflictReport(final LogicalConflictReport object) {
                return FilesystemDTOAdapterFactory.this.createLogicalConflictReportAdapter();
            }
            
            @Override
            public Object caseLogicalConflictReportFacade(final ILogicalConflictReport object) {
                return FilesystemDTOAdapterFactory.this.createLogicalConflictReportFacadeAdapter();
            }
            
            @Override
            public Object caseLogicalConflict(final LogicalConflict object) {
                return FilesystemDTOAdapterFactory.this.createLogicalConflictAdapter();
            }
            
            @Override
            public Object caseLogicalConflictFacade(final ILogicalConflict object) {
                return FilesystemDTOAdapterFactory.this.createLogicalConflictFacadeAdapter();
            }
            
            @Override
            public Object caseLogicalChange(final LogicalChange object) {
                return FilesystemDTOAdapterFactory.this.createLogicalChangeAdapter();
            }
            
            @Override
            public Object caseLogicalChangeFacade(final ILogicalChange object) {
                return FilesystemDTOAdapterFactory.this.createLogicalChangeFacadeAdapter();
            }
            
            @Override
            public Object caseFileAreaUpdate(final FileAreaUpdate object) {
                return FilesystemDTOAdapterFactory.this.createFileAreaUpdateAdapter();
            }
            
            @Override
            public Object caseFileAreaUpdateFacade(final IFileAreaUpdate object) {
                return FilesystemDTOAdapterFactory.this.createFileAreaUpdateFacadeAdapter();
            }
            
            @Override
            public Object caseConflictResolutionReport(final ConflictResolutionReport object) {
                return FilesystemDTOAdapterFactory.this.createConflictResolutionReportAdapter();
            }
            
            @Override
            public Object caseConflictResolution(final ConflictResolution object) {
                return FilesystemDTOAdapterFactory.this.createConflictResolutionAdapter();
            }
            
            @Override
            public Object caseBasicChange(final BasicChange object) {
                return FilesystemDTOAdapterFactory.this.createBasicChangeAdapter();
            }
            
            @Override
            public Object caseBasicChangeFacade(final IBasicChange object) {
                return FilesystemDTOAdapterFactory.this.createBasicChangeFacadeAdapter();
            }
            
            @Override
            public Object caseChangeSynopsis(final ChangeSynopsis object) {
                return FilesystemDTOAdapterFactory.this.createChangeSynopsisAdapter();
            }
            
            @Override
            public Object caseChangeSynopsisFacade(final IChangeSummary object) {
                return FilesystemDTOAdapterFactory.this.createChangeSynopsisFacadeAdapter();
            }
            
            @Override
            public Object caseChangeSetSynopsis(final ChangeSetSynopsis object) {
                return FilesystemDTOAdapterFactory.this.createChangeSetSynopsisAdapter();
            }
            
            @Override
            public Object caseChangeSetSynopsisFacade(final IChangeSetSummary object) {
                return FilesystemDTOAdapterFactory.this.createChangeSetSynopsisFacadeAdapter();
            }
            
            @Override
            public Object caseLoadTree(final LoadTree object) {
                return FilesystemDTOAdapterFactory.this.createLoadTreeAdapter();
            }
            
            @Override
            public Object caseOverlapRequest(final OverlapRequest object) {
                return FilesystemDTOAdapterFactory.this.createOverlapRequestAdapter();
            }
            
            @Override
            public Object caseOverlapResponse(final OverlapResponse object) {
                return FilesystemDTOAdapterFactory.this.createOverlapResponseAdapter();
            }
            
            @Override
            public Object caseOverlapDescription(final OverlapDescription object) {
                return FilesystemDTOAdapterFactory.this.createOverlapDescriptionAdapter();
            }
            
            @Override
            public Object caseCompareResult(final CompareResult object) {
                return FilesystemDTOAdapterFactory.this.createCompareResultAdapter();
            }
            
            @Override
            public Object caseCompareResultFacade(final IWorkspaceCompareReport object) {
                return FilesystemDTOAdapterFactory.this.createCompareResultFacadeAdapter();
            }
            
            @Override
            public Object caseFileAreaUpdateReport(final FileAreaUpdateReport object) {
                return FilesystemDTOAdapterFactory.this.createFileAreaUpdateReportAdapter();
            }
            
            @Override
            public Object caseSharePoint(final SharePoint object) {
                return FilesystemDTOAdapterFactory.this.createSharePointAdapter();
            }
            
            @Override
            public Object caseConflictResolution2(final ConflictResolution2 object) {
                return FilesystemDTOAdapterFactory.this.createConflictResolution2Adapter();
            }
            
            @Override
            public Object caseInaccessible(final Inaccessible object) {
                return FilesystemDTOAdapterFactory.this.createInaccessibleAdapter();
            }
            
            @Override
            public Object caseFileAreaUpdateReport2(final FileAreaUpdateReport2 object) {
                return FilesystemDTOAdapterFactory.this.createFileAreaUpdateReport2Adapter();
            }
            
            @Override
            public Object caseLocalChangeUndoReport(final LocalChangeUndoReport object) {
                return FilesystemDTOAdapterFactory.this.createLocalChangeUndoReportAdapter();
            }
            
            @Override
            public Object caseSymbolicLinkChangeDetail(final SymbolicLinkChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createSymbolicLinkChangeDetailAdapter();
            }
            
            @Override
            public Object caseSymbolicLinkChangeDetailFacade(final ISymbolicLinkChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createSymbolicLinkChangeDetailFacadeAdapter();
            }
            
            @Override
            public Object caseContentChangeDetail(final ContentChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createContentChangeDetailAdapter();
            }
            
            @Override
            public Object caseContentChangeDetailFacade(final IContentChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createContentChangeDetailFacadeAdapter();
            }
            
            @Override
            public Object caseExecutableBitChangeDetail(final ExecutableBitChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createExecutableBitChangeDetailAdapter();
            }
            
            @Override
            public Object caseExecutableBitChangeDetailFacade(final IExecutableBitChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createExecutableBitChangeDetailFacadeAdapter();
            }
            
            @Override
            public Object caseContentTypeChangeDetail(final ContentTypeChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createContentTypeChangeDetailAdapter();
            }
            
            @Override
            public Object caseContentTypeChangeDetailFacade(final IContentTypeChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createContentTypeChangeDetailFacadeAdapter();
            }
            
            @Override
            public Object caseLineDelimiterChangeDetail(final LineDelimiterChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createLineDelimiterChangeDetailAdapter();
            }
            
            @Override
            public Object caseLineDelimiterChangeDetailFacade(final ILineDelimiterChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createLineDelimiterChangeDetailFacadeAdapter();
            }
            
            @Override
            public Object caseEncodingChangeDetail(final EncodingChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createEncodingChangeDetailAdapter();
            }
            
            @Override
            public Object caseEncodingChangeDetailFacade(final IEncodingChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createEncodingChangeDetailFacadeAdapter();
            }
            
            @Override
            public Object caseChangeDetailFacade(final IChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createChangeDetailFacadeAdapter();
            }
            
            @Override
            public Object caseChangeDetail(final ChangeDetail object) {
                return FilesystemDTOAdapterFactory.this.createChangeDetailAdapter();
            }
            
            @Override
            public Object defaultCase(final EObject object) {
                return FilesystemDTOAdapterFactory.this.createEObjectAdapter();
            }
        };
        if (FilesystemDTOAdapterFactory.modelPackage == null) {
            FilesystemDTOAdapterFactory.modelPackage = FilesystemDTOPackage.eINSTANCE;
        }
    }
    
    public boolean isFactoryForType(final Object object) {
        return object == FilesystemDTOAdapterFactory.modelPackage || (object instanceof EObject && ((EObject)object).eClass().getEPackage() == FilesystemDTOAdapterFactory.modelPackage);
    }
    
    public Adapter createAdapter(final Notifier target) {
        return (Adapter)this.modelSwitch.doSwitch((EObject)target);
    }
    
    public Adapter createResolutionAdapter() {
        return null;
    }
    
    public Adapter createLogicalConflictReportAdapter() {
        return null;
    }
    
    public Adapter createLogicalConflictReportFacadeAdapter() {
        return null;
    }
    
    public Adapter createLogicalConflictAdapter() {
        return null;
    }
    
    public Adapter createLogicalConflictFacadeAdapter() {
        return null;
    }
    
    public Adapter createLogicalChangeAdapter() {
        return null;
    }
    
    public Adapter createLogicalChangeFacadeAdapter() {
        return null;
    }
    
    public Adapter createFileAreaUpdateAdapter() {
        return null;
    }
    
    public Adapter createFileAreaUpdateFacadeAdapter() {
        return null;
    }
    
    public Adapter createConflictResolutionReportAdapter() {
        return null;
    }
    
    public Adapter createConflictResolutionAdapter() {
        return null;
    }
    
    public Adapter createBasicChangeAdapter() {
        return null;
    }
    
    public Adapter createBasicChangeFacadeAdapter() {
        return null;
    }
    
    public Adapter createChangeSynopsisAdapter() {
        return null;
    }
    
    public Adapter createChangeSynopsisFacadeAdapter() {
        return null;
    }
    
    public Adapter createChangeSetSynopsisAdapter() {
        return null;
    }
    
    public Adapter createChangeSetSynopsisFacadeAdapter() {
        return null;
    }
    
    public Adapter createLoadTreeAdapter() {
        return null;
    }
    
    public Adapter createFileAreaUpdateReportAdapter() {
        return null;
    }
    
    public Adapter createOverlapRequestAdapter() {
        return null;
    }
    
    public Adapter createOverlapDescriptionAdapter() {
        return null;
    }
    
    public Adapter createCompareResultAdapter() {
        return null;
    }
    
    public Adapter createCompareResultFacadeAdapter() {
        return null;
    }
    
    public Adapter createSharePointAdapter() {
        return null;
    }
    
    public Adapter createConflictResolution2Adapter() {
        return null;
    }
    
    public Adapter createInaccessibleAdapter() {
        return null;
    }
    
    public Adapter createFileAreaUpdateReport2Adapter() {
        return null;
    }
    
    public Adapter createLocalChangeUndoReportAdapter() {
        return null;
    }
    
    public Adapter createSymbolicLinkChangeDetailAdapter() {
        return null;
    }
    
    public Adapter createSymbolicLinkChangeDetailFacadeAdapter() {
        return null;
    }
    
    public Adapter createContentChangeDetailAdapter() {
        return null;
    }
    
    public Adapter createContentChangeDetailFacadeAdapter() {
        return null;
    }
    
    public Adapter createExecutableBitChangeDetailAdapter() {
        return null;
    }
    
    public Adapter createExecutableBitChangeDetailFacadeAdapter() {
        return null;
    }
    
    public Adapter createContentTypeChangeDetailAdapter() {
        return null;
    }
    
    public Adapter createContentTypeChangeDetailFacadeAdapter() {
        return null;
    }
    
    public Adapter createLineDelimiterChangeDetailAdapter() {
        return null;
    }
    
    public Adapter createLineDelimiterChangeDetailFacadeAdapter() {
        return null;
    }
    
    public Adapter createEncodingChangeDetailAdapter() {
        return null;
    }
    
    public Adapter createEncodingChangeDetailFacadeAdapter() {
        return null;
    }
    
    public Adapter createChangeDetailFacadeAdapter() {
        return null;
    }
    
    public Adapter createChangeDetailAdapter() {
        return null;
    }
    
    public Adapter createOverlapResponseAdapter() {
        return null;
    }
    
    public Adapter createEObjectAdapter() {
        return null;
    }
}
