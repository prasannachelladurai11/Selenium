Feature: Validation of Weather Reporter


  @run
Scenario: Navigate to Weather page

  Given the user navigates to home page url
  Then the user should be on home page
  When the user clicks on the kebab menu in the home page
  Then the user should see list of menu with "WEATHER" present in the list
  When the user clicks on the Weather option
  Then the user should be on the Weather page

  @run
Scenario Outline: Get Data from API

  Given the user gets the Weather data for particular "<City>" from API

  Examples:
    |City   |
    |Bengaluru|

  @run
Scenario Outline: Get Weather data from the Map

    Given the user should be on the Weather page
    When the user searches for the respective "<City>"
    Then the user should see the "<City>" name in the suggestion box
    When the user clicks the checkbox for the searched "<City>"
    Then the particular "<City>" should appear in the Map with weather details
    And the temperature should match with Api results

    Examples:
      |City   |
      |Bengaluru|