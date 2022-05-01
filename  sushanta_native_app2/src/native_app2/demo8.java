package native_app2;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class demo8 extends capability2{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capability();
		//WORK ON APP SWITCH
				//if i am working on paymentgateway i want to switch to my message app to find otp
				//driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		
				System.out.println("Current activity package namr is"+ driver.getCurrentPackage());
				driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
				Thread.sleep(2000);
				
				driver.startActivity(new Activity("com.google.android.dialer","com.google.android.apps.dialer.extensions.GoogleDialtactsActivity"));
				System.out.println("Current activity package name is"+ driver.getCurrentPackage());
				Thread.sleep(2000);
				
				driver.findElement(By.id("com.google.android.dialer:id/floating_action_button")).click();
				Thread.sleep(2000);
				
				// it's another way to switch app through gesture but not effictive
				driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
				Thread.sleep(2000);
				driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
				//driver.startActivity(new Activity("io.appium.android.apis","io.appium.android.apis.view.DateWidgets2"));
				

	}

}
