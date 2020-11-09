package homework6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseMailTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected SoftAssert soft = new SoftAssert();

    public final String URL = "https://mail.ru/";
    public final String LOGIN = "nastya.test.91";
    public final String PASSWORD = "8999560aA";



    public void login (String login, String password) {
        driver.get(URL);
        WebElement loginInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mailbox:login-input']")));
        loginInput.sendKeys(login);

        WebElement enterPassword = driver.findElement(By.xpath("//*[@id='mailbox:submit-button']"));
        enterPassword.click();

        WebElement passwordInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mailbox:password-input']")));
        passwordInput.sendKeys(password);

        WebElement entrance = driver.findElement(By.xpath("//*[@id='mailbox:submit-button']"));
        entrance.click();
    }

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 7);
        login(LOGIN, PASSWORD);
    }

    @AfterMethod
    public void tearDown() {
        driver.findElement(By.id("PH_logoutLink"))
                .click();
        driver.quit();
    }
}
