package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListPage {

    private WebDriver driver;

    By AddToCart = By.cssSelector("#center_column a.button.ajax_add_to_cart_button.btn.btn-default");
    By Checkout = By.cssSelector("[style*=\"display: block;\"] .button-container > a");

    public ProductListPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void addToCart() {

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AddToCart)).click();
    }


    public void proceedToCheckout() {

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Checkout)).click();

    }
}
