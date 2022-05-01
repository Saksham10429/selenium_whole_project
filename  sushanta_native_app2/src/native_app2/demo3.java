package native_app2;

import java.net.MalformedURLException;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities; 

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
public class demo3 extends capability2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
AndroidDriver<AndroidElement>driver=capability();		
driver.findElementByAccessibilityId("Views").click();
WebElement link= driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
	Dimension	number=link.getSize();
	System.out.println(number);
WebElement	el=driver.findElementByAccessibilityId("Expandable Lists");

//used for action
TouchAction ta= new TouchAction(driver);
ta.tap(tapOptions().withElement(element(el))).perform();
Thread.sleep(3000);
driver.findElementByAccessibilityId("1. Custom Adapter").click();
Thread.sleep(3000);
WebElement lp=driver.findElementByAndroidUIAutomator("text(\"People Names\")");
Thread.sleep(3000);
ta.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(3))).release().perform();
String str1= driver.findElements(By.className("android.widget.FrameLayout")).get(0).getText();
//String str2= driver.findElements(By.className("android.widget.LinearLayout")).get(0).getText();
System.out.println(str1);
//System.out.println(str2);

	}

}
