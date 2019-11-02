package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MembersPage {

	public WebDriver driver;

	By membersList = By.xpath("//div[contains(@class,'infinite-scroll-component')]");
	By membersSearchBox = By.xpath("//input[@placeholder='All members']");
	By createNewMember = By.xpath("//div[@class='wod-fab']//a");

	public MembersPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getMembersList() {
		return driver.findElement(membersList);
	}
	
	public WebElement getMembersSearchBox() {
		return driver.findElement(membersSearchBox);
	}
	
	public WebElement getCreateNewMember() {
		return driver.findElement(createNewMember);
	}

}
