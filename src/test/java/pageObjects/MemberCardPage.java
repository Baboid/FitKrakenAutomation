package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemberCardPage {

	public WebDriver driver;

	public MemberCardPage(WebDriver driver) {
		this.driver = driver;
	}

	By MembersName = By.xpath("//span[@class='wod-member-details__full-name']");
	By MembersEmail = By.xpath("//a[@class='wod-member-details__email']");
	By MemberCardMainOptions = By.xpath("//div[@class='wod-member-details__basic-info']//button[@class='btn btn-ghost']");
	By EditMemberInfo = By.xpath("//div[@class='dropdown-menu dropdown-menu-right show']//a[@class='dropdown-item'][contains(text(),'Edit')]");
	By NewMembership = By.xpath("//a[contains(text(),'New membership')]");
	By MemberCardMembershipOptions = By.xpath("//div[@class='wod-membership-card__title card-title']//button[@class='btn btn-ghost']");
	By EditMembership = By.xpath("//a[contains(text(),'Edit membership')]");
	By DeleteMembership = By.xpath("//button[@class='dropdown-item']");
	By DeletePopupYesButton = By.xpath("//button[@class='wod-button btn btn-primary']");
	By DeletePopupCancelButton = By.xpath("//button[@class='wod-button btn btn-secondary']");
	By CheckInButton = By.xpath("//button[@class='wod-membership-card__action wod-button btn btn-primary']");
	By SessionsList = By.xpath("//div[@class='wod-membership-card__info__sessions']");
	By CheckinPopupCheckinButton = By.xpath("//button[@class='wod-button btn btn-primary']");
	By CheckinPopupCancelButton = By.xpath("//button[@class='wod-button btn btn-secondary']");
	By AddOneMembership = By.xpath("//a[contains(text(),'Add one')]");
	By lastSession = By.xpath("//div[contains(text(),'10')]");

	public WebElement getMembersName() {
		return driver.findElement(MembersName);
	}

	public WebElement getMembersEmail() {
		return driver.findElement(MembersEmail);
	}

	public WebElement getMemberCardMainOptions() {
		return driver.findElement(MemberCardMainOptions);
	}

	public WebElement getEditMemberInfo() {
		return driver.findElement(EditMemberInfo);
	}

	public WebElement getNewMembership() {
		return driver.findElement(NewMembership);
	}

	public WebElement getMemberCardMembershipOptions() {
		return driver.findElement(MemberCardMembershipOptions);
	}

	public WebElement getEditMembership() {
		return driver.findElement(EditMembership);
	}

	public WebElement getDeleteMembership() {
		return driver.findElement(DeleteMembership);
	}

	public WebElement getDeletePopupYesButton() {
		return driver.findElement(DeletePopupYesButton);
	}

	public WebElement getDeletePopupCancelButton() {
		return driver.findElement(DeletePopupCancelButton);
	}

	public WebElement getCheckInButton() {
		return driver.findElement(CheckInButton);
	}

	public WebElement getSessionsList() {
		return driver.findElement(SessionsList);
	}

	public WebElement getCheckinPopupCheckinButton() {
		return driver.findElement(CheckinPopupCheckinButton);
	}

	public WebElement getCheckinPopupCancelButton() {
		return driver.findElement(CheckinPopupCancelButton);
	}
	
	public WebElement getAddOneMembership() {
		return driver.findElement(AddOneMembership);
	}

	public WebElement getLastSession() { return  driver.findElement(lastSession); }
}
