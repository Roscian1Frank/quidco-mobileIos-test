package com.ios.appiumtest.steps;

import com.ios.appiumtest.helpers.CommonAction;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by roscian.frank on 01/05/2017.
 */
public class AppTestBase extends CommonAction {
    public static AppiumDriver<IOSElement> driver;

    @Before
    public void startApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/build/Quidco.app");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
        capabilities.setCapability(MobileCapabilityType.UDID, "8e3afd04fbb6da5d5218947aac9ba10e690bd9b4");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability("xcodeOrgId", "Auto");
        capabilities.setCapability("xcodeSigningId", "Auto");
        capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 50000);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }
    @After
    public void closeApp() throws IOException, URISyntaxException {
        driver.quit();
    }
}
