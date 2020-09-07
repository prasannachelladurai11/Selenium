package com.ModuleReusedComponents;

import com.LoadElementLocator.LoadModuleElementLocators;
import com.VariableDeclaration.TestVariableDeclararion;
import com.WebDriverHelperClass.ReusablePageObject;
import org.openqa.selenium.*;

public class CommonlyUsedComponents extends ReusablePageObject {


    public static void assert_if_confirmation_pop_up_present_and_handle() throws Exception{
        LoadModuleElementLocators.load_elements_used_for_fucntionality();
        try{
            visibilityOfelement(By.cssSelector(obj.getProperty("inDomConfirmationpopup")));
                isElementPresent=true;
        }catch (NoSuchElementException | TimeoutException e){
                isElementPresent=false;
        }
        if(isElementPresent){
            success=false;
            count=0;
            Max_tries=5;
            while (!success & count++ < Max_tries){
                try {
                    visibilityOfelement(By.cssSelector(obj.getProperty("allowButtoninConfirmationpopup"))).click();
                    success = true;
                }catch (StaleElementReferenceException | ElementClickInterceptedException e){
                    success=false;
                    checkPageIsReady();
                    Thread.sleep(5000);
                }
            }
        }
    }
    public static void convert_Kelvin_to_celcius(String KelvinTemparature) throws Exception{
        TestVariableDeclararion.setCelsiusTemperature(String.valueOf(Float.parseFloat(KelvinTemparature) - 273.15F));
        System.out.println("Temperature From API:-"+TestVariableDeclararion.getCelsiusTemperature());
    }
}
