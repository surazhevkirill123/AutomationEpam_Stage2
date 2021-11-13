package Hardcore.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleCloudMainPage extends AbstractPage {
    String GC_BASE_URL = "https://cloud.google.com/";
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(name = "q")
    WebElement searchInput;

    @FindBy(xpath = "//div[@class='devsite-cse-results']")
    WebElement resultsPage;

    @FindBy(xpath = "//b[text()='Google Cloud Platform Pricing Calculator']")
    WebElement resultPattern;

    public GoogleCloudMainPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudMainPage openPage() {
        driver.get(GC_BASE_URL);
        new WebDriverWait(driver,60);
        return this;
    }

    public GoogleCloudMainPage searchTerm(String term) {
        waitForWebElementVisible(searchInput).sendKeys(term + Keys.ENTER);
        return this;
    }

    public GoogleCloudMainPage clickCalculatorPage() {
        waitForWebElementVisible(resultsPage);
        waitForWebElementVisible(resultPattern).click();
        return this;
    }
}
