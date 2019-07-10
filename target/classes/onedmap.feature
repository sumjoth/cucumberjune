Feature: To add customer

  @tag1
  Scenario: To add customer
    Given The user should be in telecom homepage
    When The user provide valid details
      | fname   | ganesh           |
      | lname   | j                |
      | mail    | ganesh@gmail.com |
      | address | chennai          |
      | phone   |       9677700348 |
    Then The user should generate customer ID
