package com.mobile.app.utils;

import java.io.File;
import java.io.IOException;

import com.mobile.app.res.GetAppDriver;

public class FactoryServer {
   public abstract class Factory{
	   public abstract AppiumServerBase createAppiumServerBase();
	   public abstract AppiumServerBase createAppiumServerBase(String DEVICE_NAME,String PLATFORM_VERSION,
			   String PLATFORM_NAME,String APP_ACTIVITY,String APP_PACKAGE,String appname);
	   }
	public static class SimpleFactory{
		public static AppiumServerBase createAppiumServerBase(){
		AppiumServerBase base=new AppiumServerBase();
		return base;
		}
		 public static AppiumServerBase createAppiumServerBase(String PLATFORM_VERSION,String PLATFORM_NAME,String appname,
					String APP_PACKAGE,String APP_ACTIVITY){
			 
					   AppiumServerBase base=new AppiumServerBase(PLATFORM_VERSION,PLATFORM_NAME,appname,APP_PACKAGE,APP_ACTIVITY);
					
					   return base; 
					   
					   
				   }
		
		 public static AppiumServerBase createAppiumServerBase(String APP_ACTIVITY,String APP_PACKAGE){
					   AppiumServerBase base=new AppiumServerBase(APP_ACTIVITY,APP_PACKAGE);
					  
					   return base; 
					   
					   
				   }
		
		
	}
	
	
	
	
}
