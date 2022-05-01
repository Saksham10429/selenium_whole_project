package test_ng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver wb;
	public String URL="https://opensource-demo.orangehrmlive.com/index.php/auth/login";

	 @BeforeTest
	  public void beforeTest() {
		 WebDriverManager.chromedriver().setup();
			wb=new ChromeDriver();
			wb.get(URL);
	  }

	
	
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  
	  wb.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(n);  // gives the username
		wb.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(s);  // gives the password
		wb.findElement(By.xpath("//*[@id='btnLogin']")).click();   // click on the login button
		wb.findElement(By.xpath("//*[@id='welcome']")).click();    // click on the welcome paul 
		Thread.sleep(3000);
		wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin123" },
    };
  }
 
  @AfterTest
  public void afterTest() {
	  wb.close();
  }

}
