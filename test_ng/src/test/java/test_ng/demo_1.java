package test_ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_1 {
	WebDriver wb;
	

	@BeforeTest()
	public void testcase() {
		WebDriverManager.chromedriver().setup();
		wb=new ChromeDriver();
		
	}
	@Test()
	public void testcase1() {
		System.out.println("india");
	}
	@AfterTest()
	public void testcase2() {
		wb.close();
	}

}
