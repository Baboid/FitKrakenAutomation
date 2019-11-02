package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MembersPage;
import utils.Base;

public class LoginSteps extends Base {
	
	LoginPage lp;
	MembersPage mp;

	@Given("^the user is on the login page$")
	public void the_user_is_on_the_login_page() throws IOException {
		driver = initilizeDriver();
		driver.get(prop.getProperty("url"));
	}

	@When("^the user provides a valid email and password combo$")
	public void the_user_provides_a_valid_email_and_password_combo() {
		lp = new LoginPage(driver);
		lp.inputEmail().sendKeys(prop.getProperty("ValidTestUserEmail"));
		lp.inputPass().sendKeys(prop.getProperty("ValidTestUserPass"));
	}

	@And("^clicks on the login button$")
	public void clicks_on_the_login_button() {
		lp = new LoginPage(driver);
		lp.clickLogin().click();
	}

	@Then("^the user should be presented with the members page$")
	public void the_user_should_be_presented_with_the_members_page() {
		mp = new MembersPage(driver);
		mp.getMembersList().isDisplayed();
	}

}
