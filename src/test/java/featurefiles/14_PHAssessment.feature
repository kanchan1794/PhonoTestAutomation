Feature: Test Phonologix Assessment Menu Functionality
  @AssessmentMenu
  Scenario: Phonologix Assessment Functionality
   # Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Assessment menu
    Then Admin can see Assessment Details

  @AssessmentCalendarSelection
  Scenario: Phonologix Assessment Calendar Selection Functionality
    When Admin Select to and from calendar dates
    Then Admin Can See assessment record for selected calendar dates
    When Admin Select duration from dropdown list
    Then Admin Can See assessment record for that perticular duration
    When Admin can enters value to search for assessment record
    Then Admin Can See relevant search record
    And  Admin Can Scroll Horizantal Inside Assessment table
    Then Admin Can Scroll vertical Inside Assessment table
