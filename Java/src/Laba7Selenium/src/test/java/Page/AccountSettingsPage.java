package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingsPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public AccountSettingsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    /**
     * определение локатора поля с username-ом
     */
    @FindBy(xpath = "//*[@id=\"content-body\"]/div/div/div[2]/div/div[2]/p[1]")
    private WebElement username;

    /**
     * определение локатора кнопки выхода
     */
    @FindBy(xpath = "//*[@id=\"content-body\"]/div/div/div[1]/div/a")
    private WebElement logoutBtn;

    public String getUsername() {
        String usernameS = username.getText();
        return usernameS; }

    public void clickLogoutBtn() {
        logoutBtn.click(); }
}
