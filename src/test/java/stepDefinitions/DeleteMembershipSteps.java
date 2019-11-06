package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MemberCardPage;
import utils.Base;

public class DeleteMembershipSteps extends Base {

    MemberCardPage mcp = new MemberCardPage(driver);

    @When("^the user clicks on the delete membership option$")
    public void the_user_clicks_on_the_delete_membership_option() {
        mcp.getMemberCardMembershipOptions().click();
        mcp.getDeleteMembership().click();
    }

    @And("^the user confirms the delete$")
    public void the_user_confirms_the_delete() {
        mcp.getDeletePopupYesButton().click();
    }

    @Then("^the user should have zero memberships$")
    public void the_user_should_have_zero_memberships() {
        mcp.getAddOneMembership().isDisplayed();
    }
}
