

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void Click(By locator) {
        driver.findElement(locator).isDisplayed();
        driver.findElement(locator).click(); }

    public void InputText(By locator,String text){
        driver.findElement(locator).isDisplayed();
        driver.findElement(locator).clear();
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys();

    }

}
