[when] Obs.CDVal.Time - EvaluatedPerson had {ObsCDValue:ENUM:ObservationCodedValueConcept.openCdsConceptCode} in the past {n} {timeUnits:ENUM:EnumerationTarget.javaCalendarUnit} = ($ObservationCDValueTimeDsl_observationValueConcept_{ObsCDValue} : ObservationCodedValueConcept(openCdsConceptCode == "{ObsCDValue}") and ObservationResult(id == $ObservationCDValueTimeDsl_observationValueConcept_{ObsCDValue}.conceptTargetId, id == $evaluatedPersonId, observationEventTime.high < $evalTime, eval(org.opencds.common.utilities.DateUtility.getInstance().timeDifferenceLessThanOrEqualTo($evalTime, observationEventTime.getLow(), {timeUnits}, {n} )) )) //DslUsed==ObservationCDValueTimeDsl|||ObsCDValue=={ObsCDValue}|||n=={n}|||timeUnits=={timeUnits}