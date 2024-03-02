Feature: Test Phonologix Media Manager  Menu Functionality
  @MediaManagerMenu
  Scenario: Phonologix Media Manager Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Media Manager menu
    Then Admin can see Media Manager Details

  @MediaManagerSearch
  Scenario: Phonologix Media Manger Search Functionality
    When Admin selects options from search dropdown list
    Then Admin can see the selected options media details
    When Admin can enters value to search
    Then Admin Can see perticular search result

  @AddMediaFile
  Scenario: Phonologix Media Manger Add Media File Functionality
    When Admin Enters click on Add Media File
    Then Admin Can Add New Media file
