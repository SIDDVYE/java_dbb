// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.impl.FilesystemRestClientDTOignoresPackageImpl;
import org.eclipse.emf.ecore.EPackage;

public interface FilesystemRestClientDTOignoresPackage extends EPackage
{
    public static final String eNAME = "ignores";
    public static final String eNS_URI = "com.ibm.team.filesystem.rest.client.ignores";
    public static final String eNS_PREFIX = "filesystemRestClientDTOignores";
    public static final FilesystemRestClientDTOignoresPackage eINSTANCE = FilesystemRestClientDTOignoresPackageImpl.init();
    public static final int IGNORE_RULE_DTO = 0;
    public static final int IGNORE_RULE_DTO__RULE_TYPE = 0;
    public static final int IGNORE_RULE_DTO_FEATURE_COUNT = 1;
    public static final int JAZZ_IGNORE_RULE_DTO = 1;
    public static final int JAZZ_IGNORE_RULE_DTO__RULE_TYPE = 0;
    public static final int JAZZ_IGNORE_RULE_DTO__PATTERN = 1;
    public static final int JAZZ_IGNORE_RULE_DTO__SCOPE = 2;
    public static final int JAZZ_IGNORE_RULE_DTO__PATH = 3;
    public static final int JAZZ_IGNORE_RULE_DTO_FEATURE_COUNT = 4;
    public static final int IGNORE_RULES_DTO = 2;
    public static final int IGNORE_RULES_DTO__RULES = 0;
    public static final int IGNORE_RULES_DTO_FEATURE_COUNT = 1;
    public static final int UNKNOWN_IGNORE_RULE_DTO = 3;
    public static final int UNKNOWN_IGNORE_RULE_DTO__RULE_TYPE = 0;
    public static final int UNKNOWN_IGNORE_RULE_DTO__PROVIDER_TYPE = 1;
    public static final int UNKNOWN_IGNORE_RULE_DTO__DESCRIPTION = 2;
    public static final int UNKNOWN_IGNORE_RULE_DTO_FEATURE_COUNT = 3;
    public static final int IGNORED_RESOURCES_DTO = 4;
    public static final int IGNORED_RESOURCES_DTO__IGNORED_FILES = 0;
    public static final int IGNORED_RESOURCES_DTO__IGNORED_FOLDERS = 1;
    public static final int IGNORED_RESOURCES_DTO__IGNORED_SYMBOLIC_LINKS = 2;
    public static final int IGNORED_RESOURCES_DTO__UNKNOWN_PATHS = 3;
    public static final int IGNORED_RESOURCES_DTO_FEATURE_COUNT = 4;
    
    EClass getIgnoreRuleDTO();
    
    EAttribute getIgnoreRuleDTO_RuleType();
    
    EClass getJazzIgnoreRuleDTO();
    
    EAttribute getJazzIgnoreRuleDTO_Pattern();
    
    EAttribute getJazzIgnoreRuleDTO_Scope();
    
    EReference getJazzIgnoreRuleDTO_Path();
    
    EClass getIgnoreRulesDTO();
    
    EReference getIgnoreRulesDTO_Rules();
    
    EClass getUnknownIgnoreRuleDTO();
    
    EAttribute getUnknownIgnoreRuleDTO_ProviderType();
    
    EAttribute getUnknownIgnoreRuleDTO_Description();
    
    EClass getIgnoredResourcesDTO();
    
    EReference getIgnoredResourcesDTO_IgnoredFiles();
    
    EReference getIgnoredResourcesDTO_IgnoredFolders();
    
    EReference getIgnoredResourcesDTO_IgnoredSymbolicLinks();
    
    EAttribute getIgnoredResourcesDTO_UnknownPaths();
    
    FilesystemRestClientDTOignoresFactory getFilesystemRestClientDTOignoresFactory();
    
    public interface Literals
    {
        public static final EClass IGNORE_RULE_DTO = FilesystemRestClientDTOignoresPackage.eINSTANCE.getIgnoreRuleDTO();
        public static final EAttribute IGNORE_RULE_DTO__RULE_TYPE = FilesystemRestClientDTOignoresPackage.eINSTANCE.getIgnoreRuleDTO_RuleType();
        public static final EClass JAZZ_IGNORE_RULE_DTO = FilesystemRestClientDTOignoresPackage.eINSTANCE.getJazzIgnoreRuleDTO();
        public static final EAttribute JAZZ_IGNORE_RULE_DTO__PATTERN = FilesystemRestClientDTOignoresPackage.eINSTANCE.getJazzIgnoreRuleDTO_Pattern();
        public static final EAttribute JAZZ_IGNORE_RULE_DTO__SCOPE = FilesystemRestClientDTOignoresPackage.eINSTANCE.getJazzIgnoreRuleDTO_Scope();
        public static final EReference JAZZ_IGNORE_RULE_DTO__PATH = FilesystemRestClientDTOignoresPackage.eINSTANCE.getJazzIgnoreRuleDTO_Path();
        public static final EClass IGNORE_RULES_DTO = FilesystemRestClientDTOignoresPackage.eINSTANCE.getIgnoreRulesDTO();
        public static final EReference IGNORE_RULES_DTO__RULES = FilesystemRestClientDTOignoresPackage.eINSTANCE.getIgnoreRulesDTO_Rules();
        public static final EClass UNKNOWN_IGNORE_RULE_DTO = FilesystemRestClientDTOignoresPackage.eINSTANCE.getUnknownIgnoreRuleDTO();
        public static final EAttribute UNKNOWN_IGNORE_RULE_DTO__PROVIDER_TYPE = FilesystemRestClientDTOignoresPackage.eINSTANCE.getUnknownIgnoreRuleDTO_ProviderType();
        public static final EAttribute UNKNOWN_IGNORE_RULE_DTO__DESCRIPTION = FilesystemRestClientDTOignoresPackage.eINSTANCE.getUnknownIgnoreRuleDTO_Description();
        public static final EClass IGNORED_RESOURCES_DTO = FilesystemRestClientDTOignoresPackage.eINSTANCE.getIgnoredResourcesDTO();
        public static final EReference IGNORED_RESOURCES_DTO__IGNORED_FILES = FilesystemRestClientDTOignoresPackage.eINSTANCE.getIgnoredResourcesDTO_IgnoredFiles();
        public static final EReference IGNORED_RESOURCES_DTO__IGNORED_FOLDERS = FilesystemRestClientDTOignoresPackage.eINSTANCE.getIgnoredResourcesDTO_IgnoredFolders();
        public static final EReference IGNORED_RESOURCES_DTO__IGNORED_SYMBOLIC_LINKS = FilesystemRestClientDTOignoresPackage.eINSTANCE.getIgnoredResourcesDTO_IgnoredSymbolicLinks();
        public static final EAttribute IGNORED_RESOURCES_DTO__UNKNOWN_PATHS = FilesystemRestClientDTOignoresPackage.eINSTANCE.getIgnoredResourcesDTO_UnknownPaths();
    }
}
