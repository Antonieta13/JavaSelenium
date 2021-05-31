import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import static java.lang.Thread.sleep;


public class GoogleSearch {

    private WebDriver driver;

    @BeforeEach
    public void before() {

         WebDriverManager.firefoxdriver().setup();

        FirefoxBinary firefoxBinary = new FirefoxBinary();
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary(firefoxBinary);
        options.setHeadless(true);
        driver = new FirefoxDriver(options);
    }

    @Test
    public void webdriverFirefox() throws InterruptedException {


        driver.get("https://google.com");

        driver.manage().window().maximize();

        sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Testing");

        sleep(1000);
        driver.quit();

    }

}
