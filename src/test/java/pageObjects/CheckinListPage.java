package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckinListPage {

    public WebDriver driver;

    public CheckinListPage(WebDriver driver) {
        this.driver = driver;
    }

    By checkinList = By.xpath("//div[contains(@class,'infinite-scroll-component')]");

    public WebElement getCheckinList(){ return driver.findElement(checkinList); }

}
