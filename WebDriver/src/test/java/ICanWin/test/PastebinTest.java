package ICanWin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PastebinTest extends AbstractTest {
    @Test(description = "Check if submitted paste title matches initial paste title")
    public void checkSubmittedPastePageTitle() {
        String actualPageTitle = pastebinSubmittedPastePage.getSubmittedPasteTitleLocator();

        Assert.assertEquals(actualPageTitle, NEW_PASTE_TITLE, "Submitted paste title doesn't match initial paste title");
    }

    @Test(description = "Check if submitted paste text matches initial text")
    public void checkSubmittedPasteText() {
        String actualText = pastebinSubmittedPastePage.getSubmittedPasteText();

        Assert.assertEquals(actualText, NEW_PASTE_TEXT, "Submitted paste text doesn't match initial paste text");
    }
}
