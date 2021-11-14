package Hardcore.test;

import Hardcore.driver.DriverSingleton;
import Hardcore.util.TestListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

@Listeners({TestListener.class})
public class AbstractTest {
    protected WebDriver driver;
    private final Logger logger = LogManager.getRootLogger();

    @BeforeTest(alwaysRun = true)
    public void browserSetup() {
        if (System.getProperty("browser") == null){
            System.setProperty("browser","chrome");
        }
        if (System.getProperty("environment") == null){
            System.setProperty("environment","dev");
        }
        driver = DriverSingleton.getDriver();
    }

    @AfterTest(alwaysRun = true)
    public void browserExit() {
        DriverSingleton.closeDriver();
        logger.info("Closing");
    }
}
