Feature: Test Phonologix Screening Test  Menu Functionality
  @ScreeningTestMenu
  Scenario: Phonologix Screening Test Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Screening Test menu
    Then Admin can see Screening Test Details

  @ViewScreeningReport
  Scenario: Phonologix View Screening Report Test Functionality
    When Admin Click on View report-Screening Test
    Then Admin Can See Perticular Screening Test report

  @ScreeningTestpagenavigation
  Scenario: Phonologix Screening Test PageNavigation Functionality
    When Admin clicks on perticular page breadcrumbs-Screening Test
    Then Admin Can Naviagte To The Screening Test Perticular Page

  #@SearchScreeningTest
  #Scenario: Phonologix Search Screening Test Functionality
   # When Admin enters value to search for screening test record
    #Then Admin can see perticular screening test result
