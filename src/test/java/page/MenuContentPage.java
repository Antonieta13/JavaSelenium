package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MenuContentPage {

  private WebDriver driver;

  By TshirtMenu = By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");


  public MenuContentPage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);
  }

  public void visitMenuContentPage() {

    driver.get("http://automationpractice.com/");
  }

  public void goToTshirtMenu() {

    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(TshirtMenu)).click();
  }
}







