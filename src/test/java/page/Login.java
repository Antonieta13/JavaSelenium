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


    private void emailInput(String userName) { //no es funcional, no es rentable a largo plazo

        WebElement emailUser = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Email));
        emailUser.click();

        emailUser.sendKeys(userName);
    }

    
    private void passInput(String password) {
        
        WebElement passwd = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Password));
        passwd.click(); //wait until

        passwd.sendKeys(password);
    }

    private void clickLogin() {

        WebElement signIn = (WebElement) new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Login));
        signIn.click();
    }

    public void doLogin(String email, String password) { //publico

        this.emailInput(email);
        this.passInput(password);
        this.clickLogin();
        //email passwd, click y los demas metodos no a menos que sean privados, no los necesito
    }
}
