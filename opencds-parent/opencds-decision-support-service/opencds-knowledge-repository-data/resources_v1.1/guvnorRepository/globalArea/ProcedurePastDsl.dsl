[when] Proc.Past - EvaluatedPerson had {Proc:ENUM:ProcedureConcept.openCdsConceptCode} = ($ProcedurePastDsl_procedureConcept_{Proc} : ProcedureConcept(openCdsConceptCode == "{Proc}") and ProcedureEvent(id == $ProcedurePastDsl_procedureConcept_{Proc}.conceptTargetId, evaluatedPersonId == $evaluatedPersonId, procedureTime.getHigh() < $evalTime ))  //DslUsed==ProcedurePastDsl|||Proc=={Proc}