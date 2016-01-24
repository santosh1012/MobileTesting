package com.pressie.base;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import config.Constants;
import io.appium.java_client.android.AndroidDriver;

public class Start {

//	public static AndroidDriver driver;
	public static DesiredCapabilities cap;
	@BeforeSuite
	public void bsuite() 
	{
		File f=new File(Constants.FilePath);
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion",Constants.platformVersion );
		cap.setCapability("deviceName", Constants.deviceName);
		cap.setCapability("app", f);
		cap.setCapability("appActivity", Constants.appActivity);
		cap.setCapability("appPackage", Constants.appPackage);
		
	}
	
	
}
