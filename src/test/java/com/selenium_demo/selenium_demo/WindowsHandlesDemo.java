package com.selenium_demo.selenium_demo;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlesDemo {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String ParrentPage=driver.getWindowHandle();
        System.out.println(ParrentPage);
        driver.close();
        
        
    }

}
