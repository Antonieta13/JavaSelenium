
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class GoogleSearch {

    private FirefoxDriver Driver;

    @BeforeEach
    public void before() {
        System.setProperty("webdriver.gecko.driver", "C:/geckoDriver/geckodriver.exe");
        Driver = new FirefoxDriver();
    }

    @Test
    public void webdriverFirefox() throws InterruptedException {


        Driver.get("https://google.com");

        Driver.manage().window().maximize();

        sleep(2000);

        Driver.findElement(By.name("q")).sendKeys("Testing");

        sleep(1000);
        Driver.quit();

    }
    
}
