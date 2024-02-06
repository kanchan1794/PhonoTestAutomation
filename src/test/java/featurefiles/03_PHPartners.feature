Feature: Test Phonologix Partners Menu Functionality
  @PartnersMenu
Scenario: Phonologix Partners Functionality
   # Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Partners menu
    Then Admin can see partners List and Add Submenu


  @PartnersListSubMenu
  Scenario: Phonologix Partners Submenu List Functionality
    When Admin clicks on Partners List submenu
    Then Admin can see The details of list of Partners
    When Admin Enters Search Keywords for to see partners record
    Then Relevant partners Search Results Generated
  @PartnersShowCredentials
  Scenario: Phonologix Partners Show Credentials Functionality
    When Admin Clicks On Key Icon To View Partners Credentials
    Then Admin Can Copy Partners Credentials
    And Admin Can verify Partners Credentials AlertBox

  @PartnersViewDetails
  Scenario: Phonologix View Partners Functionality
    When Admin Clicks On View Icon To View Partners Details
    Then Admin Can verify Partners Details Page
    When Admin clicks on edit button to edit the partners details
    Then Admin can edit the partners details

  @PartnersageBreadCrumbs
  Scenario: Phonologix Partners Page BreadCrumbs Functionality
    When Admin clicks on perticular Partners page breadcrumbs
    Then admin can see the data on perticular Partners page

  @PartnersListTableScrollDown
  Scenario: Phonologix Partners Submenu List Scroll Vertically Inside Table Functionality
    And Admin can scroll vertically inside the Partners list table
    And Admin can scroll horizantally inside the Partners list table