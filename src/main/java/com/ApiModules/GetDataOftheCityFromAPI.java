package com.ApiModules;

import com.JsonParser.ParseJsonBodyResponse;
import com.ModuleReusedComponents.CommonlyUsedComponents;
import com.ParseDataFromExcel.InputDataProvider;
import com.VariableDeclaration.TestVariableDeclararion;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetDataOftheCityFromAPI {

    /**
     * Rest Assured has three important Static in built methods
     * Given- Which is used to send all the Inputs for the Api
     * When - Submitting the API- used for giving resource name and http methods i.e get,post,put etc
     * Then- Validating the response from the API i.e status code, response body etc.
     */
    public static void get_weather_data_from_Api_for_the_City(String CityName) throws Exception{
       RestAssured.baseURI= InputDataProvider.getApiBaseURL();
        TestVariableDeclararion.setResponseBody(
                given().log().all()
                .queryParam("q",CityName)
                .queryParam("appid",InputDataProvider.getApiKey())
                .header("Content-Type","application/json")
                .when()
                .get("data/2.5/weather")
                .then()
                .assertThat().statusCode(200)
                .extract().response().asString());
        ParseJsonBodyResponse.parse_values_from_response_body_from_json(TestVariableDeclararion.getResponseBody());
        CommonlyUsedComponents.convert_Kelvin_to_celcius(TestVariableDeclararion.getTemperatureFromApi());
    }
}
