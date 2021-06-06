package com.testcases;

import java.io.IOException;
import org.apache.commons.exec.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import java.nio.file.*;
import com.sun.java.util.jar.pack.Package.File;
import org.testng.annotations.Listeners;

//@Listeners(MyListner.class)

public class ListenerTest 
{
	public static WebDriver driver = null;
			public static void takescreenshot()
			{
				TakesScreenshot ts= (TakesScreenshot)driver;
				File source=ts.getScreenshotAs(OutputType.FILE);
				File dest=new File(System.getProperty("user.dir")+"/screenshot/demo.jpg"
						try
				{
							FileUtils.copyFile(source, dest);
							
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}

	@Test
	public void test01()
	{
		//add login offlien website page code here
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Selenium/Offline Website/Offline Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		Assert.assertEquals(true, false);
	}

	public void test02()
	{
		Assert.assertEquals(true, true);
	}
	
	public void test03()
	{
		throw new SkipException ("Skipping this test case");
	}

}
