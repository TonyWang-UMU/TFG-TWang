[then] Output.Nested.Obs.Focus.BLValue - Create output observation with ID {nestedIdValue} within enclosing observation ID {ROOT} focused on {OutputNestedObsFocusBLValueX1:ENUM:ObservationFocusConcept.openCdsConceptCode} boolean value is {OutputNestedObsFocusBLValueX2:ENUM:ObservationBooleanValueConcept.value} = IVLDate obsTime{nestedIdValue} = new IVLDate(); 
obsTime{nestedIdValue}.setLow($evalTime); 
obsTime{nestedIdValue}.setHigh($evalTime); 
ObservationResult childObs{nestedIdValue} = new ObservationResult(); 
String childObs{nestedIdValue}Id = "2.16.840.1.113883.3.795.10.1^{nestedIdValue}"; 
childObs{nestedIdValue}.setId(childObs{nestedIdValue}Id); 
childObs{nestedIdValue}.setEvaluatedPersonId($evaluatedPersonId); 
childObs{nestedIdValue}.setObservationEventTime(obsTime{nestedIdValue}); 
childObs{nestedIdValue}.setSubjectIsFocalPerson($evaluatedPersonId == $focalPersonId); 
CD childObs{nestedIdValue}Focus = new CD(); 
childObs{nestedIdValue}Focus.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
childObs{nestedIdValue}Focus.setCodeSystemName("OpenCDS concepts"); 
childObs{nestedIdValue}Focus.setCode("{OutputNestedObsFocusBLValueX1}"); 
childObs{nestedIdValue}Focus.setDisplayName(GetOpenCDSConceptName("{OutputNestedObsFocusBLValueX1}")); 
childObs{nestedIdValue}.setObservationFocus(childObs{nestedIdValue}Focus); 
boolean bChildObs{nestedIdValue} = ("{OutputNestedObsFocusBLValueX2}" == "true") ? true : false; 
BL childObs{nestedIdValue}BooleanValue = new BL(); 
childObs{nestedIdValue}BooleanValue.setValue(bChildObs{nestedIdValue}); 
ObservationValue childObs{nestedIdValue}Value = new ObservationValue(); 
childObs{nestedIdValue}Value.set_boolean(childObs{nestedIdValue}BooleanValue); 
childObs{nestedIdValue}.setObservationValue(childObs{nestedIdValue}Value); 
childObs{nestedIdValue}.setClinicalStatementToBeRoot(false); 
childObs{nestedIdValue}.setToBeReturned(true); 
ClinicalStatementRelationship rel{nestedIdValue} = new ClinicalStatementRelationship(); 
rel{nestedIdValue}.setSourceId("2.16.840.1.113883.3.795.10.1^{ROOT}"); 
rel{nestedIdValue}.setTargetId("2.16.840.1.113883.3.795.10.1^{nestedIdValue}"); 
CD rel{nestedIdValue}Code = new CD(); 
rel{nestedIdValue}Code.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
rel{nestedIdValue}Code.setCodeSystemName("OpenCDS concepts"); 
rel{nestedIdValue}Code.setCode("C67"); 
rel{nestedIdValue}Code.setDisplayName("Is contained by"); 
rel{nestedIdValue}.setTargetRelationshipToSource(rel{nestedIdValue}Code); 
java.util.List<RelationshipToSource> childObs{nestedIdValue}RelationshipToSources = new java.util.ArrayList<RelationshipToSource>(); 
RelationshipToSource childObs{nestedIdValue}RelationshipToSource = new RelationshipToSource(); 
childObs{nestedIdValue}RelationshipToSource.setSourceId("2.16.840.1.113883.3.795.10.1^{ROOT}"); 
childObs{nestedIdValue}RelationshipToSource.setRelationshipToSource(rel{nestedIdValue}Code); 
childObs{nestedIdValue}RelationshipToSources.add(childObs{nestedIdValue}RelationshipToSource); 
childObs{nestedIdValue}.setRelationshipToSources(childObs{nestedIdValue}RelationshipToSources); 
insert(childObs{nestedIdValue}); 
namedObjects.put("childObs{nestedIdValue}", childObs{nestedIdValue}); 
insert(rel{nestedIdValue}); 
namedObjects.put("rel{nestedIdValue}", rel{nestedIdValue}); //OutputNestedObservationFocusBLValueFromAssertDsl|||nestedIdValue=={nestedIdValue}|||ROOT=={ROOT}|||OutputNestedObsFocusBLValueX1=={OutputNestedObsFocusBLValueX1}|||OutputNestedObsFocusBLValueX2=={OutputNestedObsFocusBLValueX2} 