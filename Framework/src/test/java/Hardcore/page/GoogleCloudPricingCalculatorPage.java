package Hardcore.page;

import Hardcore.model.VMParameters;
import Hardcore.service.VMParametersCreator;
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

    @FindBy(xpath = "//md-tab-item[@aria-controls='tab-content-1']")
    WebElement buttonComputeEngine;

    @FindBy(xpath = "//input[@ng-model='listingCtrl.computeServer.quantity']")
    WebElement inputNumberOfInstances;

    @FindBy(xpath = "//input[@ng-model='listingCtrl.computeServer.label']")
    WebElement inputPurpose;

    @FindBy(xpath = "//md-select[@ng-model='listingCtrl.computeServer.os']")
    WebElement dropdownSoftware;
    public static final String ITEM_SOFTWARE_LOCATOR_PATTERN = "//md-option[@value='%s']";
    WebElement itemSoftware;

    @FindBy(xpath = "//md-select[@ng-model='listingCtrl.computeServer.class']")
    WebElement dropdownClass;
    public static final String ITEM_CLASS_LOCATOR_PATTERN = "//md-select-menu[@style]/descendant::md-option[@value='%s']";
    WebElement itemClass;

    @FindBy(xpath = "//md-select[@name='series']")
    WebElement dropdownSeries;
    public static final String ITEM_SERIES_LOCATOR_PATTERN = "//md-option[@value='%s']";
    WebElement itemSeries;

    @FindBy(xpath = "//md-select[@placeholder='Instance type']")
    WebElement dropdownMachineType;
    public static final String ITEM_MACHINE_TYPE_LOCATOR_PATTERN = "//md-option[@value='%s']";
    WebElement itemMachineType;

    @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs' and @ng-model='listingCtrl.computeServer.addGPUs']")
    WebElement checkboxAddGPUs;
    @FindBy(xpath = "//md-select[@placeholder='Number of GPUs']")
    WebElement dropboxNumberOfGPUs;
    public static final String ITEM_NUMBER_OF_GPUS_LOCATOR_PATTERN = "//md-option[@value='%s' and contains(@ng-repeat, 'gpuType')]";
    WebElement itemNumberOfGPUs;
    @FindBy(xpath = "//md-select[@placeholder='GPU type']")
    WebElement dropboxGPUType;
    public static final String ITEM_GPU_TYPE_LOCATOR_PATTERN = "//md-option[@value='%s']";
    WebElement itemGPUType;

    @FindBy(xpath = "//md-select[@placeholder='Local SSD']")
    WebElement dropdownSSD;
    public static final String ITEM_SSD_LOCATOR_PATTERN = "//md-option[@value='%s' and contains(@ng-repeat, 'item in listingCtrl.dynamicSsd.computeServer')]";
    WebElement itemSSD;

    @FindBy(xpath = "//md-select[@placeholder='Datacenter location'][@ng-model='listingCtrl.computeServer.location']")
    WebElement dropdownLocation;
    public static final String ITEM_LOCATION_LOCATOR_PATTERN = "//md-select-menu[@class='md-overflow']/descendant::md-option[@value='%s' and contains(@ng-repeat, 'item in listingCtrl.fullRegionList')]";
    WebElement itemLocation;

    @FindBy(xpath = "//md-select[@placeholder='Committed usage']")
    WebElement dropdownUsage;
    public static final String ITEM_USAGE_LOCATOR_PATTERN = "//div[@class='md-select-menu-container md-active md-clickable']/descendant::md-option[@ng-value='%s']";
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
        VMParameters vmParameters = VMParametersCreator.VMParametersCreate();

        waitForWebElementVisible(buttonComputeEngine).click();
        String instances = vmParameters.getInstances();

        waitForWebElementVisible(inputNumberOfInstances).sendKeys(instances);

        waitForWebElementVisible(inputPurpose).clear();

        waitForWebElementVisible(dropdownSoftware).click();
        itemSoftware = findElementByDynamicXpath(ITEM_SOFTWARE_LOCATOR_PATTERN, vmParameters.getItemSoftware());
        waitForWebElementVisible(itemSoftware).click();

        waitForWebElementVisible(dropdownClass).click();
        itemClass = findElementByDynamicXpath(ITEM_CLASS_LOCATOR_PATTERN, vmParameters.getItemClass());
        waitForWebElementVisible(itemClass).click();

        waitForWebElementVisible(dropdownSeries).click();
        itemSeries = findElementByDynamicXpath(ITEM_SERIES_LOCATOR_PATTERN, vmParameters.getItemSeries());
        waitForWebElementVisible(itemSeries).click();

        waitForWebElementVisible(dropdownMachineType).click();
        itemMachineType = findElementByDynamicXpath(ITEM_MACHINE_TYPE_LOCATOR_PATTERN, vmParameters.getItemMachineType());
        waitForWebElementVisible(itemMachineType).click();

        waitForWebElementVisible(checkboxAddGPUs).click();

        waitForWebElementVisible(dropboxGPUType).click();
        itemGPUType = findElementByDynamicXpath(ITEM_GPU_TYPE_LOCATOR_PATTERN, vmParameters.getItemGPUType());
        waitForWebElementVisible(itemGPUType).click();

        waitForWebElementVisible(dropboxNumberOfGPUs).click();
        itemNumberOfGPUs = findElementByDynamicXpath(ITEM_NUMBER_OF_GPUS_LOCATOR_PATTERN, vmParameters.getItemNumberOfGPUs());
        waitForWebElementVisible(itemNumberOfGPUs).click();

        waitForWebElementVisible(dropdownSSD).click();
        itemSSD = findElementByDynamicXpath(ITEM_SSD_LOCATOR_PATTERN, vmParameters.getItemSSD());
        waitForWebElementVisible(itemSSD).click();

        waitForWebElementVisible(dropdownLocation).click();
        itemLocation = findElementByDynamicXpath(ITEM_LOCATION_LOCATOR_PATTERN, vmParameters.getItemLocation());
        waitForWebElementVisible(itemLocation).click();

        waitForWebElementVisible(dropdownUsage).click();
        itemUsage = findElementByDynamicXpath(ITEM_USAGE_LOCATOR_PATTERN, vmParameters.getItemUsage());
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
