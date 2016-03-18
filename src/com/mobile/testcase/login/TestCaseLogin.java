package com.mobile.testcase.login;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.mobile.app.listener.Screenshort;

import io.appium.java_client.android.AndroidDriver;

public class TestCaseLogin {
	@Test
	public static void succseeLogin() throws InterruptedException{
		
		try {
			LoginUtil.login();
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			Screenshort.Screenshort();
			System.out.println("登录失败");
			e.printStackTrace();
			
		}
		
	}
}


