package com.ios.appiumtest.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by roscian.frank on 01/05/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        plugin = {"pretty","html:target/cucumber-html-report", "json:cucumber.json"},
        glue = {"com.ios.appiumtest.steps"},
        tags = {"@LoginPage"})
public class RunTest {

}