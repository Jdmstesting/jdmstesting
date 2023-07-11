package Cucumber.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver webDriver;



    @Before
    public void setUp() {
//       webDriver = testContext.getDriverManager().getDriver();
//        webDriver.get(FileReaderManager.getInstance().getConfigFileReader().getUrl());
    }

    @After
    public void tearDown(Scenario scenario) {
//
//        if(scenario.isFailed()) {
//            try {
//                byte[] screenshot = ((TakesScreenshot)testContext.getDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenshot, "image/png", "screenshot");
//            } catch (WebDriverException noSupportScreenshot) {
//                System.err.println(noSupportScreenshot.getMessage());
//            }
//        }


    }
}
