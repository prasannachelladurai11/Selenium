package com.ModuleRunnerFile;

import com.Base.InitiateDrivers;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(
        features="src/main/resources/FeatureFile/WeatherAuthetication.feature",
        glue={"com.ModuleStepDefinitions"},
        plugin={"pretty",
                        "html:target/cucumber-reports/cucumber-pretty",
                        "json:target/cucumber-reports/CucumberTestReport.json",
                        "rerun:target/cucumber-reports/re-run.txt"},
        tags = {"@run"}
)
public class WeatherAuthenticationRunnerFile extends InitiateDrivers {

    private TestNGCucumberRunner testRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testRunner = new TestNGCucumberRunner(this.getClass());
    }
    @Test(groups = "cucumber", description = "Maps Feature File", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
    @DataProvider()
    public Object[][] features() {
        return testRunner.provideFeatures();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testRunner.finish();
    }

}
