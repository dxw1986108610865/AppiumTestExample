package com.mobile.app.res;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Parameters;
/**
 * 
 * @author zero
 * @获取所需driver
 */
public class GetAppDriver {
	public static File filepath;
   //public static String appname= "weixin639android700.apk";
	public static  File getAppDriver(String appname) throws IOException{
		try {
			//获取当前工程所在路径
			File classpathRoot= new File(System.getProperty("user.dir"));
			//获取driver所在文件夹路径
			File appDir= new File(classpathRoot,"src/res/android");
			//获取所需APP
			File app= new File(appDir,appname);
	      filepath=app.getAbsoluteFile();
			return filepath;
		} catch (Exception e) {
			// TODO: handle exception
		
			e.printStackTrace();
			
		}
		return null;
      
	}
	
}
