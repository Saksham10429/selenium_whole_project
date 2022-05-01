package native_app2;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class demo2 extends capability2 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		AndroidDriver<AndroidElement> driver = capability();
		//if i run this what will happen
		driver.findElement(MobileBy.AccessibilityId("Preference")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
		//beacuse id is a locator of selenium so i can use By.id directly //
		//i use mobile By only if it is android locator
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/checkbox")).click();
		//if i dont have accessibilty id and i cnnot use xpath as it is big
		//so i can identify the element using text
		//Whenever i am identifing the element with attribute not locator then i that case i use uiautomator
		//and uiSelector is a method i am using this to identify the elemnt with a attribute
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"WiFi settings\")")).click();
		//or
		//driver.findElementByAndroidUIAutomator("UiSelector().text(\"WiFi settings\")").click();
		//or
	//	driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();
		
		// when we have two similar class we can make diffrence b/w them using get(index)
driver.findElements(By.className("android.widget.Button")).get(1).click();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.pressKey(new KeyEvent(AndroidKey.BACK));
Thread.sleep(3000);
driver.pressKey(new KeyEvent(AndroidKey.HOME));
Thread.sleep(3000);
driver.openNotifications();


	}

}
