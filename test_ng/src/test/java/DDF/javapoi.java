package DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class javapoi {
	WebDriver driver;
	public String URL= "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
@Test()
public void testcase1() throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.get(URL);
	File excel=new File("C://Users//user//Desktop//data_driven.xlsx");
	FileInputStream fis=new FileInputStream(excel);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheet("Sheet1");
	
	int rowcount=sh.getLastRowNum();
	for(int i=0;i<rowcount;i++) {
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username);  // gives the username
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);  // gives the password
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // click on the login button
		
		
		if(driver.findElement(By.partialLinkText("Admin")).isDisplayed()) {
		
			driver.findElement(By.xpath("//*[@id='welcome']")).click();    // click on the welcome paul 
			Thread.sleep(2000);         // sleep time duration
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
			Thread.sleep(3000);
		}
		
		else if(driver.findElement(By.partialLinkText("Invalid credentials")).isDisplayed()){
			
			
			for(int j=i+1;j<rowcount;j++) {
				String username1=sh.getRow(j).getCell(0).getStringCellValue();
				String password1=sh.getRow(j).getCell(1).getStringCellValue();
				driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(username1);  // gives the username
				driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password1);  // gives the password
				driver.findElement(By.xpath("//*[@id='btnLogin']")).click();   // click on the login button
				}
		}
}
}
}
