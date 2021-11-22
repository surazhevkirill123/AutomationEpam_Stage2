package ICanWin.test;

import ICanWin.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import ICanWin.page.PastebinMainPage;
import ICanWin.page.PastebinSubmittedPastePage;

public abstract class AbstractTest {
    protected WebDriver driver;

    protected static final String NEW_PASTE_TEXT = "Hello from WebDriver";
    protected static final String NEW_PASTE_TITLE = "helloweb";
    PastebinMainPage pastebinMainPage;
    PastebinSubmittedPastePage pastebinSubmittedPastePage;

    @BeforeTest(alwaysRun = true)
    public void browserSetup() {
        if (System.getProperty("browser") == null){
            System.setProperty("browser","chrome");
        }
        driver = DriverSingleton.getDriver();
        driver.manage().window().maximize();
        pastebinMainPage = new PastebinMainPage(driver)
                .openPage()
                .typeInNewPasteText(NEW_PASTE_TEXT)
                .openSyntaxDropdown()
                .selectSyntaxBash()
                .openExpirationDropdown()
                .selectExpiration10M()
                .typeInNewPasteTitle(NEW_PASTE_TITLE)
                .submitNewPaste();
        pastebinSubmittedPastePage = new PastebinSubmittedPastePage(driver);
    }

    public WebElement waitForElement(By by) {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    @AfterTest(alwaysRun = true)
    public void browserExit() {
        DriverSingleton.closeDriver();
    }
}
