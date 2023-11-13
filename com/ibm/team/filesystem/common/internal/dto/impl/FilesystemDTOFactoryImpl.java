// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.dto.impl;

import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOPackage;
import com.ibm.team.filesystem.common.internal.dto.OverlapResponse;
import com.ibm.team.filesystem.common.internal.dto.EncodingChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.LineDelimiterChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.ContentTypeChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.ExecutableBitChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.ContentChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.SymbolicLinkChangeDetail;
import com.ibm.team.filesystem.common.internal.dto.LocalChangeUndoReport;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdateReport2;
import com.ibm.team.filesystem.common.internal.dto.Inaccessible;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolution2;
import com.ibm.team.filesystem.common.internal.dto.SharePoint;
import com.ibm.team.filesystem.common.internal.dto.CompareResult;
import com.ibm.team.filesystem.common.internal.dto.OverlapDescription;
import com.ibm.team.filesystem.common.internal.dto.OverlapRequest;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdateReport;
import com.ibm.team.filesystem.common.internal.dto.LoadTree;
import com.ibm.team.filesystem.common.internal.dto.ChangeSetSynopsis;
import com.ibm.team.filesystem.common.internal.dto.ChangeSynopsis;
import com.ibm.team.filesystem.common.internal.dto.BasicChange;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolution;
import com.ibm.team.filesystem.common.internal.dto.ConflictResolutionReport;
import com.ibm.team.filesystem.common.internal.dto.FileAreaUpdate;
import com.ibm.team.filesystem.common.internal.dto.LogicalChange;
import com.ibm.team.filesystem.common.internal.dto.LogicalConflict;
import com.ibm.team.filesystem.common.internal.dto.LogicalConflictReport;
import com.ibm.team.filesystem.common.internal.dto.Resolution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.EPackage;
import com.ibm.team.filesystem.common.internal.dto.FilesystemDTOFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

