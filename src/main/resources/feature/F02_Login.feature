@regression
Feature: user should be able to login to system


  Scenario: user login with valid data
    Given user open login page

    When user enter valid "email" and "password"
    And  user click in login button

    Then user could login successfully


