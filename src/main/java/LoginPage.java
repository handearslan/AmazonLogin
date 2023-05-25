

import org.junit.platform.commons.annotation.Testable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{
    By mailLocator = By.id("ep_email");
    By continueLocator = By.id("continue");
    By passwordLocator = By.id("ap_password");
    By signInLocator = By.id("auth-signin-button");


    public  LoginPage(WebDriver driver) {
    super(driver);  }


    public void Login() {

        InputText(mailLocator,"testtesst011@gmail.com");
        /*
        driver.findElement(mailLocator).isDisplayed();
        driver.findElement(mailLocator).clear();
        driver.findElement(mailLocator).click();
        driver.findElement(mailLocator).sendKeys();    */
        Click(continueLocator);
        /*
        driver.findElement(locator).isDisplayed();
        driver.findElement(locator).click(); */

        InputText(passwordLocator,"test1234");
        /*
        driver.findElement(passwordLocator).isDisplayed();
        driver.findElement(passwordLocator).clear();
        driver.findElement(passwordLocator).click();
        driver.findElement(passwordLocator).sendKeys(); */

        Click(signInLocator);
        /*
        driver.findElement(signInLocator).isDisplayed();
        driver.findElement(signInLocator).click(); } */



    }


}
