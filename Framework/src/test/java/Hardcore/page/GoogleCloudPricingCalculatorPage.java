package Hardcore.page;

import Hardcore.model.InputData;
import Hardcore.service.InputDataCreator;
import Hardcore.util.StringToWebElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoogleCloudPricingCalculatorPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//iframe[contains(@src, '/products/calculator')]")
    WebElement frameMain;

    @FindBy(xpath = "//button[@aria-label='Add to Estimate' and contains(@ng-click, 'addComputeServer')]")
    WebElement buttonAddToEstimate;

    @FindBy(xpath = "//h2/b[@class='ng-binding']")
    WebElement textTotalCost;

    @FindBy(xpath = "//button[@aria-label='Email Estimate']")
    WebElement buttonEmailEstimate;

    @FindBy(xpath = "//input[@ng-model='emailQuote.user.email']")
    WebElement inputEmail;

    @FindBy(xpath = "//button[@aria-label='Send Email']")
    WebElement buttonSendEmail;

    public GoogleCloudPricingCalculatorPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudPricingCalculatorPage switchToCalculatorIFrame() {
        driver.switchTo().frame(waitForWebElementVisible(frameMain));
        driver.switchTo().frame("myFrame");
        logger.info("You went to the calculator page");
        return this;
    }

    public void inputDataInFields(InputData inputData){
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getButtonComputeEngine())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getInputNumberOfInstances())).sendKeys(inputData.getInstances());
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getInputPurpose())).clear();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getDropdownSoftware())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getItemSoftware())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getDropdownClass())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getItemClass())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getDropdownSeries())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getItemSeries())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getDropdownMachineType())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getItemMachineType())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getCheckboxAddGPUs())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getDropboxNumberOfGPUs())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getItemNumberOfGPUs())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getDropboxGPUType())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getItemGPUType())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getDropdownSSD())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getItemSSD())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getDropdownLocation())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getItemLocation())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getDropdownUsage())).click();
        waitForWebElementVisible(StringToWebElement.StringToWebElementParse(inputData.getItemUsage())).click();
    }

    public GoogleCloudPricingCalculatorPage fillInEstimationForm() {
        InputData inputData = InputDataCreator.InputDataCreateDefault();
        inputDataInFields(inputData);
        logger.info("Data inputted");
        return this;
    }

    public GoogleCloudPricingCalculatorPage clickAddToEstimateButton() {
        waitForWebElementVisible(buttonAddToEstimate).click();
        return this;
    }

    public String getTotalCost() {
        return waitForWebElementVisible(textTotalCost).getText();
    }

    public GoogleCloudPricingCalculatorPage clickEmailEstimateButton() {
        waitForWebElementVisible(buttonEmailEstimate).click();
        return this;
    }

    public GoogleCloudPricingCalculatorPage enterTempEMail(String tempEmail) {
        waitForWebElementVisible(inputEmail).sendKeys(tempEmail);
        return this;
    }

    public void sendEmail() {
        buttonSendEmail.click();
    }
}
