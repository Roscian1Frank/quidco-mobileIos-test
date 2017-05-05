package com.ios.appiumtest.pages;


import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.ios.appiumtest.steps.AppTestBase.driver;

/**
 * Created by roscian.frank on 05/05/2017.
 */
public class Login_page {
    public Login_page(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @iOSFindBy(accessibility = "Skip")
    public WebElement skipButton;

    @iOSFindBy(accessibility = "First Name")
    public  WebElement userFirstName;

    @iOSFindBy(accessibility = "Last Name")
    public  WebElement userLastName;

    @iOSFindBy(accessibility = "Email Address")
    public  WebElement userEmailAdd;

    @iOSFindBy(accessibility = "Password")
    public WebElement userPassword;

    @iOSFindBy(accessibility = "return")
    public WebElement returnButton;

    @iOSFindBy(accessibility = "Join Us")
    public WebElement joinUsButton;

    @iOSFindBy(accessibility = "Turn on Notifications")
    public WebElement turnOnNotification;

    @iOSFindBy(accessibility = "Allow")
    public WebElement puhNotification;

    @iOSFindBy(accessibility = "Search for retailers")
    public WebElement searchBar;

    @iOSFindBy(accessibility = "Sign In")
    public WebElement signInButton;

    @iOSFindBy(accessibility = "Email / Username")
    public WebElement userName;

    public void userLogin(){
        skipButton.click();
        signInButton.click();
        userName.sendKeys("TestUser@test.com");
        userPassword.sendKeys("Pa55word");
        signInButton.click();
    }

    public void userRegistration(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        userFirstName.sendKeys(firstName);
        userLastName.sendKeys(lastName);
        userEmailAdd.sendKeys(email);
        userPassword.sendKeys("Pa55word");
        returnButton.click();
        joinUsButton.click();
    }
}
