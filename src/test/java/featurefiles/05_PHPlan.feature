Feature: Test Phonologix Plan Menu Functionality
  @PlanMenu
  Scenario: Phonologix Plan Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Plan menu
    Then Admin can see Plans List and Add Submenu
  @PlanListSubMenu
  Scenario: Phonologix Plan Submenu List Functionality
    When Admin clicks on plan List submenu
    Then Admin can see The details of list of Plans
    When Admin Enters Search Keywords inside Plan
    Then Relevant Plans Search Results Generated
    When Admin Can Click On Plans view Icon
    Then Admin Can See Plans Details

  @PlanViewDetails
  Scenario: Phonologix View Plan Functionality
    When Admin Can Click On Plans view Icon
    Then Admin Can See Plans Details
    When Admin clicks on edit button to edit the plan details
    Then Admin can edit the plan details
   # When Admin Enters Search Keywords for Leads
    #Then Relevant Search Results For Leads Generated
    #When Admin select value from lead dropdown list
    #Then admin can see relevant lead record