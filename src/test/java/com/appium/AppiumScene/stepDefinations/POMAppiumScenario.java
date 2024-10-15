package com.appium.AppiumScene.stepDefinations;


import org.openqa.selenium.WebDriver;

import com.appium.AppiumScene.pageObjects.AppiumScene;
import com.appium.AppiumScene.utility.Hook;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class POMAppiumScenario {
	
	WebDriver driver;
	AppiumScene scene;
	Hook hook;
	
	
	public POMAppiumScenario() {
		this.driver = Hook.getDriver();
		// TODO Auto-generated constructor stub
	}

	@Given("I open the application")
	public void i_open_the_application(){
	    // Write code here that turns the phrase above into concrete actions
//		Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Accessibility']")).isDisplayed()); 
		
	}

	@When("I tap on Views")
	public void i_tap_on_views() {
	    // Write code here that turns the phrase above into concrete actions
	 scene = new AppiumScene(driver);
		scene.clickOnViews();
	  
	}

	@Then("I tap on the Expandables List")
	public void i_tap_on_the_expandables_list() {
	    // Write code here that turns the phrase above into concrete actions

		scene.clickOnExpandables();
	}

	@Then("I tap on the Custom Adaptor")
	public void i_tap_on_the_custom_adaptor() {
	    // Write code here that turns the phrase above into concrete actions

		scene.clickOnCustom();
	}

	@And("validate the names")
	public void validate_the_names() {
	    // Write code here that turns the phrase above into concrete actions
		
		scene.isCustomViewDisplayed();
	
	}

	
	
}
