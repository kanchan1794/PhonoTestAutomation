Feature: Test Phonologix Discount Coupons Menu Functionality
  @LeadMenu
  Scenario: Phonologix Discount Coupons Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Lead menu
    Then Admin can see Leads List and Add Submenu
  @LeadListSubMenu
  Scenario: Phonologix Lead Submenu List Functionality
    When Admin clicks on Lead List submenu
    Then Admin can see The details of list of Leads
    When Admin Enters Search Keywords for Leads
    Then Relevant Search Results For Leads Generated
    When Admin select value from lead dropdown list
    Then admin can see relevant lead record
  @ViewLeadsDetails
  Scenario: Phonologix View Leads Details Functionality
    When Admin Can Click On view Icon
    Then Admin Can See Leads Details

  @EditLeadsDetails
  Scenario: Phonologix Edit Leads Details Functionality
    When Admin click on Leads edit button
    Then Admin can edit leads details

  @LeadsPageNavigation
  Scenario: Phonologix Edit Leads Page navigation Functionality
    When Admin click on leads perticular page number
    Then Admin can navigate to that leads page

  @ConvertLeadsFunctionality
  Scenario: Phonologix Convert Leads Functionality
    When Admin Clicks on Convert Leads Link
    Then Leads gets converted


