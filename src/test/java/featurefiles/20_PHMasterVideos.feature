Feature: Test Phonologix Master Videos  Menu Functionality
  @MasterVideoMenu
  Scenario: Phonologix Master Videos Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Master Videos menu
    Then Admin can see Master Videos Details

  @AddMasterVideos
  Scenario: Phonologix Add Master Videos Functionality
    When Admin click on Add Master Videos
    Then Admin Can Add New Master Videos
