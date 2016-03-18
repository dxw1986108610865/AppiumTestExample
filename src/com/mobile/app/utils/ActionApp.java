package com.mobile.app.utils;





import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.mobile.app.utils.FactoryServer.SimpleFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ActionApp {
public static AndroidDriver<MobileElement> driver;

@BeforeTest
@Parameters({"PLATFORM_VERSION","PLATFORM_NAME","appname","APP_PACKAGE","APP_ACTIVITY",})
	public void actionApp(String PLATFORM_VERSION,String PLATFORM_NAME,String appname,
			String APP_PACKAGE,String APP_ACTIVITY) throws Exception {
	
	   
	    
	   
	   
	AppiumServerBase base= SimpleFactory.createAppiumServerBase(PLATFORM_VERSION,PLATFORM_NAME,appname,APP_PACKAGE,APP_ACTIVITY);
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	     capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, base.getBROWSER_NAME());         
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "TLGKE15823000755");
	     capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,base.getPLATFORM_VERSION());     
	     //MX4的驱动器名字使用adb devices -l命令在CMD中获得
	     capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,base.getPLATFORM_NAME());	     
	     //手机操作系统android版本
	    // capabilities.setCapability("deviceVersion","4.4");    
	     capabilities.setCapability(MobileCapabilityType.APP,base.getAPPFILEPATH()); 	     
	     //要测试应用的包名
	     capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, base.getAPP_PACKAGE()); 	
	     capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, base.getAPP_ACTIVITY());             
	         
	   // capabilities.setCapability(MobileCapabilityType., true);  	
	     System.out.println(base.getPLATFORM_VERSION());
	     System.out.println(base.getPLATFORM_NAME());
	     System.out.println(base.getAPPFILEPATH());
	     System.out.println(base.getAPP_ACTIVITY());
	     System.out.println(base.getAPP_PACKAGE());
	     //退出后，再次进入不需要重新安装
	     capabilities.setCapability("noReset", true);       	    
	     //appium想要支持中文输入，需要将unicodeKeyboard、resetKeyboard设置为true
	     capabilities.setCapability("unicodeKeyboard", true);
	     capabilities.setCapability("resetKeyboard", true);         
	     driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);  	  
	     System.out.println("应用连接完成");    		     
	  //   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
		
		
		
		
	}
	@AfterTest
	public void TestDown() throws Exception{
		driver.quit();
	}
	public static AndroidDriver<MobileElement> getDriver(){
		return driver;
	}
	}
	
