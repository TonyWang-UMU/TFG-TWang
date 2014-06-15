[then] Assert to both Rules and Process that {AssertionToAdd:ENUM:Assertion.value} = 
Assertion $assertion_{AssertionToAdd} = new Assertion();
$assertion_{AssertionToAdd}.setValue("{AssertionToAdd}"); 
insert($assertion_{AssertionToAdd} );
assertions.add("{AssertionToAdd}"); //DslUsed==AssertionDsl|||AssertionToAdd=={AssertionToAdd}