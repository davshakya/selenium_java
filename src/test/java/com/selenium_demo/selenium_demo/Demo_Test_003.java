package com.selenium_demo.selenium_demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo_Test_003 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-infobars");
		option.addArguments("--start-maximized");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		Thread.sleep(5000);
		driver.close();
		
	}

}
