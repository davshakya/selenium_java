package com.selenium_demo.selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Demo_Test_001 {

	@Test
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-infobars");
		option.addArguments("--start-maximized");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		WebElement element =driver.findElement(By.xpath("//input[@title='Search']"));
		
		element.sendKeys("Cheeta India");
		WebElement element1 =driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		element1.click();
		Thread.sleep(5000);
		driver.close();
		
	}

} 
