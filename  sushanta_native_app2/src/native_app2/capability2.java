package native_app2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class capability2 {
	
	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
    dc.setCapability(MobileCapabilityType.DEVICE_NAME, "sushanta");
				
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		//dc.setCapability(MobileCapabilityType.APP, "pathof the app");
		
    dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		//This is not a madate capability in android
		//but when you try to automate IOS application on Iphone
		//this is mandate
		//This is for IOS
		//dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		//This is for Android
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		//if you want to make it defeeault
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
		
		
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		return driver;

}}
