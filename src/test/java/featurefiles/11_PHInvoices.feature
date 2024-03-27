Feature: Test Phonologix Invoices Menu Functionality
@InvoicesMenu
  Scenario: Phonologix Invoices functionality
  When Admin clicks on Invoices menu
  Then Admin can see Invoices List
  When Admin Clicks On View Invoice Link
  Then Admin Can See Invoice Information

  @InvoicePageBreadCrumbs
  Scenario: Phonologix Invoices page Bread Crumbs functionality
    When Admin clicks on perticular Invoices page breadcrumbs
    Then admin can see the data on perticular Invoices page

  @InvoiceScrollInsidetable
  Scenario: Phonologix Invoices Inside table Scrolling functionality
    And Admin Can Scroll Horizantal Inside Invoice table
    And Admin Can Scroll vertical Inside Invoice table

  @InvoiceSearch
  Scenario: Phonologix Invoices Search functionality
    When Admin Enters Search Keywords inside Invoices
    Then Admin Can See Searched Results In Invoices List
