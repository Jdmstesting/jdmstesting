package Cucumber.StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.Driver;
import Utilities.configurationReader;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestRunFinished;
import io.cucumber.plugin.event.TestRunStarted;
import org.openqa.selenium.WebDriver;


public class
TestEventHandlerPlugin implements ConcurrentEventListener {
    LoginPage loginPage = new LoginPage();
//test comment
    HomePage homePage;
    LoginSteps loginSteps = new LoginSteps();
    public TestEventHandlerPlugin() {
    }
    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunStarted.class, event ->{
            Driver.get().get(configurationReader.get("url"));
            Driver.get().manage().deleteAllCookies();
            Driver.get().manage().window().maximize();
            loginPage.emailField.sendKeys("Blount");
            loginPage.passwordTx.sendKeys("Calg2022!!");
            try {
                loginPage.clickSelanjutnyaButton();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });


            eventPublisher.registerHandlerFor(TestRunFinished.class, event ->
        {

         //Driver.closeDriver();
        });
    }
    }


