#The Rule keyword is still pretty new. 
#It has been ported in a lot of Cucumber implementation already. Yet if you encounter issues, 
#check the documentation of your Cucumber implementation to make sure it supports it.
#The purpose of the Rule keyword is to represent one business rule that should be implemented. 
#It provides additional information for a feature.

 #A Rule is used to group together several scenarios that belong to this business rule.
 
 # A Rule should contain one or more scenarios that illustrate the particular rule.
  
  

Feature: Users on app

  Rule: Only admin can approve

    Scenario: can employee Approve pending tickets
      Given there are 3 tickets
      And there are 2 users admin & employee
      When employee logs in, he cannot approve
      Then tickets are still pending
      

    Scenario: Only employee can approve the pending tickets
      Given there are 3 tickets
      And there are 2 users admin & employee
      When admin logs in, he can approve
      Then tickets are Approved

   