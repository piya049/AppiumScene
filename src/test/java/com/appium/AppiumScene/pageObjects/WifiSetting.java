package com.appium.AppiumScene.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumBy;

public class WifiSetting {

	WebDriver driver;

	By pref = AppiumBy.accessibilityId("Preference");
	By pd = By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]");
	By check_box = By.id("android:id/checkbox");
	By wifi_settings = By.xpath("//android.widget.TextView[@text=\"WiFi settings\"]");
	By dailogBox = By.id("android:id/alertTitle");
	By text_box = By.id("android:id/edit"); // send keys to write wifi name
	By btt = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");

	public WifiSetting(WebDriver driver) {

		this.driver = driver;

	}
	
	public void clickOnPreference() {
		driver.findElement(pref).click();
	}
	
	public void clickOnPreference_dependency() {
		driver.findElement(pd).click();
	}
	
	public void clickOnCheckBox() {
		driver.findElement(check_box).click();
		
	}
	
	public void clickOnWifiSettings() throws InterruptedException {
		driver.findElement(wifi_settings).click();
		Thread.sleep(3000);
		
	}
	
	public void validateWifiSettings() {
		driver.findElement(dailogBox).isDisplayed();
		
	}
	
	public void clickOnTextBox() {
		driver.findElement(text_box).sendKeys("Piyush's Wifi-Always Remember");
	}
	
	public void clickOnButton() {
		driver.findElement(btt).click();
	}

}
