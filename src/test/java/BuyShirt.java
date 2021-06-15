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
import page.*;

import javax.swing.*;


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

        MenuContentPage menuContentPage = new MenuContentPage(driver);

        menuContentPage.visitMenuContentPage();
        menuContentPage.goToTshirtMenu();


        ProductListPage productListPage = new ProductListPage(driver);

        productListPage.addToCart();
        productListPage.proceedToCheckout();


        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);

        shoppingCartPage.shoppingCart();


        Login login = new Login(driver);
        login.doLogin("aperdomobo@gmail.com", "WorkshopProtractor");


        ShippingStepPage shippingStepPage = new ShippingStepPage(driver);
        shippingStepPage.goCartNavigation();


        AddressStepPage addressStepPage = new AddressStepPage(driver);
        addressStepPage.address();
        addressStepPage.confirm();


        PaymentStepPage paymentStepPage = new PaymentStepPage(driver);
        paymentStepPage.Payment();
    }


    @AfterEach
    public void after() {

        driver.quit();

    }
}


