Feature: Test Phonologix Dashboard Functionality


@Login
    Scenario: Test Login And Dashboard Fuctionality
    Given Browser is open and user is logged in
#  @Dashboard
#  Scenario: Phonologix Dashboard Functionality
    And User Can Select The Value From Dropdownlist
    When User Click On Plan Expiry Report
    Then User Navigates To Plan Expiry Report Page
    When User Click On Slot Booked Report
    Then User Navigates To Slot Booked Report Page
    When User Click On Slot Complete Report
    Then User Navigates To Slot Complete Report Page
    When User Click On Assessments Report
    Then User Navigates To Assessments Report Page

