package com.mobile.app.utils;

import java.io.File;
import java.io.IOException;

import com.mobile.app.res.GetAppDriver;

public class AppiumServerBase {
	private String BROWSER_NAME;
	private String DEVICE_NAME;
	private String PLATFORM_VERSION;
	private String PLATFORM_NAME;
	private File APPFILEPATH;
	private String APP_ACTIVITY;
	private String APP_PACKAGE;
	private String UDID;
	private boolean noReset;
	private boolean unicodeKeyboard;
	private boolean resetKeyboard;
	public String getBROWSER_NAME() {
		return BROWSER_NAME;
	}
	public void setBROWSER_NAME(String bROWSER_NAME) {
		BROWSER_NAME = bROWSER_NAME;
	}
	public String getDEVICE_NAME() {
		return DEVICE_NAME;
	}
	public void setDEVICE_NAME(String dEVICE_NAME) {
		DEVICE_NAME = dEVICE_NAME;
	}
	public String getPLATFORM_VERSION() {
		return PLATFORM_VERSION;
	}
	public void setPLATFORM_VERSION(String pLATFORM_VERSION) {
		PLATFORM_VERSION = pLATFORM_VERSION;
	}
	public String getPLATFORM_NAME() {
		return PLATFORM_NAME;
	}
	public void setPLATFORM_NAME(String pLATFORM_NAME) {
		PLATFORM_NAME = pLATFORM_NAME;
	}
	
	public File getAPPFILEPATH() {
		return APPFILEPATH;
	}
	public void setAPPFILEPATH(File aPPFILEPATH) {
		APPFILEPATH = aPPFILEPATH;
	}
	public String getAPP_ACTIVITY() {
		return APP_ACTIVITY;
	}
	public void setAPP_ACTIVITY(String aPP_ACTIVITY) {
		APP_ACTIVITY = aPP_ACTIVITY;
	}
	public String getAPP_PACKAGE() {
		return APP_PACKAGE;
	}
	public void setAPP_PACKAGE(String aPP_PACKAGE) {
		APP_PACKAGE = aPP_PACKAGE;
	}
	public String getUDID() {
		return UDID;
	}
	public void setUDID(String uDID) {
		UDID = uDID;
	}
	public boolean isNoReset() {
		return noReset;
	}
	public void setNoReset(boolean noReset) {
		this.noReset = noReset;
	}
	public boolean isUnicodeKeyboard() {
		return unicodeKeyboard;
	}
	public void setUnicodeKeyboard(boolean unicodeKeyboard) {
		this.unicodeKeyboard = unicodeKeyboard;
	}
	public boolean isResetKeyboard() {
		return resetKeyboard;
	}
	public void setResetKeyboard(boolean resetKeyboard) {
		this.resetKeyboard = resetKeyboard;
	}
	
	public  AppiumServerBase(){
		super();
	}
	
	public AppiumServerBase(String PLATFORM_VERSION,String PLATFORM_NAME,String appname,
			String APP_PACKAGE,String APP_ACTIVITY){
		super();
		this.APP_ACTIVITY=APP_ACTIVITY;
		this.APP_PACKAGE=APP_PACKAGE;
	    
		try {
			this.APPFILEPATH=GetAppDriver.getAppDriver(appname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.PLATFORM_NAME=PLATFORM_NAME;
		this.PLATFORM_VERSION=PLATFORM_VERSION;
		
		}
	public  AppiumServerBase(String APP_ACTIVITY,String APP_PACKAGE ){
		super();
		this.APP_ACTIVITY=APP_ACTIVITY;
		this.APP_PACKAGE=APP_PACKAGE;
		//this.UDID=UDID;
	}

}
