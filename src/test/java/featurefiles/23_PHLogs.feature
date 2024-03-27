Feature: Test Phonologix Logs  Menu Functionality
  @LogsMenu
  Scenario: Phonologix Logs Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Logs menu
    Then Admin can see Logs Details

  @logspageNavigation
  Scenario: Phonologix LogsPageNavigation Functionality
    When Admin Click on One of The Page Bread Crumbs
    Then Admin Can See Logs On Selected Logs Page

  @LogsSearch
  Scenario: Phonologix Logs Search Functionality
    When Admin Enters Keywords To Search the Logs Details
    Then Admin Can See Searched Results In Logs List
  @ScrollInsidetable-Logs
  Scenario: Phonologix ScrollInside Table Vertical And Horizantal
  And Admin Can Scroll Horizantal Inside Logs table
  And Admin can scroll vertically inside the Logs table



  #@SearchScreeningTest
  #Scenario: Phonologix Search Screening Test Functionality
   # When Admin enters value to search for screening test record
    #Then Admin can see perticular screening test result
