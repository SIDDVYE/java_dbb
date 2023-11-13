// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.ISymbolicLink;
import com.ibm.team.filesystem.common.ISymbolicLinkHandle;
import com.ibm.team.filesystem.common.internal.SymbolicLinkHandle;
import com.ibm.team.filesystem.common.internal.SymbolicLink;
import java.util.Map;
import com.ibm.team.filesystem.common.IFileContent;
import com.ibm.team.filesystem.common.internal.FileContent;
import com.ibm.team.filesystem.common.IFileItem;
import com.ibm.team.filesystem.common.IFileItemHandle;
import com.ibm.team.filesystem.common.internal.FileItemHandle;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.FileItem;
import com.ibm.team.repository.common.model.RepositoryPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import com.ibm.team.scm.common.internal.ScmPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.FilesystemFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.FilesystemPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemPackageImpl extends EPackageImpl implements FilesystemPackage
{
    private EClass fileItemEClass;
    private EClass fileItemHandleEClass;
    private EClass fileItemHandleFacadeEClass;
    private EClass fileItemFacadeEClass;
    private EClass fileContentEClass;
    private EClass fileContentFacadeEClass;
    private EClass propertyEClass;
    private EClass symbolicLinkEClass;
    private EClass symbolicLinkHandleEClass;
    private EClass symbolicLinkHandleFacadeEClass;
    private EClass symbolicLinkFacadeEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemPackageImpl.isInited = false;
    }
    
    private FilesystemPackageImpl() {
        super("com.ibm.team.filesystem", (EFactory)FilesystemFactory.eINSTANCE);
        this.fileItemEClass = null;
        this.fileItemHandleEClass = null;
        this.fileItemHandleFacadeEClass = null;
        this.fileItemFacadeEClass = null;
        this.fileContentEClass = null;
        this.fileContentFacadeEClass = null;
        this.propertyEClass = null;
        this.symbolicLinkEClass = null;
        this.symbolicLinkHandleEClass = null;
        this.symbolicLinkHandleFacadeEClass = null;
        this.symbolicLinkFacadeEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemPackage init() {
        if (FilesystemPackageImpl.isInited) {
            return (FilesystemPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem");
        }
        final FilesystemPackageImpl theFilesystemPackage = (FilesystemPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem") instanceof FilesystemPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem") : new FilesystemPackageImpl());
        FilesystemPackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        theFilesystemPackage.createPackageContents();
        theFilesystemPackage.initializePackageContents();
        theFilesystemPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem", (Object)theFilesystemPackage);
        return theFilesystemPackage;
    }
    
    public EClass getFileItem() {
        return this.fileItemEClass;
    }
    
    public EReference getFileItem_Content() {
        return (EReference)this.fileItemEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getFileItem_Executable() {
        return (EAttribute)this.fileItemEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getFileItemHandle() {
        return this.fileItemHandleEClass;
    }
    
    public EClass getFileItemHandleFacade() {
        return this.fileItemHandleFacadeEClass;
    }
    
    public EClass getFileItemFacade() {
        return this.fileItemFacadeEClass;
    }
    
    public EClass getFileContent() {
        return this.fileContentEClass;
    }
    
    public EAttribute getFileContent_CharacterEncoding() {
        return (EAttribute)this.fileContentEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getFileContent_LineDelimiterSetting() {
        return (EAttribute)this.fileContentEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getFileContent_Properties() {
        return (EReference)this.fileContentEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getFileContentFacade() {
        return this.fileContentFacadeEClass;
    }
    
    public EClass getProperty() {
        return this.propertyEClass;
    }
    
    public EAttribute getProperty_Key() {
        return (EAttribute)this.propertyEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getProperty_Value() {
        return (EAttribute)this.propertyEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getSymbolicLink() {
        return this.symbolicLinkEClass;
    }
    
    public EAttribute getSymbolicLink_Target() {
        return (EAttribute)this.symbolicLinkEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getSymbolicLinkHandle() {
        return this.symbolicLinkHandleEClass;
    }
    
    public EClass getSymbolicLinkHandleFacade() {
        return this.symbolicLinkHandleFacadeEClass;
    }
    
    public EClass getSymbolicLinkFacade() {
        return this.symbolicLinkFacadeEClass;
    }
    
    public FilesystemFactory getFilesystemFactory() {
        return (FilesystemFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEReference(this.fileItemEClass = this.createEClass(0), 19);
        this.createEAttribute(this.fileItemEClass, 20);
        this.fileItemHandleEClass = this.createEClass(1);
        this.fileItemHandleFacadeEClass = this.createEClass(2);
        this.fileItemFacadeEClass = this.createEClass(3);
        this.createEAttribute(this.fileContentEClass = this.createEClass(4), 5);
        this.createEAttribute(this.fileContentEClass, 6);
        this.createEReference(this.fileContentEClass, 7);
        this.fileContentFacadeEClass = this.createEClass(5);
        this.createEAttribute(this.propertyEClass = this.createEClass(6), 1);
        this.createEAttribute(this.propertyEClass, 2);
        this.createEAttribute(this.symbolicLinkEClass = this.createEClass(7), 19);
        this.symbolicLinkHandleEClass = this.createEClass(8);
        this.symbolicLinkHandleFacadeEClass = this.createEClass(9);
        this.symbolicLinkFacadeEClass = this.createEClass(10);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("filesystem");
        this.setNsPrefix("filesystem");
        this.setNsURI("com.ibm.team.filesystem");
        final ScmPackage theScmPackage = (ScmPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.scm");
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.repository");
        this.fileItemEClass.getESuperTypes().add((Object)theScmPackage.getVersionable());
        this.fileItemEClass.getESuperTypes().add((Object)this.getFileItemHandle());
        this.fileItemEClass.getESuperTypes().add((Object)this.getFileItemFacade());
        this.fileItemHandleEClass.getESuperTypes().add((Object)theScmPackage.getVersionableHandle());
        this.fileItemHandleEClass.getESuperTypes().add((Object)this.getFileItemHandleFacade());
        this.fileContentEClass.getESuperTypes().add((Object)theScmPackage.getVersionedContent());
        this.fileContentEClass.getESuperTypes().add((Object)this.getFileContentFacade());
        this.propertyEClass.getESuperTypes().add((Object)theRepositoryPackage.getHelper());
        this.symbolicLinkEClass.getESuperTypes().add((Object)theScmPackage.getVersionable());
        this.symbolicLinkEClass.getESuperTypes().add((Object)this.getSymbolicLinkHandle());
        this.symbolicLinkEClass.getESuperTypes().add((Object)this.getSymbolicLinkFacade());
        this.symbolicLinkHandleEClass.getESuperTypes().add((Object)theScmPackage.getVersionableHandle());
        this.symbolicLinkHandleEClass.getESuperTypes().add((Object)this.getSymbolicLinkHandleFacade());
        this.initEClass(this.fileItemEClass, (Class)FileItem.class, "FileItem", false, false, true);
        this.initEReference(this.getFileItem_Content(), (EClassifier)this.getFileContentFacade(), (EReference)null, "content", (String)null, 1, 1, (Class)FileItem.class, false, false, true, true, false, true, false, false, true);
        this.initEAttribute(this.getFileItem_Executable(), (EClassifier)this.ecorePackage.getEBoolean(), "executable", (String)null, 1, 1, (Class)FileItem.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.fileItemHandleEClass, (Class)FileItemHandle.class, "FileItemHandle", false, false, true);
        this.initEClass(this.fileItemHandleFacadeEClass, (Class)IFileItemHandle.class, "FileItemHandleFacade", true, true, false);
        this.initEClass(this.fileItemFacadeEClass, (Class)IFileItem.class, "FileItemFacade", true, true, false);
        this.initEClass(this.fileContentEClass, (Class)FileContent.class, "FileContent", false, false, true);
        this.initEAttribute(this.getFileContent_CharacterEncoding(), (EClassifier)this.ecorePackage.getEString(), "characterEncoding", (String)null, 0, 1, (Class)FileContent.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getFileContent_LineDelimiterSetting(), (EClassifier)this.ecorePackage.getEInt(), "lineDelimiterSetting", (String)null, 1, 1, (Class)FileContent.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getFileContent_Properties(), (EClassifier)this.getProperty(), (EReference)null, "properties", (String)null, 0, -1, (Class)FileContent.class, false, false, true, true, false, true, true, false, false);
        this.initEClass(this.fileContentFacadeEClass, (Class)IFileContent.class, "FileContentFacade", true, true, false);
        this.initEClass(this.propertyEClass, (Class)Map.Entry.class, "Property", false, false, false);
        this.initEAttribute(this.getProperty_Key(), (EClassifier)this.ecorePackage.getEString(), "key", (String)null, 1, 1, (Class)Map.Entry.class, false, false, true, true, false, false, false, true);
        this.initEAttribute(this.getProperty_Value(), (EClassifier)this.ecorePackage.getEString(), "value", (String)null, 1, 1, (Class)Map.Entry.class, false, false, true, true, false, false, false, true);
        this.initEClass(this.symbolicLinkEClass, (Class)SymbolicLink.class, "SymbolicLink", false, false, true);
        this.initEAttribute(this.getSymbolicLink_Target(), (EClassifier)this.ecorePackage.getEString(), "target", (String)null, 1, 1, (Class)SymbolicLink.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.symbolicLinkHandleEClass, (Class)SymbolicLinkHandle.class, "SymbolicLinkHandle", false, false, true);
        this.initEClass(this.symbolicLinkHandleFacadeEClass, (Class)ISymbolicLinkHandle.class, "SymbolicLinkHandleFacade", true, true, false);
        this.initEClass(this.symbolicLinkFacadeEClass, (Class)ISymbolicLink.class, "SymbolicLinkFacade", true, true, false);
        this.createResource("com.ibm.team.filesystem");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamReferenceAnnotations();
        this.createTeamAttributeAnnotations();
        this.createComAnnotations();
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getFileItem_Executable(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileContent_CharacterEncoding(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileContent_LineDelimiterSetting(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProperty_Key(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getProperty_Value(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getSymbolicLink_Target(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "MEDIUM", "id", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getFileItem_Content(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getFileContent_Properties(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createComAnnotations() {
        final String source = "com.ibm.team.codegen.helperTypeMarker";
        this.addAnnotation((ENamedElement)this.fileContentEClass, source, new String[0]);
        this.addAnnotation((ENamedElement)this.propertyEClass, source, new String[0]);
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team", "clientPackageSuffix", "common.internal", "dbMapQueryablePropertiesOnly", "false", "readAccessPolicy", "APPLICATION_MANAGED" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.fileItemEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.fileItemHandleEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.fileItemHandleFacadeEClass, source, new String[] { "facadeForClass", "FileItemHandle" });
        this.addAnnotation((ENamedElement)this.fileItemFacadeEClass, source, new String[] { "facadeForClass", "FileItem" });
        this.addAnnotation((ENamedElement)this.fileContentEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.fileContentFacadeEClass, source, new String[] { "facadeForClass", "FileContent" });
        this.addAnnotation((ENamedElement)this.propertyEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.symbolicLinkEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.symbolicLinkHandleEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "true", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.symbolicLinkHandleFacadeEClass, source, new String[] { "facadeForClass", "SymbolicLinkHandle" });
        this.addAnnotation((ENamedElement)this.symbolicLinkFacadeEClass, source, new String[] { "facadeForClass", "SymbolicLink" });
    }
}
