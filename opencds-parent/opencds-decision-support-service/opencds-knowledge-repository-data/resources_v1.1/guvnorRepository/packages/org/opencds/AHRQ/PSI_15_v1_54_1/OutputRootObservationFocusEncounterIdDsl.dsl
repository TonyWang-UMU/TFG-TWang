[then] Output.Root.Obs.EncId.Focus - Create root output observation with ID {ROOT} focused on {OutputRootFocus:ENUM:ObservationFocusConcept.openCdsConceptCode} with value identifying {EncId:ENUM:EncounterId.reference} above = 
IVLDate obsTime{ROOT}{EncId} = new IVLDate(); 
obsTime{ROOT}{EncId}.setLow($evalTime); 
obsTime{ROOT}{EncId}.setHigh($evalTime); 
ObservationResult parentObs{ROOT}{EncId} = new ObservationResult(); 
String parentObs{ROOT}{EncId}Id = "2.16.840.1.113883.3.795.5.1^{ROOT}"; 
parentObs{ROOT}{EncId}.setId(parentObs{ROOT}{EncId}Id); 
parentObs{ROOT}{EncId}.setEvaluatedPersonId($evaluatedPersonId); 
parentObs{ROOT}{EncId}.setObservationEventTime(obsTime{ROOT}{EncId}); 
parentObs{ROOT}{EncId}.setSubjectIsFocalPerson($evaluatedPersonId == $focalPersonId); 
CD parentObs{ROOT}{EncId}Focus = new CD(); 
parentObs{ROOT}{EncId}Focus.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
parentObs{ROOT}{EncId}Focus.setCodeSystemName("OpenCDS concepts"); 
parentObs{ROOT}{EncId}Focus.setCode("{OutputRootFocus}"); 
parentObs{ROOT}{EncId}Focus.setDisplayName(GetOpenCDSConceptName("{OutputRootFocus}")); 
parentObs{ROOT}{EncId}.setObservationFocus(parentObs{ROOT}{EncId}Focus); 
parentObs{ROOT}{EncId}.setClinicalStatementToBeRoot(true); 
parentObs{ROOT}{EncId}.setToBeReturned(true); 
ObservationValue parentObs{ROOT}{EncId}Value = new ObservationValue(); 
String parentObs{ROOT}{EncId}Identifier = (($EncounterId_encounterEvent_A.getId() == null)? "2.16.840.1.113883.3.795.5.1^NoEncounter" : $EncounterId_encounterEvent_A.getId()); 
parentObs{ROOT}{EncId}Value.setIdentifier(parentObs{ROOT}{EncId}Identifier); 
parentObs{ROOT}{EncId}.setObservationValue(parentObs{ROOT}{EncId}Value); 
insert(parentObs{ROOT}{EncId}); 
namedObjects.put("parentObs{ROOT}{EncId}", parentObs{ROOT}{EncId}); //OutputRootObservationFocusEncounterIdDsl|||ROOT=={ROOT}|||OutputRootFocus=={OutputRootFocus}|||EncId=={EncId}