package com.FucntionalityModules;

import com.LoadElementLocator.LoadModuleElementLocators;
import com.ModuleReusedComponents.CommonlyUsedComponents;
import com.ParseDataFromExcel.InputDataProvider;
import com.WebDriverHelperClass.ReusablePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;

public class HomePageAuthetication extends ReusablePageObject {


    public static void assert_browser_is_in_homepage() throws Exception{
        checkPageIsReady();
        urlTobePresent(InputDataProvider.getUrl());
        titleTobePresent("NDTV: Latest News, India News, Breaking News, Business, Bollywood, Cricket, Videos & Photos");
        LoadModuleElementLocators.load_elements_used_for_fucntionality();
        CommonlyUsedComponents.assert_if_confirmation_pop_up_present_and_handle();
    }
   public static void click_kebab_menu_in_the_home_page() throws Exception{
       checkPageIsReady();
       LoadModuleElementLocators.load_elements_used_for_fucntionality();
       success=false;
       count=0;
       Max_tries=5;
       while (!success & count++ < Max_tries){
           try {
               visibilityOfelement(By.cssSelector(obj.getProperty("KebabMenu"))).click();
               success = true;
           }catch (StaleElementReferenceException | ElementClickInterceptedException e){
               success=false;
               checkPageIsReady();
               Thread.sleep(5000);
           }
       }
   }
   public static void assert_weather_present_in_the_menu(String Weather) throws Exception{
       checkPageIsReady();
       LoadModuleElementLocators.load_elements_used_for_fucntionality();
       Assert.assertTrue(visibilityOfelement(By.xpath(obj.getProperty("WeatherpresentInmenu"))).isDisplayed(),"Weather should be present as one of the menu in Homepage");
       Assert.assertEquals(Weather,visibilityOfelement(By.xpath(obj.getProperty("WeatherpresentInmenu"))).getText());
   }
   public static void click_weather_icon_in_homepage() throws Exception{
       checkPageIsReady();
       LoadModuleElementLocators.load_elements_used_for_fucntionality();
       success=false;
       count=0;
       Max_tries=5;
       while (!success & count++ < Max_tries){
           try {
               visibilityOfelement(By.xpath(obj.getProperty("WeatherpresentInmenu"))).click();
               success = true;
           }catch (StaleElementReferenceException | ElementClickInterceptedException e){
               success=false;
               checkPageIsReady();
               Thread.sleep(5000);
           }
       }
   }
}
