
Feature: Negative Response code of future date using assertion

  Scenario: Validate Negative Response code of future date using assertion
    Given API for foreign exchange
    When posted with future date information
    Then validate positive response code received
