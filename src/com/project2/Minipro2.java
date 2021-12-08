package com.project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Minipro2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//td[@class='login_register']")).click();
	driver.findElement(By.id("username")).sendKeys("Singam");
	driver.findElement(By.id("password")).sendKeys("Singam@1ton");
	driver.findElement(By.id("re_password")).sendKeys("Singam@1ton");
	driver.findElement(By.id("full_name")).sendKeys("DhuraiSingam");
	driver.findElement(By.id("email_add")).sendKeys("DhuraiSingam@1ton.com");
	
	
	
}
}
