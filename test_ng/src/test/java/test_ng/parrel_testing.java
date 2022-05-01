package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





import io.github.bonigarcia.wdm.WebDriverManager;

public class parrel_testing {
	WebDriver wb;
	public String url="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	
	@Parameters("mybrowser")
	
	@BeforeTest()
	public void bt(String mybrowser) {
		
		if(mybrowser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			wb= new FirefoxDriver();
//			wb.get(url);
		}
		else if(mybrowser.equalsIgnoreCase("chrome")) {
		
			WebDriverManager.chromedriver().setup();
			wb= new ChromeDriver();
			//wb.get(url);
		}
		
		}
	@Test()
	public void testcase1() throws InterruptedException {
		wb.get(url);
		wb.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");  // gives the username
		wb.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");  // gives the password
		wb.findElement(By.xpath("//*[@id='btnLogin']")).click();   // click on the login button
		wb.findElement(By.xpath("//*[@id='welcome']")).click();    // click on the welcome paul 
		Thread.sleep(2000);         // sleep time duration
		wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
	}

}
