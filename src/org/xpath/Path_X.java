package org.xpath;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path_X {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(3000);
	WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
	fname.sendKeys("Santu");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dhana");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("santu618@gmail.com");
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("santu618@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("SS!@##");
	driver.findElement(By.xpath("//option[@value='13']")).click();
	driver.findElement(By.xpath("(//option[@value='4'])[2]")).click();
	driver.findElement(By.xpath("(//option[@value='1997'])")).click();
	driver.findElement(By.xpath("(//input[@value='2'])")).click();
	driver.findElement(By.xpath("(//button[@name='websubmit'])")).click();
	Thread.sleep(10000);
	TakesScreenshot ts =(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination =new File("D:\\Eclipse\\Selenium\\Screenshot\\ss1.png");
	FileUtils.copyFile(source, destination);
	
}
}
