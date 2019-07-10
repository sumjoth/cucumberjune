Feature: To add customer

  @tag1
  Scenario: To add customer
    Given The user should be in telecom homepage
    When The user provide valid details
      | ganesh | j          | gan@gmail.com          | chennai     |   5451545 |
      | babu   | ji         | bb@gmail.com           | salem       |   9625896 |
      | rajini | kanth      | superstar@gmail.com    | poes garden |  54465194 |
      | vijay  | sethupathy | makkalselvan@gmail.com | rajapalayam | 946146163 |
    Then The user should generate customer ID
