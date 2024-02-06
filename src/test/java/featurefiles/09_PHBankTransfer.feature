Feature: Test Phonologix Bank Tarnsfer Approval Menu Functionality
  @BankTransferApprovalMenu
  Scenario: Phonologix Bank Transfer Approval Menu Functionality
    When Admin clicks on Bank Tarnsfer Approval Menu
    Then Admin can see Bank Tarnsfer Approval  List
    And Admin Can Search Record From Bank Transfer Approval List
    When Admin Clicks On View Payment Proof
    Then Admin Can See Payment Information

  @BankTransferApprovalListTableScrollDown
  Scenario: Phonologix Bank Transfer Approval Acroll Inside Table Functionality
  #And Admin can scroll vertically inside the bank transfer approval list table
    And Admin can scroll horizantally inside the bank transfer approval list table


  #@InvoicePageBreadCrumbs
  #Scenario: Phonologix Invoices functionality
   # When Admin clicks on perticular Invoices page breadcrumbs
    #Then admin can see the data on perticular Invoices page
