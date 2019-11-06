package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Base;

public class CheckinListPage extends Base {

    By checkinList = By.xpath("//div[contains(@class,'infinite-scroll-component')]");

    public WebElement getCheckinList(){ return driver.findElement(checkinList); }

}
