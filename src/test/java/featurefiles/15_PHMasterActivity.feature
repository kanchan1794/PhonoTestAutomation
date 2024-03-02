Feature: Test Phonologix Master Activity Menu Functionality
  @MasterActivityMenu
  Scenario: Phonologix Master Activity Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Master Activity menu
    Then Admin can see Master Activity-List and Add Submenu

  @MasterActivityListSubMenu
  Scenario: Phonologix Therapist Submenu List Functionality
    When Admin clicks on Master Activity List submenu
    Then Admin can see The details of list of Master Activity
    When Admin Select Value from Category And Sub Category DropDown List
    Then Admin Can See Selected Category And SubCategory Record
    When Admin Enters Search Keywords for Master Activity
    Then Relevant Master Activity Search Results Generated
    #When Admin Select Value from Sub-Category DropDown List
    #Then Admin Can See Selected Sub-Category Record
    When Admin Select Value from Game Type DropDown List
    Then Admin Can See Selected Game Type Record
    And  Admin Search Record By ID

  @MasterActivityEditDetails
  Scenario: Phonologix Master Activity Edit Functionality
     When Admin Click on Edit Icon
     Then Admin Can Edit The Master Activity Details

  @MasterActivityDeleteDetails
  Scenario: Phonologix Master Activity Delete Functionality
     When Admin Click On Delete Icon
     Then Admin Can Delete The Master Activity

  @MasterActivityPlay
  Scenario: Phonologix Master Activity Play Functionality
     When Admin Click On Play Icon
     Then Admin Can Play The Master Activity

  @MasterActivityPagenavigation
  Scenario: Phonologix Master Activity Page Navigation Functionality
     When Admin Select Page number from DropDownList
     Then Admin Can Naviagte To The Perticular Page

  @MasterActivityScrollHorizantal
  Scenario: Phonologix Master Activity Horizantal Scroll Functionality
     When Admin Can Scroll Horizantal Inside Master Activity table







