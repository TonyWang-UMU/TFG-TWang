[then] Output.Assert.Select - Create output observation with ID {ASSERTIONS} containing a list of assertions in working memory beginning with {prefix} = 
IVLDate obsTime{ASSERTIONS}{prefix} = new IVLDate(); 
obsTime{ASSERTIONS}{prefix}.setLow($evalTime); 
obsTime{ASSERTIONS}{prefix}.setHigh($evalTime); 
ObservationResult parentObs{ASSERTIONS}{prefix} = new ObservationResult(); 
String parentObs{ASSERTIONS}{prefix}Id = "2.16.840.1.113883.3.795.10.1^{ASSERTIONS}"; 
parentObs{ASSERTIONS}{prefix}.setId(parentObs{ASSERTIONS}{prefix}Id); 
parentObs{ASSERTIONS}{prefix}.setEvaluatedPersonId($evaluatedPersonId); 
parentObs{ASSERTIONS}{prefix}.setObservationEventTime(obsTime{ASSERTIONS}{prefix}); 
parentObs{ASSERTIONS}{prefix}.setSubjectIsFocalPerson($evaluatedPersonId == $focalPersonId); 
CD parentObs{ASSERTIONS}{prefix}Focus = new CD(); 
parentObs{ASSERTIONS}{prefix}Focus.setCodeSystem("2.16.840.1.113883.3.795.12.1.1"); 
parentObs{ASSERTIONS}{prefix}Focus.setCodeSystemName("OpenCDS concepts"); 
parentObs{ASSERTIONS}{prefix}Focus.setCode("assertions"); 
parentObs{ASSERTIONS}{prefix}Focus.setDisplayName("Assertions found in working memory"); 
parentObs{ASSERTIONS}{prefix}.setObservationFocus(parentObs{ASSERTIONS}{prefix}Focus); 
parentObs{ASSERTIONS}{prefix}.setClinicalStatementToBeRoot(true); 
parentObs{ASSERTIONS}{prefix}.setToBeReturned(true); 
ObservationValue obsValue{ASSERTIONS}{prefix} = new ObservationValue();
java.util.List<String> outputList = new java.util.ArrayList<String>();
for (Object oneAssertion : assertions) 
if (((String)oneAssertion).startsWith("{prefix}")) 
outputList.add(((String)oneAssertion).substring("{prefix}".length())); 
obsValue{ASSERTIONS}{prefix}.setText(outputList.toString());
parentObs{ASSERTIONS}{prefix}.setObservationValue(obsValue{ASSERTIONS}{prefix}); 
insert(parentObs{ASSERTIONS}{prefix}); 
namedObjects.put("parentObs{ASSERTIONS}{prefix}", parentObs{ASSERTIONS}{prefix}); //OutputAssertionsSelectedDsl|||ASSERTIONS=={ASSERTIONS}|||prefix=={prefix}