public class FilesystemDTOFactoryImpl extends EFactoryImpl implements FilesystemDTOFactory
{
    public static FilesystemDTOFactory init() {
        try {
            final FilesystemDTOFactory theFilesystemDTOFactory = (FilesystemDTOFactory)EPackage.Registry.INSTANCE.getEFactory("com.ibm.team.filesystem.dto");
            if (theFilesystemDTOFactory != null) {
                return theFilesystemDTOFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log((Object)exception);
        }
        return new FilesystemDTOFactoryImpl();
    }
    
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
            case 0: {
                return (EObject)this.createResolution();
            }
            case 1: {
                return (EObject)this.createLogicalConflictReport();
            }
            case 3: {
                return (EObject)this.createLogicalConflict();
            }
            case 5: {
                return (EObject)this.createLogicalChange();
            }
            case 7: {
                return (EObject)this.createFileAreaUpdate();
            }
            case 9: {
                return (EObject)this.createConflictResolutionReport();
            }
            case 10: {
                return (EObject)this.createConflictResolution();
            }
            case 11: {
                return (EObject)this.createBasicChange();
            }
            case 13: {
                return (EObject)this.createChangeSynopsis();
            }
            case 15: {
                return (EObject)this.createChangeSetSynopsis();
            }
            case 17: {
                return (EObject)this.createLoadTree();
            }
            case 18: {
                return (EObject)this.createOverlapRequest();
            }
            case 19: {
                return (EObject)this.createOverlapResponse();
            }
            case 20: {
                return (EObject)this.createOverlapDescription();
            }
            case 21: {
                return (EObject)this.createCompareResult();
            }
            case 23: {
                return (EObject)this.createFileAreaUpdateReport();
            }
            case 24: {
                return (EObject)this.createSharePoint();
            }
            case 25: {
                return (EObject)this.createConflictResolution2();
            }
            case 26: {
                return (EObject)this.createInaccessible();
            }
            case 27: {
                return (EObject)this.createFileAreaUpdateReport2();
            }
            case 28: {
                return (EObject)this.createLocalChangeUndoReport();
            }
            case 29: {
                return (EObject)this.createSymbolicLinkChangeDetail();
            }
            case 31: {
                return (EObject)this.createContentChangeDetail();
            }
            case 33: {
                return (EObject)this.createExecutableBitChangeDetail();
            }
            case 35: {
                return (EObject)this.createContentTypeChangeDetail();
            }
            case 37: {
                return (EObject)this.createLineDelimiterChangeDetail();
            }
            case 39: {
                return (EObject)this.createEncodingChangeDetail();
            }
            default: {
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
            }
        }
    }
    
    public Resolution createResolution() {
        final ResolutionImpl resolution = new ResolutionImpl();
        return resolution;
    }
    
    public LogicalConflictReport createLogicalConflictReport() {
        final LogicalConflictReportImpl logicalConflictReport = new LogicalConflictReportImpl();
        return logicalConflictReport;
    }
    
    public LogicalConflict createLogicalConflict() {
        final LogicalConflictImpl logicalConflict = new LogicalConflictImpl();
        return logicalConflict;
    }
    
    public LogicalChange createLogicalChange() {
        final LogicalChangeImpl logicalChange = new LogicalChangeImpl();
        return logicalChange;
    }
    
    public FileAreaUpdate createFileAreaUpdate() {
        final FileAreaUpdateImpl fileAreaUpdate = new FileAreaUpdateImpl();
        return fileAreaUpdate;
    }
    
    public ConflictResolutionReport createConflictResolutionReport() {
        final ConflictResolutionReportImpl conflictResolutionReport = new ConflictResolutionReportImpl();
        return conflictResolutionReport;
    }
    
    public ConflictResolution createConflictResolution() {
        final ConflictResolutionImpl conflictResolution = new ConflictResolutionImpl();
        return conflictResolution;
    }
    
    public BasicChange createBasicChange() {
        final BasicChangeImpl basicChange = new BasicChangeImpl();
        return basicChange;
    }
    
    public ChangeSynopsis createChangeSynopsis() {
        final ChangeSynopsisImpl changeSynopsis = new ChangeSynopsisImpl();
        return changeSynopsis;
    }
    
    public ChangeSetSynopsis createChangeSetSynopsis() {
        final ChangeSetSynopsisImpl changeSetSynopsis = new ChangeSetSynopsisImpl();
        return changeSetSynopsis;
    }
    
    public LoadTree createLoadTree() {
        final LoadTreeImpl loadTree = new LoadTreeImpl();
        return loadTree;
    }
    
    public FileAreaUpdateReport createFileAreaUpdateReport() {
        final FileAreaUpdateReportImpl fileAreaUpdateReport = new FileAreaUpdateReportImpl();
        return fileAreaUpdateReport;
    }
    
    public OverlapRequest createOverlapRequest() {
        final OverlapRequestImpl overlapRequest = new OverlapRequestImpl();
        return overlapRequest;
    }
    
    public OverlapDescription createOverlapDescription() {
        final OverlapDescriptionImpl overlapDescription = new OverlapDescriptionImpl();
        return overlapDescription;
    }
    
    public CompareResult createCompareResult() {
        final CompareResultImpl compareResult = new CompareResultImpl();
        return compareResult;
    }
    
    public SharePoint createSharePoint() {
        final SharePointImpl sharePoint = new SharePointImpl();
        return sharePoint;
    }
    
    public ConflictResolution2 createConflictResolution2() {
        final ConflictResolution2Impl conflictResolution2 = new ConflictResolution2Impl();
        return conflictResolution2;
    }
    
    public Inaccessible createInaccessible() {
        final InaccessibleImpl inaccessible = new InaccessibleImpl();
        return inaccessible;
    }
    
    public FileAreaUpdateReport2 createFileAreaUpdateReport2() {
        final FileAreaUpdateReport2Impl fileAreaUpdateReport2 = new FileAreaUpdateReport2Impl();
        return fileAreaUpdateReport2;
    }
    
    public LocalChangeUndoReport createLocalChangeUndoReport() {
        final LocalChangeUndoReportImpl localChangeUndoReport = new LocalChangeUndoReportImpl();
        return localChangeUndoReport;
    }
    
    public SymbolicLinkChangeDetail createSymbolicLinkChangeDetail() {
        final SymbolicLinkChangeDetailImpl symbolicLinkChangeDetail = new SymbolicLinkChangeDetailImpl();
        return symbolicLinkChangeDetail;
    }
    
    public ContentChangeDetail createContentChangeDetail() {
        final ContentChangeDetailImpl contentChangeDetail = new ContentChangeDetailImpl();
        return contentChangeDetail;
    }
    
    public ExecutableBitChangeDetail createExecutableBitChangeDetail() {
        final ExecutableBitChangeDetailImpl executableBitChangeDetail = new ExecutableBitChangeDetailImpl();
        return executableBitChangeDetail;
    }
    
    public ContentTypeChangeDetail createContentTypeChangeDetail() {
        final ContentTypeChangeDetailImpl contentTypeChangeDetail = new ContentTypeChangeDetailImpl();
        return contentTypeChangeDetail;
    }
    
    public LineDelimiterChangeDetail createLineDelimiterChangeDetail() {
        final LineDelimiterChangeDetailImpl lineDelimiterChangeDetail = new LineDelimiterChangeDetailImpl();
        return lineDelimiterChangeDetail;
    }
    
    public EncodingChangeDetail createEncodingChangeDetail() {
        final EncodingChangeDetailImpl encodingChangeDetail = new EncodingChangeDetailImpl();
        return encodingChangeDetail;
    }
    
    public OverlapResponse createOverlapResponse() {
        final OverlapResponseImpl overlapResponse = new OverlapResponseImpl();
        return overlapResponse;
    }
    
    public FilesystemDTOPackage getFilesystemDTOPackage() {
        return (FilesystemDTOPackage)this.getEPackage();
    }
    
    @Deprecated
    public static FilesystemDTOPackage getPackage() {
        return FilesystemDTOPackage.eINSTANCE;
    }
}
