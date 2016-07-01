/**
 */
package org.eclipse.xtext.ui.tests.enumrules.enumRulesUiTestLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.enumrules.enumsUi.EnumsUiPackage;

import org.eclipse.xtext.ui.tests.enumrules.enumRulesUiTestLanguage.EnumRulesUiTestLanguageFactory;
import org.eclipse.xtext.ui.tests.enumrules.enumRulesUiTestLanguage.EnumRulesUiTestLanguagePackage;
import org.eclipse.xtext.ui.tests.enumrules.enumRulesUiTestLanguage.GeneratedEnum;
import org.eclipse.xtext.ui.tests.enumrules.enumRulesUiTestLanguage.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumRulesUiTestLanguagePackageImpl extends EPackageImpl implements EnumRulesUiTestLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum generatedEnumEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.ui.tests.enumrules.enumRulesUiTestLanguage.EnumRulesUiTestLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EnumRulesUiTestLanguagePackageImpl()
  {
    super(eNS_URI, EnumRulesUiTestLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EnumRulesUiTestLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EnumRulesUiTestLanguagePackage init()
  {
    if (isInited) return (EnumRulesUiTestLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(EnumRulesUiTestLanguagePackage.eNS_URI);

    // Obtain or create and register package
    EnumRulesUiTestLanguagePackageImpl theEnumRulesUiTestLanguagePackage = (EnumRulesUiTestLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnumRulesUiTestLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnumRulesUiTestLanguagePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EnumsUiPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEnumRulesUiTestLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theEnumRulesUiTestLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEnumRulesUiTestLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EnumRulesUiTestLanguagePackage.eNS_URI, theEnumRulesUiTestLanguagePackage);
    return theEnumRulesUiTestLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Existing()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Generated()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGeneratedEnum()
  {
    return generatedEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumRulesUiTestLanguageFactory getEnumRulesUiTestLanguageFactory()
  {
    return (EnumRulesUiTestLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__EXISTING);
    createEAttribute(modelEClass, MODEL__GENERATED);

    // Create enums
    generatedEnumEEnum = createEEnum(GENERATED_ENUM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EnumsUiPackage theEnumsUiPackage = (EnumsUiPackage)EPackage.Registry.INSTANCE.getEPackage(EnumsUiPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_Existing(), theEnumsUiPackage.getExistingEnum(), "existing", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Generated(), this.getGeneratedEnum(), "generated", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(generatedEnumEEnum, GeneratedEnum.class, "GeneratedEnum");
    addEEnumLiteral(generatedEnumEEnum, GeneratedEnum.SAME_NAME);
    addEEnumLiteral(generatedEnumEEnum, GeneratedEnum.DIFFERENT_NAME);

    // Create resource
    createResource(eNS_URI);
  }

} //EnumRulesUiTestLanguagePackageImpl