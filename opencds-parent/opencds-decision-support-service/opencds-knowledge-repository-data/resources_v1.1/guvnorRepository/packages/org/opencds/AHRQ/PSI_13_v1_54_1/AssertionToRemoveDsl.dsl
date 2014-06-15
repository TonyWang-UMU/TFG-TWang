[then] Remove assertion that {RemoveAssertion:ENUM:Assertion.value} from both Rules and Process = 
retract ( $assertion_{RemoveAssertion} );
if (assertions.contains("{RemoveAssertion}")) assertions.remove("{RemoveAssertion}"); //DslUsed==AssertionToRemoveDsl|||RemoveAssertion=={RemoveAssertion}