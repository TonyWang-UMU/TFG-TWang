[when] Concept.Det.Rship.Identify - Concept for Relationship is not determined according to {X:ENUM:VMRTemplateConcept.determinationMethodCode} = ($ConceptDeterminationMethodRelationshipConceptToRemove{X} : VmrOpenCdsConcept(determinationMethodCode != "{X}") and ( ClinicalStatementRelationship(id == $ConceptDeterminationMethodRelationshipConceptToRemove{X}.conceptTargetId) or EntityRelationship(id == $ConceptDeterminationMethodRelationshipConceptToRemove{X}.conceptTargetId) ) ) //DslUsed==ConceptDeterminationMethodRelationshipsDsl.Identify|||X=={X}
[then] Concept.Det.Rship.Remove - Remove Relationship concept without desired concept determination method = retract ($ConceptDeterminationMethodRelationshipConceptToRemove{X}); //DslUsed==ConceptDeterminationMethodRelationshipsDsl.Remove|||X=={X}