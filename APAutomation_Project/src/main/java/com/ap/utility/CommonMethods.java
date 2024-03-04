package com.ap.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ap.testbase.TestBase;

public class CommonMethods extends TestBase {

//================= Capture screenshot method ==============================
	
	public static void captureScreenshotMethod (String filename)
	{
	try
	{
		String path = "C:\\Users\\priya\\eclipse-workspace\\APAutomation_Project\\Screenshots\\";
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
	    File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File (path + filename + ".png");
		
		FileHandler.copy(Source, Destination);
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
	}
	
//================ Select Dropdown method =====================================	
	public static void selectDropdownMethod (WebElement element,String value )
	{  
		Select s = new Select(element);
		try 
		{
			s.selectByIndex(0);
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		s.selectByVisibleText(value);
	}
//================ Explicit Wait ==============================================	
	public static WebElement explicitWaitForElement (WebElement element)
	{
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
}
