
# first scenrio has 3 steps

Feature: Test application Wiki

Scenario: Test opening of application
When User opne the chrome browser
When User enters the app URL
Then Application webpage is displayed

# Second scenario has 5 steps
Scenario: Test search an input
When when I am on Search page
Then I enter the search input
Then I click on advance search
And Enter the search input
And click on Search button