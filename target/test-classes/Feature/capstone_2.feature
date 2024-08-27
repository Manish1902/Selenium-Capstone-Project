# Author: Manish Talan
Feature: To test the title of the application

  Scenario Outline: Scenario to check search functionality
    Given User open the browser
    And User pauses the "https://www.wikipedia.org/"
    Then User validates the outcomes
    Then User verifies the title "Wikipedia" of the application
    When User enters '<search>' data in Wikipedia textbox
    And User presses the search button
    And User closes the browser

    Examples: 
      | search   |
      | India    |
