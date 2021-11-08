package Hardcore.util;

import Hardcore.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StringToWebElement {
    public static WebElement StringToWebElementParse(String xpathExpression){
        WebDriver driver= DriverSingleton.getDriver();
        return driver.findElement(By.xpath(xpathExpression));
    }
}
