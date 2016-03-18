package com.mobile.app.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.appium.java_client.MobileElement;


public class AppiumUtil {
	//封装的方法

	public static void WaitForElement(WebDriver driver, By by)
    {
		MobileElement targetElement = (MobileElement) (new WebDriverWait(driver,60)).until(ExpectedConditions.presenceOfElementLocated(by));
       try {
        	Assert.assertEquals(targetElement.isDisplayed(),true);
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(targetElement+"空间没有显示");;
			
		} 
    }
	
	public static void click(WebDriver driver,By by){
		MobileElement element= (MobileElement) driver.findElement(by);
	try {
			Assert.assertTrue(true, element.getAttribute("clickable"));
			element.click();
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(element+"空间不能点击");
		}
		
		
		}
public static void sendMessage(WebDriver driver,By by,String keysToSend){
	MobileElement element= (MobileElement) driver.findElement(by);
	try {
		Assert.assertFalse(element.isSelected());
		element.sendKeys(keysToSend);
	} catch (Exception e) {
		// TODO: handle exception
		Assert.fail();
	}

}
	
public static void cleanText(WebDriver driver,By by,String text){
	MobileElement element= (MobileElement) driver.findElement(by);
	element.getAttribute(text);
	for (int i = 0; i < text.length(); i++) {
		
	}
 }
}
