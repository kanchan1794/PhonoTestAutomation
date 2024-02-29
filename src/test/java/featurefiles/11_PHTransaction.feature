Feature: Test Phonologix Transaction Menu Functionality
  @TransactionMenu
  Scenario: Phonologix Transaction Functionality
   # Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Transaction menu
    Then Admin can see Transaction details
  @TransactionPageBreadCrumbs
  Scenario: Phonologix TransactionPage BreadCrumbs Functionality
    When Admin clicks on perticular page breadcrumbs from transaction menu
    Then admin can see the data on perticular page from transsaction menu
 # @TransactionSearch
  #Scenario: Phonologix Transaction Search Functionality
   # When Admin Enters Search Keywords For Transaction
    #Then Admin Can See Specific Transaction Search Results

  @TransactionListTableScrollDown
  Scenario: Phonologix Transaction Submenu List Scroll Vertically Inside Table Functionality
    And Admin can scroll vertically inside the Transaction list table
    And Admin can scroll horizantally inside the Transaction list table