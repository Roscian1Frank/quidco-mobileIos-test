package com.ios.appiumtest.steps;

import com.github.javafaker.Faker;
import com.ios.appiumtest.helpers.CommonAction;
import com.ios.appiumtest.pages.Login_page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by roscian.frank on 01/05/2017.
 */
public class Login_steps extends CommonAction {
    Login_page loginPage = new Login_page(driver);

    @Given("^launch the app$")
    public void launchTheApp() throws Throwable {
        loginPage.skipButton.click();

    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String buttonName) throws Throwable {
        driver.findElementByName(buttonName).click();
    }

    @When("^As a user I am filling the registration form$")
    public void asAUserIAmFillingTheRegistrationForm() throws Throwable {
       loginPage.userRegistration();
    }

    @Then("^I check user is logged in the app$")
    public void iCheckUserIsLoggedInTheApp() throws Throwable {
        loginPage.turnOnNotification.click();
        loginPage.puhNotification.click();
        Assert.assertTrue("Not able to register user",loginPage.searchBar.isDisplayed());
    }

    @When("^Log in as existing user$")
    public void logInAsExistingUser() throws Throwable {
        loginPage.userLogin();
    }
}
