package org.datadriventest.qa;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{
 
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getMethod().getDescription());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed-------------------- "+result.getName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed-------------------- "+result.getName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped-------------------- "+result.getName());
		
		
	}



	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Started-------------------- "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finished-------------------- "+context.getName());
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	

}
