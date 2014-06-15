[then] Output.Nested.Assert.Selected - Create nested observation with ID {nestedIdValue} within enclosing observation ID {ROOT} containing a list of assertions in working memory beginning with {prefix} = 
IVLDate obsTime{nestedIdValue}{ROOT}{prefix} = new IVLDate(); 
obsTime{nestedIdValue}{ROOT}{prefix}.setLow($evalTime); 
obsTime{nestedIdValue}{ROOT}{prefix}.setHigh($evalTime); 
ObservationResult childObs{nestedIdValue}{ROOT}{prefix} = new ObservationResult(); 
String childObs{nestedIdValue}{ROOT}{prefix}Id = "2.16.840.1.113883.3.795.10.1^{nestedIdValue}"; 
childObs{nestedIdValue}{ROOT}{prefix}.setId(childObs{nestedIdValue}{ROOT}{prefix}Id); 
childObs{nestedIdValue}{ROOT}{prefix}.setEvaluatedPersonId($evaluatedPersonId); 
childObs{nestedIdValue}{ROOT}{prefix}.setObservationEventTime(obsTime{nestedIdValue}{ROOT}{prefix}); 
childObs{nestedIdValue}{ROOT}{prefix}.setSubjectIsFocalPerson($evaluatedPersonId == $focalPersonId); 
CD childObs{nestedIdValue}{ROOT}{prefix}Focus = new CD(); 
childObs{nestedIdValue}{ROOT}{prefix}Focus.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
childObs{nestedIdValue}{ROOT}{prefix}Focus.setCodeSystemName("OpenCDS concepts"); 
childObs{nestedIdValue}{ROOT}{prefix}Focus.setCode("assertions"); 
childObs{nestedIdValue}{ROOT}{prefix}Focus.setDisplayName("Assertions found in working memory"); 
childObs{nestedIdValue}{ROOT}{prefix}.setObservationFocus(childObs{nestedIdValue}{ROOT}{prefix}Focus); 
childObs{nestedIdValue}{ROOT}{prefix}.setClinicalStatementToBeRoot(false); 
childObs{nestedIdValue}{ROOT}{prefix}.setToBeReturned(true); 
ObservationValue obsValue{nestedIdValue}{ROOT}{prefix} = new ObservationValue();
java.util.List<String> outputList{nestedIdValue}{ROOT}{prefix} = new java.util.ArrayList<String>();
for (Object oneAssertion : assertions) 
if (((String)oneAssertion).startsWith("{prefix}")) 
outputList{nestedIdValue}{ROOT}{prefix}.add(((String)oneAssertion).substring("{prefix}".length())); 
obsValue{nestedIdValue}{ROOT}{prefix}.setText(outputList.toString());
childObs{nestedIdValue}{ROOT}{prefix}.setObservationValue(obsValue{nestedIdValue}{ROOT}{prefix}); 
ClinicalStatementRelationship rel{nestedIdValue}{ROOT}{prefix} = new ClinicalStatementRelationship(); 
rel{nestedIdValue}{ROOT}{prefix}.setSourceId("2.16.840.1.113883.3.795.10.1^{ROOT}"); 
rel{nestedIdValue}{ROOT}{prefix}.setTargetId("2.16.840.1.113883.3.795.10.1^{nestedIdValue}"); 
CD rel{nestedIdValue}{ROOT}{prefix}Code = new CD(); 
rel{nestedIdValue}{ROOT}{prefix}Code.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
rel{nestedIdValue}{ROOT}{prefix}Code.setCodeSystemName("OpenCDS concepts"); 
rel{nestedIdValue}{ROOT}{prefix}Code.setCode("C67"); 
rel{nestedIdValue}{ROOT}{prefix}Code.setDisplayName("Is contained by"); 
rel{nestedIdValue}{ROOT}{prefix}.setTargetRelationshipToSource(rel{nestedIdValue}{ROOT}{prefix}Code); 
java.util.List<RelationshipToSource> childObs{nestedIdValue}{ROOT}{prefix}RelationshipToSources = new java.util.ArrayList<RelationshipToSource>(); 
RelationshipToSource childObs{nestedIdValue}{ROOT}{prefix}RelationshipToSource = new RelationshipToSource(); 
childObs{nestedIdValue}{ROOT}{prefix}RelationshipToSource.setSourceId("2.16.840.1.113883.3.795.10.1^{ROOT}"); 
childObs{nestedIdValue}{ROOT}{prefix}RelationshipToSource.setRelationshipToSource(rel{nestedIdValue}{ROOT}{prefix}Code); 
childObs{nestedIdValue}{ROOT}{prefix}RelationshipToSources.add(childObs{nestedIdValue}{ROOT}{prefix}RelationshipToSource); 
insert(childObs{nestedIdValue}{ROOT}{prefix}); 
namedObjects.put("childObs{nestedIdValue}{ROOT}{prefix}", childObs{nestedIdValue}{ROOT}{prefix}); 
insert(rel{nestedIdValue}{ROOT}{prefix}); 
namedObjects.put("rel{nestedIdValue}{ROOT}{prefix}", rel{nestedIdValue}{ROOT}{prefix}); //OutputNestedObservationAssertionsSelectedDsl|||nestedIdValue=={nestedIdValue}|||ROOT=={ROOT}|||prefix=={prefix}