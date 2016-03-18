package com.mobile.app.listener;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class DotTestListener  extends TestListenerAdapter{
	@Override
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		
		Screenshort.Screenshort();
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		super.onTestSkipped(tr);
		
	//	Screenshort(tr);
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		super.onTestSuccess(tr);
		
	}

	@Override
	public void onTestStart(ITestResult tr) {
		super.onTestStart(tr);
	
	}

	@Override
	public void onFinish(ITestContext testContext) {
		super.onFinish(testContext);

	}
}
