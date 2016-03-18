package com.mobile.pages;

import org.openqa.selenium.By;

public class LoginPage {
	//鑾峰彇鐧诲綍鐣岄潰
public final static By LOGIN_BUTTON=By.name("登录");
//鑾峰彇璐︽埛瀵嗙爜杈撳叆妗�
public final static By USER_ACCOUNT=By.name("閭鎴栨墜鏈哄彿");
public final static By USER_PASSWORD=By.xpath("//android.widget.EditText[@resource-id='com.zhihu.android:id/password']");
public final static By CREAT_ACCOUNT=By.xpath("//com.zhihu.android:id/btn_register[@text='娉ㄥ唽']");
public final static By LOGIN=By.xpath("//android.widget.Button[@text='鐧诲綍']");
}
