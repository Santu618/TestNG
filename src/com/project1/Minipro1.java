package com.project1;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Minipro1 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Women']")).click();
	Thread.sleep(5000);
	WebElement dress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]"));
	dress.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]")).click();
	WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
	quantity.clear();
	quantity.sendKeys("5");
	driver.findElement(By.xpath("//p[@id=\"add_to_cart\"]/button/span")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("duraisingham@1tonn.com");
	driver.findElement(By.id("SubmitCreate")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
	driver.findElement(By.id("customer_firstname")).sendKeys("Durai");
	driver.findElement(By.id("customer_lastname")).sendKeys("Singam");
	driver.findElement(By.id("passwd")).sendKeys("OondraTonWeight");
	driver.findElement(By.xpath("(//option[@value='12'])[1]")).click();
	driver.findElement(By.xpath("(//option[@value='12'])[2]")).click();
	driver.findElement(By.xpath("(//option[@value='1992'])")).click();
//	driver.findElement(By.id("firstname")).sendKeys("durai");
//	driver.findElement(By.id("lastname")).sendKeys("Singam");
	driver.findElement(By.id("company")).sendKeys("DSP");
	driver.findElement(By.id("address1")).sendKeys("Dubai Main road");
	driver.findElement(By.id("address2")).sendKeys("Rendavadhu kuruku Sandhu");
	driver.findElement(By.id("city")).sendKeys("Dubai");
	driver.findElement(By.xpath("(//option[@value='19'])[2]")).click();
	driver.findElement(By.id("postcode")).sendKeys("60010");
	driver.findElement(By.id("other")).sendKeys("Solradhuku onnum illa");
	driver.findElement(By.id("phone")).sendKeys("9876543210");
	driver.findElement(By.id("phone_mobile")).sendKeys("9897654321");
//  driver.findElement(By.id("alias")).sendKeys("Yaarupa adhu");
	driver.findElement(By.id("submitAccount")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
	driver.findElement(By.id("cgv")).click();
	driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
	driver.findElement(By.xpath("//a[@class='bankwire']")).click();
	driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
	Thread.sleep(3000);
	TakesScreenshot ts =(TakesScreenshot) driver;
	File output = ts.getScreenshotAs(OutputType.FILE);
	File location = new File("D:\\Eclipse\\Selenium\\Screenshot\\Project1.png");
	FileUtils.copyFile(output, location);
	
	
	
}
}