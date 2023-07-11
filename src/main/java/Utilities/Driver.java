package Utilities;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.Hashtable;
import java.util.Map;

public class Driver {

    private Driver(){}

    private static InheritableThreadLocal<WebDriver> driverITL = new InheritableThreadLocal<>();

    public static WebDriver get(){

        String downloadFilepath = System.getProperty("user.dir");
        Map<String, Object> preferences;
        if(driverITL.get() == null){
            System.out.println("driver empty");

            String browser = System.getProperty("browser");

            if(browser == null){
                browser = configurationReader.get("browser");

            }
            switch (browser) {
                case "chrome":
                    preferences = new Hashtable<>();
                    preferences.put("profile.default_content_settings.popups", 0);
                    preferences.put("download.prompt_for_download", "false");
                    preferences.put("download.default_directory", downloadFilepath);
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", preferences);
                    options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
                    options.setCapability(ChromeOptions.CAPABILITY, options);
                    options.addArguments("--remote-allow-origins=*");
                    options.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
                    options.setAcceptInsecureCerts(true);
                    driverITL.set(new ChromeDriver(options));
                    break;
                case "edge":


            }
        }

        return driverITL.get();
    }
    public static void closeDriver(){
        driverITL.get().quit();
    }
}
