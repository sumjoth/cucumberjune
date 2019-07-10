@tag
Feature: To add customer

  @tag1
  Scenario: To add customer
    Given The user should be in telecom homepage
    And The user should click add customer
    When The user provide valid details
    Then The user should generate customer ID
