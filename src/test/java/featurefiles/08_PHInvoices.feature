Feature: Test Phonologix Invoices Menu Functionality
@InvoicesMenu
  Scenario: Phonologix Invoices functionality
  When Admin clicks on Invoices menu
  Then Admin can see Invoices List
  When Admin Clicks On View Invoice Link
  Then Admin Can See Invoice Information
  @InvoicePageBreadCrumbs
  Scenario: Phonologix Invoices functionality
    When Admin clicks on perticular Invoices page breadcrumbs
    Then admin can see the data on perticular Invoices page
