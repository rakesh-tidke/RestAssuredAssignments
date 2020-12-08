
Feature: Negative Scenario for Future Date

  Scenario: Validate Negative Scenario for Future Date
    Given API for foreign exchange
    When posted with future date information
    Then validate positive response code received
