[when] Proc.Lat.Time - EvaluatedPerson had {Proc:ENUM:ProcedureConcept.openCdsConceptCode} with a laterality of {SiteLat:ENUM:ProcedureTargetBodySiteLateralityConcept.openCdsConceptCode} in the past {n} {timeUnits:ENUM:EnumerationTarget.javaCalendarUnit} = ($ProcedureLateralityTimeDsl_procedureConcept_{Proc}{SiteLat} : ProcedureConcept(openCdsConceptCode == "{Proc}") and $ProcedureLateralityTimeDsl_targetBodySite_{Proc}{SiteLat} : ProcedureTargetBodySiteLateralityConcept(openCdsConceptCode == "{SiteLat}") and $ProcedureLateralityTimeDsl_procedureEvent{Proc}{SiteLat} : ProcedureEvent(evaluatedPersonId == $evaluatedPersonId, procedureTime.getHigh() < $evalTime, eval(org.opencds.common.utilities.DateUtility.getInstance().timeDifferenceLessThan($evalTime, procedureTime.getLow(), {timeUnits}, {n} )) ) ) //DslUsed==ProcedureLateralityTimeDsl|||Proc=={Proc}|||SiteLat=={SiteLat}|||n=={n}|||timeUnits=={timeUnits}