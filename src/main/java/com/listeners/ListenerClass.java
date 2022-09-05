package com.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public final class ListenerClass implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("before suite in listener");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("after suite in listener");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("before method in listener");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("after method in listener : pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("after method in listener : fail and I am attaching screenshots here");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("after method in listener : skipped and ignored");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
}
