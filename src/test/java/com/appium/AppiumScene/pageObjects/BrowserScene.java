package com.appium.AppiumScene.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserScene {
	
	
	WebDriver driver;
		
	By radio = By.xpath("//input[@value='radio3']");
	By txt_box = By.cssSelector("#autocomplete");
	By drop_down = By.xpath("//select[@id='dropdown-class-example']");
	By check_box = By.xpath("//input[@id='checkBoxOption2']");
	
	
	public BrowserScene(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickOnTheRadio() {
		driver.findElement(radio).click();
	}
	
	
	public void clickOnTheTextBox() {
		driver.findElement(txt_box).sendKeys("The Untold Story: Piyush Shende");
	}
	
	public void clickOnTheDropDown() {
		driver.findElement(drop_down).click();
	}
	
	public void clickOnTheCheckBox() {
		driver.findElement(check_box).click();
	}
	
	
}