[when] Obs.Focus.Past - EvaluatedPerson had {ObsFocus:ENUM:ObservationFocusConcept.openCdsConceptCode} prior to evaluation time = ($ObservationFocusPastDsl_observationFocusConcept_{ObsFocus} : ObservationFocusConcept(openCdsConceptCode == "{ObsFocus}") and ObservationResult(id == $ObservationFocusPastDsl_observationFocusConcept_{ObsFocus}.conceptTargetId, evaluatedPersonId == $evaluatedPersonId, observationEventTime.high < $evalTime )) //DslUsed==ObservationFocusPastDsl|||ObsFocus=={ObsFocus}