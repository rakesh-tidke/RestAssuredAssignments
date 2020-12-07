
Feature: Test success status of latest foreign exchange rates api

  Scenario: success status of latest foreign exchange rates api
    Given API for foreign exchange
    When posted with correct information
    Then validate positive response code received
