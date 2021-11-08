package Test;

import Page.AccountSettingsPage;
import Page.LoginPage;
import Page.ProfilePage;
import Properties.ConfProperties;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;
    public static AccountSettingsPage accountSettingsPage;

    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromeDriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        accountSettingsPage = new AccountSettingsPage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginPage")); }
    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    public void loginTest() throws InterruptedException {
        //получение доступа к методам класса Page.LoginPage для взаимодействия с элементами страницы
        //значение login/password берутся из файла настроек по аналогии с chromeDriver
        //и loginPage
        //вводим логин
        loginPage.inputEmail(ConfProperties.getProperty("email"));
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
        //вводим пароль
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        //нажимаем кнопку входа
        loginPage.clickPasswordBtn();
        //входим в меню выбора
        profilePage.entryMenu();
        //выбираем Account settings
        profilePage.entryAccountSettings();
        //получаем отображаемый логин
        String username = accountSettingsPage.getUsername();
        //и сравниваем его с логином из файла настроек
        Assert.assertEquals(ConfProperties.getProperty("username"), username); }
    /**
     * осуществление выхода из аккаунта с последующим закрытием окна браузера
     */
    @AfterClass
    public static void tearDown() {
        accountSettingsPage.clickLogoutBtn();
        driver.quit(); } }