package native_app2;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class demo7 extends capability2{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement>driver=capability();
		driver.findElementByAccessibilityId("Views").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Auto Complete")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("1. Screen Top")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("in");
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

}
