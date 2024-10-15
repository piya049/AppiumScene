package com.appium.AppiumScene.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumBy;

public class AppiumScene {
	
	WebDriver driver;
	
	By views = AppiumBy.accessibilityId("Views");
	By expandables_list = By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
	By custom_adaptor = AppiumBy.accessibilityId("1. Custom Adapter");
	By validate1 = By.xpath("//android.widget.TextView[@text=\"People Names\"]");
	By validate2 = By.xpath("//android.widget.TextView[@text=\"Dog Names\"]");
	By validate3 = By.xpath("//android.widget.TextView[@text=\"Cat Names\"]");
	By validate4 = By.xpath("//android.widget.TextView[@text=\"Fish Names\"]");

	
	public AppiumScene(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnViews() {
		driver.findElement(views).click(); 
	}
	
	
	public void clickOnExpandables() {
		driver.findElement(expandables_list).click(); 
	}
	
	public void clickOnCustom() {
		driver.findElement(custom_adaptor).click(); 
	}

	public void isCustomViewDisplayed() {
		driver.findElement(validate1).isDisplayed();
		driver.findElement(validate2).isDisplayed();
		driver.findElement(validate3).isDisplayed();
		driver.findElement(validate4).isDisplayed();
	}
	
}
