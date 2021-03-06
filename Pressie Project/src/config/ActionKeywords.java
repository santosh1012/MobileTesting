package config;

import java.net.MalformedURLException;
import java.net.URL;
import com.pressie.base.Start;
import io.appium.java_client.android.AndroidDriver;

public class ActionKeywords extends Start {

	// public static AndroidDriver driver;
	public static AndroidDriver driver;
	public static void launchApplication() {
		try {
			driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}

	}
	public static void typeText(String obj,String data) {

		try
		{
		driver.hideKeyboard();
		}
		catch(Exception e)
		{
			System.out.println("not any keyboard");
			e.printStackTrace();
		}
		driver.findElementById(obj).sendKeys(data);
	}

	public static void click(String obj) {
		try
		{
		driver.findElementById(obj).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public static void tap(String obj) {

		driver.findElementById("").click();
	}

	public static void swipe() {

	}

	public static void hideKeyboard() {
		
driver.hideKeyboard();
	}

	public static void scrollTo() {

	}

}
