package com.testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener

{

	@Override
	public void onFinish(ITestContext arg0) 
	{
		// TODO Auto-generated method stub
		System.out.println("Test case is finishing with name " +result.getName());
	}

	@Override
	public void onStart(ITestContext arg0) 
	{
		// TODO Auto-generated method stub
		System.out.println("Test case is starting with name " +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		System.out.println("Test Case is failing with name " +result.getName());
		ListenerTest.takescreenshot();
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		System.out.println("Test Case is skipped with name " +result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		System.out.println("Test Suite is starting with name " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		System.out.println("Test Suite is finishing with name " +result.getName());
	}

}
