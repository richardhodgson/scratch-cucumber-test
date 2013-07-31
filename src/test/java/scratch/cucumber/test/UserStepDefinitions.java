package scratch.cucumber.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Karl Bennett
 */
public class UserStepDefinitions {

    @Given("^I am on the create user page$")
    public void I_am_on_the_create_user_page() {
        System.out.println("I AM ON THE CREATE USER PAGE!");
    }

    @When("^I enter in the details for a new user$")
    public void I_enter_the_details_for_a_new_user() {
        System.out.println("I ENTER THE DETAILS FOR A NEW USER!");
    }

    @When("^I submit the page$")
    public void I_submit_the_page() {
        System.out.println("I SUBMIT THE PAGE!");
    }

    @Then("^I should be back on the create user page$")
    public void I_should_be_back_on_the_create_user_page() {
        System.out.println("I SHOULD BE BACK ON THE CREATE USER PAGE!");
    }

    @Then("^the new user should be displayed$")
    public void the_new_user_should_be_displayed() {
        System.out.println("THE NEW USER SHOULD BE DISPLAYED!");
    }
}
