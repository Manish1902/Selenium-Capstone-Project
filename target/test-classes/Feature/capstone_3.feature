# Author: Manish Singh
Feature: To login into Wikipedia

  @Sanity
  Scenario: Scenario to login into Wikipedia
    Given User open the browser
    And User pauses the "https://en.wikipedia.org/wiki/India"
    Then User verifies the title "India - Wikipedia" of the application
    And User selects Login button from Wikipedia page
    When User enters the username "Manish Talan"
    And User enters the password "Manish@123"
    Then User presses the login button
