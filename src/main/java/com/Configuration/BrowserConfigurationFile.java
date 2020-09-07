package com.Configuration;

import com.BrowserGenerator.GenerateBrowserToRun;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BrowserConfigurationFile {

    private static WebDriver driver;
    private static String browserName;
    public static WebDriverWait wait;

    public static void chrome_Browser_setUp(String BrowserName) throws Exception {
        /**
         * The  Driver is added to the src-->Executable Drivers Folder and this Version of ChromeDriver Supports only Chrome Version of 85
         * If the Version is Above or Below that please download the Chromedriver from https://sites.google.com/a/chromium.org/chromedriver/
         * according to the Version of Chrome in the Local Machine and place it in the Same Folder
         */
        File location=new File("src/Executable Drivers/"+BrowserName);
        File name = new File(location, "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",name.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        setDriver(new ChromeDriver(options));
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
    }
    public static void firefox_Browser_setUp(String BrowserName) throws Exception {
        File location=new File("src/Executable Drivers/"+BrowserName);
        File name = new File(location, "geckodriver.exe");
        System.setProperty("webdriver.gecko.driver",name.getAbsolutePath());
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-private");
        setDriver(new FirefoxDriver(options));
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
    }
    public static void Edge_Browser_setUp(String BrowserName) throws Exception {
        File location=new File("src/Executable Drivers/"+BrowserName);
        File name = new File(location, "msedgedriver.exe");
        System.setProperty("webdriver.edge.driver",name.getAbsolutePath());
        EdgeOptions options = new EdgeOptions();
        options.setCapability("InPrivate", true);
        setDriver(new EdgeDriver(options));
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
    }







    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        BrowserConfigurationFile.driver = driver;
    }
    public static String getBrowserName() {
        return browserName;
    }

    public static void setBrowserName(String browserName) {
        BrowserConfigurationFile.browserName = browserName;
    }
}
