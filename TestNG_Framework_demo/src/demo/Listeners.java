package demo;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class Listeners implements ITestListener
	{
		@Override
		public void onTestStart(ITestResult result) 
		{
			
		}
		
		@Override
		public void onTestSuccess(ITestResult result) 
		{
			System.out.println("I have executed successfully");
		}

		@Override
		public void onTestFailure(ITestResult result) 
		{
			System.out.println("Something went wrong " + result.getName());
		}	
		
		@Override
		public void onTestSkipped(ITestResult result) 
		{
			System.out.println("Some test cases didnt work");
		}
		
		@Override
		public void onStart(ITestContext context) 
		{
			
		}
		
		
		
		@Override
		public void onFinish(ITestContext context) 
		{
			
		}
	}