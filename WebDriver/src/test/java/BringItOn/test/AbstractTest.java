package BringItOn.test;

import BringItOn.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import BringItOn.page.PastebinMainPage;
import BringItOn.page.PastebinSubmittedPastePage;

public abstract class AbstractTest {
    protected WebDriver driver;

    protected static final String NEW_PASTE_TEXT = "git config --global user.name  \"New Sheriff in Town\"\n" +
        "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
        "git push origin master --force";
    protected static final String NEW_PASTE_TITLE = "how to gain dominance among developers";
    protected static final String EXPECTED_PASTE_SYNTAX = "Bash";
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

    @AfterTest(alwaysRun = true)
    public void browserExit() {
        DriverSingleton.closeDriver();
    }
}
