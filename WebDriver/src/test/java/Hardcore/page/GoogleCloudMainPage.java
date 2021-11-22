package Hardcore.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleCloudMainPage extends AbstractPage {
    String GC_BASE_URL = "https://cloud.google.com/";

    @FindBy(name = "q")
    WebElement searchInput;

    @FindBy(xpath = "//div[@class='devsite-cse-results']")
    WebElement resultsPage;

    @FindBy(xpath = "//a[(@href='https://cloud.google.com/products/calculator' or @href='https://cloud.google.com/products/calculator?hl=en') and @class='gs-title']")
    WebElement resultPattern;

    public GoogleCloudMainPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudMainPage openPage() {
        driver.get(GC_BASE_URL);
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
