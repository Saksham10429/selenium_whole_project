package native_app;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import okhttp3.internal.http2.Settings;

public class capabality {
	

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cp= new DesiredCapabilities();
		cp.setCapability(MobileCapabilityType.DEVICE_NAME, "sushanta");
		cp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cp.setCapability(AndroidMobileCapabilityType.APP_PACKAGE , "io.appium.android.apis");
		cp.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY , "io.appium.android.apis.ApiDemos");
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cp);
		        
	}

}
