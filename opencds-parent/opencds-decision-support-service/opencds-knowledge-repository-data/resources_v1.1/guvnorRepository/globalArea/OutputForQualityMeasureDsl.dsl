[then] Output.Prep.QualityMeasure - Create output result for quality measure {OutputPrepQualityMeasureX1:ENUM:ObservationCodedValueConcept.openCdsConceptCode} where denominator met if  {OutputPrepQualityMeasureX2:ENUM:Assertion.value} and numerator met if {OutputPrepQualityMeasureX3:ENUM:Assertion.value} = 
java.util.List $denomCriteriaMetAssertions = LogicHelperUtility.getAssertionsWithValue($assertions, "{OutputPrepQualityMeasureX2}"); 
java.util.List $numCriteriaMetAssertions = LogicHelperUtility.getAssertionsWithValue($assertions, "{OutputPrepQualityMeasureX3}"); 
boolean b_denomCriteriaMet = ($denomCriteriaMetAssertions.size() > 0) ? true : false; 
boolean b_numAndDenomCriteriaMet = (b_denomCriteriaMet && ($numCriteriaMetAssertions.size() > 0)) ? true : false; 
BL denomCriteriaMet = new BL(); 
denomCriteriaMet.setValue(b_denomCriteriaMet); 
BL numAndDenomCriteriaMet = new BL(); 
numAndDenomCriteriaMet.setValue(b_numAndDenomCriteriaMet);  //DslUsed==OutputForQualityMeasureDsl|||OutputPrepQualityMeasureX1=={OutputPrepQualityMeasureX1}|||OutputPrepQualityMeasureX2=={OutputPrepQualityMeasureX2}|||OutputPrepQualityMeasureX3=={OutputPrepQualityMeasureX3}