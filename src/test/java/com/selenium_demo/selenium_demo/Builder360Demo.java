package com.selenium_demo.selenium_demo;
import org.openqa.selenium.JavascriptExecutor;      

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class Builder360Demo {
    ChromeDriver driver=new ChromeDriver();
    ChromeOptions option=new ChromeOptions();
    JavascriptExecutor js = (JavascriptExecutor)driver;

    
    @BeforeMethod
    public void beforeMethod() {

        driver.get("https://staging-pmdashboard.engineer.ai/#/projects");
        
        driver.manage().window().maximize();        
}
    
  @Test
  public void builderTest() throws InterruptedException {
      driver.findElement(By.xpath("//input[@id='email_add']")).sendKeys("pmadmin_staging@yopmail.com");
      driver.findElement(By.xpath("//input[@id='password_bx']")).sendKeys("admin@123");
      driver.findElement(By.xpath("//input[@name='submit']")).click();
      Thread.sleep(15000);
      driver.findElement(By.xpath("//a[@class='repository-icon']")).click();
//      js.executeScript("window.scrollBy(0,100)");
      Thread.sleep(15000);
//      js.executeScript("document.querySelector(\"div[class='right-content']\").scrollTop=1000");
      
      for (int i=1;i<7;i++) {
      js.executeScript("document.querySelector(\"div[class='todos-left'] div[class='todos-inner']\").scrollTop=10000");
      Thread.sleep(2000);
      }

      driver.findElement(By.xpath("//p[normalize-space()='AutoFolderName1012202728']")).click();

      Thread.sleep(15000);

      
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
//       driver.close();
  }
  
}
