package com.Shrey;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shrey\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.id("APjFqb")).sendKeys("shrey");
	Thread.sleep(1000);	
	driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
}
}
