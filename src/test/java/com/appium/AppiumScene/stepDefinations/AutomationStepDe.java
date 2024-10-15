package com.appium.AppiumScene.stepDefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.appium.AppiumScene.pageObjects.Automation;
import com.appium.AppiumScene.utility.ExcelReader;
import com.appium.AppiumScene.utility.Hook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomationStepDe {
	
	Hook hook;
	WebDriver driver;
	
	Automation automation;
	
	public AutomationStepDe() {
		this.driver = Hook.getDriver();
		
	}

	public AutomationStepDe(WebDriver driver) {
		this.driver = driver;
		
	}

	
	
	@Given("User navigates to protractor page")
	public void user_navigates_to_protractor_page() {
//	    Hook.getDriver().get("https://rahulshettyacademy.com/angularpractice/");
		
	}

	@When("user fills the form from the given sheetName {string} and rowNumber {int}")
	public void user_fills_the_form_from_the_given_sheet_name_and_rownumber(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
	   
		
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = 
				reader.getData("/AppiumScene/resources/automation.xlsx", sheetName);
		
		
		String name = testData.get(rowNumber).get("name");
		String email = testData.get(rowNumber).get("email");
		String pass = testData.get(rowNumber).get("pass");
		
		 automation = new Automation(driver);
		automation.fillAutomationForm(name, email, pass);
		
	}
	
	@Then("user tap on check box")
	public void user_tap_on_check_box() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    automation.tapOnCheckBox();
	    
	}

	@Then("user select Gender")
	public void user_select_gender() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    automation.selectGender();
	}

	@Then("User tap on radio button of Employment status")
	public void user_tap_on_radio_button_of_employment_status() {
	    // Write code here that turns the phrase above into concrete actions
	    automation.employmentStatus();
	}

	@Then("User select his birthdate")
	public void user_select_his_birthdate() {
	    // Write code here that turns the phrase above into concrete actions
	   automation.tapOnBday();
	}


	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    automation.clickSend();
	}

	@Then("it shows successfull message {string}")
	public void it_shows_successfull_message(String expSuccessMessage) {
	    // Write code here that turns the phrase above into concrete actions
//		String actualSuccMessg = automation.getSuccessMsg();
////		Assert.(actualSuccMessg, expSuccessMessage);
//		Assert.assertEquals(actualSuccMessg, expSuccessMessage);
		automation.getSuccessMsg();
	}
	
}
