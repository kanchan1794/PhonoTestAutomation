Feature: Test Phonologix Demo Goals Menu Functionality
  @DemoGoalsMenu
  Scenario: Phonologix Demo Goals Menu Functionality
    Given Admin is on phonologix dashborad
    #Given Browser is open and user is logged in
    When Admin clicks on Demo Goals menu
    Then Admin can see Demo Goals Details

  @DemoGoals-CategoryAndSubCategory
  Scenario: Phonologix DemoGoals-Category And SubCategory Functionality
    When Admin First Select Category value
  And Admin Then Select Sub-Category Value
    Then Admin Can See Selected Category And SubCategory Demo goals Record

  @DemoGoalsDeleteFunction
  Scenario: Phonologix Demo Goals Delete Functionality Functionality
    When Admin clicks on Delete button to delete perticular demo goal
    Then Admin Can delete perticular demo goalm record

  #@SearchScreeningTest
  #Scenario: Phonologix Search Screening Test Functionality
   # When Admin enters value to search for screening test record
    #Then Admin can see perticular screening test result
