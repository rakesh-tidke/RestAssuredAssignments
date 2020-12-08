
Feature: Test script for negative scenario

  Scenario: Validate response for Negative scenario
    Given API for foreign exchange
    When posted with correct information
    Then validate positive response code received
