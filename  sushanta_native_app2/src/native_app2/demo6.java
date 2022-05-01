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
public class demo6 extends capability2{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement>driver=capability();
		driver.findElementByAccessibilityId("Views").click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();
		Thread.sleep(3000);
		WebElement btn1= driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement btn2= driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		WebElement btn3= driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));
		
		TouchAction ta= new TouchAction(driver);
		ta.longPress(longPressOptions().withElement(element(btn1)).withDuration(ofSeconds(3))).moveTo(element(btn2)).release().perform();
		Thread.sleep(3000);
		WebElement btn4= driver.findElement(By.id("io.appium.android.apis:id/drag_dot_hidden"));
		ta.longPress(longPressOptions().withElement(element(btn2)).withDuration(ofSeconds(3))).moveTo(element(btn3)).release().perform();
		ta.longPress(longPressOptions().withElement(element(btn3)).withDuration(ofSeconds(3))).moveTo(element(btn4)).release().perform();
		ta.longPress(longPressOptions().withElement(element(btn4)).withDuration(ofSeconds(3))).moveTo(element(btn1)).release().perform();
	}

}
