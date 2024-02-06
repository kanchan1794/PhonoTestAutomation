Feature: Test Phonologix Therapist Menu Functionality
  @TherapistMenu
  Scenario: Phonologix Therapist Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Therapist menu
    Then Admin can see List and Add Submenu

    @TherapistListSubMenu
    Scenario: Phonologix Therapist Submenu List Functionality
    When Admin clicks on List submenu
    Then Admin can see The details of list of therapist
    When Admin Enters Search Keywords
    Then Relevant Search Results Generated

  @TherapistShowCredentials
  Scenario: Phonologix Therapist Show Credentials Functionality
    When Admin Clicks On Key Icon To View Therapist Credentials
    Then Admin Can Copy Therapist Credentials
    And Admin Can verify Therapist Credentials AlertBox

  @TherapistViewDetails
  Scenario: Phonologix View Therapist Functionality
    When Admin Clicks On View Icon To View Therapist Details
    Then Admin Can Vierify Therapist Details Page
    When Admin clicks on edit button to edit the therapist details
    Then Admin can edit the therapist details

  @TherapistExcelFileDownload
    Scenario: Phonologix Excel File Download Button Functionality
    When Admin clicks on save excel file button
    Then File gets downloaded

   @PageBreadCrumbs
    Scenario: Phonologix Page BreadCrumbs Functionality
    When Admin clicks on perticular page breadcrumbs
    Then admin can see the data on perticular page

   @TherapistListTableScrollDown
    Scenario: Phonologix Therapist Submenu List Scroll Vertically Inside Table Functionality
    And Admin can scroll vertically inside the list table
    And Admin can scroll horizantally inside the list table


    @TherapistAddSubMenu
    Scenario: Phonologix Add Therapist Functionality
      When Admin clicks on Add submenu
      Then Admin can add new therapist details
      And Admin navigates on dashboard page








