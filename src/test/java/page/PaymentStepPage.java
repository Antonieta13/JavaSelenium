package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentStepPage {

    private WebDriver driver;

    By PayMethod = By.cssSelector("a.bankwire");
    By ConfirmOrder = By.cssSelector(".cart_navigation span");
    By ConfirmMessage = By.cssSelector("#center_column > div > p > strong");

    public PaymentStepPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void selectPayment() {

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PayMethod)).click();
    }

    public void confirmPayment() {

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ConfirmOrder)).click();
    }

    public void getConfirmationMessage() {

        assertEquals("Your order on My Store is complete." , driver.findElement((ConfirmMessage)).getText());
    }

    public void Payment() {

        this.selectPayment();
        this.confirmPayment();
        this.getConfirmationMessage();

    }
}
