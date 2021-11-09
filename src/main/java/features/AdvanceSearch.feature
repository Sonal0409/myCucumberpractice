Feature: Ebay AdvancePage Test

@Test6
  Scenario: Advance search an item
    Given I am on Ebay Advance Search Page
    When I Advance search an item
      | keywords  | exclude     | min | max |
      | iPhone 11 | refurbished | 300 | 900 |
# this is called as step data table