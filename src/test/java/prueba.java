import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import static java.lang.Thread.sleep;


public class prueba {

    private WebDriver driver;

    @BeforeEach
    public void before() {
        WebDriverManager.firefoxdriver().setup();

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
