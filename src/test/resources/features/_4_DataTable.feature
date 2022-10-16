Feature: Examples of cucumber data table implementation


  Scenario: List of fruits I like
    Then user should see fruits I like

      | kiwi       |
      | banana     |
      | cucumber   |
      | orange     |
      | mango      |
      | grapes     |
      | pomgranate |
    #to beautify options above
     # ctrl + alt + l
    #mac: control + alt +l


  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown

      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
