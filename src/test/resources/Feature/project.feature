# Author: Manish Talan
Feature: To test the title of the application

  Scenario Outline: Scenario to check search functionality
    Given User open the browser
    And User pauses the "https://www.wikipedia.org/"
    Then User verifies the title "Wikipedia" of the application
    When User enters '<search>' data in Wikipedia textbox
    And User presses the search button
    Then User verifies the title "India - Wikipedia" of the application
    And User selects Login button from Wikipedia page
    When User enters the username "Manish Talan"
    And User enters the password "Manish@123"
    Then User presses the login button
    And User closes the browser

    Examples: 
      | search   |
      | India    |
