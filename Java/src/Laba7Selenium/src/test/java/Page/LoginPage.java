package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    /**
     * определение локатора поля ввода логина
     */
    @FindBy(xpath = "//*[@id=\"dynamic-field-2\"]")
    private WebElement loginField;

    /**
     * определение локатора кнопки входа в ввод пароля
     */
    @FindBy(xpath = "//*[@id=\"dynamic-form-1\"]/button")
    private WebElement loginBtn;

    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(xpath = "//*[@id=\"dynamic-field-4\"]")
    private WebElement passwordField;

    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "//*[@id=\"dynamic-form-2\"]/div[5]/button")
    private WebElement passwordBtn;

    /**
     * метод для ввода email-a
     */
    public void inputEmail(String email) {
        loginField.sendKeys(email); }

    /**
     * метод для ввода пароля
     */
    public void inputPassword(String password) {
        passwordField.sendKeys(password); }

    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginBtn() {
        loginBtn.click(); }

    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickPasswordBtn() {
        passwordBtn.click(); } }