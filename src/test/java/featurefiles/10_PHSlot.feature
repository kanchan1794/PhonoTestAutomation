Feature: Test Phonologix Slot Menu Functionality
  @SlotMenu
  Scenario: Phonologix Slot Functionality
   # Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Slot menu
    Then Admin can see Slot Submenu Options
  @SlotCalendarViewSubmenu
  Scenario: Phonologix Slot CalendarView Submenu Functionality
    When Admin clicks on Slot-CalendarView submenu
    Then Admin Can See The Slot Calendar
    When Admin Select The therapist Name From DropDown
    Then Admin Can See Slot Calendar For Selected Therapist
    When Admin Can Select Status from DropDown-List
    Then Admin Can See Slot Calendar For Perticular Status
    When Admin Can Select Start-Time from DropDown-List
    Then Admin Can See Slot Calendar For Perticular Start-Time
  @SlotZoomReportSubmenu

  Scenario: Phonologix Slot Zoom Report Submenu Functionality
    When Admin clicks on Slot-Zoom Report submenu
    Then Admin Can See The Slot-Zoom Report
    When Admin Select Start-Date And End-Date And click On Submit Button
    Then Admin Can See Zoom Report For Selected Duration
    When Admin Select Email From DropDown List
    Then Admin Can See Zoom Report For Selected Email



