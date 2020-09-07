package com.LoadElementLocator;

import com.WebDriverHelperClass.ReusablePageObject;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LoadModuleElementLocators extends ReusablePageObject {



    public static void load_elements_used_for_fucntionality() throws Exception{
        obj = new Properties();
        File location = new File("src/ModuleElements");
        File name = new File(location,"ElementLocator.properties");
        objfile = new FileInputStream(name.getAbsolutePath());
        obj.load(objfile);
    }
}
