[when] ProcId.After.Proc2Id - EvaluatedPerson had {ProcId:ENUM:ProcedureId.reference} above after all other {ProcId2:ENUM:ProcedureId.reference} above  = 
( $firstProcedureAfter{ProcId}{ProcId2} : ProcedureConcept( openCdsConceptCode == $ProcedureIdEncounterIdDsl_procedureConcept_{ProcId} )
accumulate( ProcedureEvent( id == $firstProcedureAfter{ProcId}{ProcId2}.conceptTargetId, $time : procedureEventTime );
                $min : min( $time ) )
$otherProceduresBefore{ProcId}{ProcId2} : ProcedureConcept( openCdsConceptCode == $ProcedureIdEncounterIdDsl_procedureConcept_{ProcId2} )
accumulate( ProcedureEvent( id == $otherProceduresBefore{ProcId}{ProcId2}.conceptTargetId, $time2 : procedureEventTime, id not in $firstProcedureAfter{ProcId}{ProcId2} );
                $min2 : min( $time2 );
                $min > $min2 ) 
//DslUsed==ProcedureIdAfterProcedure2IdDsl|||ProcId=={ProcId}|||ProcId2=={ProcId2}