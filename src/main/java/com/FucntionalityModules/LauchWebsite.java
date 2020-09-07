package com.FucntionalityModules;

import com.ParseDataFromExcel.InputDataProvider;
import com.VariableDeclaration.TestVariableDeclararion;
import com.WebDriverHelperClass.ReusablePageObject;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LauchWebsite extends ReusablePageObject {


    public static void open_Browser_and_launch_url() throws Exception {
            getDriver().get(InputDataProvider.getUrl());
            getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            getDriver().manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS);
            getDriver().manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
            wait=new WebDriverWait(getDriver(), 50);
    }


}
