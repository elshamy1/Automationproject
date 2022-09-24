@regression
Feature: user should be able to register to system


  Scenario: user register with valid data
    Given user open register page

    When user enter all data
    And  user click in register button

    Then user could register successfully


