package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef {
    //Create Object of Classes
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();


    @Given("^user is already on HomePage\\.$")
    public void user_is_already_on_HomePage()  {
        //call method of homepage verification text
        homePage.homepageverification();
    }
    @When("^user clicks on register button$")
    public void user_clicks_on_register_button()  {
        //call method of click on register button
        homePage.ClickonRegisterButton();
    }

    @When("^user enters all required registration Details\\.$")
    public void user_enters_all_required_registration_Details()  {
        //call method of register page verification text
        registerPage.registerMessageVerificationText();
        //call method to complete registration by input Data
        registerPage.userEnterRegistrationDetails();
    }
    @When("^user clicks on register Complete button$")
    public void user_clicks_on_register_Complete_button()
    {
        //call method of click on register  button
        registerPage.clickRegisterButton();
    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully(){
        //call method of registration page verification text
        registerSuccessPage.verifyRegistrationCompleteText();
        //call method through objectv to click on continue button
        registerSuccessPage.clickOnContinueButton();
    }
}
