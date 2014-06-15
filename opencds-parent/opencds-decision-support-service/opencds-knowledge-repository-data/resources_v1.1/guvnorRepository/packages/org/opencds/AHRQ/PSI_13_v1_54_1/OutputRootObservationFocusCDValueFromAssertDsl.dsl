[then] Output.Root.Obs.Focus.CDValue.Assrt - Create root output observation with ID {ROOT} focus {focus:ENUM:ObservationFocusConcept.openCdsConceptCode} coded value {CDValue:ENUM:ObservationCodedValueConcept.openCdsConceptCode} = 
IVLDate obsTime{ROOT} = new IVLDate(); 
obsTime{ROOT}.setLow($evalTime); 
obsTime{ROOT}.setHigh($evalTime); 
ObservationResult parentObs{ROOT} = new ObservationResult(); 
String parentObs{ROOT}Id = "2.16.840.1.113883.3.795.10.1^{ROOT}"; 
parentObs{ROOT}.setId(parentObs{ROOT}Id); 
parentObs{ROOT}.setEvaluatedPersonId($evaluatedPersonId); 
parentObs{ROOT}.setObservationEventTime(obsTime{ROOT}); 
parentObs{ROOT}.setSubjectIsFocalPerson($evaluatedPersonId == $focalPersonId); 
CD parentObs{ROOT}Focus = new CD(); 
parentObs{ROOT}Focus.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
parentObs{ROOT}Focus.setCodeSystemName("OpenCDS concepts"); 
parentObs{ROOT}Focus.setCode("{focus}"); 
parentObs{ROOT}Focus.setDisplayName(GetOpenCDSConceptName("{focus}")); 
parentObs{ROOT}.setObservationFocus(parentObs{ROOT}Focus); 
CD parentObs{ROOT}ConceptValue = new CD(); 
parentObs{ROOT}ConceptValue.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
parentObs{ROOT}ConceptValue.setCodeSystemName("OpenCDS concepts"); 
parentObs{ROOT}ConceptValue.setCode("{CDValue}"); 
parentObs{ROOT}ConceptValue.setDisplayName(GetOpenCDSConceptName("{CDValue}")); 
ObservationValue parentObs{ROOT}Value = new ObservationValue(); 
parentObs{ROOT}Value.setConcept(parentObs{ROOT}ConceptValue); 
parentObs{ROOT}.setObservationValue(parentObs{ROOT}Value); 
parentObs{ROOT}.setClinicalStatementToBeRoot(true); 
parentObs{ROOT}.setToBeReturned(true); 
insert(parentObs{ROOT}); 
namedObjects.put("parentObs{ROOT}", parentObs{ROOT}); //OutputRootObservationFocusCDValueFromAssertDsl|||ROOT=={ROOT}|||focus=={focus}|||CDValue=={CDValue}