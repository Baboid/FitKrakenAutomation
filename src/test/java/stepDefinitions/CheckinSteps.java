package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.CheckinListPage;
import pageObjects.MemberCardPage;
import pageObjects.MembersPage;
import utils.Base;

public class CheckinSteps extends Base {

    MembersPage mp;
    MemberCardPage mcp;
    CheckinListPage clp;
    //WebDriverWait w = new WebDriverWait(driver, 5);

    @When("^the user clicks on the check in button$")
    public void the_user_clicks_on_the_check_in_button(){
        mcp = new MemberCardPage(driver);
        mcp.getCheckInButton().click();
    }

    @And("^the user confirms the check in$")
    public void the_user_confirms_the_check_in() {
        mcp = new MemberCardPage(driver);
        mcp.getCheckinPopupCheckinButton().click();
    }

    @Then("^the user should be presented with the check in list$")
    public void the_user_should_be_presented_with_the_check_in_list() {
        clp = new CheckinListPage(driver);
        clp.getCheckinList().isDisplayed();
        //dodaj proveru da li je prvo ime u listi
    }

    @And("^the users total sessions should be decremented by one$")
    public void the_users_total_sessions_should_be_decremented_by_one() throws InterruptedException {
        mp = new MembersPage(driver);
        Thread.sleep(2000);
        mp.getMembersHeaderLink().click();
        mp.getFirstMember().click();
        Assert.assertFalse(mcp.getLastSession().isDisplayed());
        //slepce dodaj da false zapravo bude ocekivano
    }

}
