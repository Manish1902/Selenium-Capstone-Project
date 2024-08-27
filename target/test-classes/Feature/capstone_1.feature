# Author: Manish Singh
Feature: To test the title of the application

  @Sanity
  Scenario: Scenario to verify the title of the application
    Given User open the browser
    And User pauses the "https://www.wikipedia.org/"
    Then User verifies the title "Wikipedia" of the application
    And User closes the browser
