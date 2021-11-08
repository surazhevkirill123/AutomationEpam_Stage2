package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProfilePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    /**
     * определение локатора меню пользователя
     */
    @FindBy(xpath = "//*[@id=\"fragment-header\"]/div/nav/div/div[9]/div/a/span")
    private WebElement userMenu;

    /**
     * определение локатора настроек пользователя
     */
    @FindBy(xpath = "//*[text()='Account settings']")
    private WebElement accountSettings;

    /**
     * метод для нажатия кнопки меню пользователя
     */
    public void entryMenu() {
        userMenu.click(); }

    /**
     * метод для входа в настройки
     */
    public void entryAccountSettings() {
        accountSettings.click(); }}


