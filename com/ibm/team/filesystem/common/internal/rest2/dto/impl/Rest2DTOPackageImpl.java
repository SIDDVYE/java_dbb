// 
// Decompiled by Procyon v0.5.36
// 

package com.ibm.team.filesystem.common.internal.rest2.dto.impl;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EClassifier;
import com.ibm.team.filesystem.common.internal.rest2.dto.CheckInStatePlusDTO;
import com.ibm.team.scm.common.internal.rest.dto.ScmRestDtoPackage;
import com.ibm.team.repository.common.model.RepositoryPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import com.ibm.team.scm.common.internal.rest2.dto.ScmRest2DtoPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EFactory;
import com.ibm.team.filesystem.common.internal.rest2.dto.Rest2DTOFactory;
import org.eclipse.emf.ecore.EClass;
import com.ibm.team.filesystem.common.internal.rest2.dto.Rest2DTOPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

public class Rest2DTOPackageImpl extends EPackageImpl implements Rest2DTOPackage
{
    private EClass checkInStatePlusDTOEClass;
    private static boolean isInited;
    private boolean isCreated;
    private boolean isInitialized;
    
    static {
        Rest2DTOPackageImpl.isInited = false;
    }
    
    private Rest2DTOPackageImpl() {
        super("com.ibm.team.filesystem.rest2.dto", (EFactory)Rest2DTOFactory.eINSTANCE);
        this.checkInStatePlusDTOEClass = null;
        this.isCreated = false;
        this.isInitialized = false;
    }
    
    public static Rest2DTOPackage init() {
        if (Rest2DTOPackageImpl.isInited) {
            return (Rest2DTOPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.filesystem.rest2.dto");
        }
        final Rest2DTOPackageImpl theRest2DTOPackage = (Rest2DTOPackageImpl)((EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest2.dto") instanceof Rest2DTOPackageImpl) ? EPackage.Registry.INSTANCE.get((Object)"com.ibm.team.filesystem.rest2.dto") : new Rest2DTOPackageImpl());
        Rest2DTOPackageImpl.isInited = true;
        ScmRest2DtoPackage.eINSTANCE.eClass();
        theRest2DTOPackage.createPackageContents();
        theRest2DTOPackage.initializePackageContents();
        theRest2DTOPackage.freeze();
        EPackage.Registry.INSTANCE.put((Object)"com.ibm.team.filesystem.rest2.dto", (Object)theRest2DTOPackage);
        return theRest2DTOPackage;
    }
    
    public EClass getCheckInStatePlusDTO() {
        return this.checkInStatePlusDTOEClass;
    }
    
    public EReference getCheckInStatePlusDTO_DeletedBy() {
        return (EReference)this.checkInStatePlusDTOEClass.getEStructuralFeatures().get(0);
    }
    
    public EAttribute getCheckInStatePlusDTO_DeletedOn() {
        return (EAttribute)this.checkInStatePlusDTOEClass.getEStructuralFeatures().get(1);
    }
    
    public EReference getCheckInStatePlusDTO_CheckInState() {
        return (EReference)this.checkInStatePlusDTOEClass.getEStructuralFeatures().get(2);
    }
    
    public Rest2DTOFactory getRest2DTOFactory() {
        return (Rest2DTOFactory)this.getEFactoryInstance();
    }
    
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;
        this.createEReference(this.checkInStatePlusDTOEClass = this.createEClass(0), 1);
        this.createEAttribute(this.checkInStatePlusDTOEClass, 2);
        this.createEReference(this.checkInStatePlusDTOEClass, 3);
    }
    
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this.setName("rest2");
        this.setNsPrefix("filesystem.rest2");
        this.setNsURI("com.ibm.team.filesystem.rest2.dto");
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.repository");
        final ScmRestDtoPackage theScmRestDtoPackage = (ScmRestDtoPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.scm.rest.dto");
        final ScmRest2DtoPackage theScmRest2DtoPackage = (ScmRest2DtoPackage)EPackage.Registry.INSTANCE.getEPackage("com.ibm.team.scm.rest2.dto");
        this.checkInStatePlusDTOEClass.getESuperTypes().add((Object)theRepositoryPackage.getHelper());
        this.initEClass(this.checkInStatePlusDTOEClass, (Class)CheckInStatePlusDTO.class, "CheckInStatePlusDTO", false, false, true);
        this.initEReference(this.getCheckInStatePlusDTO_DeletedBy(), (EClassifier)theScmRestDtoPackage.getContributorDTO(), (EReference)null, "deletedBy", (String)null, 1, 1, (Class)CheckInStatePlusDTO.class, false, false, true, false, true, true, true, false, true);
        this.initEAttribute(this.getCheckInStatePlusDTO_DeletedOn(), (EClassifier)theRepositoryPackage.getTimestamp(), "deletedOn", (String)null, 0, 1, (Class)CheckInStatePlusDTO.class, false, false, true, true, false, true, false, true);
        this.initEReference(this.getCheckInStatePlusDTO_CheckInState(), (EClassifier)theScmRest2DtoPackage.getCheckInStateDTOFacade(), (EReference)null, "checkInState", (String)null, 1, 1, (Class)CheckInStatePlusDTO.class, false, false, true, false, true, true, true, false, true);
        this.createResource("com.ibm.team.filesystem.rest2.dto");
        this.createTeamPackageAnnotations();
        this.createComAnnotations();
        this.createTeamReferenceAnnotations();
        this.createTeamAttributeAnnotations();
    }
    
    protected void createTeamPackageAnnotations() {
        final String source = "teamPackage";
        this.addAnnotation((ENamedElement)this, source, new String[] { "clientBasePackage", "com.ibm.team.filesystem.common.internal", "clientPackagePrefix", "Rest2DTO", "clientPackageSuffix", "dto", "dbMapQueryablePropertiesOnly", "true" });
    }
    
    protected void createComAnnotations() {
        final String source = "com.ibm.team.codegen.helperTypeMarker";
        this.addAnnotation((ENamedElement)this.checkInStatePlusDTOEClass, source, new String[0]);
    }
    
    protected void createTeamReferenceAnnotations() {
        final String source = "teamReference";
        this.addAnnotation((ENamedElement)this.getCheckInStatePlusDTO_DeletedBy(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
        this.addAnnotation((ENamedElement)this.getCheckInStatePlusDTO_CheckInState(), source, new String[] { "belongsToHandle", "false", "forceNonHandleType", "false", "minRetrievalProfile", "LARGE" });
    }
    
    protected void createTeamAttributeAnnotations() {
        final String source = "teamAttribute";
        this.addAnnotation((ENamedElement)this.getCheckInStatePlusDTO_DeletedOn(), source, new String[] { "belongsToHandle", "false", "dbStringSize", "SMALL", "id", "false", "minRetrievalProfile", "LARGE" });
    }
}
