# Occasionally you’ll find yourself repeating the same 
# Given steps in all of the scenarios in a Feature.
# Since it is repeated in every scenario, this is an indication that those steps are not essential to describe the scenarios;
# they are incidental details. You can literally move such Given steps to the background, 
# by grouping them under a Background section.
# A Background allows you to add some context to the scenarios that follow it. It can contain one or more Given steps, 
# which are run before each scenario, but after any Before hooks.
# A Background is placed before the first Scenario/Example, at the same level of indentation.

Feature: Multiple site support
  Only blog owners can post to a blog, except administrators,
  who can post to all blogs.
  
  Background:
    Given a global administrator named "Greg"
    And a blog named "Greg's anti-tax rants"
    And a customer named "Dr. Bill"
    And a blog named "Expensive Therapy" owned by "Dr. Bill"
    
    Scenario: Dr. Bill posts to his own blog
    Given I am logged in as Dr. Bill
    When I try to post to "Expensive Therapy"
    Then I should see "Your article was published."
    
    Scenario: Dr. Bill tries to post to somebody else's blog, and fails
    Given I am logged in as Dr. Bill
    When I try to post to "Greg's anti-tax rants"
    Then I should see "Hey! That's not your blog!"
    
      Scenario: Greg posts to a client's blog
    Given I am logged in as Greg
    When I try to post to "Expensive Therapy"
    Then I should see "Your article was published."
    