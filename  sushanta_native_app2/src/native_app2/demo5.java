package native_app2;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demo5 extends capability2{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement>driver=capability();
		driver.findElementByAccessibilityId("Views").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Date Widgets")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("2. Inline")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("9")).click();
		WebElement btn1= driver.findElement(MobileBy.AccessibilityId("15"));
		WebElement btn2= driver.findElement(MobileBy.AccessibilityId("45"));
		TouchAction ta= new TouchAction(driver);
		ta.longPress(longPressOptions().withElement(element(btn1)).withDuration(ofSeconds(3))).moveTo(element(btn2)).release().perform();
	
	}

}
