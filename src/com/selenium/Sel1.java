package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sel1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	Dimension size = new Dimension(500, 100);
	driver.manage().window().setSize(size);
	String title = driver.getTitle();
	String url = driver.getCurrentUrl();
	String pageSource = driver.getPageSource();
	System.out.println(pageSource + "\n" + title + "\n" + url);
    Thread.sleep(2000);

	
   System.setProperty("webdriver.gecko.driver","D:\\Eclipse\\Selenium\\driver\\geckodriver.exe");
   WebDriver driver1= new FirefoxDriver();
   driver1.get("https://www.facebook.com/");
   driver1.manage().window().maximize();
   driver1.navigate().to("https://www.amazon.in");
   driver1.navigate().back();
   driver1.navigate().forward();
   driver1.navigate().refresh();
	String title1 = driver1.getTitle();
	String url1 = driver1.getCurrentUrl();
	System.out.println(url1 + "\n" + title1);
	}
}
					