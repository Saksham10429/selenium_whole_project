package native_app2;

import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demo4 extends capability2{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement>driver=capability();
		driver.findElementByAccessibilityId("Views").click();
		//for android point of view the scrolling is done like this
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
	}

}
