package com.selenium_demo.selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo {
    
    ChromeDriver driver=new ChromeDriver();
    
  @Test
  public void frameMethod() throws InterruptedException {
      driver.get("https://staging-pmdashboard.engineer.ai/#/projects");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//input[@id='email_add']")).sendKeys("pmadmin_staging@yopmail.com");
      driver.findElement(By.xpath("//input[@id='password_bx']")).sendKeys("admin@123");
      driver.findElement(By.xpath("//input[@name='submit']")).click();
      
      
      Thread.sleep(10000);
      driver.close();
      
      
      
  }
}
