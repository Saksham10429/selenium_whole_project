package mobile_webapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class capabilities {

	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {
		DesiredCapabilities cp= new DesiredCapabilities();
		cp.setCapability(MobileCapabilityType.DEVICE_NAME, "sushanta");
		cp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		cp.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cp.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:/selenium/chromedriver.exe");
		//cp.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS ,true);
	//	cp.setCapability("autoGrantPermissions", "true");
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cp);
		return driver;
		
	}

}
