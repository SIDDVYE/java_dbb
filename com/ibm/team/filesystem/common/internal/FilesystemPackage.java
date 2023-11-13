// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.impl.FilesystemPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemPackage extends EPackage
{
    public static final String eNAME = "filesystem";
    public static final String eNS_URI = "com.ibm.team.filesystem";
    public static final String eNS_PREFIX = "filesystem";
    public static final FilesystemPackage eINSTANCE = FilesystemPackageImpl.init();
    public static final int FILE_ITEM = 0;
    public static final int FILE_ITEM__STATE_ID = 0;
    public static final int FILE_ITEM__ITEM_ID = 1;
    public static final int FILE_ITEM__ORIGIN = 2;
    public static final int FILE_ITEM__IMMUTABLE = 3;
    public static final int FILE_ITEM__CONTEXT_ID = 4;
    public static final int FILE_ITEM__MODIFIED = 5;
    public static final int FILE_ITEM__MODIFIED_BY = 6;
    public static final int FILE_ITEM__WORKING_COPY = 7;
    public static final int FILE_ITEM__STRING_EXTENSIONS = 8;
    public static final int FILE_ITEM__INT_EXTENSIONS = 9;
    public static final int FILE_ITEM__BOOLEAN_EXTENSIONS = 10;
    public static final int FILE_ITEM__TIMESTAMP_EXTENSIONS = 11;
    public static final int FILE_ITEM__LONG_EXTENSIONS = 12;
    public static final int FILE_ITEM__LARGE_STRING_EXTENSIONS = 13;
    public static final int FILE_ITEM__MEDIUM_STRING_EXTENSIONS = 14;
    public static final int FILE_ITEM__BIG_DECIMAL_EXTENSIONS = 15;
    public static final int FILE_ITEM__NAME = 16;
    public static final int FILE_ITEM__PARENT_ID = 17;
    public static final int FILE_ITEM__PROPERTIES = 18;
    public static final int FILE_ITEM__CONTENT = 19;
    public static final int FILE_ITEM__EXECUTABLE = 20;
    public static final int FILE_ITEM_FEATURE_COUNT = 21;
    public static final int FILE_ITEM_HANDLE = 1;
    public static final int FILE_ITEM_HANDLE__STATE_ID = 0;
    public static final int FILE_ITEM_HANDLE__ITEM_ID = 1;
    public static final int FILE_ITEM_HANDLE__ORIGIN = 2;
    public static final int FILE_ITEM_HANDLE__IMMUTABLE = 3;
    public static final int FILE_ITEM_HANDLE_FEATURE_COUNT = 4;
    public static final int FILE_ITEM_HANDLE_FACADE = 2;
    public static final int FILE_ITEM_HANDLE_FACADE_FEATURE_COUNT = 0;
    public static final int FILE_ITEM_FACADE = 3;
    public static final int FILE_ITEM_FACADE_FEATURE_COUNT = 0;
    public static final int FILE_CONTENT = 4;
    public static final int FILE_CONTENT__INTERNAL_ID = 0;
    public static final int FILE_CONTENT__STRING_HASH = 1;
    public static final int FILE_CONTENT__SIZE = 2;
    public static final int FILE_CONTENT__PREDECESSOR_HINT = 3;
    public static final int FILE_CONTENT__ORIGINAL_CONTAINING_STATE = 4;
    public static final int FILE_CONTENT__CHARACTER_ENCODING = 5;
    public static final int FILE_CONTENT__LINE_DELIMITER_SETTING = 6;
    public static final int FILE_CONTENT__PROPERTIES = 7;
    public static final int FILE_CONTENT_FEATURE_COUNT = 8;
    public static final int FILE_CONTENT_FACADE = 5;
    public static final int FILE_CONTENT_FACADE_FEATURE_COUNT = 0;
    public static final int PROPERTY = 6;
    public static final int PROPERTY__INTERNAL_ID = 0;
    public static final int PROPERTY__KEY = 1;
    public static final int PROPERTY__VALUE = 2;
    public static final int PROPERTY_FEATURE_COUNT = 3;
    public static final int SYMBOLIC_LINK = 7;
    public static final int SYMBOLIC_LINK__STATE_ID = 0;
    public static final int SYMBOLIC_LINK__ITEM_ID = 1;
    public static final int SYMBOLIC_LINK__ORIGIN = 2;
    public static final int SYMBOLIC_LINK__IMMUTABLE = 3;
    public static final int SYMBOLIC_LINK__CONTEXT_ID = 4;
    public static final int SYMBOLIC_LINK__MODIFIED = 5;
    public static final int SYMBOLIC_LINK__MODIFIED_BY = 6;
    public static final int SYMBOLIC_LINK__WORKING_COPY = 7;
    public static final int SYMBOLIC_LINK__STRING_EXTENSIONS = 8;
    public static final int SYMBOLIC_LINK__INT_EXTENSIONS = 9;
    public static final int SYMBOLIC_LINK__BOOLEAN_EXTENSIONS = 10;
    public static final int SYMBOLIC_LINK__TIMESTAMP_EXTENSIONS = 11;
    public static final int SYMBOLIC_LINK__LONG_EXTENSIONS = 12;
    public static final int SYMBOLIC_LINK__LARGE_STRING_EXTENSIONS = 13;
    public static final int SYMBOLIC_LINK__MEDIUM_STRING_EXTENSIONS = 14;
    public static final int SYMBOLIC_LINK__BIG_DECIMAL_EXTENSIONS = 15;
    public static final int SYMBOLIC_LINK__NAME = 16;
    public static final int SYMBOLIC_LINK__PARENT_ID = 17;
    public static final int SYMBOLIC_LINK__PROPERTIES = 18;
    public static final int SYMBOLIC_LINK__TARGET = 19;
    public static final int SYMBOLIC_LINK_FEATURE_COUNT = 20;
    public static final int SYMBOLIC_LINK_HANDLE = 8;
    public static final int SYMBOLIC_LINK_HANDLE__STATE_ID = 0;
    public static final int SYMBOLIC_LINK_HANDLE__ITEM_ID = 1;
    public static final int SYMBOLIC_LINK_HANDLE__ORIGIN = 2;
    public static final int SYMBOLIC_LINK_HANDLE__IMMUTABLE = 3;
    public static final int SYMBOLIC_LINK_HANDLE_FEATURE_COUNT = 4;
    public static final int SYMBOLIC_LINK_HANDLE_FACADE = 9;
    public static final int SYMBOLIC_LINK_HANDLE_FACADE_FEATURE_COUNT = 0;
    public static final int SYMBOLIC_LINK_FACADE = 10;
    public static final int SYMBOLIC_LINK_FACADE_FEATURE_COUNT = 0;
    
    EClass getFileItem();
    
    EReference getFileItem_Content();
    
    EAttribute getFileItem_Executable();
    
    EClass getFileItemHandle();
    
    EClass getFileItemHandleFacade();
    
    EClass getFileItemFacade();
    
    EClass getFileContent();
    
    EAttribute getFileContent_CharacterEncoding();
    
    EAttribute getFileContent_LineDelimiterSetting();
    
    EReference getFileContent_Properties();
    
    EClass getFileContentFacade();
    
    EClass getProperty();
    
    EAttribute getProperty_Key();
    
    EAttribute getProperty_Value();
    
    EClass getSymbolicLink();
    
    EAttribute getSymbolicLink_Target();
    
    EClass getSymbolicLinkHandle();
    
    EClass getSymbolicLinkHandleFacade();
    
    EClass getSymbolicLinkFacade();
    
    FilesystemFactory getFilesystemFactory();
    
    public interface Literals
    {
        public static final EClass FILE_ITEM = FilesystemPackage.eINSTANCE.getFileItem();
        public static final EReference FILE_ITEM__CONTENT = FilesystemPackage.eINSTANCE.getFileItem_Content();
        public static final EAttribute FILE_ITEM__EXECUTABLE = FilesystemPackage.eINSTANCE.getFileItem_Executable();
        public static final EClass FILE_ITEM_HANDLE = FilesystemPackage.eINSTANCE.getFileItemHandle();
        public static final EClass FILE_ITEM_HANDLE_FACADE = FilesystemPackage.eINSTANCE.getFileItemHandleFacade();
        public static final EClass FILE_ITEM_FACADE = FilesystemPackage.eINSTANCE.getFileItemFacade();
        public static final EClass FILE_CONTENT = FilesystemPackage.eINSTANCE.getFileContent();
        public static final EAttribute FILE_CONTENT__CHARACTER_ENCODING = FilesystemPackage.eINSTANCE.getFileContent_CharacterEncoding();
        public static final EAttribute FILE_CONTENT__LINE_DELIMITER_SETTING = FilesystemPackage.eINSTANCE.getFileContent_LineDelimiterSetting();
        public static final EReference FILE_CONTENT__PROPERTIES = FilesystemPackage.eINSTANCE.getFileContent_Properties();
        public static final EClass FILE_CONTENT_FACADE = FilesystemPackage.eINSTANCE.getFileContentFacade();
        public static final EClass PROPERTY = FilesystemPackage.eINSTANCE.getProperty();
        public static final EAttribute PROPERTY__KEY = FilesystemPackage.eINSTANCE.getProperty_Key();
        public static final EAttribute PROPERTY__VALUE = FilesystemPackage.eINSTANCE.getProperty_Value();
        public static final EClass SYMBOLIC_LINK = FilesystemPackage.eINSTANCE.getSymbolicLink();
        public static final EAttribute SYMBOLIC_LINK__TARGET = FilesystemPackage.eINSTANCE.getSymbolicLink_Target();
        public static final EClass SYMBOLIC_LINK_HANDLE = FilesystemPackage.eINSTANCE.getSymbolicLinkHandle();
        public static final EClass SYMBOLIC_LINK_HANDLE_FACADE = FilesystemPackage.eINSTANCE.getSymbolicLinkHandleFacade();
        public static final EClass SYMBOLIC_LINK_FACADE = FilesystemPackage.eINSTANCE.getSymbolicLinkFacade();
    }
}
