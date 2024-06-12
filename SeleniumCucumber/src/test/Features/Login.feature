@SmokeFeature
Feature: feature to test login functionality.
@SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enter username and password
    And click on login button
    Then user is navigated to home page

