Feature: Test Phonologix  Download  Menu Functionality
  @DownloadMenu
  Scenario: Phonologix Download Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Download menu
    Then Admin can see Process to download Session Report


  @DownloadSessionReport
  Scenario: Phonologix Download Session Report Functionality
    When Admin clicks on download session report
    Then Admin can select required details to download the report
     And Admin can download particular session report




