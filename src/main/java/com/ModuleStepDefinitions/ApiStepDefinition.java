package com.ModuleStepDefinitions;

import com.ApiModules.GetDataOftheCityFromAPI;
import com.VariableDeclaration.TestVariableDeclararion;
import cucumber.api.java.en.Given;
import org.testng.Assert;

public class ApiStepDefinition {


    @Given("^the user gets the Weather data for particular \"([^\"]*)\" from API")
    public void get_the_weather_data_for_particular_city_from_api(String CityName) throws Exception{
        GetDataOftheCityFromAPI.get_weather_data_from_Api_for_the_City(CityName);
    }
}
