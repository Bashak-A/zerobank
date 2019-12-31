package com.zerobank.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {



    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        System.out.println("I can log in with valid credentials");
    }

    @Then("account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {
        System.out.println("Summary page is displayed");
    }


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am in the login page");
    }

    @When("User logs in with invalid credentials")
    public void user_logs_in_with_invalid_credentials() {
        System.out.println("As an authorized user I can login with valid credential");
    }

    @Then("User should not be able to login")
    public void user_should_not_be_able_to_login() {
        System.out.println("I cannot log in with invalid credential");
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        System.out.println("Error message is displayed");
    }
}
