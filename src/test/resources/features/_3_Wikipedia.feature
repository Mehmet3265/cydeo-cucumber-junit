@smoke
Feature: Wikipedia Search Functionality and Verification


  Scenario: Wikipedia Search Functionality Title Verification
    Given  User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario:Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header


  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given  User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: Search values we are going to be using in this scenario is as below
      | searchValue | expectedTitle | expectedMainHeader |
      | Marie Curie   | Marie Curie     | Marie Curie          |
      | Lady Gaga   | Lady Gaga     | Lady Gaga          |
      | Steve Jobs  | Steve Jobs    | Steve Jobs         |
      | Bob Marley  | Bob Marley    | Bob Marley         |







