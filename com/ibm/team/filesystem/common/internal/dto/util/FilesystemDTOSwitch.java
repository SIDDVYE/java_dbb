// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.util;

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
import com.ibm.team.scm.common.IChangeDetail;
import com.ibm.team.filesystem.common.ISymbolicLinkChangeDetail;
import com.ibm.team.scm.common.internal.dto2.ChangeDetail;
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
import com.ibm.team.filesystem.common.internal.dto.ConflictResolution;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolutionReport;
import com.ibm.team.filesystem.common.internal.IFileAreaUpdate;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdate;
import com.ibm.team.filesystem.common.IBasicChange;
import com.ibm.team.filesystem.common.IChangeSummary;
import com.ibm.team.filesystem.common.internal.dto.BasicChange;
import com.ibm.team.filesystem.common.ILogicalChange;
import com.ibm.team.filesystem.common.internal.dto.ChangeSynopsis;
import com.ibm.team.filesystem.common.ILogicalConflict;
import com.ibm.team.filesystem.common.internal.dto.LogicalChange;
import com.ibm.team.filesystem.common.internal.dto.LogicalConflict;
import com.ibm.team.filesystem.common.ILogicalConflictReport;
import com.ibm.team.filesystem.common.internal.dto.LogicalConflictReport;
import com.ibm.team.filesystem.common.internal.dto.Resolution;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;

public class FilesystemDTOSwitch
{
    protected static FilesystemDTOPackage modelPackage;
    
    public FilesystemDTOSwitch() {
        if (FilesystemDTOSwitch.modelPackage == null) {
            FilesystemDTOSwitch.modelPackage = FilesystemDTOPackage.eINSTANCE;
        }
    }
    
    public Object doSwitch(final EObject theEObject) {
        return this.doSwitch(theEObject.eClass(), theEObject);
    }
    
    protected Object doSwitch(final EClass theEClass, final EObject theEObject) {
        if (theEClass.eContainer() == FilesystemDTOSwitch.modelPackage) {
            return this.doSwitch(theEClass.getClassifierID(), theEObject);
        }
        final List eSuperTypes = (List)theEClass.getESuperTypes();
        return eSuperTypes.isEmpty() ? this.defaultCase(theEObject) : this.doSwitch(eSuperTypes.get(0), theEObject);
    }
    
