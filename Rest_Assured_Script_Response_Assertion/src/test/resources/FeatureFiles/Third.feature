
Feature: Validate response status code using assertions

  Scenario: Use assertions to validate response code
    Given API for foreign exchange
    When posted with correct information
    Then validate the positive response code received
