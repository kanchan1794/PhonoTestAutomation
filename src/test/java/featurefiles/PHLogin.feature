Feature: Test Phonologix Login Functionality

  Scenario: Check Login is Successfull With valid Credentials
    Given Browser Is Open
    And User Is On Login Page
    When User Enters Username and Password
    And User Clicks On Login button
    Then User Is Navigated To Dashboard
