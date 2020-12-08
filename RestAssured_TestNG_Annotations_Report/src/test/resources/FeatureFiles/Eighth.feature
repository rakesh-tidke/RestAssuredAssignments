
Feature: Data Provider annotation to parameterize the values and TestNG report

  Scenario: Parameterize the value using Data provider annotation and TestNG report
    Given API for foreign exchange
    When posted with correct information
    Then validate positive response code received
