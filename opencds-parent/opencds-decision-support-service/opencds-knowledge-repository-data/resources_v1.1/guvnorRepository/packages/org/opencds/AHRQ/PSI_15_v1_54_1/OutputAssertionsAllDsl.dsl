[then] Output.Assert.All - Create output observation with ID {ASSERTIONS} containing a list of all assertions in working memory = 
IVLDate obsTime{ASSERTIONS} = new IVLDate(); 
obsTime{ASSERTIONS}.setLow($evalTime); 
obsTime{ASSERTIONS}.setHigh($evalTime); 
ObservationResult parentObs{ASSERTIONS} = new ObservationResult(); 
String parentObs{ASSERTIONS}Id = "2.16.840.1.113883.3.795.5.1^{ASSERTIONS}"; 
parentObs{ASSERTIONS}.setId(parentObs{ASSERTIONS}Id); 
parentObs{ASSERTIONS}.setEvaluatedPersonId($evaluatedPersonId); 
parentObs{ASSERTIONS}.setObservationEventTime(obsTime{ASSERTIONS}); 
parentObs{ASSERTIONS}.setSubjectIsFocalPerson($evaluatedPersonId == $focalPersonId); 
CD parentObs{ASSERTIONS}Focus = new CD(); 
parentObs{ASSERTIONS}Focus.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
parentObs{ASSERTIONS}Focus.setCodeSystemName("OpenCDS concepts"); 
parentObs{ASSERTIONS}Focus.setCode("assertions"); 
parentObs{ASSERTIONS}Focus.setDisplayName("Assertions found in working memory"); 
parentObs{ASSERTIONS}.setObservationFocus(parentObs{ASSERTIONS}Focus); 
parentObs{ASSERTIONS}.setClinicalStatementToBeRoot(true); 
parentObs{ASSERTIONS}.setToBeReturned(true); 
ObservationValue obsValue{ASSERTIONS} = new ObservationValue();
obsValue{ASSERTIONS}.setText(assertions.toString());
parentObs{ASSERTIONS}.setObservationValue(obsValue{ASSERTIONS}); 
insert(parentObs{ASSERTIONS}); 
namedObjects.put("parentObs{ASSERTIONS}", parentObs{ASSERTIONS}); //OutputAssertionsAllDsl|||ASSERTIONS=={ASSERTIONS}