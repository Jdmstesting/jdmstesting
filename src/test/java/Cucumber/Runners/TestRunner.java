package Cucumber.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"Cucumber.StepDefinitions.TestEventHandlerPlugin",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json"
    },
        features = "src/test/resources/features",
        glue = "Cucumber/StepDefinitions",
        tags = "@CMSTest or @Test"
)
public class









TestRunner {


}









