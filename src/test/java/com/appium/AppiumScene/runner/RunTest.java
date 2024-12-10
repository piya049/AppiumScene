package com.appium.AppiumScene.runner;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//uncomment runwith if you are using junit to run the test
//@RunWith(Cucumber.class)

@CucumberOptions(features = { "src//test//java//com//appium//AppiumScene//features" }, glue = { "stepDefinations",
		"utility", "runner", "pageObjects" }, tags = "@appiumAutomation", plugin = { "pretty", "html:target/cucumber" })
@Test
public class RunTest extends AbstractTestNGCucumberTests {

}
