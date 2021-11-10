# The Scenario Outline keyword can be used to run the same Scenario multiple times, 
# with different combinations of values.
# The keyword Scenario Template is a synonym of the keyword Scenario Outline.
Feature:
Scenario: eat 5 out of 12
  Given there are 12 cucumbers
  When I eat 5 cucumbers
  Then I should have 7 cucumbers

Scenario: eat 5 out of 20
  Given there are 20 cucumbers
  When I eat 5 cucumbers
  Then I should have 15 cucumbers
  
  # Instead use Scnario Outline
  # Scenario outlines allow us to more concisely express these scenarios
  #  through the use of a template with < >-delimited parameters:
  
  Scenario Outline: eating
  Given there are <start> cucumbers
  When I eat <eat> cucumbers
  Then I should have <left> cucumbers

  Examples:
    | start | eat | left |
    |    12 |   5 |    7 |
    |    20 |   5 |   15 |