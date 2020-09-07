package com.ModuleStepDefinitions;

import com.FucntionalityModules.HomePageAuthetication;
import com.FucntionalityModules.LauchWebsite;
import com.FucntionalityModules.VarianceFunctionalityModule;
import com.FucntionalityModules.WeatherPageAuthentication;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FunctionalStepDefinition {


  @Given("^the user navigates to home page url$")
    public static void the_user_navigates_to_home_page() throws Exception{
        LauchWebsite.open_Browser_and_launch_url();
  }
  @Then("^the user should be on home page$")
    public static void the_user_should_be_on_the_home_page() throws Exception{
      HomePageAuthetication.assert_browser_is_in_homepage();
  }
  @When("^the user clicks on the kebab menu in the home page$")
  public void the_user_clicks_on_the_kebab_menu_in_the_home_page() throws Throwable {
      HomePageAuthetication.click_kebab_menu_in_the_home_page();
    }
  @Then("^the user should see list of menu with \"([^\"]*)\" present in the list$")
  public void the_user_should_see_list_of_menu_with_present_in_the_list(String Weather) throws Throwable {
      HomePageAuthetication.assert_weather_present_in_the_menu(Weather);
  }
  @When("^the user clicks on the Weather option$")
  public void the_user_clicks_on_the_Weather_option() throws Throwable {
      HomePageAuthetication.click_weather_icon_in_homepage();
  }
  @Then("^the user should be on the Weather page$")
  public void the_user_should_be_on_the_Weather_page() throws Throwable {
      WeatherPageAuthentication.assert_browser_in_weather_landing_page();
  }
  @When("^the user searches for the respective \"([^\"]*)\"$")
  public void the_user_searches_for_the_respective_city(String CityName) throws Throwable {
      WeatherPageAuthentication.search_for_the_city_name(CityName);
  }
  @Then("^the user should see the \"([^\"]*)\" name in the suggestion box$")
  public void the_user_should_see_the_city_name_in_the_suggestion_box(String CityName) throws Throwable {
      WeatherPageAuthentication.assert_if_searched_city_appears_in_suggestion_box(CityName);
  }
  @When("^the user clicks the checkbox for the searched \"([^\"]*)\"$")
  public void the_user_clicks_the_checkbox_for_the_city(String CityName) throws Throwable {
      WeatherPageAuthentication.click_check_box_for_the_city_name_searched(CityName);
  }
  @And("^the particular \"([^\"]*)\" should appear in the Map with weather details$")
  public void the_particular_city_should_be_present_in_map(String CityName) throws Exception{
      WeatherPageAuthentication.assert_if_searched_city_present_in_map(CityName);
  }
    @Then("^the temperature should match with Api results$")
    public void the_temperature_of_should_match_with_Api_results() throws Throwable {
        VarianceFunctionalityModule.find_variance_and_authenticate_weather();
    }
}
