package com.Base;

import com.BrowserGenerator.GenerateBrowserToRun;
import com.Configuration.BrowserConfigurationFile;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class InitiateDrivers extends BrowserConfigurationFile{


    @BeforeSuite(enabled=true)
    public static void base_test_initiator() throws Exception{
        GenerateBrowserToRun.generate_random_browser_based_on_probability();
        if(getBrowserName().equals("Chrome")){
            chrome_Browser_setUp(getBrowserName());
        }else if(getBrowserName().equals("Firefox")){
            firefox_Browser_setUp(getBrowserName());
        }else{
            Edge_Browser_setUp(getBrowserName());
        }
    }
    @AfterSuite(enabled=false)
    protected void tearDown() throws Exception {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
