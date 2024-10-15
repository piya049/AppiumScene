package com.appium.AppiumScene.stepDefinations;

import org.openqa.selenium.WebDriver;

import com.appium.AppiumScene.pageObjects.WifiSetting;
import com.appium.AppiumScene.utility.Hook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMWifiSettingName {

	WebDriver driver;
	WifiSetting wifi;
	Hook hook;

	public POMWifiSettingName() {
		this.driver = Hook.getDriver();
		// TODO Auto-generated constructor stub
	}

	@Given("I open the new application")
	public void i_open_the_new_application() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I tap on Preference")
	public void i_tap_on_preference() {
		// Write code here that turns the phrase above into concrete actions

		wifi = new WifiSetting(driver);
		wifi.clickOnPreference();
	}

	@Then("I tap on the Preference dependencies")
	public void i_tap_on_the_preference_dependencies() {
		// Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		wifi.clickOnPreference_dependency();
	}

	@Then("I need to check the checkbox to see the wifi settings")
	public void i_need_to_check_the_checkbox_to_see_the_wifi_settings() {
		// Write code here that turns the phrase above into concrete actions
		wifi.clickOnCheckBox();
	}

	
	@Then("I tap on wifi settings")
	public void i_tap_on_wifi_settings() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		wifi.clickOnWifiSettings();
	}
	
	@Then("I Validate wifi settings")
	public void i_validate_wifi_settings() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		wifi.validateWifiSettings();
		Thread.sleep(3000);
	}

	@Then("I set the name")
	public void i_set_the_name() {
		// Write code here that turns the phrase above into concrete actions
		wifi.clickOnTextBox();
		wifi.clickOnButton();
	}

}
