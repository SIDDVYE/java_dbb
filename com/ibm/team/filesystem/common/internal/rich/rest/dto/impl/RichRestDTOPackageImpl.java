// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rich.rest.dto.impl;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.ContentStatusDTO;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.RichRestDTOFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rich.rest.dto.RichRestDTOPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class RichRestDTOPackageImpl extends EPackageImpl implements RichRestDTOPackage
{
    private EClass contentStatusDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        RichRestDTOPackageImpl.isInited = false;
    }
    
    private RichRestDTOPackageImpl() {
        super("com.ibm.team.filesystem.rich.rest.dto", (EFactory)RichRestDTOFactory.eINSTANCE);
        this.contentStatusDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static RichRestDTOPackage init() {
        if (RichRestDTOPackageImpl.isInited) {
            return (RichRestDTOPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rich.rest.dto");
        }
        final RichRestDTOPackageImpl theRichRestDTOPackage = (RichRestDTOPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rich.rest.dto") instanceof RichRestDTOPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rich.rest.dto") : new RichRestDTOPackageImpl());
        RichRestDTOPackageImpl.isInited = true;
        theRichRestDTOPackage.createPackageContents();
        theRichRestDTOPackage.initializePackageContents();
        theRichRestDTOPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rich.rest.dto", (Object)theRichRestDTOPackage);
        return theRichRestDTOPackage;
    }
    
    public EClass getContentStatusDTO() {
        return this.contentStatusDTOEClass;
    }
    
    public EAttribute getContentStatusDTO_Status() {
        return (EAttribute)this.contentStatusDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getContentStatusDTO_DeletedByContributorId() {
        return (EAttribute)this.contentStatusDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EAttribute getContentStatusDTO_DeletedOn() {
        return (EAttribute)this.contentStatusDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public RichRestDTOFactory getRichRestDTOFactory() {
        return (RichRestDTOFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEAttribute(this.contentStatusDTOEClass = this.createEClass(0), 0);
        this.createEAttribute(this.contentStatusDTOEClass, 1);
        this.createEAttribute(this.contentStatusDTOEClass, 2);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("rich");
        this.setNsPrefix("filesystem.rich.rest");
        this.setNsURI("com.ibm.team.filesystem.rich.rest.dto");
        this.initEClass(this.contentStatusDTOEClass, (Class)ContentStatusDTO.class, "ContentStatusDTO", false, false, true);
        this.initEAttribute(this.getContentStatusDTO_Status(), (EClassifier)this.ecorePackage.getEString(), "status", (String)null, 1, 1, (Class)ContentStatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getContentStatusDTO_DeletedByContributorId(), (EClassifier)this.ecorePackage.getEString(), "deletedByContributorId", (String)null, 0, 1, (Class)ContentStatusDTO.class, false, false, true, true, false, true, false, true);
        this.initEAttribute(this.getContentStatusDTO_DeletedOn(), (EClassifier)this.ecorePackage.getELong(), "deletedOn", (String)null, 0, 1, (Class)ContentStatusDTO.class, false, false, true, true, false, true, false, true);
        this.createResource("com.ibm.team.filesystem.rich.rest.dto");
        this.createTeamPackageAnnotations();
        this.createTeamClassAnnotations();
        this.createTeamReferenceAnnotations();
        this.createTeamAttributeAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal", "clientPackagePrefix", "RichRestDTO", "clientPackageSuffix", "rest.dto", "dbMapQueryablePropertiesOnly", "true" });
    }
    
    protected void createTeamClassAnnotations() {
        final String source = "teamClass";
        this.addAnnotation((ENamedElement)this.contentStatusDTOEClass, source, new String[] { "allowsStateExtensions", "false", "dbPersistable", "false", "hasHandle", "false", "indices", "", "queryModelVisibility", "DEFAULT", "readAccessPolicy", "USE_READ_ACCESS_POLICY_OF_PACKAGE" });
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getContentStatusDTO_Status(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getContentStatusDTO_DeletedOn(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
}
