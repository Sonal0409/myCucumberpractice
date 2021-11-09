#If you have successive Given’s, When’s, or Then’s, you could write:

Feature:
Scenario: Multiple Givens
  Given one thing
  Given another thing
  Given yet another thing
  When I open my eyes
  Then I should see something
  Then I shouldn't see something else
  
  # Or, you could make the example more fluidly structured by replacing the successive 
  # Given’s, When’s, or Then’s with And’s and But’s:
  

  
  Scenario: Multiple Givens
  Given one thing
  And another thing
  And yet another thing
  When I open my eyes
  Then I should see something
  But I shouldn't see something else