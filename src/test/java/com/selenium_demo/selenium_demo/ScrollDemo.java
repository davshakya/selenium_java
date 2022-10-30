package com.selenium_demo.selenium_demo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class ScrollDemo {
    ChromeDriver driver=new ChromeDriver();
    ChromeOptions option=new ChromeOptions();
    JavascriptExecutor js = (JavascriptExecutor)driver;
    Actions action=new Actions(driver);

    
    @BeforeMethod
    public void beforeMethod() {

        driver.get("https://staging.engineer.ai/home");
        driver.manage().window().maximize();        
}
    
  @Test
  public void builderTest() throws InterruptedException {
      driver.findElement(By.xpath("//*[@id=\"main\"]/welcome-to-studio/div/div[2]/div[2]/button")).click();
      Thread.sleep(10000);

      driver.findElement(By.xpath("//*[@id=\"app-component\"]/div[1]/div[2]/main/app-home-templates/div[4]/div[2]/em")).click();

      driver.switchTo().alert().dismiss();
      
      js.executeScript("window.scrollBy(0,100)");
      Thread.sleep(10000);

      
//      WebElement element =driver.findElement(By.xpath("//span[normalize-space()='E-Commerce App']"));
//      driver.findElement(By.xpath("//strong[normalize-space()='Choose a base']")).click();
//      action.scrollToElement(element).perform();

      
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
       driver.close();
  }
  
}
