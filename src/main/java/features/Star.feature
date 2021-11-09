# Gherkin also supports using an asterisk (*) in place of any of the normal step keywords. 
# This can be helpful when you have some steps that are effectively a list of things,
# so you can express it more like bullet points where 
# otherwise the natural language of And etc might not read so elegantly.

Feature:

Scenario: All done
  Given I am out shopping
  And I have eggs
  And I have milk
  And I have butter
  When I check my list
  Then I don't need anything
  
  # Can be written as:
  
  Scenario: All done
  Given I am out shopping
  * I have eggs
  * I have milk
  * I have butter
  When I check my list
  Then I don't need anything
