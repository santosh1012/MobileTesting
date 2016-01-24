package com.testing.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TC_001 {

	@Before
	public void before()
	{
		System.out.println("I am before");
	}
	
	
	@Test
	public void hello()
	{
		System.out.println("hello");
		
		}

   @After
   public void after()
   {
	   System.out.println("After");
   }


}
