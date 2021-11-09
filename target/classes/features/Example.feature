# This is a concrete example that illustrates a business rule.
#It consists of a list of steps.
# The keyword Scenario is a synonym of the keyword Example.
# You can have as many steps as you like, but we recommend 3-5 steps per example
# Having too many steps will cause the example to lose its expressive power
# as a specification and documentation.
# In addition to being a specification and documentation, an example is also a test.
# As a whole, your examples are an executable specification of the system.
#Examples follow this same pattern:
#Describe an initial context (Given steps)
#Describe an event (When steps)
#Describe an expected outcome (Then steps)
Feature: Users on app
  
  Rule: Only admin can approve

  Example: can employee Approve pending tickets
    Given there are 3 tickets
    And there are 2 users admin & employee
    When employee logs in, he cannot approve
    Then tickets are still pending

  Scenario: Only employee can approve the pending tickets
    Given there are 3 tickets
    And there are 2 users admin & employee
    When admin logs in, he can approve
    Then tickets are Approved
