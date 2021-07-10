package com.demoqa.test.stepdefinition;

import com.demoqa.automation.steps.TextBoxPageSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PracticeTextBoxStepDefinitions {

    @Steps
    TextBoxPageSteps textBoxPageSteps;

    @Given("^a web user wants to enter text box$")
    public void aWebUserWantsToEnterTextBox() {
        // Write code here that turns the phrase above into concrete actions
        textBoxPageSteps.openBrowser();

    }


    @When("^he fills all the requested fields in the Text Box section$")
    public void heFillsAllTheRequestedFieldsInTheTextBoxSection() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        textBoxPageSteps.fillTexBox();

    }

    @Then("^he should see hem data down$")
    public void heShouldSeeHemDataDown() {
        // Write code here that turns the phrase above into concrete actions

    }
}
