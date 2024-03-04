package com.ap.testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("AP Automation Framework");
		PropertyConfigurator.configure("Log4jfile.properties");
		
		logger.info("-----Framework Execution Started-----");
	}
	@AfterTest
	public void end ()
	{
		logger.info("-----Framework Execution Completed-----");
	}
	
	@BeforeMethod
	public void setUp()
	{
		String browser_name = "Chrome";
		if(browser_name.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browser_name.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please choose correct browser");
		}
	
		driver.get("https://ap-automation.odoo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		logger.info("-----Browser launches with URL-----");
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("-----Browser Closed-----");
	}

}
