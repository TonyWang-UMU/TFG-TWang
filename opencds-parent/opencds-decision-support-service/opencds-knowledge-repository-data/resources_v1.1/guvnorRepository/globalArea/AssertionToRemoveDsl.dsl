[then] Remove assertion that {RemoveAssertion:ENUM:Assertion.value} from both Rules and Process = 
if (assertions.contains("{RemoveAssertion}")) assertions.remove("{RemoveAssertion}"); 
retract ( $assertion_{RemoveAssertion} );
 //DslUsed==AssertionToRemoveDsl|||RemoveAssertion=={RemoveAssertion}