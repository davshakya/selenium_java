package com.selenium_demo.selenium_demo;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Demo_TestngTestTest {
	ChromeDriver driver=new ChromeDriver();

  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://www.mycarhelpline.com/");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void loginMethod() {
	  String current_url=driver.getCurrentUrl();
	  System.out.println(current_url);
	  if(current_url.equals("https://www.mycarhelpline.com/"))
	  {
		  System.out.println("The landpage is valid");
	  }
	  else {
		  System.out.println("The landpage is invalid");
	  }
	  driver.findElement(By.xpath("//div[@id='topnav']/div/ul/li[5]/a")).click();
  
   }
 

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
