// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest.client.ignores.impl;

import org.eclipse.emf.ecore.ENamedElement;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoredResourcesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.UnknownIgnoreRuleDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRulesDTO;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.JazzIgnoreRuleDTO;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.IgnoreRuleDTO;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import com.ibm.team.filesystem.common.internal.rest.client.patch.FilesystemRestClientDTOpatchPackage;
import com.ibm.team.filesystem.common.internal.rest.client.patch.impl.FilesystemRestClientDTOpatchPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.locks.FilesystemRestClientDTOlocksPackage;
import com.ibm.team.filesystem.common.internal.rest.client.locks.impl.FilesystemRestClientDTOlocksPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.FilesystemRestClientDTOcorruptionPackage;
import com.ibm.team.filesystem.common.internal.rest.client.corruption.impl.FilesystemRestClientDTOcorruptionPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.FilesystemRestClientDTOworkspacePackage;
import com.ibm.team.filesystem.common.internal.rest.client.workspace.impl.FilesystemRestClientDTOworkspacePackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.FilesystemRestClientDTOconflictPackage;
import com.ibm.team.filesystem.common.internal.rest.client.conflict.impl.FilesystemRestClientDTOconflictPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.resource.FilesystemRestClientDTOresourcePackage;
import com.ibm.team.filesystem.common.internal.rest.client.resource.impl.FilesystemRestClientDTOresourcePackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.FilesystemRestClientDTOchangesetPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changeset.impl.FilesystemRestClientDTOchangesetPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.share.FilesystemRestClientDTOsharePackage;
import com.ibm.team.filesystem.common.internal.rest.client.share.impl.FilesystemRestClientDTOsharePackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.FilesystemRestClientDTOchangelogPackage;
import com.ibm.team.filesystem.common.internal.rest.client.changelog.impl.FilesystemRestClientDTOchangelogPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.sync.FilesystemRestClientDTOsyncPackage;
import com.ibm.team.filesystem.common.internal.rest.client.sync.impl.FilesystemRestClientDTOsyncPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.load.FilesystemRestClientDTOloadPackage;
import com.ibm.team.filesystem.common.internal.rest.client.load.impl.FilesystemRestClientDTOloadPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.FilesystemRestClientDTOdilemmaPackage;
import com.ibm.team.filesystem.common.internal.rest.client.dilemma.impl.FilesystemRestClientDTOdilemmaPackageImpl;
import com.ibm.team.filesystem.common.internal.rest.client.core.FilesystemRestClientDTOcorePackage;
import com.ibm.team.filesystem.common.internal.rest.client.core.impl.FilesystemRestClientDTOcorePackageImpl;
import com.ibm.team.scm.common.internal.ScmPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest.client.ignores.FilesystemRestClientDTOignoresPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class FilesystemRestClientDTOignoresPackageImpl extends EPackageImpl implements FilesystemRestClientDTOignoresPackage
{
    private EClass ignoreRuleDTOEClass;
    private EClass jazzIgnoreRuleDTOEClass;
    private EClass ignoreRulesDTOEClass;
    private EClass unknownIgnoreRuleDTOEClass;
    private EClass ignoredResourcesDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        FilesystemRestClientDTOignoresPackageImpl.isInited = false;
    }
    
    private FilesystemRestClientDTOignoresPackageImpl() {
        super("com.ibm.team.filesystem.rest.client.ignores", (EFactory)FilesystemRestClientDTOignoresFactory.eINSTANCE);
        this.ignoreRuleDTOEClass = null;
        this.jazzIgnoreRuleDTOEClass = null;
        this.ignoreRulesDTOEClass = null;
        this.unknownIgnoreRuleDTOEClass = null;
        this.ignoredResourcesDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static FilesystemRestClientDTOignoresPackage init() {
        if (FilesystemRestClientDTOignoresPackageImpl.isInited) {
            return (FilesystemRestClientDTOignoresPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.ignores");
        }
        final FilesystemRestClientDTOignoresPackageImpl theFilesystemRestClientDTOignoresPackage = (FilesystemRestClientDTOignoresPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.ignores") instanceof FilesystemRestClientDTOignoresPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest.client.ignores") : new FilesystemRestClientDTOignoresPackageImpl());
        FilesystemRestClientDTOignoresPackageImpl.isInited = true;
        ScmPackage.eINSTANCE.eClass();
        final FilesystemRestClientDTOcorePackageImpl theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") instanceof FilesystemRestClientDTOcorePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core") : FilesystemRestClientDTOcorePackage.eINSTANCE);
        final FilesystemRestClientDTOdilemmaPackageImpl theFilesystemRestClientDTOdilemmaPackage = (FilesystemRestClientDTOdilemmaPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") instanceof FilesystemRestClientDTOdilemmaPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.dilemma") : FilesystemRestClientDTOdilemmaPackage.eINSTANCE);
        final FilesystemRestClientDTOloadPackageImpl theFilesystemRestClientDTOloadPackage = (FilesystemRestClientDTOloadPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") instanceof FilesystemRestClientDTOloadPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.load") : FilesystemRestClientDTOloadPackage.eINSTANCE);
        final FilesystemRestClientDTOsyncPackageImpl theFilesystemRestClientDTOsyncPackage = (FilesystemRestClientDTOsyncPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") instanceof FilesystemRestClientDTOsyncPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.sync") : FilesystemRestClientDTOsyncPackage.eINSTANCE);
        final FilesystemRestClientDTOchangelogPackageImpl theFilesystemRestClientDTOchangelogPackage = (FilesystemRestClientDTOchangelogPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") instanceof FilesystemRestClientDTOchangelogPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changelog") : FilesystemRestClientDTOchangelogPackage.eINSTANCE);
        final FilesystemRestClientDTOsharePackageImpl theFilesystemRestClientDTOsharePackage = (FilesystemRestClientDTOsharePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") instanceof FilesystemRestClientDTOsharePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.share") : FilesystemRestClientDTOsharePackage.eINSTANCE);
        final FilesystemRestClientDTOchangesetPackageImpl theFilesystemRestClientDTOchangesetPackage = (FilesystemRestClientDTOchangesetPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") instanceof FilesystemRestClientDTOchangesetPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.changeset") : FilesystemRestClientDTOchangesetPackage.eINSTANCE);
        final FilesystemRestClientDTOresourcePackageImpl theFilesystemRestClientDTOresourcePackage = (FilesystemRestClientDTOresourcePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") instanceof FilesystemRestClientDTOresourcePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.resource") : FilesystemRestClientDTOresourcePackage.eINSTANCE);
        final FilesystemRestClientDTOconflictPackageImpl theFilesystemRestClientDTOconflictPackage = (FilesystemRestClientDTOconflictPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") instanceof FilesystemRestClientDTOconflictPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.conflict") : FilesystemRestClientDTOconflictPackage.eINSTANCE);
        final FilesystemRestClientDTOworkspacePackageImpl theFilesystemRestClientDTOworkspacePackage = (FilesystemRestClientDTOworkspacePackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") instanceof FilesystemRestClientDTOworkspacePackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.workspace") : FilesystemRestClientDTOworkspacePackage.eINSTANCE);
        final FilesystemRestClientDTOcorruptionPackageImpl theFilesystemRestClientDTOcorruptionPackage = (FilesystemRestClientDTOcorruptionPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") instanceof FilesystemRestClientDTOcorruptionPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.corruption") : FilesystemRestClientDTOcorruptionPackage.eINSTANCE);
        final FilesystemRestClientDTOlocksPackageImpl theFilesystemRestClientDTOlocksPackage = (FilesystemRestClientDTOlocksPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") instanceof FilesystemRestClientDTOlocksPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.locks") : FilesystemRestClientDTOlocksPackage.eINSTANCE);
        final FilesystemRestClientDTOpatchPackageImpl theFilesystemRestClientDTOpatchPackage = (FilesystemRestClientDTOpatchPackageImpl)((EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") instanceof FilesystemRestClientDTOpatchPackageImpl) ? EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.patch") : FilesystemRestClientDTOpatchPackage.eINSTANCE);
        theFilesystemRestClientDTOignoresPackage.createPackageContents();
        theFilesystemRestClientDTOcorePackage.createPackageContents();
        theFilesystemRestClientDTOdilemmaPackage.createPackageContents();
        theFilesystemRestClientDTOloadPackage.createPackageContents();
        theFilesystemRestClientDTOsyncPackage.createPackageContents();
        theFilesystemRestClientDTOchangelogPackage.createPackageContents();
        theFilesystemRestClientDTOsharePackage.createPackageContents();
        theFilesystemRestClientDTOchangesetPackage.createPackageContents();
        theFilesystemRestClientDTOresourcePackage.createPackageContents();
        theFilesystemRestClientDTOconflictPackage.createPackageContents();
        theFilesystemRestClientDTOworkspacePackage.createPackageContents();
        theFilesystemRestClientDTOcorruptionPackage.createPackageContents();
        theFilesystemRestClientDTOlocksPackage.createPackageContents();
        theFilesystemRestClientDTOpatchPackage.createPackageContents();
        theFilesystemRestClientDTOignoresPackage.initializePackageContents();
        theFilesystemRestClientDTOcorePackage.initializePackageContents();
        theFilesystemRestClientDTOdilemmaPackage.initializePackageContents();
        theFilesystemRestClientDTOloadPackage.initializePackageContents();
        theFilesystemRestClientDTOsyncPackage.initializePackageContents();
        theFilesystemRestClientDTOchangelogPackage.initializePackageContents();
        theFilesystemRestClientDTOsharePackage.initializePackageContents();
        theFilesystemRestClientDTOchangesetPackage.initializePackageContents();
        theFilesystemRestClientDTOresourcePackage.initializePackageContents();
        theFilesystemRestClientDTOconflictPackage.initializePackageContents();
        theFilesystemRestClientDTOworkspacePackage.initializePackageContents();
        theFilesystemRestClientDTOcorruptionPackage.initializePackageContents();
        theFilesystemRestClientDTOlocksPackage.initializePackageContents();
        theFilesystemRestClientDTOpatchPackage.initializePackageContents();
        theFilesystemRestClientDTOignoresPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest.client.ignores", (Object)theFilesystemRestClientDTOignoresPackage);
        return theFilesystemRestClientDTOignoresPackage;
    }
    
    public EClass getIgnoreRuleDTO() {
        return this.ignoreRuleDTOEClass;
    }
    
    public EAttribute getIgnoreRuleDTO_RuleType() {
        return (EAttribute)this.ignoreRuleDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getJazzIgnoreRuleDTO() {
        return this.jazzIgnoreRuleDTOEClass;
    }
    
    public EAttribute getJazzIgnoreRuleDTO_Pattern() {
        return (EAttribute)this.jazzIgnoreRuleDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getJazzIgnoreRuleDTO_Scope() {
        return (EAttribute)this.jazzIgnoreRuleDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getJazzIgnoreRuleDTO_Path() {
        return (EReference)this.jazzIgnoreRuleDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EClass getIgnoreRulesDTO() {
        return this.ignoreRulesDTOEClass;
    }
    
    public EReference getIgnoreRulesDTO_Rules() {
        return (EReference)this.ignoreRulesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EClass getUnknownIgnoreRuleDTO() {
        return this.unknownIgnoreRuleDTOEClass;
    }
    
    public EAttribute getUnknownIgnoreRuleDTO_ProviderType() {
        return (EAttribute)this.unknownIgnoreRuleDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getUnknownIgnoreRuleDTO_Description() {
        return (EAttribute)this.unknownIgnoreRuleDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EClass getIgnoredResourcesDTO() {
        return this.ignoredResourcesDTOEClass;
    }
    
    public EReference getIgnoredResourcesDTO_IgnoredFiles() {
        return (EReference)this.ignoredResourcesDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EReference getIgnoredResourcesDTO_IgnoredFolders() {
        return (EReference)this.ignoredResourcesDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getIgnoredResourcesDTO_IgnoredSymbolicLinks() {
        return (EReference)this.ignoredResourcesDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public EAttribute getIgnoredResourcesDTO_UnknownPaths() {
        return (EAttribute)this.ignoredResourcesDTOEClass.getEStructuralFeatures().get(3);
    }
    
    public FilesystemRestClientDTOignoresFactory getFilesystemRestClientDTOignoresFactory() {
        return (FilesystemRestClientDTOignoresFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEAttribute(this.ignoreRuleDTOEClass = this.createEClass(0), 0);
        this.createEAttribute(this.jazzIgnoreRuleDTOEClass = this.createEClass(1), 1);
        this.createEAttribute(this.jazzIgnoreRuleDTOEClass, 2);
        this.createEReference(this.jazzIgnoreRuleDTOEClass, 3);
        this.createEReference(this.ignoreRulesDTOEClass = this.createEClass(2), 0);
        this.createEAttribute(this.unknownIgnoreRuleDTOEClass = this.createEClass(3), 1);
        this.createEAttribute(this.unknownIgnoreRuleDTOEClass, 2);
        this.createEReference(this.ignoredResourcesDTOEClass = this.createEClass(4), 0);
        this.createEReference(this.ignoredResourcesDTOEClass, 1);
        this.createEReference(this.ignoredResourcesDTOEClass, 2);
        this.createEAttribute(this.ignoredResourcesDTOEClass, 3);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("ignores");
        this.setNsPrefix("filesystemRestClientDTOignores");
        this.setNsURI("com.ibm.team.filesystem.rest.client.ignores");
        final FilesystemRestClientDTOcorePackage theFilesystemRestClientDTOcorePackage = (FilesystemRestClientDTOcorePackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest.client.core");
        this.jazzIgnoreRuleDTOEClass.getESuperTypes().add((Object)this.getIgnoreRuleDTO());
        this.unknownIgnoreRuleDTOEClass.getESuperTypes().add((Object)this.getIgnoreRuleDTO());
        this.initEClass(this.ignoreRuleDTOEClass, (Class)IgnoreRuleDTO.class, "IgnoreRuleDTO", false, false, true);
        this.initEAttribute(this.getIgnoreRuleDTO_RuleType(), (EClassifier)this.ecorePackage.getEString(), "ruleType", (String)null, 0, 1, (Class)IgnoreRuleDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.jazzIgnoreRuleDTOEClass, (Class)JazzIgnoreRuleDTO.class, "JazzIgnoreRuleDTO", false, false, true);
        this.initEAttribute(this.getJazzIgnoreRuleDTO_Pattern(), (EClassifier)this.ecorePackage.getEString(), "pattern", (String)null, 0, 1, (Class)JazzIgnoreRuleDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getJazzIgnoreRuleDTO_Scope(), (EClassifier)this.ecorePackage.getEString(), "scope", (String)null, 0, 1, (Class)JazzIgnoreRuleDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getJazzIgnoreRuleDTO_Path(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "path", (String)null, 0, 1, (Class)JazzIgnoreRuleDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.ignoreRulesDTOEClass, (Class)IgnoreRulesDTO.class, "IgnoreRulesDTO", false, false, true);
        this.initEReference(this.getIgnoreRulesDTO_Rules(), (EClassifier)this.getIgnoreRuleDTO(), (EReference)null, "rules", (String)null, 0, -1, (Class)IgnoreRulesDTO.class, false, false, true, true, false, true, true, false, true);
        this.initEClass(this.unknownIgnoreRuleDTOEClass, (Class)UnknownIgnoreRuleDTO.class, "UnknownIgnoreRuleDTO", false, false, true);
        this.initEAttribute(this.getUnknownIgnoreRuleDTO_ProviderType(), (EClassifier)this.ecorePackage.getEString(), "providerType", (String)null, 0, 1, (Class)UnknownIgnoreRuleDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getUnknownIgnoreRuleDTO_Description(), (EClassifier)this.ecorePackage.getEString(), "description", (String)null, 0, 1, (Class)UnknownIgnoreRuleDTO.class, false, false, true, true, false, true, false, true);
        this.initEClass(this.ignoredResourcesDTOEClass, (Class)IgnoredResourcesDTO.class, "IgnoredResourcesDTO", false, false, true);
        this.initEReference(this.getIgnoredResourcesDTO_IgnoredFiles(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "ignoredFiles", (String)null, 0, -1, (Class)IgnoredResourcesDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getIgnoredResourcesDTO_IgnoredFolders(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "ignoredFolders", (String)null, 0, -1, (Class)IgnoredResourcesDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEReference(this.getIgnoredResourcesDTO_IgnoredSymbolicLinks(), (EClassifier)theFilesystemRestClientDTOcorePackage.getPathDTO(), (EReference)null, "ignoredSymbolicLinks", (String)null, 0, -1, (Class)IgnoredResourcesDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getIgnoredResourcesDTO_UnknownPaths(), (EClassifier)this.ecorePackage.getEString(), "unknownPaths", (String)null, 0, -1, (Class)IgnoredResourcesDTO.class, false, false, true, true, false, true, false, true);
        this.createResource("com.ibm.team.filesystem.rest.client.ignores");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamAttributeAnnotations();
        this.createTeamReferenceAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal.rest.client", "clientPackagePrefix", "FilesystemRestClientDTOignores", "dbMapQueryablePropertiesOnly", "false" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.ignoreRuleDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.jazzIgnoreRuleDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.ignoreRulesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.unknownIgnoreRuleDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
        this.addAnnotation((ENamedElement)this.ignoredResourcesDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getIgnoreRuleDTO_RuleType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getJazzIgnoreRuleDTO_Pattern(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getJazzIgnoreRuleDTO_Scope(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnknownIgnoreRuleDTO_ProviderType(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getUnknownIgnoreRuleDTO_Description(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getIgnoredResourcesDTO_UnknownPaths(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getJazzIgnoreRuleDTO_Path(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getIgnoreRulesDTO_Rules(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getIgnoredResourcesDTO_IgnoredFiles(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getIgnoredResourcesDTO_IgnoredFolders(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getIgnoredResourcesDTO_IgnoredSymbolicLinks(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
}
