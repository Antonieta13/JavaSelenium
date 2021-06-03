package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    private WebDriver driver;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void emailInput(String userName) {

        WebElement emailUser = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email")));
        emailUser.click();

        emailUser.sendKeys(userName);
    }

    public void passInput(String password) {

        WebElement passwd = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#passwd")));
        passwd.click();

        passwd.sendKeys(password);
    }

    public void clickLogin() {

        WebElement signIn = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#SubmitLogin")));
        signIn.click();
    }
}
