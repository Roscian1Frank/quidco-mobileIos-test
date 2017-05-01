package com.ios.appiumtest.helpers;

import com.ios.appiumtest.steps.AppTestBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by roscian.frank on 01/05/2017.
 */
public class CommonAction {

    public  AppiumDriver<IOSElement> driver;

    public CommonAction() {
        driver = AppTestBase.driver;
    }
    public void waitForElement(){
        try{
            WebDriverWait wait = new WebDriverWait(driver, 10);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
