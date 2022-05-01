package extend_report;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class extend {
			WebDriver wb;
			public String URL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
			ExtentReports extent;
			ExtentTest logger;
			
			@BeforeTest()
			public void BT() {
				//FirefoxDriver wb= new FirefoxDriver();      // if u want 2 use another web drivers
				System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
				WebDriver wb= new ChromeDriver();
				
				wb=new ChromeDriver();
				wb.manage().window().maximize();
				
				wb.get(URL);
				
				extent=new ExtentReports(System.getProperty("user.dir")+"//Test_Output//Report.html",true);
				extent.loadConfig(new File(System.getProperty("user.dir")+"//src//extent-config.xml"));
				
				//wb.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				
			}
			@Test()
			public void TestCase1() {
				logger=extent.startTest("OrangeHRM");
				
				String ActualTitle="OrangeHRM";
				String ExpectedTitle=wb.getTitle();
				Assert.assertEquals(ActualTitle, ExpectedTitle );
				logger.log(LogStatus.PASS, "assertion passed");
				extent.endTest(logger);
				extent.flush();
				extent.close();
				//System.out.println(wb.getPageSource());   // use to get the page source code
				
				//System.out.println(wb.getClass());        // use to get the class
				
				}
			@AfterTest()
			public void Testcase2() {
				wb.close();
			}
		}
