[then] Output.Nested.Obs.Focus.CDValue.NmdObj - Create nested observation ID {nestedId} within enclosing observation ID {ROOT} focused on {focus:ENUM:ObservationFocusConcept.openCdsConceptCode} CD value from {namedObject} = 
IVLDate obsTime{nestedId} = new IVLDate(); 
obsTime{nestedId}.setLow($evalTime); 
obsTime{nestedId}.setHigh($evalTime); 
ObservationResult childObs{nestedId} = new ObservationResult(); 
childObs{nestedId}.setId("2.16.840.1.113883.3.795.10.1^{nestedId}"); 
childObs{nestedId}.setEvaluatedPersonId($evaluatedPersonId); 
childObs{nestedId}.setObservationEventTime(obsTime{nestedId}); 
childObs{nestedId}.setSubjectIsFocalPerson($evaluatedPersonId == $focalPersonId); 
CD childObs{nestedId}Focus = (CD)namedObjects.get("{namedObject}"); 
childObs{nestedId}.setObservationFocus(childObs{nestedId}Focus); 
CD childObs{nestedId}ConceptValue = new CD(); 
childObs{nestedId}ConceptValue.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
childObs{nestedId}ConceptValue.setCodeSystemName("OpenCDS concepts"); 
childObs{nestedId}ConceptValue.setCode("{namedObject}"); 
childObs{nestedId}ConceptValue.setDisplayName(GetOpenCDSConceptName("{namedObject}")); 
ObservationValue childObs{nestedId}Value = new ObservationValue(); childObs{nestedId}Value.setConcept(childObs{nestedId}ConceptValue); 
childObs{nestedId}.setObservationValue(childObs{nestedId}Value); 
childObs{nestedId}.setClinicalStatementToBeRoot(false); 
childObs{nestedId}.setToBeReturned(true); 
ClinicalStatementRelationship rel{nestedId} = new ClinicalStatementRelationship(); 
rel{nestedId}.setSourceId("2.16.840.1.113883.3.795.10.1^ROOT"); 
rel{nestedId}.setTargetId("2.16.840.1.113883.3.795.10.1^{nestedId}"); 
CD rel{nestedId}Code = new CD(); 
rel{nestedId}Code.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
rel{nestedId}Code.setCodeSystemName("OpenCDS concepts"); 
rel{nestedId}Code.setCode("C67"); 
rel{nestedId}Code.setDisplayName("Is contained by"); 
rel{nestedId}.setTargetRelationshipToSource(rel{nestedId}Code); 
java.util.List<RelationshipToSource> childObs{nestedId}RelationshipToSources = new java.util.ArrayList<RelationshipToSource>(); 
RelationshipToSource childObs{nestedId}RelationshipToSource = new RelationshipToSource(); 
childObs{nestedId}RelationshipToSource.setSourceId("2.16.840.1.113883.3.795.10.1^{ROOT}"); 
childObs{nestedId}RelationshipToSource.setRelationshipToSource(rel{nestedId}Code); 
childObs{nestedId}RelationshipToSources.add(childObs{nestedId}RelationshipToSource); 
insert(childObs{nestedId}); 
namedObjects.put("childObs{nestedId}", childObs{nestedId}); 
insert(rel{nestedId}); 
namedObjects.put("rel{nestedId}", rel{nestedId}); //OutputNestedObservationFocusValueFromNamedObjects|||nestedId=={nestedId}|||focus=={focus}|||namedObject=={namedObject}|||ROOT=={ROOT}