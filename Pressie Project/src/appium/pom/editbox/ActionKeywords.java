package appium.pom.editbox;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;


public class ActionKeywords {

	static AndroidDriver driver;
	public void TypeTextOnEditBox(String object){
	driver.findElementById(object).sendKeys("");
	}	
	public void VerifyEditBoxEnabled(String object)
	{
		boolean enabled = driver.findElementById(object).isEnabled();
	}
	public static void VerifyEditBoxValue(String object,String val2)
	{
	String val = driver.findElementById(object).getText();
	if(val.equals(val2))
	{
		System.out.println("True");
	}
	}
	public static void VerifyEditBoxText(String object,String val1)
	{
		String text = driver.findElementById(object).getText();
		if(val1.equals(text))
		{
			System.out.println("verified");
		}
	}
	public static void GetTextFromEditBox()
	{
		
	}
	public static void VerifyEditBoxExist()
	{
		
	}
	public static void VerifyEditBoxNotExist()
	{
		
	}
	public static void VerifyEditBoxEditable()
	{
		
	}
	public static void VerifyEditBoxName()
	{
		
	}
	public static void ClearEditField()
	{
		
	}
	public static void TypeTextAndEnterEditBox()
	{
		
	}
	public static void WaitForEditBoxEnabled()
	{
		
	}
	public static void TypeKeysOnEditBox()
	{
		
	}
	public static void GetEditBoxName()
	{
		
	}
	public static void TypeTextAndWait()
	{
		
	}
	public static void TypeKeysAndWait()
	{
		
	}

}
