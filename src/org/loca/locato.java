package org.loca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locato {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("7010525289");
	WebElement password =driver.findElement(By.name("pass"));
	password.sendKeys("7358593772");
	WebElement logIn = driver.findElement(By.name("login"));
	logIn.click();
	
	
	
}
}
