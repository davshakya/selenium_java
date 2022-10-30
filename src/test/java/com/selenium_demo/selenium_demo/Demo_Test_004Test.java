package com.selenium_demo.selenium_demo;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Demo_Test_004Test {
	ChromeDriver driver = new ChromeDriver();
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-info bars");
//		option.addArguments("--start-maximized");
		driver.manage().window().maximize();
		Thread.sleep(5000);
  }

  
  @Test
  public void startTest() {
		driver.get("https://www.google.com/");	
		System.out.println(driver.getCurrentUrl());
		String getUrl=driver.getCurrentUrl();
		String currentUrl="https://www.google.com/";
		if( currentUrl.equals(getUrl))
				{
				System.out.println("Landing page is Valid");
				}
		
		else {
					System.out.println("Landing page is Invalid");
				}		
		
//		driver.findElements(By.xpath());
		
  	}
  
  
  @AfterTest
  public void closeTest() {
		driver.close();
	  
  }
}
