package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckinListPage;
import pageObjects.MemberCardPage;
import pageObjects.MembersPage;

public class CheckinSteps {

    MembersPage mp;
    MemberCardPage mcp;
    CheckinListPage clp;

    @When("^the user clicks on the check in button$")
    public void the_user_clicks_on_the_check_in_button() throws InterruptedException{
        Thread.sleep(3000);
        mcp.getCheckInButton().click();
    }

    @And("^the user confirms the check in$")
    public void the_user_confirms_the_check_in() {
        mcp.getCheckinPopupCheckinButton().click();
    }

    @Then("^the user should be presented with the check in list$")
    public void the_user_should_be_presented_with_the_check_in_list() {
        clp.getCheckinList().isDisplayed();
        //dodaj proveru da li je prvo ime u listi
    }

    @And("^the users total sessions should be decremented by one$")
    public void the_users_total_sessions_should_be_decremented_by_one() {
        mp.getMembersHeaderLink().click();
        mp.getFirstMember().click();
        if(!mcp.getLastSession().isDisplayed()){
            System.out.println("Successful check in!");
        }
    }

}
