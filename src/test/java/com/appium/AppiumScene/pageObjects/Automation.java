package com.appium.AppiumScene.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation {
	
	WebDriver driver;
	
	public Automation(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By name = By.xpath("//input[@name='name']");
	By email = By.xpath("//input[@name='email']");
	By pass = By.xpath("//input[@id='exampleInputPassword1']");
	By check_box = By.xpath("//input[@id='exampleCheck1']");
	By drop_down = By.xpath("//option[normalize-space()='Female']");
	By radio = By.xpath("//input[@id='inlineRadio2']");
	By bday = By.xpath("//body/app-root[1]/form-comp[1]/div[1]/form[1]/div[7]/input[1]");
	By submit = By.cssSelector("input[value='Submit']");
	By successMsg = By.cssSelector(".alert.alert-success.alert-dismissible");

	
	public String getAutomationPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public void fillAutomationForm(String GivenName, String emailId, String password) {
//		Select select1 = new Select(driver.findElement(name));
//		select1.selectByVisibleText(GivenName);
		
		driver.findElement(name).sendKeys(GivenName);
		driver.findElement(email).sendKeys(emailId);
		driver.findElement(pass).sendKeys(password);
		
		
	}
	
	public void tapOnCheckBox() {
		driver.findElement(check_box).click();
	}
	
	public void selectGender() throws InterruptedException {
		driver.findElement(drop_down).click();
		Thread.sleep(3000);
	}
	
	public void employmentStatus() {
		driver.findElement(radio).click();
	}
	
	public void tapOnBday() {
		driver.findElement(bday).click();
	}
	
	
	public void clickSend() throws InterruptedException {
		driver.findElement(submit).click();
		Thread.sleep(3000);
	}
	
	public String getSuccessMsg() {
		
		return driver.findElement(successMsg).getText();
	}
	
	
	
}
