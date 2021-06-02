import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BuyShirt {

    private WebDriver driver;

    @BeforeEach
    public void before() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

    }

    @Test
    public void webdriverChrome() throws InterruptedException {

        driver.get("http://automationpractice.com/");

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a"))).click();

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#center_column a.button.ajax_add_to_cart_button.btn.btn-default"))).click();

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("[style*=\"display: block;\"] .button-container > a"))).click();

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cart_navigation span"))).click();


        WebElement emailUser = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email")));
        emailUser.click();

        WebElement password = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#passwd")));
        password.click();

        emailUser.sendKeys("aperdomobo@gmail.com");
        password.sendKeys("WorkshopProtractor");

        WebElement signIn = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#SubmitLogin")));
        signIn.click();

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cart_navigation span"))).click();

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".checker"))).click();

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cart_navigation span"))).click();

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bankwire"))).click();

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cart_navigation span"))).click();




        assertEquals("Your order on My Store is complete." , driver.findElement(By.cssSelector("#center_column > div > p > strong")).getText());

    }


    @AfterEach
    public void after() {

        driver.quit();

    }


}

