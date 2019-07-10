Feature: To add customer

  @tag1
  Scenario: To add customer
    Given The user should be in telecom homepage
    When The user provide valid details
      | ganesh | js | gggg@gmail.com | chennai | 96761661121 |
    Then The user should generate customer ID
