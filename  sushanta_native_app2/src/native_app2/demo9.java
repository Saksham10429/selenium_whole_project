package native_app2;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class demo9 extends capability2{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capability();
		driver.findElementByAccessibilityId("OS").click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("SMS Messaging").click();
		Thread.sleep(2000);
		driver.findElement(By.id("io.appium.android.apis:id/sms_recipient")).sendKeys("(748) 861-1162");
		Thread.sleep(2000);
		driver.findElement(By.id("io.appium.android.apis:id/sms_content")).sendKeys("1223");
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("Send").click();
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));	// it's 3 rd way to swith through apps it's also inefective
		Thread.sleep(2000);
		driver.findElementByClassName("android.view.View").click(); // suppose if the message app is not in the background it will opean some other app
		Thread.sleep(2000);
		driver.findElementByClassName("android.view.ViewGroup").click();
		Thread.sleep(2000);
	String str=	driver.findElements(By.className("android.widget.TextView")).get(2).getText();
	System.out.println(str);
	}

}
