package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class keka {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		WebDriver wb= new ChromeDriver();
		wb.navigate().to("https://moolya.keka.com/#/home/dashboard");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@class='btn btn-danger btn-login btn-google-login']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@class='whsOnd zHQkBf']")).sendKeys("sushanta.nandy@moolya.com");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@class='VfPpkd-vQzf8d']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@class='whsOnd zHQkBf']")).sendKeys("SantoshKumarNandy@3155");
		Thread.sleep(4000);
		wb.findElement(By.xpath("//*[@class='VfPpkd-vQzf8d']")).click();
		Thread.sleep(15000);
		wb.findElement(By.xpath("//*[@class='btn btn-x-sm mx-4 btn-white']")).click();
		
		
}}
