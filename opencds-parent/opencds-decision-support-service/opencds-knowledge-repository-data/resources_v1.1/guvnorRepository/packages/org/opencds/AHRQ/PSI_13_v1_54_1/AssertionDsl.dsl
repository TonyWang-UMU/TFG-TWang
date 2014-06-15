[then] Assert to both Rules and Process that {AssertionToAdd:ENUM:Assertion.value} = 
assertions.add("{AssertionToAdd}"); 
Assertion $assertion_{AssertionToAdd} = new Assertion("{AssertionToAdd}"); 
insert($assertion_{AssertionToAdd} ) ; //DslUsed==AssertionDsl|||AssertionToAdd=={AssertionToAdd}