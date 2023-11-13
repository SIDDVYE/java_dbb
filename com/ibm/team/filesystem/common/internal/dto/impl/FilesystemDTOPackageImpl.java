// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import org.eclipse.emf.ecore.ENamedElement;
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
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.dto.Resolution;
import com.ibm.team.repository.common.model.RepositoryPackage;
import com.ibm.team.scm.common.internal.ScmPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import com.ibm.team.scm.common.internal.dto2.ScmDto2Package;
import com.ibm.team.scm.common.internal.dto.ScmDtoPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemDTOPackageImpl extends EPackageImpl implements FilesystemDTOPackage
{
    private EClass resolutionEClass;
    private EClass logicalConflictReportEClass;
    private EClass logicalConflictReportFacadeEClass;
    private EClass logicalConflictEClass;
    private EClass logicalConflictFacadeEClass;
    private EClass logicalChangeEClass;
    private EClass logicalChangeFacadeEClass;
    private EClass fileAreaUpdateEClass;
    private EClass fileAreaUpdateFacadeEClass;
    private EClass conflictResolutionReportEClass;
    private EClass conflictResolutionEClass;
    private EClass basicChangeEClass;
    private EClass basicChangeFacadeEClass;
    private EClass changeSynopsisEClass;
    private EClass changeSynopsisFacadeEClass;
    private EClass changeSetSynopsisEClass;
    private EClass changeSetSynopsisFacadeEClass;
    private EClass loadTreeEClass;
    private EClass fileAreaUpdateReportEClass;
    private EClass overlapRequestEClass;
    private EClass overlapDescriptionEClass;
    private EClass compareResultEClass;
    private EClass compareResultFacadeEClass;
    private EClass sharePointEClass;
    private EClass conflictResolution2EClass;
    private EClass inaccessibleEClass;
    private EClass fileAreaUpdateReport2EClass;
    private EClass localChangeUndoReportEClass;
    private EClass symbolicLinkChangeDetailEClass;
    private EClass symbolicLinkChangeDetailFacadeEClass;
    private EClass contentChangeDetailEClass;
    private EClass contentChangeDetailFacadeEClass;
    private EClass executableBitChangeDetailEClass;
    private EClass executableBitChangeDetailFacadeEClass;
    private EClass contentTypeChangeDetailEClass;
    private EClass contentTypeChangeDetailFacadeEClass;
    private EClass lineDelimiterChangeDetailEClass;
    private EClass lineDelimiterChangeDetailFacadeEClass;
    private EClass encodingChangeDetailEClass;
    private EClass encodingChangeDetailFacadeEClass;
    private EClass overlapResponseEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemDTOPackageImpl.isInited = false;
    }
    
    private FilesystemDTOPackageImpl() {
        super("com.ibm.team.filesystem.dto", (EFactory)FilesystemDTOFactory.eINSTANCE);
        this.resolutionEClass = null;
        this.logicalConflictReportEClass = null;
        this.logicalConflictReportFacadeEClass = null;
        this.logicalConflictEClass = null;
        this.logicalConflictFacadeEClass = null;
        this.logicalChangeEClass = null;
        this.logicalChangeFacadeEClass = null;
        this.fileAreaUpdateEClass = null;
        this.fileAreaUpdateFacadeEClass = null;
        this.conflictResolutionReportEClass = null;
        this.conflictResolutionEClass = null;
        this.basicChangeEClass = null;
        this.basicChangeFacadeEClass = null;
        this.changeSynopsisEClass = null;
        this.changeSynopsisFacadeEClass = null;
        this.changeSetSynopsisEClass = null;
        this.changeSetSynopsisFacadeEClass = null;
        this.loadTreeEClass = null;
        this.fileAreaUpdateReportEClass = null;
        this.overlapRequestEClass = null;
        this.overlapDescriptionEClass = null;
        this.compareResultEClass = null;
        this.compareResultFacadeEClass = null;
        this.sharePointEClass = null;
        this.conflictResolution2EClass = null;
        this.inaccessibleEClass = null;
        this.fileAreaUpdateReport2EClass = null;
        this.localChangeUndoReportEClass = null;
        this.symbolicLinkChangeDetailEClass = null;
        this.symbolicLinkChangeDetailFacadeEClass = null;
        this.contentChangeDetailEClass = null;
        this.contentChangeDetailFacadeEClass = null;
        this.executableBitChangeDetailEClass = null;
        this.executableBitChangeDetailFacadeEClass = null;
        this.contentTypeChangeDetailEClass = null;
        this.contentTypeChangeDetailFacadeEClass = null;
        this.lineDelimiterChangeDetailEClass = null;
        this.lineDelimiterChangeDetailFacadeEClass = null;
        this.encodingChangeDetailEClass = null;
        this.encodingChangeDetailFacadeEClass = null;
        this.overlapResponseEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemDTOPackage init() {
        if (FilesystemDTOPackageImpl.isInited) {
            return (FilesystemDTOPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.dto");
        }
        final FilesystemDTOPackageImpl theFilesystemDTOPackage = (FilesystemDTOPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.dto") instanceof FilesystemDTOPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.dto") : new FilesystemDTOPackageImpl());
        FilesystemDTOPackageImpl.isInited = true;
        ScmDtoPackage.eINSTANCE.eClass();
        ScmDto2Package.eINSTANCE.eClass();
        FilesystemPackage.eINSTANCE.eClass();
        theFilesystemDTOPackage.createPackageContents();
        theFilesystemDTOPackage.initializePackageContents();
        theFilesystemDTOPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.dto", (Object)theFilesystemDTOPackage);
        return theFilesystemDTOPackage;
    }
    
    public EClass getResolution() {
        return this.resolutionEClass;
    }
    
    public EReference getResolution_UpdateReport() {
        return (EReference)this.resolutionEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getResolution_ChangeSet() {
        return (EReference)this.resolutionEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getLogicalConflictReport() {
        return this.logicalConflictReportEClass;
    }
    
    public EReference getLogicalConflictReport_Conflicts() {
        return (EReference)this.logicalConflictReportEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getLogicalConflictReport_PendingChanges() {
        return (EReference)this.logicalConflictReportEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getLogicalConflictReport_DeferredChanges() {
        return (EReference)this.logicalConflictReportEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getLogicalConflictReport_ConflictReport() {
        return (EReference)this.logicalConflictReportEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getLogicalConflictReportFacade() {
        return this.logicalConflictReportFacadeEClass;
    }
    
    public EClass getLogicalConflict() {
        return this.logicalConflictEClass;
    }
    
    public EReference getLogicalConflict_Conflicts() {
        return (EReference)this.logicalConflictEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getLogicalConflict_ConflictType() {
        return (EAttribute)this.logicalConflictEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getLogicalConflict_SelectedChangeDetails() {
        return (EAttribute)this.logicalConflictEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getLogicalConflictFacade() {
        return this.logicalConflictFacadeEClass;
    }
    
    public EClass getLogicalChange() {
        return this.logicalChangeEClass;
    }
    
    public EAttribute getLogicalChange_Id() {
        return (EAttribute)this.logicalChangeEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getLogicalChange_DependentChanges() {
        return (EAttribute)this.logicalChangeEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getLogicalChange_RelatedChanges() {
        return (EAttribute)this.logicalChangeEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getLogicalChange_Kind() {
        return (EAttribute)this.logicalChangeEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getLogicalChangeFacade() {
        return this.logicalChangeFacadeEClass;
    }
    
    public EClass getFileAreaUpdate() {
        return this.fileAreaUpdateEClass;
    }
    
    public EReference getFileAreaUpdate_OptionalContent() {
        return (EReference)this.fileAreaUpdateEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getFileAreaUpdateFacade() {
        return this.fileAreaUpdateFacadeEClass;
    }
    
    public EAttribute getFileAreaUpdate_Executable() {
        return (EAttribute)this.fileAreaUpdateEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getFileAreaUpdate_Properties() {
        return (EReference)this.fileAreaUpdateEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getConflictResolutionReport() {
        return this.conflictResolutionReportEClass;
    }
    
    public EReference getConflictResolutionReport_Resolutions() {
        return (EReference)this.conflictResolutionReportEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getConflictResolution() {
        return this.conflictResolutionEClass;
    }
    
    public EReference getConflictResolution_Parent() {
        return (EReference)this.conflictResolutionEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getConflictResolution_Item() {
        return (EReference)this.conflictResolutionEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getConflictResolution_Name() {
        return (EAttribute)this.conflictResolutionEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getConflictResolution_ConflictType() {
        return (EAttribute)this.conflictResolutionEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getBasicChange() {
        return this.basicChangeEClass;
    }
    
    public EReference getBasicChange_Component() {
        return (EReference)this.basicChangeEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getBasicChange_ChangeType() {
        return (EAttribute)this.basicChangeEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getBasicChange_Name() {
        return (EAttribute)this.basicChangeEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getBasicChange_OldName() {
        return (EAttribute)this.basicChangeEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getBasicChange_Item() {
        return (EReference)this.basicChangeEClass.getEStructuralFeatures().get(4);
    }
    
    public EReference getBasicChange_SourceParent() {
        return (EReference)this.basicChangeEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getBasicChange_DestinationParent() {
        return (EReference)this.basicChangeEClass.getEStructuralFeatures().get(6);
    }
    
    public EAttribute getBasicChange_Before() {
        return (EAttribute)this.basicChangeEClass.getEStructuralFeatures().get(7);
    }
    
    public EAttribute getBasicChange_After() {
        return (EAttribute)this.basicChangeEClass.getEStructuralFeatures().get(8);
    }
    
    public EReference getBasicChange_PreviousComponent() {
        return (EReference)this.basicChangeEClass.getEStructuralFeatures().get(9);
    }
    
    public EAttribute getBasicChange_ChangeDetails() {
        return (EAttribute)this.basicChangeEClass.getEStructuralFeatures().get(10);
    }
    
    public EClass getBasicChangeFacade() {
        return this.basicChangeFacadeEClass;
    }
    
    public EClass getChangeSynopsis() {
        return this.changeSynopsisEClass;
    }
    
    public EReference getChangeSynopsis_SourceParentPath() {
        return (EReference)this.changeSynopsisEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getChangeSynopsis_DestinationParentPath() {
        return (EReference)this.changeSynopsisEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getChangeSynopsisFacade() {
        return this.changeSynopsisFacadeEClass;
    }
    
    public EClass getChangeSetSynopsis() {
        return this.changeSetSynopsisEClass;
    }
    
    public EReference getChangeSetSynopsis_Changes() {
        return (EReference)this.changeSetSynopsisEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getChangeSetSynopsis_UnderlyingChangeSet() {
        return (EReference)this.changeSetSynopsisEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getChangeSetSynopsis_Component() {
        return (EReference)this.changeSetSynopsisEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getChangeSetSynopsisFacade() {
        return this.changeSetSynopsisFacadeEClass;
    }
    
    public EClass getLoadTree() {
        return this.loadTreeEClass;
    }
    
    public EReference getLoadTree_FileAreaUpdates() {
        return (EReference)this.loadTreeEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getLoadTree_ConfigurationState() {
        return (EReference)this.loadTreeEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getLoadTree_Inaccessible() {
        return (EReference)this.loadTreeEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getFileAreaUpdateReport() {
        return this.fileAreaUpdateReportEClass;
    }
    
    public EReference getFileAreaUpdateReport_Adds() {
        return (EReference)this.fileAreaUpdateReportEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getFileAreaUpdateReport_Moves() {
        return (EReference)this.fileAreaUpdateReportEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getFileAreaUpdateReport_Deletes() {
        return (EReference)this.fileAreaUpdateReportEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getFileAreaUpdateReport_Modifies() {
        return (EReference)this.fileAreaUpdateReportEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getFileAreaUpdateReport_ShareParents() {
        return (EReference)this.fileAreaUpdateReportEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getFileAreaUpdateReport_CopyFileAreasWithOverlaps() {
        return (EAttribute)this.fileAreaUpdateReportEClass.getEStructuralFeatures().get(5);
    }
    
    public EReference getFileAreaUpdateReport_Overlaps() {
        return (EReference)this.fileAreaUpdateReportEClass.getEStructuralFeatures().get(6);
    }
    
    public EClass getOverlapRequest() {
        return this.overlapRequestEClass;
    }
    
    public EReference getOverlapRequest_Workspace() {
        return (EReference)this.overlapRequestEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getOverlapRequest_Component() {
        return (EReference)this.overlapRequestEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getOverlapRequest_Baseline() {
        return (EReference)this.overlapRequestEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getOverlapRequest_Group() {
        return (EReference)this.overlapRequestEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getOverlapDescription() {
        return this.overlapDescriptionEClass;
    }
    
    public EReference getOverlapDescription_Element() {
        return (EReference)this.overlapDescriptionEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getOverlapDescription_OverlappedChildren() {
        return (EReference)this.overlapDescriptionEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getCompareResult() {
        return this.compareResultEClass;
    }
    
    public EReference getCompareResult_SyncReport() {
        return (EReference)this.compareResultEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getCompareResult_LogicalConflictReport() {
        return (EReference)this.compareResultEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getCompareResult_ItemNWayConflictReports() {
        return (EReference)this.compareResultEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getCompareResultFacade() {
        return this.compareResultFacadeEClass;
    }
    
    public EClass getSharePoint() {
        return this.sharePointEClass;
    }
    
    public EReference getSharePoint_Workspace() {
        return (EReference)this.sharePointEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getSharePoint_Baseline() {
        return (EReference)this.sharePointEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getSharePoint_Component() {
        return (EReference)this.sharePointEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getSharePoint_Versionable() {
        return (EReference)this.sharePointEClass.getEStructuralFeatures().get(3);
    }
    
    public EAttribute getSharePoint_CopyFileArea() {
        return (EAttribute)this.sharePointEClass.getEStructuralFeatures().get(4);
    }
    
    public EAttribute getSharePoint_RelativePath() {
        return (EAttribute)this.sharePointEClass.getEStructuralFeatures().get(5);
    }
    
    public EClass getConflictResolution2() {
        return this.conflictResolution2EClass;
    }
    
    public EReference getConflictResolution2_Component() {
        return (EReference)this.conflictResolution2EClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getConflictResolution2_Item() {
        return (EReference)this.conflictResolution2EClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getConflictResolution2_Parent() {
        return (EReference)this.conflictResolution2EClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getConflictResolution2_Name() {
        return (EAttribute)this.conflictResolution2EClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getInaccessible() {
        return this.inaccessibleEClass;
    }
    
    public EReference getInaccessible_Requests() {
        return (EReference)this.inaccessibleEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getFileAreaUpdateReport2() {
        return this.fileAreaUpdateReport2EClass;
    }
    
    public EReference getFileAreaUpdateReport2_Adds() {
        return (EReference)this.fileAreaUpdateReport2EClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getFileAreaUpdateReport2_Moves() {
        return (EReference)this.fileAreaUpdateReport2EClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getFileAreaUpdateReport2_Deletes() {
        return (EReference)this.fileAreaUpdateReport2EClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getFileAreaUpdateReport2_Modifies() {
        return (EReference)this.fileAreaUpdateReport2EClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getLocalChangeUndoReport() {
        return this.localChangeUndoReportEClass;
    }
    
    public EReference getLocalChangeUndoReport_Updates() {
        return (EReference)this.localChangeUndoReportEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getLocalChangeUndoReport_ConfigurationState() {
        return (EReference)this.localChangeUndoReportEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getLocalChangeUndoReport_Inaccessible() {
        return (EReference)this.localChangeUndoReportEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getSymbolicLinkChangeDetail() {
        return this.symbolicLinkChangeDetailEClass;
    }
    
    public EAttribute getSymbolicLinkChangeDetail_BeforeTarget() {
        return (EAttribute)this.symbolicLinkChangeDetailEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getSymbolicLinkChangeDetail_AfterTarget() {
        return (EAttribute)this.symbolicLinkChangeDetailEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getSymbolicLinkChangeDetail_BeforeDirectory() {
        return (EAttribute)this.symbolicLinkChangeDetailEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getSymbolicLinkChangeDetail_AfterDirectory() {
        return (EAttribute)this.symbolicLinkChangeDetailEClass.getEStructuralFeatures().get(3);
    }
    
    public EClass getSymbolicLinkChangeDetailFacade() {
        return this.symbolicLinkChangeDetailFacadeEClass;
    }
    
    public EClass getContentChangeDetail() {
        return this.contentChangeDetailEClass;
    }
    
    public EAttribute getContentChangeDetail_BeforeHashString() {
        return (EAttribute)this.contentChangeDetailEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getContentChangeDetail_AfterHashString() {
        return (EAttribute)this.contentChangeDetailEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getContentChangeDetailFacade() {
        return this.contentChangeDetailFacadeEClass;
    }
    
    public EClass getExecutableBitChangeDetail() {
        return this.executableBitChangeDetailEClass;
    }
    
    public EAttribute getExecutableBitChangeDetail_Executable() {
        return (EAttribute)this.executableBitChangeDetailEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getExecutableBitChangeDetailFacade() {
        return this.executableBitChangeDetailFacadeEClass;
    }
    
    public EClass getContentTypeChangeDetail() {
        return this.contentTypeChangeDetailEClass;
    }
    
    public EAttribute getContentTypeChangeDetail_BeforeContentType() {
        return (EAttribute)this.contentTypeChangeDetailEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getContentTypeChangeDetail_AfterContentType() {
        return (EAttribute)this.contentTypeChangeDetailEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getContentTypeChangeDetailFacade() {
        return this.contentTypeChangeDetailFacadeEClass;
    }
    
    public EClass getLineDelimiterChangeDetail() {
        return this.lineDelimiterChangeDetailEClass;
    }
    
    public EAttribute getLineDelimiterChangeDetail_BeforeLineDelimiterValue() {
        return (EAttribute)this.lineDelimiterChangeDetailEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getLineDelimiterChangeDetail_AfterLineDelimiterValue() {
        return (EAttribute)this.lineDelimiterChangeDetailEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getLineDelimiterChangeDetailFacade() {
        return this.lineDelimiterChangeDetailFacadeEClass;
    }
    
    public EClass getEncodingChangeDetail() {
        return this.encodingChangeDetailEClass;
    }
    
    public EAttribute getEncodingChangeDetail_BeforeCharacterEncoding() {
        return (EAttribute)this.encodingChangeDetailEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getEncodingChangeDetail_AfterCharacterEncoding() {
        return (EAttribute)this.encodingChangeDetailEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getEncodingChangeDetailFacade() {
        return this.encodingChangeDetailFacadeEClass;
    }
    
    public EClass getOverlapResponse() {
        return this.overlapResponseEClass;
    }
    
    public EReference getOverlapResponse_Workspace() {
        return (EReference)this.overlapResponseEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getOverlapResponse_Component() {
        return (EReference)this.overlapResponseEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getOverlapResponse_Baseline() {
        return (EReference)this.overlapResponseEClass.getEStructuralFeatures().get(2);
    }
    
    public EReference getOverlapResponse_OverlapDescriptions() {
        return (EReference)this.overlapResponseEClass.getEStructuralFeatures().get(3);
    }
    
    public EReference getOverlapResponse_AncestorReports() {
        return (EReference)this.overlapResponseEClass.getEStructuralFeatures().get(4);
    }
    
    public FilesystemDTOFactory getFilesystemDTOFactory() {
        return (FilesystemDTOFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEReference(this.resolutionEClass = this.createEClass(0), 0);
        this.createEReference(this.resolutionEClass, 1);
        this.createEReference(this.logicalConflictReportEClass = this.createEClass(1), 0);
        this.createEReference(this.logicalConflictReportEClass, 1);
        this.createEReference(this.logicalConflictReportEClass, 2);
        this.createEReference(this.logicalConflictReportEClass, 3);
        this.logicalConflictReportFacadeEClass = this.createEClass(2);
        this.createEReference(this.logicalConflictEClass = this.createEClass(3), 17);
        this.createEAttribute(this.logicalConflictEClass, 18);
        this.createEAttribute(this.logicalConflictEClass, 19);
        this.logicalConflictFacadeEClass = this.createEClass(4);
        this.createEAttribute(this.logicalChangeEClass = this.createEClass(5), 13);
        this.createEAttribute(this.logicalChangeEClass, 14);
        this.createEAttribute(this.logicalChangeEClass, 15);
        this.createEAttribute(this.logicalChangeEClass, 16);
        this.logicalChangeFacadeEClass = this.createEClass(6);
        this.createEAttribute(this.fileAreaUpdateEClass = this.createEClass(7), 11);
        this.createEReference(this.fileAreaUpdateEClass, 12);
        this.createEReference(this.fileAreaUpdateEClass, 13);
        this.fileAreaUpdateFacadeEClass = this.createEClass(8);
        this.createEReference(this.conflictResolutionReportEClass = this.createEClass(9), 0);
        this.createEReference(this.conflictResolutionEClass = this.createEClass(10), 0);
        this.createEReference(this.conflictResolutionEClass, 1);
        this.createEAttribute(this.conflictResolutionEClass, 2);
        this.createEAttribute(this.conflictResolutionEClass, 3);
        this.createEReference(this.basicChangeEClass = this.createEClass(11), 0);
        this.createEAttribute(this.basicChangeEClass, 1);
        this.createEAttribute(this.basicChangeEClass, 2);
        this.createEAttribute(this.basicChangeEClass, 3);
        this.createEReference(this.basicChangeEClass, 4);
        this.createEReference(this.basicChangeEClass, 5);
        this.createEReference(this.basicChangeEClass, 6);
        this.createEAttribute(this.basicChangeEClass, 7);
        this.createEAttribute(this.basicChangeEClass, 8);
        this.createEReference(this.basicChangeEClass, 9);
        this.createEAttribute(this.basicChangeEClass, 10);
        this.basicChangeFacadeEClass = this.createEClass(12);
        this.createEReference(this.changeSynopsisEClass = this.createEClass(13), 11);
        this.createEReference(this.changeSynopsisEClass, 12);
        this.changeSynopsisFacadeEClass = this.createEClass(14);
        this.createEReference(this.changeSetSynopsisEClass = this.createEClass(15), 0);
        this.createEReference(this.changeSetSynopsisEClass, 1);
        this.createEReference(this.changeSetSynopsisEClass, 2);
        this.changeSetSynopsisFacadeEClass = this.createEClass(16);
        this.createEReference(this.loadTreeEClass = this.createEClass(17), 0);
        this.createEReference(this.loadTreeEClass, 1);
        this.createEReference(this.loadTreeEClass, 2);
        this.createEReference(this.overlapRequestEClass = this.createEClass(18), 0);
        this.createEReference(this.overlapRequestEClass, 1);
        this.createEReference(this.overlapRequestEClass, 2);
        this.createEReference(this.overlapRequestEClass, 3);
        this.createEReference(this.overlapResponseEClass = this.createEClass(19), 0);
        this.createEReference(this.overlapResponseEClass, 1);
        this.createEReference(this.overlapResponseEClass, 2);
        this.createEReference(this.overlapResponseEClass, 3);
        this.createEReference(this.overlapResponseEClass, 4);
        this.createEReference(this.overlapDescriptionEClass = this.createEClass(20), 0);
        this.createEReference(this.overlapDescriptionEClass, 1);
        this.createEReference(this.compareResultEClass = this.createEClass(21), 0);
        this.createEReference(this.compareResultEClass, 1);
        this.createEReference(this.compareResultEClass, 2);
        this.compareResultFacadeEClass = this.createEClass(22);
        this.createEReference(this.fileAreaUpdateReportEClass = this.createEClass(23), 0);
        this.createEReference(this.fileAreaUpdateReportEClass, 1);
        this.createEReference(this.fileAreaUpdateReportEClass, 2);
        this.createEReference(this.fileAreaUpdateReportEClass, 3);
        this.createEReference(this.fileAreaUpdateReportEClass, 4);
        this.createEAttribute(this.fileAreaUpdateReportEClass, 5);
        this.createEReference(this.fileAreaUpdateReportEClass, 6);
        this.createEReference(this.sharePointEClass = this.createEClass(24), 0);
        this.createEReference(this.sharePointEClass, 1);
        this.createEReference(this.sharePointEClass, 2);
        this.createEReference(this.sharePointEClass, 3);
        this.createEAttribute(this.sharePointEClass, 4);
        this.createEAttribute(this.sharePointEClass, 5);
        this.createEReference(this.conflictResolution2EClass = this.createEClass(25), 0);
        this.createEReference(this.conflictResolution2EClass, 1);
        this.createEReference(this.conflictResolution2EClass, 2);
        this.createEAttribute(this.conflictResolution2EClass, 3);
        this.createEReference(this.inaccessibleEClass = this.createEClass(26), 0);
        this.createEReference(this.fileAreaUpdateReport2EClass = this.createEClass(27), 0);
        this.createEReference(this.fileAreaUpdateReport2EClass, 1);
        this.createEReference(this.fileAreaUpdateReport2EClass, 2);
        this.createEReference(this.fileAreaUpdateReport2EClass, 3);
        this.createEReference(this.localChangeUndoReportEClass = this.createEClass(28), 0);
        this.createEReference(this.localChangeUndoReportEClass, 1);
        this.createEReference(this.localChangeUndoReportEClass, 2);
        this.createEAttribute(this.symbolicLinkChangeDetailEClass = this.createEClass(29), 4);
        this.createEAttribute(this.symbolicLinkChangeDetailEClass, 5);
        this.createEAttribute(this.symbolicLinkChangeDetailEClass, 6);
        this.createEAttribute(this.symbolicLinkChangeDetailEClass, 7);
        this.symbolicLinkChangeDetailFacadeEClass = this.createEClass(30);
        this.createEAttribute(this.contentChangeDetailEClass = this.createEClass(31), 4);
        this.createEAttribute(this.contentChangeDetailEClass, 5);
        this.contentChangeDetailFacadeEClass = this.createEClass(32);
        this.createEAttribute(this.executableBitChangeDetailEClass = this.createEClass(33), 4);
        this.executableBitChangeDetailFacadeEClass = this.createEClass(34);
        this.createEAttribute(this.contentTypeChangeDetailEClass = this.createEClass(35), 4);
        this.createEAttribute(this.contentTypeChangeDetailEClass, 5);
        this.contentTypeChangeDetailFacadeEClass = this.createEClass(36);
        this.createEAttribute(this.lineDelimiterChangeDetailEClass = this.createEClass(37), 4);
        this.createEAttribute(this.lineDelimiterChangeDetailEClass, 5);
        this.lineDelimiterChangeDetailFacadeEClass = this.createEClass(38);
        this.createEAttribute(this.encodingChangeDetailEClass = this.createEClass(39), 4);
        this.createEAttribute(this.encodingChangeDetailEClass, 5);
        this.encodingChangeDetailFacadeEClass = this.createEClass(40);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("dto");
        this.setNsPrefix("filesystemDTO");
        this.setNsURI("com.ibm.team.filesystem.dto");
        final ScmDtoPackage theScmDtoPackage = (ScmDtoPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.scm.dto");
        final ScmPackage theScmPackage = (ScmPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.scm");
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.repository");
        final FilesystemPackage theFilesystemPackage = (FilesystemPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem");
        final ScmDto2Package theScmDto2Package = (ScmDto2Package)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.scm.dto2");
        this.logicalConflictReportEClass.getESuperTypes().add((Object)this.getLogicalConflictReportFacade());
        this.logicalConflictEClass.getESuperTypes().add((Object)this.getLogicalChange());
        this.logicalConflictEClass.getESuperTypes().add((Object)this.getLogicalConflictFacade());
        this.logicalChangeEClass.getESuperTypes().add((Object)this.getChangeSynopsis());
        this.logicalChangeEClass.getESuperTypes().add((Object)this.getLogicalChangeFacade());
        this.fileAreaUpdateEClass.getESuperTypes().add((Object)this.getBasicChange());
        this.fileAreaUpdateEClass.getESuperTypes().add((Object)this.getFileAreaUpdateFacade());
        this.basicChangeEClass.getESuperTypes().add((Object)this.getBasicChangeFacade());
        this.changeSynopsisEClass.getESuperTypes().add((Object)this.getBasicChange());
        this.changeSynopsisEClass.getESuperTypes().add((Object)this.getChangeSynopsisFacade());
        this.changeSetSynopsisEClass.getESuperTypes().add((Object)this.getChangeSetSynopsisFacade());
        this.compareResultEClass.getESuperTypes().add((Object)this.getCompareResultFacade());
        this.symbolicLinkChangeDetailEClass.getESuperTypes().add((Object)theScmDto2Package.getChangeDetail());
        this.symbolicLinkChangeDetailEClass.getESuperTypes().add((Object)this.getSymbolicLinkChangeDetailFacade());
        this.contentChangeDetailEClass.getESuperTypes().add((Object)theScmDto2Package.getChangeDetail());
        this.contentChangeDetailEClass.getESuperTypes().add((Object)this.getContentChangeDetailFacade());
        this.executableBitChangeDetailEClass.getESuperTypes().add((Object)theScmDto2Package.getChangeDetail());
        this.executableBitChangeDetailEClass.getESuperTypes().add((Object)this.getExecutableBitChangeDetailFacade());
        this.contentTypeChangeDetailEClass.getESuperTypes().add((Object)theScmDto2Package.getChangeDetail());
        this.contentTypeChangeDetailEClass.getESuperTypes().add((Object)this.getContentTypeChangeDetailFacade());
        this.lineDelimiterChangeDetailEClass.getESuperTypes().add((Object)theScmDto2Package.getChangeDetail());
        this.lineDelimiterChangeDetailEClass.getESuperTypes().add((Object)this.getLineDelimiterChangeDetailFacade());
        this.encodingChangeDetailEClass.getESuperTypes().add((Object)theScmDto2Package.getChangeDetail());
        this.encodingChangeDetailEClass.getESuperTypes().add((Object)this.getEncodingChangeDetailFacade());
        this.initEClass(this.resolutionEClass, (Class)Resolution.class, "Resolution", false, false, true);
        this.initEReference(this.getResolution_UpdateReport(), (EClassifier)theScmDtoPackage.getUpdateReportFacade(), (EReference)null, "updateReport", (String)null, 1, 1, (Class)Resolution.class, false, false, true, true, false, true, false, false, false);
        this.initEReference(this.getResolution_ChangeSet(), (EClassifier)theScmPackage.getChangeSetHandleFacade(), (EReference)null, "changeSet", (String)null, 1, -1, (Class)Resolution.class, false, false, true, false, true, true, true, false, false);
        this.initEClass(this.logicalConflictReportEClass, (Class)LogicalConflictReport.class, "LogicalConflictReport", false, false, true);
        this.initEReference(this.getLogicalConflictReport_Conflicts(), (EClassifier)this.getLogicalConflictFacade(), (EReference)null, "conflicts", (String)null, 0, -1, (Class)LogicalConflictReport.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLogicalConflictReport_PendingChanges(), (EClassifier)this.getLogicalChangeFacade(), (EReference)null, "pendingChanges", (String)null, 0, -1, (Class)LogicalConflictReport.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLogicalConflictReport_DeferredChanges(), (EClassifier)this.getLogicalChangeFacade(), (EReference)null, "deferredChanges", (String)null, 0, -1, (Class)LogicalConflictReport.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLogicalConflictReport_ConflictReport(), (EClassifier)theScmDtoPackage.getUpdateReportFacade(), (EReference)null, "conflictReport", (String)null, 1, 1, (Class)LogicalConflictReport.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.logicalConflictReportFacadeEClass, (Class)ILogicalConflictReport.class, "LogicalConflictReportFacade", true, true, false);
        this.initEClass(this.logicalConflictEClass, (Class)LogicalConflict.class, "LogicalConflict", false, false, true);
        this.initEReference(this.getLogicalConflict_Conflicts(), (EClassifier)theScmPackage.getVersionableHandleFacade(), (EReference)null, "conflicts", (String)null, 0, -1, (Class)LogicalConflict.class, false, false, true, false, true, true, false, false, false);
        this.initEAttribute(this.getLogicalConflict_ConflictType(), (EClassifier)this.ecorePackage.getEInt(), "conflictType", (String)null, 1, 1, (Class)LogicalConflict.class, false, false, true, true, false, false, false, false);
        this.initEAttribute(this.getLogicalConflict_SelectedChangeDetails(), (EClassifier)this.ecorePackage.getEInt(), "selectedChangeDetails", (String)null, 0, 1, (Class)LogicalConflict.class, false, false, true, true, false, false, false, false);
        this.initEClass(this.logicalConflictFacadeEClass, (Class)ILogicalConflict.class, "LogicalConflictFacade", true, true, false);
        this.initEClass(this.logicalChangeEClass, (Class)LogicalChange.class, "LogicalChange", false, false, true);
        this.initEAttribute(this.getLogicalChange_Id(), (EClassifier)theRepositoryPackage.getUUID(), "id", (String)null, 1, 1, (Class)LogicalChange.class, false, false, true, true, false, true, false, false);
        this.initEAttribute(this.getLogicalChange_DependentChanges(), (EClassifier)theRepositoryPackage.getUUID(), "dependentChanges", (String)null, 0, -1, (Class)LogicalChange.class, false, false, true, true, false, false, false, false);
        this.initEAttribute(this.getLogicalChange_RelatedChanges(), (EClassifier)theRepositoryPackage.getUUID(), "relatedChanges", (String)null, 0, -1, (Class)LogicalChange.class, false, false, true, true, false, false, false, false);
        this.initEAttribute(this.getLogicalChange_Kind(), (EClassifier)this.ecorePackage.getEInt(), "kind", (String)null, 1, 1, (Class)LogicalChange.class, false, false, true, true, false, true, false, false);
        this.initEClass(this.logicalChangeFacadeEClass, (Class)ILogicalChange.class, "LogicalChangeFacade", true, true, false);
        this.initEClass(this.fileAreaUpdateEClass, (Class)FileAreaUpdate.class, "FileAreaUpdate", false, false, true);
        this.initEAttribute(this.getFileAreaUpdate_Executable(), (EClassifier)this.ecorePackage.getEBoolean(), "executable", (String)null, 0, 1, (Class)FileAreaUpdate.class, false, false, true, true, false, false, false, false);
        this.initEReference(this.getFileAreaUpdate_Properties(), (EClassifier)theScmPackage.getProperty(), (EReference)null, "properties", (String)null, 0, -1, (Class)FileAreaUpdate.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getFileAreaUpdate_OptionalContent(), (EClassifier)theFilesystemPackage.getFileContentFacade(), (EReference)null, "optionalContent", (String)null, 0, 1, (Class)FileAreaUpdate.class, false, false, true, true, false, true, false, false, true);
        this.initEClass(this.fileAreaUpdateFacadeEClass, (Class)IFileAreaUpdate.class, "FileAreaUpdateFacade", true, true, false);
        this.initEClass(this.conflictResolutionReportEClass, (Class)ConflictResolutionReport.class, "ConflictResolutionReport", false, false, true);
        this.initEReference(this.getConflictResolutionReport_Resolutions(), (EClassifier)this.getResolution(), (EReference)null, "resolutions", (String)null, 0, -1, (Class)ConflictResolutionReport.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.conflictResolutionEClass, (Class)ConflictResolution.class, "ConflictResolution", false, false, true);
        this.initEReference(this.getConflictResolution_Parent(), (EClassifier)theScmPackage.getFolderHandleFacade(), (EReference)null, "parent", (String)null, 1, 1, (Class)ConflictResolution.class, false, false, true, false, true, true, true, false, false);
        this.initEReference(this.getConflictResolution_Item(), (EClassifier)theScmPackage.getVersionableHandleFacade(), (EReference)null, "item", (String)null, 1, 1, (Class)ConflictResolution.class, false, false, true, false, true, true, true, false, false);
        this.initEAttribute(this.getConflictResolution_Name(), (EClassifier)this.ecorePackage.getEString(), "name", "", 1, 1, (Class)ConflictResolution.class, false, false, true, true, false, true, false, false);
        this.initEAttribute(this.getConflictResolution_ConflictType(), (EClassifier)this.ecorePackage.getEInt(), "conflictType", (String)null, 1, 1, (Class)ConflictResolution.class, false, false, true, true, false, true, false, false);
        this.initEClass(this.basicChangeEClass, (Class)BasicChange.class, "BasicChange", false, false, true);
        this.initEReference(this.getBasicChange_Component(), (EClassifier)theScmPackage.getComponentHandleFacade(), (EReference)null, "component", (String)null, 1, 1, (Class)BasicChange.class, false, false, true, false, true, true, true, false, false);
        this.initEAttribute(this.getBasicChange_ChangeType(), (EClassifier)this.ecorePackage.getEInt(), "changeType", (String)null, 1, 1, (Class)BasicChange.class, false, false, true, true, false, true, false, false);
        this.initEAttribute(this.getBasicChange_Name(), (EClassifier)this.ecorePackage.getEString(), "name", "", 1, 1, (Class)BasicChange.class, false, false, true, true, false, true, false, false);
        this.initEAttribute(this.getBasicChange_OldName(), (EClassifier)this.ecorePackage.getEString(), "oldName", "", 1, 1, (Class)BasicChange.class, false, false, true, true, false, true, false, false);
        this.initEReference(this.getBasicChange_Item(), (EClassifier)theScmPackage.getVersionableHandleFacade(), (EReference)null, "item", (String)null, 1, 1, (Class)BasicChange.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getBasicChange_SourceParent(), (EClassifier)theScmPackage.getFolderHandleFacade(), (EReference)null, "sourceParent", (String)null, 1, 1, (Class)BasicChange.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getBasicChange_DestinationParent(), (EClassifier)theScmPackage.getFolderHandleFacade(), (EReference)null, "destinationParent", (String)null, 1, 1, (Class)BasicChange.class, false, false, true, false, true, true, false, false, false);
        this.initEAttribute(this.getBasicChange_Before(), (EClassifier)theRepositoryPackage.getUUID(), "before", (String)null, 1, 1, (Class)BasicChange.class, false, false, true, true, false, true, false, false);
        this.initEAttribute(this.getBasicChange_After(), (EClassifier)theRepositoryPackage.getUUID(), "after", (String)null, 1, 1, (Class)BasicChange.class, false, false, true, true, false, true, false, false);
        this.initEReference(this.getBasicChange_PreviousComponent(), (EClassifier)theScmPackage.getComponentHandleFacade(), (EReference)null, "previousComponent", (String)null, 0, 1, (Class)BasicChange.class, false, false, true, false, true, true, false, false, false);
        this.initEAttribute(this.getBasicChange_ChangeDetails(), (EClassifier)this.ecorePackage.getEInt(), "changeDetails", (String)null, 0, 1, (Class)BasicChange.class, false, false, true, true, false, false, false, false);
        this.initEClass(this.basicChangeFacadeEClass, (Class)IBasicChange.class, "BasicChangeFacade", true, true, false);
        this.initEClass(this.changeSynopsisEClass, (Class)ChangeSynopsis.class, "ChangeSynopsis", false, false, true);
        this.initEReference(this.getChangeSynopsis_SourceParentPath(), (EClassifier)theScmDtoPackage.getNameItemPairFacade(), (EReference)null, "sourceParentPath", (String)null, 0, -1, (Class)ChangeSynopsis.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getChangeSynopsis_DestinationParentPath(), (EClassifier)theScmDtoPackage.getNameItemPairFacade(), (EReference)null, "destinationParentPath", (String)null, 0, -1, (Class)ChangeSynopsis.class, false, false, true, false, true, true, false, false, false);
        this.initEClass(this.changeSynopsisFacadeEClass, (Class)IChangeSummary.class, "ChangeSynopsisFacade", true, true, false);
        this.initEClass(this.changeSetSynopsisEClass, (Class)ChangeSetSynopsis.class, "ChangeSetSynopsis", false, false, true);
        this.initEReference(this.getChangeSetSynopsis_Changes(), (EClassifier)this.getChangeSynopsisFacade(), (EReference)null, "changes", (String)null, 0, -1, (Class)ChangeSetSynopsis.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getChangeSetSynopsis_UnderlyingChangeSet(), (EClassifier)theScmPackage.getChangeSetHandleFacade(), (EReference)null, "underlyingChangeSet", (String)null, 0, 1, (Class)ChangeSetSynopsis.class, false, false, true, false, true, true, true, false, false);
        this.initEReference(this.getChangeSetSynopsis_Component(), (EClassifier)theScmPackage.getComponentHandleFacade(), (EReference)null, "component", (String)null, 1, 1, (Class)ChangeSetSynopsis.class, false, false, true, false, true, true, true, false, false);
        this.initEClass(this.changeSetSynopsisFacadeEClass, (Class)IChangeSetSummary.class, "ChangeSetSynopsisFacade", true, true, false);
        this.initEClass(this.loadTreeEClass, (Class)LoadTree.class, "LoadTree", false, false, true);
        this.initEReference(this.getLoadTree_FileAreaUpdates(), (EClassifier)this.getFileAreaUpdateFacade(), (EReference)null, "fileAreaUpdates", (String)null, 0, -1, (Class)LoadTree.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLoadTree_ConfigurationState(), (EClassifier)theScmDtoPackage.getSynchronizationTimeFacade(), (EReference)null, "configurationState", (String)null, 1, 1, (Class)LoadTree.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getLoadTree_Inaccessible(), (EClassifier)this.getInaccessible(), (EReference)null, "inaccessible", (String)null, 0, 1, (Class)LoadTree.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.overlapRequestEClass, (Class)OverlapRequest.class, "OverlapRequest", false, false, true);
        this.initEReference(this.getOverlapRequest_Workspace(), (EClassifier)theScmPackage.getWorkspaceHandleFacade(), (EReference)null, "workspace", (String)null, 0, 1, (Class)OverlapRequest.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getOverlapRequest_Baseline(), (EClassifier)theScmPackage.getBaselineHandleFacade(), (EReference)null, "baseline", (String)null, 0, 1, (Class)OverlapRequest.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getOverlapRequest_Component(), (EClassifier)theScmPackage.getComponentHandleFacade(), (EReference)null, "component", (String)null, 1, 1, (Class)OverlapRequest.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getOverlapRequest_Group(), (EClassifier)theScmPackage.getVersionableHandleFacade(), (EReference)null, "group", (String)null, 0, -1, (Class)OverlapRequest.class, false, false, true, false, true, true, false, false, false);
        this.initEClass(this.overlapResponseEClass, (Class)OverlapResponse.class, "OverlapResponse", false, false, true);
        this.initEReference(this.getOverlapResponse_Workspace(), (EClassifier)theScmPackage.getWorkspaceHandleFacade(), (EReference)null, "workspace", (String)null, 0, 1, (Class)OverlapResponse.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getOverlapResponse_Component(), (EClassifier)theScmPackage.getComponentHandleFacade(), (EReference)null, "component", (String)null, 1, 1, (Class)OverlapResponse.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getOverlapResponse_Baseline(), (EClassifier)theScmPackage.getBaselineHandleFacade(), (EReference)null, "baseline", (String)null, 0, 1, (Class)OverlapResponse.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getOverlapResponse_OverlapDescriptions(), (EClassifier)this.getOverlapDescription(), (EReference)null, "overlapDescriptions", (String)null, 0, -1, (Class)OverlapResponse.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getOverlapResponse_AncestorReports(), (EClassifier)theScmDtoPackage.getAncestorReportFacade(), (EReference)null, "ancestorReports", (String)null, 1, -1, (Class)OverlapResponse.class, false, false, true, false, true, true, false, false, false);
        this.initEClass(this.overlapDescriptionEClass, (Class)OverlapDescription.class, "OverlapDescription", false, false, true);
        this.initEReference(this.getOverlapDescription_Element(), (EClassifier)theScmPackage.getVersionableHandleFacade(), (EReference)null, "element", (String)null, 1, 1, (Class)OverlapDescription.class, false, false, true, false, true, true, true, false, false);
        this.initEReference(this.getOverlapDescription_OverlappedChildren(), (EClassifier)theScmPackage.getVersionableHandleFacade(), (EReference)null, "overlappedChildren", (String)null, 1, -1, (Class)OverlapDescription.class, false, false, true, false, true, true, false, false, false);
        this.initEClass(this.compareResultEClass, (Class)CompareResult.class, "CompareResult", false, false, true);
        this.initEReference(this.getCompareResult_SyncReport(), (EClassifier)theScmDtoPackage.getChangeHistorySyncReportFacade(), (EReference)null, "syncReport", (String)null, 1, 1, (Class)CompareResult.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getCompareResult_LogicalConflictReport(), (EClassifier)this.getLogicalConflictReportFacade(), (EReference)null, "logicalConflictReport", (String)null, 1, 1, (Class)CompareResult.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getCompareResult_ItemNWayConflictReports(), (EClassifier)theScmDtoPackage.getItemNWayConflictReportFacade(), (EReference)null, "itemNWayConflictReports", (String)null, 0, -1, (Class)CompareResult.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.compareResultFacadeEClass, (Class)IWorkspaceCompareReport.class, "CompareResultFacade", true, true, false);
        this.initEClass(this.fileAreaUpdateReportEClass, (Class)FileAreaUpdateReport.class, "FileAreaUpdateReport", false, false, true);
        this.initEReference(this.getFileAreaUpdateReport_Adds(), (EClassifier)this.getFileAreaUpdateFacade(), (EReference)null, "adds", (String)null, 0, -1, (Class)FileAreaUpdateReport.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getFileAreaUpdateReport_Moves(), (EClassifier)this.getFileAreaUpdateFacade(), (EReference)null, "moves", (String)null, 0, -1, (Class)FileAreaUpdateReport.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getFileAreaUpdateReport_Deletes(), (EClassifier)this.getFileAreaUpdateFacade(), (EReference)null, "deletes", (String)null, 0, -1, (Class)FileAreaUpdateReport.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getFileAreaUpdateReport_Modifies(), (EClassifier)this.getFileAreaUpdateFacade(), (EReference)null, "modifies", (String)null, 0, -1, (Class)FileAreaUpdateReport.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getFileAreaUpdateReport_ShareParents(), (EClassifier)this.getSharePoint(), (EReference)null, "shareParents", (String)null, 0, -1, (Class)FileAreaUpdateReport.class, false, false, true, false, true, true, false, false, false);
        this.initEAttribute(this.getFileAreaUpdateReport_CopyFileAreasWithOverlaps(), (EClassifier)this.ecorePackage.getEString(), "copyFileAreasWithOverlaps", "", 0, -1, (Class)FileAreaUpdateReport.class, false, false, true, true, false, true, false, false);
        this.initEReference(this.getFileAreaUpdateReport_Overlaps(), (EClassifier)this.getOverlapResponse(), (EReference)null, "overlaps", (String)null, 0, -1, (Class)FileAreaUpdateReport.class, false, false, true, false, true, true, false, false, false);
        this.initEClass(this.sharePointEClass, (Class)SharePoint.class, "SharePoint", false, false, true);
        this.initEReference(this.getSharePoint_Workspace(), (EClassifier)theScmPackage.getWorkspaceHandleFacade(), (EReference)null, "workspace", (String)null, 0, 1, (Class)SharePoint.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getSharePoint_Baseline(), (EClassifier)theScmPackage.getBaselineHandleFacade(), (EReference)null, "baseline", (String)null, 0, 1, (Class)SharePoint.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getSharePoint_Component(), (EClassifier)theScmPackage.getComponentHandleFacade(), (EReference)null, "component", (String)null, 1, 1, (Class)SharePoint.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getSharePoint_Versionable(), (EClassifier)theScmPackage.getVersionableHandleFacade(), (EReference)null, "versionable", (String)null, 0, 1, (Class)SharePoint.class, false, false, true, false, true, true, false, false, false);
        this.initEAttribute(this.getSharePoint_CopyFileArea(), (EClassifier)this.ecorePackage.getEString(), "copyFileArea", "", 1, 1, (Class)SharePoint.class, false, false, true, true, false, true, false, false);
        this.initEAttribute(this.getSharePoint_RelativePath(), (EClassifier)this.ecorePackage.getEString(), "relativePath", "", 0, -1, (Class)SharePoint.class, false, false, true, true, false, true, false, false);
        this.initEClass(this.conflictResolution2EClass, (Class)ConflictResolution2.class, "ConflictResolution2", false, false, true);
        this.initEReference(this.getConflictResolution2_Component(), (EClassifier)theScmPackage.getComponentHandleFacade(), (EReference)null, "component", (String)null, 1, 1, (Class)ConflictResolution2.class, false, false, true, false, true, true, true, false, false);
        this.initEReference(this.getConflictResolution2_Item(), (EClassifier)theScmPackage.getVersionableHandleFacade(), (EReference)null, "item", (String)null, 1, 1, (Class)ConflictResolution2.class, false, false, true, false, true, true, true, false, false);
        this.initEReference(this.getConflictResolution2_Parent(), (EClassifier)theScmPackage.getFolderHandleFacade(), (EReference)null, "parent", (String)null, 1, 1, (Class)ConflictResolution2.class, false, false, true, false, true, true, true, false, false);
        this.initEAttribute(this.getConflictResolution2_Name(), (EClassifier)this.ecorePackage.getEString(), "name", "", 1, 1, (Class)ConflictResolution2.class, false, false, true, true, false, true, false, false);
        this.initEClass(this.inaccessibleEClass, (Class)Inaccessible.class, "Inaccessible", false, false, true);
        this.initEReference(this.getInaccessible_Requests(), (EClassifier)theScmPackage.getVersionableHandleFacade(), (EReference)null, "requests", (String)null, 0, -1, (Class)Inaccessible.class, false, false, true, false, true, true, false, false, false);
        this.initEClass(this.fileAreaUpdateReport2EClass, (Class)FileAreaUpdateReport2.class, "FileAreaUpdateReport2", false, false, true);
        this.initEReference(this.getFileAreaUpdateReport2_Adds(), (EClassifier)this.getFileAreaUpdateFacade(), (EReference)null, "adds", (String)null, 0, -1, (Class)FileAreaUpdateReport2.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getFileAreaUpdateReport2_Moves(), (EClassifier)this.getFileAreaUpdateFacade(), (EReference)null, "moves", (String)null, 0, -1, (Class)FileAreaUpdateReport2.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getFileAreaUpdateReport2_Deletes(), (EClassifier)this.getFileAreaUpdateFacade(), (EReference)null, "deletes", (String)null, 0, -1, (Class)FileAreaUpdateReport2.class, false, false, true, false, true, true, false, false, false);
        this.initEReference(this.getFileAreaUpdateReport2_Modifies(), (EClassifier)this.getFileAreaUpdateFacade(), (EReference)null, "modifies", (String)null, 0, -1, (Class)FileAreaUpdateReport2.class, false, false, true, false, true, true, false, false, false);
        this.initEClass(this.localChangeUndoReportEClass, (Class)LocalChangeUndoReport.class, "LocalChangeUndoReport", false, false, true);
        this.initEReference(this.getLocalChangeUndoReport_Updates(), (EClassifier)this.getFileAreaUpdateReport2(), (EReference)null, "updates", (String)null, 1, 1, (Class)LocalChangeUndoReport.class, false, false, true, true, false, true, true, false, false);
        this.initEReference(this.getLocalChangeUndoReport_ConfigurationState(), (EClassifier)theScmDtoPackage.getSynchronizationTimeFacade(), (EReference)null, "configurationState", (String)null, 1, 1, (Class)LocalChangeUndoReport.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getLocalChangeUndoReport_Inaccessible(), (EClassifier)this.getInaccessible(), (EReference)null, "inaccessible", (String)null, 0, 1, (Class)LocalChangeUndoReport.class, false, false, true, false, true, true, true, false, true);
        this.initEClass(this.symbolicLinkChangeDetailEClass, (Class)SymbolicLinkChangeDetail.class, "SymbolicLinkChangeDetail", false, false, true);
        this.initEAttribute(this.getSymbolicLinkChangeDetail_BeforeTarget(), (EClassifier)this.ecorePackage.getEString(), "beforeTarget", "", 1, 1, (Class)SymbolicLinkChangeDetail.class, false, false, true, true, false, true, false, false);
        this.initEAttribute(this.getSymbolicLinkChangeDetail_AfterTarget(), (EClassifier)this.ecorePackage.getEString(), "afterTarget", "", 1, 1, (Class)SymbolicLinkChangeDetail.class, false, false, true, true, false, true, false, false);
        this.initEAttribute(this.getSymbolicLinkChangeDetail_BeforeDirectory(), (EClassifier)this.ecorePackage.getEBoolean(), "beforeDirectory", (String)null, 1, 1, (Class)SymbolicLinkChangeDetail.class, false, false, true, true, false, false, false, false);
        this.initEAttribute(this.getSymbolicLinkChangeDetail_AfterDirectory(), (EClassifier)this.ecorePackage.getEBoolean(), "afterDirectory", (String)null, 1, 1, (Class)SymbolicLinkChangeDetail.class, false, false, true, true, false, false, false, false);
        this.initEClass(this.symbolicLinkChangeDetailFacadeEClass, (Class)ISymbolicLinkChangeDetail.class, "SymbolicLinkChangeDetailFacade", true, true, false);
        this.initEClass(this.contentChangeDetailEClass, (Class)ContentChangeDetail.class, "ContentChangeDetail", false, false, true);
        this.initEAttribute(this.getContentChangeDetail_BeforeHashString(), (EClassifier)this.ecorePackage.getEString(), "beforeHashString", (String)null, 1, 1, (Class)ContentChangeDetail.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getContentChangeDetail_AfterHashString(), (EClassifier)this.ecorePackage.getEString(), "afterHashString", (String)null, 1, 1, (Class)ContentChangeDetail.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.contentChangeDetailFacadeEClass, (Class)IContentChangeDetail.class, "ContentChangeDetailFacade", true, true, false);
        this.initEClass(this.executableBitChangeDetailEClass, (Class)ExecutableBitChangeDetail.class, "ExecutableBitChangeDetail", false, false, true);
        this.initEAttribute(this.getExecutableBitChangeDetail_Executable(), (EClassifier)this.ecorePackage.getEBoolean(), "executable", (String)null, 1, 1, (Class)ExecutableBitChangeDetail.class, false, false, true, true, false, false, false, false);
        this.initEClass(this.executableBitChangeDetailFacadeEClass, (Class)IExecutableBitChangeDetail.class, "ExecutableBitChangeDetailFacade", true, true, false);
        this.initEClass(this.contentTypeChangeDetailEClass, (Class)ContentTypeChangeDetail.class, "ContentTypeChangeDetail", false, false, true);
        this.initEAttribute(this.getContentTypeChangeDetail_BeforeContentType(), (EClassifier)this.ecorePackage.getEString(), "beforeContentType", (String)null, 1, 1, (Class)ContentTypeChangeDetail.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getContentTypeChangeDetail_AfterContentType(), (EClassifier)this.ecorePackage.getEString(), "afterContentType", (String)null, 1, 1, (Class)ContentTypeChangeDetail.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.contentTypeChangeDetailFacadeEClass, (Class)IContentTypeChangeDetail.class, "ContentTypeChangeDetailFacade", true, true, false);
        this.initEClass(this.lineDelimiterChangeDetailEClass, (Class)LineDelimiterChangeDetail.class, "LineDelimiterChangeDetail", false, false, true);
        this.initEAttribute(this.getLineDelimiterChangeDetail_BeforeLineDelimiterValue(), (EClassifier)this.ecorePackage.getEInt(), "beforeLineDelimiterValue", "0", 1, 1, (Class)LineDelimiterChangeDetail.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getLineDelimiterChangeDetail_AfterLineDelimiterValue(), (EClassifier)this.ecorePackage.getEInt(), "afterLineDelimiterValue", "0", 1, 1, (Class)LineDelimiterChangeDetail.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.lineDelimiterChangeDetailFacadeEClass, (Class)ILineDelimiterChangeDetail.class, "LineDelimiterChangeDetailFacade", true, true, false);
        this.initEClass(this.encodingChangeDetailEClass, (Class)EncodingChangeDetail.class, "EncodingChangeDetail", false, false, true);
        this.initEAttribute(this.getEncodingChangeDetail_BeforeCharacterEncoding(), (EClassifier)this.ecorePackage.getEString(), "beforeCharacterEncoding", (String)null, 1, 1, (Class)EncodingChangeDetail.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getEncodingChangeDetail_AfterCharacterEncoding(), (EClassifier)this.ecorePackage.getEString(), "afterCharacterEncoding", (String)null, 1, 1, (Class)EncodingChangeDetail.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.encodingChangeDetailFacadeEClass, (Class)IEncodingChangeDetail.class, "EncodingChangeDetailFacade", true, true, false);
        this.createResource("com.ibm.team.filesystem.dto");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamReferenceAnnotations();
        this.createTeamAttributeAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal", "clientPackagePrefix", "FilesystemDTO", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.resolutionEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.logicalConflictReportEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.logicalConflictReportFacadeEClass, source, new String[] { "facadeForClass", "LogicalConflictReport" });
        this.addAnnotation((ENamedElement)this.logicalConflictEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.logicalConflictFacadeEClass, source, new String[] { "facadeForClass", "LogicalConflict" });
        this.addAnnotation((ENamedElement)this.logicalChangeEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.logicalChangeFacadeEClass, source, new String[] { "facadeForClass", "LogicalChange" });
        this.addAnnotation((ENamedElement)this.fileAreaUpdateEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.fileAreaUpdateFacadeEClass, source, new String[] { "facadeForClass", "FileAreaUpdate" });
        this.addAnnotation((ENamedElement)this.conflictResolutionReportEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.conflictResolutionEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.basicChangeEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.basicChangeFacadeEClass, source, new String[] { "facadeForClass", "BasicChange" });
        this.addAnnotation((ENamedElement)this.changeSynopsisEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeSynopsisFacadeEClass, source, new String[] { "facadeForClass", "ChangeSynopsis" });
        this.addAnnotation((ENamedElement)this.changeSetSynopsisEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.changeSetSynopsisFacadeEClass, source, new String[] { "facadeForClass", "ChangeSetSynopsis" });
        this.addAnnotation((ENamedElement)this.loadTreeEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.overlapRequestEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.overlapResponseEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.overlapDescriptionEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.compareResultEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.compareResultFacadeEClass, source, new String[] { "facadeForClass", "CompareResult" });
        this.addAnnotation((ENamedElement)this.fileAreaUpdateReportEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.sharePointEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.conflictResolution2EClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.inaccessibleEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.fileAreaUpdateReport2EClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.localChangeUndoReportEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.symbolicLinkChangeDetailEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.symbolicLinkChangeDetailFacadeEClass, source, new String[] { "facadeForClass", "SymbolicLinkChangeDetail" });
        this.addAnnotation((ENamedElement)this.contentChangeDetailEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.contentChangeDetailFacadeEClass, source, new String[] { "facadeForClass", "ContentChangeDetail" });
        this.addAnnotation((ENamedElement)this.executableBitChangeDetailEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.executableBitChangeDetailFacadeEClass, source, new String[] { "facadeForClass", "ExecutableBitChangeDetail" });
        this.addAnnotation((ENamedElement)this.contentTypeChangeDetailEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.contentTypeChangeDetailFacadeEClass, source, new String[] { "facadeForClass", "ContentTypeChangeDetail" });
        this.addAnnotation((ENamedElement)this.lineDelimiterChangeDetailEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.lineDelimiterChangeDetailFacadeEClass, source, new String[] { "facadeForClass", "LineDelimiterChangeDetail" });
        this.addAnnotation((ENamedElement)this.encodingChangeDetailEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.encodingChangeDetailFacadeEClass, source, new String[] { "facadeForClass", "EncodingChangeDetail" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getResolution_UpdateReport(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getResolution_ChangeSet(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLogicalConflictReport_Conflicts(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLogicalConflictReport_PendingChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLogicalConflictReport_DeferredChanges(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLogicalConflictReport_ConflictReport(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLogicalConflict_Conflicts(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdate_Properties(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdate_OptionalContent(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictResolutionReport_Resolutions(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictResolution_Parent(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictResolution_Item(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_Component(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_Item(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_SourceParent(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_DestinationParent(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_PreviousComponent(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSynopsis_SourceParentPath(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSynopsis_DestinationParentPath(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSynopsis_Changes(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSynopsis_UnderlyingChangeSet(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getChangeSetSynopsis_Component(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadTree_FileAreaUpdates(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadTree_ConfigurationState(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLoadTree_Inaccessible(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapRequest_Workspace(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapRequest_Baseline(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapRequest_Component(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapRequest_Group(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapResponse_Workspace(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapResponse_Component(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapResponse_Baseline(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapResponse_OverlapDescriptions(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapResponse_AncestorReports(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapDescription_Element(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getOverlapDescription_OverlappedChildren(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompareResult_SyncReport(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompareResult_LogicalConflictReport(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCompareResult_ItemNWayConflictReports(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport_Adds(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport_Moves(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport_Deletes(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport_Modifies(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport_ShareParents(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport_Overlaps(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSharePoint_Workspace(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSharePoint_Baseline(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSharePoint_Component(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSharePoint_Versionable(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictResolution2_Component(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictResolution2_Item(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictResolution2_Parent(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getInaccessible_Requests(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport2_Adds(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport2_Moves(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport2_Deletes(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport2_Modifies(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeUndoReport_Updates(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeUndoReport_ConfigurationState(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLocalChangeUndoReport_Inaccessible(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getLogicalConflict_ConflictType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLogicalConflict_SelectedChangeDetails(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLogicalChange_Id(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLogicalChange_DependentChanges(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLogicalChange_RelatedChanges(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getLogicalChange_Kind(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdate_Executable(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictResolution_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictResolution_ConflictType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_ChangeType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_OldName(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_Before(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_After(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getBasicChange_ChangeDetails(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileAreaUpdateReport_CopyFileAreasWithOverlaps(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSharePoint_CopyFileArea(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSharePoint_RelativePath(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getConflictResolution2_Name(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymbolicLinkChangeDetail_BeforeTarget(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymbolicLinkChangeDetail_AfterTarget(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymbolicLinkChangeDetail_BeforeDirectory(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymbolicLinkChangeDetail_AfterDirectory(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getExecutableBitChangeDetail_Executable(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
}
