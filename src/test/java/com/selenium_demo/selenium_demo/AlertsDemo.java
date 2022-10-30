package com.selenium_demo.selenium_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AlertsDemo {

    public static void main(String[] args) {
        ChromeDriver driver= new ChromeDriver();
        ChromeOptions option= new ChromeOptions();
        option.addArguments("−−incognito");
     
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//        driver.get("https://www.irctc.co.in/nget/train-search");
//        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("davshakya");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc");
//        driver.findElement(By.xpath("//input[@name='proceed']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
//        alert.dismiss();
        alert.accept();
        
    }

}
