$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/FeatureFile/WeatherAuthetication.feature");
formatter.feature({
  "line": 1,
  "name": "Validation of Weather Reporter",
  "description": "",
  "id": "validation-of-weather-reporter",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Navigate to Weather page",
  "description": "",
  "id": "validation-of-weather-reporter;navigate-to-weather-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user navigates to home page url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user should be on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user clicks on the kebab menu in the home page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user should see list of menu with \"WEATHER\" present in the list",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the user clicks on the Weather option",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the user should be on the Weather page",
  "keyword": "Then "
});
formatter.match({
  "location": "FunctionalStepDefinition.the_user_navigates_to_home_page()"
});
formatter.result({
  "duration": 3693531900,
  "status": "passed"
});
formatter.match({
  "location": "FunctionalStepDefinition.the_user_should_be_on_the_home_page()"
});
formatter.result({
  "duration": 100100762600,
  "status": "passed"
});
formatter.match({
  "location": "FunctionalStepDefinition.the_user_clicks_on_the_kebab_menu_in_the_home_page()"
});
formatter.result({
  "duration": 304934800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WEATHER",
      "offset": 39
    }
  ],
  "location": "FunctionalStepDefinition.the_user_should_see_list_of_menu_with_present_in_the_list(String)"
});
formatter.result({
  "duration": 146053400,
  "status": "passed"
});
formatter.match({
  "location": "FunctionalStepDefinition.the_user_clicks_on_the_Weather_option()"
});
formatter.result({
  "duration": 2249244700,
  "status": "passed"
});
formatter.match({
  "location": "FunctionalStepDefinition.the_user_should_be_on_the_Weather_page()"
});
formatter.result({
  "duration": 20511500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Get Data from API",
  "description": "",
  "id": "validation-of-weather-reporter;get-data-from-api",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "the user gets the Weather data for particular \"\u003cCity\u003e\" from API",
  "keyword": "Given "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "validation-of-weather-reporter;get-data-from-api;",
  "rows": [
    {
      "cells": [
        "City"
      ],
      "line": 20,
      "id": "validation-of-weather-reporter;get-data-from-api;;1"
    },
    {
      "cells": [
        "Bengaluru"
      ],
      "line": 21,
      "id": "validation-of-weather-reporter;get-data-from-api;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Get Data from API",
  "description": "",
  "id": "validation-of-weather-reporter;get-data-from-api;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "the user gets the Weather data for particular \"Bengaluru\" from API",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 47
    }
  ],
  "location": "ApiStepDefinition.get_the_weather_data_for_particular_city_from_api(String)"
});
formatter.result({
  "duration": 2451745200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Get Weather data from the Map",
  "description": "",
  "id": "validation-of-weather-reporter;get-weather-data-from-the-map",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "the user should be on the Weather page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "the user searches for the respective \"\u003cCity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "the user should see the \"\u003cCity\u003e\" name in the suggestion box",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "the user clicks the checkbox for the searched \"\u003cCity\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "the particular \"\u003cCity\u003e\" should appear in the Map with weather details",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "the temperature should match with Api results",
  "keyword": "And "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "validation-of-weather-reporter;get-weather-data-from-the-map;",
  "rows": [
    {
      "cells": [
        "City"
      ],
      "line": 34,
      "id": "validation-of-weather-reporter;get-weather-data-from-the-map;;1"
    },
    {
      "cells": [
        "Bengaluru"
      ],
      "line": 35,
      "id": "validation-of-weather-reporter;get-weather-data-from-the-map;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "Get Weather data from the Map",
  "description": "",
  "id": "validation-of-weather-reporter;get-weather-data-from-the-map;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "the user should be on the Weather page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "the user searches for the respective \"Bengaluru\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "the user should see the \"Bengaluru\" name in the suggestion box",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "the user clicks the checkbox for the searched \"Bengaluru\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "the particular \"Bengaluru\" should appear in the Map with weather details",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "the temperature should match with Api results",
  "keyword": "And "
});
formatter.match({
  "location": "FunctionalStepDefinition.the_user_should_be_on_the_Weather_page()"
});
formatter.result({
  "duration": 22137900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 38
    }
  ],
  "location": "FunctionalStepDefinition.the_user_searches_for_the_respective_city(String)"
});
formatter.result({
  "duration": 102508600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 25
    }
  ],
  "location": "FunctionalStepDefinition.the_user_should_see_the_city_name_in_the_suggestion_box(String)"
});
formatter.result({
  "duration": 83973800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 47
    }
  ],
  "location": "FunctionalStepDefinition.the_user_clicks_the_checkbox_for_the_city(String)"
});
formatter.result({
  "duration": 48527300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 16
    }
  ],
  "location": "FunctionalStepDefinition.the_particular_city_should_be_present_in_map(String)"
});
formatter.result({
  "duration": 73215500,
  "status": "passed"
});
formatter.match({
  "location": "FunctionalStepDefinition.the_temperature_of_should_match_with_Api_results()"
});
formatter.result({
  "duration": 1499700,
  "error_message": "java.lang.AssertionError: Variance Calculated Should be Less the Variance Assigned. expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:494)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.FucntionalityModules.VarianceFunctionalityModule.find_variance_and_authenticate_weather(VarianceFunctionalityModule.java:12)\r\n\tat com.ModuleStepDefinitions.FunctionalStepDefinition.the_temperature_of_should_match_with_Api_results(FunctionalStepDefinition.java:57)\r\n\tat ✽.And the temperature should match with Api results(src/main/resources/FeatureFile/WeatherAuthetication.feature:31)\r\n",
  "status": "failed"
});
});