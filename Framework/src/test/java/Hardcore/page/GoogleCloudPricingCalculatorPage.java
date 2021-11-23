package Hardcore.page;

import Hardcore.model.InputData;
import Hardcore.service.InputDataCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoogleCloudPricingCalculatorPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//iframe[contains(@src, '/products/calculator')]")
    WebElement frameMain;

    WebElement buttonComputeEngine;

    WebElement inputNumberOfInstances;

    WebElement inputPurpose;

    WebElement dropdownSoftware;
    WebElement itemSoftware;

    WebElement dropdownClass;
    WebElement itemClass;

    WebElement dropdownSeries;
    WebElement itemSeries;

    WebElement dropdownMachineType;
    WebElement itemMachineType;

    WebElement checkboxAddGPUs;
    WebElement dropboxGPUType;
    WebElement itemGPUType;
    WebElement dropboxNumberOfGPUs;
    WebElement itemNumberOfGPUs;

    WebElement dropdownSSD;
    WebElement itemSSD;

    WebElement dropdownLocation;
    WebElement itemLocation;

    WebElement dropdownUsage;
    WebElement itemUsage;

    @FindBy(xpath = "//button[@aria-label='Add to Estimate' and contains(@ng-click, 'addComputeServer')]")
    WebElement buttonAddToEstimate;

    @FindBy(xpath = "//h2/b[@class='ng-binding']")
    WebElement textTotalCost;

    @FindBy(xpath = "//button[@aria-label='Email Estimate']")
    WebElement buttonEmailEstimate;

    @FindBy(xpath = "//input[@ng-model!='emailQuote.user.firstname' and @ng-model='emailQuote.user.email']")
    WebElement inputEmail;

    @FindBy(xpath = "//button[@aria-label='Send Email']")
    WebElement buttonSendEmail;

    public GoogleCloudPricingCalculatorPage(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudPricingCalculatorPage switchToCalculatorIFrame() {
        driver.switchTo().frame(waitForWebElementVisible(frameMain));
        driver.switchTo().frame("myFrame");
        logger.info("GoogleCloudPricingCalculatorPage opened");
        return this;
    }

    public GoogleCloudPricingCalculatorPage fillInEstimationForm() {
        InputData inputData = InputDataCreator.InputDataCreateDefault();

        buttonComputeEngine = driver.findElement(By.xpath(inputData.getButtonComputeEngine()));
        buttonComputeEngine.click();

        inputNumberOfInstances = driver.findElement(By.xpath(inputData.getInputNumberOfInstances()));
        String instances = inputData.getInstances();
        inputNumberOfInstances.sendKeys(instances);

        inputPurpose = driver.findElement(By.xpath(inputData.getInputPurpose()));
        inputPurpose.clear();

        dropdownSoftware = driver.findElement(By.xpath(inputData.getDropdownSoftware()));
        waitForWebElementVisible(dropdownSoftware).click();
        itemSoftware = driver.findElement(By.xpath(inputData.getItemSoftware()));
        waitForWebElementVisible(itemSoftware).click();

        dropdownClass = driver.findElement(By.xpath(inputData.getDropdownClass()));
        waitForWebElementVisible(dropdownClass).click();
        itemClass = driver.findElement(By.xpath(inputData.getItemClass()));
        waitForWebElementVisible(itemClass).click();

        dropdownSeries = driver.findElement(By.xpath(inputData.getDropdownSeries()));
        waitForWebElementVisible(dropdownSeries).click();
        itemSeries = driver.findElement(By.xpath(inputData.getItemSeries()));
        waitForWebElementVisible(itemSeries).click();

        dropdownMachineType = driver.findElement(By.xpath(inputData.getDropdownMachineType()));
        waitForWebElementVisible(dropdownMachineType).click();
        itemMachineType = driver.findElement(By.xpath(inputData.getItemMachineType()));
        waitForWebElementVisible(itemMachineType).click();

        checkboxAddGPUs = waitForWebElementVisible(driver.findElement(By.xpath(inputData.getCheckboxAddGPUs())));
        waitForWebElementVisible(checkboxAddGPUs).click();
        dropboxGPUType = waitForWebElementVisible(driver.findElement(By.xpath(inputData.getDropboxGPUType())));
        waitForWebElementVisible(dropboxGPUType).click();
        itemGPUType = driver.findElement(By.xpath(inputData.getItemGPUType()));
        waitForWebElementVisible(itemGPUType).click();
        dropboxNumberOfGPUs = driver.findElement(By.xpath(inputData.getDropboxNumberOfGPUs()));
        waitForWebElementVisible(dropboxNumberOfGPUs).click();
        itemNumberOfGPUs = driver.findElement(By.xpath(inputData.getItemNumberOfGPUs()));
        waitForWebElementVisible(itemNumberOfGPUs).click();

        dropdownSSD = driver.findElement(By.xpath(inputData.getDropdownSSD()));
        dropdownSSD.click();
        itemSSD = driver.findElement(By.xpath(inputData.getItemSSD()));
        waitForWebElementVisible(itemSSD).click();

        dropdownLocation = driver.findElement(By.xpath(inputData.getDropdownLocation()));
        dropdownLocation.click();
        itemLocation = driver.findElement(By.xpath(inputData.getItemLocation()));
        waitForWebElementVisible(itemLocation).click();

        dropdownUsage = driver.findElement(By.xpath(inputData.getDropdownUsage()));
        waitForWebElementVisible(dropdownUsage).click();
        itemUsage = driver.findElement(By.xpath(inputData.getItemUsage()));
        waitForWebElementVisible(itemUsage).click();

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
        waitForWebElementVisible(buttonSendEmail).click();
    }
}
