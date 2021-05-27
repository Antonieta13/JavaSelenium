
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class GoogleSearch {

    private FirefoxDriver driver;

    @BeforeEach
    public void before() {
        System.setProperty("webdriver.gecko.driver", "C:/geckoDriver/geckodriver.exe");
        driver = new FirefoxDriver();
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
