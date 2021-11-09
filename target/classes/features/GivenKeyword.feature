# Each step starts with Given, When, Then, And, or But.
# Cucumber executes each step in a scenario one at a time, in the sequence you’ve written them in. 
# When Cucumber tries to execute a step, it looks for a matching step definition to execute.
# Given steps are used to describe the initial context of the system - the scene of the scenario. 
#It is typically something that happened in the past.
# When Cucumber executes a Given step, it will configure the system to be in a well-defined state, 
#such as creating and configuring objects or adding data to a test database.
# The purpose of Given steps is to put the system in a known state before the user (or external system) 
# starts interacting with the system.
#  Avoid talking about user interaction in Given’s. 
# If you were creating use cases, Given’s would be your preconditions.
#Examples:

#Mickey and Minnie have started a game
#I am logged in
#Joe has a balance of £42

Feature:
Scenario:
Given Mickey and Minnie have started a game
Given I am logged in
