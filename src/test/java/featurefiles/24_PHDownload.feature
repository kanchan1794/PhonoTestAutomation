Feature: Test Phonologix  Download  Menu Functionality
  @DownloadMenu
  Scenario: Phonologix Download Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Download menu
    Then Admin can see Process to download Session Report

  @DownloadSessionReport
  Scenario: Phonologix Download Session Report Functionality
    When Admin Click on One of The Download Session Report Option
    Then Admin Selects Client, therapist And Duration
    And  Admin Click On Download Report Button





