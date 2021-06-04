package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressStepPage {

    private WebDriver driver;

    By Address = By.cssSelector(".checker");
    By ConfirmAddress = By.cssSelector(".cart_navigation span");

    public AddressStepPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void address() {

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Address)).click();
    }

    public void confirm() {

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ConfirmAddress)).click();
    }
}
