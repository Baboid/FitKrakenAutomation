package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MembersPage;
import utils.Base;

public class LogoutSteps extends Base {

    LoginPage lp = new LoginPage(driver);
    MembersPage mp = new MembersPage(driver);

    @When("^the user clicks on the logout button$")
    public void the_user_clicks_on_the_logout_button() {
        mp.getLogoutButton().click();
    }

    @Then("^the user should be presented with the login page$")
    public void the_user_should_be_presented_with_the_login_page() {
        lp.getLoginButton().isDisplayed();
    }
}
