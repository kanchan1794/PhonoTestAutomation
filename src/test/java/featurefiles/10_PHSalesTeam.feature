Feature: Test Phonologix Sales Team Menu Functionality
  @SlotMenu
  Scenario: Phonologix Sales Team Functionality
   # Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Sales Team menu
    Then Admin can see Sales Team Submenu Options
  @SalesTeamListSubmenu
  Scenario: Phonologix Sales Team List Submenu Functionality
    When Admin clicks on SalesTeam-list submenu
    Then Admin can see The details of list of Sales Team

  @SalesTeamAddSubMenu

  Scenario: Phonologix Sales Team Add SubMenu Functionality
    When Admin clicks on Sales Team-Add submenu
    Then Admin Can Add Details Of Sales Team




