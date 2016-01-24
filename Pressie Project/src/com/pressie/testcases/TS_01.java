package com.pressie.testcases;

import java.util.ResourceBundle;

import org.testng.annotations.Test;

import com.pressie.base.Start;

import config.ActionKeywords;

public class TS_01 extends ActionKeywords{

	public static ResourceBundle rb=ResourceBundle.getBundle("OR");
	
	@Test
	public static void TC_001()
	{
		launchApplication();
		typeText(rb.getString("Register"),"");
	}
	
	
	
	
	
	
}
