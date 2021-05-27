import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class GoogleSearch {

    public static FirefoxDriver Driver;

    @BeforeAll
    public static void before() {
        System.out.println("before()");
        System.setProperty("webdriver.gecko.driver", "C:/geckoDriver/geckodriver.exe");
        GoogleSearch.Driver = new FirefoxDriver();
        System.out.println(Driver.hashCode());
    }

    @Test
    public void webdriverFirefox() throws InterruptedException {

        System.out.println(Driver);

        Driver.get("https://google.com");

        Driver.manage().window().maximize();

        sleep(2000);

        Driver.findElement(By.name("q")).sendKeys("Testing");

        sleep(1000);
        Driver.quit();

    }
    
}