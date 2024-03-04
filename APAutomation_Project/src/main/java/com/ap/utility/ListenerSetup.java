package com.ap.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Execution started :- "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Execution completed successfully :- "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		CommonMethods.captureScreenshotMethod(result.getName());
		System.out.println("Execution failed and captured screenshot :- "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Execution skipped :- "+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

	
}
