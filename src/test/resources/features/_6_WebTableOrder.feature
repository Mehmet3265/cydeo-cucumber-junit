
Feature:

  Scenario: User should be able to place order and order seen in the web table

   Given user is allready logged in and on order page
   When user selects product type "Familybea"
   Then user enters appropriate test data
    And user enters quantity 2
    And user enters costumer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "MasterCard"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button

 Then user should see "Sherlock Holmes" in first row of the web table




 Scenario Outline: User should be able to place order and order seen in the web table

  Given user is allready logged in and on order page
  When user selects product type "<productType>"
  Then user enters appropriate test data
  And user enters quantity <quantity>
  And user enters costumer name "<customerName>"
  And user enters street "<street>"
  And user enters city "<city>"
  And user enters state "<state>"
  And user enters zipcode "<zipcode>"
  And user selects credit card type "<cardType>"
  And user enters credit card number "<cardNumber>"
  And user enters expiry date "<expireDate>"
  And user enters process order button
  Then user should see "<scientistName>" in first row of the web table

  @femaleScientists
  Examples: Femous female scientists
   | productType | quantity | customerName       | street            | city   | state   | zipcode | cardType   | cardNumber       | expireDate | scientistName      |
   | Familybea   | 2        | Marie Curie        | 221B Baker Street | London | England | 50505   | MasterCard | 1111222233334444 | 12/23      | Marie Curie        |
   | MoneyCog    | 3        | Rosalin Franklin   | 221B Baker Street | London | England | 50505   | MasterCard | 1111222233334444 | 12/23      | Rosalin Franklin   |
   | Screenable  | 4        | List Meitner       | 221B Baker Street | London | England | 50505   | MasterCard | 1111222233334444 | 12/23      | List Meitner       |
   | Familybea   | 5        | Chien-Shiung Wu    | 221B Baker Street | London | England | 50505   | MasterCard | 1111222233334444 | 12/23      | Chien-Shiung Wu    |
   | Familybea   | 6        | Barbara McClintock | 221B Baker Street | London | England | 50505   | MasterCard | 1111222233334444 | 12/23      | Barbara McClintock |

  @MaleScientists
  Examples: Femous male scientists
   | productType | quantity | customerName    | street            | city   | state   | zipcode | cardType   | cardNumber       | expireDate | scientistName   |
   | Familybea   | 2        | Charles Darwin  | 221B Baker Street | London | England | 50505   | MasterCard | 1111222233334444 | 12/23      | Charles Darwin  |
   | MoneyCog    | 3        | Albert Einstain | 221B Baker Street | London | England | 50505   | MasterCard | 1111222233334444 | 12/23      | Albert Einstain |
   | Screenable  | 4        | C.V. Raman      | 221B Baker Street | London | England | 50505   | MasterCard | 1111222233334444 | 12/23      | C.V. Raman      |
   | Familybea   | 5        | Galileo         | 221B Baker Street | London | England | 50505   | MasterCard | 1111222233334444 | 12/23      | Galileo         |
   | Familybea   | 6        | Isaac Newton    | 221B Baker Street | London | England | 50505   | MasterCard | 1111222233334444 | 12/23      | Isaac Newton    |
