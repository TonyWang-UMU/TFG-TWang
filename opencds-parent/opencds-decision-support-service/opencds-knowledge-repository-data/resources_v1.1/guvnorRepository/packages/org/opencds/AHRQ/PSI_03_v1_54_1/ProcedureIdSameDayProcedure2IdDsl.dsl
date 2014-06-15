[when] ProcId.SameDay.Proc2Id - EvaluatedPerson had the first {ProcId:ENUM:ProcedureId.reference} above on the same day as the first {ProcId2:ENUM:ProcedureId.reference} above  = 
( $firstProcedureSameDay{ProcId}{ProcId2} : ProcedureConcept( openCdsConceptCode == $ProcedureIdEncounterIdDsl_procedureConcept_{ProcId} ) and
accumulate( ProcedureEvent( id == $firstProcedureSameDay{ProcId}{ProcId2}.conceptTargetId, $time : procedureTime.getLow().getTime() );
                $min1 : min( $time ) ) and
$otherProceduresSameDay{ProcId}{ProcId2} : ProcedureConcept( openCdsConceptCode == $ProcedureIdEncounterIdDsl_procedureConcept_{ProcId2} ) and
accumulate( ProcedureEvent( id == $otherProceduresSameDay{ProcId}{ProcId2}.conceptTargetId, $time2 : procedureTime.getLow().getTime(), id not memberOf $firstProcedureSameDay{ProcId}{ProcId2} );
                $min2 : min( $time2 );
                org.opencds.common.utilities.DateUtility.isSameDay($min1, $min2) ) )
//DslUsed==ProcedureIdSameDayProcedure2IdDsl|||ProcId=={ProcId}|||ProcId2=={ProcId2}