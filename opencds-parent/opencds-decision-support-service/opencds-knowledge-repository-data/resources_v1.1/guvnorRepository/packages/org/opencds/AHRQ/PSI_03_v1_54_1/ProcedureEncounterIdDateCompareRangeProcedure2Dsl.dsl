[when] Proc.EncId.Date.Proc - EvaluatedPerson had {Proc:ENUM:ProcedureConcept.openCdsConceptCode} {Compare:ENUM:DateCompare.operator} {Proc2:ENUM:ProcedureConcept.openCdsConceptCode} as {Role:ENUM:ClinicalStatementRelationshipConcept.openCdsConceptCode} encounter {EncId:ENUM:EncounterId.reference} above = ($ProcedureEncounterIdDateCompareProcedure2Dsl_relatedEncounter{Proc}{Proc2}{Role}{EncId} : ClinicalStatementRelationship(sourceId == $EncounterId_encounterEvent_{EncId}.id) and $ProcedureEncounterIdDateCompareProcedure2Dsl_firstProcedureConcept{Proc}{Proc2}{Role}{EncId} : ProcedureConcept(openCdsConceptCode == "{Proc}") and ProcedureEncounterIdDateCompareProcedure2Dsl_firstRoleConcept{Proc}{Proc2}{Role}{EncId} : ClinicalStatementRelationshipConcept(openCdsConceptCode == "{Role}", conceptTargetId == $ProcedureEncounterIdDateCompareProcedure2Dsl_firstProcedureConcept{Proc}{Proc2}{Role}{EncId}.conceptTargetId) and $ProcedureEncounterIdDateCompareProcedure2Dsl_firstProcedureEvent{Proc}{Proc2}{Role}{EncId} : ProcedureEvent(id == $ProcedureEncounterIdDateCompareProcedure2Dsl_firstProcedureConcept{Proc}{Proc2}{Role}{EncId}.conceptTargetId, id == $ProcedureEncounterIdDateCompareProcedure2Dsl_relatedEncounter{Proc}{Proc2}{Role}{EncId}.targetId ) and $ProcedureEncounterIdDateCompareProcedure2Dsl_otherProcedureConcept{Proc}{Proc2}{Role}{EncId} : ProcedureConcept(openCdsConceptCode == "{Proc2}") and $ProcedureEncounterIdDateCompareProcedure2Dsl_otherRoleConcept{Proc}{Proc2}{Role}{EncId} : ClinicalStatementRelationshipConcept(openCdsConceptCode == "{Role}", conceptTargetId == $ProcedureEncounterIdDateCompareProcedure2Dsl_otherProcedureConcept{Proc}{Proc2}{Role}{EncId}.conceptTargetId) and $ProcedureEncounterIdDateCompareProcedure2Dsl_otherProcedureEvent{Proc}{Proc2}{Role}{EncId} : ProcedureEvent(id == $ProcedureEncounterIdDateCompareProcedure2Dsl_otherProcedureConcept{Proc}{Proc2}{Role}{EncId}.conceptTargetId, id == $ProcedureEncounterIdDateCompareProcedure2Dsl_relatedEncounter{Proc}{Proc2}{Role}{EncId}.targetId ) and accumulate( ProcedureEvent( id == $ProcedureEncounterIdDateCompareProcedure2Dsl_firstProcedureEvent{Proc}{Proc2}{Role}{EncId}.id, $ProcedureEncounterIdDateCompareProcedure2Dsl_firstPT{Proc}{Proc2}{Role}{EncId} : procedureTime.getLow().getTime() ); $ProcedureEncounterIdDateCompareProcedure2Dsl_firstMin{Proc}{Proc2}{Role}{EncId} : min($ProcedureEncounterIdDateCompareProcedure2Dsl_firstPT{Proc}{Proc2}{Role}{EncId} ) ) and accumulate( ProcedureEvent( id == $ProcedureEncounterIdDateCompareProcedure2Dsl_otherProcedureEvent{Proc}{Proc2}{Role}{EncId}.id, id != $ProcedureEncounterIdDateCompareProcedure2Dsl_firstProcedureEvent{Proc}{Proc2}{Role}{EncId}.id, $ProcedureEncounterIdDateCompareProcedure2Dsl_otherPT{Proc}{Proc2}{Role}{EncId} : procedureTime.getLow().getTime() ); $ProcedureEncounterIdDateCompareProcedure2Dsl_otherMin{Proc}{Proc2}{Role}{EncId} : min($ProcedureEncounterIdDateCompareProcedure2Dsl_otherPT{Proc}{Proc2}{Role}{EncId} ) ) ) //DslUsed==ProcedureEncounterIdDateCompareProcedure2Dsl|||Proc=={Proc}|||Compare=={Compare}|||Proc2=={Proc2}|||Role=={Role}|||EncId=={EncId}