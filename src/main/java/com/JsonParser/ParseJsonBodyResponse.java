package com.JsonParser;

import com.ModuleReusedComponents.CommonlyUsedComponents;
import com.VariableDeclaration.TestVariableDeclararion;
import io.restassured.path.json.JsonPath;

public class ParseJsonBodyResponse {


    public static void parse_values_from_response_body_from_json(String ResponseBody) throws Exception{
        JsonPath jsonParser=new JsonPath(ResponseBody);
        TestVariableDeclararion.setTemperatureFromApi(jsonParser.getString("main.temp"));
    }
}
