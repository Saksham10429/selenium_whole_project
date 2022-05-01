package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple_commands {
	WebDriver wb;
	public String URL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	
	@BeforeTest()
	public void BT() {
		//FirefoxDriver wb= new FirefoxDriver();      // if u want 2 use another web drivers
		WebDriverManager.chromedriver().setup();
		
		wb=new ChromeDriver();
		wb.manage().window().maximize();
		
		wb.get(URL);
		
		//wb.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	@Test()
	public void TestCase1() {
		
		String ActualTitle="OrangeHRM";
		String ExpectedTitle=wb.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle );
		//System.out.println(wb.getPageSource());   // use to get the page source code
		
		//System.out.println(wb.getClass());        // use to get the class
		
		}
	@AfterTest()
	public void Testcase2() {
		wb.close();
	}
	
	

}
