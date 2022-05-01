package webdriver_new;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class class1 {
	String url= "https://www.facebook.com/";
	String url1="https://www.instagram.com/";
	WebDriver name;
	
	
@BeforeTest()
public void testcase0() {
	
	WebDriverManager.chromedriver().setup();
//	WebDriverManager.firefoxdriver().setup();
//	WebDriverManager.iedriver().setup();
//	 name= new FirefoxDriver();
//	 name= new InternetExplorerDriver();
	name = new ChromeDriver();
			//name.manage().window().maximize();
			
			name.get(url);
			
	
}
	
		@Test(enabled=true)
		public void testcase1() throws InterruptedException {
			Thread.sleep(4000);
			name.findElement(By.xpath("//*[@id='email']")).sendKeys("vinod@gmail.com");
			Thread.sleep(4000);
			name.findElement(By.xpath("//*[@id='pass']")).sendKeys("vinod@123");
			name.findElement(By.xpath("//*[@name='login' and @type='submit' and @class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
			Thread.sleep(3000);
			
		}
@AfterTest()
public void testcase2() {
	name.close();
	
}
		
		
	}
