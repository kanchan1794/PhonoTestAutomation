Feature: Test Phonologix Lead Menu Functionality
  @LeadMenu
  Scenario: Phonologix Lead Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Lead menu
    Then Admin can see Leads List and Add Submenu
  @LeadListSubMenu
  Scenario: Phonologix Lead Submenu List Functionality
    When Admin clicks on Lead List submenu
    Then Admin can see The details of list of Leads
  When Admin Can Click On view Icon
  Then Admin Can See Leads Details
   # When Admin Enters Search Keywords for Leads
    #Then Relevant Search Results For Leads Generated
    #When Admin select value from lead dropdown list
    #Then admin can see relevant lead record