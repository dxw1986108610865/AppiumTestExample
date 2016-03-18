package com.mobile.app.utils;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Driver {
   static AppiumDriver Appiumdriver ;
  static AndroidDriver androiddriver;
   static WebDriver webdriver;
   static IOSDriver iosdriver;
  
  public static AppiumDriver AppiumDriver(){
	  
	  return Appiumdriver;
  }
public static AndroidDriver AndroidDriver(){
	  
	  return androiddriver;
  }
public static WebDriver WebDriver(){
	  
	  return webdriver;
}
  
public static IOSDriver IOSDriver(){
	  
	  return iosdriver;
}

}
