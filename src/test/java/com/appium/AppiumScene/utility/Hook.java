package com.appium.AppiumScene.utility;

import java.io.File;
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	private static WebDriver driver;
	public AppiumDriverLocalService service;

//	@Before("@automation")
//	public void setUp() {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C://Users//Pshende//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//	}

	@Before("@appium")
	public void setUpAppium() throws MalformedURLException {

		service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Pshende//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options  options = new UiAutomator2Options();
		options.setDeviceName("PixelEmulator");
		options.setApp("D://cucumberseleniumappium//App//General-Store.apk"); 
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}

	@After
	public void tearDown() {
		driver.quit();
//		service.stop();
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
