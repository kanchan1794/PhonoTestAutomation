Feature: Test Phonologix Tutorials  Menu Functionality
  @TutorialsMenu
  Scenario: Phonologix Tutorials Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Tutorials menu
    Then Admin can see Tutorials Details

  @AddTutorials
  Scenario: Phonologix Tutorials Add Tutorials Functionality
    When Admin Enters click on Add Tutorials
    Then Admin Can Add New Tutorials
