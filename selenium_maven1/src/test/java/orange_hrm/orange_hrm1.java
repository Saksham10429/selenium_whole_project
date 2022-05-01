package orange_hrm;
	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class orange_hrm1 {
			WebDriver driver;
		    public static String URL = "https://opensource-demo.orangehrmlive.com/";
		   // public static String URL1 = "https://demo.guru99.com/test/newtours/";
		    @BeforeTest
		public void BT()
		{
			//dont worry abut chrome version
			//this will take care of chrome browser
			//if this is a new version//it will download
			WebDriverManager.chromedriver().setup();
			//this is to create new instance of the browser
			driver = new ChromeDriver();
			//maximise screen
			driver.manage().window().maximize();
			//get is a method to navigate to url
			driver.get(URL);
			
		}
		
		@Test//(enabled = false)
		public void TestCase1() throws InterruptedException
		{
			String ActualTitle = "OngeHRM";
			String ExpectedTitle = driver.getTitle();
			//Assert.assertEquals(ExpectedTitle, ActualTitle);
			if(ExpectedTitle.equals(ActualTitle))
			{
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("welcome")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
			}
			else
			{
				System.out.println("The title are not same");
			}
			Assert.assertEquals(ExpectedTitle, ActualTitle);
		}
		
		@Test//(enabled = false)
		public void Testcase2() throws InterruptedException
		{
			//WebElement UN = driver.findElement(By.id("txtUsername"));
		   WebElement UN = driver.findElement(By.xpath("//*[@id='txtUsername']"));
			if(UN.isEnabled())
				{
					UN.sendKeys("mj");
					Thread.sleep(3000);
					UN.clear();
					Thread.sleep(3000);
					UN.sendKeys("Admin");
				}
			
			if(UN.isDisplayed())
			{
				driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
				
				//i want to click on admin
				
				//driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
				driver.findElement(By.linkText("Admin")).click();
				
				driver.findElement(By.id("ohrmList_chkSelectRecord_10")).click();
				
			}
			if(driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_67']")).isSelected())
			{
				System.out.println("The Element is Selected");
			}
		
		}
		@Test()
		public void Testcase3() {
			List<WebElement> link = driver.findElements(By.tagName("a"));
			System.out.println(link.size());
			//i want to print the name of the link
			for(int i=0;i<link.size();i++)
			{
				System.out.println(link.get(i).getText());
			}
		}
		
		
		@AfterTest(enabled=true)
		public void AT()
		{
			driver.close();
		}
		
	}