    protected Object doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
            case 0: {
                final Resolution resolution = (Resolution)theEObject;
                Object result = this.caseResolution(resolution);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 1: {
                final LogicalConflictReport logicalConflictReport = (LogicalConflictReport)theEObject;
                Object result = this.caseLogicalConflictReport(logicalConflictReport);
                if (result == null) {
                    result = this.caseLogicalConflictReportFacade(logicalConflictReport);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 3: {
                final LogicalConflict logicalConflict = (LogicalConflict)theEObject;
                Object result = this.caseLogicalConflict(logicalConflict);
                if (result == null) {
                    result = this.caseLogicalChange(logicalConflict);
                }
                if (result == null) {
                    result = this.caseLogicalConflictFacade(logicalConflict);
                }
                if (result == null) {
                    result = this.caseChangeSynopsis(logicalConflict);
                }
                if (result == null) {
                    result = this.caseLogicalChangeFacade(logicalConflict);
                }
                if (result == null) {
                    result = this.caseBasicChange(logicalConflict);
                }
                if (result == null) {
                    result = this.caseChangeSynopsisFacade(logicalConflict);
                }
                if (result == null) {
                    result = this.caseBasicChangeFacade(logicalConflict);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 5: {
                final LogicalChange logicalChange = (LogicalChange)theEObject;
                Object result = this.caseLogicalChange(logicalChange);
                if (result == null) {
                    result = this.caseChangeSynopsis(logicalChange);
                }
                if (result == null) {
                    result = this.caseLogicalChangeFacade(logicalChange);
                }
                if (result == null) {
                    result = this.caseBasicChange(logicalChange);
                }
                if (result == null) {
                    result = this.caseChangeSynopsisFacade(logicalChange);
                }
                if (result == null) {
                    result = this.caseBasicChangeFacade(logicalChange);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 7: {
                final FileAreaUpdate fileAreaUpdate = (FileAreaUpdate)theEObject;
                Object result = this.caseFileAreaUpdate(fileAreaUpdate);
                if (result == null) {
                    result = this.caseBasicChange(fileAreaUpdate);
                }
                if (result == null) {
                    result = this.caseFileAreaUpdateFacade(fileAreaUpdate);
                }
                if (result == null) {
                    result = this.caseBasicChangeFacade(fileAreaUpdate);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 9: {
                final ConflictResolutionReport conflictResolutionReport = (ConflictResolutionReport)theEObject;
                Object result = this.caseConflictResolutionReport(conflictResolutionReport);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 10: {
                final ConflictResolution conflictResolution = (ConflictResolution)theEObject;
                Object result = this.caseConflictResolution(conflictResolution);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 11: {
                final BasicChange basicChange = (BasicChange)theEObject;
                Object result = this.caseBasicChange(basicChange);
                if (result == null) {
                    result = this.caseBasicChangeFacade(basicChange);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 13: {
                final ChangeSynopsis changeSynopsis = (ChangeSynopsis)theEObject;
                Object result = this.caseChangeSynopsis(changeSynopsis);
                if (result == null) {
                    result = this.caseBasicChange(changeSynopsis);
                }
                if (result == null) {
                    result = this.caseChangeSynopsisFacade(changeSynopsis);
                }
                if (result == null) {
                    result = this.caseBasicChangeFacade(changeSynopsis);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 15: {
                final ChangeSetSynopsis changeSetSynopsis = (ChangeSetSynopsis)theEObject;
                Object result = this.caseChangeSetSynopsis(changeSetSynopsis);
                if (result == null) {
                    result = this.caseChangeSetSynopsisFacade(changeSetSynopsis);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 17: {
                final LoadTree loadTree = (LoadTree)theEObject;
                Object result = this.caseLoadTree(loadTree);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 18: {
                final OverlapRequest overlapRequest = (OverlapRequest)theEObject;
                Object result = this.caseOverlapRequest(overlapRequest);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 19: {
                final OverlapResponse overlapResponse = (OverlapResponse)theEObject;
                Object result = this.caseOverlapResponse(overlapResponse);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 20: {
                final OverlapDescription overlapDescription = (OverlapDescription)theEObject;
                Object result = this.caseOverlapDescription(overlapDescription);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 21: {
                final CompareResult compareResult = (CompareResult)theEObject;
                Object result = this.caseCompareResult(compareResult);
                if (result == null) {
                    result = this.caseCompareResultFacade(compareResult);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 23: {
                final FileAreaUpdateReport fileAreaUpdateReport = (FileAreaUpdateReport)theEObject;
                Object result = this.caseFileAreaUpdateReport(fileAreaUpdateReport);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 24: {
                final SharePoint sharePoint = (SharePoint)theEObject;
                Object result = this.caseSharePoint(sharePoint);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 25: {
                final ConflictResolution2 conflictResolution2 = (ConflictResolution2)theEObject;
                Object result = this.caseConflictResolution2(conflictResolution2);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 26: {
                final Inaccessible inaccessible = (Inaccessible)theEObject;
                Object result = this.caseInaccessible(inaccessible);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 27: {
                final FileAreaUpdateReport2 fileAreaUpdateReport2 = (FileAreaUpdateReport2)theEObject;
                Object result = this.caseFileAreaUpdateReport2(fileAreaUpdateReport2);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 28: {
                final LocalChangeUndoReport localChangeUndoReport = (LocalChangeUndoReport)theEObject;
                Object result = this.caseLocalChangeUndoReport(localChangeUndoReport);
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 29: {
                final SymbolicLinkChangeDetail symbolicLinkChangeDetail = (SymbolicLinkChangeDetail)theEObject;
                Object result = this.caseSymbolicLinkChangeDetail(symbolicLinkChangeDetail);
                if (result == null) {
                    result = this.caseChangeDetail((ChangeDetail)symbolicLinkChangeDetail);
                }
                if (result == null) {
                    result = this.caseSymbolicLinkChangeDetailFacade(symbolicLinkChangeDetail);
                }
                if (result == null) {
                    result = this.caseChangeDetailFacade((IChangeDetail)symbolicLinkChangeDetail);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 31: {
                final ContentChangeDetail contentChangeDetail = (ContentChangeDetail)theEObject;
                Object result = this.caseContentChangeDetail(contentChangeDetail);
                if (result == null) {
                    result = this.caseChangeDetail((ChangeDetail)contentChangeDetail);
                }
                if (result == null) {
                    result = this.caseContentChangeDetailFacade(contentChangeDetail);
                }
                if (result == null) {
                    result = this.caseChangeDetailFacade((IChangeDetail)contentChangeDetail);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 33: {
                final ExecutableBitChangeDetail executableBitChangeDetail = (ExecutableBitChangeDetail)theEObject;
                Object result = this.caseExecutableBitChangeDetail(executableBitChangeDetail);
                if (result == null) {
                    result = this.caseChangeDetail((ChangeDetail)executableBitChangeDetail);
                }
                if (result == null) {
                    result = this.caseExecutableBitChangeDetailFacade(executableBitChangeDetail);
                }
                if (result == null) {
                    result = this.caseChangeDetailFacade((IChangeDetail)executableBitChangeDetail);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 35: {
                final ContentTypeChangeDetail contentTypeChangeDetail = (ContentTypeChangeDetail)theEObject;
                Object result = this.caseContentTypeChangeDetail(contentTypeChangeDetail);
                if (result == null) {
                    result = this.caseChangeDetail((ChangeDetail)contentTypeChangeDetail);
                }
                if (result == null) {
                    result = this.caseContentTypeChangeDetailFacade(contentTypeChangeDetail);
                }
                if (result == null) {
                    result = this.caseChangeDetailFacade((IChangeDetail)contentTypeChangeDetail);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 37: {
                final LineDelimiterChangeDetail lineDelimiterChangeDetail = (LineDelimiterChangeDetail)theEObject;
                Object result = this.caseLineDelimiterChangeDetail(lineDelimiterChangeDetail);
                if (result == null) {
                    result = this.caseChangeDetail((ChangeDetail)lineDelimiterChangeDetail);
                }
                if (result == null) {
                    result = this.caseLineDelimiterChangeDetailFacade(lineDelimiterChangeDetail);
                }
                if (result == null) {
                    result = this.caseChangeDetailFacade((IChangeDetail)lineDelimiterChangeDetail);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            case 39: {
                final EncodingChangeDetail encodingChangeDetail = (EncodingChangeDetail)theEObject;
                Object result = this.caseEncodingChangeDetail(encodingChangeDetail);
                if (result == null) {
                    result = this.caseChangeDetail((ChangeDetail)encodingChangeDetail);
                }
                if (result == null) {
                    result = this.caseEncodingChangeDetailFacade(encodingChangeDetail);
                }
                if (result == null) {
                    result = this.caseChangeDetailFacade((IChangeDetail)encodingChangeDetail);
                }
                if (result == null) {
                    result = this.defaultCase(theEObject);
                }
                return result;
            }
            default: {
                return this.defaultCase(theEObject);
            }
        }
    }
    
    public Object caseResolution(final Resolution object) {
        return null;
    }
    
    public Object caseLogicalConflictReport(final LogicalConflictReport object) {
        return null;
    }
    
    public Object caseLogicalConflictReportFacade(final ILogicalConflictReport object) {
        return null;
    }
    
    public Object caseLogicalConflict(final LogicalConflict object) {
        return null;
    }
    
    public Object caseLogicalConflictFacade(final ILogicalConflict object) {
        return null;
    }
    
    public Object caseLogicalChange(final LogicalChange object) {
        return null;
    }
    
    public Object caseLogicalChangeFacade(final ILogicalChange object) {
        return null;
    }
    
    public Object caseFileAreaUpdate(final FileAreaUpdate object) {
        return null;
    }
    
    public Object caseFileAreaUpdateFacade(final IFileAreaUpdate object) {
        return null;
    }
    
    public Object caseConflictResolutionReport(final ConflictResolutionReport object) {
        return null;
    }
    
    public Object caseConflictResolution(final ConflictResolution object) {
        return null;
    }
    
    public Object caseBasicChange(final BasicChange object) {
        return null;
    }
    
    public Object caseBasicChangeFacade(final IBasicChange object) {
        return null;
    }
    
    public Object caseChangeSynopsis(final ChangeSynopsis object) {
        return null;
    }
    
    public Object caseChangeSynopsisFacade(final IChangeSummary object) {
        return null;
    }
    
    public Object caseChangeSetSynopsis(final ChangeSetSynopsis object) {
        return null;
    }
    
    public Object caseChangeSetSynopsisFacade(final IChangeSetSummary object) {
        return null;
    }
    
    public Object caseLoadTree(final LoadTree object) {
        return null;
    }
    
    public Object caseFileAreaUpdateReport(final FileAreaUpdateReport object) {
        return null;
    }
    
    public Object caseOverlapRequest(final OverlapRequest object) {
        return null;
    }
    
    public Object caseOverlapDescription(final OverlapDescription object) {
        return null;
    }
    
    public Object caseCompareResult(final CompareResult object) {
        return null;
    }
    
    public Object caseCompareResultFacade(final IWorkspaceCompareReport object) {
        return null;
    }
    
    public Object caseSharePoint(final SharePoint object) {
        return null;
    }
    
    public Object caseConflictResolution2(final ConflictResolution2 object) {
        return null;
    }
    
    public Object caseInaccessible(final Inaccessible object) {
        return null;
    }
    
    public Object caseFileAreaUpdateReport2(final FileAreaUpdateReport2 object) {
        return null;
    }
    
    public Object caseLocalChangeUndoReport(final LocalChangeUndoReport object) {
        return null;
    }
    
    public Object caseSymbolicLinkChangeDetail(final SymbolicLinkChangeDetail object) {
        return null;
    }
    
    public Object caseSymbolicLinkChangeDetailFacade(final ISymbolicLinkChangeDetail object) {
        return null;
    }
    
    public Object caseContentChangeDetail(final ContentChangeDetail object) {
        return null;
    }
    
    public Object caseContentChangeDetailFacade(final IContentChangeDetail object) {
        return null;
    }
    
    public Object caseExecutableBitChangeDetail(final ExecutableBitChangeDetail object) {
        return null;
    }
    
    public Object caseExecutableBitChangeDetailFacade(final IExecutableBitChangeDetail object) {
        return null;
    }
    
    public Object caseContentTypeChangeDetail(final ContentTypeChangeDetail object) {
        return null;
    }
    
    public Object caseContentTypeChangeDetailFacade(final IContentTypeChangeDetail object) {
        return null;
    }
    
    public Object caseLineDelimiterChangeDetail(final LineDelimiterChangeDetail object) {
        return null;
    }
    
    public Object caseLineDelimiterChangeDetailFacade(final ILineDelimiterChangeDetail object) {
        return null;
    }
    
    public Object caseEncodingChangeDetail(final EncodingChangeDetail object) {
        return null;
    }
    
    public Object caseEncodingChangeDetailFacade(final IEncodingChangeDetail object) {
        return null;
    }
    
    public Object caseChangeDetailFacade(final IChangeDetail object) {
        return null;
    }
    
    public Object caseChangeDetail(final ChangeDetail object) {
        return null;
    }
    
    public Object caseOverlapResponse(final OverlapResponse object) {
        return null;
    }
    
    public Object defaultCase(final EObject object) {
        return null;
    }
}
