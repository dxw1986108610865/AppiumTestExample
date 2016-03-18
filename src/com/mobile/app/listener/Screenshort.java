package com.mobile.app.listener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import io.appium.java_client.AppiumDriver;



public class Screenshort{
 public static   AppiumDriver driver;

 public static void Screenshort(){
	 try { 
		 //设置截图保存路径
	 File classpathRoot= new File(System.getProperty("user.dir"));
	 File file= new File(classpathRoot,"Screenshot");
	 if(!file.exists()){
		 file.mkdir();
	 }
	//截图
	File picture = driver.getScreenshotAs(OutputType.FILE);
	String screenshortname = file+getCurrentDateTime()+".png";
	//拷贝截图到指定路径下并以当前时间命名
	    FileUtils.copyFile(picture, new File(screenshortname)); //commons-io-2.0.1.jar中的api
	} catch (IOException e) {
	    e.printStackTrace();
	}
	 
 }
 //获取当前时间点
 public static String getCurrentDateTime(){
	   SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");//设置日期格式
	   return df.format(new Date());
	}
}
