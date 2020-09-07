package com.ParseDataFromExcel;

import com.DataProvider.ReadDataFromExcel;
import com.VariableDeclaration.TestVariableDeclararion;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.testng.annotations.Test;

public class InputDataProvider extends TestVariableDeclararion {

    static ReadDataFromExcel parseData= new ReadDataFromExcel();

@Test()
public static void get_Data_For_Functionality_execution() throws Exception{
            setUrl(parseData.getExceldata("WeatherData",1,0));
            setCityName(parseData.getExceldata("WeatherData",1,1));
            setApiBaseURL(parseData.getExceldata("WeatherData",1,2));
            String EncryptedKey=parseData.getExceldata("WeatherData",1,3);
            StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
            encryptor.setPassword("P@ssw0rd");
            setApiKey(encryptor.decrypt(EncryptedKey));
            setVarianceAssinged(Double.parseDouble(parseData.getExceldata("WeatherData",1,4)));
    }
}
