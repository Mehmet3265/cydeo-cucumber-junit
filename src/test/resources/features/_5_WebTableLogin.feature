Feature:Login scenario

  Background: user is on the login page
    Given user is on the login page of webTable app

  Scenario: positive scenario

    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see URL contains order


  Scenario: positive scenario
    When user enters username "Test"  password "Testers" and logins
    Then user should see URL contains order


@wip
  Scenario: User is on the dropdowns page of practice tool
    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see URL contains order






