package com.selenium_demo.selenium_demo;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo_Test_002 {

	@Test(priority=2)
	public void method_Test_001()
	{
		int a=2;
		int b=3;
		System.out.println("It is method_Test_001");
		Assert.assertEquals(a, b, "####Invalid data input number###");
	}
	
	
	@Test(priority = 1)
	public void method_Test_002()
	{
		System.out.println("It is method_Test_002");
	}	
	
	
	@Test(priority = 3)
	public void method_Test_003()
	{
		String s1="Devendra";
		String s2="Devendra S"; 
		
		System.out.println("It is method_Test_003");
		Assert.assertEquals(s1,s2, "####Invalid data input string###");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
