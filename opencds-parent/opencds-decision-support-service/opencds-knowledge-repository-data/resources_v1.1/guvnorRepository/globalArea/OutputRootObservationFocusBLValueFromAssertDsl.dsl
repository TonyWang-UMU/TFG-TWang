[then] Output.Root.Obs.Focus.BLValue.Assrt - Create root output observation with ID {ROOT} focus {OutputRootObsFocusBLValueAssrtX1:ENUM:ObservationFocusConcept.openCdsConceptCode} boolean value {OutputRootObsFocusBLValueAssrtX2:ENUM:Assertion.value} = 
IVLDate obsTime{ROOT} = new IVLDate(); 
obsTime{ROOT}.setLow($evalTime); 
obsTime{ROOT}.setHigh($evalTime); 
ObservationResult parentObs{ROOT} = new ObservationResult(); 
String parentObs{ROOT}Id = "2.16.840.1.113883.3.795.5.1^{ROOT}"; 
parentObs{ROOT}.setId(parentObs{ROOT}Id); 
parentObs{ROOT}.setEvaluatedPersonId($evaluatedPersonId); 
parentObs{ROOT}.setObservationEventTime(obsTime{ROOT}); 
parentObs{ROOT}.setSubjectIsFocalPerson($evaluatedPersonId == $focalPersonId); 
CD parentObs{ROOT}Focus = new CD(); 
parentObs{ROOT}Focus.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
parentObs{ROOT}Focus.setCodeSystemName("OpenCDS concepts"); 
parentObs{ROOT}Focus.setCode("{OutputRootObsFocusBLValueAssrtX1}"); 
parentObs{ROOT}Focus.setDisplayName(GetOpenCDSConceptName("{OutputRootObsFocusBLValueAssrtX1}")); 
parentObs{ROOT}.setObservationFocus(parentObs{ROOT}Focus); 
java.util.List $assertions{ROOT} =  LogicHelperUtility.getAssertionsWithValue($assertions, "{OutputRootObsFocusBLValueAssrtX2}"); 
boolean bParentObs{ROOT} = ($assertions{ROOT}.size() > 0) ? true : false; 
BL parentObs{ROOT}BooleanValue = new BL(); 
parentObs{ROOT}BooleanValue.setValue(bParentObs{ROOT}); 
ObservationValue parentObs{ROOT}Value = new ObservationValue(); 
parentObs{ROOT}Value.set_boolean(parentObs{ROOT}BooleanValue); 
parentObs{ROOT}.setObservationValue(parentObs{ROOT}Value); 
parentObs{ROOT}.setClinicalStatementToBeRoot(true); 
parentObs{ROOT}.setToBeReturned(true); 
insert(parentObs{ROOT}); 
namedObjects.put("parentObs{ROOT}", parentObs{ROOT}); //OutputRootObservationFocusValueFromAssertDsl|||ROOT=={ROOT}|||OutputRootObsFocusBLValueAssrtX1=={OutputRootObsFocusBLValueAssrtX1}|||OutputRootObsFocusBLValueAssrtX2=={OutputRootObsFocusBLValueAssrtX2}