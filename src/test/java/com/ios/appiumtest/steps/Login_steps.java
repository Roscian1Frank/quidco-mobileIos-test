package com.ios.appiumtest.steps;

import com.ios.appiumtest.helpers.CommonAction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by roscian.frank on 01/05/2017.
 */
public class Login_steps extends CommonAction {
    @Given("^launch the app$")
    public void launchTheApp() throws Throwable {
        driver.findElementByName("Skip").click();
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String buttonName) throws Throwable {
        driver.findElementByName(buttonName).click();
    }

    @When("^As a user I am filling the registration form$")
    public void asAUserIAmFillingTheRegistrationForm() throws Throwable {
        driver.findElementByName("First Name").sendKeys("TestUser");
        driver.findElementByName("Last Name").sendKeys("TestUser");
        driver.findElementByName("Email Address").sendKeys("TestUser1@test.com");
        driver.findElementByName("Password").sendKeys("Pa55word");
        driver.findElementByName("return").click();
        driver.findElementByName("Join Us").click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Join Us")));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Search for retailers")));
    }

    @Then("^I check user is logged in the app$")
    public void iCheckUserIsLoggedInTheApp() throws Throwable {
        driver.findElementByName("Turn on Notifications").click();
        driver.findElementByName("Allow").click();
        Assert.assertTrue("Not able register user",driver.findElementByName("Search for retailers").isDisplayed());
    }

    @When("^Log in as existing user$")
    public void logInAsExistingUser() throws Throwable {
        driver.findElementByName("Skip").click();
        driver.findElementByName("Sign In").click();
        driver.findElementByName("Email / Username").sendKeys("TestUser@test.com");
        driver.findElementByName("Password").sendKeys("Pa55word");
        driver.findElementByName("return").click();
        driver.findElementByName("Sign In").click();
    }
}
