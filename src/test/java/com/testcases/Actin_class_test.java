package com.testcases;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import sun.misc.PerformanceLogger;

public class Actin_class_test 
{

@Test
public void TestAction01() throws Exception

{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Actions act= new Actions(driver);
	driver.manage().window().maximize();
	driver.get("file:///C:/Selenium/Offline Website/Offline Website/index.html");
	WebElement logo = driver.findElement(By.tagName("img"));
	act.contextClick(logo).perform();
	
	act.click(driver.findElement(By.tagName("img"))).perform();
	
	WebElement uname = driver.findElement(By.id("email"));
	
	act.click(uname).sendKeys(uname,"kiran@gmail.com").build().perform();
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
	
	act.moveToElement(driver.findElement(By.xpath("//i[@class='ion ion-bag']"))).pause(3000).perform();
	
	
}


}
