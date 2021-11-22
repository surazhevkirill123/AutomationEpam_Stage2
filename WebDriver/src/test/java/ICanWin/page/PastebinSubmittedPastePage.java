package ICanWin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PastebinSubmittedPastePage extends AbstractPage {
    @FindBy(xpath = "//textarea")
    WebElement textSubmittedPaste;

    @FindBy(xpath = "//div[@class='info-top']/h1")
    WebElement submittedPasteTitleLocator;

    public PastebinSubmittedPastePage(WebDriver driver) {
        super(driver);
    }

    public String getSubmittedPasteText() {
        return textSubmittedPaste.getText();
    }

    public String getSubmittedPasteTitleLocator() {
        return waitForWebElementVisible(submittedPasteTitleLocator).getText();
    }
}
