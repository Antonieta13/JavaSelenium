package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    private WebDriver driver;

    By Email = By.cssSelector("#email");
    By Password = By.cssSelector("#passwd");
    By Login = By.cssSelector("#SubmitLogin");

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void emailInput(String userName) {

        WebElement emailUser = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Email));
        emailUser.click();

        emailUser.sendKeys(userName);
    }

    
    public void passInput(String password) {
        
        WebElement passwd = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Password));
        passwd.click();

        passwd.sendKeys(password);
    }

    public void clickLogin() {

        WebElement signIn = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Login));
        signIn.click();
    }

    public void doLogin(String email, String password) {

        this.emailInput(email);
        this.passInput(password);
        this.clickLogin();
    }
}
