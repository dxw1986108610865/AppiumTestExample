package com.mobile.testcase.login;



import com.mobile.app.utils.ActionApp;
import com.mobile.app.utils.AppiumUtil;
import com.mobile.pages.LoginPage;

/**
 * 
 * @author zero
 * @ 获取登录页面操作
 */
public class LoginUtil {
public static void login(){
		
		  AppiumUtil.WaitForElement(ActionApp.getDriver(), LoginPage.LOGIN_BUTTON);
		  AppiumUtil.click(ActionApp.getDriver(), LoginPage.LOGIN_BUTTON);
		 AppiumUtil.sendMessage(ActionApp.getDriver(),LoginPage.USER_ACCOUNT, "18625172683");
		 AppiumUtil.sendMessage(ActionApp.getDriver(),LoginPage.USER_PASSWORD, "yan4618");
		 AppiumUtil.WaitForElement(ActionApp.getDriver(), LoginPage.LOGIN);
		 AppiumUtil.click(ActionApp.getDriver(), LoginPage.LOGIN);
	}
	

}
