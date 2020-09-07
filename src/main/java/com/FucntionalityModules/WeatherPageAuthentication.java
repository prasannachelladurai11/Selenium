package com.FucntionalityModules;

import com.LoadElementLocator.LoadModuleElementLocators;
import com.ModuleReusedComponents.CommonlyUsedComponents;
import com.ParseDataFromExcel.InputDataProvider;
import com.VariableDeclaration.TestVariableDeclararion;
import com.google.common.base.CharMatcher;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.testng.Assert;

public class WeatherPageAuthentication extends CommonlyUsedComponents {

    /**
     * In {@link HomePageAuthetication} class we saw how the Elements can be loaded to
     * a method by calling that method. Here we are loading the method to the entire class
     * by calling it inside a constructor.
     * @throws Exception
     */
    public WeatherPageAuthentication() throws Exception{
        LoadModuleElementLocators.load_elements_used_for_fucntionality();
    }
    public static void assert_browser_in_weather_landing_page() throws Exception{
        checkPageIsReady();
        urlTobePresent("https://social.ndtv.com/static/Weather/report/?pfrom=home-topsubnavigation");
        titleTobePresent("NDTV Weather - Weather in your Indian City");
    }
    public static void search_for_the_city_name(String CityName) throws Exception{
        checkPageIsReady();
        success=false;
        count=0;
        Max_tries=5;
        while (!success & count++ < Max_tries){
            try {
                visibilityOfelement(By.id(obj.getProperty("SearchBoxinWeatherPage"))).sendKeys(CityName);
                success = true;
            }catch (StaleElementReferenceException | ElementClickInterceptedException e){
                success=false;
                checkPageIsReady();
                Thread.sleep(5000);
            }
        }
    }
    public static void assert_if_searched_city_appears_in_suggestion_box(String CityName) throws Exception{
        checkPageIsReady();
        Assert.assertTrue(visibilityOfelement(By.cssSelector("input#"+CityName)).isDisplayed(),"Searched city Name should be displayed in the Suggestion box.");
    }
    public static void click_check_box_for_the_city_name_searched(String CityName) throws Exception{
        checkPageIsReady();
        success=visibilityOfelement(By.cssSelector("input#"+CityName)).isSelected();
        count=0;
        Max_tries=5;
        while (!success & count++ < Max_tries){
            try {
                visibilityOfelement(By.cssSelector("input#"+CityName)).click();
                success = true;
            }catch (StaleElementReferenceException | ElementClickInterceptedException e){
                success=false;
                checkPageIsReady();
                Thread.sleep(5000);
            }
        }
    }
    public static void assert_if_searched_city_present_in_map(String CityName) throws Exception{
        checkPageIsReady();
        elementTobe=presenceOfelement(By.xpath("//div[@class='cityText' and text()='"+CityName+"']"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", elementTobe);
        Assert.assertTrue(elementTobe.isDisplayed(),"Weather for the City should be Displayed");
        textTobe=presenceOfelement(By.xpath("//div[@class='cityText' and text()='"+CityName+"']/..//span[@class='tempRedText']")).getText();
        System.out.println("Temperature Displayed in UI:-"+CharMatcher.digit().retainFrom(textTobe));
        TestVariableDeclararion.setTemperatureFromUi(CharMatcher.digit().retainFrom(textTobe));
    }
}
