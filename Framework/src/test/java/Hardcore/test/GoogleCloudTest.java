package Hardcore.test;

import Hardcore.page.GoogleCloudMainPage;
import Hardcore.page.GoogleCloudPricingCalculatorPage;
import Hardcore.page.TempEmailPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleCloudTest extends AbstractTest {
    GoogleCloudMainPage cloudMainPage;
    String SEARCH_TERM_MAIN_PAGE = "Google Cloud Pricing Calculator";
    GoogleCloudPricingCalculatorPage cloudCalculatorPage;
    TempEmailPage tempEmailPage;
    private final Logger logger = LogManager.getRootLogger();

    @Test(description = "Fill in estimation form")
    public void fillInEstimationForm() {
        cloudMainPage = new GoogleCloudMainPage(driver)
                .openPage()
                .searchTerm(SEARCH_TERM_MAIN_PAGE)
                .clickCalculatorPage();
        cloudCalculatorPage = new GoogleCloudPricingCalculatorPage(driver)
                .switchToCalculatorIFrame()
                .fillInEstimationForm()
                .clickAddToEstimateButton();
        logger.info("Filling in estimation form completed");
    }

    @Test(dependsOnMethods = {"fillInEstimationForm"},
            description = "Check Email total cost against calculated total cost")
    public void checkTotalCost() throws InterruptedException {
        tempEmailPage = new TempEmailPage(driver).openInNewTab();
        String tempEmail = tempEmailPage.getTempEMail();

        cloudCalculatorPage.switchToPreviousTab();
        cloudCalculatorPage.switchToCalculatorIFrame()
                .clickEmailEstimateButton()
                .enterTempEMail(tempEmail)
                .sendEmail();
        String costOnCalcPage = cloudCalculatorPage.getTotalCost();

        tempEmailPage.switchToNextTab();
        tempEmailPage.refresh();
        String costOnEmailPage = tempEmailPage.getCostFromEmail();

        Assert.assertTrue(costOnCalcPage.contains(costOnEmailPage), "Total Cost from email doesn't match the one from the Calculator page");
        logger.info("Checking Email total cost against calculated total cost completed");
    }
}
