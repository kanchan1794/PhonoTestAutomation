Feature: Test Phonologix Client Menu Functionality
  @ClientMenu
  Scenario: Phonologix Client Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Client menu
    Then Admin can see Clients List and add submenu List
  @ClientListSubMenu
  Scenario: Phonologix Client Submenu List Functionality
    When Admin clicks on Clients List submenu
    Then Admin can see The details of list of Clients
    When Admin Enters Search Keywords for Clients
    Then Relevant Clients Search Results Generated

  @ClientViewCredentialIcon
    Scenario: Phonologix Client View Credentials Icon Functionality
    When Admin click on clients view credential icon
    Then Admin can see client credentials
    And Admin Can Copy Client Credentials

  @ClientViewDetails
  Scenario: Phonologix Client View Details Functionality
    When Admin click on clients view Details icon
    Then Admin can see client Details

  @EditClientDetails
  Scenario: Phonologix Client Edit Details Functionality
    When Admin clicks on edit button to edit clients details
    Then Admin can edit client details

  @ClientUserGoals
  Scenario: Phonologix Client User Goals Details Functionality
    When Admin Clicks On Clients User Goals Icon
    Then Admin Can See Clients User goals
    When Admin Click On Add User Goal Button
    Then Admin Can Add New User Goals for Clients

  @ClientMenuPageNavigation
  Scenario: Phonologix Client Menu Page Navigation Functionality
    When Admin click on clients perticular page number
    Then Admin can see clients data on that perticular page




