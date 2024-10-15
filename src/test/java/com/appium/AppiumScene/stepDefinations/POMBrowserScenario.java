package com.appium.AppiumScene.stepDefinations;

import org.openqa.selenium.WebDriver;

import com.appium.AppiumScene.pageObjects.BrowserScene;
import com.appium.AppiumScene.utility.Hook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMBrowserScenario {
	
	WebDriver driver;
	BrowserScene scene;
	Hook hook;
	
	public POMBrowserScenario() {
		this.driver = Hook.getDriver();
		// TODO Auto-generated constructor stub
	}
	
	
	public POMBrowserScenario(WebDriver driver) {
		this.driver = driver;
	}

	@Given("I open the Browser")
	public void i_open_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I open the link")
	public void i_open_the_link() {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("I tap on radio button")
	public void i_tap_on_radio_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 scene = new BrowserScene(driver);
		 scene.clickOnTheRadio();
		 Thread.sleep(3000);
	
	}

	@Then("I tap on the text box")
	public void i_tap_on_the_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	   scene.clickOnTheTextBox();
	   
	}

	@Then("I click on dropdown and select option1")
	public void i_click_on_dropdown_and_select_option1() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    scene.clickOnTheDropDown();
	    Thread.sleep(3000);
	}

	@Then("I tap on second checkbox")
	public void i_tap_on_second_checkbox() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		scene.clickOnTheCheckBox();
		Thread.sleep(3000);
		
	}

}
