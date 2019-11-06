package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By emailField = By.xpath("//input[@id='1-email']");
    By passField = By.xpath("//input[@placeholder='your password']");
    By loginButton = By.xpath("//button[@name='submit']");

    public WebElement inputEmail() {return driver.findElement(emailField); }

    public WebElement inputPass() {
        return driver.findElement(passField);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

}
